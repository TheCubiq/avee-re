package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class kf0 implements InterfaceC3911zw<jf0> {

    /* renamed from: a */
    public final InterfaceC3911zw<InputStream> f16331a;

    /* renamed from: b */
    public final InterfaceC3911zw<ParcelFileDescriptor> f16332b;

    /* renamed from: c */
    public String f16333c;

    public kf0(InterfaceC3911zw<InputStream> interfaceC3911zw, InterfaceC3911zw<ParcelFileDescriptor> interfaceC3911zw2) {
        this.f16331a = interfaceC3911zw;
        this.f16332b = interfaceC3911zw2;
    }

    @Override // com.daaw.InterfaceC3911zw
    /* renamed from: b */
    public boolean mo1827a(jf0 jf0Var, OutputStream outputStream) {
        InterfaceC3911zw interfaceC3911zw;
        Closeable m18541a;
        if (jf0Var.m18540b() != null) {
            interfaceC3911zw = this.f16331a;
            m18541a = jf0Var.m18540b();
        } else {
            interfaceC3911zw = this.f16332b;
            m18541a = jf0Var.m18541a();
        }
        return interfaceC3911zw.mo1827a(m18541a, outputStream);
    }

    @Override // com.daaw.InterfaceC3911zw
    public String getId() {
        if (this.f16333c == null) {
            this.f16333c = this.f16331a.getId() + this.f16332b.getId();
        }
        return this.f16333c;
    }
}
