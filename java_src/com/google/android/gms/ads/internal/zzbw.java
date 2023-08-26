package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzajj;
import com.google.android.gms.internal.ads.zzaju;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zzci;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzke;
import com.google.android.gms.internal.ads.zzkh;
import com.google.android.gms.internal.ads.zzkx;
import com.google.android.gms.internal.ads.zzla;
import com.google.android.gms.internal.ads.zzlg;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zzod;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzqw;
import com.google.android.gms.internal.ads.zzqz;
import com.google.android.gms.internal.ads.zzrc;
import com.google.android.gms.internal.ads.zzrf;
import com.google.android.gms.internal.ads.zzri;
import com.google.android.gms.internal.ads.zzrl;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzbw implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    final String zzaco;
    public String zzacp;
    final zzci zzacq;
    public final zzang zzacr;
    zzbx zzacs;
    public zzajx zzact;
    public zzalc zzacu;
    public zzjn zzacv;
    public zzajh zzacw;
    public zzaji zzacx;
    public zzajj zzacy;
    zzke zzacz;
    zzkh zzada;
    zzla zzadb;
    zzkx zzadc;
    zzlg zzadd;
    zzqw zzade;
    zzqz zzadf;
    zzrl zzadg;
    SimpleArrayMap<String, zzrc> zzadh;
    SimpleArrayMap<String, zzrf> zzadi;
    zzpl zzadj;
    zzmu zzadk;
    zzlu zzadl;
    zzri zzadm;
    List<Integer> zzadn;
    zzod zzado;
    zzahe zzadp;
    zzagx zzadq;
    public String zzadr;
    List<String> zzads;
    public zzaju zzadt;
    View zzadu;
    public int zzadv;
    private HashSet<zzajj> zzadw;
    private int zzadx;
    private int zzady;
    private zzamj zzadz;
    private boolean zzaea;
    private boolean zzaeb;
    private boolean zzaec;
    public final Context zzrt;
    boolean zzze;

    public zzbw(Context context, zzjn zzjnVar, String str, zzang zzangVar) {
        this(context, zzjnVar, str, zzangVar, null);
    }

    private zzbw(Context context, zzjn zzjnVar, String str, zzang zzangVar, zzci zzciVar) {
        this.zzadt = null;
        this.zzadu = null;
        this.zzadv = 0;
        this.zzze = false;
        this.zzadw = null;
        this.zzadx = -1;
        this.zzady = -1;
        this.zzaea = true;
        this.zzaeb = true;
        this.zzaec = false;
        zznk.initialize(context);
        if (zzbv.zzeo().zzpy() != null) {
            List<String> zzjc = zznk.zzjc();
            if (zzangVar.zzcve != 0) {
                zzjc.add(Integer.toString(zzangVar.zzcve));
            }
            zzbv.zzeo().zzpy().zzg(zzjc);
        }
        this.zzaco = UUID.randomUUID().toString();
        if (zzjnVar.zzarc || zzjnVar.zzare) {
            this.zzacs = null;
        } else {
            zzbx zzbxVar = new zzbx(context, str, zzangVar.zzcw, this, this);
            this.zzacs = zzbxVar;
            zzbxVar.setMinimumWidth(zzjnVar.widthPixels);
            this.zzacs.setMinimumHeight(zzjnVar.heightPixels);
            this.zzacs.setVisibility(4);
        }
        this.zzacv = zzjnVar;
        this.zzacp = str;
        this.zzrt = context;
        this.zzacr = zzangVar;
        this.zzacq = new zzci(new zzag(this));
        this.zzadz = new zzamj(200L);
        this.zzadi = new SimpleArrayMap<>();
    }

    private final void zzf(boolean z) {
        zzajh zzajhVar;
        View findViewById;
        if (this.zzacs == null || (zzajhVar = this.zzacw) == null || zzajhVar.zzbyo == null || this.zzacw.zzbyo.zzuf() == null) {
            return;
        }
        if (!z || this.zzadz.tryAcquire()) {
            if (this.zzacw.zzbyo.zzuf().zzfz()) {
                int[] iArr = new int[2];
                this.zzacs.getLocationOnScreen(iArr);
                zzkb.zzif();
                int zzb = zzamu.zzb(this.zzrt, iArr[0]);
                zzkb.zzif();
                int zzb2 = zzamu.zzb(this.zzrt, iArr[1]);
                if (zzb != this.zzadx || zzb2 != this.zzady) {
                    this.zzadx = zzb;
                    this.zzady = zzb2;
                    this.zzacw.zzbyo.zzuf().zza(this.zzadx, this.zzady, !z);
                }
            }
            zzbx zzbxVar = this.zzacs;
            if (zzbxVar == null || (findViewById = zzbxVar.getRootView().findViewById(16908290)) == null) {
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.zzacs.getGlobalVisibleRect(rect);
            findViewById.getGlobalVisibleRect(rect2);
            if (rect.top != rect2.top) {
                this.zzaea = false;
            }
            if (rect.bottom != rect2.bottom) {
                this.zzaeb = false;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzf(false);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzf(true);
        this.zzaec = true;
    }

    public final void zza(HashSet<zzajj> hashSet) {
        this.zzadw = hashSet;
    }

    public final HashSet<zzajj> zzfl() {
        return this.zzadw;
    }

    public final void zzfm() {
        zzajh zzajhVar = this.zzacw;
        if (zzajhVar == null || zzajhVar.zzbyo == null) {
            return;
        }
        this.zzacw.zzbyo.destroy();
    }

    public final void zzfn() {
        zzajh zzajhVar = this.zzacw;
        if (zzajhVar == null || zzajhVar.zzbtx == null) {
            return;
        }
        try {
            this.zzacw.zzbtx.destroy();
        } catch (RemoteException unused) {
            zzakb.zzdk("Could not destroy mediation adapter.");
        }
    }

    public final boolean zzfo() {
        return this.zzadv == 0;
    }

    public final boolean zzfp() {
        return this.zzadv == 1;
    }

    public final String zzfq() {
        return (this.zzaea && this.zzaeb) ? "" : this.zzaea ? this.zzaec ? "top-scrollable" : "top-locked" : this.zzaeb ? this.zzaec ? "bottom-scrollable" : "bottom-locked" : "";
    }

    public final void zzg(boolean z) {
        zzajh zzajhVar;
        if (this.zzadv == 0 && (zzajhVar = this.zzacw) != null && zzajhVar.zzbyo != null) {
            this.zzacw.zzbyo.stopLoading();
        }
        zzajx zzajxVar = this.zzact;
        if (zzajxVar != null) {
            zzajxVar.cancel();
        }
        zzalc zzalcVar = this.zzacu;
        if (zzalcVar != null) {
            zzalcVar.cancel();
        }
        if (z) {
            this.zzacw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(View view) {
        zzce zzaa;
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbat)).booleanValue() && (zzaa = this.zzacq.zzaa()) != null) {
            zzaa.zzb(view);
        }
    }
}
