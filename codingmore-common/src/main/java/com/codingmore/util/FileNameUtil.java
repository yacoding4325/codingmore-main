package com.codingmore.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.UUID;

/**
 * @Author yaCoding
 * @create 2022-07-16 下午 10:07
 */

public class FileNameUtil {

    private static final String[] imageExtension = {".jpg", ".jpeg", ".png", ".gif"};

    public static String getName(String url) {
        String ext = "";
        for (String extItem : imageExtension) {
            if (url.indexOf(extItem) != -1) {
                ext = extItem;
                break;
            }
        }
        // 2022年06月09日 + UUID + .jpg
        return  DateUtil.today() + UUID.fastUUID() + ext;

    }

}
