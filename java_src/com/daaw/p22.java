package com.daaw;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class p22 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: q */
    public volatile boolean f22534q;

    /* renamed from: r */
    public final AtomicReference<i22> f22535r;

    /* renamed from: s */
    public final Handler f22536s;

    /* renamed from: t */
    public final w70 f22537t;

    public p22(pj0 pj0Var, w70 w70Var) {
        super(pj0Var);
        this.f22535r = new AtomicReference<>(null);
        this.f22536s = new q22(Looper.getMainLooper());
        this.f22537t = w70Var;
    }

    /* renamed from: p */
    public static final int m13755p(i22 i22Var) {
        if (i22Var == null) {
            return -1;
        }
        return i22Var.m20170a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo1179e(int i, int i2, Intent intent) {
        i22 i22Var = this.f22535r.get();
        if (i != 1) {
            if (i == 2) {
                int mo5491g = this.f22537t.mo5491g(m1182b());
                if (mo5491g == 0) {
                    m13756o();
                    return;
                } else if (i22Var == null) {
                    return;
                } else {
                    if (i22Var.m20169b().m1209h() == 18 && mo5491g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            m13756o();
            return;
        } else if (i2 == 0) {
            if (i22Var == null) {
                return;
            }
            m13757l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, i22Var.m20169b().toString()), m13755p(i22Var));
            return;
        }
        if (i22Var != null) {
            m13757l(i22Var.m20169b(), i22Var.m20170a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo1178f(Bundle bundle) {
        super.mo1178f(bundle);
        if (bundle != null) {
            this.f22535r.set(bundle.getBoolean("resolving_error", false) ? new i22(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo1175i(Bundle bundle) {
        super.mo1175i(bundle);
        i22 i22Var = this.f22535r.get();
        if (i22Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", i22Var.m20170a());
        bundle.putInt("failed_status", i22Var.m20169b().m1209h());
        bundle.putParcelable("failed_resolution", i22Var.m20169b().m1207s());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo1174j() {
        super.mo1174j();
        this.f22534q = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo1173k() {
        super.mo1173k();
        this.f22534q = false;
    }

    /* renamed from: l */
    public final void m13757l(ConnectionResult connectionResult, int i) {
        this.f22535r.set(null);
        mo7571m(connectionResult, i);
    }

    /* renamed from: m */
    public abstract void mo7571m(ConnectionResult connectionResult, int i);

    /* renamed from: n */
    public abstract void mo7570n();

    /* renamed from: o */
    public final void m13756o() {
        this.f22535r.set(null);
        mo7570n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m13757l(new ConnectionResult(13, null), m13755p(this.f22535r.get()));
    }

    /* renamed from: s */
    public final void m13752s(ConnectionResult connectionResult, int i) {
        i22 i22Var = new i22(connectionResult, i);
        if (this.f22535r.compareAndSet(null, i22Var)) {
            this.f22536s.post(new n22(this, i22Var));
        }
    }
}
