package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.ft */
/* loaded from: classes.dex */
public class C1325ft implements InterfaceC3891zs {

    /* renamed from: d */
    public kx1 f9865d;

    /* renamed from: f */
    public int f9867f;

    /* renamed from: g */
    public int f9868g;

    /* renamed from: a */
    public InterfaceC3891zs f9862a = null;

    /* renamed from: b */
    public boolean f9863b = false;

    /* renamed from: c */
    public boolean f9864c = false;

    /* renamed from: e */
    public EnumC1326a f9866e = EnumC1326a.UNKNOWN;

    /* renamed from: h */
    public int f9869h = 1;

    /* renamed from: i */
    public C2587pt f9870i = null;

    /* renamed from: j */
    public boolean f9871j = false;

    /* renamed from: k */
    public List<InterfaceC3891zs> f9872k = new ArrayList();

    /* renamed from: l */
    public List<C1325ft> f9873l = new ArrayList();

    /* renamed from: com.daaw.ft$a */
    /* loaded from: classes.dex */
    public enum EnumC1326a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C1325ft(kx1 kx1Var) {
        this.f9865d = kx1Var;
    }

    @Override // com.daaw.InterfaceC3891zs
    /* renamed from: a */
    public void mo1956a(InterfaceC3891zs interfaceC3891zs) {
        for (C1325ft c1325ft : this.f9873l) {
            if (!c1325ft.f9871j) {
                return;
            }
        }
        this.f9864c = true;
        InterfaceC3891zs interfaceC3891zs2 = this.f9862a;
        if (interfaceC3891zs2 != null) {
            interfaceC3891zs2.mo1956a(this);
        }
        if (this.f9863b) {
            this.f9865d.mo1956a(this);
            return;
        }
        C1325ft c1325ft2 = null;
        int i = 0;
        for (C1325ft c1325ft3 : this.f9873l) {
            if (!(c1325ft3 instanceof C2587pt)) {
                i++;
                c1325ft2 = c1325ft3;
            }
        }
        if (c1325ft2 != null && i == 1 && c1325ft2.f9871j) {
            C2587pt c2587pt = this.f9870i;
            if (c2587pt != null) {
                if (!c2587pt.f9871j) {
                    return;
                }
                this.f9867f = this.f9869h * c2587pt.f9868g;
            }
            mo13161d(c1325ft2.f9868g + this.f9867f);
        }
        InterfaceC3891zs interfaceC3891zs3 = this.f9862a;
        if (interfaceC3891zs3 != null) {
            interfaceC3891zs3.mo1956a(this);
        }
    }

    /* renamed from: b */
    public void m22311b(InterfaceC3891zs interfaceC3891zs) {
        this.f9872k.add(interfaceC3891zs);
        if (this.f9871j) {
            interfaceC3891zs.mo1956a(interfaceC3891zs);
        }
    }

    /* renamed from: c */
    public void m22310c() {
        this.f9873l.clear();
        this.f9872k.clear();
        this.f9871j = false;
        this.f9868g = 0;
        this.f9864c = false;
        this.f9863b = false;
    }

    /* renamed from: d */
    public void mo13161d(int i) {
        if (this.f9871j) {
            return;
        }
        this.f9871j = true;
        this.f9868g = i;
        for (InterfaceC3891zs interfaceC3891zs : this.f9872k) {
            interfaceC3891zs.mo1956a(interfaceC3891zs);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9865d.f16805b.m12411p());
        sb.append(":");
        sb.append(this.f9866e);
        sb.append("(");
        sb.append(this.f9871j ? Integer.valueOf(this.f9868g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9873l.size());
        sb.append(":d=");
        sb.append(this.f9872k.size());
        sb.append(">");
        return sb.toString();
    }
}
