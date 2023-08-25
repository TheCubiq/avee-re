package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class eg4 implements jr4 {

    /* renamed from: p */
    public final oj6 f8460p;

    public eg4(oj6 oj6Var) {
        this.f8460p = oj6Var;
    }

    @Override // com.daaw.jr4
    /* renamed from: f */
    public final void mo5173f(Context context) {
        try {
            this.f8460p.m14234l();
        } catch (wi6 e) {
            k04.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.daaw.jr4
    /* renamed from: l */
    public final void mo5171l(Context context) {
        try {
            this.f8460p.m14220z();
            if (context != null) {
                this.f8460p.m14222x(context);
            }
        } catch (wi6 e) {
            k04.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.daaw.jr4
    /* renamed from: s */
    public final void mo5169s(Context context) {
        try {
            this.f8460p.m14221y();
        } catch (wi6 e) {
            k04.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}
