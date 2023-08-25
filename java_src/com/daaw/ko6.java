package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class ko6 implements io6 {

    /* renamed from: a */
    public final Context f16585a;

    /* renamed from: o */
    public final int f16599o;

    /* renamed from: b */
    public long f16586b = 0;

    /* renamed from: c */
    public long f16587c = -1;

    /* renamed from: d */
    public boolean f16588d = false;

    /* renamed from: p */
    public int f16600p = 2;

    /* renamed from: q */
    public int f16601q = 2;

    /* renamed from: e */
    public int f16589e = 0;

    /* renamed from: f */
    public String f16590f = "";

    /* renamed from: g */
    public String f16591g = "";

    /* renamed from: h */
    public String f16592h = "";

    /* renamed from: i */
    public String f16593i = "";

    /* renamed from: j */
    public String f16594j = "";

    /* renamed from: k */
    public String f16595k = "";

    /* renamed from: l */
    public String f16596l = "";

    /* renamed from: m */
    public boolean f16597m = false;

    /* renamed from: n */
    public boolean f16598n = false;

    public ko6(Context context, int i) {
        this.f16585a = context;
        this.f16599o = i;
    }

    /* renamed from: A */
    public final synchronized ko6 m17599A(boolean z) {
        this.f16588d = z;
        return this;
    }

    /* renamed from: B */
    public final synchronized ko6 m17598B(Throwable th) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10559T7)).booleanValue()) {
            this.f16595k = et3.m23190f(th);
            this.f16594j = (String) fz6.m22122c(by6.m25734b('\n')).m22121d(et3.m23191e(th)).iterator().next();
        }
        return this;
    }

    /* renamed from: C */
    public final synchronized ko6 m17597C() {
        Configuration configuration;
        this.f16589e = zzt.zzq().zzm(this.f16585a);
        Resources resources = this.f16585a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f16601q = i;
        this.f16586b = zzt.zzB().mo15859b();
        this.f16598n = true;
        return this;
    }

    /* renamed from: D */
    public final synchronized ko6 m17596D() {
        this.f16587c = zzt.zzB().mo15859b();
        return this;
    }

    @Override // com.daaw.io6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ io6 mo17594a(String str) {
        m17569z(str);
        return this;
    }

    @Override // com.daaw.io6
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ io6 mo17593b(zze zzeVar) {
        m17573v(zzeVar);
        return this;
    }

    @Override // com.daaw.io6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ io6 mo17592c(int i) {
        m17580o(i);
        return this;
    }

    @Override // com.daaw.io6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ io6 mo17591d(ei6 ei6Var) {
        m17572w(ei6Var);
        return this;
    }

    @Override // com.daaw.io6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ io6 mo17590e(Throwable th) {
        m17598B(th);
        return this;
    }

    @Override // com.daaw.io6
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ io6 mo17583l(String str) {
        m17570y(str);
        return this;
    }

    @Override // com.daaw.io6
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ io6 mo17582m(String str) {
        m17571x(str);
        return this;
    }

    /* renamed from: o */
    public final synchronized ko6 m17580o(int i) {
        this.f16600p = i;
        return this;
    }

    /* renamed from: v */
    public final synchronized ko6 m17573v(zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        eq4 eq4Var = (eq4) iBinder;
        String zzk = eq4Var.zzk();
        if (!TextUtils.isEmpty(zzk)) {
            this.f16590f = zzk;
        }
        String zzi = eq4Var.zzi();
        if (!TextUtils.isEmpty(zzi)) {
            this.f16591g = zzi;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x002b, code lost:
        r2.f16591g = r0.f27685c0;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ko6 m17572w(ei6 ei6Var) {
        if (!TextUtils.isEmpty(ei6Var.f8508b.f31252b)) {
            this.f16590f = ei6Var.f8508b.f31252b;
        }
        Iterator it = ei6Var.f8507a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            th6 th6Var = (th6) it.next();
            if (!TextUtils.isEmpty(th6Var.f27685c0)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: x */
    public final synchronized ko6 m17571x(String str) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10559T7)).booleanValue()) {
            this.f16596l = str;
        }
        return this;
    }

    /* renamed from: y */
    public final synchronized ko6 m17570y(String str) {
        this.f16592h = str;
        return this;
    }

    /* renamed from: z */
    public final synchronized ko6 m17569z(String str) {
        this.f16593i = str;
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 zzf(boolean z) {
        m17599A(z);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 zzh() {
        m17597C();
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 zzi() {
        m17596D();
        return this;
    }

    @Override // com.daaw.io6
    public final synchronized boolean zzj() {
        return this.f16598n;
    }

    @Override // com.daaw.io6
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.f16592h);
    }

    @Override // com.daaw.io6
    public final synchronized mo6 zzl() {
        if (this.f16597m) {
            return null;
        }
        this.f16597m = true;
        if (!this.f16598n) {
            m17597C();
        }
        if (this.f16587c < 0) {
            m17596D();
        }
        return new mo6(this, null);
    }
}
