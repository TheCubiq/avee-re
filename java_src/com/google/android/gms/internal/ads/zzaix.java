package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
@zzadh
/* loaded from: classes2.dex */
public final class zzaix implements zzft {
    private final Object mLock;
    private final Context zzatx;
    private boolean zzcno;
    private String zzye;

    public zzaix(Context context, String str) {
        this.zzatx = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzye = str;
        this.zzcno = false;
        this.mLock = new Object();
    }

    public final void setAdUnitId(String str) {
        this.zzye = str;
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zza(zzfs zzfsVar) {
        zzx(zzfsVar.zztg);
    }

    public final void zzx(boolean z) {
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzs(this.zzatx)) {
            synchronized (this.mLock) {
                if (this.zzcno == z) {
                    return;
                }
                this.zzcno = z;
                if (TextUtils.isEmpty(this.zzye)) {
                    return;
                }
                if (this.zzcno) {
                    com.google.android.gms.ads.internal.zzbv.zzfh().zzb(this.zzatx, this.zzye);
                } else {
                    com.google.android.gms.ads.internal.zzbv.zzfh().zzc(this.zzatx, this.zzye);
                }
            }
        }
    }
}
