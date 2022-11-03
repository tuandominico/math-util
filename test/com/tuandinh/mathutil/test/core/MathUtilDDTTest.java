/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tuandinh.mathutil.test.core;

import com.tuandinh.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author tuandinh
 */

// câu lệnh này của JUnit báo hiệu rằng sẽ cần loop qua tập data
// để lây cặp data input|expected nhồi vào hàm t
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    // ta tra ve mang hai chieu gom nhieu cap Expected|Inputest
    @Parameterized.Parameters // Junit sẽ ngàm chạy loop qua từng vòng để lấy cặp
                              // data input/expected 
    // tên hàm không quan trọng , quan trọng là @
    
    public static Object[][] initData() {
        return new Integer [][] {
            {0,1}, 
            {1,1},
            {2,2}, 
            {3, 6},
            {4, 24}, 
            {5,120}, 
        };
    }
    // gải sử loop qua từng vòng của mảng, ta vẫn cần gán từng value của cột 
    // voà biến tương ứng input, expected để lát hồi feed cho cái hàm
    
    
    @Parameterized.Parameter(value = 0) // value map với mảng data
    public int n; // biến map vơi value của cột 0 của mabng
    @Parameterized.Parameter(value = 1)
    public long expected; // kiểu long vì giá trị trả về cảu hàm getF(); 
                          // là long 
     @Test
     public void testGetFactorialGivenRightArgumentReturnsWell() {
           
        org.junit.Assert.assertEquals(expected, MathUtil.getFactorial(n));
     }
}
