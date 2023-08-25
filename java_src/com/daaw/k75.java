package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k75 {

    /* renamed from: a */
    public final ri6 f15739a;

    /* renamed from: b */
    public final Executor f15740b;

    /* renamed from: c */
    public final ia5 f15741c;

    /* renamed from: d */
    public final a95 f15742d;

    /* renamed from: e */
    public final Context f15743e;

    /* renamed from: f */
    public final kd5 f15744f;

    /* renamed from: g */
    public final on6 f15745g;

    /* renamed from: h */
    public final op6 f15746h;

    /* renamed from: i */
    public final cq5 f15747i;

    public k75(ri6 ri6Var, Executor executor, ia5 ia5Var, Context context, kd5 kd5Var, on6 on6Var, op6 op6Var, cq5 cq5Var, a95 a95Var) {
        this.f15739a = ri6Var;
        this.f15740b = executor;
        this.f15741c = ia5Var;
        this.f15743e = context;
        this.f15744f = kd5Var;
        this.f15745g = on6Var;
        this.f15746h = op6Var;
        this.f15747i = cq5Var;
        this.f15742d = a95Var;
    }

    /* renamed from: i */
    public static final void m17984i(a74 a74Var) {
        a74Var.mo6392y("/videoClicked", yg3.f33651h);
        a74Var.zzP().mo9451Z(true);
        if (((Boolean) zzba.zzc().m23658b(g93.f10735k3)).booleanValue()) {
            a74Var.mo6392y("/getNativeAdViewSignals", yg3.f33662s);
        }
        a74Var.mo6392y("/getNativeClickMeta", yg3.f33663t);
    }

    /* renamed from: a */
    public final f77 m17992a(final JSONObject jSONObject) {
        return s67.m10629n(s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.a75
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return k75.this.m17988e(obj);
            }
        }, this.f15740b), new w57() { // from class: com.daaw.b75
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return k75.this.m17990c(jSONObject, (a74) obj);
            }
        }, this.f15740b);
    }

    /* renamed from: b */
    public final f77 m17991b(final String str, final String str2, final th6 th6Var, final wh6 wh6Var, final zzq zzqVar) {
        return s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.d75
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return k75.this.m17989d(zzqVar, th6Var, wh6Var, str, str2, obj);
            }
        }, this.f15740b);
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m17990c(JSONObject jSONObject, final a74 a74Var) {
        final d14 m24799e = d14.m24799e(a74Var);
        a74Var.mo6440Q(this.f15739a.f25342b != null ? v84.m7334d() : v84.m7333e());
        a74Var.zzP().mo9454E(new o84() { // from class: com.daaw.z65
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                k75.this.m17987f(a74Var, m24799e, z);
            }
        });
        a74Var.mo6461C0("google.afma.nativeAds.renderVideo", jSONObject);
        return m24799e;
    }

    /* renamed from: d */
    public final /* synthetic */ f77 m17989d(zzq zzqVar, th6 th6Var, wh6 wh6Var, String str, String str2, Object obj) {
        final a74 m20001a = this.f15741c.m20001a(zzqVar, th6Var, wh6Var);
        final d14 m24799e = d14.m24799e(m20001a);
        if (this.f15739a.f25342b != null) {
            m17985h(m20001a);
            m20001a.mo6440Q(v84.m7334d());
        } else {
            x85 m27551b = this.f15742d.m27551b();
            m20001a.zzP().mo9452J(m27551b, m27551b, m27551b, m27551b, m27551b, false, null, new zzb(this.f15743e, null, null), null, null, this.f15747i, this.f15746h, this.f15744f, this.f15745g, null, m27551b, null, null);
            m17984i(m20001a);
        }
        m20001a.zzP().mo9454E(new o84() { // from class: com.daaw.e75
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                k75.this.m17986g(m20001a, m24799e, z);
            }
        });
        m20001a.mo6423b0(str, str2, null);
        return m24799e;
    }

    /* renamed from: e */
    public final /* synthetic */ f77 m17988e(Object obj) {
        a74 m20001a = this.f15741c.m20001a(zzq.zzc(), null, null);
        final d14 m24799e = d14.m24799e(m20001a);
        m17985h(m20001a);
        m20001a.zzP().mo9447y0(new s84() { // from class: com.daaw.c75
            @Override // com.daaw.s84
            public final void zza() {
                d14.this.m24798g();
            }
        });
        m20001a.loadUrl((String) zzba.zzc().m23658b(g93.f10724j3));
        return m24799e;
    }

    /* renamed from: f */
    public final /* synthetic */ void m17987f(a74 a74Var, d14 d14Var, boolean z) {
        if (this.f15739a.f25341a != null && a74Var.zzs() != null) {
            a74Var.zzs().m2690j3(this.f15739a.f25341a);
        }
        d14Var.m24798g();
    }

    /* renamed from: g */
    public final /* synthetic */ void m17986g(a74 a74Var, d14 d14Var, boolean z) {
        if (!z) {
            d14Var.m23796c(new yu5(1, "Html video Web View failed to load."));
            return;
        }
        if (this.f15739a.f25341a != null && a74Var.zzs() != null) {
            a74Var.zzs().m2690j3(this.f15739a.f25341a);
        }
        d14Var.m24798g();
    }

    /* renamed from: h */
    public final void m17985h(a74 a74Var) {
        m17984i(a74Var);
        a74Var.mo6392y("/video", yg3.f33655l);
        a74Var.mo6392y("/videoMeta", yg3.f33656m);
        a74Var.mo6392y("/precache", new k54());
        a74Var.mo6392y("/delayPageLoaded", yg3.f33659p);
        a74Var.mo6392y("/instrument", yg3.f33657n);
        a74Var.mo6392y("/log", yg3.f33650g);
        a74Var.mo6392y("/click", yg3.m3759a(null));
        if (this.f15739a.f25342b != null) {
            a74Var.zzP().mo9448t0(true);
            a74Var.mo6392y("/open", new jh3(null, null, null, null, null));
        } else {
            a74Var.zzP().mo9448t0(false);
        }
        if (zzt.zzn().m17317z(a74Var.getContext())) {
            a74Var.mo6392y("/logScionEvent", new eh3(a74Var.getContext()));
        }
    }
}
