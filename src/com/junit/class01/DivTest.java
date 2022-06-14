package com.junit.class01;

import com.junit.dev.Calculator;
import com.junit.groupTesting.RegressionSuite;
import com.junit.groupTesting.SmokeSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DivTest {
    Calculator c;
    //static int testCaseNum = 0;
    int expResult = 0;
    int actResult = 0;

    @Before
    public void beforeMessage(){
        c = new Calculator();
        //System.out.println("==TestCase# "+ ++testCaseNum);
    }
    @After
    public void verifyAll(){
        System.out.println("==================");
    }

    @Category({RegressionSuite.class, SmokeSuite.class})
    @Test
    public void verify_WithBiggerPositiveDivisor(){

        expResult = 0;
        actResult = c.div(5,6);
        Assert.assertEquals(expResult, actResult);

    }
    @Category({SmokeSuite.class})
    @Test
    public void verify_WithZeroAndZero(){

        expResult = 1;
        actResult = c.div(0,0);
        Assert.assertEquals(expResult, actResult);


    }
    @Category({RegressionSuite.class})
    @Test
    public void verify_WithSmallerPositiveDivisor(){

        expResult = 5;
        actResult = c.div(10,2);
        Assert.assertEquals(expResult, actResult);

    }

    @Category({RegressionSuite.class, SmokeSuite.class})
    @Test
    public void verify_WithSameNegatives(){

        expResult = 1;
        actResult = c.div(-5,-5);
        Assert.assertEquals(expResult, actResult);

    }
    @Category({RegressionSuite.class})
    @Test
    public void verify_WithSamePositives(){

        expResult = 1;
        actResult = c.div(6,6);
        Assert.assertEquals(expResult, actResult);

    }
    @Category({SmokeSuite.class})
    @Test
    public void verify_WithOnePositiveOneNegative(){

        expResult = -10;
        actResult = c.div(100,-10);
        Assert.assertEquals(expResult, actResult);

    }

}
