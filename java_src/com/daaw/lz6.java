package com.daaw;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class lz6 extends c47 {
    @CheckForNull
    public Object p;
    public int q = 2;

    @CheckForNull
    public abstract Object a();

    @CheckForNull
    public final Object b() {
        this.q = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sy6.h(this.q != 4);
        int i = this.q;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 2) {
                    this.q = 4;
                    this.p = a();
                    if (this.q != 3) {
                        this.q = 1;
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
            this.q = 2;
            Object obj = this.p;
            this.p = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
