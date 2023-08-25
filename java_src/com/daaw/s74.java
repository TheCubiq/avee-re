package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s74 extends FrameLayout implements a74 {

    /* renamed from: p */
    public final a74 f25959p;

    /* renamed from: q */
    public final n24 f25960q;

    /* renamed from: r */
    public final AtomicBoolean f25961r;

    public s74(a74 a74Var) {
        super(a74Var.getContext());
        this.f25961r = new AtomicBoolean();
        this.f25959p = a74Var;
        this.f25960q = new n24(a74Var.mo6412j(), this, this);
        addView((View) a74Var);
    }

    @Override // com.daaw.y24
    /* renamed from: A */
    public final void mo4246A(int i) {
        this.f25959p.mo4246A(i);
    }

    @Override // com.daaw.i84
    /* renamed from: A0 */
    public final void mo6464A0(boolean z, int i, String str, String str2, boolean z2) {
        this.f25959p.mo6464A0(z, i, str, str2, z2);
    }

    @Override // com.daaw.a74
    /* renamed from: B */
    public final void mo6463B(zzl zzlVar) {
        this.f25959p.mo6463B(zzlVar);
    }

    @Override // com.daaw.a74
    /* renamed from: C */
    public final void mo6462C() {
        TextView textView = new TextView(getContext());
        zzt.zzp();
        textView.setText(zzs.zzv());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.daaw.kk3
    /* renamed from: C0 */
    public final void mo6461C0(String str, JSONObject jSONObject) {
        ((w74) this.f25959p).mo6049c(str, jSONObject.toString());
    }

    @Override // com.daaw.a74
    /* renamed from: D */
    public final void mo6460D(boolean z) {
        this.f25959p.mo6460D(z);
    }

    @Override // com.daaw.y24
    /* renamed from: F */
    public final void mo4245F(int i) {
        this.f25960q.m15564f(i);
    }

    @Override // com.daaw.y24
    /* renamed from: H */
    public final j54 mo4244H(String str) {
        return this.f25959p.mo4244H(str);
    }

    @Override // com.daaw.a74
    /* renamed from: I */
    public final void mo6454I(ec3 ec3Var) {
        this.f25959p.mo6454I(ec3Var);
    }

    @Override // com.daaw.a74
    /* renamed from: K */
    public final void mo6451K(int i) {
        this.f25959p.mo6451K(i);
    }

    @Override // com.daaw.a74
    /* renamed from: L */
    public final boolean mo6449L() {
        return this.f25959p.mo6449L();
    }

    @Override // com.daaw.y24
    /* renamed from: M */
    public final void mo4243M(int i) {
        this.f25959p.mo4243M(i);
    }

    @Override // com.daaw.a74
    /* renamed from: N */
    public final void mo6446N() {
        this.f25959p.mo6446N();
    }

    @Override // com.daaw.a74
    /* renamed from: O */
    public final String mo6444O() {
        return this.f25959p.mo6444O();
    }

    @Override // com.daaw.a74
    /* renamed from: P */
    public final void mo6442P(th6 th6Var, wh6 wh6Var) {
        this.f25959p.mo6442P(th6Var, wh6Var);
    }

    @Override // com.daaw.a74
    /* renamed from: Q */
    public final void mo6440Q(v84 v84Var) {
        this.f25959p.mo6440Q(v84Var);
    }

    @Override // com.daaw.a74
    /* renamed from: R */
    public final void mo6438R(yd0 yd0Var) {
        this.f25959p.mo6438R(yd0Var);
    }

    @Override // com.daaw.i84
    /* renamed from: S */
    public final void mo6436S(boolean z, int i, String str, boolean z2) {
        this.f25959p.mo6436S(z, i, str, z2);
    }

    @Override // com.daaw.uj3
    /* renamed from: T */
    public final void mo6434T(String str, Map map) {
        this.f25959p.mo6434T(str, map);
    }

    @Override // com.daaw.a74
    /* renamed from: U */
    public final void mo6432U(boolean z) {
        this.f25959p.mo6432U(z);
    }

    @Override // com.daaw.a74
    /* renamed from: V */
    public final boolean mo6430V() {
        return this.f25961r.get();
    }

    @Override // com.daaw.y24
    /* renamed from: W */
    public final void mo4242W(int i) {
        this.f25959p.mo4242W(i);
    }

    @Override // com.daaw.a74
    /* renamed from: X */
    public final void mo6427X(boolean z) {
        this.f25959p.mo6427X(z);
    }

    @Override // com.daaw.a74
    /* renamed from: Y */
    public final void mo6426Y() {
        setBackgroundColor(0);
        this.f25959p.setBackgroundColor(0);
    }

    @Override // com.daaw.a74, com.daaw.l84
    /* renamed from: a */
    public final sl2 mo6425a() {
        return this.f25959p.mo6425a();
    }

    @Override // com.daaw.a74
    /* renamed from: a0 */
    public final void mo6424a0(zzl zzlVar) {
        this.f25959p.mo6424a0(zzlVar);
    }

    @Override // com.daaw.y24
    /* renamed from: b */
    public final String mo4241b() {
        return this.f25959p.mo4241b();
    }

    @Override // com.daaw.a74
    /* renamed from: b0 */
    public final void mo6423b0(String str, String str2, String str3) {
        this.f25959p.mo6423b0(str, str2, null);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    /* renamed from: c */
    public final void mo6049c(String str, String str2) {
        this.f25959p.mo6049c("window.inspectorInfo", str2);
    }

    @Override // com.daaw.a74
    /* renamed from: c0 */
    public final void mo6422c0(String str, uy0 uy0Var) {
        this.f25959p.mo6422c0(str, uy0Var);
    }

    @Override // com.daaw.a74
    public final boolean canGoBack() {
        return this.f25959p.canGoBack();
    }

    @Override // com.daaw.a74, com.daaw.r64
    /* renamed from: d */
    public final th6 mo6421d() {
        return this.f25959p.mo6421d();
    }

    @Override // com.daaw.a74
    public final void destroy() {
        final yd0 mo6411j0 = mo6411j0();
        if (mo6411j0 == null) {
            this.f25959p.destroy();
            return;
        }
        gv6 gv6Var = zzs.zza;
        gv6Var.post(new Runnable() { // from class: com.daaw.q74
            @Override // java.lang.Runnable
            public final void run() {
                yd0 yd0Var = yd0.this;
                zzt.zzA();
                if (((Boolean) zzba.zzc().m23658b(g93.f10890y4)).booleanValue() && rp6.m11081b()) {
                    Object m14831M = nt0.m14831M(yd0Var);
                    if (m14831M instanceof tp6) {
                        ((tp6) m14831M).mo4835c();
                    }
                }
            }
        });
        final a74 a74Var = this.f25959p;
        a74Var.getClass();
        gv6Var.postDelayed(new Runnable() { // from class: com.daaw.r74
            @Override // java.lang.Runnable
            public final void run() {
                a74.this.destroy();
            }
        }, ((Integer) zzba.zzc().m23658b(g93.f10901z4)).intValue());
    }

    @Override // com.daaw.y24
    /* renamed from: e */
    public final void mo4240e() {
        this.f25959p.mo4240e();
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final void mo6420e0(p03 p03Var) {
        this.f25959p.mo6420e0(p03Var);
    }

    @Override // com.daaw.a74
    /* renamed from: f0 */
    public final void mo6419f0() {
        this.f25959p.mo6419f0();
    }

    @Override // com.daaw.a74, com.daaw.n84
    /* renamed from: g */
    public final View mo6418g() {
        return this;
    }

    @Override // com.daaw.a74
    /* renamed from: g0 */
    public final void mo6417g0(boolean z) {
        this.f25959p.mo6417g0(z);
    }

    @Override // com.daaw.a74
    public final void goBack() {
        this.f25959p.goBack();
    }

    @Override // com.daaw.a74
    /* renamed from: h */
    public final WebView mo6416h() {
        return (WebView) this.f25959p;
    }

    @Override // com.daaw.i84
    /* renamed from: h0 */
    public final void mo6415h0(zzbr zzbrVar, cq5 cq5Var, kd5 kd5Var, on6 on6Var, String str, String str2, int i) {
        this.f25959p.mo6415h0(zzbrVar, cq5Var, kd5Var, on6Var, str, str2, 14);
    }

    @Override // com.daaw.a74
    /* renamed from: i */
    public final boolean mo6414i() {
        return this.f25959p.mo6414i();
    }

    @Override // com.daaw.i84
    /* renamed from: i0 */
    public final void mo6413i0(zzc zzcVar, boolean z) {
        this.f25959p.mo6413i0(zzcVar, z);
    }

    @Override // com.daaw.a74
    /* renamed from: j */
    public final Context mo6412j() {
        return this.f25959p.mo6412j();
    }

    @Override // com.daaw.a74
    /* renamed from: j0 */
    public final yd0 mo6411j0() {
        return this.f25959p.mo6411j0();
    }

    @Override // com.daaw.y24
    /* renamed from: k */
    public final void mo4239k() {
        this.f25959p.mo4239k();
    }

    @Override // com.daaw.uj3, com.daaw.wj3
    /* renamed from: l */
    public final void mo6048l(String str, JSONObject jSONObject) {
        this.f25959p.mo6048l(str, jSONObject);
    }

    @Override // com.daaw.y24
    /* renamed from: l0 */
    public final n24 mo4238l0() {
        return this.f25960q;
    }

    @Override // com.daaw.a74
    public final void loadData(String str, String str2, String str3) {
        this.f25959p.loadData(str, "text/html", str3);
    }

    @Override // com.daaw.a74
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f25959p.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.daaw.a74
    public final void loadUrl(String str) {
        this.f25959p.loadUrl(str);
    }

    @Override // com.daaw.y24
    /* renamed from: m0 */
    public final void mo4237m0(boolean z, long j) {
        this.f25959p.mo4237m0(z, j);
    }

    @Override // com.daaw.a74
    /* renamed from: n */
    public final WebViewClient mo6410n() {
        return this.f25959p.mo6410n();
    }

    @Override // com.daaw.i84
    /* renamed from: n0 */
    public final void mo6409n0(boolean z, int i, boolean z2) {
        this.f25959p.mo6409n0(z, i, z2);
    }

    @Override // com.daaw.a74, com.daaw.k84
    /* renamed from: o */
    public final v84 mo6408o() {
        return this.f25959p.mo6408o();
    }

    @Override // com.daaw.a74
    /* renamed from: o0 */
    public final boolean mo6407o0() {
        return this.f25959p.mo6407o0();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        a74 a74Var = this.f25959p;
        if (a74Var != null) {
            a74Var.onAdClicked();
        }
    }

    @Override // com.daaw.a74
    public final void onPause() {
        this.f25960q.m15565e();
        this.f25959p.onPause();
    }

    @Override // com.daaw.a74
    public final void onResume() {
        this.f25959p.onResume();
    }

    @Override // com.daaw.a74
    /* renamed from: p */
    public final j23 mo6406p() {
        return this.f25959p.mo6406p();
    }

    @Override // com.daaw.a74
    /* renamed from: p0 */
    public final void mo6405p0(int i) {
        this.f25959p.mo6405p0(i);
    }

    @Override // com.daaw.a74
    /* renamed from: q */
    public final boolean mo6404q() {
        return this.f25959p.mo6404q();
    }

    @Override // com.daaw.a74
    /* renamed from: q0 */
    public final void mo6403q0(cc3 cc3Var) {
        this.f25959p.mo6403q0(cc3Var);
    }

    @Override // com.daaw.a74
    /* renamed from: r */
    public final boolean mo6402r() {
        return this.f25959p.mo6402r();
    }

    @Override // com.daaw.a74
    /* renamed from: r0 */
    public final f77 mo6401r0() {
        return this.f25959p.mo6401r0();
    }

    @Override // com.daaw.a74
    /* renamed from: s0 */
    public final void mo6400s0(Context context) {
        this.f25959p.mo6400s0(context);
    }

    @Override // android.view.View, com.daaw.a74
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f25959p.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.daaw.a74
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f25959p.setOnTouchListener(onTouchListener);
    }

    @Override // com.daaw.a74
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f25959p.setWebChromeClient(webChromeClient);
    }

    @Override // com.daaw.a74
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f25959p.setWebViewClient(webViewClient);
    }

    @Override // com.daaw.a74, com.daaw.y24
    /* renamed from: t */
    public final void mo4236t(String str, j54 j54Var) {
        this.f25959p.mo4236t(str, j54Var);
    }

    @Override // com.daaw.a74, com.daaw.y24
    /* renamed from: u */
    public final void mo4235u(z74 z74Var) {
        this.f25959p.mo4235u(z74Var);
    }

    @Override // com.daaw.a74
    /* renamed from: u0 */
    public final void mo6399u0(j23 j23Var) {
        this.f25959p.mo6399u0(j23Var);
    }

    @Override // com.daaw.a74, com.daaw.a84
    /* renamed from: v */
    public final wh6 mo6398v() {
        return this.f25959p.mo6398v();
    }

    @Override // com.daaw.a74
    /* renamed from: v0 */
    public final void mo6397v0() {
        a74 a74Var = this.f25959p;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(zzt.zzr().zza()));
        w74 w74Var = (w74) a74Var;
        hashMap.put("device_volume", String.valueOf(zzab.zzb(w74Var.getContext())));
        w74Var.mo6434T("volume", hashMap);
    }

    @Override // com.daaw.a74
    /* renamed from: w */
    public final void mo6396w(boolean z) {
        this.f25959p.mo6396w(z);
    }

    @Override // com.daaw.a74
    /* renamed from: w0 */
    public final void mo6395w0(boolean z) {
        this.f25959p.mo6395w0(z);
    }

    @Override // com.daaw.a74
    /* renamed from: x */
    public final void mo6394x(String str, zg3 zg3Var) {
        this.f25959p.mo6394x(str, zg3Var);
    }

    @Override // com.daaw.a74
    /* renamed from: x0 */
    public final boolean mo6393x0(boolean z, int i) {
        if (this.f25961r.compareAndSet(false, true)) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10412F0)).booleanValue()) {
                return false;
            }
            if (this.f25959p.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f25959p.getParent()).removeView((View) this.f25959p);
            }
            this.f25959p.mo6393x0(z, i);
            return true;
        }
        return true;
    }

    @Override // com.daaw.a74
    /* renamed from: y */
    public final void mo6392y(String str, zg3 zg3Var) {
        this.f25959p.mo6392y(str, zg3Var);
    }

    @Override // com.daaw.a74
    /* renamed from: z */
    public final void mo6391z() {
        this.f25960q.m15566d();
        this.f25959p.mo6391z();
    }

    @Override // com.daaw.y24
    public final void zzB(boolean z) {
        this.f25959p.zzB(false);
    }

    @Override // com.daaw.a74
    public final ec3 zzM() {
        return this.f25959p.zzM();
    }

    @Override // com.daaw.a74
    public final zzl zzN() {
        return this.f25959p.zzN();
    }

    @Override // com.daaw.a74
    public final zzl zzO() {
        return this.f25959p.zzO();
    }

    @Override // com.daaw.a74
    public final t84 zzP() {
        return ((w74) this.f25959p).m6458E0();
    }

    @Override // com.daaw.a74
    public final void zzX() {
        this.f25959p.zzX();
    }

    @Override // com.daaw.a74
    public final void zzZ() {
        this.f25959p.zzZ();
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void zza(String str) {
        ((w74) this.f25959p).m6452J0(str);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        this.f25959p.zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        this.f25959p.zzbo();
    }

    @Override // com.daaw.y24
    public final int zzf() {
        return this.f25959p.zzf();
    }

    @Override // com.daaw.y24
    public final int zzg() {
        return this.f25959p.zzg();
    }

    @Override // com.daaw.y24
    public final int zzh() {
        return this.f25959p.zzh();
    }

    @Override // com.daaw.y24
    public final int zzi() {
        return ((Boolean) zzba.zzc().m23658b(g93.f10790p3)).booleanValue() ? this.f25959p.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.daaw.y24
    public final int zzj() {
        return ((Boolean) zzba.zzc().m23658b(g93.f10790p3)).booleanValue() ? this.f25959p.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.daaw.a74, com.daaw.e84, com.daaw.y24
    public final Activity zzk() {
        return this.f25959p.zzk();
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final zza zzm() {
        return this.f25959p.zzm();
    }

    @Override // com.daaw.y24
    public final s93 zzn() {
        return this.f25959p.zzn();
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final t93 zzo() {
        return this.f25959p.zzo();
    }

    @Override // com.daaw.a74, com.daaw.m84, com.daaw.y24
    public final zzchu zzp() {
        return this.f25959p.zzp();
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        a74 a74Var = this.f25959p;
        if (a74Var != null) {
            a74Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        a74 a74Var = this.f25959p;
        if (a74Var != null) {
            a74Var.zzr();
        }
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final z74 zzs() {
        return this.f25959p.zzs();
    }

    @Override // com.daaw.y24
    public final String zzt() {
        return this.f25959p.zzt();
    }
}
