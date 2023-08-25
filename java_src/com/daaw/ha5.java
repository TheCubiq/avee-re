package com.daaw;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ha5 {

    /* renamed from: a */
    public final jq4 f12298a;

    /* renamed from: b */
    public final ty4 f12299b;

    /* renamed from: c */
    public final vr4 f12300c;

    /* renamed from: d */
    public final ls4 f12301d;

    /* renamed from: e */
    public final xs4 f12302e;

    /* renamed from: f */
    public final uv4 f12303f;

    /* renamed from: g */
    public final Executor f12304g;

    /* renamed from: h */
    public final ny4 f12305h;

    /* renamed from: i */
    public final ah4 f12306i;

    /* renamed from: j */
    public final zzb f12307j;

    /* renamed from: k */
    public final cx3 f12308k;

    /* renamed from: l */
    public final sl2 f12309l;

    /* renamed from: m */
    public final iv4 f12310m;

    /* renamed from: n */
    public final cq5 f12311n;

    /* renamed from: o */
    public final op6 f12312o;

    /* renamed from: p */
    public final kd5 f12313p;

    /* renamed from: q */
    public final on6 f12314q;

    public ha5(jq4 jq4Var, vr4 vr4Var, ls4 ls4Var, xs4 xs4Var, uv4 uv4Var, Executor executor, ny4 ny4Var, ah4 ah4Var, zzb zzbVar, cx3 cx3Var, sl2 sl2Var, iv4 iv4Var, cq5 cq5Var, op6 op6Var, kd5 kd5Var, on6 on6Var, ty4 ty4Var) {
        this.f12298a = jq4Var;
        this.f12300c = vr4Var;
        this.f12301d = ls4Var;
        this.f12302e = xs4Var;
        this.f12303f = uv4Var;
        this.f12304g = executor;
        this.f12305h = ny4Var;
        this.f12306i = ah4Var;
        this.f12307j = zzbVar;
        this.f12308k = cx3Var;
        this.f12309l = sl2Var;
        this.f12310m = iv4Var;
        this.f12311n = cq5Var;
        this.f12312o = op6Var;
        this.f12313p = kd5Var;
        this.f12314q = on6Var;
        this.f12299b = ty4Var;
    }

    /* renamed from: j */
    public static final f77 m20877j(a74 a74Var, String str, String str2) {
        final e14 e14Var = new e14();
        a74Var.zzP().mo9454E(new o84() { // from class: com.daaw.fa5
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                e14 e14Var2 = e14.this;
                if (z) {
                    e14Var2.m23797b(null);
                } else {
                    e14Var2.m23796c(new Exception("Ad Web View failed to load."));
                }
            }
        });
        a74Var.mo6423b0(str, str2, null);
        return e14Var;
    }

    /* renamed from: c */
    public final /* synthetic */ void m20884c() {
        this.f12298a.onAdClicked();
    }

    /* renamed from: d */
    public final /* synthetic */ void m20883d(String str, String str2) {
        this.f12303f.mo2586W(str, str2);
    }

    /* renamed from: e */
    public final /* synthetic */ void m20882e() {
        this.f12300c.zzb();
    }

    /* renamed from: f */
    public final /* synthetic */ void m20881f(View view) {
        this.f12307j.zza();
    }

    /* renamed from: g */
    public final /* synthetic */ void m20880g(a74 a74Var, a74 a74Var2, Map map) {
        this.f12306i.m27479c(a74Var);
    }

    /* renamed from: h */
    public final /* synthetic */ boolean m20879h(View view, MotionEvent motionEvent) {
        this.f12307j.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    /* renamed from: i */
    public final void m20878i(final a74 a74Var, boolean z, bh3 bh3Var) {
        ol2 m10202c;
        a74Var.zzP().mo9452J(new zza() { // from class: com.daaw.y95
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                ha5.this.m20884c();
            }
        }, this.f12301d, this.f12302e, new of3() { // from class: com.daaw.z95
            @Override // com.daaw.of3
            /* renamed from: W */
            public final void mo2586W(String str, String str2) {
                ha5.this.m20883d(str, str2);
            }
        }, new zzz() { // from class: com.daaw.aa5
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                ha5.this.m20882e();
            }
        }, z, bh3Var, this.f12307j, new ga5(this), this.f12308k, this.f12311n, this.f12312o, this.f12313p, this.f12314q, null, this.f12299b, null, null);
        a74Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.daaw.ba5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ha5.this.m20879h(view, motionEvent);
                return false;
            }
        });
        a74Var.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ca5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ha5.this.m20881f(view);
            }
        });
        if (((Boolean) zzba.zzc().m23658b(g93.f10723j2)).booleanValue() && (m10202c = this.f12309l.m10202c()) != null) {
            m10202c.zzn((View) a74Var);
        }
        this.f12305h.m17376n0(a74Var, this.f12304g);
        this.f12305h.m17376n0(new q03() { // from class: com.daaw.da5
            @Override // com.daaw.q03
            /* renamed from: e0 */
            public final void mo6420e0(p03 p03Var) {
                t84 zzP = a74.this.zzP();
                Rect rect = p03Var.f22179d;
                zzP.mo9453G(rect.left, rect.top, false);
            }
        }, this.f12304g);
        this.f12305h.m14720C0((View) a74Var);
        a74Var.mo6392y("/trackActiveViewUnit", new zg3() { // from class: com.daaw.ea5
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                ha5.this.m20880g(a74Var, (a74) obj, map);
            }
        });
        this.f12306i.m27478e(a74Var);
    }
}
