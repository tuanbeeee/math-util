package com.fepfer.mathutil.test.core;

import com.tuanbe.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//Cau lenh này chi choi vs Junit báo hieu ràng se càn loop qua tap data
//Lay cap data input/expected nhòi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //Hàm này ta se tra vè mang 2 chièu, gòm nhieu2 cap Exepceted|Input
    @Parameterized.Parameters //Junit se ngam chay loop qua tung dong cua mang de lay ra dc cap data
    //Ten ham ko quan trong, cai @... moi quan trong
    public static Object[][] initData() {

        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},};

    }
    //gia su loop qua dc tung dong cua mang, ta van can gan tung value cua cot vao tung bien tuong ung input, expected

    @Parameterized.Parameter(value = 0) //map vs cot 0 cua mang
    public int n; //bien map vs value cua cot 0 cua mang
    @Parameterized.Parameter(value = 1)
    public long expected; //kieu 'long' vì giá tri tra ve cua hàm getF() là long

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {

        Assert.assertEquals(expected, MathUtil.getFactorial(n));

    }
    
    
    
    

}
