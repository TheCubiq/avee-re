package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class hr6 {
    public final nq6 a;
    public final ArrayList b;

    public hr6(nq6 nq6Var, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = nq6Var;
        arrayList.add(str);
    }

    public final nq6 a() {
        return this.a;
    }

    public final ArrayList b() {
        return this.b;
    }

    public final void c(String str) {
        this.b.add(str);
    }
}
