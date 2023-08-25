package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class so6 {
    /* renamed from: a */
    public static void m10114a(f77 f77Var, to6 to6Var, io6 io6Var) {
        m10108g(f77Var, to6Var, io6Var, false);
    }

    /* renamed from: b */
    public static void m10113b(f77 f77Var, to6 to6Var, io6 io6Var) {
        m10108g(f77Var, to6Var, io6Var, true);
    }

    /* renamed from: c */
    public static void m10112c(f77 f77Var, to6 to6Var, io6 io6Var) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            s67.m10625r(j67.m18784D(f77Var), new ro6(to6Var, io6Var), z04.f34310f);
        }
    }

    /* renamed from: d */
    public static void m10111d(f77 f77Var, io6 io6Var) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            s67.m10625r(j67.m18784D(f77Var), new po6(io6Var), z04.f34310f);
        }
    }

    /* renamed from: e */
    public static boolean m10110e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzba.zzc().m23658b(g93.f10549S7), str);
    }

    /* renamed from: f */
    public static int m10109f(ri6 ri6Var) {
        int zze = zzf.zze(ri6Var) - 1;
        return (zze == 0 || zze == 1) ? 7 : 23;
    }

    /* renamed from: g */
    public static void m10108g(f77 f77Var, to6 to6Var, io6 io6Var, boolean z) {
        if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
            s67.m10625r(j67.m18784D(f77Var), new qo6(to6Var, io6Var, z), z04.f34310f);
        }
    }
}
