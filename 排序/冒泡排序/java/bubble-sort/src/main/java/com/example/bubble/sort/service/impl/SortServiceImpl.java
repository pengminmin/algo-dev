package com.example.bubble.sort.service.impl;

import com.example.bubble.sort.manager.BubbleSortManager;
import com.example.bubble.sort.service.SortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author buqunyue
 * @date 2022/2/18
 */
@Service
public class SortServiceImpl implements SortService {
    @Resource
    BubbleSortManager bubbleSortManager;
    @Override
    public int[] bubbleSort(int[] array) {
        return bubbleSortManager.bubbleSortV1(array);
    }




}
