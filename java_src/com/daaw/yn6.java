package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class yn6 {

    /* renamed from: a */
    public final Context f33893a;

    /* renamed from: b */
    public final String f33894b;

    /* renamed from: c */
    public final String f33895c;

    public yn6(Context context, zzchu zzchuVar) {
        this.f33893a = context;
        this.f33894b = context.getPackageName();
        this.f33895c = zzchuVar.f36993p;
    }

    /* renamed from: a */
    public final void m3479a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put("device", zzs.zzq());
        map.put("app", this.f33894b);
        zzt.zzp();
        map.put("is_lite_sdk", true != zzs.zzA(this.f33893a) ? "0" : "1");
        List m21880b = g93.m21880b();
        if (((Boolean) zzba.zzc().m23658b(g93.f10793p6)).booleanValue()) {
            m21880b.addAll(zzt.zzo().m11915h().zzh().m17293d());
        }
        map.put("e", TextUtils.join(",", m21880b));
        map.put("sdkVersion", this.f33895c);
        if (((Boolean) zzba.zzc().m23658b(g93.f10818r9)).booleanValue()) {
            map.put("is_bstar", true == C2365nt.m14839b(this.f33893a) ? "1" : "0");
        }
    }
}
