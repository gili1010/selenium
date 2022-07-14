package pages;

public class GooglePage extends BasePage{

    private String SearchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    private String textSearch = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void enterCriteria(){
        write(textSearch,"practia");
    }

    public void clickGoogleSearch(){
        clickElement(SearchButton);
    }


}
