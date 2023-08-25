package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.daaw.cf8;
import com.daaw.cq8;
import com.daaw.d04;
import com.daaw.fa3;
import com.daaw.iv3;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.oa3;
import com.daaw.oh8;
import com.daaw.os3;
import com.daaw.qr3;
import com.daaw.ro8;
import com.daaw.ry0;
import com.daaw.s23;
import com.daaw.sl2;
import com.daaw.tl2;
import com.daaw.yd0;
import com.daaw.yj8;
import com.daaw.z04;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzs extends zzbt {
    public final zzchu p;
    public final zzq q;
    public final Future r = z04.a.M(new yj8(this));
    public final Context s;
    public final cq8 t;
    public WebView u;
    public zzbh v;
    public sl2 w;
    public AsyncTask x;

    public zzs(Context context, zzq zzqVar, String str, zzchu zzchuVar) {
        this.s = context;
        this.p = zzchuVar;
        this.q = zzqVar;
        this.u = new WebView(context);
        this.t = new cq8(context, str);
        g3(0);
        this.u.setVerticalScrollBarEnabled(false);
        this.u.getSettings().setJavaScriptEnabled(true);
        this.u.setWebViewClient(new cf8(this));
        this.u.setOnTouchListener(new oh8(this));
    }

    public static /* bridge */ /* synthetic */ String m3(zzs zzsVar, String str) {
        if (zzsVar.w == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzsVar.w.a(parse, zzsVar.s, null, null);
        } catch (tl2 e) {
            k04.zzk("Unable to process ad data", e);
        }
        return parse.toString();
    }

    public static /* bridge */ /* synthetic */ void p3(zzs zzsVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.s.startActivity(intent);
    }

    public final void g3(int i) {
        if (this.u == null) {
            return;
        }
        this.u.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        ry0.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        this.v = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(s23 s23Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(qr3 qr3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(fa3 fa3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(os3 os3Var, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(iv3 iv3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(yd0 yd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        ry0.k(this.u, "This Search Ad has already been torn down");
        this.t.f(zzlVar, this.p);
        this.x = new ro8(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) {
        throw new IllegalStateException("Unused method");
    }

    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzay.zzb();
            return d04.D(this.s, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return this.q;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final yd0 zzn() {
        ry0.e("getAdFrame must be called on the main UI thread.");
        return nt0.g3(this.u);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) oa3.d.e());
        builder.appendQueryParameter("query", this.t.d());
        builder.appendQueryParameter("pubId", this.t.c());
        builder.appendQueryParameter("mappver", this.t.a());
        Map e = this.t.e();
        for (String str : e.keySet()) {
            builder.appendQueryParameter(str, (String) e.get(str));
        }
        Uri build = builder.build();
        sl2 sl2Var = this.w;
        if (sl2Var != null) {
            try {
                build = sl2Var.b(build, this.s);
            } catch (tl2 e2) {
                k04.zzk("Unable to process ad data", e2);
            }
        }
        String zzq = zzq();
        String encodedQuery = build.getEncodedQuery();
        return zzq + "#" + encodedQuery;
    }

    public final String zzq() {
        String b = this.t.b();
        if (true == TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        return "https://" + b + ((String) oa3.d.e());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        ry0.e("destroy must be called on the main UI thread.");
        this.x.cancel(true);
        this.r.cancel(true);
        this.u.destroy();
        this.u = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        ry0.e("pause must be called on the main UI thread.");
    }
}
