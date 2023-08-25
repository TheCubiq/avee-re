package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.daaw.a74;
import com.daaw.cw6;
import com.daaw.dw6;
import com.daaw.ew6;
import com.daaw.g93;
import com.daaw.iw6;
import com.daaw.rw6;
import com.daaw.tw6;
import com.daaw.tx6;
import com.daaw.uw6;
import com.daaw.vw6;
import com.daaw.ww6;
import com.daaw.z04;
import com.daaw.zu8;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzw {
    public uw6 f;
    public a74 c = null;
    public boolean e = false;
    public String a = null;
    public ew6 d = null;
    public String b = null;

    public final void a(String str) {
        b(str, new HashMap());
    }

    public final void b(final String str, final Map map) {
        z04.e.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzw.this.d(str, map);
            }
        });
    }

    public final void c(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            b("onError", hashMap);
        }
    }

    public final /* synthetic */ void d(String str, Map map) {
        a74 a74Var = this.c;
        if (a74Var != null) {
            a74Var.T(str, map);
        }
    }

    public final void e(tw6 tw6Var) {
        if (!TextUtils.isEmpty(tw6Var.b())) {
            if (!((Boolean) zzba.zzc().b(g93.u9)).booleanValue()) {
                this.a = tw6Var.b();
            }
        }
        switch (tw6Var.a()) {
            case 8152:
                a("onLMDOverlayOpened");
                return;
            case 8153:
                a("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                a("onLMDOverlayClose");
                return;
            case 8157:
                this.a = null;
                this.b = null;
                this.e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(tw6Var.a()));
                b("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final ww6 f() {
        vw6 c = ww6.c();
        if (!((Boolean) zzba.zzc().b(g93.u9)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                c.b(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.a(this.b);
        }
        return c.c();
    }

    public final void g() {
        if (this.f == null) {
            this.f = new zu8(this);
        }
    }

    public final synchronized void zza(a74 a74Var, Context context) {
        this.c = a74Var;
        if (!zzk(context)) {
            c("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        b("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        ew6 ew6Var;
        if (!this.e || (ew6Var = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        ew6Var.b(f(), this.f);
        a("onLMDOverlayCollapse");
    }

    public final void zzc() {
        ew6 ew6Var;
        if (!this.e || (ew6Var = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        cw6 c = dw6.c();
        if (!((Boolean) zzba.zzc().b(g93.u9)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                c.b(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.a(this.b);
        }
        ew6Var.a(c.c(), this.f);
    }

    public final void zzg() {
        ew6 ew6Var;
        if (!this.e || (ew6Var = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        ew6Var.d(f(), this.f);
        a("onLMDOverlayExpand");
    }

    public final void zzj(a74 a74Var, rw6 rw6Var) {
        if (a74Var == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.c = a74Var;
        if (!this.e && !zzk(a74Var.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().b(g93.u9)).booleanValue()) {
            this.b = rw6Var.g();
        }
        g();
        ew6 ew6Var = this.d;
        if (ew6Var != null) {
            ew6Var.c(rw6Var, this.f);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (tx6.a(context)) {
            try {
                this.d = iw6.a(context);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
                com.google.android.gms.ads.internal.zzt.zzo().u(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
            }
            if (this.d == null) {
                this.e = false;
                return false;
            }
            g();
            this.e = true;
            return true;
        }
        return false;
    }
}
