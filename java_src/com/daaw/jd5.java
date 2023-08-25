package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class jd5 {

    /* renamed from: a */
    public final Map f15005a = new ConcurrentHashMap();

    /* renamed from: b */
    public final /* synthetic */ kd5 f15006b;

    public jd5(kd5 kd5Var) {
        this.f15006b = kd5Var;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ jd5 m18591a(jd5 jd5Var) {
        Map map;
        Map map2 = jd5Var.f15005a;
        map = jd5Var.f15006b.f16317c;
        map2.putAll(map);
        return jd5Var;
    }

    /* renamed from: b */
    public final jd5 m18590b(String str, String str2) {
        this.f15005a.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final jd5 m18589c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f15005a.put(str, str2);
        }
        return this;
    }

    /* renamed from: d */
    public final jd5 m18588d(th6 th6Var) {
        this.f15005a.put("aai", th6Var.f27719x);
        if (((Boolean) zzba.zzc().m23658b(g93.f10859v6)).booleanValue()) {
            m18589c("rid", th6Var.f27711p0);
        }
        return this;
    }

    /* renamed from: e */
    public final jd5 m18587e(wh6 wh6Var) {
        this.f15005a.put("gqi", wh6Var.f31252b);
        return this;
    }

    /* renamed from: f */
    public final String m18586f() {
        pd5 pd5Var;
        pd5Var = this.f15006b.f16315a;
        return pd5Var.m11393b(this.f15005a);
    }

    /* renamed from: g */
    public final void m18585g() {
        Executor executor;
        executor = this.f15006b.f16316b;
        executor.execute(new Runnable() { // from class: com.daaw.id5
            @Override // java.lang.Runnable
            public final void run() {
                jd5.this.m18583i();
            }
        });
    }

    /* renamed from: h */
    public final void m18584h() {
        Executor executor;
        executor = this.f15006b.f16316b;
        executor.execute(new Runnable() { // from class: com.daaw.hd5
            @Override // java.lang.Runnable
            public final void run() {
                jd5.this.m18582j();
            }
        });
    }

    /* renamed from: i */
    public final /* synthetic */ void m18583i() {
        pd5 pd5Var;
        pd5Var = this.f15006b.f16315a;
        pd5Var.m11390e(this.f15005a);
    }

    /* renamed from: j */
    public final /* synthetic */ void m18582j() {
        pd5 pd5Var;
        pd5Var = this.f15006b.f16315a;
        pd5Var.m11391d(this.f15005a);
    }
}
