/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.fepfer.mathutil.test.core;

import com.tuanbe.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fepfer
 */
public class MathUtilityTest {
    //This class will use fuctions and libs/framworks Junit
    //to test/check our own code which is Factorial() fucntion
    //we write code to test another important code

    //There are many rule of conding convention
    //but after all, they usually describe the goal of each case, test
    //@Test Junit will coop with JVM to run this Function
    //@Test BTS side is psvm
    //We can have many @Test with many differents case
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test the situation that input are aproriate
        long expected = 1; //expect 0! = 1
        long actual = MathUtil.getFactorial(n);

        //compare expected with actual using framework (green green, red red)
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));

        Assert.assertEquals(11, MathUtil.plusTwoNumber(9, 2));

    }   //this fucntion comapre 2 value
    //if 2 value is equal => return green
    //else => return red (expected and actual is different)

    //1. Dua data tu te trong [0-20] -> tinh dung dc n! - done
    //2. Ðua data và cà chon, am, > 20; Thiet ke cua ham la nem ra ngoai le
    //Tao ki vong ngoai le khi N < 0 || N > 20
    //rat mong ngoai le xuat hien
    //neu ham nhan vao n<0 hoac n>20 va ham nem ra ngoai le
    //Ham chay dung nhu thiet ke -> mau xanh xuat hien
    //neu ham nhan vao n<0 hoac n>20 va ham ko nem ra ngoai le
    //sure ham chay sai thiet ke. sai ki vong, mau do xuat hien
    //Test case: input = -5
    //Expected IllegalArgumentException xuat hien
    //tinh huong bat thuong, ngoai le la nhung thu ko do luong dc = cach chung co xuat hien hay ko
    //assertEquals() ko dung de so sanh 2 ngoai le
    //assertEquals() la bang nhau hay ko tren value
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }

    //Cach bat ngoai le xuat hien, viet tu nhien hon
    //xai Lambda de bat ngoai le
    //Test case: ham se nem ve ngoai le neu nhan vao 21
    //tui can thay mau xanh khi choi vs 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
//        Assert.assertThrows(Tham so 1: Loai ngoai le muon so sanh,
//                            Tham so 2: doan code nay chay vang ra ngoai runnable);

        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5)
        );

        // MathUtil.getFactorial(-5);
    }

    //Bat ngoai le xem ham co nem ve ngoai le hay ko khi n ca chon
    //co nem, tuc la ham chay dung thiet ke -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //Chu dong kiem soat ngoai le
        
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bat try catch la Junit se ra mau xanh, vi minh da chu dong kiem soat ngoai le
            //nhung ko chac ngoai le minh can co xuat hien hay ko
            //co doan code kiem soat dung ngoai le IllegalArgumentException xuat hien
            Assert.assertEquals("N must be between 0 to 20", e.getMessage());
        }
    }

}
