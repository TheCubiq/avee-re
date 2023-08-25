package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class vu5 {
    public final ag a;
    public final wu5 b;
    public final op6 c;
    public final List d = Collections.synchronizedList(new ArrayList());
    public final boolean e = ((Boolean) zzba.zzc().b(g93.n6)).booleanValue();
    public final vq5 f;

    public vu5(ag agVar, wu5 wu5Var, vq5 vq5Var, op6 op6Var) {
        this.a = agVar;
        this.b = wu5Var;
        this.f = vq5Var;
        this.c = op6Var;
    }

    public static /* bridge */ /* synthetic */ void g(vu5 vu5Var, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) zzba.zzc().b(g93.v1)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        vu5Var.d.add(str3);
    }

    public final f77 e(fi6 fi6Var, th6 th6Var, f77 f77Var, kp6 kp6Var) {
        wh6 wh6Var = fi6Var.b.b;
        long b = this.a.b();
        String str = th6Var.x;
        if (str != null) {
            s67.r(f77Var, new uu5(this, b, str, th6Var, wh6Var, kp6Var, fi6Var), z04.f);
        }
        return f77Var;
    }

    public final String f() {
        return TextUtils.join("_", this.d);
    }
}
