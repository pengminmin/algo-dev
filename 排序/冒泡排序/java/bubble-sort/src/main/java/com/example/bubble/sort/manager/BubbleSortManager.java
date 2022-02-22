package com.example.bubble.sort.manager;

import org.springframework.stereotype.Component;

/**
 * 冒泡排除
 *
 * @author buqunyue
 * @date 2022/2/18
 */
@Component
public class BubbleSortManager {
    /**
     * 冒泡排序第个一版本
     *
     * @param array
     * @return
     */
    public int[] bubbleSortV1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * 冒泡排序第二个版本
     *
     * @param array
     * @return
     */
    public int[] bubbleSortV2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * 冒泡排序第三个版本
     *
     * @param array
     * @return
     */
    public int[] bubbleSortV3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return array;
    }
}
