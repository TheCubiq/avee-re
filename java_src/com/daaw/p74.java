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
    public static final a74 a(final Context context, final v84 v84Var, final String str, final boolean z, final boolean z2, final sl2 sl2Var, final ja3 ja3Var, final zzchu zzchuVar, v93 v93Var, final zzl zzlVar, final zza zzaVar, final x33 x33Var, final th6 th6Var, final wh6 wh6Var) {
        g93.c(context);
        try {
            iz6 iz6Var = new iz6(context, v84Var, str, z, z2, sl2Var, ja3Var, zzchuVar, null, zzlVar, zzaVar, x33Var, th6Var, wh6Var) { // from class: com.daaw.i74
                public final /* synthetic */ th6 A;
                public final /* synthetic */ wh6 B;
                public final /* synthetic */ Context p;
                public final /* synthetic */ v84 q;
                public final /* synthetic */ String r;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ sl2 u;
                public final /* synthetic */ ja3 v;
                public final /* synthetic */ zzchu w;
                public final /* synthetic */ zzl x;
                public final /* synthetic */ zza y;
                public final /* synthetic */ x33 z;

                {
                    this.x = zzlVar;
                    this.y = zzaVar;
                    this.z = x33Var;
                    this.A = th6Var;
                    this.B = wh6Var;
                }

                @Override // com.daaw.iz6
                public final Object zza() {
                    Context context2 = this.p;
                    v84 v84Var2 = this.q;
                    String str2 = this.r;
                    boolean z3 = this.s;
                    boolean z4 = this.t;
                    sl2 sl2Var2 = this.u;
                    ja3 ja3Var2 = this.v;
                    zzchu zzchuVar2 = this.w;
                    zzl zzlVar2 = this.x;
                    zza zzaVar2 = this.y;
                    x33 x33Var2 = this.z;
                    th6 th6Var2 = this.A;
                    wh6 wh6Var2 = this.B;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = w74.p0;
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
