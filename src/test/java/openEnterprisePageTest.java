// 1. На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для
// Solutions. Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the
// best.


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class openEnterprisePageTest {

    @Test
    void openEnterprisePageTest () {

        open("https://github.com/");
        $("[aria-label=Global]").$(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        SelenideElement selenideElement = $(byText("The AI-powered developer platform")).shouldBe(visible);
        sleep(4000);
    }
}
