package com.daaw;

import android.net.Uri;
/* loaded from: classes2.dex */
public final class t18 {

    /* renamed from: a */
    public static final C1370g6 f26904a = new C1370g6();

    /* renamed from: a */
    public static synchronized Uri m9649a(String str) {
        synchronized (t18.class) {
            C1370g6 c1370g6 = f26904a;
            Uri uri = (Uri) c1370g6.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                c1370g6.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
