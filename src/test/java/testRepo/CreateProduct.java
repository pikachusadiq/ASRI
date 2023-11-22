package testRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import objectRepository.CreateProductPagePom;
import objectRepository.HomePagePom;
import objectRepository.ProductListPagePom;

public class CreateProduct extends BaseClass {
	@Test
  public void createProduct() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber();
	ExcelUtility EUTIL=new ExcelUtility();
	String PdtNAME=	EUTIL.getDataFromExcel("Product", 3, 1);
	
	HomePagePom HP=new HomePagePom(driver);
	HP.clickProduct();
	ProductListPagePom PLP=new ProductListPagePom(driver);
	PLP.clickCreateProduct();
	CreateProductPagePom CPP=new CreateProductPagePom(driver);
	CPP.createProduct(PdtNAME+num);
	
  }
}