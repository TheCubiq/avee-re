package com.daaw;

import com.daaw.us1;
/* loaded from: classes.dex */
public class vs1<R> implements g70<R> {

    /* renamed from: a */
    public final us1.InterfaceC3254a f30549a;

    /* renamed from: b */
    public f70<R> f30550b;

    public vs1(us1.InterfaceC3254a interfaceC3254a) {
        this.f30549a = interfaceC3254a;
    }

    @Override // com.daaw.g70
    /* renamed from: a */
    public f70<R> mo6821a(boolean z, boolean z2) {
        if (z || !z2) {
            return vs0.m6823c();
        }
        if (this.f30550b == null) {
            this.f30550b = new us1(this.f30549a);
        }
        return this.f30550b;
    }
}
