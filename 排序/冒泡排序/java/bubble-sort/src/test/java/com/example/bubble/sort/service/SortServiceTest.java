package com.example.bubble.sort.service;

import com.alibaba.fastjson.JSON;
import com.example.bubble.sort.until.SampleUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author buqunyue
 * @date 2022/2/18
 */
@Slf4j
@SpringBootTest
class SortServiceTest {
    @Resource
    SortService sortService;

    /**
     * 冒泡排序
     */
    @Test
    void bubbleSort() {
        int[] sampleArray = SampleUtil.randomArray(10);
        log.info("冒泡排序 sampleArray:{}", JSON.toJSONString(sampleArray));
        int[] result = sortService.bubbleSort(sampleArray);
        log.info("冒泡排序 sampleArray:{} result:{}", JSON.toJSONString(sampleArray), JSON.toJSONString(result));
    }

    @Test
    void demo(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; ++i) {
//            System.out.println(i);
//        }

//        int a = 0;
//        int b = ++a;
//        System.out.println(a);
//        System.out.println(b);

//        int a = 0;
//        int b = a + a * 2;
//        log.info("a:{} b:{}", a, b);

//        int i = 0;
//        i = i++;
//        log.info("i:{}", i);
    }
}
