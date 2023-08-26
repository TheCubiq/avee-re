package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaaw;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzci;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzke;
import com.google.android.gms.internal.ads.zzkh;
import com.google.android.gms.internal.ads.zzkt;
import com.google.android.gms.internal.ads.zzkx;
import com.google.android.gms.internal.ads.zzla;
import com.google.android.gms.internal.ads.zzlg;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zzod;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzbp extends zzkt {
    private final Context mContext;
    private final zzjn zzaau;
    private final Future<zzci> zzaav = zzaki.zza(new zzbs(this));
    private final zzbu zzaaw;
    private WebView zzaax;
    private zzci zzaay;
    private AsyncTask<Void, Void, String> zzaaz;
    private zzkh zzxs;
    private final zzang zzyf;

    public zzbp(Context context, zzjn zzjnVar, String str, zzang zzangVar) {
        this.mContext = context;
        this.zzyf = zzangVar;
        this.zzaau = zzjnVar;
        this.zzaax = new WebView(this.mContext);
        this.zzaaw = new zzbu(str);
        zzk(0);
        this.zzaax.setVerticalScrollBarEnabled(false);
        this.zzaax.getSettings().setJavaScriptEnabled(true);
        this.zzaax.setWebViewClient(new zzbq(this));
        this.zzaax.setOnTouchListener(new zzbr(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzv(String str) {
        if (this.zzaay == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzaay.zza(parse, this.mContext, null, null);
        } catch (zzcj e) {
            zzakb.zzc("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.mContext.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzaaz.cancel(true);
        this.zzaav.cancel(true);
        this.zzaax.destroy();
        this.zzaax = null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzlo getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzaaw zzaawVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzabc zzabcVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzahe zzaheVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzjn zzjnVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzke zzkeVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzkh zzkhVar) throws RemoteException {
        this.zzxs = zzkhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzkx zzkxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzla zzlaVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzlg zzlgVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzlu zzluVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzmu zzmuVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zza(zzod zzodVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean zzb(zzjj zzjjVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzaax, "This Search Ad has already been torn down");
        this.zzaaw.zza(zzjjVar, this.zzyf);
        this.zzaaz = new zzbt(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final Bundle zzba() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final IObjectWrapper zzbj() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzaax);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzjn zzbk() throws RemoteException {
        return this.zzaau;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void zzbm() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzla zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzkh zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String zzck() throws RemoteException {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzea() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzkb.zzik().zzd(zznk.zzbcz));
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzaaw.getQuery());
        builder.appendQueryParameter("pubId", this.zzaaw.zzed());
        Map<String, String> zzee = this.zzaaw.zzee();
        for (String str : zzee.keySet()) {
            builder.appendQueryParameter(str, zzee.get(str));
        }
        Uri build = builder.build();
        zzci zzciVar = this.zzaay;
        if (zzciVar != null) {
            try {
                build = zzciVar.zza(build, this.mContext);
            } catch (zzcj e) {
                zzakb.zzc("Unable to process ad data", e);
            }
        }
        String zzeb = zzeb();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzeb).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzeb);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzeb() {
        String zzec = this.zzaaw.zzec();
        if (TextUtils.isEmpty(zzec)) {
            zzec = "www.google.com";
        }
        String str = (String) zzkb.zzik().zzd(zznk.zzbcz);
        StringBuilder sb = new StringBuilder(String.valueOf(zzec).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(zzec);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk(int i) {
        if (this.zzaax == null) {
            return;
        }
        this.zzaax.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzu(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzkb.zzif();
            return zzamu.zza(this.mContext, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
