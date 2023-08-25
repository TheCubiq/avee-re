package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class z75 extends rd3 {
    public final Context p;
    public final j35 q;
    public l45 r;
    public e35 s;

    public z75(Context context, j35 j35Var, l45 l45Var, e35 e35Var) {
        this.p = context;
        this.q = j35Var;
        this.r = l45Var;
        this.s = e35Var;
    }

    @Override // com.daaw.sd3
    public final String F2(String str) {
        return (String) this.q.Q().get(str);
    }

    @Override // com.daaw.sd3
    public final void f0(yd0 yd0Var) {
        e35 e35Var;
        Object M = nt0.M(yd0Var);
        if (!(M instanceof View) || this.q.c0() == null || (e35Var = this.s) == null) {
            return;
        }
        e35Var.m((View) M);
    }

    @Override // com.daaw.sd3
    public final boolean q(yd0 yd0Var) {
        l45 l45Var;
        Object M = nt0.M(yd0Var);
        if ((M instanceof ViewGroup) && (l45Var = this.r) != null && l45Var.f((ViewGroup) M)) {
            this.q.Z().I(new y75(this));
            return true;
        }
        return false;
    }

    @Override // com.daaw.sd3
    public final vc3 s(String str) {
        return (vc3) this.q.P().get(str);
    }

    @Override // com.daaw.sd3
    public final zzdq zze() {
        return this.q.R();
    }

    @Override // com.daaw.sd3
    public final sc3 zzf() {
        return this.s.I().a();
    }

    @Override // com.daaw.sd3
    public final yd0 zzh() {
        return nt0.g3(this.p);
    }

    @Override // com.daaw.sd3
    public final String zzi() {
        return this.q.g0();
    }

    @Override // com.daaw.sd3
    public final List zzk() {
        cd1 P = this.q.P();
        cd1 Q = this.q.Q();
        String[] strArr = new String[P.size() + Q.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < P.size()) {
            strArr[i3] = (String) P.i(i2);
            i2++;
            i3++;
        }
        while (i < Q.size()) {
            strArr[i3] = (String) Q.i(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.daaw.sd3
    public final void zzl() {
        e35 e35Var = this.s;
        if (e35Var != null) {
            e35Var.a();
        }
        this.s = null;
        this.r = null;
    }

    @Override // com.daaw.sd3
    public final void zzm() {
        String a = this.q.a();
        if ("Google".equals(a)) {
            k04.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(a)) {
            k04.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            e35 e35Var = this.s;
            if (e35Var != null) {
                e35Var.R(a, false);
            }
        }
    }

    @Override // com.daaw.sd3
    public final void zzn(String str) {
        e35 e35Var = this.s;
        if (e35Var != null) {
            e35Var.i(str);
        }
    }

    @Override // com.daaw.sd3
    public final void zzo() {
        e35 e35Var = this.s;
        if (e35Var != null) {
            e35Var.l();
        }
    }

    @Override // com.daaw.sd3
    public final boolean zzq() {
        e35 e35Var = this.s;
        return (e35Var == null || e35Var.z()) && this.q.Y() != null && this.q.Z() == null;
    }

    @Override // com.daaw.sd3
    public final boolean zzs() {
        yd0 c0 = this.q.c0();
        if (c0 == null) {
            k04.zzj("Trying to start OMID session before creation.");
            return false;
        }
        zzt.zzA().zzd(c0);
        if (this.q.Y() != null) {
            this.q.Y().T("onSdkLoaded", new g6());
            return true;
        }
        return true;
    }
}
