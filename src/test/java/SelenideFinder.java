import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.*;

public class SelenideFinder extends BaseTest{

    @Epic("TEST ON https://mvnrepository.com")
    @Feature("Test for finding.")
    @Severity(SeverityLevel.NORMAL)
    @Description("good test =)")
    @Story("Try to pass the test")
    @Test
    public void findSelenide() {
        open("https://mvnrepository.com");
        searchField("selenide");
        searchButton();
        selenideChoser();
        versionChoser();
        checkTheTitle("Maven Repository: com.codeborne » selenide » 5.19.0");
    }

    @Epic("TEST ON https://mvnrepository.com")
    @Feature("Looking for something new!")
    @Severity(SeverityLevel.NORMAL)
    @Description("Cheking newest button")
    @Story("Opening Popular Categorise for looking some new Testing Frameworks.")
    @Test
    public void findNewestPopular() {
        open("https://mvnrepository.com");
        popular();
        testingFrameworks();
        newest();
    }

    @Epic("TEST ON https://mvnrepository.com")
    @Feature("Looking for something new! 2nd way")
    @Severity(SeverityLevel.NORMAL)
    @Description("Cheking enother way to newest button")
    @Story("Opening Popular Categorise for looking some new Logging Frameworks.")
    @Test
    public void alternativeNewest() {
        open("https://mvnrepository.com");
        $("div#navigation a[href='/open-source']").click();
        $("a[href='/open-source/logging-frameworks']").click();
        $("a[href='?sort=newest']").click();
    }

    @Step("Chose newest")
    public void newest() {
        $("a[href='?sort=newest']").click();
    }

    @Step("Testing Frameworks")
    public void testingFrameworks() {
        $("a[href='/open-source/testing-frameworks']").click();
    }

    @Step("Popular Categories")
    public void popular() {
        $("div#left a[href='/open-source']").click();
    }

    @Step("Search Field")
    public void searchField(String sought) {
        $(By.id("query")).sendKeys(sought);
    }

    @Step("Search Button")
    public void searchButton() {
        $(By.className("button")).click();
    }

    @Step("Chose the Selenide")
    public void selenideChoser() {
        $("h2.im-title a[href='/artifact/com.codeborne/selenide']").click();
    }

    @Step("Chose version 5.19.0")
    public void versionChoser() {
        $("a[href='selenide/5.19.0']").click();
    }

    @Step("Check the title")
    public void checkTheTitle(String myTitle) {
        Assert.assertTrue(title().equals(myTitle));
    }

}
