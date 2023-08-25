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

    public final WebResourceResponse G0(WebView webView, String str, Map map) {
        if (!(webView instanceof a74)) {
            k04.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        a74 a74Var = (a74) webView;
        cx3 cx3Var = this.J;
        if (cx3Var != null) {
            cx3Var.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.T(str, map);
        }
        if (a74Var.zzP() != null) {
            a74Var.zzP().zzE();
        }
        String str2 = (String) zzba.zzc().b(a74Var.o().i() ? g93.M : a74Var.L() ? g93.L : g93.K);
        zzt.zzp();
        return zzs.zzu(a74Var.getContext(), a74Var.zzp().p, str2);
    }
}
