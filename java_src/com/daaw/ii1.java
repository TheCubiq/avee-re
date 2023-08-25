package com.daaw;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
/* loaded from: classes.dex */
public class ii1 extends Fragment {
    public r41 q0;
    public final r0 r0;
    public final u41 s0;
    public final HashSet<ii1> t0;
    public ii1 u0;

    /* loaded from: classes.dex */
    public class b implements u41 {
        public b() {
        }
    }

    public ii1() {
        this(new r0());
    }

    @SuppressLint({"ValidFragment"})
    public ii1(r0 r0Var) {
        this.s0 = new b();
        this.t0 = new HashSet<>();
        this.r0 = r0Var;
    }

    public final void G1(ii1 ii1Var) {
        this.t0.add(ii1Var);
    }

    public r0 H1() {
        return this.r0;
    }

    public r41 I1() {
        return this.q0;
    }

    public u41 J1() {
        return this.s0;
    }

    public final void K1(ii1 ii1Var) {
        this.t0.remove(ii1Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        this.r0.c();
    }

    public void L1(r41 r41Var) {
        this.q0 = r41Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void M0() {
        super.M0();
        this.r0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(Activity activity) {
        super.k0(activity);
        try {
            ii1 i = t41.f().i(n().x());
            this.u0 = i;
            if (i != this) {
                i.G1(this);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        r41 r41Var = this.q0;
        if (r41Var != null) {
            r41Var.w();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void t0() {
        super.t0();
        this.r0.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void w0() {
        super.w0();
        ii1 ii1Var = this.u0;
        if (ii1Var != null) {
            ii1Var.K1(this);
            this.u0 = null;
        }
    }
}
