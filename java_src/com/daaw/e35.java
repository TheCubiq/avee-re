package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e35 extends zl4 {
    public static final y17 G = y17.z("3010", "3008", "1005", "1009", "2011", "2007");
    public final Context A;
    public final g35 B;
    public final dz5 C;
    public final Map D;
    public final List E;
    public final s03 F;
    public final Executor i;
    public final j35 j;
    public final r35 k;
    public final l45 l;
    public final o35 m;
    public final u35 n;
    public final qz7 o;
    public final qz7 p;
    public final qz7 q;
    public final qz7 r;
    public final qz7 s;
    public k55 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final sx3 x;
    public final sl2 y;
    public final zzchu z;

    public e35(yl4 yl4Var, Executor executor, j35 j35Var, r35 r35Var, l45 l45Var, o35 o35Var, u35 u35Var, qz7 qz7Var, qz7 qz7Var2, qz7 qz7Var3, qz7 qz7Var4, qz7 qz7Var5, sx3 sx3Var, sl2 sl2Var, zzchu zzchuVar, Context context, g35 g35Var, dz5 dz5Var, s03 s03Var) {
        super(yl4Var);
        this.i = executor;
        this.j = j35Var;
        this.k = r35Var;
        this.l = l45Var;
        this.m = o35Var;
        this.n = u35Var;
        this.o = qz7Var;
        this.p = qz7Var2;
        this.q = qz7Var3;
        this.r = qz7Var4;
        this.s = qz7Var5;
        this.x = sx3Var;
        this.y = sl2Var;
        this.z = zzchuVar;
        this.A = context;
        this.B = g35Var;
        this.C = dz5Var;
        this.D = new HashMap();
        this.E = new ArrayList();
        this.F = s03Var;
    }

    public static boolean A(View view) {
        if (!((Boolean) zzba.zzc().b(g93.O8)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        zzt.zzp();
        long zzt = zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzt >= ((Integer) zzba.zzc().b(g93.P8)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void O(e35 e35Var) {
        try {
            j35 j35Var = e35Var.j;
            int K = j35Var.K();
            if (K == 1) {
                if (e35Var.n.b() != null) {
                    e35Var.R("Google", true);
                    e35Var.n.b().g0((pd3) e35Var.o.zzb());
                }
            } else if (K == 2) {
                if (e35Var.n.a() != null) {
                    e35Var.R("Google", true);
                    e35Var.n.a().V0((nd3) e35Var.p.zzb());
                }
            } else if (K == 3) {
                if (e35Var.n.d(j35Var.g0()) != null) {
                    if (e35Var.j.Z() != null) {
                        e35Var.R("Google", true);
                    }
                    e35Var.n.d(e35Var.j.g0()).e2((sd3) e35Var.s.zzb());
                }
            } else if (K == 6) {
                if (e35Var.n.f() != null) {
                    e35Var.R("Google", true);
                    e35Var.n.f().c2((ye3) e35Var.q.zzb());
                }
            } else if (K != 7) {
                k04.zzg("Wrong native template id!");
            } else {
                u35 u35Var = e35Var.n;
                if (u35Var.g() != null) {
                    u35Var.g().t0((mj3) e35Var.r.zzb());
                }
            }
        } catch (RemoteException e) {
            k04.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized boolean B(Bundle bundle) {
        if (this.v) {
            return true;
        }
        boolean d = this.k.d(bundle);
        this.v = d;
        return d;
    }

    public final synchronized View C(Map map) {
        if (map == null) {
            return null;
        }
        y17 y17Var = G;
        int size = y17Var.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) y17Var.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    public final synchronized ImageView.ScaleType D() {
        if (((Boolean) zzba.zzc().b(g93.h7)).booleanValue()) {
            k55 k55Var = this.t;
            if (k55Var == null) {
                k04.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
                return null;
            }
            yd0 zzj = k55Var.zzj();
            if (zzj != null) {
                return (ImageView.ScaleType) nt0.M(zzj);
            }
            return l45.k;
        }
        return null;
    }

    public final synchronized void E(View view, Map map, Map map2) {
        this.l.d(this.t);
        this.k.b(view, map, map2, D());
        this.v = true;
    }

    /* renamed from: F */
    public final synchronized void V(k55 k55Var) {
        Iterator<String> keys;
        View view;
        ol2 c;
        if (this.u) {
            return;
        }
        this.t = k55Var;
        this.l.e(k55Var);
        this.k.f(k55Var.zzf(), k55Var.zzm(), k55Var.zzn(), k55Var, k55Var);
        if (((Boolean) zzba.zzc().b(g93.j2)).booleanValue() && (c = this.y.c()) != null) {
            c.zzn(k55Var.zzf());
        }
        if (((Boolean) zzba.zzc().b(g93.A1)).booleanValue()) {
            th6 th6Var = this.b;
            if (th6Var.m0 && (keys = th6Var.l0.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.t.zzl().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        r03 r03Var = new r03(this.A, view);
                        this.E.add(r03Var);
                        r03Var.c(new d35(this, next));
                    }
                }
            }
        }
        if (k55Var.zzi() != null) {
            k55Var.zzi().c(this.x);
        }
    }

    /* renamed from: G */
    public final void W(k55 k55Var) {
        this.k.c(k55Var.zzf(), k55Var.zzl());
        if (k55Var.zzh() != null) {
            k55Var.zzh().setClickable(false);
            k55Var.zzh().removeAllViews();
        }
        if (k55Var.zzi() != null) {
            k55Var.zzi().e(this.x);
        }
        this.t = null;
    }

    public final synchronized int H() {
        return this.k.zza();
    }

    public final g35 I() {
        return this.B;
    }

    public final String K() {
        return this.m.b();
    }

    public final synchronized JSONObject M(View view, Map map, Map map2) {
        return this.k.j(view, map, map2, D());
    }

    public final synchronized JSONObject N(View view, Map map, Map map2) {
        return this.k.p(view, map, map2, D());
    }

    public final void P(View view) {
        yd0 c0 = this.j.c0();
        if (!this.m.d() || c0 == null || view == null) {
            return;
        }
        zzt.zzA();
        if (((Boolean) zzba.zzc().b(g93.y4)).booleanValue() && rp6.b()) {
            Object M = nt0.M(c0);
            if (M instanceof tp6) {
                ((tp6) M).b(view, zp6.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final synchronized void Q() {
        this.k.zzh();
    }

    public final void R(String str, boolean z) {
        String str2;
        oq5 oq5Var;
        pq5 pq5Var;
        if (!this.m.d() || TextUtils.isEmpty(str)) {
            return;
        }
        j35 j35Var = this.j;
        a74 Y = j35Var.Y();
        a74 Z = j35Var.Z();
        if (Y == null && Z == null) {
            k04.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z2 = false;
        boolean z3 = Y != null;
        boolean z4 = Z != null;
        if (((Boolean) zzba.zzc().b(g93.C4)).booleanValue()) {
            this.m.a();
            int b = this.m.a().b();
            int i = b - 1;
            if (i != 0) {
                if (i != 1) {
                    k04.zzj("Unknown omid media type: " + (b != 1 ? b != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return;
                } else if (Y == null) {
                    k04.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z2 = true;
                    z4 = false;
                }
            } else if (Z == null) {
                k04.zzj("Omid media type was video but there was no video webview.");
                return;
            } else {
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            Y = Z;
        }
        String str3 = str2;
        Y.h();
        if (!zzt.zzA().d(this.A)) {
            k04.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzchu zzchuVar = this.z;
        String str4 = zzchuVar.q + "." + zzchuVar.r;
        if (z4) {
            oq5Var = oq5.VIDEO;
            pq5Var = pq5.DEFINED_BY_JAVASCRIPT;
        } else {
            oq5Var = oq5.NATIVE_DISPLAY;
            pq5Var = this.j.K() == 3 ? pq5.UNSPECIFIED : pq5.ONE_PIXEL;
        }
        yd0 a = zzt.zzA().a(str4, Y.h(), "", "javascript", str3, str, pq5Var, oq5Var, this.b.n0);
        if (a == null) {
            k04.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.j.B(a);
        Y.R(a);
        if (z4) {
            zzt.zzA().b(a, Z.g());
            this.w = true;
        }
        if (z) {
            zzt.zzA().zzd(a);
            Y.T("onSdkLoaded", new g6());
        }
    }

    public final /* synthetic */ void S() {
        this.k.zzi();
        this.j.g();
    }

    public final /* synthetic */ void T(View view, boolean z, int i) {
        this.k.l(view, this.t.zzf(), this.t.zzl(), this.t.zzm(), z, D(), i);
    }

    public final /* synthetic */ void U(boolean z) {
        this.k.l(null, this.t.zzf(), this.t.zzl(), this.t.zzm(), z, D(), 0);
    }

    public final synchronized void X(View view, Map map, Map map2, boolean z) {
        if (this.v) {
            return;
        }
        if (((Boolean) zzba.zzc().b(g93.A1)).booleanValue() && this.b.m0) {
            for (String str : this.D.keySet()) {
                if (!((Boolean) this.D.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) zzba.zzc().b(g93.q3)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && A(view2)) {
                        E(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View C = C(map);
        if (C == null) {
            E(view, map, map2);
            return;
        }
        if (((Boolean) zzba.zzc().b(g93.r3)).booleanValue()) {
            if (A(C)) {
                E(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) zzba.zzc().b(g93.s3)).booleanValue()) {
            E(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (C.getGlobalVisibleRect(rect, null) && C.getHeight() == rect.height() && C.getWidth() == rect.width()) {
            E(view, map, map2);
        }
    }

    public final synchronized void Y(zzcw zzcwVar) {
        this.k.o(zzcwVar);
    }

    public final synchronized void Z(View view, View view2, Map map, Map map2, boolean z) {
        this.l.c(this.t);
        this.k.g(view, view2, map, map2, z, D());
        if (this.w) {
            j35 j35Var = this.j;
            if (j35Var.Z() != null) {
                j35Var.Z().T("onSdkAdUserInteractionClick", new g6());
            }
        }
    }

    @Override // com.daaw.zl4
    public final synchronized void a() {
        this.u = true;
        this.i.execute(new Runnable() { // from class: com.daaw.z25
            @Override // java.lang.Runnable
            public final void run() {
                e35.this.S();
            }
        });
        super.a();
    }

    @Override // com.daaw.zl4
    public final void b() {
        this.i.execute(new Runnable() { // from class: com.daaw.v25
            @Override // java.lang.Runnable
            public final void run() {
                e35.O(e35.this);
            }
        });
        if (this.j.K() != 7) {
            Executor executor = this.i;
            final r35 r35Var = this.k;
            r35Var.getClass();
            executor.execute(new Runnable() { // from class: com.daaw.w25
                @Override // java.lang.Runnable
                public final void run() {
                    r35.this.zzp();
                }
            });
        }
        super.b();
    }

    public final synchronized void h(final View view, final int i) {
        if (((Boolean) zzba.zzc().b(g93.w9)).booleanValue()) {
            k55 k55Var = this.t;
            if (k55Var == null) {
                k04.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            final boolean z = k55Var instanceof f45;
            this.i.execute(new Runnable() { // from class: com.daaw.t25
                @Override // java.lang.Runnable
                public final void run() {
                    e35.this.T(view, z, i);
                }
            });
        }
    }

    public final synchronized void i(String str) {
        this.k.n(str);
    }

    public final synchronized void j(Bundle bundle) {
        this.k.h(bundle);
    }

    public final synchronized void k() {
        k55 k55Var = this.t;
        if (k55Var == null) {
            k04.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = k55Var instanceof f45;
        this.i.execute(new Runnable() { // from class: com.daaw.x25
            @Override // java.lang.Runnable
            public final void run() {
                e35.this.U(z);
            }
        });
    }

    public final synchronized void l() {
        if (this.v) {
            return;
        }
        this.k.zzr();
    }

    public final void m(View view) {
        j35 j35Var = this.j;
        yd0 c0 = j35Var.c0();
        a74 Y = j35Var.Y();
        if (!this.m.d() || c0 == null || Y == null || view == null) {
            return;
        }
        zzt.zzA().b(c0, view);
    }

    public final synchronized void n(View view, MotionEvent motionEvent, View view2) {
        this.k.a(view, motionEvent, view2);
    }

    public final synchronized void o(Bundle bundle) {
        this.k.i(bundle);
    }

    public final synchronized void p(View view) {
        this.k.e(view);
    }

    public final synchronized void q() {
        this.k.zzv();
    }

    public final synchronized void r(zzcs zzcsVar) {
        this.k.k(zzcsVar);
    }

    public final synchronized void s(zzdg zzdgVar) {
        this.C.a(zzdgVar);
    }

    public final synchronized void t(ve3 ve3Var) {
        this.k.m(ve3Var);
    }

    public final synchronized void u(final k55 k55Var) {
        if (((Boolean) zzba.zzc().b(g93.y1)).booleanValue()) {
            zzs.zza.post(new Runnable() { // from class: com.daaw.y25
                @Override // java.lang.Runnable
                public final void run() {
                    e35.this.V(k55Var);
                }
            });
        } else {
            V(k55Var);
        }
    }

    public final synchronized void v(final k55 k55Var) {
        if (((Boolean) zzba.zzc().b(g93.y1)).booleanValue()) {
            zzs.zza.post(new Runnable() { // from class: com.daaw.u25
                @Override // java.lang.Runnable
                public final void run() {
                    e35.this.W(k55Var);
                }
            });
        } else {
            W(k55Var);
        }
    }

    public final boolean w() {
        return this.m.e();
    }

    public final synchronized boolean x() {
        return this.k.zzA();
    }

    public final synchronized boolean y() {
        return this.k.zzB();
    }

    public final boolean z() {
        return this.m.d();
    }
}
