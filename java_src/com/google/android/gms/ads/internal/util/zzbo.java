package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.bb3;
import com.daaw.ch2;
import com.daaw.e14;
import com.daaw.e53;
import com.daaw.f77;
import com.daaw.g93;
import com.daaw.j04;
import com.daaw.j63;
import com.daaw.k04;
import com.daaw.o73;
import com.daaw.tf2;
import com.daaw.ue2;
import com.daaw.vf;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbo {
    public static tf2 a;
    public static final Object b = new Object();
    @Deprecated
    public static final zzbj zza = new e53();

    public zzbo(Context context) {
        tf2 a2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            if (a == null) {
                g93.c(context);
                if (!vf.a()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.U3)).booleanValue()) {
                        a2 = zzax.zzb(context);
                        a = a2;
                    }
                }
                a2 = ch2.a(context, null);
                a = a2;
            }
        }
    }

    public final f77 zza(String str) {
        e14 e14Var = new e14();
        a.a(new zzbn(str, null, e14Var));
        return e14Var;
    }

    public final f77 zzb(int i, String str, Map map, byte[] bArr) {
        bb3 bb3Var = new bb3(null);
        j63 j63Var = new j63(this, str, bb3Var);
        j04 j04Var = new j04(null);
        o73 o73Var = new o73(this, i, str, bb3Var, j63Var, bArr, map, j04Var);
        if (j04.l()) {
            try {
                j04Var.d(str, "GET", o73Var.zzl(), o73Var.zzx());
            } catch (ue2 e) {
                k04.zzj(e.getMessage());
            }
        }
        a.a(o73Var);
        return bb3Var;
    }
}
