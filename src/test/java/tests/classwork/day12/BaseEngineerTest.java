package tests.classwork.day12;

import classwork.day12.AutomatedEngineer;
import classwork.day12.Engineer;
import classwork.day12.ManualEngineer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BaseEngineerTest {


    private Engineer en;
    private int expSkill;
    private int expAge;
    private int expExp;

    public BaseEngineerTest(Engineer en, int expSkill, int expAge, int expExp) {
        this.en = en;
        this.expSkill = expSkill;
        this.expAge = expAge;
        this.expExp = expExp;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[][]{
                        {new AutomatedEngineer(24, 10), 30, 24, 10},
                        {new ManualEngineer(24, 10), 20, 24, 10}
                }
        );
    }
    @Test
    public void checkDefaultAge(){
        Assert.assertEquals("The age is not correct!", expAge, en.getAge());
    }
    @Test
    public void checkDefaultSkill(){
        Assert.assertEquals("The age is not correct!", expSkill, en.getSkill());
    }
    @Before
    public void sbc (){
        System.out.print("Test message");
    }
}
