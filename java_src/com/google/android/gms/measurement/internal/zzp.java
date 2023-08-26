package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzp {
    private final zzgb zza;

    public zzp(zzgb zzgbVar) {
        this.zza = zzgbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zza.zzp().zzc();
        if (zzd()) {
            if (zzc()) {
                this.zza.zzb().zzv.zza(null);
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.SOURCE, "(not set)");
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.zza.zzg().zza("auto", "_cmpx", bundle);
            } else {
                String zza = this.zza.zzb().zzv.zza();
                if (TextUtils.isEmpty(zza)) {
                    this.zza.zzq().zzf().zza("Cache still valid but referrer not found");
                } else {
                    long zza2 = ((this.zza.zzb().zzw.zza() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", zza2);
                    this.zza.zzg().zza((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.zza.zzb().zzv.zza(null);
            }
            this.zza.zzb().zzw.zza(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, Bundle bundle) {
        String str2;
        this.zza.zzp().zzc();
        if (this.zza.zzaa()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            str = (str == null || str.isEmpty()) ? "auto" : "auto";
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.zzb().zzv.zza(str2);
        this.zza.zzb().zzw.zza(this.zza.zzl().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        if (zzd() && zzc()) {
            this.zza.zzb().zzv.zza(null);
        }
    }

    private final boolean zzc() {
        return zzd() && this.zza.zzl().currentTimeMillis() - this.zza.zzb().zzw.zza() > this.zza.zza().zza((String) null, zzat.zzcl);
    }

    private final boolean zzd() {
        return this.zza.zzb().zzw.zza() > 0;
    }
}
