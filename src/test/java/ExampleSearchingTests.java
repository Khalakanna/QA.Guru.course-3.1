package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ExampleSearchingTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }


    @Test
    void ExampleSerchInWikiTest() {
        open("https://github.com/selenide/selenide");

        $("[data-hotkey='g w']").click();
        $(By.id("wiki-pages-box")).shouldHave(text("SoftAssertions"));
        $$(".d-block").findBy(text("SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("Using JUnit5"),
                text("@ExtendWith({SoftAssertsExtension.class})"));

    }
}
