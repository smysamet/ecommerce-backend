package com.smy.ecommerce.utils.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResult<T> extends Result {

    private T data;

    public DataResult(T data, boolean isSuccess, String message) {
        super(isSuccess, message);
        this.data = data;
    }

    public DataResult(T data, boolean isSuccess) {
        super(isSuccess);
    }
}
