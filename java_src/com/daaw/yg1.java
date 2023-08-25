package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes.dex */
public class yg1<T> implements mq0<String, T> {
    public final mq0<Uri, T> a;

    public yg1(mq0<Uri, T> mq0Var) {
        this.a = mq0Var;
    }

    public static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public ip<T> a(String str, int i, int i2) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("/")) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                uri = parse;
                return this.a.a(uri, i, i2);
            }
        }
        uri = c(str);
        return this.a.a(uri, i, i2);
    }
}
