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
    public final a74 c;
    public final Context d;
    public final WindowManager e;
    public final m83 f;
    public DisplayMetrics g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public gq3(a74 a74Var, Context context, m83 m83Var) {
        super(a74Var, "");
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.c = a74Var;
        this.d = context;
        this.f = m83Var;
        this.e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.daaw.zg3
    public final /* synthetic */ void a(Object obj, Map map) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        a74 a74Var = (a74) obj;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        zzay.zzb();
        DisplayMetrics displayMetrics = this.g;
        this.i = d04.B(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = d04.B(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk = this.c.zzk();
        if (zzk == null || zzk.getWindow() == null) {
            this.l = this.i;
            i = this.j;
        } else {
            zzt.zzp();
            int[] zzN = zzs.zzN(zzk);
            zzay.zzb();
            this.l = d04.B(this.g, zzN[0]);
            zzay.zzb();
            i = d04.B(this.g, zzN[1]);
        }
        this.m = i;
        if (this.c.o().i()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.c.measure(0, 0);
        }
        e(this.i, this.j, this.l, this.m, this.h, this.k);
        fq3 fq3Var = new fq3();
        m83 m83Var = this.f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        fq3Var.e(m83Var.a(intent));
        m83 m83Var2 = this.f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        fq3Var.c(m83Var2.a(intent2));
        fq3Var.a(this.f.b());
        fq3Var.d(this.f.c());
        fq3Var.b(true);
        z = fq3Var.a;
        z2 = fq3Var.b;
        z3 = fq3Var.c;
        z4 = fq3Var.d;
        z5 = fq3Var.e;
        a74 a74Var2 = this.c;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            k04.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        a74Var2.l("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        h(zzay.zzb().g(this.d, iArr[0]), zzay.zzb().g(this.d, iArr[1]));
        if (k04.zzm(2)) {
            k04.zzi("Dispatching Ready Event.");
        }
        d(this.c.zzp().p);
    }

    public final void h(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.d instanceof Activity) {
            zzt.zzp();
            i3 = zzs.zzO((Activity) this.d)[0];
        } else {
            i3 = 0;
        }
        if (this.c.o() == null || !this.c.o().i()) {
            int width = this.c.getWidth();
            int height = this.c.getHeight();
            if (((Boolean) zzba.zzc().b(g93.P)).booleanValue()) {
                if (width == 0) {
                    width = this.c.o() != null ? this.c.o().c : 0;
                }
                if (height == 0) {
                    if (this.c.o() != null) {
                        i4 = this.c.o().b;
                    }
                    this.n = zzay.zzb().g(this.d, width);
                    this.o = zzay.zzb().g(this.d, i4);
                }
            }
            i4 = height;
            this.n = zzay.zzb().g(this.d, width);
            this.o = zzay.zzb().g(this.d, i4);
        }
        b(i, i2 - i3, this.n, this.o);
        this.c.zzP().z0(i, i2);
    }
}
