package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class g43 {
    public gp2 a;
    public boolean b;
    public final ExecutorService c;

    public g43() {
        this.c = zz3.b;
    }

    public g43(final Context context) {
        ExecutorService executorService = zz3.b;
        this.c = executorService;
        g93.c(context);
        if (((Boolean) zzba.zzc().b(g93.h9)).booleanValue()) {
            executorService.execute(new Runnable() { // from class: com.daaw.y33
                @Override // java.lang.Runnable
                public final void run() {
                    g43.this.b(context);
                }
            });
        } else {
            b(context);
        }
    }

    public static /* bridge */ /* synthetic */ ExecutorService a(g43 g43Var) {
        return g43Var.c;
    }

    /* renamed from: c */
    public final void b(Context context) {
        if (((Boolean) zzba.zzc().b(g93.s4)).booleanValue()) {
            try {
                this.a = (gp2) o04.b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new m04() { // from class: com.daaw.z33
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.daaw.m04
                    public final Object zza(Object obj) {
                        return fp2.g3(obj);
                    }
                });
                this.a.Y(nt0.g3(context), "GMA_SDK");
                this.b = true;
            } catch (RemoteException | n04 | NullPointerException unused) {
                k04.zze("Cannot dynamite load clearcut");
            }
        }
    }
}
