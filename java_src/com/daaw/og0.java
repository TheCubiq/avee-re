package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class og0 extends mg0 {
    public final int p;
    public final int q;
    public boolean r;
    public int s;

    public og0(int i, int i2, int i3) {
        this.p = i3;
        this.q = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.r = z;
        this.s = z ? i : i2;
    }

    @Override // com.daaw.mg0
    public int a() {
        int i = this.s;
        if (i != this.q) {
            this.s = this.p + i;
        } else if (!this.r) {
            throw new NoSuchElementException();
        } else {
            this.r = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.r;
    }
}
