package com.daaw;

import android.graphics.Bitmap;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class o60 implements e51<k60> {
    public final e51<Bitmap> a;
    public final e51<s60> b;
    public String c;

    public o60(e51<Bitmap> e51Var, e51<s60> e51Var2) {
        this.a = e51Var;
        this.b = e51Var2;
    }

    @Override // com.daaw.zw
    /* renamed from: b */
    public boolean a(z41<k60> z41Var, OutputStream outputStream) {
        k60 k60Var = z41Var.get();
        z41<Bitmap> a = k60Var.a();
        return a != null ? this.a.a(a, outputStream) : this.b.a(k60Var.b(), outputStream);
    }

    @Override // com.daaw.zw
    public String getId() {
        if (this.c == null) {
            this.c = this.a.getId() + this.b.getId();
        }
        return this.c;
    }
}
