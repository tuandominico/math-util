/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuandinh.mathutil.core;

/**
 *
 * @author tuandinh
 */
public class MathUtil {
    
    // trong class này cung câp cho ai đố nhiều hàm sử lí tqán học 
    // clone class math của JDK
    // hàm thư viện sài chung cho ai đó mà không cần lưu lại trạng thái
    // thì ta sẽ chọn thiết kế là hàm static 
    // 
    
    // hàm tính giai thừa !!! 
    // n! = 1.2.3.4.5.6... n
    // khong có giai thừa âm
    // 0! = 1 quy ước 
    // giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị 
    // 20! là 18 con số không, vừa kịp đủ cho kiểu long
    // 21! tràn kiểu long
    // tính n! từ 0 -> 20 
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
        throw new IllegalArgumentException("Invalid argument: n must be between 0 -> 20");
        }
        if(n == 0 || n == 1) {
            return 1; // end the game eatlier 
            
        }
        long product = 1; // tich nhan don
        for(int i = 2; i <= n; i++){
            product *= i; 
        }
        
        return product;
    }
    
    
}
