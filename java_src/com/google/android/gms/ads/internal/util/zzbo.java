package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.C3327vf;
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
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbo {

    /* renamed from: a */
    public static tf2 f36276a;

    /* renamed from: b */
    public static final Object f36277b = new Object();
    @Deprecated
    public static final zzbj zza = new e53();

    public zzbo(Context context) {
        tf2 m25377a;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f36277b) {
            if (f36276a == null) {
                g93.m21879c(context);
                if (!C3327vf.m7198a()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10565U3)).booleanValue()) {
                        m25377a = zzax.zzb(context);
                        f36276a = m25377a;
                    }
                }
                m25377a = ch2.m25377a(context, null);
                f36276a = m25377a;
            }
        }
    }

    public final f77 zza(String str) {
        e14 e14Var = new e14();
        f36276a.m9199a(new zzbn(str, null, e14Var));
        return e14Var;
    }

    public final f77 zzb(int i, String str, Map map, byte[] bArr) {
        bb3 bb3Var = new bb3(null);
        j63 j63Var = new j63(this, str, bb3Var);
        j04 j04Var = new j04(null);
        o73 o73Var = new o73(this, i, str, bb3Var, j63Var, bArr, map, j04Var);
        if (j04.m19188l()) {
            try {
                j04Var.m19196d(str, "GET", o73Var.zzl(), o73Var.zzx());
            } catch (ue2 e) {
                k04.zzj(e.getMessage());
            }
        }
        f36276a.m9199a(o73Var);
        return bb3Var;
    }
}
