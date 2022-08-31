import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class Multiplex {


    private String cssSelector;

    @Test


    SelenideElement popupYesBtn = $(cssSelector".yes");
    SelenideElement menuBtn = $(cssSelector:".menu-btn");
    SelenideElement menuText =$(cssSelector

    public Multiplex(String cssSelector) {
        this.cssSelector = cssSelector;
    }:".menu-btn");
    @Test
    public void checkMenu () {
        Selenide.open ("https://multiplex.ua");
        popupYesBtn.shouldBe(Condition.visible).click();
        menuBtn.shouldBe(Condition.visible).click();
        menuText.shouldHave(Condition.text("Особистий кабiнет"));

    }



}
