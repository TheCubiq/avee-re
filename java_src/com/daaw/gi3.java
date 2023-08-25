package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.p003h5.OnH5AdsEventListener;
/* loaded from: classes.dex */
public final class gi3 {

    /* renamed from: a */
    public final Context f11327a;

    /* renamed from: b */
    public final OnH5AdsEventListener f11328b;

    /* renamed from: c */
    public ci3 f11329c;

    public gi3(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        ry0.m10826n(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        ry0.m10830j(context);
        ry0.m10830j(onH5AdsEventListener);
        this.f11327a = context;
        this.f11328b = onH5AdsEventListener;
        g93.m21879c(context);
    }

    /* renamed from: c */
    public static final boolean m21575c(String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10420F8)).booleanValue()) {
            ry0.m10830j(str);
            if (str.length() > ((Integer) zzba.zzc().m23658b(g93.f10440H8)).intValue()) {
                k04.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    /* renamed from: a */
    public final void m21577a() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10420F8)).booleanValue()) {
            m21574d();
            ci3 ci3Var = this.f11329c;
            if (ci3Var != null) {
                try {
                    ci3Var.zze();
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m21576b(String str) {
        if (m21575c(str)) {
            m21574d();
            ci3 ci3Var = this.f11329c;
            if (ci3Var != null) {
                try {
                    ci3Var.mo18491f(str);
                    return true;
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public final void m21574d() {
        if (this.f11329c != null) {
            return;
        }
        this.f11329c = zzay.zza().zzl(this.f11327a, new xm3(), this.f11328b);
    }
}
