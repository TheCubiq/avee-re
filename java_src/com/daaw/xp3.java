package com.daaw;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class xp3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ zp3 p;

    public xp3(zp3 zp3Var) {
        this.p = zp3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent i2 = this.p.i();
        zzt.zzp();
        context = this.p.d;
        zzs.zzQ(context, i2);
    }
}
