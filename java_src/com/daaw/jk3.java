package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jk3 implements bk3, wj3 {

    /* renamed from: p */
    public final a74 f15161p;

    public jk3(Context context, zzchu zzchuVar, sl2 sl2Var, zza zzaVar) {
        zzt.zzz();
        a74 m13613a = p74.m13613a(context, v84.m7337a(), "", false, false, null, null, zzchuVar, null, null, null, x33.m5591a(), null, null);
        this.f15161p = m13613a;
        ((View) m13613a).setWillNotDraw(true);
    }

    /* renamed from: Z */
    public static final void m18449Z(Runnable runnable) {
        zzay.zzb();
        if (d04.m24836A()) {
            runnable.run();
        } else {
            zzs.zza.post(runnable);
        }
    }

    @Override // com.daaw.kl3
    /* renamed from: B0 */
    public final void mo16862B0(String str, zg3 zg3Var) {
        this.f15161p.mo6392y(str, new ik3(this, zg3Var));
    }

    @Override // com.daaw.kk3
    /* renamed from: C0 */
    public final /* synthetic */ void mo6461C0(String str, JSONObject jSONObject) {
        vj3.m7114d(this, str, jSONObject);
    }

    /* renamed from: E */
    public final /* synthetic */ void m18453E(String str) {
        this.f15161p.zza(str);
    }

    /* renamed from: G */
    public final /* synthetic */ void m18452G(String str) {
        this.f15161p.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: J */
    public final /* synthetic */ void m18451J(String str) {
        this.f15161p.loadUrl(str);
    }

    /* renamed from: S */
    public final /* synthetic */ void m18450S(String str) {
        this.f15161p.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.daaw.uj3
    /* renamed from: T */
    public final /* synthetic */ void mo6434T(String str, Map map) {
        vj3.m7117a(this, str, map);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    /* renamed from: c */
    public final /* synthetic */ void mo6049c(String str, String str2) {
        vj3.m7115c(this, str, str2);
    }

    @Override // com.daaw.kl3
    /* renamed from: d0 */
    public final void mo16861d0(String str, final zg3 zg3Var) {
        this.f15161p.mo6422c0(str, new uy0() { // from class: com.daaw.dk3
            @Override // com.daaw.uy0
            public final boolean apply(Object obj) {
                zg3 zg3Var2;
                zg3 zg3Var3 = zg3.this;
                zg3 zg3Var4 = (zg3) obj;
                if (zg3Var4 instanceof ik3) {
                    zg3Var2 = ((ik3) zg3Var4).f13715a;
                    return zg3Var2.equals(zg3Var3);
                }
                return false;
            }
        });
    }

    @Override // com.daaw.bk3
    /* renamed from: f */
    public final void mo18448f(final String str) {
        m18449Z(new Runnable() { // from class: com.daaw.fk3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.m18452G(str);
            }
        });
    }

    @Override // com.daaw.uj3, com.daaw.wj3
    /* renamed from: l */
    public final /* synthetic */ void mo6048l(String str, JSONObject jSONObject) {
        vj3.m7116b(this, str, jSONObject);
    }

    @Override // com.daaw.bk3
    /* renamed from: m */
    public final void mo18447m(final pk3 pk3Var) {
        this.f15161p.zzP().mo9447y0(new s84(null) { // from class: com.daaw.ck3
            @Override // com.daaw.s84
            public final void zza() {
                pk3 pk3Var2 = pk3.this;
                final jl3 jl3Var = pk3Var2.f22999a;
                final il3 il3Var = pk3Var2.f23000b;
                final bk3 bk3Var = pk3Var2.f23001c;
                zzs.zza.postDelayed(new Runnable() { // from class: com.daaw.ok3
                    @Override // java.lang.Runnable
                    public final void run() {
                        jl3.this.m18426i(il3Var, bk3Var);
                    }
                }, 10000L);
            }
        });
    }

    @Override // com.daaw.bk3
    /* renamed from: s */
    public final void mo18446s(final String str) {
        m18449Z(new Runnable() { // from class: com.daaw.hk3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.m18451J(str);
            }
        });
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void zza(final String str) {
        m18449Z(new Runnable() { // from class: com.daaw.ek3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.m18453E(str);
            }
        });
    }

    @Override // com.daaw.bk3
    public final void zzc() {
        this.f15161p.destroy();
    }

    @Override // com.daaw.bk3
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        m18449Z(new Runnable() { // from class: com.daaw.gk3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.m18450S(format);
            }
        });
    }

    @Override // com.daaw.bk3
    public final boolean zzi() {
        return this.f15161p.mo6407o0();
    }

    @Override // com.daaw.bk3
    public final ll3 zzj() {
        return new ll3(this);
    }
}
