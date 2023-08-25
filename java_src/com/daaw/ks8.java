package com.daaw;

import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class ks8 extends rt8 {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ rt8 t;

    public ks8(rt8 rt8Var, int i, int i2) {
        this.t = rt8Var;
        this.r = i;
        this.s = i2;
    }

    @Override // com.daaw.aq8
    public final int e() {
        return this.t.f() + this.r + this.s;
    }

    @Override // com.daaw.aq8
    public final int f() {
        return this.t.f() + this.r;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jf8.a(i, this.s, "index");
        return this.t.get(i + this.r);
    }

    @Override // com.daaw.aq8
    public final boolean k() {
        return true;
    }

    @Override // com.daaw.aq8
    @CheckForNull
    public final Object[] m() {
        return this.t.m();
    }

    @Override // com.daaw.rt8
    public final rt8 n(int i, int i2) {
        jf8.d(i, i2, this.s);
        rt8 rt8Var = this.t;
        int i3 = this.r;
        return rt8Var.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // com.daaw.rt8, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
