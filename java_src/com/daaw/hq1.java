package com.daaw;

import android.content.Context;
import android.net.Uri;
/* loaded from: classes.dex */
public abstract class hq1<T> implements mq0<Uri, T> {
    public final Context a;
    public final mq0<o70, T> b;

    public hq1(Context context, mq0<o70, T> mq0Var) {
        this.a = context;
        this.b = mq0Var;
    }

    public static boolean e(String str) {
        return "file".equals(str) || "content".equals(str) || "android.resource".equals(str);
    }

    public abstract ip<T> b(Context context, String str);

    public abstract ip<T> c(Context context, Uri uri);

    @Override // com.daaw.mq0
    /* renamed from: d */
    public final ip<T> a(Uri uri, int i, int i2) {
        String scheme = uri.getScheme();
        if (e(scheme)) {
            if (v6.a(uri)) {
                return b(this.a, v6.b(uri));
            }
            return c(this.a, uri);
        } else if (this.b == null || !("http".equals(scheme) || "https".equals(scheme))) {
            return null;
        } else {
            return this.b.a(new o70(uri.toString()), i, i2);
        }
    }
}
