package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class u35 {
    public static final u35 h = new u35(new s35());
    public final zd3 a;
    public final wd3 b;
    public final me3 c;
    public final je3 d;
    public final sj3 e;
    public final cd1 f;
    public final cd1 g;

    public u35(s35 s35Var) {
        this.a = s35Var.a;
        this.b = s35Var.b;
        this.c = s35Var.c;
        this.f = new cd1(s35Var.f);
        this.g = new cd1(s35Var.g);
        this.d = s35Var.d;
        this.e = s35Var.e;
    }

    public final wd3 a() {
        return this.b;
    }

    public final zd3 b() {
        return this.a;
    }

    public final ce3 c(String str) {
        return (ce3) this.g.get(str);
    }

    public final fe3 d(String str) {
        return (fe3) this.f.get(str);
    }

    public final je3 e() {
        return this.d;
    }

    public final me3 f() {
        return this.c;
    }

    public final sj3 g() {
        return this.e;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (int i = 0; i < this.f.size(); i++) {
            arrayList.add((String) this.f.i(i));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
