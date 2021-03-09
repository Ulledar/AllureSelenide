import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Before
    public void start() {
        open("https://mvnrepository.com");
    }

    @Epic("TEST ON https://mvnrepository.com SEARCHER.")
    @Feature("Test for finding.")
    @Severity(SeverityLevel.NORMAL)
    @Description("good test =)")
    @Story("Try to pass the test")
    @Test
    public void findSelenide() {
        searchField();
        pressButton();
        selenideChoser();
        versionChoser();
        checkTheTitle();
    }

    @Step("1")
    public void searchField() {
        $(By.id("query")).sendKeys("selenide");
    }

    @Step("2")
    public void pressButton() {
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
