package com.daaw;
/* loaded from: classes2.dex */
public final class t32 extends rt8 {
    public static final rt8 t = new t32(new Object[0], 0);
    public final transient Object[] r;
    public final transient int s;

    public t32(Object[] objArr, int i) {
        this.r = objArr;
        this.s = i;
    }

    @Override // com.daaw.rt8, com.daaw.aq8
    public final int d(Object[] objArr, int i) {
        System.arraycopy(this.r, 0, objArr, 0, this.s);
        return this.s;
    }

    @Override // com.daaw.aq8
    public final int e() {
        return this.s;
    }

    @Override // com.daaw.aq8
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jf8.a(i, this.s, "index");
        Object obj = this.r[i];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.aq8
    public final boolean k() {
        return false;
    }

    @Override // com.daaw.aq8
    public final Object[] m() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }
}
