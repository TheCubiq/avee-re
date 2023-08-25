package com.daaw;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.zzs;
/* loaded from: classes.dex */
public final class cf8 extends WebViewClient {
    public final /* synthetic */ zzs a;

    public cf8(zzs zzsVar) {
        this.a = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzbh zzbhVar3;
        zzbh zzbhVar4;
        zzs zzsVar = this.a;
        zzbhVar = zzsVar.v;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzsVar.v;
                zzbhVar2.zzf(tj6.d(1, null, null));
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
        zzs zzsVar2 = this.a;
        zzbhVar3 = zzsVar2.v;
        if (zzbhVar3 != null) {
            try {
                zzbhVar4 = zzsVar2.v;
                zzbhVar4.zze(0);
            } catch (RemoteException e2) {
                k04.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzbh zzbhVar3;
        zzbh zzbhVar4;
        zzbh zzbhVar5;
        zzbh zzbhVar6;
        zzbh zzbhVar7;
        zzbh zzbhVar8;
        zzbh zzbhVar9;
        zzbh zzbhVar10;
        zzbh zzbhVar11;
        zzbh zzbhVar12;
        zzbh zzbhVar13;
        if (str.startsWith(this.a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzs zzsVar = this.a;
            zzbhVar10 = zzsVar.v;
            if (zzbhVar10 != null) {
                try {
                    zzbhVar11 = zzsVar.v;
                    zzbhVar11.zzf(tj6.d(3, null, null));
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
            zzs zzsVar2 = this.a;
            zzbhVar12 = zzsVar2.v;
            if (zzbhVar12 != null) {
                try {
                    zzbhVar13 = zzsVar2.v;
                    zzbhVar13.zze(3);
                } catch (RemoteException e2) {
                    k04.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.a.g3(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.a;
            zzbhVar6 = zzsVar3.v;
            if (zzbhVar6 != null) {
                try {
                    zzbhVar7 = zzsVar3.v;
                    zzbhVar7.zzf(tj6.d(1, null, null));
                } catch (RemoteException e3) {
                    k04.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzs zzsVar4 = this.a;
            zzbhVar8 = zzsVar4.v;
            if (zzbhVar8 != null) {
                try {
                    zzbhVar9 = zzsVar4.v;
                    zzbhVar9.zze(0);
                } catch (RemoteException e4) {
                    k04.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.a.g3(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.a;
            zzbhVar4 = zzsVar5.v;
            if (zzbhVar4 != null) {
                try {
                    zzbhVar5 = zzsVar5.v;
                    zzbhVar5.zzi();
                } catch (RemoteException e5) {
                    k04.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.a.g3(this.a.zzb(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzs zzsVar6 = this.a;
            zzbhVar = zzsVar6.v;
            if (zzbhVar != null) {
                try {
                    zzbhVar2 = zzsVar6.v;
                    zzbhVar2.zzc();
                    zzbhVar3 = this.a.v;
                    zzbhVar3.zzh();
                } catch (RemoteException e6) {
                    k04.zzl("#007 Could not call remote method.", e6);
                }
            }
            zzs.p3(this.a, zzs.m3(this.a, str));
            return true;
        }
    }
}
