package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzfkz;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class cn5 extends wt3 {

    /* renamed from: p */
    public final Context f5964p;

    /* renamed from: q */
    public final Executor f5965q;

    /* renamed from: r */
    public final g77 f5966r;

    /* renamed from: s */
    public final yn5 f5967s;

    /* renamed from: t */
    public final hf4 f5968t;
    @GuardedBy("this")

    /* renamed from: u */
    public final ArrayDeque f5969u;

    /* renamed from: v */
    public final vo6 f5970v;

    /* renamed from: w */
    public final yu3 f5971w;

    /* renamed from: x */
    public final vn5 f5972x;

    public cn5(Context context, Executor executor, g77 g77Var, yu3 yu3Var, hf4 hf4Var, yn5 yn5Var, ArrayDeque arrayDeque, vn5 vn5Var, vo6 vo6Var, byte[] bArr) {
        g93.m21879c(context);
        this.f5964p = context;
        this.f5965q = executor;
        this.f5966r = g77Var;
        this.f5971w = yu3Var;
        this.f5967s = yn5Var;
        this.f5968t = hf4Var;
        this.f5969u = arrayDeque;
        this.f5972x = vn5Var;
        this.f5970v = vo6Var;
    }

    /* renamed from: m3 */
    public static f77 m25209m3(f77 f77Var, en6 en6Var, xl3 xl3Var, to6 to6Var, io6 io6Var) {
        nl3 m5010a = xl3Var.m5010a("AFMA_getAdDictionary", ul3.f29176b, new pl3() { // from class: com.daaw.tm5
            @Override // com.daaw.pl3
            /* renamed from: b */
            public final Object mo8081b(JSONObject jSONObject) {
                return new pu3(jSONObject);
            }
        });
        so6.m10111d(f77Var, io6Var);
        gm6 m7037a = en6Var.m5975b(ym6.BUILD_URL, f77Var).m7032f(m5010a).m7037a();
        so6.m10112c(m7037a, to6Var, io6Var);
        return m7037a;
    }

    /* renamed from: n3 */
    public static f77 m25208n3(zzccb zzccbVar, en6 en6Var, final o86 o86Var) {
        w57 w57Var = new w57() { // from class: com.daaw.km5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return o86.this.mo14447b().m17110a(zzay.zzb().m24818n((Bundle) obj));
            }
        };
        return en6Var.m5975b(ym6.GMS_SIGNALS, s67.m10634i(zzccbVar.f36964p)).m7032f(w57Var).m7033e(new em6() { // from class: com.daaw.lm5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                zze.zza("Ad request signals:");
                zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).m7037a();
    }

    @Override // com.daaw.xt3
    /* renamed from: A1 */
    public final void mo4525A1(zzccb zzccbVar, hu3 hu3Var) {
        m25206p3(m25213i3(zzccbVar, Binder.getCallingUid()), hu3Var);
    }

    @Override // com.daaw.xt3
    /* renamed from: L2 */
    public final void mo4524L2(zzccb zzccbVar, hu3 hu3Var) {
        mm5 mm5Var;
        Executor executor;
        f77 m25214h3 = m25214h3(zzccbVar, Binder.getCallingUid());
        m25206p3(m25214h3, hu3Var);
        if (((Boolean) ab3.f3049c.m16137e()).booleanValue()) {
            if (((Boolean) ya3.f33458j.m16137e()).booleanValue()) {
                yn5 yn5Var = this.f5967s;
                yn5Var.getClass();
                mm5Var = new mm5(yn5Var);
                executor = this.f5966r;
            } else {
                yn5 yn5Var2 = this.f5967s;
                yn5Var2.getClass();
                mm5Var = new mm5(yn5Var2);
                executor = this.f5965q;
            }
            m25214h3.mo6515f(mm5Var, executor);
        }
    }

    @Override // com.daaw.xt3
    /* renamed from: b2 */
    public final void mo4523b2(zzccb zzccbVar, hu3 hu3Var) {
        m25206p3(m25215g3(zzccbVar, Binder.getCallingUid()), hu3Var);
    }

    /* renamed from: g3 */
    public final f77 m25215g3(final zzccb zzccbVar, int i) {
        if (((Boolean) lb3.f17221a.m16137e()).booleanValue()) {
            zzfkz zzfkzVar = zzccbVar.f36972x;
            if (zzfkzVar == null) {
                return s67.m10635h(new Exception("Pool configuration missing from request."));
            }
            if (zzfkzVar.f37004t == 0 || zzfkzVar.f37005u == 0) {
                return s67.m10635h(new Exception("Caching is disabled."));
            }
            xl3 m14177b = zzt.zzf().m14177b(this.f5964p, zzchu.m1093h(), this.f5970v);
            o86 mo20830a = this.f5968t.mo20830a(zzccbVar, i);
            en6 mo14446c = mo20830a.mo14446c();
            final f77 m25208n3 = m25208n3(zzccbVar, mo14446c, mo20830a);
            to6 mo14445d = mo20830a.mo14445d();
            final io6 m20568a = ho6.m20568a(this.f5964p, 9);
            final f77 m25209m3 = m25209m3(m25208n3, mo14446c, m14177b, mo14445d, m20568a);
            return mo14446c.m5976a(ym6.GET_URL_AND_CACHE_KEY, m25208n3, m25209m3).m18406a(new Callable() { // from class: com.daaw.sm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cn5.this.m25211k3(m25209m3, m25208n3, zzccbVar, m20568a);
                }
            }).m7037a();
        }
        return s67.m10635h(new Exception("Split request is disabled."));
    }

    /* renamed from: h3 */
    public final f77 m25214h3(zzccb zzccbVar, int i) {
        String str;
        jm6 m5976a;
        Callable callable;
        xl3 m14177b = zzt.zzf().m14177b(this.f5964p, zzchu.m1093h(), this.f5970v);
        o86 mo20830a = this.f5968t.mo20830a(zzccbVar, i);
        nl3 m5010a = m14177b.m5010a("google.afma.response.normalize", bn5.f4981d, ul3.f29177c);
        zm5 zm5Var = null;
        if (((Boolean) lb3.f17221a.m16137e()).booleanValue()) {
            zm5Var = m25210l3(zzccbVar.f36971w);
            if (zm5Var == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                zze.zza(str);
            }
        } else {
            String str2 = zzccbVar.f36973y;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                zze.zza(str);
            }
        }
        zm5 zm5Var2 = zm5Var;
        io6 m20568a = zm5Var2 == null ? ho6.m20568a(this.f5964p, 9) : zm5Var2.f35238e;
        to6 mo14445d = mo20830a.mo14445d();
        mo14445d.m8899d(zzccbVar.f36964p.getStringArrayList("ad_types"));
        xn5 xn5Var = new xn5(zzccbVar.f36970v, mo14445d, m20568a);
        un5 un5Var = new un5(this.f5964p, zzccbVar.f36965q.f36993p, this.f5971w, i, null);
        en6 mo14446c = mo20830a.mo14446c();
        io6 m20568a2 = ho6.m20568a(this.f5964p, 11);
        if (zm5Var2 == null) {
            final f77 m25208n3 = m25208n3(zzccbVar, mo14446c, mo20830a);
            final f77 m25209m3 = m25209m3(m25208n3, mo14446c, m14177b, mo14445d, m20568a);
            io6 m20568a3 = ho6.m20568a(this.f5964p, 10);
            final gm6 m7037a = mo14446c.m5976a(ym6.HTTP, m25209m3, m25208n3).m18406a(new Callable() { // from class: com.daaw.qm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new wn5((JSONObject) f77.this.get(), (pu3) m25209m3.get());
                }
            }).m7033e(xn5Var).m7033e(new oo6(m20568a3)).m7033e(un5Var).m7037a();
            so6.m10114a(m7037a, mo14445d, m20568a3);
            so6.m10111d(m7037a, m20568a2);
            m5976a = mo14446c.m5976a(ym6.PRE_PROCESS, m25208n3, m25209m3, m7037a);
            callable = new Callable() { // from class: com.daaw.rm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new bn5((pn5) f77.this.get(), (JSONObject) m25208n3.get(), (pu3) m25209m3.get());
                }
            };
        } else {
            wn5 wn5Var = new wn5(zm5Var2.f35235b, zm5Var2.f35234a);
            io6 m20568a4 = ho6.m20568a(this.f5964p, 10);
            final gm6 m7037a2 = mo14446c.m5975b(ym6.HTTP, s67.m10634i(wn5Var)).m7033e(xn5Var).m7033e(new oo6(m20568a4)).m7033e(un5Var).m7037a();
            so6.m10114a(m7037a2, mo14445d, m20568a4);
            final f77 m10634i = s67.m10634i(zm5Var2);
            so6.m10111d(m7037a2, m20568a2);
            m5976a = mo14446c.m5976a(ym6.PRE_PROCESS, m7037a2, m10634i);
            callable = new Callable() { // from class: com.daaw.vm5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    f77 f77Var = f77.this;
                    f77 f77Var2 = m10634i;
                    return new bn5((pn5) f77Var.get(), ((zm5) f77Var2.get()).f35235b, ((zm5) f77Var2.get()).f35234a);
                }
            };
        }
        gm6 m7037a3 = m5976a.m18406a(callable).m7032f(m5010a).m7037a();
        so6.m10114a(m7037a3, mo14445d, m20568a2);
        return m7037a3;
    }

    /* renamed from: i3 */
    public final f77 m25213i3(zzccb zzccbVar, int i) {
        mm5 mm5Var;
        Executor executor;
        xl3 m14177b = zzt.zzf().m14177b(this.f5964p, zzchu.m1093h(), this.f5970v);
        if (((Boolean) qb3.f23844a.m16137e()).booleanValue()) {
            o86 mo20830a = this.f5968t.mo20830a(zzccbVar, i);
            final l76 mo14448a = mo20830a.mo14448a();
            nl3 m5010a = m14177b.m5010a("google.afma.request.getSignals", ul3.f29176b, ul3.f29177c);
            io6 m20568a = ho6.m20568a(this.f5964p, 22);
            gm6 m7037a = mo20830a.mo14446c().m5975b(ym6.GET_SIGNALS, s67.m10634i(zzccbVar.f36964p)).m7033e(new oo6(m20568a)).m7032f(new w57() { // from class: com.daaw.um5
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return l76.this.m17110a(zzay.zzb().m24818n((Bundle) obj));
                }
            }).m7036b(ym6.JS_SIGNALS).m7032f(m5010a).m7037a();
            to6 mo14445d = mo20830a.mo14445d();
            mo14445d.m8899d(zzccbVar.f36964p.getStringArrayList("ad_types"));
            so6.m10113b(m7037a, mo14445d, m20568a);
            if (((Boolean) ab3.f3051e.m16137e()).booleanValue()) {
                if (((Boolean) ya3.f33458j.m16137e()).booleanValue()) {
                    yn5 yn5Var = this.f5967s;
                    yn5Var.getClass();
                    mm5Var = new mm5(yn5Var);
                    executor = this.f5966r;
                } else {
                    yn5 yn5Var2 = this.f5967s;
                    yn5Var2.getClass();
                    mm5Var = new mm5(yn5Var2);
                    executor = this.f5965q;
                }
                m7037a.mo6515f(mm5Var, executor);
            }
            return m7037a;
        }
        return s67.m10635h(new Exception("Signal collection disabled."));
    }

    @Override // com.daaw.xt3
    /* renamed from: j1 */
    public final void mo4522j1(String str, hu3 hu3Var) {
        m25206p3(m25212j3(str), hu3Var);
    }

    /* renamed from: j3 */
    public final f77 m25212j3(String str) {
        if (((Boolean) lb3.f17221a.m16137e()).booleanValue()) {
            return m25210l3(str) == null ? s67.m10635h(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : s67.m10634i(new xm5(this));
        }
        return s67.m10635h(new Exception("Split request is disabled."));
    }

    /* renamed from: k3 */
    public final /* synthetic */ InputStream m25211k3(f77 f77Var, f77 f77Var2, zzccb zzccbVar, io6 io6Var) {
        String m13128c = ((pu3) f77Var.get()).m13128c();
        String str = zzccbVar.f36971w;
        m25207o3(new zm5((pu3) f77Var.get(), (JSONObject) f77Var2.get(), str, m13128c, io6Var));
        return new ByteArrayInputStream(m13128c.getBytes(cy6.f6275c));
    }

    /* renamed from: l3 */
    public final synchronized zm5 m25210l3(String str) {
        Iterator it = this.f5969u.iterator();
        while (it.hasNext()) {
            zm5 zm5Var = (zm5) it.next();
            if (zm5Var.f35236c.equals(str)) {
                it.remove();
                return zm5Var;
            }
        }
        return null;
    }

    /* renamed from: o3 */
    public final synchronized void m25207o3(zm5 zm5Var) {
        zzo();
        this.f5969u.addLast(zm5Var);
    }

    /* renamed from: p3 */
    public final void m25206p3(f77 f77Var, hu3 hu3Var) {
        s67.m10625r(s67.m10629n(f77Var, new w57() { // from class: com.daaw.wm5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.m10634i(sj6.m10282a((InputStream) obj));
            }
        }, z04.f34305a), new ym5(this, hu3Var), z04.f34310f);
    }

    public final synchronized void zzo() {
        int intValue = ((Long) lb3.f17224d.m16137e()).intValue();
        while (this.f5969u.size() >= intValue) {
            this.f5969u.removeFirst();
        }
    }
}
