import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class MultiplexTestsNG {Object cssSelector;

    @Test
    public void checkMenu () {
        Selenide.open ("https://multiplex.ua");
        Selenide.open ("https://multiplex.ua/ru/cinema/kyiv/prospect");
        Selenide.open ("https://multiplex.ua/ru/promotions");
        Selenide.open ("https://multiplex.ua/ru/soon");
        Selenide.open ("https://multiplex.ua/ru/cinemas");
        Selenide.open ("https://multiplex.ua/ru/faq#rf_rules");
        Selenide.open ("https://multiplex.ua/ru/about");
        Selenide.open ("https://friends.multiplex.ua/login");
        Selenide.open ("https://www.facebook.com/uamultiplex");
        Selenide.open ("https://www.youtube.com/user/MultiplexChannel");
        Selenide.open ("https://www.instagram.com/multiplex_official/");
        Selenide.open ("https://t.me/super_cheese");
    }

  


}
