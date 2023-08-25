package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class ko6 implements io6 {
    public final Context a;
    public final int o;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int p = 2;
    public int q = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public boolean m = false;
    public boolean n = false;

    public ko6(Context context, int i) {
        this.a = context;
        this.o = i;
    }

    public final synchronized ko6 A(boolean z) {
        this.d = z;
        return this;
    }

    public final synchronized ko6 B(Throwable th) {
        if (((Boolean) zzba.zzc().b(g93.T7)).booleanValue()) {
            this.k = et3.f(th);
            this.j = (String) fz6.c(by6.b('\n')).d(et3.e(th)).iterator().next();
        }
        return this;
    }

    public final synchronized ko6 C() {
        Configuration configuration;
        this.e = zzt.zzq().zzm(this.a);
        Resources resources = this.a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.q = i;
        this.b = zzt.zzB().b();
        this.n = true;
        return this;
    }

    public final synchronized ko6 D() {
        this.c = zzt.zzB().b();
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 a(String str) {
        z(str);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 b(zze zzeVar) {
        v(zzeVar);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 c(int i) {
        o(i);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 d(ei6 ei6Var) {
        w(ei6Var);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 e(Throwable th) {
        B(th);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 l(String str) {
        y(str);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 m(String str) {
        x(str);
        return this;
    }

    public final synchronized ko6 o(int i) {
        this.p = i;
        return this;
    }

    public final synchronized ko6 v(zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        eq4 eq4Var = (eq4) iBinder;
        String zzk = eq4Var.zzk();
        if (!TextUtils.isEmpty(zzk)) {
            this.f = zzk;
        }
        String zzi = eq4Var.zzi();
        if (!TextUtils.isEmpty(zzi)) {
            this.g = zzi;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x002b, code lost:
        r2.g = r0.c0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.daaw.ko6 w(com.daaw.ei6 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.daaw.wh6 r0 = r3.b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.daaw.wh6 r0 = r3.b     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L31
            r2.f = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.daaw.th6 r0 = (com.daaw.th6) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.c0     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.c0     // Catch: java.lang.Throwable -> L31
            r2.g = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            goto L35
        L34:
            throw r3
        L35:
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ko6.w(com.daaw.ei6):com.daaw.ko6");
    }

    public final synchronized ko6 x(String str) {
        if (((Boolean) zzba.zzc().b(g93.T7)).booleanValue()) {
            this.l = str;
        }
        return this;
    }

    public final synchronized ko6 y(String str) {
        this.h = str;
        return this;
    }

    public final synchronized ko6 z(String str) {
        this.i = str;
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 zzf(boolean z) {
        A(z);
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 zzh() {
        C();
        return this;
    }

    @Override // com.daaw.io6
    public final /* bridge */ /* synthetic */ io6 zzi() {
        D();
        return this;
    }

    @Override // com.daaw.io6
    public final synchronized boolean zzj() {
        return this.n;
    }

    @Override // com.daaw.io6
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // com.daaw.io6
    public final synchronized mo6 zzl() {
        if (this.m) {
            return null;
        }
        this.m = true;
        if (!this.n) {
            C();
        }
        if (this.c < 0) {
            D();
        }
        return new mo6(this, null);
    }
}
