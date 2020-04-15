/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static utils.MyToys.cF; // kể từ nay về sau, trong class này, xài hàm cF() như c
                                // ko cần MyToys. gọi tên hàm thôi, vì import static
/**
 *
 * @author ldlong
 */
public class MyToyTest {

    public MyToyTest() {
    }
    
    // muốn test gì thì ghi ở đây quan trọng là trả ra màu sắc
    // mỗi tình huống gọi hàm, ta cần chuẩn bị sẵn data, kỳ vọng, gọi hàm
    // ví dụ muốn test 5!, 120(expected), gọi hàm cF(5) so sánh kết quả với kì vọng
    
    // tình huống test với 1 bộ data cho sẵn xem kết quả trả về -> TEST CASE
    // liệt kê các test case here
    
    // tình huống thành công
    @Test
    public void testSuccessfulCases() {
        assertEquals(1, cF(0));
        assertEquals(2, cF(2));
        assertEquals(24, cF(4));
        assertEquals(720, cF(6));
        assertEquals(120, cF(5));
    }
    
    // ngoại lệ/Exception không được xem là một value để so sánh
    // không là value thì không thẻ dùng hà assertEquals(yêu cầu so sánh value cụ thể)
    @Test(expected = IllegalArgumentException.class) //giống try catch
    public void testExceptionCases() {
        cF(-5); // ném ngoại lệ
    }
}
