package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class eg4 implements jr4 {
    public final oj6 p;

    public eg4(oj6 oj6Var) {
        this.p = oj6Var;
    }

    @Override // com.daaw.jr4
    public final void f(Context context) {
        try {
            this.p.l();
        } catch (wi6 e) {
            k04.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.daaw.jr4
    public final void l(Context context) {
        try {
            this.p.z();
            if (context != null) {
                this.p.x(context);
            }
        } catch (wi6 e) {
            k04.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.daaw.jr4
    public final void s(Context context) {
        try {
            this.p.y();
        } catch (wi6 e) {
            k04.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}
