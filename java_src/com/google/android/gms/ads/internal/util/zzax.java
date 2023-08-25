package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.d04;
import com.daaw.eg2;
import com.daaw.fg2;
import com.daaw.g93;
import com.daaw.mf2;
import com.daaw.qf2;
import com.daaw.rg2;
import com.daaw.tf2;
import com.daaw.vi3;
import com.daaw.wg2;
import java.io.File;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class zzax extends fg2 {

    /* renamed from: d */
    public final Context f36262d;

    public zzax(Context context, eg2 eg2Var) {
        super(eg2Var);
        this.f36262d = context;
    }

    public static tf2 zzb(Context context) {
        tf2 tf2Var = new tf2(new rg2(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new wg2(null, null)), 4);
        tf2Var.m9196d();
        return tf2Var;
    }

    @Override // com.daaw.fg2, com.daaw.ff2
    public final mf2 zza(qf2 qf2Var) {
        if (qf2Var.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10575V3), qf2Var.zzk())) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (d04.m24807y(this.f36262d, 13400000)) {
                    mf2 zza = new vi3(this.f36262d).zza(qf2Var);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(qf2Var.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(qf2Var.zzk())));
                }
            }
        }
        return super.zza(qf2Var);
    }
}
