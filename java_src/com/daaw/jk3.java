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
    public final a74 p;

    public jk3(Context context, zzchu zzchuVar, sl2 sl2Var, zza zzaVar) {
        zzt.zzz();
        a74 a = p74.a(context, v84.a(), "", false, false, null, null, zzchuVar, null, null, null, x33.a(), null, null);
        this.p = a;
        ((View) a).setWillNotDraw(true);
    }

    public static final void Z(Runnable runnable) {
        zzay.zzb();
        if (d04.A()) {
            runnable.run();
        } else {
            zzs.zza.post(runnable);
        }
    }

    @Override // com.daaw.kl3
    public final void B0(String str, zg3 zg3Var) {
        this.p.y(str, new ik3(this, zg3Var));
    }

    @Override // com.daaw.kk3
    public final /* synthetic */ void C0(String str, JSONObject jSONObject) {
        vj3.d(this, str, jSONObject);
    }

    public final /* synthetic */ void E(String str) {
        this.p.zza(str);
    }

    public final /* synthetic */ void G(String str) {
        this.p.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void J(String str) {
        this.p.loadUrl(str);
    }

    public final /* synthetic */ void S(String str) {
        this.p.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.daaw.uj3
    public final /* synthetic */ void T(String str, Map map) {
        vj3.a(this, str, map);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final /* synthetic */ void c(String str, String str2) {
        vj3.c(this, str, str2);
    }

    @Override // com.daaw.kl3
    public final void d0(String str, final zg3 zg3Var) {
        this.p.c0(str, new uy0() { // from class: com.daaw.dk3
            @Override // com.daaw.uy0
            public final boolean apply(Object obj) {
                zg3 zg3Var2;
                zg3 zg3Var3 = zg3.this;
                zg3 zg3Var4 = (zg3) obj;
                if (zg3Var4 instanceof ik3) {
                    zg3Var2 = ((ik3) zg3Var4).a;
                    return zg3Var2.equals(zg3Var3);
                }
                return false;
            }
        });
    }

    @Override // com.daaw.bk3
    public final void f(final String str) {
        Z(new Runnable() { // from class: com.daaw.fk3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.G(str);
            }
        });
    }

    @Override // com.daaw.uj3, com.daaw.wj3
    public final /* synthetic */ void l(String str, JSONObject jSONObject) {
        vj3.b(this, str, jSONObject);
    }

    @Override // com.daaw.bk3
    public final void m(final pk3 pk3Var) {
        this.p.zzP().y0(new s84(null) { // from class: com.daaw.ck3
            @Override // com.daaw.s84
            public final void zza() {
                pk3 pk3Var2 = pk3.this;
                final jl3 jl3Var = pk3Var2.a;
                final il3 il3Var = pk3Var2.b;
                final bk3 bk3Var = pk3Var2.c;
                zzs.zza.postDelayed(new Runnable() { // from class: com.daaw.ok3
                    @Override // java.lang.Runnable
                    public final void run() {
                        jl3.this.i(il3Var, bk3Var);
                    }
                }, 10000L);
            }
        });
    }

    @Override // com.daaw.bk3
    public final void s(final String str) {
        Z(new Runnable() { // from class: com.daaw.hk3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.J(str);
            }
        });
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void zza(final String str) {
        Z(new Runnable() { // from class: com.daaw.ek3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.E(str);
            }
        });
    }

    @Override // com.daaw.bk3
    public final void zzc() {
        this.p.destroy();
    }

    @Override // com.daaw.bk3
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        Z(new Runnable() { // from class: com.daaw.gk3
            @Override // java.lang.Runnable
            public final void run() {
                jk3.this.S(format);
            }
        });
    }

    @Override // com.daaw.bk3
    public final boolean zzi() {
        return this.p.o0();
    }

    @Override // com.daaw.bk3
    public final ll3 zzj() {
        return new ll3(this);
    }
}
