package com.home.lingvo.infrastructure.presenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private static final Integer DEFAULT_SUCCESS_CODE = 200;
    private static final String DEFAULT_SUCCESS_MESSAGE = "OK";

    private Integer code;
    private String message;
    private Long timestamp;
    private T data;


    public ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.timestamp = ((Date) new Date().clone()).getTime();
        this.data = data;
    }

    public ApiResponse(T data) {
        this.code = DEFAULT_SUCCESS_CODE;
        this.message = DEFAULT_SUCCESS_MESSAGE;
        this.timestamp = ((Date) new Date().clone()).getTime();
        this.data = data;
    }
}
