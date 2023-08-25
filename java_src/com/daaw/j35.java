package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class j35 {
    public int a;
    public zzdq b;
    public nc3 c;
    public View d;
    public List e;
    public zzel g;
    public Bundle h;
    public a74 i;
    public a74 j;
    public a74 k;
    public yd0 l;
    public View m;
    public View n;
    public yd0 o;
    public double p;
    public vc3 q;
    public vc3 r;
    public String s;
    public float v;
    public String w;
    public final cd1 t = new cd1();
    public final cd1 u = new cd1();
    public List f = Collections.emptyList();

    public static j35 C(on3 on3Var) {
        try {
            i35 G = G(on3Var.h3(), null);
            nc3 i3 = on3Var.i3();
            String zzo = on3Var.zzo();
            List m3 = on3Var.m3();
            String zzm = on3Var.zzm();
            Bundle zzf = on3Var.zzf();
            String zzn = on3Var.zzn();
            yd0 zzl = on3Var.zzl();
            String zzq = on3Var.zzq();
            String zzp = on3Var.zzp();
            double zze = on3Var.zze();
            vc3 j3 = on3Var.j3();
            j35 j35Var = new j35();
            j35Var.a = 2;
            j35Var.b = G;
            j35Var.c = i3;
            j35Var.d = (View) I(on3Var.k3());
            j35Var.u("headline", zzo);
            j35Var.e = m3;
            j35Var.u("body", zzm);
            j35Var.h = zzf;
            j35Var.u("call_to_action", zzn);
            j35Var.m = (View) I(on3Var.l3());
            j35Var.o = zzl;
            j35Var.u("store", zzq);
            j35Var.u("price", zzp);
            j35Var.p = zze;
            j35Var.q = j3;
            return j35Var;
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static j35 D(pn3 pn3Var) {
        try {
            i35 G = G(pn3Var.h3(), null);
            nc3 i3 = pn3Var.i3();
            String zzo = pn3Var.zzo();
            List m3 = pn3Var.m3();
            String zzm = pn3Var.zzm();
            Bundle zze = pn3Var.zze();
            String zzn = pn3Var.zzn();
            yd0 l3 = pn3Var.l3();
            String zzl = pn3Var.zzl();
            vc3 j3 = pn3Var.j3();
            j35 j35Var = new j35();
            j35Var.a = 1;
            j35Var.b = G;
            j35Var.c = i3;
            j35Var.d = (View) I(pn3Var.zzi());
            j35Var.u("headline", zzo);
            j35Var.e = m3;
            j35Var.u("body", zzm);
            j35Var.h = zze;
            j35Var.u("call_to_action", zzn);
            j35Var.m = (View) I(pn3Var.k3());
            j35Var.o = l3;
            j35Var.u("advertiser", zzl);
            j35Var.r = j3;
            return j35Var;
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static j35 E(on3 on3Var) {
        try {
            return H(G(on3Var.h3(), null), on3Var.i3(), (View) I(on3Var.k3()), on3Var.zzo(), on3Var.m3(), on3Var.zzm(), on3Var.zzf(), on3Var.zzn(), (View) I(on3Var.l3()), on3Var.zzl(), on3Var.zzq(), on3Var.zzp(), on3Var.zze(), on3Var.j3(), null, 0.0f);
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static j35 F(pn3 pn3Var) {
        try {
            return H(G(pn3Var.h3(), null), pn3Var.i3(), (View) I(pn3Var.zzi()), pn3Var.zzo(), pn3Var.m3(), pn3Var.zzm(), pn3Var.zze(), pn3Var.zzn(), (View) I(pn3Var.k3()), pn3Var.l3(), null, null, -1.0d, pn3Var.j3(), pn3Var.zzl(), 0.0f);
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    public static i35 G(zzdq zzdqVar, sn3 sn3Var) {
        if (zzdqVar == null) {
            return null;
        }
        return new i35(zzdqVar, sn3Var);
    }

    public static j35 H(zzdq zzdqVar, nc3 nc3Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, yd0 yd0Var, String str4, String str5, double d, vc3 vc3Var, String str6, float f) {
        j35 j35Var = new j35();
        j35Var.a = 6;
        j35Var.b = zzdqVar;
        j35Var.c = nc3Var;
        j35Var.d = view;
        j35Var.u("headline", str);
        j35Var.e = list;
        j35Var.u("body", str2);
        j35Var.h = bundle;
        j35Var.u("call_to_action", str3);
        j35Var.m = view2;
        j35Var.o = yd0Var;
        j35Var.u("store", str4);
        j35Var.u("price", str5);
        j35Var.p = d;
        j35Var.q = vc3Var;
        j35Var.u("advertiser", str6);
        j35Var.p(f);
        return j35Var;
    }

    public static Object I(yd0 yd0Var) {
        if (yd0Var == null) {
            return null;
        }
        return nt0.M(yd0Var);
    }

    public static j35 a0(sn3 sn3Var) {
        try {
            return H(G(sn3Var.zzj(), sn3Var), sn3Var.zzk(), (View) I(sn3Var.zzm()), sn3Var.zzs(), sn3Var.zzv(), sn3Var.zzq(), sn3Var.zzi(), sn3Var.zzr(), (View) I(sn3Var.zzn()), sn3Var.zzo(), sn3Var.b(), sn3Var.zzt(), sn3Var.zze(), sn3Var.zzl(), sn3Var.zzp(), sn3Var.zzf());
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized double A() {
        return this.p;
    }

    public final synchronized void B(yd0 yd0Var) {
        this.l = yd0Var;
    }

    public final synchronized float J() {
        return this.v;
    }

    public final synchronized int K() {
        return this.a;
    }

    public final synchronized Bundle L() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final synchronized View M() {
        return this.d;
    }

    public final synchronized View N() {
        return this.m;
    }

    public final synchronized View O() {
        return this.n;
    }

    public final synchronized cd1 P() {
        return this.t;
    }

    public final synchronized cd1 Q() {
        return this.u;
    }

    public final synchronized zzdq R() {
        return this.b;
    }

    public final synchronized zzel S() {
        return this.g;
    }

    public final synchronized nc3 T() {
        return this.c;
    }

    public final vc3 U() {
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return uc3.g3((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized vc3 V() {
        return this.q;
    }

    public final synchronized vc3 W() {
        return this.r;
    }

    public final synchronized a74 X() {
        return this.j;
    }

    public final synchronized a74 Y() {
        return this.k;
    }

    public final synchronized a74 Z() {
        return this.i;
    }

    public final synchronized String a() {
        return this.w;
    }

    public final synchronized String b() {
        return d("price");
    }

    public final synchronized yd0 b0() {
        return this.o;
    }

    public final synchronized String c() {
        return d("store");
    }

    public final synchronized yd0 c0() {
        return this.l;
    }

    public final synchronized String d(String str) {
        return (String) this.u.get(str);
    }

    public final synchronized String d0() {
        return d("advertiser");
    }

    public final synchronized List e() {
        return this.e;
    }

    public final synchronized String e0() {
        return d("body");
    }

    public final synchronized List f() {
        return this.f;
    }

    public final synchronized String f0() {
        return d("call_to_action");
    }

    public final synchronized void g() {
        a74 a74Var = this.i;
        if (a74Var != null) {
            a74Var.destroy();
            this.i = null;
        }
        a74 a74Var2 = this.j;
        if (a74Var2 != null) {
            a74Var2.destroy();
            this.j = null;
        }
        a74 a74Var3 = this.k;
        if (a74Var3 != null) {
            a74Var3.destroy();
            this.k = null;
        }
        this.l = null;
        this.t.clear();
        this.u.clear();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    public final synchronized String g0() {
        return this.s;
    }

    public final synchronized void h(nc3 nc3Var) {
        this.c = nc3Var;
    }

    public final synchronized String h0() {
        return d("headline");
    }

    public final synchronized void i(String str) {
        this.s = str;
    }

    public final synchronized void j(zzel zzelVar) {
        this.g = zzelVar;
    }

    public final synchronized void k(vc3 vc3Var) {
        this.q = vc3Var;
    }

    public final synchronized void l(String str, dc3 dc3Var) {
        if (dc3Var == null) {
            this.t.remove(str);
        } else {
            this.t.put(str, dc3Var);
        }
    }

    public final synchronized void m(a74 a74Var) {
        this.j = a74Var;
    }

    public final synchronized void n(List list) {
        this.e = list;
    }

    public final synchronized void o(vc3 vc3Var) {
        this.r = vc3Var;
    }

    public final synchronized void p(float f) {
        this.v = f;
    }

    public final synchronized void q(List list) {
        this.f = list;
    }

    public final synchronized void r(a74 a74Var) {
        this.k = a74Var;
    }

    public final synchronized void s(String str) {
        this.w = str;
    }

    public final synchronized void t(double d) {
        this.p = d;
    }

    public final synchronized void u(String str, String str2) {
        if (str2 == null) {
            this.u.remove(str);
        } else {
            this.u.put(str, str2);
        }
    }

    public final synchronized void v(int i) {
        this.a = i;
    }

    public final synchronized void w(zzdq zzdqVar) {
        this.b = zzdqVar;
    }

    public final synchronized void x(View view) {
        this.m = view;
    }

    public final synchronized void y(a74 a74Var) {
        this.i = a74Var;
    }

    public final synchronized void z(View view) {
        this.n = view;
    }
}
