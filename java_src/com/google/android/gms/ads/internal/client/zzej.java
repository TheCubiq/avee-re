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

    /* renamed from: i */
    public static zzej f36162i;
    @GuardedBy("settingManagerLock")

    /* renamed from: f */
    public zzco f36168f;

    /* renamed from: a */
    public final Object f36163a = new Object();
    @GuardedBy("stateLock")

    /* renamed from: c */
    public boolean f36165c = false;
    @GuardedBy("stateLock")

    /* renamed from: d */
    public boolean f36166d = false;

    /* renamed from: e */
    public final Object f36167e = new Object();
    @Nullable

    /* renamed from: g */
    public OnAdInspectorClosedListener f36169g = null;

    /* renamed from: h */
    public RequestConfiguration f36170h = new RequestConfiguration.Builder().build();
    @GuardedBy("stateLock")

    /* renamed from: b */
    public final ArrayList f36164b = new ArrayList();

    /* renamed from: k */
    public static InitializationStatus m1397k(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrz zzbrzVar = (zzbrz) it.next();
            hashMap.put(zzbrzVar.f36866p, new hj3(zzbrzVar.f36867q ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbrzVar.f36869s, zzbrzVar.f36868r));
        }
        return new ij3(hashMap);
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (f36162i == null) {
                f36162i = new zzej();
            }
            zzejVar = f36162i;
        }
        return zzejVar;
    }

    @GuardedBy("settingManagerLock")
    /* renamed from: a */
    public final void m1407a(Context context) {
        if (this.f36168f == null) {
            this.f36168f = (zzco) new mm2(zzay.zza(), context).m17432d(context, false);
        }
    }

    @GuardedBy("settingManagerLock")
    /* renamed from: b */
    public final void m1406b(RequestConfiguration requestConfiguration) {
        try {
            this.f36168f.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            k04.zzh("Unable to set request configuration parcel.", e);
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void m1399i(Context context, String str) {
        synchronized (this.f36167e) {
            m1396l(context, null);
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void m1398j(Context context, String str) {
        synchronized (this.f36167e) {
            m1396l(context, null);
        }
    }

    @GuardedBy("settingManagerLock")
    /* renamed from: l */
    public final void m1396l(Context context, @Nullable String str) {
        try {
            tm3.m8966a().m8965b(context, null);
            this.f36168f.zzk();
            this.f36168f.zzl(null, nt0.m14830g3(null));
        } catch (RemoteException e) {
            k04.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final float zza() {
        synchronized (this.f36167e) {
            zzco zzcoVar = this.f36168f;
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
        return this.f36170h;
    }

    public final InitializationStatus zze() {
        InitializationStatus m1397k;
        synchronized (this.f36167e) {
            ry0.m10826n(this.f36168f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                m1397k = m1397k(this.f36168f.zzg());
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
        return m1397k;
    }

    @Deprecated
    public final String zzh() {
        String m20316c;
        synchronized (this.f36167e) {
            ry0.m10826n(this.f36168f != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                m20316c = hz6.m20316c(this.f36168f.zzf());
            } catch (RemoteException e) {
                k04.zzh("Unable to get version string.", e);
                return "";
            }
        }
        return m20316c;
    }

    public final void zzl(Context context) {
        synchronized (this.f36167e) {
            m1407a(context);
            try {
                this.f36168f.zzi();
            } catch (RemoteException unused) {
                k04.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z) {
        synchronized (this.f36167e) {
            ry0.m10826n(this.f36168f != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.f36168f.zzj(z);
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
        synchronized (this.f36163a) {
            if (this.f36165c) {
                if (onInitializationCompleteListener != null) {
                    this.f36164b.add(onInitializationCompleteListener);
                }
            } else if (this.f36166d) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.f36165c = true;
                if (onInitializationCompleteListener != null) {
                    this.f36164b.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f36167e) {
                    try {
                        m1407a(context);
                        this.f36168f.zzs(new tn5(this, null));
                        this.f36168f.zzo(new xm3());
                        if (this.f36170h.getTagForChildDirectedTreatment() != -1 || this.f36170h.getTagForUnderAgeOfConsent() != -1) {
                            m1406b(this.f36170h);
                        }
                    } catch (RemoteException e) {
                        k04.zzk("MobileAdsSettingManager initialization failed", e);
                    }
                    g93.m21879c(context);
                    if (((Boolean) ya3.f33449a.m16137e()).booleanValue()) {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10763m9)).booleanValue()) {
                            k04.zze("Initializing on bg thread");
                            zz3.f35692a.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzec
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.m1399i(this.zzb, null);
                                }
                            });
                        }
                    }
                    if (((Boolean) ya3.f33450b.m16137e()).booleanValue()) {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10763m9)).booleanValue()) {
                            zz3.f35693b.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzed
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzej.this.m1398j(this.zzb, null);
                                }
                            });
                        }
                    }
                    k04.zze("Initializing on calling thread");
                    m1396l(context, null);
                }
            }
        }
    }

    public final void zzq(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f36167e) {
            m1407a(context);
            this.f36169g = onAdInspectorClosedListener;
            try {
                this.f36168f.zzm(new ml5(null));
            } catch (RemoteException unused) {
                k04.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzr(Context context, String str) {
        synchronized (this.f36167e) {
            ry0.m10826n(this.f36168f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f36168f.zzn(nt0.m14830g3(context), str);
            } catch (RemoteException e) {
                k04.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.f36167e) {
            try {
                this.f36168f.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                k04.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized (this.f36167e) {
            ry0.m10826n(this.f36168f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f36168f.zzp(z);
            } catch (RemoteException e) {
                k04.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzu(float f) {
        boolean z = true;
        ry0.m10838b(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f36167e) {
            if (this.f36168f == null) {
                z = false;
            }
            ry0.m10826n(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f36168f.zzq(f);
            } catch (RemoteException e) {
                k04.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzv(String str) {
        synchronized (this.f36167e) {
            ry0.m10826n(this.f36168f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f36168f.zzt(str);
            } catch (RemoteException e) {
                k04.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration) {
        ry0.m10838b(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f36167e) {
            RequestConfiguration requestConfiguration2 = this.f36170h;
            this.f36170h = requestConfiguration;
            if (this.f36168f == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                m1406b(requestConfiguration);
            }
        }
    }

    public final boolean zzx() {
        synchronized (this.f36167e) {
            zzco zzcoVar = this.f36168f;
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
