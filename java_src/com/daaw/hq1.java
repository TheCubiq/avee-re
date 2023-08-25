package com.daaw;

import android.content.Context;
import android.net.Uri;
/* loaded from: classes.dex */
public abstract class hq1<T> implements mq0<Uri, T> {

    /* renamed from: a */
    public final Context f12846a;

    /* renamed from: b */
    public final mq0<o70, T> f12847b;

    public hq1(Context context, mq0<o70, T> mq0Var) {
        this.f12846a = context;
        this.f12847b = mq0Var;
    }

    /* renamed from: e */
    public static boolean m20490e(String str) {
        return "file".equals(str) || "content".equals(str) || "android.resource".equals(str);
    }

    /* renamed from: b */
    public abstract InterfaceC1744ip<T> mo7190b(Context context, String str);

    /* renamed from: c */
    public abstract InterfaceC1744ip<T> mo7189c(Context context, Uri uri);

    @Override // com.daaw.mq0
    /* renamed from: d */
    public final InterfaceC1744ip<T> mo3764a(Uri uri, int i, int i2) {
        String scheme = uri.getScheme();
        if (m20490e(scheme)) {
            if (C3297v6.m7397a(uri)) {
                return mo7190b(this.f12846a, C3297v6.m7396b(uri));
            }
            return mo7189c(this.f12846a, uri);
        } else if (this.f12847b == null || !("http".equals(scheme) || "https".equals(scheme))) {
            return null;
        } else {
            return this.f12847b.mo3764a(new o70(uri.toString()), i, i2);
        }
    }
}
