package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class jd5 {
    public final Map a = new ConcurrentHashMap();
    public final /* synthetic */ kd5 b;

    public jd5(kd5 kd5Var) {
        this.b = kd5Var;
    }

    public static /* bridge */ /* synthetic */ jd5 a(jd5 jd5Var) {
        Map map;
        Map map2 = jd5Var.a;
        map = jd5Var.b.c;
        map2.putAll(map);
        return jd5Var;
    }

    public final jd5 b(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final jd5 c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.a.put(str, str2);
        }
        return this;
    }

    public final jd5 d(th6 th6Var) {
        this.a.put("aai", th6Var.x);
        if (((Boolean) zzba.zzc().b(g93.v6)).booleanValue()) {
            c("rid", th6Var.p0);
        }
        return this;
    }

    public final jd5 e(wh6 wh6Var) {
        this.a.put("gqi", wh6Var.b);
        return this;
    }

    public final String f() {
        pd5 pd5Var;
        pd5Var = this.b.a;
        return pd5Var.b(this.a);
    }

    public final void g() {
        Executor executor;
        executor = this.b.b;
        executor.execute(new Runnable() { // from class: com.daaw.id5
            @Override // java.lang.Runnable
            public final void run() {
                jd5.this.i();
            }
        });
    }

    public final void h() {
        Executor executor;
        executor = this.b.b;
        executor.execute(new Runnable() { // from class: com.daaw.hd5
            @Override // java.lang.Runnable
            public final void run() {
                jd5.this.j();
            }
        });
    }

    public final /* synthetic */ void i() {
        pd5 pd5Var;
        pd5Var = this.b.a;
        pd5Var.e(this.a);
    }

    public final /* synthetic */ void j() {
        pd5 pd5Var;
        pd5Var = this.b.a;
        pd5Var.d(this.a);
    }
}
