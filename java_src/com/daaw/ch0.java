package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ch0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ch0(int i, boolean z, int i2, int i3) {
        this(i, z, true, i2, i3);
    }

    public ch0(int i, boolean z, boolean z2, int i2, int i3) {
        this(i, z, z2, i2, i3, false);
    }

    public ch0(int i, boolean z, boolean z2, int i2, int i3, boolean z3) {
        this.d = z;
        this.e = z2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = z3;
    }

    public void a(al alVar, Object obj, l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(obj);
        arrayList2.add(l0Var);
        b(alVar, arrayList, arrayList2);
    }

    public abstract void b(al alVar, List<Object> list, List<l0> list2);

    public int c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }
}
