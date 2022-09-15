package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class a101Page {
    public a101Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="(//button[@class='CybotCookiebotDialogBodyButton'])[2]")
    public WebElement cookie1 ;
    @FindBy(xpath="((//a[@href='/giyim-aksesuar/'])[1])")
    public WebElement giyimAksesuar;

    @FindBy(xpath="(//a[@class='js-filter-link '])[2]")
    public WebElement kadinIcGiyim;

    @FindBy(partialLinkText = "Dizaltı Çorap")
    public WebElement dizaltiCorap;

    @FindBy(partialLinkText="Penti Kadın 50 Denye Pantolon Çorabı Siyah")
    public WebElement ilkSiyahCorap;

    @FindBy(xpath="//span[text()='SİYAH']")
    public WebElement siyahYazisi;
    @FindBy(xpath="//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkle;

    @FindBy( partialLinkText = "Sepeti Görüntüle")
    public WebElement sepetiGoruntule;

    @FindBy(partialLinkText = "Sepeti Onayla")
    public WebElement sepetiOnayla;

    @FindBy(partialLinkText = "ÜYE OLMADAN DEVAM ET")
    public WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailTextBox;

    @FindBy(xpath="(//button[@type='submit'])[4]")
    public  WebElement devamEt;

    @FindBy(xpath = "//a[@class='new-address js-new-address']")
    public WebElement yeniAdresOlustur;


    @FindBy(xpath="//input[@name='title']")
    public WebElement adresBasligi;

    @FindBy(xpath="(//input[@type='text'])[6]")
    public WebElement ad;

    @FindBy(xpath="(//input[@type='text'])[7]")
    public WebElement soyad;

    @FindBy(xpath="(//input[@type='text'])[8]")
    public WebElement tel;

    @FindBy(xpath="(//select[@type='text'])[1]")
    public WebElement il;
    @FindBy(xpath="(//select[@type='text'])[2]")
    public WebElement ilce;

    @FindBy (xpath="//select[@name='district']")
    public  WebElement mahalle;

    @FindBy (xpath="//textarea[@name='line']")
    public WebElement adresTextBox;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement kaydet;

    @FindBy(xpath = "(//span['MNG Kargo'])[11]")
    public WebElement kargo;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement kaydetDevamEt;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement siparisiTamamla;

}
