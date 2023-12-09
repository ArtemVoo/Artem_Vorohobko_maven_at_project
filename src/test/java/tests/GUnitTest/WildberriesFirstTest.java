package tests.GUnitTest;

import org.junit.Test;
import pages.WildberriesPage;


public class WildberriesFirstTest extends BaseTest {

    @Test
    public void wildberriesFisrt() {
        WildberriesPage wbPage = new WildberriesPage();
        wbPage.acceptCookies();
        wbPage.storageBoxSection();
        wbPage.storageBoxFilters();
        wbPage.boxFilterByPrice();
        wbPage.boxClose5DFilter();
        wbPage.countAmountOfGoods();
    }
}
