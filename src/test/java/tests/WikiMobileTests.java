package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ArticleScreen;
import pages.MainScreen;
import pages.SearchScreen;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@Owner("p.barinova")
@DisplayName("Проверки мобильного приложения Wikipedia")
public class WikiMobileTests extends TestBase {

    MainScreen mainScreen = new MainScreen();
    SearchScreen searchScreen = new SearchScreen();
    ArticleScreen articleScreen = new ArticleScreen();

    @Test
    @DisplayName("Проверка поиска статьи")
    void successfulSearchTest() {
        step("Ввести запрос в поисковую строку", () -> {
            mainScreen.clickSearchIcon();
            searchScreen.enterSearchValue("Lady Gaga");
        });
        step("Проверить результаты поиска", () -> {
            searchScreen.checkSearchResult();
        });
    }

    @Test
    @DisplayName("Проверка открытия статьи")
    void openArticleTest() {
        step("Открыть поиск и ввести запрос", () -> {
            mainScreen.clickSearchIcon();
            searchScreen.enterSearchValue("Lady Gaga");
        });
        step("Открыть первую статью", searchScreen::selectFirstSearchResult);
        step("Проверить, что статья открыта", () -> {
            articleScreen.getArticleTitle("Lady Gaga");
        });
    }

    @Test
    @DisplayName("Проверка открытия изображения внутри статьи")
    public void testOpenImage() {
        step("Открыть поиск и ввести запрос", () -> {
            mainScreen.clickSearchIcon();
            searchScreen.enterSearchValue("Lady Gaga");
        });
        step("Открыть первую статью", searchScreen::selectFirstSearchResult);
        step("Проверить, что статья открыта", () -> {
            articleScreen.getArticleTitle("Lady Gaga");
        });
        step("Проверить загрузку статьи и открыть изображение, если статья загрузилась", () -> {
            boolean isArticleLoaded = articleScreen.waitForArticleOrHandleError();
            if (!isArticleLoaded) {
                fail("Статья не загрузилась, тест завершен");
            }
            articleScreen.clickMainImage();
        });
        step("Проверить, что изображение открыто на весь экран", () -> {
            assertTrue(articleScreen.isImageOpenedFullscreen());
        });
    }

    @Test
    @DisplayName("Проверка возврата к главной странице после просмотра статьи")
    public void testReturnToMainScreenAfterOpeningArticle() {
        step("Открыть поиск и ввести запрос", () -> {
            mainScreen.clickSearchIcon();
            searchScreen.enterSearchValue("Lady Gaga");
        });
        step("Открыть первую статью", searchScreen::selectFirstSearchResult);
        step("Вернуться на главную", articleScreen::navigateBack);
        step("Проверить, что отображается главный экран", () -> {
            mainScreen.shouldBeOnMainScreen();
        });
    }
}
