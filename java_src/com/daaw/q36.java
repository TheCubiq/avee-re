package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class q36 implements i76 {

    /* renamed from: a */
    public final Context f23653a;

    /* renamed from: b */
    public final g77 f23654b;

    public q36(Context context, g77 g77Var) {
        this.f23653a = context;
        this.f23654b = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 19;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f23654b.mo20112M(new Callable() { // from class: com.daaw.p36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                zzt.zzp();
                s13 zzg = zzt.zzo().m11915h().zzg();
                Bundle bundle = null;
                if (zzg != null && (!zzt.zzo().m11915h().zzM() || !zzt.zzo().m11915h().zzN())) {
                    if (zzg.m10756h()) {
                        zzg.m10757g();
                    }
                    i13 m10763a = zzg.m10763a();
                    if (m10763a != null) {
                        zzj = m10763a.m20214d();
                        str = m10763a.m20213e();
                        zzk = m10763a.m20212f();
                        if (zzj != null) {
                            zzt.zzo().m11915h().zzw(zzj);
                        }
                        if (zzk != null) {
                            zzt.zzo().m11915h().zzy(zzk);
                        }
                    } else {
                        zzj = zzt.zzo().m11915h().zzj();
                        zzk = zzt.zzo().m11915h().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!zzt.zzo().m11915h().zzN()) {
                        bundle2.putString("v_fp_vertical", (zzk == null || TextUtils.isEmpty(zzk)) ? "no_hash" : "no_hash");
                    }
                    if (zzj != null && !zzt.zzo().m11915h().zzM()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new r36(bundle);
            }
        });
    }
}
