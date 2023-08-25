package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class so2 implements Iterator {

    /* renamed from: p */
    public int f26448p = 0;

    /* renamed from: q */
    public final /* synthetic */ wp2 f26449q;

    public so2(wp2 wp2Var) {
        this.f26449q = wp2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f26448p;
        str = this.f26449q.f31435p;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.f26448p;
        wp2 wp2Var = this.f26449q;
        str = wp2Var.f31435p;
        if (i < str.length()) {
            str2 = wp2Var.f31435p;
            this.f26448p = i + 1;
            return new wp2(String.valueOf(str2.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
