package com.junit.class02;

import com.junit.class01.DivTest;
import com.junit.class01.MulTest;
import com.junit.groupTesting.SmokeSuite;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeSuite.class)
@Suite.SuiteClasses({DivTest.class, MulTest.class})
public class RunGroups {
}
