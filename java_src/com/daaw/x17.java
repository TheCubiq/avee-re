package com.daaw;

import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class x17 extends y17 {

    /* renamed from: r */
    public final transient int f31735r;

    /* renamed from: s */
    public final transient int f31736s;

    /* renamed from: t */
    public final /* synthetic */ y17 f31737t;

    public x17(y17 y17Var, int i, int i2) {
        this.f31737t = y17Var;
        this.f31735r = i;
        this.f31736s = i2;
    }

    @Override // com.daaw.t17
    /* renamed from: e */
    public final int mo5648e() {
        return this.f31737t.mo5647f() + this.f31735r + this.f31736s;
    }

    @Override // com.daaw.t17
    /* renamed from: f */
    public final int mo5647f() {
        return this.f31737t.mo5647f() + this.f31735r;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy6.m9708a(i, this.f31736s, "index");
        return this.f31737t.get(i + this.f31735r);
    }

    @Override // com.daaw.t17
    /* renamed from: k */
    public final boolean mo5646k() {
        return true;
    }

    @Override // com.daaw.t17
    @CheckForNull
    /* renamed from: m */
    public final Object[] mo5645m() {
        return this.f31737t.mo5645m();
    }

    @Override // com.daaw.y17
    /* renamed from: n */
    public final y17 mo4267n(int i, int i2) {
        sy6.m9702g(i, i2, this.f31736s);
        y17 y17Var = this.f31737t;
        int i3 = this.f31735r;
        return y17Var.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31736s;
    }

    @Override // com.daaw.y17, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
