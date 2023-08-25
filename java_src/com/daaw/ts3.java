package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzcgj;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ts3 {
    @GuardedBy("InternalQueryInfoGenerator.class")
    public static zy3 d;
    public final Context a;
    public final AdFormat b;
    public final zzdx c;

    public ts3(Context context, AdFormat adFormat, zzdx zzdxVar) {
        this.a = context;
        this.b = adFormat;
        this.c = zzdxVar;
    }

    public static zy3 a(Context context) {
        zy3 zy3Var;
        synchronized (ts3.class) {
            if (d == null) {
                d = zzay.zza().zzr(context, new xm3());
            }
            zy3Var = d;
        }
        return zy3Var;
    }

    public final void b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        String str;
        zy3 a = a(this.a);
        if (a == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            yd0 g3 = nt0.g3(this.a);
            zzdx zzdxVar = this.c;
            try {
                a.zze(g3, new zzcgj(null, this.b.name(), null, zzdxVar == null ? new zzm().zza() : zzp.zza.zza(this.a, zzdxVar)), new ss3(this, queryInfoGenerationCallback));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        queryInfoGenerationCallback.onFailure(str);
    }
}
