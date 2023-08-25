package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class u35 {

    /* renamed from: h */
    public static final u35 f28511h = new u35(new s35());

    /* renamed from: a */
    public final zd3 f28512a;

    /* renamed from: b */
    public final wd3 f28513b;

    /* renamed from: c */
    public final me3 f28514c;

    /* renamed from: d */
    public final je3 f28515d;

    /* renamed from: e */
    public final sj3 f28516e;

    /* renamed from: f */
    public final cd1 f28517f;

    /* renamed from: g */
    public final cd1 f28518g;

    public u35(s35 s35Var) {
        this.f28512a = s35Var.f25832a;
        this.f28513b = s35Var.f25833b;
        this.f28514c = s35Var.f25834c;
        this.f28517f = new cd1(s35Var.f25837f);
        this.f28518g = new cd1(s35Var.f25838g);
        this.f28515d = s35Var.f25835d;
        this.f28516e = s35Var.f25836e;
    }

    /* renamed from: a */
    public final wd3 m8602a() {
        return this.f28513b;
    }

    /* renamed from: b */
    public final zd3 m8601b() {
        return this.f28512a;
    }

    /* renamed from: c */
    public final ce3 m8600c(String str) {
        return (ce3) this.f28518g.get(str);
    }

    /* renamed from: d */
    public final fe3 m8599d(String str) {
        return (fe3) this.f28517f.get(str);
    }

    /* renamed from: e */
    public final je3 m8598e() {
        return this.f28515d;
    }

    /* renamed from: f */
    public final me3 m8597f() {
        return this.f28514c;
    }

    /* renamed from: g */
    public final sj3 m8596g() {
        return this.f28516e;
    }

    /* renamed from: h */
    public final ArrayList m8595h() {
        ArrayList arrayList = new ArrayList(this.f28517f.size());
        for (int i = 0; i < this.f28517f.size(); i++) {
            arrayList.add((String) this.f28517f.m25436i(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final ArrayList m8594i() {
        ArrayList arrayList = new ArrayList();
        if (this.f28514c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f28512a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f28513b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f28517f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f28516e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
