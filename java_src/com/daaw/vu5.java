package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class vu5 {

    /* renamed from: a */
    public final InterfaceC0623ag f30599a;

    /* renamed from: b */
    public final wu5 f30600b;

    /* renamed from: c */
    public final op6 f30601c;

    /* renamed from: d */
    public final List f30602d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    public final boolean f30603e = ((Boolean) zzba.zzc().m23658b(g93.f10771n6)).booleanValue();

    /* renamed from: f */
    public final vq5 f30604f;

    public vu5(InterfaceC0623ag interfaceC0623ag, wu5 wu5Var, vq5 vq5Var, op6 op6Var) {
        this.f30599a = interfaceC0623ag;
        this.f30600b = wu5Var;
        this.f30604f = vq5Var;
        this.f30601c = op6Var;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m6776g(vu5 vu5Var, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10854v1)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        vu5Var.f30602d.add(str3);
    }

    /* renamed from: e */
    public final f77 m6778e(fi6 fi6Var, th6 th6Var, f77 f77Var, kp6 kp6Var) {
        wh6 wh6Var = fi6Var.f9624b.f8508b;
        long mo15859b = this.f30599a.mo15859b();
        String str = th6Var.f27719x;
        if (str != null) {
            s67.m10625r(f77Var, new uu5(this, mo15859b, str, th6Var, wh6Var, kp6Var, fi6Var), z04.f34310f);
        }
        return f77Var;
    }

    /* renamed from: f */
    public final String m6777f() {
        return TextUtils.join("_", this.f30602d);
    }
}
