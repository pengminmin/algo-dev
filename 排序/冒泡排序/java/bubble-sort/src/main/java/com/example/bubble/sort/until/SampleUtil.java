package com.example.bubble.sort.until;

/**
 * 样本数据
 *
 * @author buqunyue
 * @date 2022/2/18
 */
public class SampleUtil {

    /**
     * 生成 1 - 1000 的随机数
     *
     * @param size
     * @return
     */
    public static int[] randomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }
}
