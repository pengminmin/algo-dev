package com.example.bubble.sort.controller;

import com.example.bubble.sort.domain.vo.SortVO;
import com.example.bubble.sort.service.SortService;
import com.example.bubble.sort.until.SampleUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author buqunyue
 * @date 2022/2/18
 */
@Slf4j
@RestController
@RequestMapping("/sort")
public class SortController {
    @Resource
    SortService sortService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 样本数据
     *
     * @param size
     * @return
     */
    @GetMapping("/sample")
    public int[] sample(@RequestParam(name = "size", required = false, defaultValue = "10") int size) {
        int minSize = 1;
        if (size < minSize) {
            throw new IllegalArgumentException("size 不能小于 " + minSize);
        }
        return SampleUtil.randomArray(size);
    }

    /**
     * 冒泡排序
     *
     * @return
     */
    @GetMapping("/bubble")
    public int[] bubble(@RequestBody int[] sample) {
        return sortService.bubbleSort(sample);
    }
}
