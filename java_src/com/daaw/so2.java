package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class so2 implements Iterator {
    public int p = 0;
    public final /* synthetic */ wp2 q;

    public so2(wp2 wp2Var) {
        this.q = wp2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.p;
        str = this.q.p;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.p;
        wp2 wp2Var = this.q;
        str = wp2Var.p;
        if (i < str.length()) {
            str2 = wp2Var.p;
            this.p = i + 1;
            return new wp2(String.valueOf(str2.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
