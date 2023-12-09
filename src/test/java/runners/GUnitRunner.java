package runners;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.GUnitTest.WildberriesFirstTest;
import tests.GUnitTest.WildberriesSecondTest;



@RunWith(Suite.class)
@Suite.SuiteClasses({
        WildberriesFirstTest.class,
        WildberriesSecondTest.class
})

public class GUnitRunner {
}
