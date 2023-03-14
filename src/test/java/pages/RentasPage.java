package pages;

public class RentasPage extends BasePage{

    private String pagaryVerDeuda = "//p[contains(text(),'Pagar y ver deuda')]";
    private String automotor = "//div[contains(text(),'Automotor')]";
    private String ingresarPatente = "//body/app-root[1]/main[1]/div[1]/app-type-object[1]/div[1]/app-query-form-by-object[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]";
    private String consultar = "//button[contains(text(),'Consultar')]";
    private String DetalleDeCuotas = "//h4[contains(text(),'Detalle de cuotas')]";
    public RentasPage(){
        super(driver);
    }

    public void navigateToRentas(){
        navigateTo("https://www.rentascordoba.gob.ar/inicio/");
    }
    public void clickPagaryVerDeuda(){
        clickElement(pagaryVerDeuda);
    }

    public void clickAutomotor(){
    }

    public void ingresarPatente(){
        write(ingresarPatente,"AD819fh");
    }

    public void clickConsultar(){
        clickElement(consultar);
    }

    public String validateResult(){
        return textFromElement(DetalleDeCuotas);
    }


}
