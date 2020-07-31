package com.ycit.openfeign.dto;

import lombok.Data;

import java.util.List;

/**
 * @author lihengkuo
 * @date 2019/3/27
 */
@Data
public class Result<T> {

    private int total;
    private List<T> data;

}
