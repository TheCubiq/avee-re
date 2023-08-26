package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzarh extends FrameLayout implements zzaqw {
    private final zzaqw zzdcy;
    private final zzapn zzdcz;

    public zzarh(zzaqw zzaqwVar) {
        super(zzaqwVar.getContext());
        this.zzdcy = zzaqwVar;
        this.zzdcz = new zzapn(zzaqwVar.zzua(), this, this);
        addView(this.zzdcy.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void destroy() {
        this.zzdcy.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final View.OnClickListener getOnClickListener() {
        return this.zzdcy.getOnClickListener();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final int getRequestedOrientation() {
        return this.zzdcy.getRequestedOrientation();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzasb
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final WebView getWebView() {
        return this.zzdcy.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean isDestroyed() {
        return this.zzdcy.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void loadData(String str, String str2, String str3) {
        this.zzdcy.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzdcy.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void loadUrl(String str) {
        this.zzdcy.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void onPause() {
        this.zzdcz.onPause();
        this.zzdcy.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void onResume() {
        this.zzdcy.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzaqw
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzdcy.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzaqw
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zzdcy.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void setRequestedOrientation(int i) {
        this.zzdcy.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzdcy.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzdcy.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void stopLoading() {
        this.zzdcy.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzdcy.zza(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzdcy.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final void zza(zzarl zzarlVar) {
        this.zzdcy.zza(zzarlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zza(zzasi zzasiVar) {
        this.zzdcy.zza(zzasiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zza(zzfs zzfsVar) {
        this.zzdcy.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zza(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw> zzvVar) {
        this.zzdcy.zza(str, zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zza(String str, Predicate<com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw>> predicate) {
        this.zzdcy.zza(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(String str, Map<String, ?> map) {
        this.zzdcy.zza(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(String str, JSONObject jSONObject) {
        this.zzdcy.zza(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(boolean z, int i) {
        this.zzdcy.zza(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(boolean z, int i, String str) {
        this.zzdcy.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzdcy.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final void zzah(boolean z) {
        this.zzdcy.zzah(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzai(int i) {
        this.zzdcy.zzai(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzai(boolean z) {
        this.zzdcy.zzai(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzaj(boolean z) {
        this.zzdcy.zzaj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzak(boolean z) {
        this.zzdcy.zzak(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzb(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzdcy.zzb(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzb(zzox zzoxVar) {
        this.zzdcy.zzb(zzoxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzb(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw> zzvVar) {
        this.zzdcy.zzb(str, zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzb(String str, JSONObject jSONObject) {
        this.zzdcy.zzb(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzbe(String str) {
        this.zzdcy.zzbe(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final com.google.android.gms.ads.internal.zzw zzbi() {
        return this.zzdcy.zzbi();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzbm(Context context) {
        this.zzdcy.zzbm(context);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzc(String str, String str2, String str3) {
        this.zzdcy.zzc(str, str2, str3);
    }

    @Override // com.google.android.gms.ads.internal.zzbo
    public final void zzcl() {
        this.zzdcy.zzcl();
    }

    @Override // com.google.android.gms.ads.internal.zzbo
    public final void zzcm() {
        this.zzdcy.zzcm();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzdr(String str) {
        this.zzdcy.zzdr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzno() {
        this.zzdcy.zzno();
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final void zznp() {
        this.zzdcy.zznp();
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final String zzol() {
        return this.zzdcy.zzol();
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final zzapn zztl() {
        return this.zzdcz;
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final zzarl zztm() {
        return this.zzdcy.zztm();
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final zznv zztn() {
        return this.zzdcy.zztn();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw, com.google.android.gms.internal.ads.zzarr
    public final Activity zzto() {
        return this.zzdcy.zzto();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw
    public final zznw zztp() {
        return this.zzdcy.zztp();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzapw, com.google.android.gms.internal.ads.zzasa
    public final zzang zztq() {
        return this.zzdcy.zztq();
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final int zztr() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzapw
    public final int zzts() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzty() {
        this.zzdcy.zzty();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zztz() {
        this.zzdcy.zztz();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzu(boolean z) {
        this.zzdcy.zzu(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final Context zzua() {
        return this.zzdcy.zzua();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final com.google.android.gms.ads.internal.overlay.zzd zzub() {
        return this.zzdcy.zzub();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final com.google.android.gms.ads.internal.overlay.zzd zzuc() {
        return this.zzdcy.zzuc();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzary
    public final zzasi zzud() {
        return this.zzdcy.zzud();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final String zzue() {
        return this.zzdcy.zzue();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final zzasc zzuf() {
        return this.zzdcy.zzuf();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final WebViewClient zzug() {
        return this.zzdcy.zzug();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzuh() {
        return this.zzdcy.zzuh();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzarz
    public final zzci zzui() {
        return this.zzdcy.zzui();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw, com.google.android.gms.internal.ads.zzars
    public final boolean zzuj() {
        return this.zzdcy.zzuj();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzuk() {
        this.zzdcz.onDestroy();
        this.zzdcy.zzuk();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzul() {
        return this.zzdcy.zzul();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzum() {
        return this.zzdcy.zzum();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final boolean zzun() {
        return this.zzdcy.zzun();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzuo() {
        this.zzdcy.zzuo();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzup() {
        this.zzdcy.zzup();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final zzox zzuq() {
        return this.zzdcy.zzuq();
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzur() {
        setBackgroundColor(0);
        this.zzdcy.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final void zzus() {
        TextView textView = new TextView(getContext());
        Resources resources = com.google.android.gms.ads.internal.zzbv.zzeo().getResources();
        textView.setText(resources != null ? resources.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }
}
