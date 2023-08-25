package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class kf0 implements zw<jf0> {
    public final zw<InputStream> a;
    public final zw<ParcelFileDescriptor> b;
    public String c;

    public kf0(zw<InputStream> zwVar, zw<ParcelFileDescriptor> zwVar2) {
        this.a = zwVar;
        this.b = zwVar2;
    }

    @Override // com.daaw.zw
    /* renamed from: b */
    public boolean a(jf0 jf0Var, OutputStream outputStream) {
        zw zwVar;
        Closeable a;
        if (jf0Var.b() != null) {
            zwVar = this.a;
            a = jf0Var.b();
        } else {
            zwVar = this.b;
            a = jf0Var.a();
        }
        return zwVar.a(a, outputStream);
    }

    @Override // com.daaw.zw
    public String getId() {
        if (this.c == null) {
            this.c = this.a.getId() + this.b.getId();
        }
        return this.c;
    }
}
