package com.ycit.openfeign.dto;

import lombok.Data;

/**
 * @author lihengkuo
 * @date 2019/3/27
 */
@Data
public class ResponseResult<T> {

    private String code;
    private Result<T> result;
    private int pageNo;
    private int totalPages;
    private int pageSize;

}
