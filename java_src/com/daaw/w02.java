package com.daaw;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* loaded from: classes.dex */
public final class w02<T> implements cu0<T> {

    /* renamed from: a */
    public final z70 f30754a;

    /* renamed from: b */
    public final int f30755b;

    /* renamed from: c */
    public final C2396o3<?> f30756c;

    /* renamed from: d */
    public final long f30757d;

    /* renamed from: e */
    public final long f30758e;

    public w02(z70 z70Var, int i, C2396o3<?> c2396o3, long j, long j2, String str, String str2) {
        this.f30754a = z70Var;
        this.f30755b = i;
        this.f30756c = c2396o3;
        this.f30757d = j;
        this.f30758e = j2;
    }

    /* renamed from: b */
    public static <T> w02<T> m6613b(z70 z70Var, int i, C2396o3<?> c2396o3) {
        boolean z;
        if (z70Var.m2754f()) {
            RootTelemetryConfiguration m21903a = g61.m21902b().m21903a();
            if (m21903a == null) {
                z = true;
            } else if (!m21903a.m1163s()) {
                return null;
            } else {
                z = m21903a.m1162t();
                i02 m2737w = z70Var.m2737w(c2396o3);
                if (m2737w != null) {
                    if (!(m2737w.m20236s() instanceof AbstractC2527pa)) {
                        return null;
                    }
                    AbstractC2527pa abstractC2527pa = (AbstractC2527pa) m2737w.m20236s();
                    if (abstractC2527pa.hasConnectionInfo() && !abstractC2527pa.isConnecting()) {
                        ConnectionTelemetryConfiguration m6612c = m6612c(m2737w, abstractC2527pa, i);
                        if (m6612c == null) {
                            return null;
                        }
                        m2737w.m20266E();
                        z = m6612c.m1168u();
                    }
                }
            }
            return new w02<>(z70Var, i, c2396o3, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    /* renamed from: c */
    public static ConnectionTelemetryConfiguration m6612c(i02<?> i02Var, AbstractC2527pa<?> abstractC2527pa, int i) {
        int[] m1171q;
        int[] m1170s;
        ConnectionTelemetryConfiguration telemetryConfiguration = abstractC2527pa.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m1169t() || ((m1171q = telemetryConfiguration.m1171q()) != null ? !C1913k6.m18037b(m1171q, i) : !((m1170s = telemetryConfiguration.m1170s()) == null || !C1913k6.m18037b(m1170s, i))) || i02Var.m20239p() >= telemetryConfiguration.m1172h()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.daaw.cu0
    /* renamed from: a */
    public final void mo6614a(rj1<T> rj1Var) {
        i02 m2737w;
        int i;
        int i2;
        int i3;
        int i4;
        int m1209h;
        long j;
        long j2;
        int i5;
        if (this.f30754a.m2754f()) {
            RootTelemetryConfiguration m21903a = g61.m21902b().m21903a();
            if ((m21903a == null || m21903a.m1163s()) && (m2737w = this.f30754a.m2737w(this.f30756c)) != null && (m2737w.m20236s() instanceof AbstractC2527pa)) {
                AbstractC2527pa abstractC2527pa = (AbstractC2527pa) m2737w.m20236s();
                boolean z = true;
                boolean z2 = this.f30757d > 0;
                int gCoreServiceId = abstractC2527pa.getGCoreServiceId();
                if (m21903a != null) {
                    z2 &= m21903a.m1162t();
                    int m1165h = m21903a.m1165h();
                    int m1164q = m21903a.m1164q();
                    i = m21903a.m1161u();
                    if (abstractC2527pa.hasConnectionInfo() && !abstractC2527pa.isConnecting()) {
                        ConnectionTelemetryConfiguration m6612c = m6612c(m2737w, abstractC2527pa, this.f30755b);
                        if (m6612c == null) {
                            return;
                        }
                        z = (!m6612c.m1168u() || this.f30757d <= 0) ? false : false;
                        m1164q = m6612c.m1172h();
                        z2 = z;
                    }
                    i2 = m1165h;
                    i3 = m1164q;
                } else {
                    i = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                z70 z70Var = this.f30754a;
                if (rj1Var.mo11236n()) {
                    i4 = 0;
                    m1209h = 0;
                } else {
                    if (rj1Var.mo11238l()) {
                        i4 = 100;
                    } else {
                        Exception mo11240j = rj1Var.mo11240j();
                        if (mo11240j instanceof C2009l3) {
                            Status m17191a = ((C2009l3) mo11240j).m17191a();
                            int m1197q = m17191a.m1197q();
                            ConnectionResult m1198h = m17191a.m1198h();
                            m1209h = m1198h == null ? -1 : m1198h.m1209h();
                            i4 = m1197q;
                        } else {
                            i4 = p21.f22328T0;
                        }
                    }
                    m1209h = -1;
                }
                if (z2) {
                    long j3 = this.f30757d;
                    j2 = System.currentTimeMillis();
                    j = j3;
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f30758e);
                } else {
                    j = 0;
                    j2 = 0;
                    i5 = -1;
                }
                z70Var.m2761E(new MethodInvocation(this.f30755b, i4, m1209h, j, j2, null, null, gCoreServiceId, i5), i, i2, i3);
            }
        }
    }
}
