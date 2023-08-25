package com.daaw;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class r0 implements mj0 {
    public final Set<qj0> a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;
    public boolean c;

    @Override // com.daaw.mj0
    public void a(qj0 qj0Var) {
        this.a.add(qj0Var);
        if (this.c) {
            qj0Var.onDestroy();
        } else if (this.b) {
            qj0Var.a();
        } else {
            qj0Var.h();
        }
    }

    public void b() {
        this.c = true;
        for (qj0 qj0Var : tq1.h(this.a)) {
            qj0Var.onDestroy();
        }
    }

    public void c() {
        this.b = true;
        for (qj0 qj0Var : tq1.h(this.a)) {
            qj0Var.a();
        }
    }

    public void d() {
        this.b = false;
        for (qj0 qj0Var : tq1.h(this.a)) {
            qj0Var.h();
        }
    }
}
