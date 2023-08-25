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
    public volatile boolean q;
    public final AtomicReference<i22> r;
    public final Handler s;
    public final w70 t;

    public p22(pj0 pj0Var, w70 w70Var) {
        super(pj0Var);
        this.r = new AtomicReference<>(null);
        this.s = new q22(Looper.getMainLooper());
        this.t = w70Var;
    }

    public static final int p(i22 i22Var) {
        if (i22Var == null) {
            return -1;
        }
        return i22Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i, int i2, Intent intent) {
        i22 i22Var = this.r.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.t.g(b());
                if (g == 0) {
                    o();
                    return;
                } else if (i22Var == null) {
                    return;
                } else {
                    if (i22Var.b().h() == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            o();
            return;
        } else if (i2 == 0) {
            if (i22Var == null) {
                return;
            }
            l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, i22Var.b().toString()), p(i22Var));
            return;
        }
        if (i22Var != null) {
            l(i22Var.b(), i22Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.r.set(bundle.getBoolean("resolving_error", false) ? new i22(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        i22 i22Var = this.r.get();
        if (i22Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", i22Var.a());
        bundle.putInt("failed_status", i22Var.b().h());
        bundle.putParcelable("failed_resolution", i22Var.b().s());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.q = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.q = false;
    }

    public final void l(ConnectionResult connectionResult, int i) {
        this.r.set(null);
        m(connectionResult, i);
    }

    public abstract void m(ConnectionResult connectionResult, int i);

    public abstract void n();

    public final void o() {
        this.r.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p(this.r.get()));
    }

    public final void s(ConnectionResult connectionResult, int i) {
        i22 i22Var = new i22(connectionResult, i);
        if (this.r.compareAndSet(null, i22Var)) {
            this.s.post(new n22(this, i22Var));
        }
    }
}
