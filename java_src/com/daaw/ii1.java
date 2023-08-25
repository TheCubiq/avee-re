package com.daaw;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
/* loaded from: classes.dex */
public class ii1 extends Fragment {

    /* renamed from: q0 */
    public r41 f13659q0;

    /* renamed from: r0 */
    public final C2804r0 f13660r0;

    /* renamed from: s0 */
    public final u41 f13661s0;

    /* renamed from: t0 */
    public final HashSet<ii1> f13662t0;

    /* renamed from: u0 */
    public ii1 f13663u0;

    /* renamed from: com.daaw.ii1$b */
    /* loaded from: classes.dex */
    public class C1711b implements u41 {
        public C1711b() {
        }
    }

    public ii1() {
        this(new C2804r0());
    }

    @SuppressLint({"ValidFragment"})
    public ii1(C2804r0 c2804r0) {
        this.f13661s0 = new C1711b();
        this.f13662t0 = new HashSet<>();
        this.f13660r0 = c2804r0;
    }

    /* renamed from: G1 */
    public final void m19780G1(ii1 ii1Var) {
        this.f13662t0.add(ii1Var);
    }

    /* renamed from: H1 */
    public C2804r0 m19779H1() {
        return this.f13660r0;
    }

    /* renamed from: I1 */
    public r41 m19778I1() {
        return this.f13659q0;
    }

    /* renamed from: J1 */
    public u41 m19777J1() {
        return this.f13661s0;
    }

    /* renamed from: K1 */
    public final void m19776K1(ii1 ii1Var) {
        this.f13662t0.remove(ii1Var);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L0 */
    public void mo548L0() {
        super.mo548L0();
        this.f13660r0.m11889c();
    }

    /* renamed from: L1 */
    public void m19775L1(r41 r41Var) {
        this.f13659q0 = r41Var;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: M0 */
    public void mo547M0() {
        super.mo547M0();
        this.f13660r0.m11888d();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k0 */
    public void mo19774k0(Activity activity) {
        super.mo19774k0(activity);
        try {
            ii1 m9532i = t41.m9535f().m9532i(m29424n().m13655x());
            this.f13663u0 = m9532i;
            if (m9532i != this) {
                m9532i.m19780G1(this);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        r41 r41Var = this.f13659q0;
        if (r41Var != null) {
            r41Var.m11768w();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo19773t0() {
        super.mo19773t0();
        this.f13660r0.m11890b();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo13984w0() {
        super.mo13984w0();
        ii1 ii1Var = this.f13663u0;
        if (ii1Var != null) {
            ii1Var.m19776K1(this);
            this.f13663u0 = null;
        }
    }
}
