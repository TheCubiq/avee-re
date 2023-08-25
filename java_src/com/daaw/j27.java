package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class j27 extends c47 {

    /* renamed from: p */
    public boolean f14188p;

    /* renamed from: q */
    public final /* synthetic */ Object f14189q;

    public j27(Object obj) {
        this.f14189q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14188p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14188p) {
            throw new NoSuchElementException();
        }
        this.f14188p = true;
        return this.f14189q;
    }
}
