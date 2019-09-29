package by.course.task1.validation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidatorTest {

    @DataProvider
    public Object[][] dStrings() {
        return new Object[][]{
                new Object[]{"5 16.69 999.99", true},
                new Object[]{"18.54 0 0.9", true},
                new Object[]{"zz 1.0 10", false},
                new Object[]{"27a9 0 12.3", false},
        };
    }

    @Test(dataProvider = "dStrings")
    public void isValidTest(String givenArray, boolean expectedBoolean) {
        Assert.assertEquals(Validator.isValid(givenArray), expectedBoolean);
    }

}
