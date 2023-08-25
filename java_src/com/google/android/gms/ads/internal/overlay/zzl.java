package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.daaw.a17;
import com.daaw.a74;
import com.daaw.g93;
import com.daaw.gr3;
import com.daaw.gv6;
import com.daaw.hq3;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class zzl extends gr3 implements zzad {
    public static final int J = Color.argb(0, 0, 0, 0);
    public Runnable C;
    public boolean D;
    public boolean E;
    public final Activity p;
    public AdOverlayInfoParcel q;
    public a74 r;
    public zzh s;
    public zzr t;
    public FrameLayout v;
    public WebChromeClient.CustomViewCallback w;
    public a17 z;
    public boolean u = false;
    public boolean x = false;
    public boolean y = false;
    public boolean A = false;
    public int I = 1;
    public final Object B = new Object();
    public boolean F = false;
    public boolean G = false;
    public boolean H = true;

    public zzl(Activity activity) {
        this.p = activity;
    }

    public static final void j3(yd0 yd0Var, View view) {
        if (yd0Var == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().b(yd0Var, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r29.p.getResources().getConfiguration().orientation == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r29.A = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r29.p.getResources().getConfiguration().orientation == 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g3(boolean r30) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.g3(boolean):void");
    }

    public final void h3() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.p.isFinishing() || this.F) {
            return;
        }
        this.F = true;
        a74 a74Var = this.r;
        if (a74Var != null) {
            a74Var.p0(this.I - 1);
            synchronized (this.B) {
                if (!this.D && this.r.r()) {
                    if (((Boolean) zzba.zzc().b(g93.n4)).booleanValue() && !this.G && (adOverlayInfoParcel = this.q) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzbE();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    this.C = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().b(g93.R0)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    public final void i3(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.p, configuration);
        if ((!this.y || z3) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.q;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.p.getWindow();
        if (((Boolean) zzba.zzc().b(g93.Y0)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
        } else if (!z) {
            window.addFlags(2048);
            window.clearFlags(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        } else {
            window.addFlags(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
            window.clearFlags(2048);
            if (z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.p);
        this.v = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.v.addView(view, -1, -1);
        this.p.setContentView(this.v);
        this.E = true;
        this.w = customViewCallback;
        this.u = true;
    }

    public final void zzC() {
        synchronized (this.B) {
            this.D = true;
            Runnable runnable = this.C;
            if (runnable != null) {
                gv6 gv6Var = com.google.android.gms.ads.internal.util.zzs.zza;
                gv6Var.removeCallbacks(runnable);
                gv6Var.post(this.C);
            }
        }
    }

    @Override // com.daaw.hr3
    public final boolean zzE() {
        this.I = 1;
        if (this.r == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().b(g93.X7)).booleanValue() && this.r.canGoBack()) {
            this.r.goBack();
            return false;
        }
        boolean q = this.r.q();
        if (!q) {
            this.r.T("onbackblocked", Collections.emptyMap());
        }
        return q;
    }

    public final void zzb() {
        this.I = 3;
        this.p.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.p.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbL() {
        this.I = 2;
        this.p.finish();
    }

    public final void zzc() {
        a74 a74Var;
        zzo zzoVar;
        if (this.G) {
            return;
        }
        this.G = true;
        a74 a74Var2 = this.r;
        if (a74Var2 != null) {
            this.z.removeView(a74Var2.g());
            zzh zzhVar = this.s;
            if (zzhVar != null) {
                this.r.s0(zzhVar.zzd);
                this.r.g0(false);
                ViewGroup viewGroup = this.s.zzc;
                View g = this.r.g();
                zzh zzhVar2 = this.s;
                viewGroup.addView(g, zzhVar2.zza, zzhVar2.zzb);
                this.s = null;
            } else if (this.p.getApplicationContext() != null) {
                this.r.s0(this.p.getApplicationContext());
            }
            this.r = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.I);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.q;
        if (adOverlayInfoParcel2 == null || (a74Var = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        j3(a74Var.j0(), this.q.zzd.g());
    }

    public final void zzd() {
        this.z.q = true;
    }

    public final void zze() {
        this.r.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && this.u) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.v != null) {
            this.p.setContentView(this.z);
            this.E = true;
            this.v.removeAllViews();
            this.v = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.w;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.w = null;
        }
        this.u = false;
    }

    @Override // com.daaw.hr3
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.daaw.hr3
    public final void zzh() {
        this.I = 1;
    }

    @Override // com.daaw.hr3
    public final void zzj(yd0 yd0Var) {
        i3((Configuration) nt0.M(yd0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: f86 -> 0x00f5, TryCatch #0 {f86 -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[Catch: f86 -> 0x00f5, TryCatch #0 {f86 -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    @Override // com.daaw.hr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzk(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzk(android.os.Bundle):void");
    }

    @Override // com.daaw.hr3
    public final void zzl() {
        a74 a74Var = this.r;
        if (a74Var != null) {
            try {
                this.z.removeView(a74Var.g());
            } catch (NullPointerException unused) {
            }
        }
        h3();
    }

    public final void zzm() {
        if (this.A) {
            this.A = false;
            zze();
        }
    }

    @Override // com.daaw.hr3
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbs();
        }
        if (!((Boolean) zzba.zzc().b(g93.p4)).booleanValue() && this.r != null && (!this.p.isFinishing() || this.s == null)) {
            this.r.onPause();
        }
        h3();
    }

    @Override // com.daaw.hr3
    public final void zzo() {
    }

    @Override // com.daaw.hr3
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbM();
        }
        i3(this.p.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().b(g93.p4)).booleanValue()) {
            return;
        }
        a74 a74Var = this.r;
        if (a74Var == null || a74Var.o0()) {
            k04.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.r.onResume();
        }
    }

    @Override // com.daaw.hr3
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.x);
    }

    @Override // com.daaw.hr3
    public final void zzr() {
        if (((Boolean) zzba.zzc().b(g93.p4)).booleanValue()) {
            a74 a74Var = this.r;
            if (a74Var == null || a74Var.o0()) {
                k04.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.r.onResume();
            }
        }
    }

    @Override // com.daaw.hr3
    public final void zzs() {
        if (((Boolean) zzba.zzc().b(g93.p4)).booleanValue() && this.r != null && (!this.p.isFinishing() || this.s == null)) {
            this.r.onPause();
        }
        h3();
    }

    @Override // com.daaw.hr3
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.q;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z) {
        int intValue = ((Integer) zzba.zzc().b(g93.r4)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().b(g93.U0)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : intValue;
        zzqVar.zzb = true != z2 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.t = new zzr(this.p, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.q.zzg);
        this.z.addView(this.t, layoutParams);
    }

    @Override // com.daaw.hr3
    public final void zzv() {
        this.E = true;
    }

    public final void zzw(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().b(g93.S0)).booleanValue() && (adOverlayInfoParcel2 = this.q) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().b(g93.T0)).booleanValue() && (adOverlayInfoParcel = this.q) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new hq3(this.r, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.t;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzx() {
        this.z.removeView(this.t);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.p.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().b(g93.t5)).intValue()) {
            if (this.p.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().b(g93.u5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzba.zzc().b(g93.v5)).intValue()) {
                    if (i2 <= ((Integer) zzba.zzc().b(g93.w5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.p.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().t(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        a17 a17Var;
        int i;
        if (z) {
            a17Var = this.z;
            i = 0;
        } else {
            a17Var = this.z;
            i = -16777216;
        }
        a17Var.setBackgroundColor(i);
    }
}
