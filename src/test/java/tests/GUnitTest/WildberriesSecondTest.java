package tests.GUnitTest;

import org.junit.Test;
import pages.WildberriesPage;

public class WildberriesSecondTest extends BaseTest {

    @Test
    public void wildberriesSecond(){
        WildberriesPage wbPage = new WildberriesPage();
        wbPage.wildberriesPage();
        wbPage.acceptCookies();
        wbPage.decorationsSection();
        wbPage.decorationsFilter();
        wbPage.amOfGoodsAfterFilt();
        wbPage.resetAllFilters();
        wbPage.countAmountOfGoods();
    }
}
