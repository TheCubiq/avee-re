package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class c46 implements i76 {
    public final g77 a;
    public final ViewGroup b;
    public final Context c;
    public final Set d;

    public c46(g77 g77Var, ViewGroup viewGroup, Context context, Set set) {
        this.a = g77Var;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }

    public final /* synthetic */ d46 a() {
        if (((Boolean) zzba.zzc().b(g93.p5)).booleanValue() && this.b != null && this.d.contains("banner")) {
            return new d46(Boolean.valueOf(this.b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) zzba.zzc().b(g93.q5)).booleanValue() && this.d.contains("native")) {
            Context context = this.c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new d46(bool);
            }
        }
        return new d46(null);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 22;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.b46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c46.this.a();
            }
        });
    }
}
