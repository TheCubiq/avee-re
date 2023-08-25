package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public abstract class ec implements cn1<Bitmap> {
    public bc a;

    public ec(bc bcVar) {
        this.a = bcVar;
    }

    @Override // com.daaw.cn1
    public final z41<Bitmap> a(z41<Bitmap> z41Var, int i, int i2) {
        if (tq1.l(i, i2)) {
            Bitmap bitmap = z41Var.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap b = b(this.a, bitmap, i, i2);
            return bitmap.equals(b) ? z41Var : dc.d(b, this.a);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap b(bc bcVar, Bitmap bitmap, int i, int i2);
}
