package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzfte;
/* loaded from: classes.dex */
public final class ts6 implements AbstractC2527pa.InterfaceC2528a, AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final qt6 f28026a;

    /* renamed from: b */
    public final lt6 f28027b;

    /* renamed from: c */
    public final Object f28028c = new Object();

    /* renamed from: d */
    public boolean f28029d = false;

    /* renamed from: e */
    public boolean f28030e = false;

    public ts6(Context context, Looper looper, lt6 lt6Var) {
        this.f28027b = lt6Var;
        this.f28026a = new qt6(context, looper, this, this, 12800000);
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        synchronized (this.f28028c) {
            if (this.f28030e) {
                return;
            }
            this.f28030e = true;
            try {
                this.f28026a.m12223J().m8823j3(new zzfte(this.f28027b.mo4516a()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                m8839b();
                throw th;
            }
            m8839b();
        }
    }

    /* renamed from: a */
    public final void m8840a() {
        synchronized (this.f28028c) {
            if (!this.f28029d) {
                this.f28029d = true;
                this.f28026a.checkAvailabilityAndConnect();
            }
        }
    }

    /* renamed from: b */
    public final void m8839b() {
        synchronized (this.f28028c) {
            if (this.f28026a.isConnected() || this.f28026a.isConnecting()) {
                this.f28026a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
