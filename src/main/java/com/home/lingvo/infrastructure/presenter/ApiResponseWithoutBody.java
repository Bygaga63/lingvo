package com.home.lingvo.infrastructure.presenter;

import lombok.Value;

@Value
public class ApiResponseWithoutBody {
    private final Boolean success;
    private final String message;
}
