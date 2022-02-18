package com.example.bubble.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author buqunyue
 * @date 2022/2/18
 */
@Slf4j
public class AddTest {
    @Test
    void add1() {
        int i = 0;
        i = i++;
        log.info("i:{}", i);
        Assertions.assertEquals(0, i);
    }

    @Test
    void add2() {
        int a = 2;
        int b = (3 * a++) + a;
        log.info("a:{} b:{}", a, b);
        Assertions.assertEquals(3, a);
        Assertions.assertEquals(9, b);
    }

    @Test
    void add3() {
        int a = 2;
        int b = a + (3 * a++);
        log.info("a:{} b:{}", a, b);
        Assertions.assertEquals(3, a);
        Assertions.assertEquals(8, b);

    }

    @Test
    void add4() {
        int i = 1;
        int j = 1;
        int k = i++ + ++i + ++j + j++;
        log.info("i:{} j:{} k:{}", i, j, k);
        Assertions.assertEquals(3, i);
        Assertions.assertEquals(3, j);
        Assertions.assertEquals(8, k);
    }

    @Test
    void add5() {
        int a = 0;
        int b = 0;
        a = a++;
        b = a++;
        log.info("a:{} b:{}", a, b);
        Assertions.assertEquals(1, a);
        Assertions.assertEquals(0, b);
    }

    @Test
    void add6() {
        int a = 2;
        int b = 3 * a++;
        int c = a + b;
        log.info("a:{} b:{} c:{}", a, b, c);
        Assertions.assertEquals(3, a);
        Assertions.assertEquals(6, b);
        Assertions.assertEquals(9, c);
    }

    @Test
    void forTest() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            log.info("i:{}", i);
        }
        long b = System.currentTimeMillis();
        long c = b - a;

        long e = System.currentTimeMillis();
        for (int i = 0; i < 10000; ++i) {
            log.info("i:{}", i);
        }
        long f = System.currentTimeMillis();
        long g = f - e;
        log.info("c:{}", c);
        log.info("g:{}", g);
    }
}
