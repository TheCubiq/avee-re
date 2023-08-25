package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class og0 extends mg0 {

    /* renamed from: p */
    public final int f21539p;

    /* renamed from: q */
    public final int f21540q;

    /* renamed from: r */
    public boolean f21541r;

    /* renamed from: s */
    public int f21542s;

    public og0(int i, int i2, int i3) {
        this.f21539p = i3;
        this.f21540q = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f21541r = z;
        this.f21542s = z ? i : i2;
    }

    @Override // com.daaw.mg0
    /* renamed from: a */
    public int mo14310a() {
        int i = this.f21542s;
        if (i != this.f21540q) {
            this.f21542s = this.f21539p + i;
        } else if (!this.f21541r) {
            throw new NoSuchElementException();
        } else {
            this.f21541r = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21541r;
    }
}
