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

    /* renamed from: a */
    public final /* synthetic */ zzs f5789a;

    public cf8(zzs zzsVar) {
        this.f5789a = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzbh zzbhVar3;
        zzbh zzbhVar4;
        zzs zzsVar = this.f5789a;
        zzbhVar = zzsVar.f36372v;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzsVar.f36372v;
                zzbhVar2.zzf(tj6.m9071d(1, null, null));
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
        zzs zzsVar2 = this.f5789a;
        zzbhVar3 = zzsVar2.f36372v;
        if (zzbhVar3 != null) {
            try {
                zzbhVar4 = zzsVar2.f36372v;
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
        if (str.startsWith(this.f5789a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzs zzsVar = this.f5789a;
            zzbhVar10 = zzsVar.f36372v;
            if (zzbhVar10 != null) {
                try {
                    zzbhVar11 = zzsVar.f36372v;
                    zzbhVar11.zzf(tj6.m9071d(3, null, null));
                } catch (RemoteException e) {
                    k04.zzl("#007 Could not call remote method.", e);
                }
            }
            zzs zzsVar2 = this.f5789a;
            zzbhVar12 = zzsVar2.f36372v;
            if (zzbhVar12 != null) {
                try {
                    zzbhVar13 = zzsVar2.f36372v;
                    zzbhVar13.zze(3);
                } catch (RemoteException e2) {
                    k04.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.f5789a.m1310g3(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.f5789a;
            zzbhVar6 = zzsVar3.f36372v;
            if (zzbhVar6 != null) {
                try {
                    zzbhVar7 = zzsVar3.f36372v;
                    zzbhVar7.zzf(tj6.m9071d(1, null, null));
                } catch (RemoteException e3) {
                    k04.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzs zzsVar4 = this.f5789a;
            zzbhVar8 = zzsVar4.f36372v;
            if (zzbhVar8 != null) {
                try {
                    zzbhVar9 = zzsVar4.f36372v;
                    zzbhVar9.zze(0);
                } catch (RemoteException e4) {
                    k04.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.f5789a.m1310g3(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.f5789a;
            zzbhVar4 = zzsVar5.f36372v;
            if (zzbhVar4 != null) {
                try {
                    zzbhVar5 = zzsVar5.f36372v;
                    zzbhVar5.zzi();
                } catch (RemoteException e5) {
                    k04.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.f5789a.m1310g3(this.f5789a.zzb(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzs zzsVar6 = this.f5789a;
            zzbhVar = zzsVar6.f36372v;
            if (zzbhVar != null) {
                try {
                    zzbhVar2 = zzsVar6.f36372v;
                    zzbhVar2.zzc();
                    zzbhVar3 = this.f5789a.f36372v;
                    zzbhVar3.zzh();
                } catch (RemoteException e6) {
                    k04.zzl("#007 Could not call remote method.", e6);
                }
            }
            zzs.m1301p3(this.f5789a, zzs.m1304m3(this.f5789a, str));
            return true;
        }
    }
}
