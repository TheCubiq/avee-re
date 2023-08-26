package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzafv implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzaft zzchv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafv(zzaft zzaftVar) {
        this.zzchv = zzaftVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        Object obj2;
        zzaoj zzaojVar;
        String str;
        zzaoj zzaojVar2;
        Context context;
        String str2;
        obj2 = this.zzchv.mLock;
        synchronized (obj2) {
            zzaojVar = this.zzchv.zzchr;
            if (zzaojVar.isDone()) {
                return;
            }
            zzafz zzafzVar = new zzafz(-2, map);
            str = this.zzchv.zzchp;
            if (str.equals(zzafzVar.zzol())) {
                String url = zzafzVar.getUrl();
                if (url == null) {
                    zzakb.zzdk("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (url.contains("%40mediation_adapters%40")) {
                    context = this.zzchv.mContext;
                    str2 = this.zzchv.zzchq;
                    String replaceAll = url.replaceAll("%40mediation_adapters%40", zzajw.zzc(context, map.get("check_adapters"), str2));
                    zzafzVar.setUrl(replaceAll);
                    String valueOf = String.valueOf(replaceAll);
                    zzakb.v(valueOf.length() != 0 ? "Ad request URL modified to ".concat(valueOf) : new String("Ad request URL modified to "));
                }
                zzaojVar2 = this.zzchv.zzchr;
                zzaojVar2.set(zzafzVar);
            }
        }
    }
}
