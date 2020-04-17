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
    public void testSuccessfulLower10Cases() {
        assertEquals(1, cF(0));
        assertEquals(2, cF(2));
        assertEquals(24, cF(4));
        assertEquals(720, cF(6));
        assertEquals(120, cF(5));
    }
    @Test
    public void testSuccessfulUpper10Cases() {
        assertEquals(3_628_800, cF(10));
        assertEquals(39_916_800, cF(11));
    }
    
    // ngoại lệ/Exception không được xem là một value để so sánh
    // không là value thì không thẻ dùng hà assertEquals(yêu cầu so sánh value cụ thể)
    @Test(expected = IllegalArgumentException.class) //giống try catch
    public void testExceptionNegativeCases() {
        cF(-5); // ném ngoại lệ
    }
    
    @Test(expected = IllegalArgumentException.class) //giống try catch
    public void testExceptionPositiveCases() {
        cF(16); // ném ngoại lệ
    }
    
    


// CODE VIẾT ỔN, KHÔNG SAI CÚ PHÁP THÌ LUÔN RA ĐƯỢC .JAR, .WAR, .EAR, .APK, .EXE, .DLL
// TUY NHIÊN CODE CỦA TA CÒN TIỀM ẨN SAI SÓT LOGIC, HÀM CHẠY KO ĐÚNG, NHƯNG KO SAI CÚ PHÁP
// NGUY HIỂM KHI CÓ SAI LOGIC MÀ VẪN RA FILE.JAR
// CẦN TÌM CÁCH NGĂN ANT LẠI KHI CODE SAI LOGIC, TEST RA MÀU ĐỎ, KHÔNG CHO RA FILE .JAR

// CHƠI LỚN:
// ÉP THẰNG ANT PHẢI DDMA RBAOR CODE XANH, THÔNG ĐƯỜNG, PASS HẾT TEST, KHÔNG ERROR
// VỀ MẶT GIÁ TRỊ THÌ MỚI CHO CLEAN AND BUILD
// build-impl.xml dòng 1005 or 1204 version mới(search JAR BUILDING SECTION), thêm test vào sau compile

// Jenkins, TeamCity... là tool sinh ra giúp ta những điều vừa làm bằng tay
// nó tự động làm những điều sau
// bất kì ai push code lên Git server về thì phải push kèm bộ data/test
// Jenkins phát hiện có sự thay đổi trên Git, kéo code/pull về local
// Gọi Ant/Maven compile/test thử/ đóng gói nếu test màu xanh
// nếu test bị đỏ, nó tự gửi email đến thằng vừa push, chửi, chỉ ra lỗi
// thằng dev nhận mail, sửa rồi push lại, Jenkins lặp lại cho đến khi nào
// thấy màu xanh, hoặc Dev lấy, xóa mẹ test đi Jenkins mới dừng gửi mail
}