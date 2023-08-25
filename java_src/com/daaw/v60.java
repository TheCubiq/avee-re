package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class v60 implements cn1<s60> {
    public final cn1<Bitmap> a;
    public final bc b;

    public v60(cn1<Bitmap> cn1Var, bc bcVar) {
        this.a = cn1Var;
        this.b = bcVar;
    }

    @Override // com.daaw.cn1
    public z41<s60> a(z41<s60> z41Var, int i, int i2) {
        s60 s60Var = z41Var.get();
        Bitmap f = z41Var.get().f();
        Bitmap bitmap = this.a.a(new dc(f, this.b), i, i2).get();
        return !bitmap.equals(f) ? new u60(new s60(s60Var, bitmap, this.a)) : z41Var;
    }

    @Override // com.daaw.cn1
    public String getId() {
        return this.a.getId();
    }
}
