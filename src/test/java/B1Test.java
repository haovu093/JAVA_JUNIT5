import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;

import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class B1Test {

    @Test
    void test1() {
        /* AssertEquals để kiểm tra kqua tính toán có giống vs kqua mong đợi*/
        /* AssertNotEquals để kiểm tra kqua tính toán được chấp nhận nếu biểu thức sai*/
        assertEquals(9, B1.sum(4, 5));
        assertNotEquals(3, B1.sum(2, 3));
    }

    @Test
    void test2() {
        /* Assertrue dùng kiểm tra kết quả có phải là true k */
        /* Asserfalse dùng kiểm tra kết quả có phải là false k */
        assertTrue(B1.compare(5, 6));
        assertFalse(B1.compare(8, 5));

    }

    @Test
    void test3() {
        /* assernull kiểm tra giá trị = null 8
       /* assertnotnull kiểm tra đối tượng # null */
        assertNull(B1.devied(3, 0));
        assertNotNull(B1.devied(9, 3));

    }

    @Test
    void test4() {
        /*asserSame So sánh địa chỉ vùng nhớ của 2 tham chiếu đối tượng bằng cách sử dụng toán tử ==.
        Test sẽ được chấp nhận nếu cả 2 đều tham chiếu đến cùng một đối tượng.*/
        String s1 = "test";
        String s2 = "test";
        assertSame(s1, s2);
    }

    @Test
    void test5() {
        /* assertNotSame(): So sánh địa chỉ vùng nhớ của 2 tham chiếu đối tượng bằng cách sử dụng toán tử ==.
        Test sẽ được chấp nhận nếu cả 2 đều tham chiếu đến các đối tượng khác nhau.*/
        String s1 = "test java";
        String s2 = "test";
        assertNotSame(s1, s2);
    }

    @Test
    void test6() {
        /*  assertArrayEquals So sánh 2 mảng để kiểm tra bằng nhau.
        Test sẽ được chấp nhận nếu các giá trị của 2 mảng là bằng nhau.
         */
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        assertArrayEquals(arr1, arr2);
    }

    @Test
    void test7() {
        int[] a1 = new int[]{1, 3, 5};
        int[] a2 = new int[]{1, 4, 6};
        assertArrayEquals(a1, a2);
    }

    @Test
    @DisplayName("Testarray")
    void sameple() {
        String[] countries = new String[]{"VN", "Mỹ", "Japan"};
        assertThat(countries).contains("VN");
        assertThat(countries).isNotNull()
                .contains("VN")
                .doesNotContainNull()
                .containsSequence("Mỹ", "Japan");
        assertThat(countries).hasSize(3);

    }

    @Test
    void mang() {
        int[] so = new int[]{1, 2, 3, 4};
        assertThat(so).contains(3);
        assertThat(so).isNotNull()
                .contains(4)
                .doesNotContain(13);

        assertThat(so).hasSize(4);

    }

    @Test
    void test_string() {
        String s = "Tôi yêu vn";
        String s1 = "hãy chịu khó học";
        String sclone = s;
        assertThat(s).isNotNull()
                .startsWith("Tôi")
                .doesNotContain("yêu1")
                .contains("vn");
        assertThat(s).isNotEqualTo(s1);
        assertThat(s).isEqualTo(sclone);
    }

    @Test
    void test_number() {
        double s1 = 12.0;
        double s2 = 11.0;
        assertThat(s1).isEqualTo(12.3, withPrecision(1d));
        assertThat(s1).isCloseTo(15.0, Offset.offset(4d));
        assertThat(s1).isBetween(10.0, 15.0); //s1 nằm trong khoảng
        assertThat(s2).isStrictlyBetween(10.0, 15.0); // s1 nằm ngoài khoảng s1> 10.0 và s1< 15.0
        int s3 = 3;
        assertThat(s3).isBetween(1, 4);
        assertThat(s3).isStrictlyBetween(2, 5);
        assertThat(s3).isNotZero();
    }
    @Test
    void test_sdt(){
        String sdt = "0123456789";
        assertThat(sdt).startsWith("0")
                .hasSize(10)
                .containsOnlyDigits();
    }

    @Test
    void  test_email(){
        String email="x@gmail.com";
        assertThat(email).isNotNull()
                .contains("@")
                .doesNotContain("#$%^");
        assertThat(email).endsWith(".com");

    }

}


