// 2. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
// - Откройте https://the-internet.herokuapp.com/drag_and_drop
// - Перенесите прямоугольник А на место В
// - Проверьте, что прямоугольники действительно поменялись
// - В Selenide есть команда $(element).dragAndDrop($(to-element)),
// проверьте работает ли тест, если использовать её вместо actions(

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class DragAndDropTest {

    @Test
    void DragAndDropWithAction () throws InterruptedException {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));

        sleep(4000);
    }
}


