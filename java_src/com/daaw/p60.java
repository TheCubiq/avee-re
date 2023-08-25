package com.daaw;

import java.io.InputStream;
/* loaded from: classes.dex */
public class p60 implements d51<InputStream, k60> {
    public final d51<jf0, k60> a;

    public p60(d51<jf0, k60> d51Var) {
        this.a = d51Var;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<k60> c(InputStream inputStream, int i, int i2) {
        return this.a.c(new jf0(inputStream, null), i, i2);
    }

    @Override // com.daaw.d51
    public String getId() {
        return this.a.getId();
    }
}
