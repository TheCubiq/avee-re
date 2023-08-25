package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes.dex */
public class yg1<T> implements mq0<String, T> {

    /* renamed from: a */
    public final mq0<Uri, T> f33640a;

    public yg1(mq0<Uri, T> mq0Var) {
        this.f33640a = mq0Var;
    }

    /* renamed from: c */
    public static Uri m3762c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public InterfaceC1744ip<T> mo3764a(String str, int i, int i2) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("/")) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                uri = parse;
                return this.f33640a.mo3764a(uri, i, i2);
            }
        }
        uri = m3762c(str);
        return this.f33640a.mo3764a(uri, i, i2);
    }
}
