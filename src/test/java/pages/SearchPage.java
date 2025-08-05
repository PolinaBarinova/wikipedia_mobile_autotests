package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {

    private final SelenideElement searchInput = $(id("org.wikipedia.alpha:id/search_src_text"));
    private final ElementsCollection searchResult = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public void enterSearchValue(String value) {
        searchInput.sendKeys(value);
    }

    public void checkSearchResult() {
        searchResult.shouldHave(sizeGreaterThan(0));
    }

    public void selectFirstSearchResult() {
        searchResult.get(0).click();
    }
}
