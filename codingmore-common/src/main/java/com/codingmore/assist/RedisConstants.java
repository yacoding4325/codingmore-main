package com.codingmore.assist;

/**
 * @Author yaCoding
 * @create 2022-07-06 下午 10:22
 */

public class RedisConstants {

    private static String REDIS_WEB_DATABASE = "codingmore-web-redis";
    private static String PAGE_VIEW = "pageView";
    private static String POST_LIKE_COUNT = "likeCount";

    private static String REDIS_ADMIN_DATABASE = "codingmore-admin-redis";
    private static String REDIS_KEY_USER = "user";
    private static String REDIS_KEY_RESOURCE_LIST = "resource";
    public static Long REDIS_EXPIRE = 86400L;

    public static String getAdminUserKey(String lastKey) {
        return REDIS_ADMIN_DATABASE + ":" + REDIS_KEY_USER + ":" + lastKey;
    }

    public static String getAdminResourceKey(Long lastKey) {
        return REDIS_ADMIN_DATABASE + ":" + REDIS_KEY_RESOURCE_LIST + ":" + lastKey;
    }

    public static String getWebPageViewKey(String lastKey) {
        return REDIS_WEB_DATABASE + ":" + PAGE_VIEW + ":" + lastKey;
    }

    public static String getWebPostLikeKey(String lastKey) {
        return REDIS_WEB_DATABASE + ":" + POST_LIKE_COUNT + ":" + lastKey;
    }


}
