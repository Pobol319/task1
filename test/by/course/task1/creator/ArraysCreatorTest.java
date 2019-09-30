package by.course.task1.creator;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraysCreatorTest {

    @Test
    public void createRandomArrayTest() {
        int size = 5;
        Assert.assertEquals(ArraysCreator.createRandomArray(size).length, size);
    }


}
