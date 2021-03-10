import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;

public class SelenideFinder extends BaseTest {

    @Epic("TEST ON https://mvnrepository.com SEARCHER.")
    @Feature("Test for finding.")
    @Severity(SeverityLevel.NORMAL)
    @Description("good test =)")
    @Story("Try to pass the test")
    @Test
    public void findSelenide() {
        open("/");
        searchField();
        searchButton();
        selenideChoser();
        versionChoser();
        checkTheTitle();
    }

    @Step("Search Field")
    public void searchField() {
        $(By.id("query")).sendKeys("selenide");
    }

    @Step("Search Button")
    public void searchButton() {
        $(By.className("button")).click();
    }

    @Step("3")
    public void selenideChoser() {
        $("h2.im-title a[href='/artifact/com.codeborne/selenide']").click();
    }

    @Step("4")
    public void versionChoser() {
        $("a[href='selenide/5.19.0']").click();
    }

    @Step("5")
    public void checkTheTitle() {
        Assert.assertTrue(title().equals("Maven Repository: com.codeborne » selenide » 5.19.0"));
    }

}
