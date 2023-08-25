package com.daaw;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class zu7 implements Iterator {

    /* renamed from: p */
    public final ArrayDeque f35555p;

    /* renamed from: q */
    public tq7 f35556q;

    public /* synthetic */ zu7(yq7 yq7Var, yu7 yu7Var) {
        tq7 tq7Var;
        yq7 yq7Var2;
        if (yq7Var instanceof bv7) {
            bv7 bv7Var = (bv7) yq7Var;
            ArrayDeque arrayDeque = new ArrayDeque(bv7Var.mo3409q());
            this.f35555p = arrayDeque;
            arrayDeque.push(bv7Var);
            yq7Var2 = bv7Var.f5215u;
            tq7Var = m1865b(yq7Var2);
        } else {
            this.f35555p = null;
            tq7Var = (tq7) yq7Var;
        }
        this.f35556q = tq7Var;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final tq7 next() {
        tq7 tq7Var;
        yq7 yq7Var;
        tq7 tq7Var2 = this.f35556q;
        if (tq7Var2 != null) {
            do {
                ArrayDeque arrayDeque = this.f35555p;
                tq7Var = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                yq7Var = ((bv7) this.f35555p.pop()).f5216v;
                tq7Var = m1865b(yq7Var);
            } while (tq7Var.m3416h());
            this.f35556q = tq7Var;
            return tq7Var2;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final tq7 m1865b(yq7 yq7Var) {
        while (yq7Var instanceof bv7) {
            bv7 bv7Var = (bv7) yq7Var;
            this.f35555p.push(bv7Var);
            yq7Var = bv7Var.f5215u;
        }
        return (tq7) yq7Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35556q != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
