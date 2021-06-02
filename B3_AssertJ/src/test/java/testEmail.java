import org.junit.jupiter.api.Test;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;

import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class testEmail {

    @Test
    void test_email(){
        String email="foobar@gmail.com";
        assertThat(email).isNotNull()
                .contains("@",".")
                .endsWith(".com");
        assertThat(email).containsPattern("^[A-Za-z0-9+_.-]+@(.+)$");


    }
    @Test
    void test_weight(){
        String w1 = "55kg";
        assertThat(w1).isNotNull()
                .startsWith("")
                .contains("kg")
                .doesNotContain("@#$%^&*()!?>")
                .endsWith("kg");

    }
    @Test
 void test_cmt() {
        int[] arr = new int[]{145480170, 145633454, 3434332, 4343, 4343};
            assertThat(arr).isNotNull();
            assertThat(arr).hasSize(5);
           for( int i=0; i< arr.length;i++){
           }

        }
    }

