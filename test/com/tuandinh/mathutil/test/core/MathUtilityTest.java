/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuandinh.mathutil.test.core;

import com.tuandinh.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author tuandinh
 */
public class MathUtilityTest {
    
    // Đây là class sẽ sử dụng các hàm của thưu viện/framework   JUnit
    // để kiểm thử / kiểm tra code chính  - hàm tinhGiaiThua() bên
    // class core.MathUtil
    // viết code để test code chính bên kia!!!
    // có quy tắc đăthj tên hàm kiểm thử 
    // nhưng thường se là nói lên mục đích  cảu các case / tinh huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại!!!
    
    // hàm dứoi đây là tính huống test hàm chaỵ thành công, trả về ngol
    // ta sẽ xài hàm kiẻu well - đưa 5!, 6! , khôhgn chơi đưa -5!, 30!
    
    // @Test Junit sẽ phối hợp với JVM để chaỵh hàm này
    // @Test phải hậu trươngf chính là public static void main()
    // có nhiều @test ứng vơi nhiều case khác nhau 
    
    @Test 
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0; 
        long expected = 1; // hy vong 0! = 1; 
        //long actual; // goi ham can test ben core /app chinh/code chinh
        long actual = MathUtil.getFactorial(n);
        
        // so sanh expected vs , actual dugn xanh xanh do do. framework 
        Assert.assertEquals(expected, actual);
        // hàm giúp so sánh 2 giá trị nào đó có giống nhau không
        // nếu giống nhau -> thảy ra màu xanh đèn đyuwong - đưognf thông, code ngol
        //     ít nhát cho case đang test
        //                -> nếu không giống nhau thảy ra màu đỏ => không ==
        // gộp thêm vài case thành công/đưa đâu vào ngon!!! hàm phải tính ngo
        
        
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }
    
    //  hàm F() ta thiết kế có 2 tình huống xử lí
    // 1. đưa data tử tế [1,2 3,4..] -> tình hống được n! done!
    // 2. Đưa đata vào cà chớn, âm, > 20 ; THIẾT KẾ CUA HÀM LÀ NÉM RA NGOẠI LỆ
    // TAO KÌ VỌN NGOẠI LỆ XUẤT HIỆN N <0 || N > 20
    // RẤT mong ngoại lệ xuất hiện vơi sn cà chơn này 
    // 
    // nếu hàm nhận vào n < 0 và n > 20 và hàm ném ra ngoại lệ 
    // HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ  -> MÀU XANH PHẢI XUẤT HIỆN 
    //  nếu hàm nhận vào n < 0 và n > 20 và hàm không ném ra ngoại lệ 
    // sure, HÀM CHAÝ SAI THIẾT KẾ, SAI LÌ VỌNG , MÀU ĐỔ 
    
    // Test case: 
    // input = -5; 
    // expected: IllegalArgumentException
    // 
    // tình huống bất thường ngoại lệ, ngoài dự tinh, dữ liệu 
    // là những thứu không thể đo lường, sao sanh theo kiểu value
    // mà chỉ so sánh theo kiểu chúng xuất hiện hay không
    // assertEquals() không dùng so sánh 2 ngoại lệ 
    //       equals() là bằng nhau hay không trên value !!!
    
    // MÀU ĐỎ, DO HÀM ĐÚNG ALF CÓ NÉM NGOẠI LỆ THẤT Ự 
    // NHƯNG KHÔNG PHẢI LÀ NGOẠI LỆNHUW KÌ VỌNG - THƯUCJ SỰ KÌ VỌNG SAI
    // KHÔNG PHẢI NÉM SAI
    
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy
//                                   // sẽ ném ra ngoại lệ NUmberFormat...
//    }
    
//    
//    @Test(expected = IllegalArgumentException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy
//                                   // sẽ ném ra ngoại lệ NUmberFormat...
//    }
    
    // Cách khác để bắt ngoại lệ, viết tự nhiên hơn!!1
    // xài lambda
    //Test case:  hàm sẽ ném về ngoại lệ nếu nhận vào 21
    // tui caanf thấy mẫu xanh khi chơi với 21
    // Expected = Actual 
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
//                            tham số 2: đoạn code chạy văng ra ngoại runnable )
//        
          Assert.assertThrows(IllegalArgumentException.class, () -> 
          MathUtil.getFactorial(-5));
                            
                                  
    }
    
    @Test 
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try{
            MathUtil.getFactorial(-5);
        }catch(Exception e) {
            // bắt try-catch là Junit sẽ ra màu xanh do đã chủ đọng kiểm soát ngoại lêk 
            // nhưng không chẵ ngoại lệ mình cần có xuất hiện hay không??? 
            // có đoạn code kiểm soát đugns ngoại lệ IllegalArgumentException xuât hiện 
             Assert.assertEquals("Invalid argument: n must be between 0 -> 20", e.getMessage() );
        }
    }
    
}
