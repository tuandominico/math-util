/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuandinh.mathutil.main;

import com.tuandinh.mathutil.core.MathUtil;

/**
 *
 * @author tuandinh
 */
public class Main {
    public static void main(String[] args) {
        // thửu gnhieemj hàm tính giai thừa coi chạy đúng nhiw thiết kế hay không
        // ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        // ví dụ: -5 tinh được không
        // 0 coi tính mấy
        // 20 coi ti8nh mấy
        // 21 tỉnha mấy !!1
        // TEST CASSE: MỘt tình huống hàm/app/màn hình/tính năng
        // giả lập hành vi xài của ai đó!!!
        // TEST CASE: là môt tình huống sử dụng app((hàm), xài app, mà nó bao hàm 
        // input:  vào cụ thể nào đó
        // output:  ứng vơi xử lí của hàm 
        // dùng đầuv vao để xủ lí 
        // KÌ vọng: mong hàm sẽ trả về value nào đó ưng vơi actual 
        // 
        
        long expected = 120; // return 120 if n =5 
        int n = 5;           // input
       
      
        long actual = MathUtil.getFactorial(n);  
        System.out.println("5! = 120 (expected); actual: " + actual);
        
    }
}
