package com.daaw;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class qi5 implements wz7 {
    public final m08 a;
    public final m08 b;

    public qi5(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzb = zzt.zzq().zzb((Context) this.b.zzb());
        ym6 ym6Var = ym6.WEBVIEW_COOKIE;
        vm6 i = lm6.a(new Callable() { // from class: com.daaw.ni5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzba.zzc().b(g93.H0));
            }
        }, ym6Var, (en6) this.a.zzb()).i(1L, TimeUnit.SECONDS);
        final oi5 oi5Var = new em6() { // from class: com.daaw.oi5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return i.c(Exception.class, new w57() { // from class: com.daaw.om6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return s67.i("");
            }
        }).a();
    }
}
