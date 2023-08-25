package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class q36 implements i76 {
    public final Context a;
    public final g77 b;

    public q36(Context context, g77 g77Var) {
        this.a = context;
        this.b = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 19;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.b.M(new Callable() { // from class: com.daaw.p36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                zzt.zzp();
                s13 zzg = zzt.zzo().h().zzg();
                Bundle bundle = null;
                if (zzg != null && (!zzt.zzo().h().zzM() || !zzt.zzo().h().zzN())) {
                    if (zzg.h()) {
                        zzg.g();
                    }
                    i13 a = zzg.a();
                    if (a != null) {
                        zzj = a.d();
                        str = a.e();
                        zzk = a.f();
                        if (zzj != null) {
                            zzt.zzo().h().zzw(zzj);
                        }
                        if (zzk != null) {
                            zzt.zzo().h().zzy(zzk);
                        }
                    } else {
                        zzj = zzt.zzo().h().zzj();
                        zzk = zzt.zzo().h().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!zzt.zzo().h().zzN()) {
                        bundle2.putString("v_fp_vertical", (zzk == null || TextUtils.isEmpty(zzk)) ? "no_hash" : "no_hash");
                    }
                    if (zzj != null && !zzt.zzo().h().zzM()) {
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
