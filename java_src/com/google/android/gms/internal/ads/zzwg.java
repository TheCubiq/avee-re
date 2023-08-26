package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzwg {
    private final Object mLock = new Object();
    private zzwn zzbrb;

    public final zzwn zzb(Context context, zzang zzangVar) {
        zzwn zzwnVar;
        synchronized (this.mLock) {
            if (this.zzbrb == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.zzbrb = new zzwn(context, zzangVar, (String) zzkb.zzik().zzd(zznk.zzaub));
            }
            zzwnVar = this.zzbrb;
        }
        return zzwnVar;
    }
}
