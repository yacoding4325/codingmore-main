package com.codingmore.state;

/**
 * @Author yaCoding
 * @create 2022-07-22 下午 10:23
 */

public enum UserStatus {
    ENABLE(0),
    DISABLED(1);
    private int status;

    UserStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}

