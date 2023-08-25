package com.daaw;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public class g84 extends h74 {
    public g84(a74 a74Var, x33 x33Var, boolean z) {
        super(a74Var, x33Var, z);
    }

    /* renamed from: G0 */
    public final WebResourceResponse m21885G0(WebView webView, String str, Map map) {
        if (!(webView instanceof a74)) {
            k04.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        a74 a74Var = (a74) webView;
        cx3 cx3Var = this.f12142J;
        if (cx3Var != null) {
            cx3Var.mo3152a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.m20968T(str, map);
        }
        if (a74Var.zzP() != null) {
            a74Var.zzP().zzE();
        }
        String str2 = (String) zzba.zzc().m23658b(a74Var.mo6408o().m7329i() ? g93.f10481M : a74Var.mo6449L() ? g93.f10471L : g93.f10461K);
        zzt.zzp();
        return zzs.zzu(a74Var.getContext(), a74Var.zzp().f36993p, str2);
    }
}
