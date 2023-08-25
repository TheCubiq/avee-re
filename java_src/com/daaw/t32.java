package com.daaw;
/* loaded from: classes2.dex */
public final class t32 extends rt8 {

    /* renamed from: t */
    public static final rt8 f26953t = new t32(new Object[0], 0);

    /* renamed from: r */
    public final transient Object[] f26954r;

    /* renamed from: s */
    public final transient int f26955s;

    public t32(Object[] objArr, int i) {
        this.f26954r = objArr;
        this.f26955s = i;
    }

    @Override // com.daaw.rt8, com.daaw.aq8
    /* renamed from: d */
    public final int mo9611d(Object[] objArr, int i) {
        System.arraycopy(this.f26954r, 0, objArr, 0, this.f26955s);
        return this.f26955s;
    }

    @Override // com.daaw.aq8
    /* renamed from: e */
    public final int mo9610e() {
        return this.f26955s;
    }

    @Override // com.daaw.aq8
    /* renamed from: f */
    public final int mo9609f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jf8.m18536a(i, this.f26955s, "index");
        Object obj = this.f26954r[i];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.aq8
    /* renamed from: k */
    public final boolean mo9608k() {
        return false;
    }

    @Override // com.daaw.aq8
    /* renamed from: m */
    public final Object[] mo9607m() {
        return this.f26954r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26955s;
    }
}
