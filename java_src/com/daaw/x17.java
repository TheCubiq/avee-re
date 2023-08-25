package com.daaw;

import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class x17 extends y17 {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ y17 t;

    public x17(y17 y17Var, int i, int i2) {
        this.t = y17Var;
        this.r = i;
        this.s = i2;
    }

    @Override // com.daaw.t17
    public final int e() {
        return this.t.f() + this.r + this.s;
    }

    @Override // com.daaw.t17
    public final int f() {
        return this.t.f() + this.r;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy6.a(i, this.s, "index");
        return this.t.get(i + this.r);
    }

    @Override // com.daaw.t17
    public final boolean k() {
        return true;
    }

    @Override // com.daaw.t17
    @CheckForNull
    public final Object[] m() {
        return this.t.m();
    }

    @Override // com.daaw.y17
    public final y17 n(int i, int i2) {
        sy6.g(i, i2, this.s);
        y17 y17Var = this.t;
        int i3 = this.r;
        return y17Var.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // com.daaw.y17, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
