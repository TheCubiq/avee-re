package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.C0507a;
import androidx.work.C0511b;
import com.daaw.C2943sj;
import com.daaw.dy1;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.ou0;
import com.daaw.qs0;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    /* renamed from: g3 */
    public static void m1374g3(Context context) {
        try {
            dy1.m23813e(context.getApplicationContext(), new C0507a.C0509b().m27974a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(yd0 yd0Var) {
        Context context = (Context) nt0.m14831M(yd0Var);
        m1374g3(context);
        try {
            dy1 m23814d = dy1.m23814d(context);
            m23814d.mo23012a("offline_ping_sender_work");
            m23814d.m23815b(new ou0.C2482a(OfflinePingSender.class).m13863e(new C2943sj.C2944a().m10305b(qs0.CONNECTED).m10306a()).m13867a("offline_ping_sender_work").m13866b());
        } catch (IllegalStateException e) {
            k04.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(yd0 yd0Var, String str, String str2) {
        Context context = (Context) nt0.m14831M(yd0Var);
        m1374g3(context);
        C2943sj m10306a = new C2943sj.C2944a().m10305b(qs0.CONNECTED).m10306a();
        try {
            dy1.m23814d(context).m23815b(new ou0.C2482a(OfflineNotificationPoster.class).m13863e(m10306a).m13862f(new C0511b.C0512a().m27957e("uri", str).m27957e("gws_query_id", str2).m27961a()).m13867a("offline_notification_work").m13866b());
            return true;
        } catch (IllegalStateException e) {
            k04.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
