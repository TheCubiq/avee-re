package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class nn2 implements Iterator {

    /* renamed from: p */
    public int f20323p = 0;

    /* renamed from: q */
    public final /* synthetic */ wp2 f20324q;

    public nn2(wp2 wp2Var) {
        this.f20324q = wp2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f20323p;
        str = this.f20324q.f31435p;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i = this.f20323p;
        str = this.f20324q.f31435p;
        if (i < str.length()) {
            this.f20323p = i + 1;
            return new wp2(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
