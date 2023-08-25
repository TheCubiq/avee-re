package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfts;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class qs6 implements pa.a, pa.b {
    public final qt6 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;
    public final es6 f;
    public final long g;
    public final int h;

    public qs6(Context context, int i, int i2, String str, String str2, String str3, es6 es6Var) {
        this.b = str;
        this.h = i2;
        this.c = str2;
        this.f = es6Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.e = handlerThread;
        handlerThread.start();
        this.g = System.currentTimeMillis();
        qt6 qt6Var = new qt6(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = qt6Var;
        this.d = new LinkedBlockingQueue();
        qt6Var.checkAvailabilityAndConnect();
    }

    public static zzfts a() {
        return new zzfts(null, 1);
    }

    @Override // com.daaw.pa.a
    public final void D(int i) {
        try {
            e(4011, this.g, null);
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        try {
            e(4012, this.g, null);
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        tt6 d = d();
        if (d != null) {
            try {
                zzfts i3 = d.i3(new zzftq(1, this.h, this.b, this.c));
                e(5011, this.g, null);
                this.d.put(i3);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final zzfts b(int i) {
        zzfts zzftsVar;
        try {
            zzftsVar = (zzfts) this.d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e(2009, this.g, e);
            zzftsVar = null;
        }
        e(3004, this.g, null);
        if (zzftsVar != null) {
            es6.g(zzftsVar.r == 7 ? 3 : 2);
        }
        return zzftsVar == null ? a() : zzftsVar;
    }

    public final void c() {
        qt6 qt6Var = this.a;
        if (qt6Var != null) {
            if (qt6Var.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
        }
    }

    public final tt6 d() {
        try {
            return this.a.J();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void e(int i, long j, Exception exc) {
        this.f.c(i, System.currentTimeMillis() - j, exc);
    }
}
