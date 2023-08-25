package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.daaw.a17;
import com.daaw.a74;
import com.daaw.br4;
import com.daaw.f86;
import com.daaw.g93;
import com.daaw.gr3;
import com.daaw.gv6;
import com.daaw.hq3;
import com.daaw.k04;
import com.daaw.kq5;
import com.daaw.mf3;
import com.daaw.nt0;
import com.daaw.o84;
import com.daaw.of3;
import com.daaw.p74;
import com.daaw.t84;
import com.daaw.u98;
import com.daaw.v84;
import com.daaw.vy4;
import com.daaw.x33;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Collections;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class zzl extends gr3 implements zzad {

    /* renamed from: J */
    public static final int f36208J = Color.argb(0, 0, 0, 0);

    /* renamed from: C */
    public Runnable f36211C;

    /* renamed from: D */
    public boolean f36212D;

    /* renamed from: E */
    public boolean f36213E;

    /* renamed from: p */
    public final Activity f36218p;

    /* renamed from: q */
    public AdOverlayInfoParcel f36219q;

    /* renamed from: r */
    public a74 f36220r;

    /* renamed from: s */
    public zzh f36221s;

    /* renamed from: t */
    public zzr f36222t;

    /* renamed from: v */
    public FrameLayout f36224v;

    /* renamed from: w */
    public WebChromeClient.CustomViewCallback f36225w;

    /* renamed from: z */
    public a17 f36228z;

    /* renamed from: u */
    public boolean f36223u = false;

    /* renamed from: x */
    public boolean f36226x = false;

    /* renamed from: y */
    public boolean f36227y = false;

    /* renamed from: A */
    public boolean f36209A = false;

    /* renamed from: I */
    public int f36217I = 1;

    /* renamed from: B */
    public final Object f36210B = new Object();

    /* renamed from: F */
    public boolean f36214F = false;

    /* renamed from: G */
    public boolean f36215G = false;

    /* renamed from: H */
    public boolean f36216H = true;

    public zzl(Activity activity) {
        this.f36218p = activity;
    }

    /* renamed from: j3 */
    public static final void m1384j3(yd0 yd0Var, View view) {
        if (yd0Var == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().mo14878b(yd0Var, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r29.f36218p.getResources().getConfiguration().orientation == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r29.f36209A = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r29.f36218p.getResources().getConfiguration().orientation == 2) goto L20;
     */
    /* renamed from: g3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1387g3(boolean z) {
        a17 a17Var;
        int i;
        if (!this.f36213E) {
            this.f36218p.requestWindowFeature(1);
        }
        Window window = this.f36218p.getWindow();
        if (window == null) {
            throw new f86("Invalid activity, no window available.");
        }
        a74 a74Var = this.f36219q.zzd;
        t84 zzP = a74Var != null ? a74Var.zzP() : null;
        boolean z2 = false;
        boolean z3 = zzP != null && zzP.mo9450a();
        this.f36209A = false;
        if (z3) {
            int i2 = this.f36219q.zzj;
            if (i2 != 6) {
                if (i2 == 7) {
                }
            }
        }
        k04.zze("Delay onShow to next orientation change: " + z2);
        zzy(this.f36219q.zzj);
        window.setFlags(16777216, 16777216);
        k04.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.f36227y) {
            a17Var = this.f36228z;
            i = f36208J;
        } else {
            a17Var = this.f36228z;
            i = -16777216;
        }
        a17Var.setBackgroundColor(i);
        this.f36218p.setContentView(this.f36228z);
        this.f36213E = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                Activity activity = this.f36218p;
                a74 a74Var2 = this.f36219q.zzd;
                v84 mo6408o = a74Var2 != null ? a74Var2.mo6408o() : null;
                a74 a74Var3 = this.f36219q.zzd;
                String mo6444O = a74Var3 != null ? a74Var3.mo6444O() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
                zzchu zzchuVar = adOverlayInfoParcel.zzm;
                a74 a74Var4 = adOverlayInfoParcel.zzd;
                a74 m13613a = p74.m13613a(activity, mo6408o, mo6444O, true, z3, null, null, zzchuVar, null, null, a74Var4 != null ? a74Var4.zzm() : null, x33.m5591a(), null, null);
                this.f36220r = m13613a;
                t84 zzP2 = m13613a.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f36219q;
                mf3 mf3Var = adOverlayInfoParcel2.zzp;
                of3 of3Var = adOverlayInfoParcel2.zze;
                zzz zzzVar = adOverlayInfoParcel2.zzi;
                a74 a74Var5 = adOverlayInfoParcel2.zzd;
                zzP2.mo9452J(null, mf3Var, null, of3Var, zzzVar, true, null, a74Var5 != null ? a74Var5.zzP().zzd() : null, null, null, null, null, null, null, null, null, null, null);
                this.f36220r.zzP().mo9454E(new o84() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    @Override // com.daaw.o84
                    public final void zza(boolean z4) {
                        a74 a74Var6 = zzl.this.f36220r;
                        if (a74Var6 != null) {
                            a74Var6.zzZ();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f36219q;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.f36220r.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new f86("No URL or HTML to display in ad overlay.");
                    }
                    this.f36220r.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                a74 a74Var6 = this.f36219q.zzd;
                if (a74Var6 != null) {
                    a74Var6.mo6424a0(this);
                }
            } catch (Exception e) {
                k04.zzh("Error obtaining webview.", e);
                throw new f86("Could not obtain webview for the overlay.", e);
            }
        } else {
            a74 a74Var7 = this.f36219q.zzd;
            this.f36220r = a74Var7;
            a74Var7.mo6400s0(this.f36218p);
        }
        this.f36220r.mo6463B(this);
        a74 a74Var8 = this.f36219q.zzd;
        if (a74Var8 != null) {
            m1384j3(a74Var8.mo6411j0(), this.f36228z);
        }
        if (this.f36219q.zzk != 5) {
            ViewParent parent = this.f36220r.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f36220r.mo6418g());
            }
            if (this.f36227y) {
                this.f36220r.mo6426Y();
            }
            this.f36228z.addView(this.f36220r.mo6418g(), -1, -1);
        }
        if (!z && !this.f36209A) {
            zze();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.f36219q;
        if (adOverlayInfoParcel4.zzk == 5) {
            kq5.m17483j3(this.f36218p, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        zzu(z3);
        if (this.f36220r.mo6414i()) {
            zzw(z3, true);
        }
    }

    /* renamed from: h3 */
    public final void m1386h3() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.f36218p.isFinishing() || this.f36214F) {
            return;
        }
        this.f36214F = true;
        a74 a74Var = this.f36220r;
        if (a74Var != null) {
            a74Var.mo6405p0(this.f36217I - 1);
            synchronized (this.f36210B) {
                if (!this.f36212D && this.f36220r.mo6402r()) {
                    if (((Boolean) zzba.zzc().m23658b(g93.f10769n4)).booleanValue() && !this.f36215G && (adOverlayInfoParcel = this.f36219q) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzbE();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    this.f36211C = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().m23658b(g93.f10532R0)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    /* renamed from: i3 */
    public final void m1385i3(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.f36218p, configuration);
        if ((!this.f36227y || z3) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f36219q;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.f36218p.getWindow();
        if (((Boolean) zzba.zzc().m23658b(g93.f10602Y0)).booleanValue()) {
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
        FrameLayout frameLayout = new FrameLayout(this.f36218p);
        this.f36224v = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f36224v.addView(view, -1, -1);
        this.f36218p.setContentView(this.f36224v);
        this.f36213E = true;
        this.f36225w = customViewCallback;
        this.f36223u = true;
    }

    public final void zzC() {
        synchronized (this.f36210B) {
            this.f36212D = true;
            Runnable runnable = this.f36211C;
            if (runnable != null) {
                gv6 gv6Var = com.google.android.gms.ads.internal.util.zzs.zza;
                gv6Var.removeCallbacks(runnable);
                gv6Var.post(this.f36211C);
            }
        }
    }

    @Override // com.daaw.hr3
    public final boolean zzE() {
        this.f36217I = 1;
        if (this.f36220r == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && this.f36220r.canGoBack()) {
            this.f36220r.goBack();
            return false;
        }
        boolean mo6404q = this.f36220r.mo6404q();
        if (!mo6404q) {
            this.f36220r.mo6434T("onbackblocked", Collections.emptyMap());
        }
        return mo6404q;
    }

    public final void zzb() {
        this.f36217I = 3;
        this.f36218p.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.f36218p.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbL() {
        this.f36217I = 2;
        this.f36218p.finish();
    }

    public final void zzc() {
        a74 a74Var;
        zzo zzoVar;
        if (this.f36215G) {
            return;
        }
        this.f36215G = true;
        a74 a74Var2 = this.f36220r;
        if (a74Var2 != null) {
            this.f36228z.removeView(a74Var2.mo6418g());
            zzh zzhVar = this.f36221s;
            if (zzhVar != null) {
                this.f36220r.mo6400s0(zzhVar.zzd);
                this.f36220r.mo6417g0(false);
                ViewGroup viewGroup = this.f36221s.zzc;
                View mo6418g = this.f36220r.mo6418g();
                zzh zzhVar2 = this.f36221s;
                viewGroup.addView(mo6418g, zzhVar2.zza, zzhVar2.zzb);
                this.f36221s = null;
            } else if (this.f36218p.getApplicationContext() != null) {
                this.f36220r.mo6400s0(this.f36218p.getApplicationContext());
            }
            this.f36220r = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.f36217I);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f36219q;
        if (adOverlayInfoParcel2 == null || (a74Var = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        m1384j3(a74Var.mo6411j0(), this.f36219q.zzd.mo6418g());
    }

    public final void zzd() {
        this.f36228z.f2702q = true;
    }

    public final void zze() {
        this.f36220r.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
        if (adOverlayInfoParcel != null && this.f36223u) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.f36224v != null) {
            this.f36218p.setContentView(this.f36228z);
            this.f36213E = true;
            this.f36224v.removeAllViews();
            this.f36224v = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f36225w;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f36225w = null;
        }
        this.f36223u = false;
    }

    @Override // com.daaw.hr3
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.daaw.hr3
    public final void zzh() {
        this.f36217I = 1;
    }

    @Override // com.daaw.hr3
    public final void zzj(yd0 yd0Var) {
        m1385i3((Configuration) nt0.m14831M(yd0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: f86 -> 0x00f5, TryCatch #0 {f86 -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[Catch: f86 -> 0x00f5, TryCatch #0 {f86 -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    @Override // com.daaw.hr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzk(Bundle bundle) {
        int i;
        this.f36218p.requestWindowFeature(1);
        this.f36226x = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(this.f36218p.getIntent());
            this.f36219q = zza;
            if (zza == null) {
                throw new f86("Could not get info for ad overlay.");
            }
            if (zza.zzm.f36995r > 7500000) {
                this.f36217I = 4;
            }
            if (this.f36218p.getIntent() != null) {
                this.f36216H = this.f36218p.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.f36227y = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new u98(this, null).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.f36216H) {
                        br4 br4Var = this.f36219q.zzx;
                        if (br4Var != null) {
                            br4Var.zze();
                        }
                        zzo zzoVar = this.f36219q.zzc;
                        if (zzoVar != null) {
                            zzoVar.zzb();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f36219q;
                    if (adOverlayInfoParcel2.zzk != 1) {
                        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                        if (zzaVar != null) {
                            zzaVar.onAdClicked();
                        }
                        vy4 vy4Var = this.f36219q.zzy;
                        if (vy4Var != null) {
                            vy4Var.zzq();
                        }
                    }
                }
                Activity activity = this.f36218p;
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f36219q;
                a17 a17Var = new a17(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.f36993p, adOverlayInfoParcel3.zzw);
                this.f36228z = a17Var;
                a17Var.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzk(this.f36218p);
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.f36219q;
                i = adOverlayInfoParcel4.zzk;
                if (i == 1) {
                    m1387g3(false);
                } else if (i == 2) {
                    this.f36221s = new zzh(adOverlayInfoParcel4.zzd);
                    m1387g3(false);
                } else if (i == 3) {
                    m1387g3(true);
                } else if (i != 5) {
                    throw new f86("Could not determine ad overlay type.");
                } else {
                    m1387g3(false);
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.f36227y = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new u98(this, null).zzb();
                }
                if (bundle == null) {
                }
                Activity activity2 = this.f36218p;
                AdOverlayInfoParcel adOverlayInfoParcel32 = this.f36219q;
                a17 a17Var2 = new a17(activity2, adOverlayInfoParcel32.zzn, adOverlayInfoParcel32.zzm.f36993p, adOverlayInfoParcel32.zzw);
                this.f36228z = a17Var2;
                a17Var2.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzk(this.f36218p);
                AdOverlayInfoParcel adOverlayInfoParcel42 = this.f36219q;
                i = adOverlayInfoParcel42.zzk;
                if (i == 1) {
                }
            } else {
                this.f36227y = false;
                if (bundle == null) {
                }
                Activity activity22 = this.f36218p;
                AdOverlayInfoParcel adOverlayInfoParcel322 = this.f36219q;
                a17 a17Var22 = new a17(activity22, adOverlayInfoParcel322.zzn, adOverlayInfoParcel322.zzm.f36993p, adOverlayInfoParcel322.zzw);
                this.f36228z = a17Var22;
                a17Var22.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzk(this.f36218p);
                AdOverlayInfoParcel adOverlayInfoParcel422 = this.f36219q;
                i = adOverlayInfoParcel422.zzk;
                if (i == 1) {
                }
            }
        } catch (f86 e) {
            k04.zzj(e.getMessage());
            this.f36217I = 4;
            this.f36218p.finish();
        }
    }

    @Override // com.daaw.hr3
    public final void zzl() {
        a74 a74Var = this.f36220r;
        if (a74Var != null) {
            try {
                this.f36228z.removeView(a74Var.mo6418g());
            } catch (NullPointerException unused) {
            }
        }
        m1386h3();
    }

    public final void zzm() {
        if (this.f36209A) {
            this.f36209A = false;
            zze();
        }
    }

    @Override // com.daaw.hr3
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbs();
        }
        if (!((Boolean) zzba.zzc().m23658b(g93.f10791p4)).booleanValue() && this.f36220r != null && (!this.f36218p.isFinishing() || this.f36221s == null)) {
            this.f36220r.onPause();
        }
        m1386h3();
    }

    @Override // com.daaw.hr3
    public final void zzo() {
    }

    @Override // com.daaw.hr3
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbM();
        }
        m1385i3(this.f36218p.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().m23658b(g93.f10791p4)).booleanValue()) {
            return;
        }
        a74 a74Var = this.f36220r;
        if (a74Var == null || a74Var.mo6407o0()) {
            k04.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.f36220r.onResume();
        }
    }

    @Override // com.daaw.hr3
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f36226x);
    }

    @Override // com.daaw.hr3
    public final void zzr() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10791p4)).booleanValue()) {
            a74 a74Var = this.f36220r;
            if (a74Var == null || a74Var.mo6407o0()) {
                k04.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.f36220r.onResume();
            }
        }
    }

    @Override // com.daaw.hr3
    public final void zzs() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10791p4)).booleanValue() && this.f36220r != null && (!this.f36218p.isFinishing() || this.f36221s == null)) {
            this.f36220r.onPause();
        }
        m1386h3();
    }

    @Override // com.daaw.hr3
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36219q;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z) {
        int intValue = ((Integer) zzba.zzc().m23658b(g93.f10813r4)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().m23658b(g93.f10562U0)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : intValue;
        zzqVar.zzb = true != z2 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.f36222t = new zzr(this.f36218p, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.f36219q.zzg);
        this.f36228z.addView(this.f36222t, layoutParams);
    }

    @Override // com.daaw.hr3
    public final void zzv() {
        this.f36213E = true;
    }

    public final void zzw(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().m23658b(g93.f10542S0)).booleanValue() && (adOverlayInfoParcel2 = this.f36219q) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().m23658b(g93.f10552T0)).booleanValue() && (adOverlayInfoParcel = this.f36219q) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new hq3(this.f36220r, "useCustomClose").m20488c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.f36222t;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzx() {
        this.f36228z.removeView(this.f36222t);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.f36218p.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().m23658b(g93.f10836t5)).intValue()) {
            if (this.f36218p.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().m23658b(g93.f10847u5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzba.zzc().m23658b(g93.f10858v5)).intValue()) {
                    if (i2 <= ((Integer) zzba.zzc().m23658b(g93.f10869w5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f36218p.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().m11903t(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        a17 a17Var;
        int i;
        if (z) {
            a17Var = this.f36228z;
            i = 0;
        } else {
            a17Var = this.f36228z;
            i = -16777216;
        }
        a17Var.setBackgroundColor(i);
    }
}
