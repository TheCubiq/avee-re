package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class qz3 {

    /* renamed from: a */
    public final Object f24659a = new Object();

    /* renamed from: b */
    public final zzj f24660b;

    /* renamed from: c */
    public final xz3 f24661c;

    /* renamed from: d */
    public boolean f24662d;

    /* renamed from: e */
    public Context f24663e;

    /* renamed from: f */
    public zzchu f24664f;

    /* renamed from: g */
    public String f24665g;

    /* renamed from: h */
    public l93 f24666h;

    /* renamed from: i */
    public Boolean f24667i;

    /* renamed from: j */
    public final AtomicInteger f24668j;

    /* renamed from: k */
    public final pz3 f24669k;

    /* renamed from: l */
    public final Object f24670l;

    /* renamed from: m */
    public f77 f24671m;

    /* renamed from: n */
    public final AtomicBoolean f24672n;

    public qz3() {
        zzj zzjVar = new zzj();
        this.f24660b = zzjVar;
        this.f24661c = new xz3(zzay.zzd(), zzjVar);
        this.f24662d = false;
        this.f24666h = null;
        this.f24667i = null;
        this.f24668j = new AtomicInteger(0);
        this.f24669k = new pz3(null);
        this.f24670l = new Object();
        this.f24672n = new AtomicBoolean();
    }

    /* renamed from: a */
    public final int m11922a() {
        return this.f24668j.get();
    }

    /* renamed from: c */
    public final Context m11920c() {
        return this.f24663e;
    }

    /* renamed from: d */
    public final Resources m11919d() {
        if (this.f24664f.f36996s) {
            return this.f24663e.getResources();
        }
        try {
            if (((Boolean) zzba.zzc().m23658b(g93.f10610Y8)).booleanValue()) {
                return o04.m14657a(this.f24663e).getResources();
            }
            o04.m14657a(this.f24663e).getResources();
            return null;
        } catch (n04 e) {
            k04.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: f */
    public final l93 m11917f() {
        l93 l93Var;
        synchronized (this.f24659a) {
            l93Var = this.f24666h;
        }
        return l93Var;
    }

    /* renamed from: g */
    public final xz3 m11916g() {
        return this.f24661c;
    }

    /* renamed from: h */
    public final zzg m11915h() {
        zzj zzjVar;
        synchronized (this.f24659a) {
            zzjVar = this.f24660b;
        }
        return zzjVar;
    }

    /* renamed from: j */
    public final f77 m11913j() {
        if (this.f24663e != null) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10778o2)).booleanValue()) {
                synchronized (this.f24670l) {
                    f77 f77Var = this.f24671m;
                    if (f77Var != null) {
                        return f77Var;
                    }
                    f77 mo20112M = z04.f34305a.mo20112M(new Callable() { // from class: com.daaw.lz3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return qz3.this.m11909n();
                        }
                    });
                    this.f24671m = mo20112M;
                    return mo20112M;
                }
            }
        }
        return s67.m10634i(new ArrayList());
    }

    /* renamed from: k */
    public final Boolean m11912k() {
        Boolean bool;
        synchronized (this.f24659a) {
            bool = this.f24667i;
        }
        return bool;
    }

    /* renamed from: m */
    public final String m11910m() {
        return this.f24665g;
    }

    /* renamed from: n */
    public final /* synthetic */ ArrayList m11909n() {
        Context m26956a = av3.m26956a(this.f24663e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo m19341f = ez1.m22979a(m26956a).m19341f(m26956a.getApplicationInfo().packageName, 4096);
            if (m19341f.requestedPermissions != null && m19341f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = m19341f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((m19341f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: p */
    public final void m11907p() {
        this.f24669k.m12832a();
    }

    /* renamed from: q */
    public final void m11906q() {
        this.f24668j.decrementAndGet();
    }

    /* renamed from: r */
    public final void m11905r() {
        this.f24668j.incrementAndGet();
    }

    @TargetApi(23)
    /* renamed from: s */
    public final void m11904s(Context context, zzchu zzchuVar) {
        l93 l93Var;
        synchronized (this.f24659a) {
            if (!this.f24662d) {
                this.f24663e = context.getApplicationContext();
                this.f24664f = zzchuVar;
                zzt.zzb().m15598c(this.f24661c);
                this.f24660b.zzr(this.f24663e);
                et3.m23192d(this.f24663e, this.f24664f);
                zzt.zze();
                if (((Boolean) ua3.f28852c.m16137e()).booleanValue()) {
                    l93Var = new l93();
                } else {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    l93Var = null;
                }
                this.f24666h = l93Var;
                if (l93Var != null) {
                    c14.m25685a(new mz3(this).zzb(), "AppState.registerCsiReporter");
                }
                if (vw0.m6696i()) {
                    if (((Boolean) zzba.zzc().m23658b(g93.f10399D7)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new nz3(this));
                    }
                }
                this.f24662d = true;
                m11913j();
            }
        }
        zzt.zzp().zzc(context, zzchuVar.f36993p);
    }

    /* renamed from: t */
    public final void m11903t(Throwable th, String str) {
        et3.m23192d(this.f24663e, this.f24664f).mo21235b(th, str, ((Double) nb3.f19787g.m16137e()).floatValue());
    }

    /* renamed from: u */
    public final void m11902u(Throwable th, String str) {
        et3.m23192d(this.f24663e, this.f24664f).mo21236a(th, str);
    }

    /* renamed from: v */
    public final void m11901v(Boolean bool) {
        synchronized (this.f24659a) {
            this.f24667i = bool;
        }
    }

    /* renamed from: w */
    public final void m11900w(String str) {
        this.f24665g = str;
    }

    /* renamed from: x */
    public final boolean m11899x(Context context) {
        if (vw0.m6696i()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10399D7)).booleanValue()) {
                return this.f24672n.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
