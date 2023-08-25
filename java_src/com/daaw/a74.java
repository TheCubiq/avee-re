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
    /* renamed from: B */
    void mo6463B(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    /* renamed from: C */
    void mo6462C();

    /* renamed from: D */
    void mo6460D(boolean z);

    /* renamed from: I */
    void mo6454I(ec3 ec3Var);

    /* renamed from: K */
    void mo6451K(int i);

    /* renamed from: L */
    boolean mo6449L();

    /* renamed from: N */
    void mo6446N();

    /* renamed from: O */
    String mo6444O();

    /* renamed from: P */
    void mo6442P(th6 th6Var, wh6 wh6Var);

    /* renamed from: Q */
    void mo6440Q(v84 v84Var);

    /* renamed from: R */
    void mo6438R(yd0 yd0Var);

    /* renamed from: U */
    void mo6432U(boolean z);

    /* renamed from: V */
    boolean mo6430V();

    /* renamed from: X */
    void mo6427X(boolean z);

    /* renamed from: Y */
    void mo6426Y();

    @Override // com.daaw.l84
    /* renamed from: a */
    sl2 mo6425a();

    /* renamed from: a0 */
    void mo6424a0(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    /* renamed from: b0 */
    void mo6423b0(String str, String str2, String str3);

    /* renamed from: c0 */
    void mo6422c0(String str, uy0 uy0Var);

    boolean canGoBack();

    @Override // com.daaw.r64
    /* renamed from: d */
    th6 mo6421d();

    void destroy();

    /* renamed from: f0 */
    void mo6419f0();

    @Override // com.daaw.n84
    /* renamed from: g */
    View mo6418g();

    /* renamed from: g0 */
    void mo6417g0(boolean z);

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

    /* renamed from: h */
    WebView mo6416h();

    /* renamed from: i */
    boolean mo6414i();

    /* renamed from: j */
    Context mo6412j();

    /* renamed from: j0 */
    yd0 mo6411j0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* renamed from: n */
    WebViewClient mo6410n();

    @Override // com.daaw.k84
    /* renamed from: o */
    v84 mo6408o();

    /* renamed from: o0 */
    boolean mo6407o0();

    void onPause();

    void onResume();

    /* renamed from: p */
    j23 mo6406p();

    /* renamed from: p0 */
    void mo6405p0(int i);

    /* renamed from: q */
    boolean mo6404q();

    /* renamed from: q0 */
    void mo6403q0(cc3 cc3Var);

    /* renamed from: r */
    boolean mo6402r();

    /* renamed from: r0 */
    f77 mo6401r0();

    /* renamed from: s0 */
    void mo6400s0(Context context);

    @Override // com.daaw.y24
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.daaw.y24
    /* renamed from: t */
    void mo4236t(String str, j54 j54Var);

    @Override // com.daaw.y24
    /* renamed from: u */
    void mo4235u(z74 z74Var);

    /* renamed from: u0 */
    void mo6399u0(j23 j23Var);

    @Override // com.daaw.a84
    /* renamed from: v */
    wh6 mo6398v();

    /* renamed from: v0 */
    void mo6397v0();

    /* renamed from: w */
    void mo6396w(boolean z);

    /* renamed from: w0 */
    void mo6395w0(boolean z);

    /* renamed from: x */
    void mo6394x(String str, zg3 zg3Var);

    /* renamed from: x0 */
    boolean mo6393x0(boolean z, int i);

    /* renamed from: y */
    void mo6392y(String str, zg3 zg3Var);

    /* renamed from: z */
    void mo6391z();

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
