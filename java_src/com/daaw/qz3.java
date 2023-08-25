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
    public final Object a = new Object();
    public final zzj b;
    public final xz3 c;
    public boolean d;
    public Context e;
    public zzchu f;
    public String g;
    public l93 h;
    public Boolean i;
    public final AtomicInteger j;
    public final pz3 k;
    public final Object l;
    public f77 m;
    public final AtomicBoolean n;

    public qz3() {
        zzj zzjVar = new zzj();
        this.b = zzjVar;
        this.c = new xz3(zzay.zzd(), zzjVar);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = new AtomicInteger(0);
        this.k = new pz3(null);
        this.l = new Object();
        this.n = new AtomicBoolean();
    }

    public final int a() {
        return this.j.get();
    }

    public final Context c() {
        return this.e;
    }

    public final Resources d() {
        if (this.f.s) {
            return this.e.getResources();
        }
        try {
            if (((Boolean) zzba.zzc().b(g93.Y8)).booleanValue()) {
                return o04.a(this.e).getResources();
            }
            o04.a(this.e).getResources();
            return null;
        } catch (n04 e) {
            k04.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final l93 f() {
        l93 l93Var;
        synchronized (this.a) {
            l93Var = this.h;
        }
        return l93Var;
    }

    public final xz3 g() {
        return this.c;
    }

    public final zzg h() {
        zzj zzjVar;
        synchronized (this.a) {
            zzjVar = this.b;
        }
        return zzjVar;
    }

    public final f77 j() {
        if (this.e != null) {
            if (!((Boolean) zzba.zzc().b(g93.o2)).booleanValue()) {
                synchronized (this.l) {
                    f77 f77Var = this.m;
                    if (f77Var != null) {
                        return f77Var;
                    }
                    f77 M = z04.a.M(new Callable() { // from class: com.daaw.lz3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return qz3.this.n();
                        }
                    });
                    this.m = M;
                    return M;
                }
            }
        }
        return s67.i(new ArrayList());
    }

    public final Boolean k() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.i;
        }
        return bool;
    }

    public final String m() {
        return this.g;
    }

    public final /* synthetic */ ArrayList n() {
        Context a = av3.a(this.e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = ez1.a(a).f(a.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void p() {
        this.k.a();
    }

    public final void q() {
        this.j.decrementAndGet();
    }

    public final void r() {
        this.j.incrementAndGet();
    }

    @TargetApi(23)
    public final void s(Context context, zzchu zzchuVar) {
        l93 l93Var;
        synchronized (this.a) {
            if (!this.d) {
                this.e = context.getApplicationContext();
                this.f = zzchuVar;
                zzt.zzb().c(this.c);
                this.b.zzr(this.e);
                et3.d(this.e, this.f);
                zzt.zze();
                if (((Boolean) ua3.c.e()).booleanValue()) {
                    l93Var = new l93();
                } else {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    l93Var = null;
                }
                this.h = l93Var;
                if (l93Var != null) {
                    c14.a(new mz3(this).zzb(), "AppState.registerCsiReporter");
                }
                if (vw0.i()) {
                    if (((Boolean) zzba.zzc().b(g93.D7)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new nz3(this));
                    }
                }
                this.d = true;
                j();
            }
        }
        zzt.zzp().zzc(context, zzchuVar.p);
    }

    public final void t(Throwable th, String str) {
        et3.d(this.e, this.f).b(th, str, ((Double) nb3.g.e()).floatValue());
    }

    public final void u(Throwable th, String str) {
        et3.d(this.e, this.f).a(th, str);
    }

    public final void v(Boolean bool) {
        synchronized (this.a) {
            this.i = bool;
        }
    }

    public final void w(String str) {
        this.g = str;
    }

    public final boolean x(Context context) {
        if (vw0.i()) {
            if (((Boolean) zzba.zzc().b(g93.D7)).booleanValue()) {
                return this.n.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
