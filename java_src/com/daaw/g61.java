package com.daaw;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* loaded from: classes.dex */
public final class g61 {

    /* renamed from: b */
    public static g61 f10300b;

    /* renamed from: c */
    public static final RootTelemetryConfiguration f10301c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    public RootTelemetryConfiguration f10302a;

    /* renamed from: b */
    public static synchronized g61 m21902b() {
        g61 g61Var;
        synchronized (g61.class) {
            if (f10300b == null) {
                f10300b = new g61();
            }
            g61Var = f10300b;
        }
        return g61Var;
    }

    /* renamed from: a */
    public RootTelemetryConfiguration m21903a() {
        return this.f10302a;
    }

    /* renamed from: c */
    public final synchronized void m21901c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f10302a = f10301c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f10302a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.m1161u() < rootTelemetryConfiguration.m1161u()) {
            this.f10302a = rootTelemetryConfiguration;
        }
    }
}
