package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u85 {

    /* renamed from: b */
    public final zza f28785b;

    /* renamed from: c */
    public final p74 f28786c;

    /* renamed from: d */
    public final Context f28787d;

    /* renamed from: e */
    public final kd5 f28788e;

    /* renamed from: f */
    public final on6 f28789f;

    /* renamed from: g */
    public final Executor f28790g;

    /* renamed from: h */
    public final sl2 f28791h;

    /* renamed from: i */
    public final zzchu f28792i;

    /* renamed from: k */
    public final cq5 f28794k;

    /* renamed from: l */
    public final op6 f28795l;

    /* renamed from: m */
    public f77 f28796m;

    /* renamed from: a */
    public final m85 f28784a = new m85(null);

    /* renamed from: j */
    public final nh3 f28793j = new nh3();

    public u85(r85 r85Var) {
        this.f28787d = r85.m11587a(r85Var);
        this.f28790g = r85.m11578j(r85Var);
        this.f28791h = r85.m11586b(r85Var);
        this.f28792i = r85.m11584d(r85Var);
        this.f28785b = r85.m11585c(r85Var);
        this.f28786c = r85.m11583e(r85Var);
        this.f28794k = r85.m11581g(r85Var);
        this.f28795l = r85.m11579i(r85Var);
        this.f28788e = r85.m11582f(r85Var);
        this.f28789f = r85.m11580h(r85Var);
    }

    /* renamed from: a */
    public final /* synthetic */ a74 m8433a(a74 a74Var) {
        a74Var.mo6392y("/result", this.f28793j);
        t84 zzP = a74Var.zzP();
        m85 m85Var = this.f28784a;
        zzP.mo9452J(null, m85Var, m85Var, m85Var, m85Var, false, null, new zzb(this.f28787d, null, null), null, null, this.f28794k, this.f28795l, this.f28788e, this.f28789f, null, null, null, null);
        return a74Var;
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m8431c(String str, JSONObject jSONObject, a74 a74Var) {
        return this.f28793j.m15176b(a74Var, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized f77 m8430d(final String str, final JSONObject jSONObject) {
        f77 f77Var = this.f28796m;
        if (f77Var == null) {
            return s67.m10634i(null);
        }
        return s67.m10629n(f77Var, new w57() { // from class: com.daaw.e85
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return u85.this.m8431c(str, jSONObject, (a74) obj);
            }
        }, this.f28790g);
    }

    /* renamed from: e */
    public final synchronized void m8429e(th6 th6Var, wh6 wh6Var) {
        f77 f77Var = this.f28796m;
        if (f77Var == null) {
            return;
        }
        s67.m10625r(f77Var, new k85(this, th6Var, wh6Var), this.f28790g);
    }

    /* renamed from: f */
    public final synchronized void m8428f() {
        f77 f77Var = this.f28796m;
        if (f77Var == null) {
            return;
        }
        s67.m10625r(f77Var, new g85(this), this.f28790g);
        this.f28796m = null;
    }

    /* renamed from: g */
    public final synchronized void m8427g(String str, Map map) {
        f77 f77Var = this.f28796m;
        if (f77Var == null) {
            return;
        }
        s67.m10625r(f77Var, new j85(this, "sendMessageToNativeJs", map), this.f28790g);
    }

    /* renamed from: h */
    public final synchronized void m8426h() {
        final Context context = this.f28787d;
        final zzchu zzchuVar = this.f28792i;
        final String str = (String) zzba.zzc().m23658b(g93.f10713i3);
        final sl2 sl2Var = this.f28791h;
        final zza zzaVar = this.f28785b;
        f77 m10630m = s67.m10630m(s67.m10631l(new v57() { // from class: com.daaw.j74
            @Override // com.daaw.v57
            public final f77 zza() {
                Context context2 = context;
                sl2 sl2Var2 = sl2Var;
                zzchu zzchuVar2 = zzchuVar;
                zza zzaVar2 = zzaVar;
                String str2 = str;
                zzt.zzz();
                a74 m13613a = p74.m13613a(context2, v84.m7337a(), "", false, false, sl2Var2, null, zzchuVar2, null, null, zzaVar2, x33.m5591a(), null, null);
                final d14 m24799e = d14.m24799e(m13613a);
                m13613a.zzP().mo9454E(new o84() { // from class: com.daaw.k74
                    @Override // com.daaw.o84
                    public final void zza(boolean z) {
                        d14.this.m24798g();
                    }
                });
                m13613a.loadUrl(str2);
                return m24799e;
            }
        }, z04.f34309e), new ey6() { // from class: com.daaw.f85
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                a74 a74Var = (a74) obj;
                u85.this.m8433a(a74Var);
                return a74Var;
            }
        }, this.f28790g);
        this.f28796m = m10630m;
        c14.m25685a(m10630m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: i */
    public final synchronized void m8425i(String str, zg3 zg3Var) {
        f77 f77Var = this.f28796m;
        if (f77Var == null) {
            return;
        }
        s67.m10625r(f77Var, new h85(this, str, zg3Var), this.f28790g);
    }

    /* renamed from: j */
    public final void m8424j(WeakReference weakReference, String str, zg3 zg3Var) {
        m8425i(str, new t85(this, weakReference, str, zg3Var, null));
    }

    /* renamed from: k */
    public final synchronized void m8423k(String str, zg3 zg3Var) {
        f77 f77Var = this.f28796m;
        if (f77Var == null) {
            return;
        }
        s67.m10625r(f77Var, new i85(this, str, zg3Var), this.f28790g);
    }
}
