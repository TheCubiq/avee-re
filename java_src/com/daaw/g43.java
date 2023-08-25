package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class g43 {

    /* renamed from: a */
    public gp2 f10254a;

    /* renamed from: b */
    public boolean f10255b;

    /* renamed from: c */
    public final ExecutorService f10256c;

    public g43() {
        this.f10256c = zz3.f35693b;
    }

    public g43(final Context context) {
        ExecutorService executorService = zz3.f35693b;
        this.f10256c = executorService;
        g93.m21879c(context);
        if (((Boolean) zzba.zzc().m23658b(g93.f10708h9)).booleanValue()) {
            executorService.execute(new Runnable() { // from class: com.daaw.y33
                @Override // java.lang.Runnable
                public final void run() {
                    g43.this.m21968b(context);
                }
            });
        } else {
            m21968b(context);
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ ExecutorService m21969a(g43 g43Var) {
        return g43Var.f10256c;
    }

    /* renamed from: c */
    public final void m21968b(Context context) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10824s4)).booleanValue()) {
            try {
                this.f10254a = (gp2) o04.m14656b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new m04() { // from class: com.daaw.z33
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.daaw.m04
                    public final Object zza(Object obj) {
                        return fp2.m22423g3(obj);
                    }
                });
                this.f10254a.mo21361Y(nt0.m14830g3(context), "GMA_SDK");
                this.f10255b = true;
            } catch (RemoteException | n04 | NullPointerException unused) {
                k04.zze("Cannot dynamite load clearcut");
            }
        }
    }
}
