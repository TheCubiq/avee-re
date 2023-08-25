package com.daaw;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class xp3 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ zp3 f32864p;

    public xp3(zp3 zp3Var) {
        this.f32864p = zp3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent m2009i = this.f32864p.m2009i();
        zzt.zzp();
        context = this.f32864p.f35373d;
        zzs.zzQ(context, m2009i);
    }
}
