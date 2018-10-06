package YahooSearch;
import loginEx.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;


public class YahooSearchTest {



        private WebDriver driver;

        @BeforeTest
        public void setupDriver() {


            System.setProperty("webdriver.gecko.driver", "/C:\\Users\\Angela\\Desktop\\WebdriverJavaBootcamp-master\\src\\test\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

    }

    @Test
    public void testSearch() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/C:\\Users\\Angela\\Desktop\\WebdriverJavaBootcamp-master\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://mail.google.com");
    }

        @Test
        public void test001() throws Exception {
            navigatingToMainPage();
            typeRequestInSearchInput();
            submitSearch();
            printOutAmountOfResult();
        }

        private void printOutAmountOfResult() {
            String res = driver.findElement(YahooMainPage.span).getText();
            System.out.println(res);
        }

        private void submitSearch() {

            driver.findElement(YahooMainPage.submitButton).click();
        }
        private void typeRequestInSearchInput() {
            driver.findElement(YahooMainPage.searchInput).sendKeys("Portnov computer school");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        private void navigatingToMainPage() {
            String url = "http://www.yahoo.com";
            driver.get(url);
        }
}