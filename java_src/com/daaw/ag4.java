package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ag4 implements kf4 {
    public final CookieManager a;

    public ag4(Context context) {
        this.a = zzt.zzq().zzb(context);
    }

    @Override // com.daaw.kf4
    public final void a(Map map) {
        if (this.a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.setCookie((String) zzba.zzc().b(g93.H0), str);
            return;
        }
        String str2 = (String) zzba.zzc().b(g93.H0);
        String cookie = this.a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List f = fz6.c(by6.b(';')).f(cookie);
        for (int i = 0; i < f.size(); i++) {
            CookieManager cookieManager = this.a;
            Iterator it = fz6.c(by6.b('=')).d((String) f.get(i)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) zzba.zzc().b(g93.u0))));
        }
    }
}
