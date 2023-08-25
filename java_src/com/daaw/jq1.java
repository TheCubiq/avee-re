package com.daaw;

import java.net.URL;
/* loaded from: classes.dex */
public class jq1<T> implements mq0<URL, T> {
    public final mq0<o70, T> a;

    public jq1(mq0<o70, T> mq0Var) {
        this.a = mq0Var;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public ip<T> a(URL url, int i, int i2) {
        return this.a.a(new o70(url), i, i2);
    }
}
