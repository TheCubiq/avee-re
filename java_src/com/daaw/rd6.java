package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class rd6 implements qz5 {

    /* renamed from: a */
    public final Context f25175a;

    /* renamed from: b */
    public final Executor f25176b;

    /* renamed from: c */
    public final b94 f25177c;

    /* renamed from: d */
    public final az5 f25178d;

    /* renamed from: e */
    public final ez5 f25179e;

    /* renamed from: f */
    public final ViewGroup f25180f;

    /* renamed from: g */
    public fa3 f25181g;

    /* renamed from: h */
    public final jt4 f25182h;

    /* renamed from: i */
    public final vo6 f25183i;

    /* renamed from: j */
    public final wv4 f25184j;
    @GuardedBy("this")

    /* renamed from: k */
    public final pi6 f25185k;
    @GuardedBy("this")

    /* renamed from: l */
    public f77 f25186l;

    public rd6(Context context, Executor executor, zzq zzqVar, b94 b94Var, az5 az5Var, ez5 ez5Var, pi6 pi6Var, wv4 wv4Var) {
        this.f25175a = context;
        this.f25176b = executor;
        this.f25177c = b94Var;
        this.f25178d = az5Var;
        this.f25179e = ez5Var;
        this.f25185k = pi6Var;
        this.f25182h = b94Var.mo26263k();
        this.f25183i = b94Var.mo26308D();
        this.f25180f = new FrameLayout(context);
        this.f25184j = wv4Var;
        pi6Var.m13371I(zzqVar);
    }

    @Override // com.daaw.qz5
    /* renamed from: a */
    public final boolean mo4385a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        yj4 mo26265j;
        wi4 wi4Var;
        to6 to6Var;
        if (str == null) {
            k04.zzg("Ad unit ID should not be null for banner ad.");
            this.f25176b.execute(new Runnable() { // from class: com.daaw.nd6
                @Override // java.lang.Runnable
                public final void run() {
                    rd6.this.m11379l();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && zzlVar.zzf) {
                this.f25177c.mo26253p().m24398m(true);
            }
            pi6 pi6Var = this.f25185k;
            pi6Var.m13370J(str);
            pi6Var.m13358e(zzlVar);
            ri6 m13356g = pi6Var.m13356g();
            io6 m20567b = ho6.m20567b(this.f25175a, so6.m10109f(m13356g), 3, zzlVar);
            if (((Boolean) kb3.f16116d.m16137e()).booleanValue() && this.f25185k.m13339x().zzk) {
                az5 az5Var = this.f25178d;
                if (az5Var != null) {
                    az5Var.mo2194b(tj6.m9071d(7, null, null));
                }
                return false;
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10805q7)).booleanValue()) {
                mo26265j = this.f25177c.mo26265j();
                sp4 sp4Var = new sp4();
                sp4Var.m10066c(this.f25175a);
                sp4Var.m10063f(m13356g);
                mo26265j.mo3644n(sp4Var.m10062g());
                lw4 lw4Var = new lw4();
                lw4Var.m16437m(this.f25178d, this.f25176b);
                lw4Var.m16436n(this.f25178d, this.f25176b);
                mo26265j.mo3645k(lw4Var.m16433q());
                mo26265j.mo3643o(new cx5(this.f25181g));
                mo26265j.mo3647d(new l15(u35.f28511h, null));
                mo26265j.mo3646i(new rl4(this.f25182h, this.f25184j));
                wi4Var = new wi4(this.f25180f);
            } else {
                mo26265j = this.f25177c.mo26265j();
                sp4 sp4Var2 = new sp4();
                sp4Var2.m10066c(this.f25175a);
                sp4Var2.m10063f(m13356g);
                mo26265j.mo3644n(sp4Var2.m10062g());
                lw4 lw4Var2 = new lw4();
                lw4Var2.m16437m(this.f25178d, this.f25176b);
                lw4Var2.m16446d(this.f25178d, this.f25176b);
                lw4Var2.m16446d(this.f25179e, this.f25176b);
                lw4Var2.m16435o(this.f25178d, this.f25176b);
                lw4Var2.m16443g(this.f25178d, this.f25176b);
                lw4Var2.m16442h(this.f25178d, this.f25176b);
                lw4Var2.m16441i(this.f25178d, this.f25176b);
                lw4Var2.m16445e(this.f25178d, this.f25176b);
                lw4Var2.m16436n(this.f25178d, this.f25176b);
                lw4Var2.m16438l(this.f25178d, this.f25176b);
                mo26265j.mo3645k(lw4Var2.m16433q());
                mo26265j.mo3643o(new cx5(this.f25181g));
                mo26265j.mo3647d(new l15(u35.f28511h, null));
                mo26265j.mo3646i(new rl4(this.f25182h, this.f25184j));
                wi4Var = new wi4(this.f25180f);
            }
            mo26265j.mo3648c(wi4Var);
            zj4 zzj = mo26265j.zzj();
            if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
                to6 mo2197f = zzj.mo2197f();
                mo2197f.m8895h(3);
                mo2197f.m8901b(zzlVar.zzp);
                to6Var = mo2197f;
            } else {
                to6Var = null;
            }
            jn4 mo2199d = zzj.mo2199d();
            f77 m18383i = mo2199d.m18383i(mo2199d.m18382j());
            this.f25186l = m18383i;
            s67.m10625r(m18383i, new qd6(this, pz5Var, to6Var, m20567b, zzj), this.f25176b);
            return true;
        }
    }

    /* renamed from: c */
    public final ViewGroup m11388c() {
        return this.f25180f;
    }

    /* renamed from: h */
    public final pi6 m11383h() {
        return this.f25185k;
    }

    /* renamed from: l */
    public final /* synthetic */ void m11379l() {
        this.f25178d.mo2194b(tj6.m9071d(6, null, null));
    }

    /* renamed from: m */
    public final void m11378m() {
        this.f25182h.m18252C0(this.f25184j.m5764a());
    }

    /* renamed from: n */
    public final void m11377n(zzbe zzbeVar) {
        this.f25179e.m22977b(zzbeVar);
    }

    /* renamed from: o */
    public final void m11376o(kt4 kt4Var) {
        this.f25182h.m17376n0(kt4Var, this.f25176b);
    }

    /* renamed from: p */
    public final void m11375p(fa3 fa3Var) {
        this.f25181g = fa3Var;
    }

    /* renamed from: q */
    public final boolean m11374q() {
        ViewParent parent = this.f25180f.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zzt.zzp();
            return zzs.zzT(view, view.getContext());
        }
        return false;
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        f77 f77Var = this.f25186l;
        return (f77Var == null || f77Var.isDone()) ? false : true;
    }
}
