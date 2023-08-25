package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.co;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class rs5 implements qq5 {
    public final Context a;
    public final s05 b;
    public final Executor c;
    public final sh6 d;

    public rs5(Context context, Executor executor, s05 s05Var, sh6 sh6Var) {
        this.a = context;
        this.b = s05Var;
        this.c = executor;
        this.d = sh6Var;
    }

    public static String d(th6 th6Var) {
        try {
            return th6Var.w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        Context context = this.a;
        return (context instanceof Activity) && ia3.g(context) && !TextUtils.isEmpty(d(th6Var));
    }

    @Override // com.daaw.qq5
    public final f77 b(final fi6 fi6Var, final th6 th6Var) {
        String d = d(th6Var);
        final Uri parse = d != null ? Uri.parse(d) : null;
        return s67.n(s67.i(null), new w57() { // from class: com.daaw.ps5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return rs5.this.c(parse, fi6Var, th6Var, obj);
            }
        }, this.c);
    }

    public final /* synthetic */ f77 c(Uri uri, fi6 fi6Var, th6 th6Var, Object obj) {
        try {
            co a = new co.a().a();
            a.a.setData(uri);
            zzc zzcVar = new zzc(a.a, null);
            final e14 e14Var = new e14();
            pz4 c = this.b.c(new rm4(fi6Var, th6Var, null), new sz4(new c15() { // from class: com.daaw.qs5
                @Override // com.daaw.c15
                public final void a(boolean z, Context context, br4 br4Var) {
                    e14 e14Var2 = e14.this;
                    try {
                        zzt.zzi();
                        zzm.zza(context, (AdOverlayInfoParcel) e14Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            e14Var.b(new AdOverlayInfoParcel(zzcVar, null, c.h(), null, new zzchu(0, 0, false, false, false), null, null));
            this.d.a();
            return s67.i(c.i());
        } catch (Throwable th) {
            k04.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
