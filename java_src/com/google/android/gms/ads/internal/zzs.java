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

    /* renamed from: p */
    public final zzchu f36366p;

    /* renamed from: q */
    public final zzq f36367q;

    /* renamed from: r */
    public final Future f36368r = z04.f34305a.mo20112M(new yj8(this));

    /* renamed from: s */
    public final Context f36369s;

    /* renamed from: t */
    public final cq8 f36370t;

    /* renamed from: u */
    public WebView f36371u;

    /* renamed from: v */
    public zzbh f36372v;

    /* renamed from: w */
    public sl2 f36373w;

    /* renamed from: x */
    public AsyncTask f36374x;

    public zzs(Context context, zzq zzqVar, String str, zzchu zzchuVar) {
        this.f36369s = context;
        this.f36366p = zzchuVar;
        this.f36367q = zzqVar;
        this.f36371u = new WebView(context);
        this.f36370t = new cq8(context, str);
        m1310g3(0);
        this.f36371u.setVerticalScrollBarEnabled(false);
        this.f36371u.getSettings().setJavaScriptEnabled(true);
        this.f36371u.setWebViewClient(new cf8(this));
        this.f36371u.setOnTouchListener(new oh8(this));
    }

    /* renamed from: m3 */
    public static /* bridge */ /* synthetic */ String m1304m3(zzs zzsVar, String str) {
        if (zzsVar.f36373w == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzsVar.f36373w.m10204a(parse, zzsVar.f36369s, null, null);
        } catch (tl2 e) {
            k04.zzk("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* renamed from: p3 */
    public static /* bridge */ /* synthetic */ void m1301p3(zzs zzsVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.f36369s.startActivity(intent);
    }

    /* renamed from: g3 */
    public final void m1310g3(int i) {
        if (this.f36371u == null) {
            return;
        }
        this.f36371u.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        ry0.m10835e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        this.f36372v = zzbhVar;
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
        ry0.m10829k(this.f36371u, "This Search Ad has already been torn down");
        this.f36370t.m25107f(zzlVar, this.f36366p);
        this.f36374x = new ro8(this, null).execute(new Void[0]);
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
            return d04.m24833D(this.f36369s, Integer.parseInt(queryParameter));
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
        return this.f36367q;
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
        ry0.m10835e("getAdFrame must be called on the main UI thread.");
        return nt0.m14830g3(this.f36371u);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) oa3.f21197d.m16137e());
        builder.appendQueryParameter("query", this.f36370t.m25109d());
        builder.appendQueryParameter("pubId", this.f36370t.m25110c());
        builder.appendQueryParameter("mappver", this.f36370t.m25112a());
        Map m25108e = this.f36370t.m25108e();
        for (String str : m25108e.keySet()) {
            builder.appendQueryParameter(str, (String) m25108e.get(str));
        }
        Uri build = builder.build();
        sl2 sl2Var = this.f36373w;
        if (sl2Var != null) {
            try {
                build = sl2Var.m10203b(build, this.f36369s);
            } catch (tl2 e) {
                k04.zzk("Unable to process ad data", e);
            }
        }
        String zzq = zzq();
        String encodedQuery = build.getEncodedQuery();
        return zzq + "#" + encodedQuery;
    }

    public final String zzq() {
        String m25111b = this.f36370t.m25111b();
        if (true == TextUtils.isEmpty(m25111b)) {
            m25111b = "www.google.com";
        }
        return "https://" + m25111b + ((String) oa3.f21197d.m16137e());
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
        ry0.m10835e("destroy must be called on the main UI thread.");
        this.f36374x.cancel(true);
        this.f36368r.cancel(true);
        this.f36371u.destroy();
        this.f36371u = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        ry0.m10835e("pause must be called on the main UI thread.");
    }
}
