package com.daaw;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* loaded from: classes.dex */
public final class g61 {
    public static g61 b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    public static synchronized g61 b() {
        g61 g61Var;
        synchronized (g61.class) {
            if (b == null) {
                b = new g61();
            }
            g61Var = b;
        }
        return g61Var;
    }

    public RootTelemetryConfiguration a() {
        return this.a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.u() < rootTelemetryConfiguration.u()) {
            this.a = rootTelemetryConfiguration;
        }
    }
}
