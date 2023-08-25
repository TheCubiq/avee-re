package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
/* loaded from: classes.dex */
public final class d84 {

    /* renamed from: a */
    public final e84 f6606a;

    /* renamed from: b */
    public final c84 f6607b;

    public d84(e84 e84Var, c84 c84Var, byte[] bArr) {
        this.f6607b = c84Var;
        this.f6606a = e84Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void m24601a(String str) {
        c84 c84Var = this.f6607b;
        Uri parse = Uri.parse(str);
        h74 m6458E0 = ((w74) c84Var.f5618a).m6458E0();
        if (m6458E0 == null) {
            k04.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            m6458E0.mo9449k0(parse);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.daaw.l84, com.daaw.e84] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r0 = this.f6606a;
            sl2 mo6425a = r0.mo6425a();
            if (mo6425a == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                ol2 m10202c = mo6425a.m10202c();
                if (m10202c == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (r0.getContext() != null) {
                    Context context = this.f6606a.getContext();
                    e84 e84Var = this.f6606a;
                    return m10202c.zzf(context, str, (View) e84Var, e84Var.zzk());
                } else {
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        zze.zza(str2);
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.daaw.l84, com.daaw.e84] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r0 = this.f6606a;
        sl2 mo6425a = r0.mo6425a();
        if (mo6425a == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            ol2 m10202c = mo6425a.m10202c();
            if (m10202c == null) {
                str = "Signals object is empty, ignoring.";
            } else if (r0.getContext() != null) {
                Context context = this.f6606a.getContext();
                e84 e84Var = this.f6606a;
                return m10202c.zzh(context, (View) e84Var, e84Var.zzk());
            } else {
                str = "Context is null, ignoring.";
            }
        }
        zze.zza(str);
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            k04.zzj("URL is empty, ignoring message");
        } else {
            zzs.zza.post(new Runnable() { // from class: com.daaw.b84
                @Override // java.lang.Runnable
                public final void run() {
                    d84.this.m24601a(str);
                }
            });
        }
    }
}
