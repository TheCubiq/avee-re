package com.daaw;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class qi5 implements wz7 {

    /* renamed from: a */
    public final m08 f23985a;

    /* renamed from: b */
    public final m08 f23986b;

    public qi5(m08 m08Var, m08 m08Var2) {
        this.f23985a = m08Var;
        this.f23986b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzb = zzt.zzq().zzb((Context) this.f23986b.zzb());
        ym6 ym6Var = ym6.WEBVIEW_COOKIE;
        vm6 m7029i = lm6.m16721a(new Callable() { // from class: com.daaw.ni5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzba.zzc().m23658b(g93.f10432H0));
            }
        }, ym6Var, (en6) this.f23985a.zzb()).m7029i(1L, TimeUnit.SECONDS);
        final oi5 oi5Var = new em6() { // from class: com.daaw.oi5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return m7029i.m7035c(Exception.class, new w57() { // from class: com.daaw.om6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return s67.m10634i("");
            }
        }).m7037a();
    }
}
