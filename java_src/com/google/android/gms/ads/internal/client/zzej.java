package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.fj5;
import com.daaw.g93;
import com.daaw.hj3;
import com.daaw.hz6;
import com.daaw.ij3;
import com.daaw.k04;
import com.daaw.ml5;
import com.daaw.mm2;
import com.daaw.nt0;
import com.daaw.ry0;
import com.daaw.tm3;
import com.daaw.tn5;
import com.daaw.xm3;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbrz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzej {
    @GuardedBy("InternalMobileAds.class")
    public static zzej i;
    @GuardedBy("settingManagerLock")
    public zzco f;
    public final Object a = new Object();
    @GuardedBy("stateLock")
    public boolean c = false;
    @GuardedBy("stateLock")
    public boolean d = false;
    public final Object e = new Object();
    @Nullable
    public OnAdInspectorClosedListener g = null;
    public RequestConfiguration h = new RequestConfiguration.Builder().build();
    @GuardedBy("stateLock")
    public final ArrayList b = new ArrayList();

    public static InitializationStatus k(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrz zzbrzVar = (zzbrz) it.next();
            hashMap.put(zzbrzVar.p, new hj3(zzbrzVar.q ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbrzVar.s, zzbrzVar.r));
        }
        return new ij3(hashMap);
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (i == null) {
                i = new zzej();
            }
            zzejVar = i;
        }
        return zzejVar;
    }

    @GuardedBy("settingManagerLock")
    public final void a(Context context) {
        if (this.f == null) {
            this.f = (zzco) new mm2(zzay.zza(), context).d(context, false);
        }
    }

    @GuardedBy("settingManagerLock")
    public final void b(RequestConfiguration requestConfiguration) {
        try {
            this.f.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            k04.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public final /* synthetic */ void i(Context context, String str) {
        synchronized (this.e) {
            l(context, null);
        }
    }

    public final /* synthetic */ void j(Context context, String str) {
        synchronized (this.e) {
            l(context, null);
        }
    }

    @GuardedBy("settingManagerLock")
    public final void l(Context context, @Nullable String str) {
        try {
            tm3.a().b(context, null);
            this.f.zzk();
            this.f.zzl(null, nt0.g3(null));
        } catch (RemoteException e) {
            k04.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final float zza() {
        synchronized (this.e) {
            zzco zzcoVar = this.f;
            float f = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                f = zzcoVar.zze();
            } catch (RemoteException e) {
                k04.zzh("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final RequestConfiguration zzc() {
        return this.h;
    }

    public final InitializationStatus zze() {
        InitializationStatus k;
        synchronized (this.e) {
            ry0.n(this.f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                k = k(this.f.zzg());
            } catch (RemoteException unused) {
                k04.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzej zzejVar = zzej.this;
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new fj5(zzejVar));
                        return hashMap;
                    }
                };
            }
        }
        return k;
    }

    @Deprecated
    public final String zzh() {
        String c;
        synchronized (this.e) {
            ry0.n(this.f != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                c = hz6.c(this.f.zzf());
            } catch (RemoteException e) {
                k04.zzh("Unable to get version string.", e);
                return "";
            }
        }
        return c;
    }

    public final void zzl(Context context) {
        synchronized (this.e) {
            a(context);
            try {
                this.f.zzi();
            } catch (RemoteException unused) {
                k04.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z) {
        synchronized (this.e) {
            ry0.n(this.f != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.f.zzj(z);
            } catch (RemoteException e) {
                String str = z ? "enable" : "disable";
                k04.zzh("Unable to " + str + " Same App Key.", e);
                if (e.getMessage() != null && e.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public final void zzn(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.a) {
            if (this.c) {
                if (onInitializationCompleteListener != null) {
                    this.b.add(onInitializationCompleteListener);
                }
            } else if (this.d) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.c = true;
                if (onInitializationCompleteListener != null) {
                    this.b.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.e) {
                    try {
                        a(context);
                        this.f.zzs(new tn5(this, null));
                        this.f.zzo(new xm3());
                        if (this.h.getTagForChildDirectedTreatment() != -1 || this.h.getTagForUnderAgeOfConsent() != -1) {
                            b(this.h);
                        }
                    } catch (RemoteException e) {
                        k04.zzk("MobileAdsSettingManager initialization failed", e);
                    }
                    g93.c(context);
                    if (((Boolean) ya3.a.e()).booleanValue()) {
                        if (((Boolean) zzba.zzc().b(g93.m9)).booleanValue()) {
                            k04.zze("Initializing on bg thread");
                            zz3.a.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzec
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.i(this.zzb, null);
                                }
                            });
                        }
                    }
                    if (((Boolean) ya3.b.e()).booleanValue()) {
                        if (((Boolean) zzba.zzc().b(g93.m9)).booleanValue()) {
                            zz3.b.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzed
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.j(this.zzb, null);
                                }
                            });
                        }
                    }
                    k04.zze("Initializing on calling thread");
                    l(context, null);
                }
            }
        }
    }

    public final void zzq(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.e) {
            a(context);
            this.g = onAdInspectorClosedListener;
            try {
                this.f.zzm(new ml5(null));
            } catch (RemoteException unused) {
                k04.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzr(Context context, String str) {
        synchronized (this.e) {
            ry0.n(this.f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f.zzn(nt0.g3(context), str);
            } catch (RemoteException e) {
                k04.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.e) {
            try {
                this.f.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                k04.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized (this.e) {
            ry0.n(this.f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f.zzp(z);
            } catch (RemoteException e) {
                k04.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzu(float f) {
        boolean z = true;
        ry0.b(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.e) {
            if (this.f == null) {
                z = false;
            }
            ry0.n(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f.zzq(f);
            } catch (RemoteException e) {
                k04.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzv(String str) {
        synchronized (this.e) {
            ry0.n(this.f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f.zzt(str);
            } catch (RemoteException e) {
                k04.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration) {
        ry0.b(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.e) {
            RequestConfiguration requestConfiguration2 = this.h;
            this.h = requestConfiguration;
            if (this.f == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                b(requestConfiguration);
            }
        }
    }

    public final boolean zzx() {
        synchronized (this.e) {
            zzco zzcoVar = this.f;
            boolean z = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                z = zzcoVar.zzv();
            } catch (RemoteException e) {
                k04.zzh("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}
