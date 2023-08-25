package com.daaw;

import android.content.Context;
import com.daaw.C1897k3;
import com.daaw.sj1;
import com.daaw.v70;
import com.google.android.gms.common.internal.TelemetryData;
/* loaded from: classes.dex */
public final class m22 extends v70<hk1> implements gk1 {

    /* renamed from: k */
    public static final C1897k3.C1907g<o22> f18384k;

    /* renamed from: l */
    public static final C1897k3.AbstractC1898a<o22, hk1> f18385l;

    /* renamed from: m */
    public static final C1897k3<hk1> f18386m;

    /* renamed from: n */
    public static final /* synthetic */ int f18387n = 0;

    static {
        C1897k3.C1907g<o22> c1907g = new C1897k3.C1907g<>();
        f18384k = c1907g;
        k22 k22Var = new k22();
        f18385l = k22Var;
        f18386m = new C1897k3<>("ClientTelemetry.API", k22Var, c1907g);
    }

    public m22(Context context, hk1 hk1Var) {
        super(context, f18386m, hk1Var, v70.C3306a.f29971c);
    }

    @Override // com.daaw.gk1
    /* renamed from: b */
    public final rj1<Void> mo16295b(final TelemetryData telemetryData) {
        sj1.C2945a m10304a = sj1.m10304a();
        m10304a.m10296d(j12.f14170a);
        m10304a.m10297c(false);
        m10304a.m10298b(new q31() { // from class: com.daaw.h22
            @Override // com.daaw.q31
            /* renamed from: a */
            public final void mo12791a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i = m22.f18387n;
                ((a22) ((o22) obj).getService()).m27750g3(telemetryData2);
                ((tj1) obj2).m9080c(null);
            }
        });
        return m7384d(m10304a.m10299a());
    }
}
