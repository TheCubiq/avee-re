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
    public final xm3 a;
    public final zzp b;
    public final AtomicBoolean c;
    public final VideoController d;
    public final zzaz e;
    public zza f;
    public AdListener g;
    public AdSize[] h;
    public AppEventListener i;
    public zzbu j;
    public VideoOptions k;
    public String l;
    @NotOnlyInitialized
    public final ViewGroup m;
    public int n;
    public boolean o;
    public OnPaidEventListener p;

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
        this.a = new xm3();
        this.d = new VideoController();
        this.e = new cd5(this);
        this.m = viewGroup;
        this.b = zzpVar;
        this.j = null;
        this.c = new AtomicBoolean(false);
        this.n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.h = zzyVar.zzb(z);
                this.l = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    d04 zzb = zzay.zzb();
                    AdSize adSize = this.h[0];
                    int i2 = this.n;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVar = zzq.zze();
                    } else {
                        zzq zzqVar2 = new zzq(context, adSize);
                        zzqVar2.zzj = b(i2);
                        zzqVar = zzqVar2;
                    }
                    zzb.s(viewGroup, zzqVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzay.zzb().r(viewGroup, new zzq(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    public static zzq a(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = b(i);
        return zzqVar;
    }

    public static boolean b(int i) {
        return i == 1;
    }

    public final /* synthetic */ void d(yd0 yd0Var) {
        this.m.addView((View) nt0.M(yd0Var));
    }

    public final boolean zzA() {
        try {
            zzbu zzbuVar = this.j;
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
        return this.h;
    }

    public final AdListener zza() {
        return this.g;
    }

    public final AdSize zzb() {
        zzq zzg;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null && (zzg = zzbuVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.p;
    }

    public final ResponseInfo zzd() {
        zzdn zzdnVar = null;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzdnVar = zzbuVar.zzk();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdnVar);
    }

    public final VideoController zzf() {
        return this.d;
    }

    public final VideoOptions zzg() {
        return this.k;
    }

    public final AppEventListener zzh() {
        return this.i;
    }

    public final zzdq zzi() {
        zzbu zzbuVar = this.j;
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
        if (this.l == null && (zzbuVar = this.j) != null) {
            try {
                this.l = zzbuVar.zzr();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.l;
    }

    public final void zzk() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzx();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzm(zzdx zzdxVar) {
        try {
            if (this.j == null) {
                if (this.h == null || this.l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.m.getContext();
                zzq a = a(context, this.h, this.n);
                zzbu zzbuVar = (zzbu) ("search_v2".equals(a.zza) ? new mg2(zzay.zza(), context, a, this.l).d(context, false) : new he2(zzay.zza(), context, a, this.l, this.a).d(context, false));
                this.j = zzbuVar;
                zzbuVar.zzD(new zzg(this.e));
                zza zzaVar = this.f;
                if (zzaVar != null) {
                    this.j.zzC(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.i;
                if (appEventListener != null) {
                    this.j.zzG(new h13(appEventListener));
                }
                if (this.k != null) {
                    this.j.zzU(new zzfl(this.k));
                }
                this.j.zzP(new zzfe(this.p));
                this.j.zzN(this.o);
                zzbu zzbuVar2 = this.j;
                if (zzbuVar2 != null) {
                    try {
                        final yd0 zzn = zzbuVar2.zzn();
                        if (zzn != null) {
                            if (((Boolean) ya3.f.e()).booleanValue()) {
                                if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                                    d04.b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzdy
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzea.this.d(zzn);
                                        }
                                    });
                                }
                            }
                            this.m.addView((View) nt0.M(zzn));
                        }
                    } catch (RemoteException e) {
                        k04.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            zzbu zzbuVar3 = this.j;
            Objects.requireNonNull(zzbuVar3);
            zzbuVar3.zzaa(this.b.zza(this.m.getContext(), zzdxVar));
        } catch (RemoteException e2) {
            k04.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzz();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.c.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzA();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzB();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(zza zzaVar) {
        try {
            this.f = zzaVar;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.g = adListener;
        this.e.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        this.h = adSizeArr;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzF(a(this.m.getContext(), this.h, this.n));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
        this.m.requestLayout();
    }

    public final void zzu(String str) {
        if (this.l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.l = str;
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.i = appEventListener;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzG(appEventListener != null ? new h13(appEventListener) : null);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.o = z;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzN(z);
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.p = onPaidEventListener;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.k = videoOptions;
        try {
            zzbu zzbuVar = this.j;
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
            if (zzn != null && ((View) nt0.M(zzn)).getParent() == null) {
                this.m.addView((View) nt0.M(zzn));
                this.j = zzbuVar;
                return true;
            }
            return false;
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }
}
