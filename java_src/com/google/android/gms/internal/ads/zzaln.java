package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;
@zzadh
/* loaded from: classes2.dex */
public final class zzaln extends zzaj {
    private final Context mContext;

    private zzaln(Context context, zzar zzarVar) {
        super(zzarVar);
        this.mContext = context;
    }

    public static zzv zzba(Context context) {
        zzv zzvVar = new zzv(new zzam(new File(context.getCacheDir(), "admob_volley")), new zzaln(context, new zzas()));
        zzvVar.start();
        return zzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaj, com.google.android.gms.internal.ads.zzm
    public final zzp zzc(zzr<?> zzrVar) throws zzae {
        if (zzrVar.zzh() && zzrVar.getMethod() == 0) {
            if (Pattern.matches((String) zzkb.zzik().zzd(zznk.zzbdw), zzrVar.getUrl())) {
                zzkb.zzif();
                if (zzamu.zzbe(this.mContext)) {
                    zzp zzc = new zzsm(this.mContext).zzc(zzrVar);
                    if (zzc != null) {
                        String valueOf = String.valueOf(zzrVar.getUrl());
                        zzakb.v(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zzc;
                    }
                    String valueOf2 = String.valueOf(zzrVar.getUrl());
                    zzakb.v(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zzc(zzrVar);
    }
}
