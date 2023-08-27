package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzait;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzaor;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzarl;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzfp;
import com.google.android.gms.internal.ads.zzhu;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzxn;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.ads.zzyc;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzy extends zzi implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private boolean zzvm;
    private boolean zzxf;
    private WeakReference<Object> zzxg;

    public zzy(Context context, zzjn zzjnVar, String str, zzxn zzxnVar, zzang zzangVar, zzw zzwVar) {
        super(context, zzjnVar, str, zzxnVar, zzangVar, zzwVar);
        this.zzxg = new WeakReference<>(null);
    }

    private final void zzc(zzaqw zzaqwVar) {
        WebView webView;
        View view;
        if (zzcp() && (webView = zzaqwVar.getWebView()) != null && (view = zzaqwVar.getView()) != null && zzbv.zzfa().zzi(this.zzvw.zzrt)) {
            int i = this.zzvw.zzacr.zzcve;
            int i2 = this.zzvw.zzacr.zzcvf;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.zzwb = zzbv.zzfa().zza(sb.toString(), webView, "", "javascript", zzbz());
            if (this.zzwb != null) {
                zzbv.zzfa().zza(this.zzwb, view);
                zzbv.zzfa().zzm(this.zzwb);
                this.zzxf = true;
            }
        }
    }

    private final boolean zzd(zzajh zzajhVar, zzajh zzajhVar2) {
        if (zzajhVar2.zzceq) {
            View zze = zzas.zze(zzajhVar2);
            if (zze == null) {
                zzakb.zzdk("Could not get mediation view");
                return false;
            }
            View nextView = this.zzvw.zzacs.getNextView();
            if (nextView != null) {
                if (nextView instanceof zzaqw) {
                    ((zzaqw) nextView).destroy();
                }
                this.zzvw.zzacs.removeView(nextView);
            }
            if (!zzas.zzf(zzajhVar2)) {
                try {
                    if (zzbv.zzfh().zzt(this.zzvw.zzrt)) {
                        new zzfp(this.zzvw.zzrt, zze).zza(new zzaix(this.zzvw.zzrt, this.zzvw.zzacp));
                    }
                    if (zzajhVar2.zzcof != null) {
                        this.zzvw.zzacs.setMinimumWidth(zzajhVar2.zzcof.widthPixels);
                        this.zzvw.zzacs.setMinimumHeight(zzajhVar2.zzcof.heightPixels);
                    }
                    zzg(zze);
                } catch (Exception e) {
                    zzbv.zzeo().zza(e, "BannerAdManager.swapViews");
                    zzakb.zzc("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (zzajhVar2.zzcof != null && zzajhVar2.zzbyo != null) {
            zzajhVar2.zzbyo.zza(zzasi.zzb(zzajhVar2.zzcof));
            this.zzvw.zzacs.removeAllViews();
            this.zzvw.zzacs.setMinimumWidth(zzajhVar2.zzcof.widthPixels);
            this.zzvw.zzacs.setMinimumHeight(zzajhVar2.zzcof.heightPixels);
            zzg(zzajhVar2.zzbyo.getView());
        }
        if (this.zzvw.zzacs.getChildCount() > 1) {
            this.zzvw.zzacs.showNext();
        }
        if (zzajhVar != null) {
            View nextView2 = this.zzvw.zzacs.getNextView();
            if (nextView2 instanceof zzaqw) {
                ((zzaqw) nextView2).destroy();
            } else if (nextView2 != null) {
                this.zzvw.zzacs.removeView(nextView2);
            }
            this.zzvw.zzfn();
        }
        this.zzvw.zzacs.setVisibility(0);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final zzlo getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        if (this.zzvw.zzacw == null || this.zzvw.zzacw.zzbyo == null) {
            return null;
        }
        return this.zzvw.zzacw.zzbyo.zztm();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzd(this.zzvw.zzacw);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzd(this.zzvw.zzacw);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzvm = z;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.ads.zzks
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zzi
    public final zzaqw zza(zzaji zzajiVar, zzx zzxVar, zzait zzaitVar) throws zzarg {
        AdSize zzhy;
        zzjn zzjnVar;
        if (this.zzvw.zzacv.zzard == null && this.zzvw.zzacv.zzarf) {
            zzbw zzbwVar = this.zzvw;
            if (zzajiVar.zzcos.zzarf) {
                zzjnVar = this.zzvw.zzacv;
            } else {
                String str = zzajiVar.zzcos.zzcet;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    zzhy = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    zzhy = this.zzvw.zzacv.zzhy();
                }
                zzjnVar = new zzjn(this.zzvw.zzrt, zzhy);
            }
            zzbwVar.zzacv = zzjnVar;
        }
        return super.zza(zzajiVar, zzxVar, zzaitVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zzd
    public final void zza(zzajh zzajhVar, boolean z) {
        if (zzcp()) {
            zzaqw zzaqwVar = zzajhVar != null ? zzajhVar.zzbyo : null;
            if (zzaqwVar != null) {
                if (!this.zzxf) {
                    zzc(zzaqwVar);
                }
                if (this.zzwb != null) {
                    zzaqwVar.zza("onSdkImpression", new ArrayMap());
                }
            }
        }
        super.zza(zzajhVar, z);
        if (zzas.zzf(zzajhVar)) {
            zzac zzacVar = new zzac(this);
            if (zzajhVar == null || !zzas.zzf(zzajhVar)) {
                return;
            }
            zzaqw zzaqwVar2 = zzajhVar.zzbyo;
            View view = zzaqwVar2 != null ? zzaqwVar2.getView() : null;
            if (view == null) {
                zzakb.zzdk("AdWebView is null");
                return;
            }
            try {
                List<String> list = zzajhVar.zzbtw != null ? zzajhVar.zzbtw.zzbsi : null;
                if (list != null && !list.isEmpty()) {
                    zzxz zzmo = zzajhVar.zzbtx != null ? zzajhVar.zzbtx.zzmo() : null;
                    zzyc zzmp = zzajhVar.zzbtx != null ? zzajhVar.zzbtx.zzmp() : null;
                    if (list.contains("2") && zzmo != null) {
                        zzmo.zzk(ObjectWrapper.wrap(view));
                        if (!zzmo.getOverrideImpressionRecording()) {
                            zzmo.recordImpression();
                        }
                        zzaqwVar2.zza("/nativeExpressViewClicked", zzas.zza(zzmo, (zzyc) null, zzacVar));
                        return;
                    } else if (!list.contains("1") || zzmp == null) {
                        zzakb.zzdk("No matching template id and mapper");
                        return;
                    } else {
                        zzmp.zzk(ObjectWrapper.wrap(view));
                        if (!zzmp.getOverrideImpressionRecording()) {
                            zzmp.recordImpression();
                        }
                        zzaqwVar2.zza("/nativeExpressViewClicked", zzas.zza((zzxz) null, zzmp, zzacVar));
                        return;
                    }
                }
                zzakb.zzdk("No template ids present in mediation response");
            } catch (RemoteException e) {
                zzakb.zzc("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzbbo)).booleanValue() != false) goto L68;
     */
    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzajh zzajhVar, final zzajh zzajhVar2) {
        if (super.zza(zzajhVar, zzajhVar2)) {
            if (this.zzvw.zzfo() && !zzd(zzajhVar, zzajhVar2)) {
                if (zzajhVar2.zzcoq != null) {
                    zzajhVar2.zzcoq.zza(zzhu.zza.zzb.AD_FAILED_TO_LOAD);
                }
                zzi(0);
                return false;
            }
            zzb(zzajhVar2, false);
            View view = null;
            if (zzajhVar2.zzcfh) {
                zzd(zzajhVar2);
                zzbv.zzfg();
                zzaor.zza((View) this.zzvw.zzacs, (ViewTreeObserver.OnGlobalLayoutListener) this);
                zzbv.zzfg();
                zzaor.zza((View) this.zzvw.zzacs, (ViewTreeObserver.OnScrollChangedListener) this);
                if (!zzajhVar2.zzcoc) {
                    final zzab zzabVar = new zzab(this);
                    zzasc zzuf = zzajhVar2.zzbyo != null ? zzajhVar2.zzbyo.zzuf() : null;
                    if (zzuf != null) {
                        zzuf.zza(new zzasg(zzajhVar2, zzabVar) { // from class: com.google.android.gms.ads.internal.zzz
                            private final zzajh zzxh;
                            private final Runnable zzxi;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzxh = zzajhVar2;
                                this.zzxi = zzabVar;
                            }

                            @Override // com.google.android.gms.internal.ads.zzasg
                            public final void zzda() {
                                zzajh zzajhVar3 = this.zzxh;
                                Runnable runnable = this.zzxi;
                                if (zzajhVar3.zzcoc) {
                                    return;
                                }
                                zzbv.zzek();
                                zzakk.zzd(runnable);
                            }
                        });
                    }
                }
            } else {
                if (this.zzvw.zzfp()) {
                }
                zza(zzajhVar2, false);
            }
            if (zzajhVar2.zzbyo != null) {
                zzarl zztm = zzajhVar2.zzbyo.zztm();
                zzasc zzuf2 = zzajhVar2.zzbyo.zzuf();
                if (zzuf2 != null) {
                    zzuf2.zzuz();
                }
                if (this.zzvw.zzadk != null && zztm != null) {
                    zztm.zzb(this.zzvw.zzadk);
                }
            }
            if (PlatformVersion.isAtLeastIceCreamSandwich()) {
                if (this.zzvw.zzfo()) {
                    if (zzajhVar2.zzbyo != null) {
                        if (zzajhVar2.zzcob != null) {
                            this.zzvy.zza(this.zzvw.zzacv, zzajhVar2);
                        }
                        view = zzajhVar2.zzbyo.getView();
                        final zzfp zzfpVar = new zzfp(this.zzvw.zzrt, view);
                        if (zzbv.zzfh().zzt(this.zzvw.zzrt) && zza(zzajhVar2.zzccv) && !TextUtils.isEmpty(this.zzvw.zzacp)) {
                            zzfpVar.zza(new zzaix(this.zzvw.zzrt, this.zzvw.zzacp));
                        }
                        if (zzajhVar2.zzfz()) {
                            zzfpVar.zza(zzajhVar2.zzbyo);
                        } else {
                            zzajhVar2.zzbyo.zzuf().zza(new zzasf(zzfpVar, zzajhVar2) { // from class: com.google.android.gms.ads.internal.zzaa
                                private final zzfp zzxj;
                                private final zzajh zzxk;

                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    this.zzxj = zzfpVar;
                                    this.zzxk = zzajhVar2;
                                }

                                @Override // com.google.android.gms.internal.ads.zzasf
                                public final void zzdb() {
                                    this.zzxj.zza(this.zzxk.zzbyo);
                                }
                            });
                        }
                    }
                } else if (this.zzvw.zzadu != null && zzajhVar2.zzcob != null) {
                    this.zzvy.zza(this.zzvw.zzacv, zzajhVar2, this.zzvw.zzadu);
                    view = this.zzvw.zzadu;
                }
                if (zzajhVar2.zzceq) {
                    return true;
                }
                this.zzvw.zzj(view);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final boolean zzb(zzjj zzjjVar) {
        zzjj zzjjVar2 = zzjjVar;
        if (zzjjVar2.zzaqb != this.zzvm) {
            zzjjVar2 = new zzjj(zzjjVar2.versionCode, zzjjVar2.zzapw, zzjjVar2.extras, zzjjVar2.zzapx, zzjjVar2.zzapy, zzjjVar2.zzapz, zzjjVar2.zzaqa, zzjjVar2.zzaqb || this.zzvm, zzjjVar2.zzaqc, zzjjVar2.zzaqd, zzjjVar2.zzaqe, zzjjVar2.zzaqf, zzjjVar2.zzaqg, zzjjVar2.zzaqh, zzjjVar2.zzaqi, zzjjVar2.zzaqj, zzjjVar2.zzaqk, zzjjVar2.zzaql);
        }
        return super.zzb(zzjjVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zza
    public final void zzbq() {
        zzaqw zzaqwVar = this.zzvw.zzacw != null ? this.zzvw.zzacw.zzbyo : null;
        if (!this.zzxf && zzaqwVar != null) {
            zzc(zzaqwVar);
        }
        super.zzbq();
    }

    @Override // com.google.android.gms.ads.internal.zzd
    protected final boolean zzca() {
        boolean z;
        zzbv.zzek();
        if (zzakk.zzl(this.zzvw.zzrt, "android.permission.INTERNET")) {
            z = true;
        } else {
            zzkb.zzif().zza(this.zzvw.zzacs, this.zzvw.zzacv, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        zzbv.zzek();
        if (!zzakk.zzaj(this.zzvw.zzrt)) {
            zzkb.zzif().zza(this.zzvw.zzacs, this.zzvw.zzacv, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.zzvw.zzacs != null) {
            this.zzvw.zzacs.setVisibility(0);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzcz() {
        this.zzvv.zzdy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzajh zzajhVar) {
        if (zzajhVar == null || zzajhVar.zzcoc || this.zzvw.zzacs == null || !zzbv.zzek().zza(this.zzvw.zzacs, this.zzvw.zzrt) || !this.zzvw.zzacs.getGlobalVisibleRect(new Rect(), null)) {
            return;
        }
        if (zzajhVar != null && zzajhVar.zzbyo != null && zzajhVar.zzbyo.zzuf() != null) {
            zzajhVar.zzbyo.zzuf().zza((zzasg) null);
        }
        zza(zzajhVar, false);
        zzajhVar.zzcoc = true;
    }
}
