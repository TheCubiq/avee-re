package com.daaw;

import android.graphics.Bitmap;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class o60 implements e51<k60> {

    /* renamed from: a */
    public final e51<Bitmap> f21074a;

    /* renamed from: b */
    public final e51<s60> f21075b;

    /* renamed from: c */
    public String f21076c;

    public o60(e51<Bitmap> e51Var, e51<s60> e51Var2) {
        this.f21074a = e51Var;
        this.f21075b = e51Var2;
    }

    @Override // com.daaw.InterfaceC3911zw
    /* renamed from: b */
    public boolean mo1827a(z41<k60> z41Var, OutputStream outputStream) {
        k60 k60Var = z41Var.get();
        z41<Bitmap> m18035a = k60Var.m18035a();
        return m18035a != null ? this.f21074a.mo1827a(m18035a, outputStream) : this.f21075b.mo1827a(k60Var.m18034b(), outputStream);
    }

    @Override // com.daaw.InterfaceC3911zw
    public String getId() {
        if (this.f21076c == null) {
            this.f21076c = this.f21074a.getId() + this.f21075b.getId();
        }
        return this.f21076c;
    }
}
