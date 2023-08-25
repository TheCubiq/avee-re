package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.daaw.dy1;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.ou0;
import com.daaw.qs0;
import com.daaw.sj;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    public static void g3(Context context) {
        try {
            dy1.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(yd0 yd0Var) {
        Context context = (Context) nt0.M(yd0Var);
        g3(context);
        try {
            dy1 d = dy1.d(context);
            d.a("offline_ping_sender_work");
            d.b(new ou0.a(OfflinePingSender.class).e(new sj.a().b(qs0.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e) {
            k04.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(yd0 yd0Var, String str, String str2) {
        Context context = (Context) nt0.M(yd0Var);
        g3(context);
        sj a = new sj.a().b(qs0.CONNECTED).a();
        try {
            dy1.d(context).b(new ou0.a(OfflineNotificationPoster.class).e(a).f(new b.a().e("uri", str).e("gws_query_id", str2).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e) {
            k04.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
