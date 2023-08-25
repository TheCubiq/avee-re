package com.daaw;
/* loaded from: classes.dex */
public final class m37 extends y17 {
    public static final y17 t = new m37(new Object[0], 0);
    public final transient Object[] r;
    public final transient int s;

    public m37(Object[] objArr, int i) {
        this.r = objArr;
        this.s = i;
    }

    @Override // com.daaw.y17, com.daaw.t17
    public final int d(Object[] objArr, int i) {
        System.arraycopy(this.r, 0, objArr, i, this.s);
        return i + this.s;
    }

    @Override // com.daaw.t17
    public final int e() {
        return this.s;
    }

    @Override // com.daaw.t17
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy6.a(i, this.s, "index");
        Object obj = this.r[i];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.t17
    public final boolean k() {
        return false;
    }

    @Override // com.daaw.t17
    public final Object[] m() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }
}
