package tests;

import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.MainPage;
import pages.SearchPage;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class WikiMobileTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    ArticlePage articlePage = new ArticlePage();

    @Test
    void successfulSearchTest() {
        step("Ввести запрос в поисковую строку", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchValue("Lady Gaga");
        });
        step("Проверить результаты поиска", () -> {
            searchPage.checkSearchResult();
        });
    }

    @Test
    void openArticleTest() {
        step("Открыть поиск и ввести запрос", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchValue("Lady Gaga");
        });
        step("Открыть первую статью", searchPage::selectFirstSearchResult);
        step("Проверить, что статья открыта", () -> {
            articlePage.getArticleTitle("Lady Gaga");
        });
    }

    @Test
    public void testOpenImage() {
        step("Открыть поиск и ввести запрос", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchValue("Lady Gaga");
        });
        step("Открыть первую статью", searchPage::selectFirstSearchResult);
        step("Проверить, что статья открыта", () -> {
            articlePage.getArticleTitle("Lady Gaga");
        });
        step("Проверить загрузку статьи и открыть изображение, если статья загрузилась", () -> {
            boolean isArticleLoaded = articlePage.waitForArticleOrHandleError();
            if (!isArticleLoaded) {
                fail("Статья не загрузилась, тест завершен");
            }
            articlePage.clickMainImage();
        });
        step("Проверить, что изображение открыто на весь экран", () -> {
            assertTrue(articlePage.isImageOpenedFullscreen());
        });
    }

    @Test
    public void testReturnToMainPageAfterOpeningArticle() {
        step("Открыть поиск и ввести запрос", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchValue("Lady Gaga");
        });
        step("Открыть первую статью", searchPage::selectFirstSearchResult);
        step("Вернуться на главную", articlePage::navigateBack);
        step("Проверить, что отображается главный экран", () -> {
            mainPage.shouldBeOnMainPage();
        });
    }
}
