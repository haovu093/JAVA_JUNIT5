import org.junit.jupiter.api.Test;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;

import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class testEmail {

    @Test
    void test_email() {
        String email = "foobar@gmail.com";
        assertThat(email).isNotNull()
                .contains("@", ".")
                .endsWith(".com");
        assertThat(email).containsPattern("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    @Test
    void test_weight() {
        String w1 = "55kg";
        assertThat(w1).isNotNull()
                .contains("kg")
                .doesNotContain("@#$%^&*()!?>")
                .endsWith("kg");
    }

    @Test
    void test_cmt() {
        String[] arr = new String[]{"145480179", "145633454", "3434332", "4343", "4343"};
        for (int i = 0; i < arr.length; i++) {
            assertThat(arr[i]).isNotNull()
                    .hasSize(9)
                    .containsOnlyDigits();
        }
    }
    @Test
    void test_cmt2(){
        int[] arr1= new int[]{123,43434343,43434};
        for( int i =0; i<arr1.length;i++)
        {
            assertThat(arr1[i]).isNotNull();
            assertThat(String.valueOf(arr1[i])).hasSize(9);
            assertThat(String.valueOf(arr1[i])).containsOnlyDigits();
        }
    }
}



