package com.daaw;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* renamed from: com.daaw.r0 */
/* loaded from: classes.dex */
public class C2804r0 implements mj0 {

    /* renamed from: a */
    public final Set<qj0> f24680a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f24681b;

    /* renamed from: c */
    public boolean f24682c;

    @Override // com.daaw.mj0
    /* renamed from: a */
    public void mo11891a(qj0 qj0Var) {
        this.f24680a.add(qj0Var);
        if (this.f24682c) {
            qj0Var.onDestroy();
        } else if (this.f24681b) {
            qj0Var.mo3969a();
        } else {
            qj0Var.mo3966h();
        }
    }

    /* renamed from: b */
    public void m11890b() {
        this.f24682c = true;
        for (qj0 qj0Var : tq1.m8863h(this.f24680a)) {
            qj0Var.onDestroy();
        }
    }

    /* renamed from: c */
    public void m11889c() {
        this.f24681b = true;
        for (qj0 qj0Var : tq1.m8863h(this.f24680a)) {
            qj0Var.mo3969a();
        }
    }

    /* renamed from: d */
    public void m11888d() {
        this.f24681b = false;
        for (qj0 qj0Var : tq1.m8863h(this.f24680a)) {
            qj0Var.mo3966h();
        }
    }
}
