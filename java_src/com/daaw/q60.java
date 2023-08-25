package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class q60 implements cn1<k60> {
    public final cn1<Bitmap> a;
    public final cn1<s60> b;

    public q60(bc bcVar, cn1<Bitmap> cn1Var) {
        this(cn1Var, new v60(cn1Var, bcVar));
    }

    public q60(cn1<Bitmap> cn1Var, cn1<s60> cn1Var2) {
        this.a = cn1Var;
        this.b = cn1Var2;
    }

    @Override // com.daaw.cn1
    public z41<k60> a(z41<k60> z41Var, int i, int i2) {
        cn1<s60> cn1Var;
        cn1<Bitmap> cn1Var2;
        z41<Bitmap> a = z41Var.get().a();
        z41<s60> b = z41Var.get().b();
        if (a != null && (cn1Var2 = this.a) != null) {
            z41<Bitmap> a2 = cn1Var2.a(a, i, i2);
            return !a.equals(a2) ? new m60(new k60(a2, z41Var.get().b())) : z41Var;
        } else if (b == null || (cn1Var = this.b) == null) {
            return z41Var;
        } else {
            z41<s60> a3 = cn1Var.a(b, i, i2);
            return !b.equals(a3) ? new m60(new k60(z41Var.get().a(), a3)) : z41Var;
        }
    }

    @Override // com.daaw.cn1
    public String getId() {
        return this.a.getId();
    }
}
