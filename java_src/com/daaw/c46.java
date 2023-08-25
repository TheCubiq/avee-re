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

    /* renamed from: a */
    public final g77 f5471a;

    /* renamed from: b */
    public final ViewGroup f5472b;

    /* renamed from: c */
    public final Context f5473c;

    /* renamed from: d */
    public final Set f5474d;

    public c46(g77 g77Var, ViewGroup viewGroup, Context context, Set set) {
        this.f5471a = g77Var;
        this.f5474d = set;
        this.f5472b = viewGroup;
        this.f5473c = context;
    }

    /* renamed from: a */
    public final /* synthetic */ d46 m25626a() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10792p5)).booleanValue() && this.f5472b != null && this.f5474d.contains("banner")) {
            return new d46(Boolean.valueOf(this.f5472b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) zzba.zzc().m23658b(g93.f10803q5)).booleanValue() && this.f5474d.contains("native")) {
            Context context = this.f5473c;
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
        return this.f5471a.mo20112M(new Callable() { // from class: com.daaw.b46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c46.this.m25626a();
            }
        });
    }
}
