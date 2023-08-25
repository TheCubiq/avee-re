package com.daaw;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class zu7 implements Iterator {
    public final ArrayDeque p;
    public tq7 q;

    public /* synthetic */ zu7(yq7 yq7Var, yu7 yu7Var) {
        tq7 tq7Var;
        yq7 yq7Var2;
        if (yq7Var instanceof bv7) {
            bv7 bv7Var = (bv7) yq7Var;
            ArrayDeque arrayDeque = new ArrayDeque(bv7Var.q());
            this.p = arrayDeque;
            arrayDeque.push(bv7Var);
            yq7Var2 = bv7Var.u;
            tq7Var = b(yq7Var2);
        } else {
            this.p = null;
            tq7Var = (tq7) yq7Var;
        }
        this.q = tq7Var;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final tq7 next() {
        tq7 tq7Var;
        yq7 yq7Var;
        tq7 tq7Var2 = this.q;
        if (tq7Var2 != null) {
            do {
                ArrayDeque arrayDeque = this.p;
                tq7Var = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                yq7Var = ((bv7) this.p.pop()).v;
                tq7Var = b(yq7Var);
            } while (tq7Var.h());
            this.q = tq7Var;
            return tq7Var2;
        }
        throw new NoSuchElementException();
    }

    public final tq7 b(yq7 yq7Var) {
        while (yq7Var instanceof bv7) {
            bv7 bv7Var = (bv7) yq7Var;
            this.p.push(bv7Var);
            yq7Var = bv7Var.u;
        }
        return (tq7) yq7Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
