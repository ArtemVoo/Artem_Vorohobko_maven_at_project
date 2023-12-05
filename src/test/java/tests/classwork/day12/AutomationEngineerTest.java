package tests.classwork.day12;

import classwork.day12.AutomatedEngineer;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class AutomationEngineerTest {

    AutomatedEngineer automatedEngineer = new AutomatedEngineer(32, 5);

    @Test
    public void aenAutGetAge() {
        Assert.assertEquals("Wrong age", 32, automatedEngineer.getAge());
    }

    @Test
    public void benAutSetAge() {
        automatedEngineer.setAge(30);
        Assert.assertEquals("Wrong age", 30, automatedEngineer.getAge());
    }

    @Test
    public void cenAutGetExp() {
        Assert.assertEquals("Wrong exp", 5, automatedEngineer.getExperience());
    }

    @Test
    public void denAutSetExp() {
        automatedEngineer.setExperience(5);
        Assert.assertEquals("Wrong exp", 5, automatedEngineer.getExperience());
    }

    @Test
    public void enAutSGetSkill() {
        Assert.assertEquals("Wrong skill", 15, automatedEngineer.getSkill());
    }

    @Test
    public void fenAutSetSkill() {
        automatedEngineer.setSkill(6);
        Assert.assertEquals("Wrong skill", 6, automatedEngineer.getSkill());
    }
}
