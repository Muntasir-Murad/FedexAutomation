package FedExAutomationPOM;

import MyLibrary.AbstractClass;

public class BaseClass extends AbstractClass {



public static HomePage homePage(){

    HomePage homePage= new HomePage(driver);
    return homePage;
}

    public static ExplorePrintandProducts explorePrintandProducts(){

        ExplorePrintandProducts explorePrintandProducts = new ExplorePrintandProducts(driver);
        return explorePrintandProducts;
    }

    public static Signs signs(){

        Signs signs= new Signs(driver);
        return signs;
    }

    public static YardSigns yardSigns(){

        YardSigns yardSigns= new YardSigns(driver);
        return yardSigns;
    }

    public static Fileupload fileupload(){

        Fileupload fileupload= new Fileupload(driver);
        return fileupload;
    }
    public static CartSummary cartSummary(){

        CartSummary cartSummary= new CartSummary(driver);
        return cartSummary;
    }public static CheckOut checkOut(){

        CheckOut checkOut= new CheckOut(driver);
        return checkOut;
    }


}
