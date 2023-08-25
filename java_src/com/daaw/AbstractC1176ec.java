package com.daaw;

import android.graphics.Bitmap;
/* renamed from: com.daaw.ec */
/* loaded from: classes.dex */
public abstract class AbstractC1176ec implements cn1<Bitmap> {

    /* renamed from: a */
    public InterfaceC0832bc f8325a;

    public AbstractC1176ec(InterfaceC0832bc interfaceC0832bc) {
        this.f8325a = interfaceC0832bc;
    }

    @Override // com.daaw.cn1
    /* renamed from: a */
    public final z41<Bitmap> mo7395a(z41<Bitmap> z41Var, int i, int i2) {
        if (tq1.m8859l(i, i2)) {
            Bitmap bitmap = z41Var.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap mo13431b = mo13431b(this.f8325a, bitmap, i, i2);
            return bitmap.equals(mo13431b) ? z41Var : C1073dc.m24559d(mo13431b, this.f8325a);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: b */
    public abstract Bitmap mo13431b(InterfaceC0832bc interfaceC0832bc, Bitmap bitmap, int i, int i2);
}
