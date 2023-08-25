package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.C0972co;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class rs5 implements qq5 {

    /* renamed from: a */
    public final Context f25573a;

    /* renamed from: b */
    public final s05 f25574b;

    /* renamed from: c */
    public final Executor f25575c;

    /* renamed from: d */
    public final sh6 f25576d;

    public rs5(Context context, Executor executor, s05 s05Var, sh6 sh6Var) {
        this.f25573a = context;
        this.f25574b = s05Var;
        this.f25575c = executor;
        this.f25576d = sh6Var;
    }

    /* renamed from: d */
    public static String m10974d(th6 th6Var) {
        try {
            return th6Var.f27718w.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        Context context = this.f25573a;
        return (context instanceof Activity) && ia3.m20002g(context) && !TextUtils.isEmpty(m10974d(th6Var));
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(final fi6 fi6Var, final th6 th6Var) {
        String m10974d = m10974d(th6Var);
        final Uri parse = m10974d != null ? Uri.parse(m10974d) : null;
        return s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.ps5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return rs5.this.m10975c(parse, fi6Var, th6Var, obj);
            }
        }, this.f25575c);
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m10975c(Uri uri, fi6 fi6Var, th6 th6Var, Object obj) {
        try {
            C0972co m25193a = new C0972co.C0973a().m25193a();
            m25193a.f5979a.setData(uri);
            zzc zzcVar = new zzc(m25193a.f5979a, null);
            final e14 e14Var = new e14();
            pz4 mo5263c = this.f25574b.mo5263c(new rm4(fi6Var, th6Var, null), new sz4(new c15() { // from class: com.daaw.qs5
                @Override // com.daaw.c15
                /* renamed from: a */
                public final void mo3165a(boolean z, Context context, br4 br4Var) {
                    e14 e14Var2 = e14.this;
                    try {
                        zzt.zzi();
                        zzm.zza(context, (AdOverlayInfoParcel) e14Var2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            e14Var.m23797b(new AdOverlayInfoParcel(zzcVar, null, mo5263c.mo9316h(), null, new zzchu(0, 0, false, false, false), null, null));
            this.f25576d.m10342a();
            return s67.m10634i(mo5263c.mo9315i());
        } catch (Throwable th) {
            k04.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
