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

    /* renamed from: d */
    public static kj6 f16416d;

    /* renamed from: a */
    public final Context f16417a;

    /* renamed from: b */
    public final zzcl f16418b;

    /* renamed from: c */
    public final AtomicReference f16419c = new AtomicReference();

    public kj6(Context context, zzcl zzclVar) {
        this.f16417a = context;
        this.f16418b = zzclVar;
    }

    /* renamed from: a */
    public static zzcl m17699a(Context context) {
        try {
            return zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            k04.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    /* renamed from: d */
    public static kj6 m17696d(Context context) {
        synchronized (kj6.class) {
            kj6 kj6Var = f16416d;
            if (kj6Var != null) {
                return kj6Var;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) hb3.f12352b.m16137e()).longValue();
            zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 224400003) {
                zzclVar = m17699a(applicationContext);
            }
            kj6 kj6Var2 = new kj6(applicationContext, zzclVar);
            f16416d = kj6Var2;
            return kj6Var2;
        }
    }

    /* renamed from: b */
    public final an3 m17698b() {
        return (an3) this.f16419c.get();
    }

    /* renamed from: c */
    public final zzchu m17697c(int i, boolean z, int i2) {
        zzt.zzp();
        boolean zzA = zzs.zzA(this.f16417a);
        zzchu zzchuVar = new zzchu(224400000, i2, true, zzA);
        if (((Boolean) hb3.f12353c.m16137e()).booleanValue()) {
            zzcl zzclVar = this.f16418b;
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
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17695e(an3 an3Var) {
        an3 adapterCreator;
        if (!((Boolean) hb3.f12351a.m16137e()).booleanValue()) {
            jj6.m18473a(this.f16419c, null, an3Var);
            return;
        }
        zzcl zzclVar = this.f16418b;
        if (zzclVar != null) {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.f16419c;
            if (adapterCreator != null) {
                an3Var = adapterCreator;
            }
            jj6.m18473a(atomicReference, null, an3Var);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.f16419c;
        if (adapterCreator != null) {
        }
        jj6.m18473a(atomicReference2, null, an3Var);
    }
}
