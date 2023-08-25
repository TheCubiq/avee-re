package com.daaw;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class hf0 implements jp<jf0, k60> {
    public final d51<File, k60> p;
    public final d51<jf0, k60> q;
    public final e51<k60> r;
    public final zw<jf0> s;

    public hf0(jp<jf0, Bitmap> jpVar, jp<InputStream, s60> jpVar2, bc bcVar) {
        n60 n60Var = new n60(jpVar.d(), jpVar2.d(), bcVar);
        this.p = new i10(new p60(n60Var));
        this.q = n60Var;
        this.r = new o60(jpVar.c(), jpVar2.c());
        this.s = jpVar.a();
    }

    @Override // com.daaw.jp
    public zw<jf0> a() {
        return this.s;
    }

    @Override // com.daaw.jp
    public e51<k60> c() {
        return this.r;
    }

    @Override // com.daaw.jp
    public d51<jf0, k60> d() {
        return this.q;
    }

    @Override // com.daaw.jp
    public d51<File, k60> e() {
        return this.p;
    }
}
