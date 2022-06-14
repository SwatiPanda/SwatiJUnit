package com.junit.class01;

import com.junit.dev.Calculator;
import com.junit.groupTesting.RegressionSuite;
import com.junit.groupTesting.SmokeSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MulTest {
    Calculator c;
    static int testCaseNum = 0;
    int expResult = 0;
    int actResult = 0;

    @Before
    public void beforeMessage(){
        c = new Calculator();
        System.out.println("==TestCase# "+ ++testCaseNum);
    }
    @After
    public void verifyAll(){
        System.out.println("==================");
    }

    @Category({SmokeSuite.class})
    @Test
    public void verify_WithOneZeroAndOnePositive(){
        System.out.println("|verify_WithOneZeroAndOnePositive|");
        expResult = 0;
        actResult = c.mul(0,5);
        Assert.assertEquals(expResult, actResult);

    }
    @Category({RegressionSuite.class, SmokeSuite.class})
    @Test
    public void verify_WithTwoZeroes(){
        System.out.println("|verify_WithTwoZeroes|");
        expResult = 0;
        actResult = c.mul(0,0);
        Assert.assertEquals(expResult, actResult);

    }
    @Category({RegressionSuite.class})
    @Test
    public void verify_WithOnePositiveOneNegative(){
        System.out.println("|verify_WithOnePositiveOneNegative|");
        expResult = -30;
        actResult = c.mul(-10,3);
        Assert.assertEquals(expResult, actResult);

    }
    @Test
    public void verify_WithTwoNegatives(){
        System.out.println("|verify_WithTwoNegatives|");
        expResult = 15;
        actResult = c.mul(-5,-3);
        Assert.assertEquals(expResult, actResult);

    }

    @Category({SmokeSuite.class})
    @Test
    public void verify_WithOneNegativeOneZero(){
        System.out.println("|verify_WithOneNegativeOneZero|");
        expResult = 0;
        actResult = c.mul(-5,0);
        Assert.assertEquals(expResult, actResult);

    }
    @Category({RegressionSuite.class, SmokeSuite.class})
    @Test
    public void verify_WithTwoPositives(){
        System.out.println("|verify_WithTwoPositives|");
        expResult = 300;
        actResult = c.mul(30,10);
        Assert.assertEquals(expResult, actResult);

    }
    @Category({RegressionSuite.class})
    @Test
    public void verify_WithTwoLargePositives(){
        System.out.println("|verify_WithTwoPositives|");
        expResult = 560000;
        actResult = c.mul(560,1000);
        Assert.assertEquals(expResult, actResult);

    }
}
