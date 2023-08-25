package com.daaw;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class lz6 extends c47 {
    @CheckForNull

    /* renamed from: p */
    public Object f17927p;

    /* renamed from: q */
    public int f17928q = 2;

    @CheckForNull
    /* renamed from: a */
    public abstract Object mo16353a();

    @CheckForNull
    /* renamed from: b */
    public final Object m16352b() {
        this.f17928q = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sy6.m9701h(this.f17928q != 4);
        int i = this.f17928q;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 2) {
                    this.f17928q = 4;
                    this.f17927p = mo16353a();
                    if (this.f17928q != 3) {
                        this.f17928q = 1;
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f17928q = 2;
            Object obj = this.f17927p;
            this.f17927p = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
