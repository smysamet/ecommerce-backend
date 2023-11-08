package com.smy.ecommerce.utils.results;

public class ErrorDataResult<T> extends DataResult<T> {
    public ErrorDataResult() {
        super(null, false);
    }

    public ErrorDataResult(String message) {
        super(null, false, message);
    }

}
