package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;

public class ArticlePage {

    private final SelenideElement headerImage = $(id("org.wikipedia.alpha:id/view_page_header_image"));
    private final SelenideElement imageView = $(id("org.wikipedia.alpha:id/imageView"));
    private final ElementsCollection articleTitle = $$(className("android.widget.TextView"));
    private final SelenideElement errorScreen = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));
    private final SelenideElement goBackButton = $(id("org.wikipedia.alpha:id/view_wiki_error_button"));

    @Step("Ожидание загрузки статьи")
    public boolean waitForArticleOrHandleError() {
        if (errorScreen.isDisplayed()) {
            System.out.println("Статья не загрузилась");
            goBackButton.click();
            return false;
        }
        return true;
    }

    @Step("Нажать на главное изображение статьи")
    public ArticlePage clickMainImage() {
        headerImage.shouldBe(visible).click();
        return this;
    }

    @Step("Проверить, что изображение открылось на весь экран")
    public boolean isImageOpenedFullscreen() {
        return imageView.shouldBe(visible).isDisplayed();
    }


    public void getArticleTitle(String expectedTitle) {
        articleTitle.findBy(text(expectedTitle))
                .shouldBe(visible);
    }

    @Step("Вернуться назад")
    public ArticlePage navigateBack() {
        com.codeborne.selenide.Selenide.back();
        return this;
    }
}
