package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzfkz;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jn4 {

    /* renamed from: a */
    public final sj5 f15232a;

    /* renamed from: b */
    public final ri6 f15233b;

    /* renamed from: c */
    public final en6 f15234c;

    /* renamed from: d */
    public final if4 f15235d;

    /* renamed from: e */
    public final av5 f15236e;

    /* renamed from: f */
    public final fw4 f15237f;

    /* renamed from: g */
    public fi6 f15238g;

    /* renamed from: h */
    public final al5 f15239h;

    /* renamed from: i */
    public final op4 f15240i;

    /* renamed from: j */
    public final Executor f15241j;

    /* renamed from: k */
    public final mk5 f15242k;

    /* renamed from: l */
    public final vq5 f15243l;

    /* renamed from: m */
    public final ul5 f15244m;

    /* renamed from: n */
    public final am5 f15245n;

    public jn4(sj5 sj5Var, ri6 ri6Var, en6 en6Var, if4 if4Var, av5 av5Var, fw4 fw4Var, fi6 fi6Var, al5 al5Var, op4 op4Var, Executor executor, mk5 mk5Var, vq5 vq5Var, ul5 ul5Var, am5 am5Var) {
        this.f15232a = sj5Var;
        this.f15233b = ri6Var;
        this.f15234c = en6Var;
        this.f15235d = if4Var;
        this.f15236e = av5Var;
        this.f15237f = fw4Var;
        this.f15238g = fi6Var;
        this.f15239h = al5Var;
        this.f15240i = op4Var;
        this.f15241j = executor;
        this.f15242k = mk5Var;
        this.f15243l = vq5Var;
        this.f15244m = ul5Var;
        this.f15245n = am5Var;
    }

    /* renamed from: a */
    public final zze m18391a(Throwable th) {
        return tj6.m9073b(th, this.f15243l);
    }

    /* renamed from: c */
    public final fw4 m18389c() {
        return this.f15237f;
    }

    /* renamed from: d */
    public final /* synthetic */ fi6 m18388d(fi6 fi6Var) {
        this.f15235d.m19850a(fi6Var);
        return fi6Var;
    }

    /* renamed from: e */
    public final f77 m18387e(final zzfkz zzfkzVar) {
        gm6 m7037a = this.f15234c.m5975b(ym6.GET_CACHE_KEY, this.f15240i.m14101c()).m7032f(new w57() { // from class: com.daaw.gn4
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return jn4.this.m18386f(zzfkzVar, (zzccb) obj);
            }
        }).m7037a();
        s67.m10625r(m7037a, new hn4(this), this.f15241j);
        return m7037a;
    }

    /* renamed from: f */
    public final /* synthetic */ f77 m18386f(zzfkz zzfkzVar, zzccb zzccbVar) {
        zzccbVar.f36972x = zzfkzVar;
        return this.f15239h.m27355a(zzccbVar);
    }

    /* renamed from: g */
    public final /* synthetic */ f77 m18385g(f77 f77Var, f77 f77Var2, f77 f77Var3) {
        return this.f15245n.m27340b((zzccb) f77Var.get(), (JSONObject) f77Var2.get(), (pu3) f77Var3.get());
    }

    /* renamed from: h */
    public final f77 m18384h(zzccb zzccbVar) {
        gm6 m7037a = this.f15234c.m5975b(ym6.NOTIFY_CACHE_HIT, this.f15239h.m27349g(zzccbVar)).m7037a();
        s67.m10625r(m7037a, new in4(this), this.f15241j);
        return m7037a;
    }

    /* renamed from: i */
    public final f77 m18383i(f77 f77Var) {
        vm6 m7032f = this.f15234c.m5975b(ym6.RENDERER, f77Var).m7033e(new em6() { // from class: com.daaw.fn4
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                fi6 fi6Var = (fi6) obj;
                jn4.this.m18388d(fi6Var);
                return fi6Var;
            }
        }).m7032f(this.f15236e);
        if (!((Boolean) zzba.zzc().m23658b(g93.f10576V4)).booleanValue()) {
            m7032f = m7032f.m7029i(((Integer) zzba.zzc().m23658b(g93.f10586W4)).intValue(), TimeUnit.SECONDS);
        }
        return m7032f.m7037a();
    }

    /* renamed from: j */
    public final f77 m18382j() {
        zzl zzlVar = this.f15233b.f25344d;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return m18381k(this.f15240i.m14101c());
        }
        en6 en6Var = this.f15234c;
        return lm6.m16719c(this.f15232a.m10287a(), ym6.PRELOADED_LOADER, en6Var).m7037a();
    }

    /* renamed from: k */
    public final f77 m18381k(final f77 f77Var) {
        vm6 m7032f;
        fi6 fi6Var = this.f15238g;
        if (fi6Var != null) {
            m7032f = lm6.m16719c(s67.m10634i(fi6Var), ym6.SERVER_TRANSACTION, this.f15234c);
        } else {
            zzt.zzc().m21046j();
            if (!((Boolean) zzba.zzc().m23658b(g93.f10884x9)).booleanValue() || ((Boolean) kb3.f16114b.m16137e()).booleanValue()) {
                vm6 m5975b = this.f15234c.m5975b(ym6.SERVER_TRANSACTION, f77Var);
                final mk5 mk5Var = this.f15242k;
                m7032f = m5975b.m7032f(new w57() { // from class: com.daaw.en4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return mk5.this.mo14208a((zzccb) obj);
                    }
                });
            } else {
                final ul5 ul5Var = this.f15244m;
                final f77 m10629n = s67.m10629n(f77Var, new w57() { // from class: com.daaw.an4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return ul5.this.m8033a((zzccb) obj);
                    }
                }, this.f15241j);
                vm6 m5975b2 = this.f15234c.m5975b(ym6.BUILD_URL, m10629n);
                final al5 al5Var = this.f15239h;
                final gm6 m7037a = m5975b2.m7032f(new w57() { // from class: com.daaw.bn4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return al5.this.m27354b((JSONObject) obj);
                    }
                }).m7037a();
                m7032f = this.f15234c.m5976a(ym6.SERVER_TRANSACTION, f77Var, m10629n, m7037a).m18406a(new Callable() { // from class: com.daaw.cn4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return jn4.this.m18385g(f77Var, m10629n, m7037a);
                    }
                }).m7032f(new w57() { // from class: com.daaw.dn4
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return (f77) obj;
                    }
                });
            }
        }
        return m7032f.m7037a();
    }

    /* renamed from: l */
    public final void m18380l(fi6 fi6Var) {
        this.f15238g = fi6Var;
    }
}
