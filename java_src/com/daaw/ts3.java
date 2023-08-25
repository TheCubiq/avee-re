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

    /* renamed from: d */
    public static zy3 f28018d;

    /* renamed from: a */
    public final Context f28019a;

    /* renamed from: b */
    public final AdFormat f28020b;

    /* renamed from: c */
    public final zzdx f28021c;

    public ts3(Context context, AdFormat adFormat, zzdx zzdxVar) {
        this.f28019a = context;
        this.f28020b = adFormat;
        this.f28021c = zzdxVar;
    }

    /* renamed from: a */
    public static zy3 m8842a(Context context) {
        zy3 zy3Var;
        synchronized (ts3.class) {
            if (f28018d == null) {
                f28018d = zzay.zza().zzr(context, new xm3());
            }
            zy3Var = f28018d;
        }
        return zy3Var;
    }

    /* renamed from: b */
    public final void m8841b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        String str;
        zy3 m8842a = m8842a(this.f28019a);
        if (m8842a == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            yd0 m14830g3 = nt0.m14830g3(this.f28019a);
            zzdx zzdxVar = this.f28021c;
            try {
                m8842a.zze(m14830g3, new zzcgj(null, this.f28020b.name(), null, zzdxVar == null ? new zzm().zza() : zzp.zza.zza(this.f28019a, zzdxVar)), new ss3(this, queryInfoGenerationCallback));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        queryInfoGenerationCallback.onFailure(str);
    }
}
