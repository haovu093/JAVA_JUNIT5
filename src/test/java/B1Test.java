import org.junit.jupiter.api.Test;

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


}


