package com.daaw;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class t60 implements jp<InputStream, s60> {
    public final c70 p;
    public final d70 q;
    public final mg1 r;
    public final i10<s60> s;

    public t60(Context context, bc bcVar) {
        c70 c70Var = new c70(context, bcVar);
        this.p = c70Var;
        this.s = new i10<>(c70Var);
        this.q = new d70(bcVar);
        this.r = new mg1();
    }

    @Override // com.daaw.jp
    public zw<InputStream> a() {
        return this.r;
    }

    @Override // com.daaw.jp
    public e51<s60> c() {
        return this.q;
    }

    @Override // com.daaw.jp
    public d51<InputStream, s60> d() {
        return this.p;
    }

    @Override // com.daaw.jp
    public d51<File, s60> e() {
        return this.s;
    }
}
