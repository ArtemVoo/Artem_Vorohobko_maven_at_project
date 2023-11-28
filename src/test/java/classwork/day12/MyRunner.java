package classwork.day12;

import classwork.day12.AutomationEngineerTest;
import classwork.day12.ManualEngineerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomationEngineerTest.class,
        ManualEngineerTest.class
})

public class MyRunner {
}
