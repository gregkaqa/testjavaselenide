import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PierwszyTest {

    @Test(description = "Pierwszy test selenide")
    public void pierwszyTest() throws InterruptedException, IOException {
        open("https://duckduckgo.com/");
        $(By.id("search_form_input_homepage")).setValue("pogoda lublin");
        $(By.id("search_button_homepage")).click();
        $(By.className("module__humidity")).shouldBe(text("Humidity: 68%"));
        TimeUnit.SECONDS.sleep(30);
    }

    @Test(description = "drugi test")
    public void drugiTest() throws InterruptedException {
        {
            open("https://duckduckgo.com/");
            SelenideElement duckduckinput = $(By.id("search_form_input_homepage"));
            SelenideElement duckducksearch = $(By.id("search_button_homepage"));
            SelenideElement duckduckhumidity = $(By.className("module__humidity"));
            duckduckinput.setValue("pogoda lublin");
            duckducksearch.click();
            duckduckhumidity.shouldBe(text("Humidity: 68%"));
            TimeUnit.SECONDS.sleep(30);
        }
    }
    @Test(description = "Trzeci test")
    public void trzeciTest() throws InterruptedException {
        open("https://www.busradar.pl/");
        SelenideElement BusRadarFrom = $(By.id("from-input"));
        SelenideElement BusRadarTo = $(By.id("to-input"));
        SelenideElement BusRadarWhen = $(By.id("When"));
        SelenideElement BusRadarWhenReturn = $(By.id("WhenReturn"));
        SelenideElement BusRadarAddPerson = $(By.className("icon-plus"));
        SelenideElement BusRadarSearch = $(By.className("icon-search"));
        SelenideElement BusRadarSearch2 = $(By.name("Szukaj połączenia"));

        BusRadarFrom.val("Lublin");
        BusRadarTo.val("Zakopane");
        BusRadarWhen.val("Pt 31 Lip");
        BusRadarWhenReturn.val("Cz 06 Sie");
        BusRadarAddPerson.click();
        BusRadarSearch.click();
        TimeUnit.SECONDS.sleep(30);
    }
}
