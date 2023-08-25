package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzfth;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class os6 implements pa.a, pa.b {
    public final qt6 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public os6(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        qt6 qt6Var = new qt6(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = qt6Var;
        this.d = new LinkedBlockingQueue();
        qt6Var.checkAvailabilityAndConnect();
    }

    public static fj2 a() {
        hi2 l0 = fj2.l0();
        l0.v(32768L);
        return (fj2) l0.n();
    }

    @Override // com.daaw.pa.a
    public final void D(int i) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        tt6 d = d();
        if (d != null) {
            try {
                try {
                    this.d.put(d.h3(new zzfth(this.b, this.c)).h());
                } catch (Throwable unused) {
                    this.d.put(a());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                c();
                this.e.quit();
                throw th;
            }
            c();
            this.e.quit();
        }
    }

    public final fj2 b(int i) {
        fj2 fj2Var;
        try {
            fj2Var = (fj2) this.d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            fj2Var = null;
        }
        return fj2Var == null ? a() : fj2Var;
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
}
