package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public class zzaru extends zzaqx {
    public zzaru(zzaqw zzaqwVar, boolean z) {
        super(zzaqwVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zza(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof zzaqw)) {
            zzakb.zzdk("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzaqw zzaqwVar = (zzaqw) webView;
        if (this.zzxd != null) {
            this.zzxd.zza(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzd(str, map);
        }
        if (zzaqwVar.zzuf() != null) {
            zzaqwVar.zzuf().zznk();
        }
        String str2 = (String) zzkb.zzik().zzd(zzaqwVar.zzud().zzvs() ? zznk.zzawe : zzaqwVar.zzuj() ? zznk.zzawd : zznk.zzawc);
        com.google.android.gms.ads.internal.zzbv.zzek();
        return zzakk.zzf(zzaqwVar.getContext(), zzaqwVar.zztq().zzcw, str2);
    }
}
