package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzkh;
import com.google.android.gms.internal.ads.zznk;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbq extends WebViewClient {
    private final /* synthetic */ zzbp zzaba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(zzbp zzbpVar) {
        this.zzaba = zzbpVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzkh zzkhVar;
        zzkh zzkhVar2;
        zzkhVar = this.zzaba.zzxs;
        if (zzkhVar != null) {
            try {
                zzkhVar2 = this.zzaba.zzxs;
                zzkhVar2.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzkh zzkhVar;
        zzkh zzkhVar2;
        String zzv;
        zzkh zzkhVar3;
        zzkh zzkhVar4;
        zzkh zzkhVar5;
        zzkh zzkhVar6;
        zzkh zzkhVar7;
        zzkh zzkhVar8;
        if (str.startsWith(this.zzaba.zzeb())) {
            return false;
        }
        if (str.startsWith((String) zzkb.zzik().zzd(zznk.zzbcw))) {
            zzkhVar7 = this.zzaba.zzxs;
            if (zzkhVar7 != null) {
                try {
                    zzkhVar8 = this.zzaba.zzxs;
                    zzkhVar8.onAdFailedToLoad(3);
                } catch (RemoteException e) {
                    zzakb.zzd("#007 Could not call remote method.", e);
                }
            }
            this.zzaba.zzk(0);
            return true;
        }
        if (str.startsWith((String) zzkb.zzik().zzd(zznk.zzbcx))) {
            zzkhVar5 = this.zzaba.zzxs;
            if (zzkhVar5 != null) {
                try {
                    zzkhVar6 = this.zzaba.zzxs;
                    zzkhVar6.onAdFailedToLoad(0);
                } catch (RemoteException e2) {
                    zzakb.zzd("#007 Could not call remote method.", e2);
                }
            }
            this.zzaba.zzk(0);
            return true;
        }
        if (str.startsWith((String) zzkb.zzik().zzd(zznk.zzbcy))) {
            zzkhVar3 = this.zzaba.zzxs;
            if (zzkhVar3 != null) {
                try {
                    zzkhVar4 = this.zzaba.zzxs;
                    zzkhVar4.onAdLoaded();
                } catch (RemoteException e3) {
                    zzakb.zzd("#007 Could not call remote method.", e3);
                }
            }
            this.zzaba.zzk(this.zzaba.zzu(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzkhVar = this.zzaba.zzxs;
            if (zzkhVar != null) {
                try {
                    zzkhVar2 = this.zzaba.zzxs;
                    zzkhVar2.onAdLeftApplication();
                } catch (RemoteException e4) {
                    zzakb.zzd("#007 Could not call remote method.", e4);
                }
            }
            zzv = this.zzaba.zzv(str);
            this.zzaba.zzw(zzv);
            return true;
        }
    }
}
