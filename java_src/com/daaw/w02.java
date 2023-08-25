package com.daaw;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* loaded from: classes.dex */
public final class w02<T> implements cu0<T> {
    public final z70 a;
    public final int b;
    public final o3<?> c;
    public final long d;
    public final long e;

    public w02(z70 z70Var, int i, o3<?> o3Var, long j, long j2, String str, String str2) {
        this.a = z70Var;
        this.b = i;
        this.c = o3Var;
        this.d = j;
        this.e = j2;
    }

    public static <T> w02<T> b(z70 z70Var, int i, o3<?> o3Var) {
        boolean z;
        if (z70Var.f()) {
            RootTelemetryConfiguration a = g61.b().a();
            if (a == null) {
                z = true;
            } else if (!a.s()) {
                return null;
            } else {
                z = a.t();
                i02 w = z70Var.w(o3Var);
                if (w != null) {
                    if (!(w.s() instanceof pa)) {
                        return null;
                    }
                    pa paVar = (pa) w.s();
                    if (paVar.hasConnectionInfo() && !paVar.isConnecting()) {
                        ConnectionTelemetryConfiguration c = c(w, paVar, i);
                        if (c == null) {
                            return null;
                        }
                        w.E();
                        z = c.u();
                    }
                }
            }
            return new w02<>(z70Var, i, o3Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    public static ConnectionTelemetryConfiguration c(i02<?> i02Var, pa<?> paVar, int i) {
        int[] q;
        int[] s;
        ConnectionTelemetryConfiguration telemetryConfiguration = paVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.t() || ((q = telemetryConfiguration.q()) != null ? !k6.b(q, i) : !((s = telemetryConfiguration.s()) == null || !k6.b(s, i))) || i02Var.p() >= telemetryConfiguration.h()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.daaw.cu0
    public final void a(rj1<T> rj1Var) {
        i02 w;
        int i;
        int i2;
        int i3;
        int i4;
        int h;
        long j;
        long j2;
        int i5;
        if (this.a.f()) {
            RootTelemetryConfiguration a = g61.b().a();
            if ((a == null || a.s()) && (w = this.a.w(this.c)) != null && (w.s() instanceof pa)) {
                pa paVar = (pa) w.s();
                boolean z = true;
                boolean z2 = this.d > 0;
                int gCoreServiceId = paVar.getGCoreServiceId();
                if (a != null) {
                    z2 &= a.t();
                    int h2 = a.h();
                    int q = a.q();
                    i = a.u();
                    if (paVar.hasConnectionInfo() && !paVar.isConnecting()) {
                        ConnectionTelemetryConfiguration c = c(w, paVar, this.b);
                        if (c == null) {
                            return;
                        }
                        z = (!c.u() || this.d <= 0) ? false : false;
                        q = c.h();
                        z2 = z;
                    }
                    i2 = h2;
                    i3 = q;
                } else {
                    i = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                z70 z70Var = this.a;
                if (rj1Var.n()) {
                    i4 = 0;
                    h = 0;
                } else {
                    if (rj1Var.l()) {
                        i4 = 100;
                    } else {
                        Exception j3 = rj1Var.j();
                        if (j3 instanceof l3) {
                            Status a2 = ((l3) j3).a();
                            int q2 = a2.q();
                            ConnectionResult h3 = a2.h();
                            h = h3 == null ? -1 : h3.h();
                            i4 = q2;
                        } else {
                            i4 = p21.T0;
                        }
                    }
                    h = -1;
                }
                if (z2) {
                    long j4 = this.d;
                    j2 = System.currentTimeMillis();
                    j = j4;
                    i5 = (int) (SystemClock.elapsedRealtime() - this.e);
                } else {
                    j = 0;
                    j2 = 0;
                    i5 = -1;
                }
                z70Var.E(new MethodInvocation(this.b, i4, h, j, j2, null, null, gCoreServiceId, i5), i, i2, i3);
            }
        }
    }
}
