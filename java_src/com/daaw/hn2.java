package com.daaw;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class hn2 extends no2 {
    public final Activity i;
    public final View j;

    public hn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, View view, Activity activity) {
        super(wm2Var, "rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", hi2Var, i, 62);
        this.j = view;
        this.i = activity;
    }

    @Override // com.daaw.no2
    public final void a() {
        if (this.j == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzba.zzc().b(g93.i2)).booleanValue();
        Object[] objArr = (Object[]) this.f.invoke(null, this.j, this.i, Boolean.valueOf(booleanValue));
        synchronized (this.e) {
            this.e.a0(((Long) objArr[0]).longValue());
            this.e.c0(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.e.b0((String) objArr[2]);
            }
        }
    }
}
