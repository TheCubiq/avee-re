package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class gi3 {
    public final Context a;
    public final OnH5AdsEventListener b;
    public ci3 c;

    public gi3(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        ry0.n(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        ry0.j(context);
        ry0.j(onH5AdsEventListener);
        this.a = context;
        this.b = onH5AdsEventListener;
        g93.c(context);
    }

    public static final boolean c(String str) {
        if (((Boolean) zzba.zzc().b(g93.F8)).booleanValue()) {
            ry0.j(str);
            if (str.length() > ((Integer) zzba.zzc().b(g93.H8)).intValue()) {
                k04.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    public final void a() {
        if (((Boolean) zzba.zzc().b(g93.F8)).booleanValue()) {
            d();
            ci3 ci3Var = this.c;
            if (ci3Var != null) {
                try {
                    ci3Var.zze();
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean b(String str) {
        if (c(str)) {
            d();
            ci3 ci3Var = this.c;
            if (ci3Var != null) {
                try {
                    ci3Var.f(str);
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

    public final void d() {
        if (this.c != null) {
            return;
        }
        this.c = zzay.zza().zzl(this.a, new xm3(), this.b);
    }
}
