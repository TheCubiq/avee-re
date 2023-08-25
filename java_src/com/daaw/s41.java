package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import java.util.HashSet;
@TargetApi(11)
/* loaded from: classes.dex */
public class s41 extends Fragment {

    /* renamed from: p */
    public final C2804r0 f25850p;

    /* renamed from: q */
    public final u41 f25851q;

    /* renamed from: r */
    public r41 f25852r;

    /* renamed from: s */
    public final HashSet<s41> f25853s;

    /* renamed from: t */
    public s41 f25854t;

    /* renamed from: com.daaw.s41$b */
    /* loaded from: classes.dex */
    public class C2912b implements u41 {
        public C2912b() {
        }
    }

    public s41() {
        this(new C2804r0());
    }

    @SuppressLint({"ValidFragment"})
    public s41(C2804r0 c2804r0) {
        this.f25851q = new C2912b();
        this.f25853s = new HashSet<>();
        this.f25850p = c2804r0;
    }

    /* renamed from: a */
    public final void m10725a(s41 s41Var) {
        this.f25853s.add(s41Var);
    }

    /* renamed from: b */
    public C2804r0 m10724b() {
        return this.f25850p;
    }

    /* renamed from: c */
    public r41 m10723c() {
        return this.f25852r;
    }

    /* renamed from: d */
    public u41 m10722d() {
        return this.f25851q;
    }

    /* renamed from: e */
    public final void m10721e(s41 s41Var) {
        this.f25853s.remove(s41Var);
    }

    /* renamed from: f */
    public void m10720f(r41 r41Var) {
        this.f25852r = r41Var;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            s41 m9533h = t41.m9535f().m9533h(getActivity().getFragmentManager());
            this.f25854t = m9533h;
            if (m9533h != this) {
                m9533h.m10725a(this);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f25850p.m11890b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        s41 s41Var = this.f25854t;
        if (s41Var != null) {
            s41Var.m10721e(this);
            this.f25854t = null;
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        r41 r41Var = this.f25852r;
        if (r41Var != null) {
            r41Var.m11768w();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f25850p.m11889c();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f25850p.m11888d();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        r41 r41Var = this.f25852r;
        if (r41Var != null) {
            r41Var.m11767x(i);
        }
    }
}
