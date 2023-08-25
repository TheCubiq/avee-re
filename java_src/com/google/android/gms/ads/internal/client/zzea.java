package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.cd5;
import com.daaw.d04;
import com.daaw.g93;
import com.daaw.h13;
import com.daaw.he2;
import com.daaw.k04;
import com.daaw.mg2;
import com.daaw.nt0;
import com.daaw.xm3;
import com.daaw.ya3;
import com.daaw.yd0;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class zzea {

    /* renamed from: a */
    public final xm3 f36146a;

    /* renamed from: b */
    public final zzp f36147b;

    /* renamed from: c */
    public final AtomicBoolean f36148c;

    /* renamed from: d */
    public final VideoController f36149d;

    /* renamed from: e */
    public final zzaz f36150e;

    /* renamed from: f */
    public zza f36151f;

    /* renamed from: g */
    public AdListener f36152g;

    /* renamed from: h */
    public AdSize[] f36153h;

    /* renamed from: i */
    public AppEventListener f36154i;

    /* renamed from: j */
    public zzbu f36155j;

    /* renamed from: k */
    public VideoOptions f36156k;

    /* renamed from: l */
    public String f36157l;
    @NotOnlyInitialized

    /* renamed from: m */
    public final ViewGroup f36158m;

    /* renamed from: n */
    public int f36159n;

    /* renamed from: o */
    public boolean f36160o;

    /* renamed from: p */
    public OnPaidEventListener f36161p;

    public zzea(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, null, 0);
    }

    public zzea(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzp.zza, null, i);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzp.zza, null, 0);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzp.zza, null, i);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzp zzpVar, zzbu zzbuVar, int i) {
        zzq zzqVar;
        this.f36146a = new xm3();
        this.f36149d = new VideoController();
        this.f36150e = new cd5(this);
        this.f36158m = viewGroup;
        this.f36147b = zzpVar;
        this.f36155j = null;
        this.f36148c = new AtomicBoolean(false);
        this.f36159n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.f36153h = zzyVar.zzb(z);
                this.f36157l = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    d04 zzb = zzay.zzb();
                    AdSize adSize = this.f36153h[0];
                    int i2 = this.f36159n;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVar = zzq.zze();
                    } else {
                        zzq zzqVar2 = new zzq(context, adSize);
                        zzqVar2.zzj = m1410b(i2);
                        zzqVar = zzqVar2;
                    }
                    zzb.m24813s(viewGroup, zzqVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzay.zzb().m24814r(viewGroup, new zzq(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static zzq m1411a(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = m1410b(i);
        return zzqVar;
    }

    /* renamed from: b */
    public static boolean m1410b(int i) {
        return i == 1;
    }

    /* renamed from: d */
    public final /* synthetic */ void m1408d(yd0 yd0Var) {
        this.f36158m.addView((View) nt0.m14831M(yd0Var));
    }

    public final boolean zzA() {
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                return zzbuVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzB() {
        return this.f36153h;
    }

    public final AdListener zza() {
        return this.f36152g;
    }

    public final AdSize zzb() {
        zzq zzg;
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null && (zzg = zzbuVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.f36153h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.f36161p;
    }

    public final ResponseInfo zzd() {
        zzdn zzdnVar = null;
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzdnVar = zzbuVar.zzk();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdnVar);
    }

    public final VideoController zzf() {
        return this.f36149d;
    }

    public final VideoOptions zzg() {
        return this.f36156k;
    }

    public final AppEventListener zzh() {
        return this.f36154i;
    }

    public final zzdq zzi() {
        zzbu zzbuVar = this.f36155j;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzl();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbu zzbuVar;
        if (this.f36157l == null && (zzbuVar = this.f36155j) != null) {
            try {
                this.f36157l = zzbuVar.zzr();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.f36157l;
    }

    public final void zzk() {
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzx();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzm(zzdx zzdxVar) {
        try {
            if (this.f36155j == null) {
                if (this.f36153h == null || this.f36157l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f36158m.getContext();
                zzq m1411a = m1411a(context, this.f36153h, this.f36159n);
                zzbu zzbuVar = (zzbu) ("search_v2".equals(m1411a.zza) ? new mg2(zzay.zza(), context, m1411a, this.f36157l).m17432d(context, false) : new he2(zzay.zza(), context, m1411a, this.f36157l, this.f36146a).m17432d(context, false));
                this.f36155j = zzbuVar;
                zzbuVar.zzD(new zzg(this.f36150e));
                zza zzaVar = this.f36151f;
                if (zzaVar != null) {
                    this.f36155j.zzC(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.f36154i;
                if (appEventListener != null) {
                    this.f36155j.zzG(new h13(appEventListener));
                }
                if (this.f36156k != null) {
                    this.f36155j.zzU(new zzfl(this.f36156k));
                }
                this.f36155j.zzP(new zzfe(this.f36161p));
                this.f36155j.zzN(this.f36160o);
                zzbu zzbuVar2 = this.f36155j;
                if (zzbuVar2 != null) {
                    try {
                        final yd0 zzn = zzbuVar2.zzn();
                        if (zzn != null) {
                            if (((Boolean) ya3.f33454f.m16137e()).booleanValue()) {
                                if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                                    d04.f6340b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzdy
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzea.this.m1408d(zzn);
                                        }
                                    });
                                }
                            }
                            this.f36158m.addView((View) nt0.m14831M(zzn));
                        }
                    } catch (RemoteException e) {
                        k04.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            zzbu zzbuVar3 = this.f36155j;
            Objects.requireNonNull(zzbuVar3);
            zzbuVar3.zzaa(this.f36147b.zza(this.f36158m.getContext(), zzdxVar));
        } catch (RemoteException e2) {
            k04.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn() {
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzz();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.f36148c.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzA();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzB();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(zza zzaVar) {
        try {
            this.f36151f = zzaVar;
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.f36152g = adListener;
        this.f36150e.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.f36153h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        this.f36153h = adSizeArr;
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzF(m1411a(this.f36158m.getContext(), this.f36153h, this.f36159n));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        this.f36158m.requestLayout();
    }

    public final void zzu(String str) {
        if (this.f36157l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f36157l = str;
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.f36154i = appEventListener;
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzG(appEventListener != null ? new h13(appEventListener) : null);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.f36160o = z;
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzN(z);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.f36161p = onPaidEventListener;
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.f36156k = videoOptions;
        try {
            zzbu zzbuVar = this.f36155j;
            if (zzbuVar != null) {
                zzbuVar.zzU(videoOptions == null ? null : new zzfl(videoOptions));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(zzbu zzbuVar) {
        try {
            yd0 zzn = zzbuVar.zzn();
            if (zzn != null && ((View) nt0.m14831M(zzn)).getParent() == null) {
                this.f36158m.addView((View) nt0.m14831M(zzn));
                this.f36155j = zzbuVar;
                return true;
            }
            return false;
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }
}
