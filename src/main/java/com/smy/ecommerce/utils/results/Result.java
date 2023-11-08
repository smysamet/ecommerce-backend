package com.smy.ecommerce.utils.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    private boolean success;
    private String message;

    public Result(boolean isSuccess) {
        this.success = isSuccess;
    }

    public Result(boolean isSuccess, String message) {
        this.success = isSuccess;
        this.message = message;
    }
}
