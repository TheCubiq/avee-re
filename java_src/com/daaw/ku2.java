package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public abstract class ku2 {

    /* renamed from: a */
    public static final zzce f16748a;

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
        f16748a = zzceVar;
    }

    /* renamed from: a */
    public abstract Object mo3435a();

    /* renamed from: b */
    public abstract Object mo3434b(zzce zzceVar);

    /* renamed from: c */
    public abstract Object mo3433c();

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17432d(Context context, boolean z) {
        boolean z2;
        Object m17431e;
        if (!z) {
            zzay.zzb();
            if (!d04.m24807y(context, c80.f5613a)) {
                k04.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = z | (!(DynamiteModule.m1149a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m1147c(context, ModuleDescriptor.MODULE_ID)));
        g93.m21879c(context);
        if (!((Boolean) va3.f30077a.m16137e()).booleanValue()) {
            if (((Boolean) va3.f30078b.m16137e()).booleanValue()) {
                z2 = true;
                z3 = true;
                if (z3) {
                    Object m17430f = m17430f();
                    if (m17430f == null) {
                        if (zzay.zze().nextInt(((Long) nb3.f19781a.m16137e()).intValue()) == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            zzay.zzb().m24812t(context, zzay.zzc().f36993p, "gmob-apps", bundle, true);
                        }
                    }
                    m17431e = m17430f == null ? m17431e() : m17430f;
                } else {
                    m17431e = m17431e();
                    if (m17431e == null && !z2) {
                        m17431e = m17430f();
                    }
                }
                return m17431e != null ? mo3435a() : m17431e;
            }
            z3 = z4;
        }
        z2 = false;
        if (z3) {
        }
        if (m17431e != null) {
        }
    }

    /* renamed from: e */
    public final Object m17431e() {
        zzce zzceVar = f16748a;
        if (zzceVar == null) {
            k04.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo3434b(zzceVar);
        } catch (RemoteException e) {
            k04.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: f */
    public final Object m17430f() {
        try {
            return mo3433c();
        } catch (RemoteException e) {
            k04.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }
}
