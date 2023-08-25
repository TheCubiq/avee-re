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
    public static final WeakHashMap t0 = new WeakHashMap();
    public final Map q0 = Collections.synchronizedMap(new g6());
    public int r0 = 0;
    public Bundle s0;

    public static cl4 I1(p30 p30Var) {
        cl4 cl4Var;
        WeakHashMap weakHashMap = t0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(p30Var);
        if (weakReference == null || (cl4Var = (cl4) weakReference.get()) == null) {
            try {
                cl4 cl4Var2 = (cl4) p30Var.x().h0("SupportLifecycleFragmentImpl");
                if (cl4Var2 == null || cl4Var2.e0()) {
                    cl4Var2 = new cl4();
                    p30Var.x().l().d(cl4Var2, "SupportLifecycleFragmentImpl").g();
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
    public final void J0() {
        super.J0();
        this.r0 = 3;
        for (LifecycleCallback lifecycleCallback : this.q0.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void K0(Bundle bundle) {
        super.K0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.q0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void L0() {
        super.L0();
        this.r0 = 2;
        for (LifecycleCallback lifecycleCallback : this.q0.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M0() {
        super.M0();
        this.r0 = 4;
        for (LifecycleCallback lifecycleCallback : this.q0.values()) {
            lifecycleCallback.k();
        }
    }

    @Override // com.daaw.pj0
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.q0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.q0.put(str, lifecycleCallback);
        if (this.r0 > 0) {
            new a38(Looper.getMainLooper()).post(new ds3(this, lifecycleCallback, str));
        }
    }

    @Override // com.daaw.pj0
    public final <T extends LifecycleCallback> T e(String str, Class<T> cls) {
        return cls.cast(this.q0.get(str));
    }

    @Override // com.daaw.pj0
    public final /* synthetic */ Activity f() {
        return n();
    }

    @Override // androidx.fragment.app.Fragment
    public final void j0(int i, int i2, Intent intent) {
        super.j0(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.q0.values()) {
            lifecycleCallback.e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.k(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.q0.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void o0(Bundle bundle) {
        super.o0(bundle);
        this.r0 = 1;
        this.s0 = bundle;
        for (Map.Entry entry : this.q0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void t0() {
        super.t0();
        this.r0 = 5;
        for (LifecycleCallback lifecycleCallback : this.q0.values()) {
            lifecycleCallback.g();
        }
    }
}
