package com.daaw;

import android.net.Uri;
/* loaded from: classes2.dex */
public final class t18 {
    public static final g6 a = new g6();

    public static synchronized Uri a(String str) {
        synchronized (t18.class) {
            g6 g6Var = a;
            Uri uri = (Uri) g6Var.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                g6Var.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
