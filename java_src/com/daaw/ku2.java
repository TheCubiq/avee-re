package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzce;
/* loaded from: classes.dex */
public abstract class ku2 {
    public static final zzce a;

    static {
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzceVar = queryLocalInterface instanceof zzce ? (zzce) queryLocalInterface : new zzcc(iBinder);
                }
            } else {
                k04.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            k04.zzj("Failed to instantiate ClientApi class.");
        }
        a = zzceVar;
    }

    public abstract Object a();

    public abstract Object b(zzce zzceVar);

    public abstract Object c();

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L15
            com.google.android.gms.ads.internal.client.zzay.zzb()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = com.daaw.d04.y(r9, r1)
            if (r1 != 0) goto L15
            java.lang.String r10 = "Google Play Services is not available."
            com.daaw.k04.zze(r10)
            r10 = 1
        L15:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.a(r9, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.c(r9, r1)
            r3 = 0
            if (r2 <= r1) goto L24
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            r1 = r1 ^ r0
            r10 = r10 | r1
            com.daaw.g93.c(r9)
            com.daaw.ma3 r1 = com.daaw.va3.a
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3a
        L38:
            r10 = 0
            goto L4d
        L3a:
            com.daaw.ma3 r1 = com.daaw.va3.b
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4b
            r10 = 1
            r3 = 1
            goto L4d
        L4b:
            r3 = r10
            goto L38
        L4d:
            if (r3 == 0) goto L5c
            java.lang.Object r9 = r8.e()
            if (r9 != 0) goto La2
            if (r10 != 0) goto La2
            java.lang.Object r9 = r8.f()
            goto La2
        L5c:
            java.lang.Object r10 = r8.f()
            if (r10 != 0) goto L9a
            com.daaw.ma3 r1 = com.daaw.nb3.a
            java.lang.Object r1 = r1.e()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.util.Random r2 = com.google.android.gms.ads.internal.client.zzay.zze()
            int r1 = r2.nextInt(r1)
            if (r1 != 0) goto L9a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r6.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r6.putInt(r1, r0)
            com.daaw.d04 r2 = com.google.android.gms.ads.internal.client.zzay.zzb()
            com.google.android.gms.internal.ads.zzchu r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.String r4 = r0.p
            r7 = 1
            java.lang.String r5 = "gmob-apps"
            r3 = r9
            r2.t(r3, r4, r5, r6, r7)
        L9a:
            if (r10 != 0) goto La1
            java.lang.Object r9 = r8.e()
            goto La2
        La1:
            r9 = r10
        La2:
            if (r9 != 0) goto La8
            java.lang.Object r9 = r8.a()
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ku2.d(android.content.Context, boolean):java.lang.Object");
    }

    public final Object e() {
        zzce zzceVar = a;
        if (zzceVar == null) {
            k04.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(zzceVar);
        } catch (RemoteException e) {
            k04.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    public final Object f() {
        try {
            return c();
        } catch (RemoteException e) {
            k04.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }
}
