package com.daaw;

import com.daaw.us1;
/* loaded from: classes.dex */
public class vs1<R> implements g70<R> {
    public final us1.a a;
    public f70<R> b;

    public vs1(us1.a aVar) {
        this.a = aVar;
    }

    @Override // com.daaw.g70
    public f70<R> a(boolean z, boolean z2) {
        if (z || !z2) {
            return vs0.c();
        }
        if (this.b == null) {
            this.b = new us1(this.a);
        }
        return this.b;
    }
}
