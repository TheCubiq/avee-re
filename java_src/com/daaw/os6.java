package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzfth;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class os6 implements AbstractC2527pa.InterfaceC2528a, AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final qt6 f21923a;

    /* renamed from: b */
    public final String f21924b;

    /* renamed from: c */
    public final String f21925c;

    /* renamed from: d */
    public final LinkedBlockingQueue f21926d;

    /* renamed from: e */
    public final HandlerThread f21927e;

    public os6(Context context, String str, String str2) {
        this.f21924b = str;
        this.f21925c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f21927e = handlerThread;
        handlerThread.start();
        qt6 qt6Var = new qt6(context, handlerThread.getLooper(), this, this, 9200000);
        this.f21923a = qt6Var;
        this.f21926d = new LinkedBlockingQueue();
        qt6Var.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    public static fj2 m14010a() {
        hi2 m22548l0 = fj2.m22548l0();
        m22548l0.m20741v(32768L);
        return (fj2) m22548l0.m22315n();
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
        try {
            this.f21926d.put(m14010a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        try {
            this.f21926d.put(m14010a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        tt6 m14007d = m14007d();
        if (m14007d != null) {
            try {
                try {
                    this.f21926d.put(m14007d.m8825h3(new zzfth(this.f21924b, this.f21925c)).m1091h());
                } catch (Throwable unused) {
                    this.f21926d.put(m14010a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                m14008c();
                this.f21927e.quit();
                throw th;
            }
            m14008c();
            this.f21927e.quit();
        }
    }

    /* renamed from: b */
    public final fj2 m14009b(int i) {
        fj2 fj2Var;
        try {
            fj2Var = (fj2) this.f21926d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            fj2Var = null;
        }
        return fj2Var == null ? m14010a() : fj2Var;
    }

    /* renamed from: c */
    public final void m14008c() {
        qt6 qt6Var = this.f21923a;
        if (qt6Var != null) {
            if (qt6Var.isConnected() || this.f21923a.isConnecting()) {
                this.f21923a.disconnect();
            }
        }
    }

    /* renamed from: d */
    public final tt6 m14007d() {
        try {
            return this.f21923a.m12223J();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
