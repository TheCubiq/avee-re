package com.daaw;

import java.io.InputStream;
/* loaded from: classes.dex */
public class p60 implements d51<InputStream, k60> {

    /* renamed from: a */
    public final d51<jf0, k60> f22640a;

    public p60(d51<jf0, k60> d51Var) {
        this.f22640a = d51Var;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<k60> mo2793c(InputStream inputStream, int i, int i2) {
        return this.f22640a.mo2793c(new jf0(inputStream, null), i, i2);
    }

    @Override // com.daaw.d51
    public String getId() {
        return this.f22640a.getId();
    }
}
