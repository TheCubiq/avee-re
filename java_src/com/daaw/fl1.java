package com.daaw;
/* loaded from: classes2.dex */
public final class fl1 {

    /* renamed from: a */
    public final InterfaceC2307nl f9658a;

    /* renamed from: b */
    public final Object[] f9659b;

    /* renamed from: c */
    public final al1<Object>[] f9660c;

    /* renamed from: d */
    public int f9661d;

    public fl1(InterfaceC2307nl interfaceC2307nl, int i) {
        this.f9658a = interfaceC2307nl;
        this.f9659b = new Object[i];
        this.f9660c = new al1[i];
    }

    /* renamed from: a */
    public final void m22507a(al1<?> al1Var, Object obj) {
        Object[] objArr = this.f9659b;
        int i = this.f9661d;
        objArr[i] = obj;
        al1<Object>[] al1VarArr = this.f9660c;
        this.f9661d = i + 1;
        al1VarArr[i] = al1Var;
    }

    /* renamed from: b */
    public final void m22506b(InterfaceC2307nl interfaceC2307nl) {
        int length = this.f9660c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            al1<Object> al1Var = this.f9660c[length];
            ug0.m8271c(al1Var);
            al1Var.m27358u(interfaceC2307nl, this.f9659b[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
