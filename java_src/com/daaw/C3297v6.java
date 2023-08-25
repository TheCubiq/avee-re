package com.daaw;

import android.net.Uri;
/* renamed from: com.daaw.v6 */
/* loaded from: classes.dex */
public final class C3297v6 {

    /* renamed from: a */
    public static final int f29931a = 22;

    /* renamed from: a */
    public static boolean m7397a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* renamed from: b */
    public static String m7396b(Uri uri) {
        return uri.toString().substring(f29931a);
    }
}
