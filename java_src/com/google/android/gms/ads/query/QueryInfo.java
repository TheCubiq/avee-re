package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.daaw.g93;
import com.daaw.ts3;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzem;
/* loaded from: classes.dex */
public class QueryInfo {

    /* renamed from: a */
    public final zzem f36539a;

    public QueryInfo(zzem zzemVar) {
        this.f36539a = zzemVar;
    }

    public static void generate(final Context context, final AdFormat adFormat, final AdRequest adRequest, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        g93.m21879c(context);
        if (((Boolean) ya3.f33459k.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                zz3.f35693b.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        AdFormat adFormat2 = adFormat;
                        AdRequest adRequest2 = adRequest;
                        new ts3(context2, adFormat2, adRequest2 == null ? null : adRequest2.zza()).m8841b(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new ts3(context, adFormat, adRequest == null ? null : adRequest.zza()).m8841b(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.f36539a.zzb();
    }

    public Bundle getQueryBundle() {
        return this.f36539a.zza();
    }

    public String getRequestId() {
        return this.f36539a.zzd();
    }

    public final zzem zza() {
        return this.f36539a;
    }
}
