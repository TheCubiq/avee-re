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

    /* renamed from: G */
    public static final y17 f8078G = y17.m4255z("3010", "3008", "1005", "1009", "2011", "2007");

    /* renamed from: A */
    public final Context f8079A;

    /* renamed from: B */
    public final g35 f8080B;

    /* renamed from: C */
    public final dz5 f8081C;

    /* renamed from: D */
    public final Map f8082D;

    /* renamed from: E */
    public final List f8083E;

    /* renamed from: F */
    public final s03 f8084F;

    /* renamed from: i */
    public final Executor f8085i;

    /* renamed from: j */
    public final j35 f8086j;

    /* renamed from: k */
    public final r35 f8087k;

    /* renamed from: l */
    public final l45 f8088l;

    /* renamed from: m */
    public final o35 f8089m;

    /* renamed from: n */
    public final u35 f8090n;

    /* renamed from: o */
    public final qz7 f8091o;

    /* renamed from: p */
    public final qz7 f8092p;

    /* renamed from: q */
    public final qz7 f8093q;

    /* renamed from: r */
    public final qz7 f8094r;

    /* renamed from: s */
    public final qz7 f8095s;

    /* renamed from: t */
    public k55 f8096t;

    /* renamed from: u */
    public boolean f8097u;

    /* renamed from: v */
    public boolean f8098v;

    /* renamed from: w */
    public boolean f8099w;

    /* renamed from: x */
    public final sx3 f8100x;

    /* renamed from: y */
    public final sl2 f8101y;

    /* renamed from: z */
    public final zzchu f8102z;

    public e35(yl4 yl4Var, Executor executor, j35 j35Var, r35 r35Var, l45 l45Var, o35 o35Var, u35 u35Var, qz7 qz7Var, qz7 qz7Var2, qz7 qz7Var3, qz7 qz7Var4, qz7 qz7Var5, sx3 sx3Var, sl2 sl2Var, zzchu zzchuVar, Context context, g35 g35Var, dz5 dz5Var, s03 s03Var) {
        super(yl4Var);
        this.f8085i = executor;
        this.f8086j = j35Var;
        this.f8087k = r35Var;
        this.f8088l = l45Var;
        this.f8089m = o35Var;
        this.f8090n = u35Var;
        this.f8091o = qz7Var;
        this.f8092p = qz7Var2;
        this.f8093q = qz7Var3;
        this.f8094r = qz7Var4;
        this.f8095s = qz7Var5;
        this.f8100x = sx3Var;
        this.f8101y = sl2Var;
        this.f8102z = zzchuVar;
        this.f8079A = context;
        this.f8080B = g35Var;
        this.f8081C = dz5Var;
        this.f8082D = new HashMap();
        this.f8083E = new ArrayList();
        this.f8084F = s03Var;
    }

    /* renamed from: A */
    public static boolean m23778A(View view) {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10510O8)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        zzt.zzp();
        long zzt = zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzt >= ((Integer) zzba.zzc().m23658b(g93.f10520P8)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public static /* synthetic */ void m23764O(e35 e35Var) {
        try {
            j35 j35Var = e35Var.f8086j;
            int m19145K = j35Var.m19145K();
            if (m19145K == 1) {
                if (e35Var.f8090n.m8601b() != null) {
                    e35Var.m23761R("Google", true);
                    e35Var.f8090n.m8601b().mo2464g0((pd3) e35Var.f8091o.zzb());
                }
            } else if (m19145K == 2) {
                if (e35Var.f8090n.m8602a() != null) {
                    e35Var.m23761R("Google", true);
                    e35Var.f8090n.m8602a().mo6154V0((nd3) e35Var.f8092p.zzb());
                }
            } else if (m19145K == 3) {
                if (e35Var.f8090n.m8599d(j35Var.m19116g0()) != null) {
                    if (e35Var.f8086j.m19130Z() != null) {
                        e35Var.m23761R("Google", true);
                    }
                    e35Var.f8090n.m8599d(e35Var.f8086j.m19116g0()).mo8857e2((sd3) e35Var.f8095s.zzb());
                }
            } else if (m19145K == 6) {
                if (e35Var.f8090n.m8597f() != null) {
                    e35Var.m23761R("Google", true);
                    e35Var.f8090n.m8597f().mo5844c2((ye3) e35Var.f8093q.zzb());
                }
            } else if (m19145K != 7) {
                k04.zzg("Wrong native template id!");
            } else {
                u35 u35Var = e35Var.f8090n;
                if (u35Var.m8596g() != null) {
                    u35Var.m8596g().mo10288t0((mj3) e35Var.f8094r.zzb());
                }
            }
        } catch (RemoteException e) {
            k04.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* renamed from: B */
    public final synchronized boolean m23777B(Bundle bundle) {
        if (this.f8098v) {
            return true;
        }
        boolean mo11801d = this.f8087k.mo11801d(bundle);
        this.f8098v = mo11801d;
        return mo11801d;
    }

    /* renamed from: C */
    public final synchronized View m23776C(Map map) {
        if (map == null) {
            return null;
        }
        y17 y17Var = f8078G;
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

    /* renamed from: D */
    public final synchronized ImageView.ScaleType m23775D() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10706h7)).booleanValue()) {
            k55 k55Var = this.f8096t;
            if (k55Var == null) {
                k04.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
                return null;
            }
            yd0 zzj = k55Var.zzj();
            if (zzj != null) {
                return (ImageView.ScaleType) nt0.m14831M(zzj);
            }
            return l45.f17051k;
        }
        return null;
    }

    /* renamed from: E */
    public final synchronized void m23774E(View view, Map map, Map map2) {
        this.f8088l.m17139d(this.f8096t);
        this.f8087k.mo11803b(view, map, map2, m23775D());
        this.f8098v = true;
    }

    /* renamed from: F */
    public final synchronized void m23757V(k55 k55Var) {
        Iterator<String> keys;
        View view;
        ol2 m10202c;
        if (this.f8097u) {
            return;
        }
        this.f8096t = k55Var;
        this.f8088l.m17138e(k55Var);
        this.f8087k.mo11799f(k55Var.zzf(), k55Var.zzm(), k55Var.zzn(), k55Var, k55Var);
        if (((Boolean) zzba.zzc().m23658b(g93.f10723j2)).booleanValue() && (m10202c = this.f8101y.m10202c()) != null) {
            m10202c.zzn(k55Var.zzf());
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10361A1)).booleanValue()) {
            th6 th6Var = this.f35205b;
            if (th6Var.f27705m0 && (keys = th6Var.f27703l0.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.f8096t.zzl().get(next);
                    this.f8082D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        r03 r03Var = new r03(this.f8079A, view);
                        this.f8083E.add(r03Var);
                        r03Var.m11874c(new d35(this, next));
                    }
                }
            }
        }
        if (k55Var.zzi() != null) {
            k55Var.zzi().m11874c(this.f8100x);
        }
    }

    /* renamed from: G */
    public final void m23756W(k55 k55Var) {
        this.f8087k.mo11802c(k55Var.zzf(), k55Var.zzl());
        if (k55Var.zzh() != null) {
            k55Var.zzh().setClickable(false);
            k55Var.zzh().removeAllViews();
        }
        if (k55Var.zzi() != null) {
            k55Var.zzi().m11872e(this.f8100x);
        }
        this.f8096t = null;
    }

    /* renamed from: H */
    public final synchronized int m23771H() {
        return this.f8087k.zza();
    }

    /* renamed from: I */
    public final g35 m23770I() {
        return this.f8080B;
    }

    /* renamed from: K */
    public final String m23768K() {
        return this.f8089m.mo14581b();
    }

    /* renamed from: M */
    public final synchronized JSONObject m23766M(View view, Map map, Map map2) {
        return this.f8087k.mo11795j(view, map, map2, m23775D());
    }

    /* renamed from: N */
    public final synchronized JSONObject m23765N(View view, Map map, Map map2) {
        return this.f8087k.mo11789p(view, map, map2, m23775D());
    }

    /* renamed from: P */
    public final void m23763P(View view) {
        yd0 m19124c0 = this.f8086j.m19124c0();
        if (!this.f8089m.mo14579d() || m19124c0 == null || view == null) {
            return;
        }
        zzt.zzA();
        if (((Boolean) zzba.zzc().m23658b(g93.f10890y4)).booleanValue() && rp6.m11081b()) {
            Object m14831M = nt0.m14831M(m19124c0);
            if (m14831M instanceof tp6) {
                ((tp6) m14831M).mo4836b(view, zp6.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    /* renamed from: Q */
    public final synchronized void m23762Q() {
        this.f8087k.zzh();
    }

    /* renamed from: R */
    public final void m23761R(String str, boolean z) {
        String str2;
        oq5 oq5Var;
        pq5 pq5Var;
        if (!this.f8089m.mo14579d() || TextUtils.isEmpty(str)) {
            return;
        }
        j35 j35Var = this.f8086j;
        a74 m19131Y = j35Var.m19131Y();
        a74 m19130Z = j35Var.m19130Z();
        if (m19131Y == null && m19130Z == null) {
            k04.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z2 = false;
        boolean z3 = m19131Y != null;
        boolean z4 = m19130Z != null;
        if (((Boolean) zzba.zzc().m23658b(g93.f10386C4)).booleanValue()) {
            this.f8089m.mo14582a();
            int m8111b = this.f8089m.mo14582a().m8111b();
            int i = m8111b - 1;
            if (i != 0) {
                if (i != 1) {
                    k04.zzj("Unknown omid media type: " + (m8111b != 1 ? m8111b != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return;
                } else if (m19131Y == null) {
                    k04.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z2 = true;
                    z4 = false;
                }
            } else if (m19130Z == null) {
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
            m19131Y = m19130Z;
        }
        String str3 = str2;
        m19131Y.mo6416h();
        if (!zzt.zzA().mo14876d(this.f8079A)) {
            k04.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzchu zzchuVar = this.f8102z;
        String str4 = zzchuVar.f36994q + "." + zzchuVar.f36995r;
        if (z4) {
            oq5Var = oq5.VIDEO;
            pq5Var = pq5.DEFINED_BY_JAVASCRIPT;
        } else {
            oq5Var = oq5.NATIVE_DISPLAY;
            pq5Var = this.f8086j.m19145K() == 3 ? pq5.UNSPECIFIED : pq5.ONE_PIXEL;
        }
        yd0 mo14879a = zzt.zzA().mo14879a(str4, m19131Y.mo6416h(), "", "javascript", str3, str, pq5Var, oq5Var, this.f35205b.f27707n0);
        if (mo14879a == null) {
            k04.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.f8086j.m19154B(mo14879a);
        m19131Y.mo6438R(mo14879a);
        if (z4) {
            zzt.zzA().mo14878b(mo14879a, m19130Z.mo6418g());
            this.f8099w = true;
        }
        if (z) {
            zzt.zzA().zzd(mo14879a);
            m19131Y.mo6434T("onSdkLoaded", new C1370g6());
        }
    }

    /* renamed from: S */
    public final /* synthetic */ void m23760S() {
        this.f8087k.zzi();
        this.f8086j.m19117g();
    }

    /* renamed from: T */
    public final /* synthetic */ void m23759T(View view, boolean z, int i) {
        this.f8087k.mo11793l(view, this.f8096t.zzf(), this.f8096t.zzl(), this.f8096t.zzm(), z, m23775D(), i);
    }

    /* renamed from: U */
    public final /* synthetic */ void m23758U(boolean z) {
        this.f8087k.mo11793l(null, this.f8096t.zzf(), this.f8096t.zzl(), this.f8096t.zzm(), z, m23775D(), 0);
    }

    /* renamed from: X */
    public final synchronized void m23755X(View view, Map map, Map map2, boolean z) {
        if (this.f8098v) {
            return;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10361A1)).booleanValue() && this.f35205b.f27705m0) {
            for (String str : this.f8082D.keySet()) {
                if (!((Boolean) this.f8082D.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10801q3)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && m23778A(view2)) {
                        m23774E(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View m23776C = m23776C(map);
        if (m23776C == null) {
            m23774E(view, map, map2);
            return;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10812r3)).booleanValue()) {
            if (m23778A(m23776C)) {
                m23774E(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) zzba.zzc().m23658b(g93.f10823s3)).booleanValue()) {
            m23774E(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (m23776C.getGlobalVisibleRect(rect, null) && m23776C.getHeight() == rect.height() && m23776C.getWidth() == rect.width()) {
            m23774E(view, map, map2);
        }
    }

    /* renamed from: Y */
    public final synchronized void m23754Y(zzcw zzcwVar) {
        this.f8087k.mo11790o(zzcwVar);
    }

    /* renamed from: Z */
    public final synchronized void m23753Z(View view, View view2, Map map, Map map2, boolean z) {
        this.f8088l.m17140c(this.f8096t);
        this.f8087k.mo11798g(view, view2, map, map2, z, m23775D());
        if (this.f8099w) {
            j35 j35Var = this.f8086j;
            if (j35Var.m19130Z() != null) {
                j35Var.m19130Z().mo6434T("onSdkAdUserInteractionClick", new C1370g6());
            }
        }
    }

    @Override // com.daaw.zl4
    /* renamed from: a */
    public final synchronized void mo2132a() {
        this.f8097u = true;
        this.f8085i.execute(new Runnable() { // from class: com.daaw.z25
            @Override // java.lang.Runnable
            public final void run() {
                e35.this.m23760S();
            }
        });
        super.mo2132a();
    }

    @Override // com.daaw.zl4
    /* renamed from: b */
    public final void mo2131b() {
        this.f8085i.execute(new Runnable() { // from class: com.daaw.v25
            @Override // java.lang.Runnable
            public final void run() {
                e35.m23764O(e35.this);
            }
        });
        if (this.f8086j.m19145K() != 7) {
            Executor executor = this.f8085i;
            final r35 r35Var = this.f8087k;
            r35Var.getClass();
            executor.execute(new Runnable() { // from class: com.daaw.w25
                @Override // java.lang.Runnable
                public final void run() {
                    r35.this.zzp();
                }
            });
        }
        super.mo2131b();
    }

    /* renamed from: h */
    public final synchronized void m23752h(final View view, final int i) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10873w9)).booleanValue()) {
            k55 k55Var = this.f8096t;
            if (k55Var == null) {
                k04.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            final boolean z = k55Var instanceof f45;
            this.f8085i.execute(new Runnable() { // from class: com.daaw.t25
                @Override // java.lang.Runnable
                public final void run() {
                    e35.this.m23759T(view, z, i);
                }
            });
        }
    }

    /* renamed from: i */
    public final synchronized void m23751i(String str) {
        this.f8087k.mo11791n(str);
    }

    /* renamed from: j */
    public final synchronized void m23750j(Bundle bundle) {
        this.f8087k.mo11797h(bundle);
    }

    /* renamed from: k */
    public final synchronized void m23749k() {
        k55 k55Var = this.f8096t;
        if (k55Var == null) {
            k04.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = k55Var instanceof f45;
        this.f8085i.execute(new Runnable() { // from class: com.daaw.x25
            @Override // java.lang.Runnable
            public final void run() {
                e35.this.m23758U(z);
            }
        });
    }

    /* renamed from: l */
    public final synchronized void m23748l() {
        if (this.f8098v) {
            return;
        }
        this.f8087k.zzr();
    }

    /* renamed from: m */
    public final void m23747m(View view) {
        j35 j35Var = this.f8086j;
        yd0 m19124c0 = j35Var.m19124c0();
        a74 m19131Y = j35Var.m19131Y();
        if (!this.f8089m.mo14579d() || m19124c0 == null || m19131Y == null || view == null) {
            return;
        }
        zzt.zzA().mo14878b(m19124c0, view);
    }

    /* renamed from: n */
    public final synchronized void m23746n(View view, MotionEvent motionEvent, View view2) {
        this.f8087k.mo11804a(view, motionEvent, view2);
    }

    /* renamed from: o */
    public final synchronized void m23745o(Bundle bundle) {
        this.f8087k.mo11796i(bundle);
    }

    /* renamed from: p */
    public final synchronized void m23744p(View view) {
        this.f8087k.mo11800e(view);
    }

    /* renamed from: q */
    public final synchronized void m23743q() {
        this.f8087k.zzv();
    }

    /* renamed from: r */
    public final synchronized void m23742r(zzcs zzcsVar) {
        this.f8087k.mo11794k(zzcsVar);
    }

    /* renamed from: s */
    public final synchronized void m23741s(zzdg zzdgVar) {
        this.f8081C.m23803a(zzdgVar);
    }

    /* renamed from: t */
    public final synchronized void m23740t(ve3 ve3Var) {
        this.f8087k.mo11792m(ve3Var);
    }

    /* renamed from: u */
    public final synchronized void m23739u(final k55 k55Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10887y1)).booleanValue()) {
            zzs.zza.post(new Runnable() { // from class: com.daaw.y25
                @Override // java.lang.Runnable
                public final void run() {
                    e35.this.m23757V(k55Var);
                }
            });
        } else {
            m23757V(k55Var);
        }
    }

    /* renamed from: v */
    public final synchronized void m23738v(final k55 k55Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10887y1)).booleanValue()) {
            zzs.zza.post(new Runnable() { // from class: com.daaw.u25
                @Override // java.lang.Runnable
                public final void run() {
                    e35.this.m23756W(k55Var);
                }
            });
        } else {
            m23756W(k55Var);
        }
    }

    /* renamed from: w */
    public final boolean m23737w() {
        return this.f8089m.mo14578e();
    }

    /* renamed from: x */
    public final synchronized boolean m23736x() {
        return this.f8087k.zzA();
    }

    /* renamed from: y */
    public final synchronized boolean m23735y() {
        return this.f8087k.zzB();
    }

    /* renamed from: z */
    public final boolean m23734z() {
        return this.f8089m.mo14579d();
    }
}
