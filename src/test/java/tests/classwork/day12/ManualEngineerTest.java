package tests.classwork.day12;

import classwork.day12.ManualEngineer;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManualEngineerTest {

    ManualEngineer manualEngineer = new ManualEngineer(25, 3);

    @Test
    public void aenManGetAge() {
        Assert.assertEquals("Wrong age", 25, manualEngineer.getAge());
    }

    @Test
    public void benManSetAge() {
        manualEngineer.setAge(30);
        Assert.assertEquals("Wrong age", 30, manualEngineer.getAge());
    }

    @Test
    public void cenManGetExp() {
        Assert.assertEquals("Wrong exp", 3, manualEngineer.getExperience());
    }

    @Test
    public void denManSetExp() {
        manualEngineer.setExperience(5);
        Assert.assertEquals("Wrong exp", 5, manualEngineer.getExperience());
    }

    @Test
    public void enManSGetSkill() {
        Assert.assertEquals("Wrong skill", 6, manualEngineer.getSkill());
    }

    @Test
    public void fenManSetSkill() {
        manualEngineer.setSkill(5);
        Assert.assertEquals("Wrong skill", 5, manualEngineer.getSkill());
    }
}
