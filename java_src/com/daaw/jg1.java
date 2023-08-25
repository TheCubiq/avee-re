package com.daaw;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class jg1 implements jp<InputStream, Bitmap> {
    public final kg1 p;
    public final zb q;
    public final mg1 r = new mg1();
    public final i10<Bitmap> s;

    public jg1(bc bcVar, cq cqVar) {
        kg1 kg1Var = new kg1(bcVar, cqVar);
        this.p = kg1Var;
        this.q = new zb();
        this.s = new i10<>(kg1Var);
    }

    @Override // com.daaw.jp
    public zw<InputStream> a() {
        return this.r;
    }

    @Override // com.daaw.jp
    public e51<Bitmap> c() {
        return this.q;
    }

    @Override // com.daaw.jp
    public d51<InputStream, Bitmap> d() {
        return this.p;
    }

    @Override // com.daaw.jp
    public d51<File, Bitmap> e() {
        return this.s;
    }
}
