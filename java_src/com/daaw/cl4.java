package com.daaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class cl4 extends Fragment implements pj0 {

    /* renamed from: t0 */
    public static final WeakHashMap f5940t0 = new WeakHashMap();

    /* renamed from: q0 */
    public final Map f5941q0 = Collections.synchronizedMap(new C1370g6());

    /* renamed from: r0 */
    public int f5942r0 = 0;

    /* renamed from: s0 */
    public Bundle f5943s0;

    /* renamed from: I1 */
    public static cl4 m25246I1(p30 p30Var) {
        cl4 cl4Var;
        WeakHashMap weakHashMap = f5940t0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(p30Var);
        if (weakReference == null || (cl4Var = (cl4) weakReference.get()) == null) {
            try {
                cl4 cl4Var2 = (cl4) p30Var.m13655x().m29316h0("SupportLifecycleFragmentImpl");
                if (cl4Var2 == null || cl4Var2.m29442e0()) {
                    cl4Var2 = new cl4();
                    p30Var.m13655x().m29305l().m29149d(cl4Var2, "SupportLifecycleFragmentImpl").mo29146g();
                }
                weakHashMap.put(p30Var, new WeakReference(cl4Var2));
                return cl4Var2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return cl4Var;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: J0 */
    public final void mo25245J0() {
        super.mo25245J0();
        this.f5942r0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f5941q0.values()) {
            lifecycleCallback.mo1176h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: K0 */
    public final void mo549K0(Bundle bundle) {
        super.mo549K0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f5941q0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo1175i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L0 */
    public final void mo548L0() {
        super.mo548L0();
        this.f5942r0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f5941q0.values()) {
            lifecycleCallback.mo1174j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: M0 */
    public final void mo547M0() {
        super.mo547M0();
        this.f5942r0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f5941q0.values()) {
            lifecycleCallback.mo1173k();
        }
    }

    @Override // com.daaw.pj0
    /* renamed from: b */
    public final void mo13333b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f5941q0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f5941q0.put(str, lifecycleCallback);
        if (this.f5942r0 > 0) {
            new a38(Looper.getMainLooper()).post(new ds3(this, lifecycleCallback, str));
        }
    }

    @Override // com.daaw.pj0
    /* renamed from: e */
    public final <T extends LifecycleCallback> T mo13332e(String str, Class<T> cls) {
        return cls.cast(this.f5941q0.get(str));
    }

    @Override // com.daaw.pj0
    /* renamed from: f */
    public final /* synthetic */ Activity mo13331f() {
        return m29424n();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j0 */
    public final void mo25244j0(int i, int i2, Intent intent) {
        super.mo25244j0(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f5941q0.values()) {
            lifecycleCallback.mo1179e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k */
    public final void mo25243k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo25243k(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f5941q0.values()) {
            lifecycleCallback.m1183a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: o0 */
    public final void mo526o0(Bundle bundle) {
        super.mo526o0(bundle);
        this.f5942r0 = 1;
        this.f5943s0 = bundle;
        for (Map.Entry entry : this.f5941q0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo1178f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public final void mo19773t0() {
        super.mo19773t0();
        this.f5942r0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f5941q0.values()) {
            lifecycleCallback.m1177g();
        }
    }
}
