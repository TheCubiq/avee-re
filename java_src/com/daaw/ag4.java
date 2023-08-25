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

    /* renamed from: a */
    public final CookieManager f3178a;

    public ag4(Context context) {
        this.f3178a = zzt.zzq().zzb(context);
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        if (this.f3178a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f3178a.setCookie((String) zzba.zzc().m23658b(g93.f10432H0), str);
            return;
        }
        String str2 = (String) zzba.zzc().m23658b(g93.f10432H0);
        String cookie = this.f3178a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List m22119f = fz6.m22122c(by6.m25734b(';')).m22119f(cookie);
        for (int i = 0; i < m22119f.size(); i++) {
            CookieManager cookieManager = this.f3178a;
            Iterator it = fz6.m22122c(by6.m25734b('=')).m22121d((String) m22119f.get(i)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) zzba.zzc().m23658b(g93.f10842u0))));
        }
    }
}
