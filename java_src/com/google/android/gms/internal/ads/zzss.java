package com.google.android.gms.internal.ads;

import android.content.Context;
@zzadh
/* loaded from: classes2.dex */
public final class zzss {
    private final Context mContext;
    private final com.google.android.gms.ads.internal.zzw zzwc;
    private final zzxn zzwh;
    private final zzang zzyf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzss(Context context, zzxn zzxnVar, zzang zzangVar, com.google.android.gms.ads.internal.zzw zzwVar) {
        this.mContext = context;
        this.zzwh = zzxnVar;
        this.zzyf = zzangVar;
        this.zzwc = zzwVar;
    }

    public final Context getApplicationContext() {
        return this.mContext.getApplicationContext();
    }

    public final com.google.android.gms.ads.internal.zzal zzav(String str) {
        return new com.google.android.gms.ads.internal.zzal(this.mContext, new zzjn(), str, this.zzwh, this.zzyf, this.zzwc);
    }

    public final com.google.android.gms.ads.internal.zzal zzaw(String str) {
        return new com.google.android.gms.ads.internal.zzal(this.mContext.getApplicationContext(), new zzjn(), str, this.zzwh, this.zzyf, this.zzwc);
    }

    public final zzss zzlc() {
        return new zzss(this.mContext.getApplicationContext(), this.zzwh, this.zzyf, this.zzwc);
    }
}
