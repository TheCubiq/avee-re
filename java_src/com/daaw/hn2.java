package com.daaw;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class hn2 extends no2 {

    /* renamed from: i */
    public final Activity f12690i;

    /* renamed from: j */
    public final View f12691j;

    public hn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, View view, Activity activity) {
        super(wm2Var, "rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", hi2Var, i, 62);
        this.f12691j = view;
        this.f12690i = activity;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        if (this.f12691j == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzba.zzc().m23658b(g93.f10712i2)).booleanValue();
        Object[] objArr = (Object[]) this.f20529f.invoke(null, this.f12691j, this.f12690i, Boolean.valueOf(booleanValue));
        synchronized (this.f20528e) {
            this.f20528e.m20765a0(((Long) objArr[0]).longValue());
            this.f20528e.m20763c0(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.f20528e.m20764b0((String) objArr[2]);
            }
        }
    }
}
