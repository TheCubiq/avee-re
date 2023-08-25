package com.daaw;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c;
/* loaded from: classes.dex */
public class c40 implements w80, m81, nt1 {
    public final Fragment p;
    public final mt1 q;
    public androidx.lifecycle.e r = null;
    public l81 s = null;

    public c40(Fragment fragment, mt1 mt1Var) {
        this.p = fragment;
        this.q = mt1Var;
    }

    @Override // com.daaw.sj0
    public androidx.lifecycle.c a() {
        e();
        return this.r;
    }

    public void b(c.b bVar) {
        this.r.h(bVar);
    }

    @Override // com.daaw.w80
    public /* synthetic */ hn d() {
        return v80.a(this);
    }

    public void e() {
        if (this.r == null) {
            this.r = new androidx.lifecycle.e(this);
            this.s = l81.a(this);
        }
    }

    public boolean f() {
        return this.r != null;
    }

    @Override // com.daaw.nt1
    public mt1 g() {
        e();
        return this.q;
    }

    public void h(Bundle bundle) {
        this.s.d(bundle);
    }

    @Override // com.daaw.m81
    public k81 i() {
        e();
        return this.s.b();
    }

    public void j(Bundle bundle) {
        this.s.e(bundle);
    }

    public void k(c.EnumC0020c enumC0020c) {
        this.r.o(enumC0020c);
    }
}
