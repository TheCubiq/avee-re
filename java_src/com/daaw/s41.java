package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import java.util.HashSet;
@TargetApi(11)
/* loaded from: classes.dex */
public class s41 extends Fragment {
    public final r0 p;
    public final u41 q;
    public r41 r;
    public final HashSet<s41> s;
    public s41 t;

    /* loaded from: classes.dex */
    public class b implements u41 {
        public b() {
        }
    }

    public s41() {
        this(new r0());
    }

    @SuppressLint({"ValidFragment"})
    public s41(r0 r0Var) {
        this.q = new b();
        this.s = new HashSet<>();
        this.p = r0Var;
    }

    public final void a(s41 s41Var) {
        this.s.add(s41Var);
    }

    public r0 b() {
        return this.p;
    }

    public r41 c() {
        return this.r;
    }

    public u41 d() {
        return this.q;
    }

    public final void e(s41 s41Var) {
        this.s.remove(s41Var);
    }

    public void f(r41 r41Var) {
        this.r = r41Var;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            s41 h = t41.f().h(getActivity().getFragmentManager());
            this.t = h;
            if (h != this) {
                h.a(this);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.p.b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        s41 s41Var = this.t;
        if (s41Var != null) {
            s41Var.e(this);
            this.t = null;
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        r41 r41Var = this.r;
        if (r41Var != null) {
            r41Var.w();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.p.c();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.p.d();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        r41 r41Var = this.r;
        if (r41Var != null) {
            r41Var.x(i);
        }
    }
}
