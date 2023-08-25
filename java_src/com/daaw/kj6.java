package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class kj6 {
    public static kj6 d;
    public final Context a;
    public final zzcl b;
    public final AtomicReference c = new AtomicReference();

    public kj6(Context context, zzcl zzclVar) {
        this.a = context;
        this.b = zzclVar;
    }

    public static zzcl a(Context context) {
        try {
            return zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            k04.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static kj6 d(Context context) {
        synchronized (kj6.class) {
            kj6 kj6Var = d;
            if (kj6Var != null) {
                return kj6Var;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) hb3.b.e()).longValue();
            zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 224400003) {
                zzclVar = a(applicationContext);
            }
            kj6 kj6Var2 = new kj6(applicationContext, zzclVar);
            d = kj6Var2;
            return kj6Var2;
        }
    }

    public final an3 b() {
        return (an3) this.c.get();
    }

    public final zzchu c(int i, boolean z, int i2) {
        zzt.zzp();
        boolean zzA = zzs.zzA(this.a);
        zzchu zzchuVar = new zzchu(224400000, i2, true, zzA);
        if (((Boolean) hb3.c.e()).booleanValue()) {
            zzcl zzclVar = this.b;
            zzen zzenVar = null;
            if (zzclVar != null) {
                try {
                    zzenVar = zzclVar.getLiteSdkVersion();
                } catch (RemoteException unused) {
                }
            }
            return zzenVar == null ? zzchuVar : new zzchu(224400000, zzenVar.zza(), true, zzA);
        }
        return zzchuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.daaw.an3 r4) {
        /*
            r3 = this;
            com.daaw.ma3 r0 = com.daaw.hb3.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L23
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.b
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.daaw.an3 r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.c
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            r4 = r0
        L1f:
            com.daaw.jj6.a(r2, r1, r4)
            return
        L23:
            java.util.concurrent.atomic.AtomicReference r0 = r3.c
            com.daaw.jj6.a(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kj6.e(com.daaw.an3):void");
    }
}
