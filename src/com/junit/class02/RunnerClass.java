package com.junit.class02;

import com.junit.class01.DivTest;
import com.junit.class01.MulTest;
import org.junit.runners.*;
import org.junit.runner.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({DivTest.class, MulTest.class})
public class RunnerClass {
}
