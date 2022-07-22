package com.codingmore.state;

/**
 * @Author yaCoding
 * @create 2022-07-22 下午 10:24
 */

public enum UserType {
    BACKEND(0),
    FRONT(1);
    private int userType;

    UserType(int userType) {
        this.userType = userType;
    }

    public int getUserType() {
        return userType;
    }
}
