package com.daaw;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
/* loaded from: classes.dex */
public final class xm3 extends zm3 {

    /* renamed from: p */
    public static final hp3 f32803p = new hp3();

    @Override // com.daaw.an3
    /* renamed from: a */
    public final boolean mo3509a(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, xm3.class.getClassLoader()));
        } catch (Throwable unused) {
            k04.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.daaw.an3
    /* renamed from: l */
    public final boolean mo3508l(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, xm3.class.getClassLoader()));
        } catch (Throwable unused) {
            k04.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.daaw.an3
    /* renamed from: m */
    public final dp3 mo3507m(String str) {
        return new sp3((RtbAdapter) Class.forName(str, false, hp3.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.daaw.an3
    public final dn3 zzb(String str) {
        do3 do3Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, xm3.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new do3((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new do3((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                k04.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                k04.zze("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        do3Var = new do3(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                do3Var = new do3(new AdMobAdapter());
                return do3Var;
            }
        } catch (Throwable th) {
            k04.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }
}
