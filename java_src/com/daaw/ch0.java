package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ch0 {

    /* renamed from: a */
    public final int f5804a;

    /* renamed from: b */
    public final int f5805b;

    /* renamed from: c */
    public final int f5806c;

    /* renamed from: d */
    public final boolean f5807d;

    /* renamed from: e */
    public final boolean f5808e;

    /* renamed from: f */
    public final boolean f5809f;

    public ch0(int i, boolean z, int i2, int i3) {
        this(i, z, true, i2, i3);
    }

    public ch0(int i, boolean z, boolean z2, int i2, int i3) {
        this(i, z, z2, i2, i3, false);
    }

    public ch0(int i, boolean z, boolean z2, int i2, int i3, boolean z3) {
        this.f5807d = z;
        this.f5808e = z2;
        this.f5804a = i;
        this.f5805b = i2;
        this.f5806c = i3;
        this.f5809f = z3;
    }

    /* renamed from: a */
    public void m25385a(C0645al c0645al, Object obj, AbstractC2004l0 abstractC2004l0) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(obj);
        arrayList2.add(abstractC2004l0);
        mo8957b(c0645al, arrayList, arrayList2);
    }

    /* renamed from: b */
    public abstract void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2);

    /* renamed from: c */
    public int m25384c() {
        return this.f5804a;
    }

    /* renamed from: d */
    public int m25383d() {
        return this.f5806c;
    }

    /* renamed from: e */
    public boolean mo22639e() {
        return true;
    }

    /* renamed from: f */
    public boolean m25382f() {
        return this.f5807d;
    }

    /* renamed from: g */
    public boolean m25381g() {
        return this.f5808e;
    }

    /* renamed from: h */
    public boolean m25380h() {
        return this.f5809f;
    }
}
