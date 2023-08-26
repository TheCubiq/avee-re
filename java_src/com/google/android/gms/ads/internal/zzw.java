package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzaio;
import com.google.android.gms.internal.ads.zzaip;
import com.google.android.gms.internal.ads.zzaiu;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzhx;
@zzadh
/* loaded from: classes.dex */
public final class zzw {
    public final zzaqm zzwy;
    public final zzaph zzwz;
    public final zzaiu zzxa;
    public final zzhx zzxb;

    private zzw(zzaqm zzaqmVar, zzaph zzaphVar, zzaiu zzaiuVar, zzhx zzhxVar) {
        this.zzwy = zzaqmVar;
        this.zzwz = zzaphVar;
        this.zzxa = zzaiuVar;
        this.zzxb = zzhxVar;
    }

    public static zzw zzc(Context context) {
        return new zzw(new zzaqb(), new zzapo(), new zzaio(new zzaip()), new zzhx(context));
    }
}
