package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gq3 extends hq3 implements zg3 {

    /* renamed from: c */
    public final a74 f11570c;

    /* renamed from: d */
    public final Context f11571d;

    /* renamed from: e */
    public final WindowManager f11572e;

    /* renamed from: f */
    public final m83 f11573f;

    /* renamed from: g */
    public DisplayMetrics f11574g;

    /* renamed from: h */
    public float f11575h;

    /* renamed from: i */
    public int f11576i;

    /* renamed from: j */
    public int f11577j;

    /* renamed from: k */
    public int f11578k;

    /* renamed from: l */
    public int f11579l;

    /* renamed from: m */
    public int f11580m;

    /* renamed from: n */
    public int f11581n;

    /* renamed from: o */
    public int f11582o;

    public gq3(a74 a74Var, Context context, m83 m83Var) {
        super(a74Var, "");
        this.f11576i = -1;
        this.f11577j = -1;
        this.f11579l = -1;
        this.f11580m = -1;
        this.f11581n = -1;
        this.f11582o = -1;
        this.f11570c = a74Var;
        this.f11571d = context;
        this.f11573f = m83Var;
        this.f11572e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* synthetic */ void mo2341a(Object obj, Map map) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        a74 a74Var = (a74) obj;
        this.f11574g = new DisplayMetrics();
        Display defaultDisplay = this.f11572e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f11574g);
        this.f11575h = this.f11574g.density;
        this.f11578k = defaultDisplay.getRotation();
        zzay.zzb();
        DisplayMetrics displayMetrics = this.f11574g;
        this.f11576i = d04.m24835B(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.f11574g;
        this.f11577j = d04.m24835B(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk = this.f11570c.zzk();
        if (zzk == null || zzk.getWindow() == null) {
            this.f11579l = this.f11576i;
            i = this.f11577j;
        } else {
            zzt.zzp();
            int[] zzN = zzs.zzN(zzk);
            zzay.zzb();
            this.f11579l = d04.m24835B(this.f11574g, zzN[0]);
            zzay.zzb();
            i = d04.m24835B(this.f11574g, zzN[1]);
        }
        this.f11580m = i;
        if (this.f11570c.mo6408o().m7329i()) {
            this.f11581n = this.f11576i;
            this.f11582o = this.f11577j;
        } else {
            this.f11570c.measure(0, 0);
        }
        m20486e(this.f11576i, this.f11577j, this.f11579l, this.f11580m, this.f11575h, this.f11578k);
        fq3 fq3Var = new fq3();
        m83 m83Var = this.f11573f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        fq3Var.m22409e(m83Var.m16168a(intent));
        m83 m83Var2 = this.f11573f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        fq3Var.m22411c(m83Var2.m16168a(intent2));
        fq3Var.m22413a(this.f11573f.m16167b());
        fq3Var.m22410d(this.f11573f.m16166c());
        fq3Var.m22412b(true);
        z = fq3Var.f9785a;
        z2 = fq3Var.f9786b;
        z3 = fq3Var.f9787c;
        z4 = fq3Var.f9788d;
        z5 = fq3Var.f9789e;
        a74 a74Var2 = this.f11570c;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            k04.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        a74Var2.mo6048l("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f11570c.getLocationOnScreen(iArr);
        m21344h(zzay.zzb().m24825g(this.f11571d, iArr[0]), zzay.zzb().m24825g(this.f11571d, iArr[1]));
        if (k04.zzm(2)) {
            k04.zzi("Dispatching Ready Event.");
        }
        m20487d(this.f11570c.zzp().f36993p);
    }

    /* renamed from: h */
    public final void m21344h(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.f11571d instanceof Activity) {
            zzt.zzp();
            i3 = zzs.zzO((Activity) this.f11571d)[0];
        } else {
            i3 = 0;
        }
        if (this.f11570c.mo6408o() == null || !this.f11570c.mo6408o().m7329i()) {
            int width = this.f11570c.getWidth();
            int height = this.f11570c.getHeight();
            if (((Boolean) zzba.zzc().m23658b(g93.f10511P)).booleanValue()) {
                if (width == 0) {
                    width = this.f11570c.mo6408o() != null ? this.f11570c.mo6408o().f30028c : 0;
                }
                if (height == 0) {
                    if (this.f11570c.mo6408o() != null) {
                        i4 = this.f11570c.mo6408o().f30027b;
                    }
                    this.f11581n = zzay.zzb().m24825g(this.f11571d, width);
                    this.f11582o = zzay.zzb().m24825g(this.f11571d, i4);
                }
            }
            i4 = height;
            this.f11581n = zzay.zzb().m24825g(this.f11571d, width);
            this.f11582o = zzay.zzb().m24825g(this.f11571d, i4);
        }
        m20489b(i, i2 - i3, this.f11581n, this.f11582o);
        this.f11570c.zzP().mo9446z0(i, i2);
    }
}
