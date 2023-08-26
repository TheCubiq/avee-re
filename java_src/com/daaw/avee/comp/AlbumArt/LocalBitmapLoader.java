package com.daaw.avee.comp.AlbumArt;

import com.daaw.avee.Common.Utils;
/* loaded from: classes.dex */
public class LocalBitmapLoader {
    public static final String Prefix = "local:";
    private static final String PrefixPure = "local";
    public static final char Separator = ':';

    public static String getFileNameFromPath(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = new String[2];
        Utils.stringSplitInTwo(str, 58, strArr);
        if ("local".equals(strArr[0])) {
            return strArr[1];
        }
        return null;
    }
}
