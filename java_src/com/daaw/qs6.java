package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfts;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class qs6 implements AbstractC2527pa.InterfaceC2528a, AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final qt6 f24304a;

    /* renamed from: b */
    public final String f24305b;

    /* renamed from: c */
    public final String f24306c;

    /* renamed from: d */
    public final LinkedBlockingQueue f24307d;

    /* renamed from: e */
    public final HandlerThread f24308e;

    /* renamed from: f */
    public final es6 f24309f;

    /* renamed from: g */
    public final long f24310g;

    /* renamed from: h */
    public final int f24311h;

    public qs6(Context context, int i, int i2, String str, String str2, String str3, es6 es6Var) {
        this.f24305b = str;
        this.f24311h = i2;
        this.f24306c = str2;
        this.f24309f = es6Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f24308e = handlerThread;
        handlerThread.start();
        this.f24310g = System.currentTimeMillis();
        qt6 qt6Var = new qt6(context, handlerThread.getLooper(), this, this, 19621000);
        this.f24304a = qt6Var;
        this.f24307d = new LinkedBlockingQueue();
        qt6Var.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    public static zzfts m12232a() {
        return new zzfts(null, 1);
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
        try {
            m12228e(4011, this.f24310g, null);
            this.f24307d.put(m12232a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        try {
            m12228e(4012, this.f24310g, null);
            this.f24307d.put(m12232a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        tt6 m12229d = m12229d();
        if (m12229d != null) {
            try {
                zzfts m8824i3 = m12229d.m8824i3(new zzftq(1, this.f24311h, this.f24305b, this.f24306c));
                m12228e(5011, this.f24310g, null);
                this.f24307d.put(m8824i3);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final zzfts m12231b(int i) {
        zzfts zzftsVar;
        try {
            zzftsVar = (zzfts) this.f24307d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m12228e(2009, this.f24310g, e);
            zzftsVar = null;
        }
        m12228e(3004, this.f24310g, null);
        if (zzftsVar != null) {
            es6.m23225g(zzftsVar.f37026r == 7 ? 3 : 2);
        }
        return zzftsVar == null ? m12232a() : zzftsVar;
    }

    /* renamed from: c */
    public final void m12230c() {
        qt6 qt6Var = this.f24304a;
        if (qt6Var != null) {
            if (qt6Var.isConnected() || this.f24304a.isConnecting()) {
                this.f24304a.disconnect();
            }
        }
    }

    /* renamed from: d */
    public final tt6 m12229d() {
        try {
            return this.f24304a.m12223J();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final void m12228e(int i, long j, Exception exc) {
        this.f24309f.m23229c(i, System.currentTimeMillis() - j, exc);
    }
}
