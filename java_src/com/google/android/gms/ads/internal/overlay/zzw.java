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

    /* renamed from: f */
    public uw6 f36236f;

    /* renamed from: c */
    public a74 f36233c = null;

    /* renamed from: e */
    public boolean f36235e = false;

    /* renamed from: a */
    public String f36231a = null;

    /* renamed from: d */
    public ew6 f36234d = null;

    /* renamed from: b */
    public String f36232b = null;

    /* renamed from: a */
    public final void m1381a(String str) {
        m1380b(str, new HashMap());
    }

    /* renamed from: b */
    public final void m1380b(final String str, final Map map) {
        z04.f34309e.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzw.this.m1378d(str, map);
            }
        });
    }

    /* renamed from: c */
    public final void m1379c(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.f36233c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            m1380b("onError", hashMap);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m1378d(String str, Map map) {
        a74 a74Var = this.f36233c;
        if (a74Var != null) {
            a74Var.mo6434T(str, map);
        }
    }

    /* renamed from: e */
    public final void m1377e(tw6 tw6Var) {
        if (!TextUtils.isEmpty(tw6Var.mo3163b())) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10851u9)).booleanValue()) {
                this.f36231a = tw6Var.mo3163b();
            }
        }
        switch (tw6Var.mo3164a()) {
            case 8152:
                m1381a("onLMDOverlayOpened");
                return;
            case 8153:
                m1381a("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                m1381a("onLMDOverlayClose");
                return;
            case 8157:
                this.f36231a = null;
                this.f36232b = null;
                this.f36235e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(tw6Var.mo3164a()));
                m1380b("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    /* renamed from: f */
    public final ww6 m1376f() {
        vw6 m5747c = ww6.m5747c();
        if (!((Boolean) zzba.zzc().m23658b(g93.f10851u9)).booleanValue() || TextUtils.isEmpty(this.f36232b)) {
            String str = this.f36231a;
            if (str != null) {
                m5747c.mo1837b(str);
            } else {
                m1379c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            m5747c.mo1838a(this.f36232b);
        }
        return m5747c.mo1836c();
    }

    /* renamed from: g */
    public final void m1375g() {
        if (this.f36236f == null) {
            this.f36236f = new zu8(this);
        }
    }

    public final synchronized void zza(a74 a74Var, Context context) {
        this.f36233c = a74Var;
        if (!zzk(context)) {
            m1379c("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        m1380b("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        ew6 ew6Var;
        if (!this.f36235e || (ew6Var = this.f36234d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        ew6Var.mo18202b(m1376f(), this.f36236f);
        m1381a("onLMDOverlayCollapse");
    }

    public final void zzc() {
        ew6 ew6Var;
        if (!this.f36235e || (ew6Var = this.f36234d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        cw6 m23857c = dw6.m23857c();
        if (!((Boolean) zzba.zzc().m23658b(g93.f10851u9)).booleanValue() || TextUtils.isEmpty(this.f36232b)) {
            String str = this.f36231a;
            if (str != null) {
                m23857c.mo12030b(str);
            } else {
                m1379c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            m23857c.mo12031a(this.f36232b);
        }
        ew6Var.mo18203a(m23857c.mo12029c(), this.f36236f);
    }

    public final void zzg() {
        ew6 ew6Var;
        if (!this.f36235e || (ew6Var = this.f36234d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        ew6Var.mo18200d(m1376f(), this.f36236f);
        m1381a("onLMDOverlayExpand");
    }

    public final void zzj(a74 a74Var, rw6 rw6Var) {
        if (a74Var == null) {
            m1379c("adWebview missing", "onLMDShow");
            return;
        }
        this.f36233c = a74Var;
        if (!this.f36235e && !zzk(a74Var.getContext())) {
            m1379c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10851u9)).booleanValue()) {
            this.f36232b = rw6Var.mo6730g();
        }
        m1375g();
        ew6 ew6Var = this.f36234d;
        if (ew6Var != null) {
            ew6Var.mo18201c(rw6Var, this.f36236f);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (tx6.m8708a(context)) {
            try {
                this.f36234d = iw6.m19305a(context);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
                com.google.android.gms.ads.internal.zzt.zzo().m11902u(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
            }
            if (this.f36234d == null) {
                this.f36235e = false;
                return false;
            }
            m1375g();
            this.f36235e = true;
            return true;
        }
        return false;
    }
}
