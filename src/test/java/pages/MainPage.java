package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {

    private final SelenideElement search_container = $(id("org.wikipedia.alpha:id/search_container"));
    private final ElementsCollection card = $$(id("org.wikipedia.alpha:id/view_card_header_title"));

    @Step("Нажать на поле поиска")
    public MainPage clickSearchIcon() {
        search_container.click();
        return this;
    }

    @Step("Проверить, что отображается главная страница")
    public MainPage shouldBeOnMainPage() {
        card.findBy(text("In the News")).shouldBe(Condition.visible);
        return this;
    }
}
