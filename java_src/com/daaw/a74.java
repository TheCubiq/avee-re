package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface a74 extends zza, vy4, r64, uj3, a84, e84, kk3, q03, i84, zzl, l84, m84, y24, n84 {
    void B(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void C();

    void D(boolean z);

    void I(ec3 ec3Var);

    void K(int i);

    boolean L();

    void N();

    String O();

    void P(th6 th6Var, wh6 wh6Var);

    void Q(v84 v84Var);

    void R(yd0 yd0Var);

    void U(boolean z);

    boolean V();

    void X(boolean z);

    void Y();

    @Override // com.daaw.l84
    sl2 a();

    void a0(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void b0(String str, String str2, String str3);

    void c0(String str, uy0 uy0Var);

    boolean canGoBack();

    @Override // com.daaw.r64
    th6 d();

    void destroy();

    void f0();

    @Override // com.daaw.n84
    View g();

    void g0(boolean z);

    @Override // com.daaw.e84, com.daaw.y24
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    WebView h();

    boolean i();

    Context j();

    yd0 j0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    WebViewClient n();

    @Override // com.daaw.k84
    v84 o();

    boolean o0();

    void onPause();

    void onResume();

    j23 p();

    void p0(int i);

    boolean q();

    void q0(cc3 cc3Var);

    boolean r();

    f77 r0();

    void s0(Context context);

    @Override // com.daaw.y24
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.daaw.y24
    void t(String str, j54 j54Var);

    @Override // com.daaw.y24
    void u(z74 z74Var);

    void u0(j23 j23Var);

    @Override // com.daaw.a84
    wh6 v();

    void v0();

    void w(boolean z);

    void w0(boolean z);

    void x(String str, zg3 zg3Var);

    boolean x0(boolean z, int i);

    void y(String str, zg3 zg3Var);

    void z();

    ec3 zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    t84 zzP();

    void zzX();

    void zzZ();

    @Override // com.daaw.e84, com.daaw.y24
    Activity zzk();

    @Override // com.daaw.y24
    com.google.android.gms.ads.internal.zza zzm();

    @Override // com.daaw.y24
    t93 zzo();

    @Override // com.daaw.m84, com.daaw.y24
    zzchu zzp();

    @Override // com.daaw.y24
    z74 zzs();
}
