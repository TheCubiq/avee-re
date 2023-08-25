package com.daaw;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class p74 {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.daaw.a74, java.lang.Object] */
    /* renamed from: a */
    public static final a74 m13613a(final Context context, final v84 v84Var, final String str, final boolean z, final boolean z2, final sl2 sl2Var, final ja3 ja3Var, final zzchu zzchuVar, v93 v93Var, final zzl zzlVar, final zza zzaVar, final x33 x33Var, final th6 th6Var, final wh6 wh6Var) {
        g93.m21879c(context);
        try {
            iz6 iz6Var = new iz6(context, v84Var, str, z, z2, sl2Var, ja3Var, zzchuVar, null, zzlVar, zzaVar, x33Var, th6Var, wh6Var) { // from class: com.daaw.i74

                /* renamed from: A */
                public final /* synthetic */ th6 f13325A;

                /* renamed from: B */
                public final /* synthetic */ wh6 f13326B;

                /* renamed from: p */
                public final /* synthetic */ Context f13327p;

                /* renamed from: q */
                public final /* synthetic */ v84 f13328q;

                /* renamed from: r */
                public final /* synthetic */ String f13329r;

                /* renamed from: s */
                public final /* synthetic */ boolean f13330s;

                /* renamed from: t */
                public final /* synthetic */ boolean f13331t;

                /* renamed from: u */
                public final /* synthetic */ sl2 f13332u;

                /* renamed from: v */
                public final /* synthetic */ ja3 f13333v;

                /* renamed from: w */
                public final /* synthetic */ zzchu f13334w;

                /* renamed from: x */
                public final /* synthetic */ zzl f13335x;

                /* renamed from: y */
                public final /* synthetic */ zza f13336y;

                /* renamed from: z */
                public final /* synthetic */ x33 f13337z;

                {
                    this.f13335x = zzlVar;
                    this.f13336y = zzaVar;
                    this.f13337z = x33Var;
                    this.f13325A = th6Var;
                    this.f13326B = wh6Var;
                }

                @Override // com.daaw.iz6
                public final Object zza() {
                    Context context2 = this.f13327p;
                    v84 v84Var2 = this.f13328q;
                    String str2 = this.f13329r;
                    boolean z3 = this.f13330s;
                    boolean z4 = this.f13331t;
                    sl2 sl2Var2 = this.f13332u;
                    ja3 ja3Var2 = this.f13333v;
                    zzchu zzchuVar2 = this.f13334w;
                    zzl zzlVar2 = this.f13335x;
                    zza zzaVar2 = this.f13336y;
                    x33 x33Var2 = this.f13337z;
                    th6 th6Var2 = this.f13325A;
                    wh6 wh6Var2 = this.f13326B;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = w74.f30971p0;
                        s74 s74Var = new s74(new w74(new u84(context2), v84Var2, str2, z3, z4, sl2Var2, ja3Var2, zzchuVar2, null, zzlVar2, zzaVar2, x33Var2, th6Var2, wh6Var2));
                        s74Var.setWebViewClient(zzt.zzq().zzd(s74Var, x33Var2, z4));
                        s74Var.setWebChromeClient(new z64(s74Var));
                        return s74Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = iz6Var.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new l74("Webview initialization failed.", th);
        }
    }
}
