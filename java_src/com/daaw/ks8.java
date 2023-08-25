package com.daaw;

import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class ks8 extends rt8 {

    /* renamed from: r */
    public final transient int f16733r;

    /* renamed from: s */
    public final transient int f16734s;

    /* renamed from: t */
    public final /* synthetic */ rt8 f16735t;

    public ks8(rt8 rt8Var, int i, int i2) {
        this.f16735t = rt8Var;
        this.f16733r = i;
        this.f16734s = i2;
    }

    @Override // com.daaw.aq8
    /* renamed from: e */
    public final int mo9610e() {
        return this.f16735t.mo9609f() + this.f16733r + this.f16734s;
    }

    @Override // com.daaw.aq8
    /* renamed from: f */
    public final int mo9609f() {
        return this.f16735t.mo9609f() + this.f16733r;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jf8.m18536a(i, this.f16734s, "index");
        return this.f16735t.get(i + this.f16733r);
    }

    @Override // com.daaw.aq8
    /* renamed from: k */
    public final boolean mo9608k() {
        return true;
    }

    @Override // com.daaw.aq8
    @CheckForNull
    /* renamed from: m */
    public final Object[] mo9607m() {
        return this.f16735t.mo9607m();
    }

    @Override // com.daaw.rt8
    /* renamed from: n */
    public final rt8 mo10946n(int i, int i2) {
        jf8.m18533d(i, i2, this.f16734s);
        rt8 rt8Var = this.f16735t;
        int i3 = this.f16733r;
        return rt8Var.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16734s;
    }

    @Override // com.daaw.rt8, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
