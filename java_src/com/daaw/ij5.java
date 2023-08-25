package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ij5 {

    /* renamed from: a */
    public final ScheduledExecutorService f13685a;

    /* renamed from: b */
    public final g77 f13686b;

    /* renamed from: c */
    public final zj5 f13687c;

    /* renamed from: d */
    public final qz7 f13688d;

    public ij5(ScheduledExecutorService scheduledExecutorService, g77 g77Var, zj5 zj5Var, qz7 qz7Var) {
        this.f13685a = scheduledExecutorService;
        this.f13686b = g77Var;
        this.f13687c = zj5Var;
        this.f13688d = qz7Var;
    }

    /* renamed from: a */
    public final /* synthetic */ f77 m19747a(zzccb zzccbVar, int i, Throwable th) {
        return ((cn5) this.f13688d.zzb()).m25213i3(zzccbVar, i);
    }

    /* renamed from: b */
    public final f77 m19746b(final zzccb zzccbVar) {
        f77 f77Var;
        String str = zzccbVar.f36967s;
        zzt.zzp();
        if (zzs.zzy(str)) {
            f77Var = s67.m10635h(new pk5(1));
        } else {
            final zj5 zj5Var = this.f13687c;
            synchronized (zj5Var.f32768b) {
                if (zj5Var.f32769c) {
                    f77Var = zj5Var.f32767a;
                } else {
                    zj5Var.f32769c = true;
                    zj5Var.f32771e = zzccbVar;
                    zj5Var.f32772f.checkAvailabilityAndConnect();
                    zj5Var.f32767a.mo6515f(new Runnable() { // from class: com.daaw.yj5
                        @Override // java.lang.Runnable
                        public final void run() {
                            zj5.this.m5043a();
                        }
                    }, z04.f34310f);
                    f77Var = zj5Var.f32767a;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return s67.m10636g((j67) s67.m10628o(j67.m18784D(f77Var), ((Integer) zzba.zzc().m23658b(g93.f10586W4)).intValue(), TimeUnit.SECONDS, this.f13685a), Throwable.class, new w57() { // from class: com.daaw.hj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return ij5.this.m19747a(zzccbVar, callingUid, (Throwable) obj);
            }
        }, this.f13686b);
    }
}
