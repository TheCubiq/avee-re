package com.daaw;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class ky2 extends Fragment implements pj0 {
    public static final WeakHashMap s = new WeakHashMap();
    public final Map p = Collections.synchronizedMap(new g6());
    public int q = 0;
    public Bundle r;

    public static ky2 d(Activity activity) {
        ky2 ky2Var;
        WeakHashMap weakHashMap = s;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference == null || (ky2Var = (ky2) weakReference.get()) == null) {
            try {
                ky2 ky2Var2 = (ky2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (ky2Var2 == null || ky2Var2.isRemoving()) {
                    ky2Var2 = new ky2();
                    activity.getFragmentManager().beginTransaction().add(ky2Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(ky2Var2));
                return ky2Var2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return ky2Var;
    }

    @Override // com.daaw.pj0
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.p.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.p.put(str, lifecycleCallback);
        if (this.q > 0) {
            new a38(Looper.getMainLooper()).post(new l32(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.p.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.daaw.pj0
    public final <T extends LifecycleCallback> T e(String str, Class<T> cls) {
        return cls.cast(this.p.get(str));
    }

    @Override // com.daaw.pj0
    public final Activity f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.p.values()) {
            lifecycleCallback.e(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q = 1;
        this.r = bundle;
        for (Map.Entry entry : this.p.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.q = 5;
        for (LifecycleCallback lifecycleCallback : this.p.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.q = 3;
        for (LifecycleCallback lifecycleCallback : this.p.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.p.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.q = 2;
        for (LifecycleCallback lifecycleCallback : this.p.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.q = 4;
        for (LifecycleCallback lifecycleCallback : this.p.values()) {
            lifecycleCallback.k();
        }
    }
}
