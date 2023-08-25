package com.daaw;
/* loaded from: classes.dex */
public final class m37 extends y17 {

    /* renamed from: t */
    public static final y17 f18426t = new m37(new Object[0], 0);

    /* renamed from: r */
    public final transient Object[] f18427r;

    /* renamed from: s */
    public final transient int f18428s;

    public m37(Object[] objArr, int i) {
        this.f18427r = objArr;
        this.f18428s = i;
    }

    @Override // com.daaw.y17, com.daaw.t17
    /* renamed from: d */
    public final int mo2850d(Object[] objArr, int i) {
        System.arraycopy(this.f18427r, 0, objArr, i, this.f18428s);
        return i + this.f18428s;
    }

    @Override // com.daaw.t17
    /* renamed from: e */
    public final int mo5648e() {
        return this.f18428s;
    }

    @Override // com.daaw.t17
    /* renamed from: f */
    public final int mo5647f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy6.m9708a(i, this.f18428s, "index");
        Object obj = this.f18427r[i];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.t17
    /* renamed from: k */
    public final boolean mo5646k() {
        return false;
    }

    @Override // com.daaw.t17
    /* renamed from: m */
    public final Object[] mo5645m() {
        return this.f18427r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18428s;
    }
}
