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
    public final a74 p;
    public final n24 q;
    public final AtomicBoolean r;

    public s74(a74 a74Var) {
        super(a74Var.getContext());
        this.r = new AtomicBoolean();
        this.p = a74Var;
        this.q = new n24(a74Var.j(), this, this);
        addView((View) a74Var);
    }

    @Override // com.daaw.y24
    public final void A(int i) {
        this.p.A(i);
    }

    @Override // com.daaw.i84
    public final void A0(boolean z, int i, String str, String str2, boolean z2) {
        this.p.A0(z, i, str, str2, z2);
    }

    @Override // com.daaw.a74
    public final void B(zzl zzlVar) {
        this.p.B(zzlVar);
    }

    @Override // com.daaw.a74
    public final void C() {
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
    public final void C0(String str, JSONObject jSONObject) {
        ((w74) this.p).c(str, jSONObject.toString());
    }

    @Override // com.daaw.a74
    public final void D(boolean z) {
        this.p.D(z);
    }

    @Override // com.daaw.y24
    public final void F(int i) {
        this.q.f(i);
    }

    @Override // com.daaw.y24
    public final j54 H(String str) {
        return this.p.H(str);
    }

    @Override // com.daaw.a74
    public final void I(ec3 ec3Var) {
        this.p.I(ec3Var);
    }

    @Override // com.daaw.a74
    public final void K(int i) {
        this.p.K(i);
    }

    @Override // com.daaw.a74
    public final boolean L() {
        return this.p.L();
    }

    @Override // com.daaw.y24
    public final void M(int i) {
        this.p.M(i);
    }

    @Override // com.daaw.a74
    public final void N() {
        this.p.N();
    }

    @Override // com.daaw.a74
    public final String O() {
        return this.p.O();
    }

    @Override // com.daaw.a74
    public final void P(th6 th6Var, wh6 wh6Var) {
        this.p.P(th6Var, wh6Var);
    }

    @Override // com.daaw.a74
    public final void Q(v84 v84Var) {
        this.p.Q(v84Var);
    }

    @Override // com.daaw.a74
    public final void R(yd0 yd0Var) {
        this.p.R(yd0Var);
    }

    @Override // com.daaw.i84
    public final void S(boolean z, int i, String str, boolean z2) {
        this.p.S(z, i, str, z2);
    }

    @Override // com.daaw.uj3
    public final void T(String str, Map map) {
        this.p.T(str, map);
    }

    @Override // com.daaw.a74
    public final void U(boolean z) {
        this.p.U(z);
    }

    @Override // com.daaw.a74
    public final boolean V() {
        return this.r.get();
    }

    @Override // com.daaw.y24
    public final void W(int i) {
        this.p.W(i);
    }

    @Override // com.daaw.a74
    public final void X(boolean z) {
        this.p.X(z);
    }

    @Override // com.daaw.a74
    public final void Y() {
        setBackgroundColor(0);
        this.p.setBackgroundColor(0);
    }

    @Override // com.daaw.a74, com.daaw.l84
    public final sl2 a() {
        return this.p.a();
    }

    @Override // com.daaw.a74
    public final void a0(zzl zzlVar) {
        this.p.a0(zzlVar);
    }

    @Override // com.daaw.y24
    public final String b() {
        return this.p.b();
    }

    @Override // com.daaw.a74
    public final void b0(String str, String str2, String str3) {
        this.p.b0(str, str2, null);
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void c(String str, String str2) {
        this.p.c("window.inspectorInfo", str2);
    }

    @Override // com.daaw.a74
    public final void c0(String str, uy0 uy0Var) {
        this.p.c0(str, uy0Var);
    }

    @Override // com.daaw.a74
    public final boolean canGoBack() {
        return this.p.canGoBack();
    }

    @Override // com.daaw.a74, com.daaw.r64
    public final th6 d() {
        return this.p.d();
    }

    @Override // com.daaw.a74
    public final void destroy() {
        final yd0 j0 = j0();
        if (j0 == null) {
            this.p.destroy();
            return;
        }
        gv6 gv6Var = zzs.zza;
        gv6Var.post(new Runnable() { // from class: com.daaw.q74
            @Override // java.lang.Runnable
            public final void run() {
                yd0 yd0Var = yd0.this;
                zzt.zzA();
                if (((Boolean) zzba.zzc().b(g93.y4)).booleanValue() && rp6.b()) {
                    Object M = nt0.M(yd0Var);
                    if (M instanceof tp6) {
                        ((tp6) M).c();
                    }
                }
            }
        });
        final a74 a74Var = this.p;
        a74Var.getClass();
        gv6Var.postDelayed(new Runnable() { // from class: com.daaw.r74
            @Override // java.lang.Runnable
            public final void run() {
                a74.this.destroy();
            }
        }, ((Integer) zzba.zzc().b(g93.z4)).intValue());
    }

    @Override // com.daaw.y24
    public final void e() {
        this.p.e();
    }

    @Override // com.daaw.q03
    public final void e0(p03 p03Var) {
        this.p.e0(p03Var);
    }

    @Override // com.daaw.a74
    public final void f0() {
        this.p.f0();
    }

    @Override // com.daaw.a74, com.daaw.n84
    public final View g() {
        return this;
    }

    @Override // com.daaw.a74
    public final void g0(boolean z) {
        this.p.g0(z);
    }

    @Override // com.daaw.a74
    public final void goBack() {
        this.p.goBack();
    }

    @Override // com.daaw.a74
    public final WebView h() {
        return (WebView) this.p;
    }

    @Override // com.daaw.i84
    public final void h0(zzbr zzbrVar, cq5 cq5Var, kd5 kd5Var, on6 on6Var, String str, String str2, int i) {
        this.p.h0(zzbrVar, cq5Var, kd5Var, on6Var, str, str2, 14);
    }

    @Override // com.daaw.a74
    public final boolean i() {
        return this.p.i();
    }

    @Override // com.daaw.i84
    public final void i0(zzc zzcVar, boolean z) {
        this.p.i0(zzcVar, z);
    }

    @Override // com.daaw.a74
    public final Context j() {
        return this.p.j();
    }

    @Override // com.daaw.a74
    public final yd0 j0() {
        return this.p.j0();
    }

    @Override // com.daaw.y24
    public final void k() {
        this.p.k();
    }

    @Override // com.daaw.uj3, com.daaw.wj3
    public final void l(String str, JSONObject jSONObject) {
        this.p.l(str, jSONObject);
    }

    @Override // com.daaw.y24
    public final n24 l0() {
        return this.q;
    }

    @Override // com.daaw.a74
    public final void loadData(String str, String str2, String str3) {
        this.p.loadData(str, "text/html", str3);
    }

    @Override // com.daaw.a74
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.p.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.daaw.a74
    public final void loadUrl(String str) {
        this.p.loadUrl(str);
    }

    @Override // com.daaw.y24
    public final void m0(boolean z, long j) {
        this.p.m0(z, j);
    }

    @Override // com.daaw.a74
    public final WebViewClient n() {
        return this.p.n();
    }

    @Override // com.daaw.i84
    public final void n0(boolean z, int i, boolean z2) {
        this.p.n0(z, i, z2);
    }

    @Override // com.daaw.a74, com.daaw.k84
    public final v84 o() {
        return this.p.o();
    }

    @Override // com.daaw.a74
    public final boolean o0() {
        return this.p.o0();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        a74 a74Var = this.p;
        if (a74Var != null) {
            a74Var.onAdClicked();
        }
    }

    @Override // com.daaw.a74
    public final void onPause() {
        this.q.e();
        this.p.onPause();
    }

    @Override // com.daaw.a74
    public final void onResume() {
        this.p.onResume();
    }

    @Override // com.daaw.a74
    public final j23 p() {
        return this.p.p();
    }

    @Override // com.daaw.a74
    public final void p0(int i) {
        this.p.p0(i);
    }

    @Override // com.daaw.a74
    public final boolean q() {
        return this.p.q();
    }

    @Override // com.daaw.a74
    public final void q0(cc3 cc3Var) {
        this.p.q0(cc3Var);
    }

    @Override // com.daaw.a74
    public final boolean r() {
        return this.p.r();
    }

    @Override // com.daaw.a74
    public final f77 r0() {
        return this.p.r0();
    }

    @Override // com.daaw.a74
    public final void s0(Context context) {
        this.p.s0(context);
    }

    @Override // android.view.View, com.daaw.a74
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.p.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.daaw.a74
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.p.setOnTouchListener(onTouchListener);
    }

    @Override // com.daaw.a74
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.p.setWebChromeClient(webChromeClient);
    }

    @Override // com.daaw.a74
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.p.setWebViewClient(webViewClient);
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final void t(String str, j54 j54Var) {
        this.p.t(str, j54Var);
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final void u(z74 z74Var) {
        this.p.u(z74Var);
    }

    @Override // com.daaw.a74
    public final void u0(j23 j23Var) {
        this.p.u0(j23Var);
    }

    @Override // com.daaw.a74, com.daaw.a84
    public final wh6 v() {
        return this.p.v();
    }

    @Override // com.daaw.a74
    public final void v0() {
        a74 a74Var = this.p;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(zzt.zzr().zza()));
        w74 w74Var = (w74) a74Var;
        hashMap.put("device_volume", String.valueOf(zzab.zzb(w74Var.getContext())));
        w74Var.T("volume", hashMap);
    }

    @Override // com.daaw.a74
    public final void w(boolean z) {
        this.p.w(z);
    }

    @Override // com.daaw.a74
    public final void w0(boolean z) {
        this.p.w0(z);
    }

    @Override // com.daaw.a74
    public final void x(String str, zg3 zg3Var) {
        this.p.x(str, zg3Var);
    }

    @Override // com.daaw.a74
    public final boolean x0(boolean z, int i) {
        if (this.r.compareAndSet(false, true)) {
            if (((Boolean) zzba.zzc().b(g93.F0)).booleanValue()) {
                return false;
            }
            if (this.p.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.p.getParent()).removeView((View) this.p);
            }
            this.p.x0(z, i);
            return true;
        }
        return true;
    }

    @Override // com.daaw.a74
    public final void y(String str, zg3 zg3Var) {
        this.p.y(str, zg3Var);
    }

    @Override // com.daaw.a74
    public final void z() {
        this.q.d();
        this.p.z();
    }

    @Override // com.daaw.y24
    public final void zzB(boolean z) {
        this.p.zzB(false);
    }

    @Override // com.daaw.a74
    public final ec3 zzM() {
        return this.p.zzM();
    }

    @Override // com.daaw.a74
    public final zzl zzN() {
        return this.p.zzN();
    }

    @Override // com.daaw.a74
    public final zzl zzO() {
        return this.p.zzO();
    }

    @Override // com.daaw.a74
    public final t84 zzP() {
        return ((w74) this.p).E0();
    }

    @Override // com.daaw.a74
    public final void zzX() {
        this.p.zzX();
    }

    @Override // com.daaw.a74
    public final void zzZ() {
        this.p.zzZ();
    }

    @Override // com.daaw.kk3, com.daaw.wj3
    public final void zza(String str) {
        ((w74) this.p).J0(str);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        this.p.zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        this.p.zzbo();
    }

    @Override // com.daaw.y24
    public final int zzf() {
        return this.p.zzf();
    }

    @Override // com.daaw.y24
    public final int zzg() {
        return this.p.zzg();
    }

    @Override // com.daaw.y24
    public final int zzh() {
        return this.p.zzh();
    }

    @Override // com.daaw.y24
    public final int zzi() {
        return ((Boolean) zzba.zzc().b(g93.p3)).booleanValue() ? this.p.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.daaw.y24
    public final int zzj() {
        return ((Boolean) zzba.zzc().b(g93.p3)).booleanValue() ? this.p.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.daaw.a74, com.daaw.e84, com.daaw.y24
    public final Activity zzk() {
        return this.p.zzk();
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final zza zzm() {
        return this.p.zzm();
    }

    @Override // com.daaw.y24
    public final s93 zzn() {
        return this.p.zzn();
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final t93 zzo() {
        return this.p.zzo();
    }

    @Override // com.daaw.a74, com.daaw.m84, com.daaw.y24
    public final zzchu zzp() {
        return this.p.zzp();
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        a74 a74Var = this.p;
        if (a74Var != null) {
            a74Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        a74 a74Var = this.p;
        if (a74Var != null) {
            a74Var.zzr();
        }
    }

    @Override // com.daaw.a74, com.daaw.y24
    public final z74 zzs() {
        return this.p.zzs();
    }

    @Override // com.daaw.y24
    public final String zzt() {
        return this.p.zzt();
    }
}
