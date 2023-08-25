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

    /* renamed from: a */
    public int f14193a;

    /* renamed from: b */
    public zzdq f14194b;

    /* renamed from: c */
    public nc3 f14195c;

    /* renamed from: d */
    public View f14196d;

    /* renamed from: e */
    public List f14197e;

    /* renamed from: g */
    public zzel f14199g;

    /* renamed from: h */
    public Bundle f14200h;

    /* renamed from: i */
    public a74 f14201i;

    /* renamed from: j */
    public a74 f14202j;

    /* renamed from: k */
    public a74 f14203k;

    /* renamed from: l */
    public yd0 f14204l;

    /* renamed from: m */
    public View f14205m;

    /* renamed from: n */
    public View f14206n;

    /* renamed from: o */
    public yd0 f14207o;

    /* renamed from: p */
    public double f14208p;

    /* renamed from: q */
    public vc3 f14209q;

    /* renamed from: r */
    public vc3 f14210r;

    /* renamed from: s */
    public String f14211s;

    /* renamed from: v */
    public float f14214v;

    /* renamed from: w */
    public String f14215w;

    /* renamed from: t */
    public final cd1 f14212t = new cd1();

    /* renamed from: u */
    public final cd1 f14213u = new cd1();

    /* renamed from: f */
    public List f14198f = Collections.emptyList();

    /* renamed from: C */
    public static j35 m19153C(on3 on3Var) {
        try {
            i35 m19149G = m19149G(on3Var.m14138h3(), null);
            nc3 m14137i3 = on3Var.m14137i3();
            String zzo = on3Var.zzo();
            List m14133m3 = on3Var.m14133m3();
            String zzm = on3Var.zzm();
            Bundle zzf = on3Var.zzf();
            String zzn = on3Var.zzn();
            yd0 zzl = on3Var.zzl();
            String zzq = on3Var.zzq();
            String zzp = on3Var.zzp();
            double zze = on3Var.zze();
            vc3 m14136j3 = on3Var.m14136j3();
            j35 j35Var = new j35();
            j35Var.f14193a = 2;
            j35Var.f14194b = m19149G;
            j35Var.f14195c = m14137i3;
            j35Var.f14196d = (View) m19147I(on3Var.m14135k3());
            j35Var.m19101u("headline", zzo);
            j35Var.f14197e = m14133m3;
            j35Var.m19101u("body", zzm);
            j35Var.f14200h = zzf;
            j35Var.m19101u("call_to_action", zzn);
            j35Var.f14205m = (View) m19147I(on3Var.m14134l3());
            j35Var.f14207o = zzl;
            j35Var.m19101u("store", zzq);
            j35Var.m19101u("price", zzp);
            j35Var.f14208p = zze;
            j35Var.f14209q = m14136j3;
            return j35Var;
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: D */
    public static j35 m19152D(pn3 pn3Var) {
        try {
            i35 m19149G = m19149G(pn3Var.m13281h3(), null);
            nc3 m13280i3 = pn3Var.m13280i3();
            String zzo = pn3Var.zzo();
            List m13276m3 = pn3Var.m13276m3();
            String zzm = pn3Var.zzm();
            Bundle zze = pn3Var.zze();
            String zzn = pn3Var.zzn();
            yd0 m13277l3 = pn3Var.m13277l3();
            String zzl = pn3Var.zzl();
            vc3 m13279j3 = pn3Var.m13279j3();
            j35 j35Var = new j35();
            j35Var.f14193a = 1;
            j35Var.f14194b = m19149G;
            j35Var.f14195c = m13280i3;
            j35Var.f14196d = (View) m19147I(pn3Var.zzi());
            j35Var.m19101u("headline", zzo);
            j35Var.f14197e = m13276m3;
            j35Var.m19101u("body", zzm);
            j35Var.f14200h = zze;
            j35Var.m19101u("call_to_action", zzn);
            j35Var.f14205m = (View) m19147I(pn3Var.m13278k3());
            j35Var.f14207o = m13277l3;
            j35Var.m19101u("advertiser", zzl);
            j35Var.f14210r = m13279j3;
            return j35Var;
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: E */
    public static j35 m19151E(on3 on3Var) {
        try {
            return m19148H(m19149G(on3Var.m14138h3(), null), on3Var.m14137i3(), (View) m19147I(on3Var.m14135k3()), on3Var.zzo(), on3Var.m14133m3(), on3Var.zzm(), on3Var.zzf(), on3Var.zzn(), (View) m19147I(on3Var.m14134l3()), on3Var.zzl(), on3Var.zzq(), on3Var.zzp(), on3Var.zze(), on3Var.m14136j3(), null, 0.0f);
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: F */
    public static j35 m19150F(pn3 pn3Var) {
        try {
            return m19148H(m19149G(pn3Var.m13281h3(), null), pn3Var.m13280i3(), (View) m19147I(pn3Var.zzi()), pn3Var.zzo(), pn3Var.m13276m3(), pn3Var.zzm(), pn3Var.zze(), pn3Var.zzn(), (View) m19147I(pn3Var.m13278k3()), pn3Var.m13277l3(), null, null, -1.0d, pn3Var.m13279j3(), pn3Var.zzl(), 0.0f);
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: G */
    public static i35 m19149G(zzdq zzdqVar, sn3 sn3Var) {
        if (zzdqVar == null) {
            return null;
        }
        return new i35(zzdqVar, sn3Var);
    }

    /* renamed from: H */
    public static j35 m19148H(zzdq zzdqVar, nc3 nc3Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, yd0 yd0Var, String str4, String str5, double d, vc3 vc3Var, String str6, float f) {
        j35 j35Var = new j35();
        j35Var.f14193a = 6;
        j35Var.f14194b = zzdqVar;
        j35Var.f14195c = nc3Var;
        j35Var.f14196d = view;
        j35Var.m19101u("headline", str);
        j35Var.f14197e = list;
        j35Var.m19101u("body", str2);
        j35Var.f14200h = bundle;
        j35Var.m19101u("call_to_action", str3);
        j35Var.f14205m = view2;
        j35Var.f14207o = yd0Var;
        j35Var.m19101u("store", str4);
        j35Var.m19101u("price", str5);
        j35Var.f14208p = d;
        j35Var.f14209q = vc3Var;
        j35Var.m19101u("advertiser", str6);
        j35Var.m19106p(f);
        return j35Var;
    }

    /* renamed from: I */
    public static Object m19147I(yd0 yd0Var) {
        if (yd0Var == null) {
            return null;
        }
        return nt0.m14831M(yd0Var);
    }

    /* renamed from: a0 */
    public static j35 m19128a0(sn3 sn3Var) {
        try {
            return m19148H(m19149G(sn3Var.zzj(), sn3Var), sn3Var.zzk(), (View) m19147I(sn3Var.zzm()), sn3Var.zzs(), sn3Var.zzv(), sn3Var.zzq(), sn3Var.zzi(), sn3Var.zzr(), (View) m19147I(sn3Var.zzn()), sn3Var.zzo(), sn3Var.mo10146b(), sn3Var.zzt(), sn3Var.zze(), sn3Var.zzl(), sn3Var.zzp(), sn3Var.zzf());
        } catch (RemoteException e) {
            k04.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized double m19155A() {
        return this.f14208p;
    }

    /* renamed from: B */
    public final synchronized void m19154B(yd0 yd0Var) {
        this.f14204l = yd0Var;
    }

    /* renamed from: J */
    public final synchronized float m19146J() {
        return this.f14214v;
    }

    /* renamed from: K */
    public final synchronized int m19145K() {
        return this.f14193a;
    }

    /* renamed from: L */
    public final synchronized Bundle m19144L() {
        if (this.f14200h == null) {
            this.f14200h = new Bundle();
        }
        return this.f14200h;
    }

    /* renamed from: M */
    public final synchronized View m19143M() {
        return this.f14196d;
    }

    /* renamed from: N */
    public final synchronized View m19142N() {
        return this.f14205m;
    }

    /* renamed from: O */
    public final synchronized View m19141O() {
        return this.f14206n;
    }

    /* renamed from: P */
    public final synchronized cd1 m19140P() {
        return this.f14212t;
    }

    /* renamed from: Q */
    public final synchronized cd1 m19139Q() {
        return this.f14213u;
    }

    /* renamed from: R */
    public final synchronized zzdq m19138R() {
        return this.f14194b;
    }

    /* renamed from: S */
    public final synchronized zzel m19137S() {
        return this.f14199g;
    }

    /* renamed from: T */
    public final synchronized nc3 m19136T() {
        return this.f14195c;
    }

    /* renamed from: U */
    public final vc3 m19135U() {
        List list = this.f14197e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.f14197e.get(0);
            if (obj instanceof IBinder) {
                return uc3.m8320g3((IBinder) obj);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final synchronized vc3 m19134V() {
        return this.f14209q;
    }

    /* renamed from: W */
    public final synchronized vc3 m19133W() {
        return this.f14210r;
    }

    /* renamed from: X */
    public final synchronized a74 m19132X() {
        return this.f14202j;
    }

    /* renamed from: Y */
    public final synchronized a74 m19131Y() {
        return this.f14203k;
    }

    /* renamed from: Z */
    public final synchronized a74 m19130Z() {
        return this.f14201i;
    }

    /* renamed from: a */
    public final synchronized String m19129a() {
        return this.f14215w;
    }

    /* renamed from: b */
    public final synchronized String m19127b() {
        return m19123d("price");
    }

    /* renamed from: b0 */
    public final synchronized yd0 m19126b0() {
        return this.f14207o;
    }

    /* renamed from: c */
    public final synchronized String m19125c() {
        return m19123d("store");
    }

    /* renamed from: c0 */
    public final synchronized yd0 m19124c0() {
        return this.f14204l;
    }

    /* renamed from: d */
    public final synchronized String m19123d(String str) {
        return (String) this.f14213u.get(str);
    }

    /* renamed from: d0 */
    public final synchronized String m19122d0() {
        return m19123d("advertiser");
    }

    /* renamed from: e */
    public final synchronized List m19121e() {
        return this.f14197e;
    }

    /* renamed from: e0 */
    public final synchronized String m19120e0() {
        return m19123d("body");
    }

    /* renamed from: f */
    public final synchronized List m19119f() {
        return this.f14198f;
    }

    /* renamed from: f0 */
    public final synchronized String m19118f0() {
        return m19123d("call_to_action");
    }

    /* renamed from: g */
    public final synchronized void m19117g() {
        a74 a74Var = this.f14201i;
        if (a74Var != null) {
            a74Var.destroy();
            this.f14201i = null;
        }
        a74 a74Var2 = this.f14202j;
        if (a74Var2 != null) {
            a74Var2.destroy();
            this.f14202j = null;
        }
        a74 a74Var3 = this.f14203k;
        if (a74Var3 != null) {
            a74Var3.destroy();
            this.f14203k = null;
        }
        this.f14204l = null;
        this.f14212t.clear();
        this.f14213u.clear();
        this.f14194b = null;
        this.f14195c = null;
        this.f14196d = null;
        this.f14197e = null;
        this.f14200h = null;
        this.f14205m = null;
        this.f14206n = null;
        this.f14207o = null;
        this.f14209q = null;
        this.f14210r = null;
        this.f14211s = null;
    }

    /* renamed from: g0 */
    public final synchronized String m19116g0() {
        return this.f14211s;
    }

    /* renamed from: h */
    public final synchronized void m19115h(nc3 nc3Var) {
        this.f14195c = nc3Var;
    }

    /* renamed from: h0 */
    public final synchronized String m19114h0() {
        return m19123d("headline");
    }

    /* renamed from: i */
    public final synchronized void m19113i(String str) {
        this.f14211s = str;
    }

    /* renamed from: j */
    public final synchronized void m19112j(zzel zzelVar) {
        this.f14199g = zzelVar;
    }

    /* renamed from: k */
    public final synchronized void m19111k(vc3 vc3Var) {
        this.f14209q = vc3Var;
    }

    /* renamed from: l */
    public final synchronized void m19110l(String str, dc3 dc3Var) {
        if (dc3Var == null) {
            this.f14212t.remove(str);
        } else {
            this.f14212t.put(str, dc3Var);
        }
    }

    /* renamed from: m */
    public final synchronized void m19109m(a74 a74Var) {
        this.f14202j = a74Var;
    }

    /* renamed from: n */
    public final synchronized void m19108n(List list) {
        this.f14197e = list;
    }

    /* renamed from: o */
    public final synchronized void m19107o(vc3 vc3Var) {
        this.f14210r = vc3Var;
    }

    /* renamed from: p */
    public final synchronized void m19106p(float f) {
        this.f14214v = f;
    }

    /* renamed from: q */
    public final synchronized void m19105q(List list) {
        this.f14198f = list;
    }

    /* renamed from: r */
    public final synchronized void m19104r(a74 a74Var) {
        this.f14203k = a74Var;
    }

    /* renamed from: s */
    public final synchronized void m19103s(String str) {
        this.f14215w = str;
    }

    /* renamed from: t */
    public final synchronized void m19102t(double d) {
        this.f14208p = d;
    }

    /* renamed from: u */
    public final synchronized void m19101u(String str, String str2) {
        if (str2 == null) {
            this.f14213u.remove(str);
        } else {
            this.f14213u.put(str, str2);
        }
    }

    /* renamed from: v */
    public final synchronized void m19100v(int i) {
        this.f14193a = i;
    }

    /* renamed from: w */
    public final synchronized void m19099w(zzdq zzdqVar) {
        this.f14194b = zzdqVar;
    }

    /* renamed from: x */
    public final synchronized void m19098x(View view) {
        this.f14205m = view;
    }

    /* renamed from: y */
    public final synchronized void m19097y(a74 a74Var) {
        this.f14201i = a74Var;
    }

    /* renamed from: z */
    public final synchronized void m19096z(View view) {
        this.f14206n = view;
    }
}
