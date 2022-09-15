package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.a101Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class a101StepDefinitions {


    @Given("Kullanici a101 adresine gider")
    public void kullanici_a101_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
    }

    @Given("Cikan cookie1 kapatilir")
    public void cikan_cookies_kapatilir() {
        a101Page page = new a101Page();
        page.cookie1.click();
    }

    @Given("GİYİMAKSESUAR tiklanir")
    public void gi̇yi̇m_aksesuar_tiklanir() {
        a101Page page = new a101Page();
        page.giyimAksesuar.click();
    }

    @Given("KadinIcGiyim tiklanir")
    public void kadin_ic_giyim_tiklanir() {
        a101Page page = new a101Page();
        page.kadinIcGiyim.click();
    }

    @Given("DizaltiCorap tiklanir")
    public void dizalti_corap_tiklanir() {
        a101Page page = new a101Page();
        ReusableMethods.waitForClickablility(page.dizaltiCorap, 5).click();
        ReusableMethods.waitForClickablility(page.ilkSiyahCorap, 5).click();
    }

    @Given("Acilan urunun siyah oldugu dogrulanir")
    public void acilan_urunun_siyah_oldugu_dogrulanir() {
        a101Page page = new a101Page();
        String renk = "SİYAH";
        Assert.assertEquals(page.siyahYazisi.getText(), renk);
    }

    @Given("Sepete Ekle tusuna basar")
    public void sepete_ekle_tusuna_basar() {
        a101Page page = new a101Page();
        ReusableMethods.waitForClickablility(page.sepeteEkle, 5).click();
    }

    @Given("Sepeti Görüntüle butonuna tıklar")
    public void sepeti_görüntüle_butonuna_tıklar() {
        a101Page page = new a101Page();
        page.sepetiGoruntule.click();
    }

    @Given("Sepeti Onayla butonuna tıklar")
    public void sepeti_onayla_butonuna_tıklar() {
        a101Page page = new a101Page();
        page.sepetiOnayla.click();
    }

    @Given("Uye olmadan devam et tiklar")
    public void uye_olmadan_devam_et_tiklar() {
        a101Page page = new a101Page();
        page.uyeOlmadanDevamEt.click();
    }
    @Given("Mail girilip devam et e basilir")
    public void mail_girilip_devam_et_e_basilir() {
        a101Page page = new a101Page();
        Faker faker=new Faker();

        ReusableMethods.waitForClickablility(page.emailTextBox,5).sendKeys(faker.internet().emailAddress());
        page.devamEt.click();
    }

    @Given("Yeni adres olustur tiklanir ve adres doldurulur")
    public void yeni_adres_olustur_tiklanir_ve_adres_doldurulur() {
        Faker faker=new Faker();

        a101Page page = new a101Page();
        ReusableMethods.waitFor(2);
        page.yeniAdresOlustur.click();
        ReusableMethods.waitFor(3);
        page.adresBasligi.sendKeys("adresbasligi");
        ReusableMethods.waitFor(2);
        page.ad.sendKeys("erkam");
        ReusableMethods.waitFor(2);
        page.soyad.sendKeys("uslu");
        ReusableMethods.waitFor(2);
        page.tel.sendKeys("05303392041");

        Select select1=new Select(page.il);
        select1.selectByIndex(2);
        ReusableMethods.waitFor(3);
        Select select2=new Select(page.ilce);
        select2.selectByIndex(8);
        ReusableMethods.waitFor(5);
        Select select3=new Select(page.mahalle);
        select3.selectByIndex(3);
        page.adresTextBox.sendKeys("serhat mah ostim no:55");
        page.kaydet.click();
        ReusableMethods.waitFor(5);
        ///////////////////////////////////////
        page.kargo.click();
        page.kaydetDevamEt.click();

        //Assert.assertTrue(page.siparisiTamamla.isSelected());

    }

}