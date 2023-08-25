package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class v6 {
    public static final int a = 22;

    public static boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static String b(Uri uri) {
        return uri.toString().substring(a);
    }
}
