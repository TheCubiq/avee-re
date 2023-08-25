package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class so6 {
    public static void a(f77 f77Var, to6 to6Var, io6 io6Var) {
        g(f77Var, to6Var, io6Var, false);
    }

    public static void b(f77 f77Var, to6 to6Var, io6 io6Var) {
        g(f77Var, to6Var, io6Var, true);
    }

    public static void c(f77 f77Var, to6 to6Var, io6 io6Var) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            s67.r(j67.D(f77Var), new ro6(to6Var, io6Var), z04.f);
        }
    }

    public static void d(f77 f77Var, io6 io6Var) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            s67.r(j67.D(f77Var), new po6(io6Var), z04.f);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzba.zzc().b(g93.S7), str);
    }

    public static int f(ri6 ri6Var) {
        int zze = zzf.zze(ri6Var) - 1;
        return (zze == 0 || zze == 1) ? 7 : 23;
    }

    public static void g(f77 f77Var, to6 to6Var, io6 io6Var, boolean z) {
        if (((Boolean) ta3.c.e()).booleanValue()) {
            s67.r(j67.D(f77Var), new qo6(to6Var, io6Var, z), z04.f);
        }
    }
}
