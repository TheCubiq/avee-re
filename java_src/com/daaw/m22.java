package com.daaw;

import android.content.Context;
import com.daaw.k3;
import com.daaw.sj1;
import com.daaw.v70;
import com.google.android.gms.common.internal.TelemetryData;
/* loaded from: classes.dex */
public final class m22 extends v70<hk1> implements gk1 {
    public static final k3.g<o22> k;
    public static final k3.a<o22, hk1> l;
    public static final k3<hk1> m;
    public static final /* synthetic */ int n = 0;

    static {
        k3.g<o22> gVar = new k3.g<>();
        k = gVar;
        k22 k22Var = new k22();
        l = k22Var;
        m = new k3<>("ClientTelemetry.API", k22Var, gVar);
    }

    public m22(Context context, hk1 hk1Var) {
        super(context, m, hk1Var, v70.a.c);
    }

    @Override // com.daaw.gk1
    public final rj1<Void> b(final TelemetryData telemetryData) {
        sj1.a a = sj1.a();
        a.d(j12.a);
        a.c(false);
        a.b(new q31() { // from class: com.daaw.h22
            @Override // com.daaw.q31
            public final void a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i = m22.n;
                ((a22) ((o22) obj).getService()).g3(telemetryData2);
                ((tj1) obj2).c(null);
            }
        });
        return d(a.a());
    }
}
