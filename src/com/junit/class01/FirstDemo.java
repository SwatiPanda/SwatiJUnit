package com.junit.class01;
import org.junit.*;



public class FirstDemo {
    @Test
    public void verifyUserLogin(){
        System.out.println("Test 1");
    }

    @Test
    public void verifyUserCredential(){
        System.out.println("Test 2");
    }

    @Test
    public void verifyUserLogout(){
        System.out.println("Test 3");
    }

    @Before
    public void initialWork(){
        System.out.println("Test 0");
    }

    @After
    public void finalWork(){
        System.out.println("Test final");
    }

}
