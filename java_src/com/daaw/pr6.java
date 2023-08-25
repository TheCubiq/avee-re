package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class pr6 implements sq6 {
    public static final pr6 i = new pr6();
    public static final Handler j = new Handler(Looper.getMainLooper());
    public static Handler k = null;
    public static final Runnable l = new lr6();
    public static final Runnable m = new mr6();
    public int b;
    public long h;
    public final List a = new ArrayList();
    public boolean c = false;
    public final List d = new ArrayList();
    public final ir6 f = new ir6();
    public final uq6 e = new uq6();
    public final jr6 g = new jr6(new sr6());

    public static pr6 d() {
        return i;
    }

    public static /* bridge */ /* synthetic */ void g(pr6 pr6Var) {
        pr6Var.b = 0;
        pr6Var.d.clear();
        pr6Var.c = false;
        for (xp6 xp6Var : lq6.a().b()) {
        }
        pr6Var.h = System.nanoTime();
        pr6Var.f.i();
        long nanoTime = System.nanoTime();
        tq6 a = pr6Var.e.a();
        if (pr6Var.f.e().size() > 0) {
            Iterator it = pr6Var.f.e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a2 = br6.a(0, 0, 0, 0);
                View a3 = pr6Var.f.a(str);
                tq6 b = pr6Var.e.b();
                String c = pr6Var.f.c(str);
                if (c != null) {
                    JSONObject zza = b.zza(a3);
                    br6.b(zza, str);
                    br6.f(zza, c);
                    br6.c(a2, zza);
                }
                br6.i(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                pr6Var.g.c(a2, hashSet, nanoTime);
            }
        }
        if (pr6Var.f.f().size() > 0) {
            JSONObject a4 = br6.a(0, 0, 0, 0);
            pr6Var.k(null, a, a4, 1, false);
            br6.i(a4);
            pr6Var.g.d(a4, pr6Var.f.f(), nanoTime);
        } else {
            pr6Var.g.b();
        }
        pr6Var.f.g();
        long nanoTime2 = System.nanoTime() - pr6Var.h;
        if (pr6Var.a.size() > 0) {
            for (or6 or6Var : pr6Var.a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                or6Var.zzb();
                if (or6Var instanceof nr6) {
                    ((nr6) or6Var).zza();
                }
            }
        }
    }

    public static final void l() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    @Override // com.daaw.sq6
    public final void a(View view, tq6 tq6Var, JSONObject jSONObject, boolean z) {
        int k2;
        boolean z2;
        if (gr6.b(view) != null || (k2 = this.f.k(view)) == 3) {
            return;
        }
        JSONObject zza = tq6Var.zza(view);
        br6.c(jSONObject, zza);
        String d = this.f.d(view);
        if (d != null) {
            br6.b(zza, d);
            br6.e(zza, Boolean.valueOf(this.f.j(view)));
            this.f.h();
        } else {
            hr6 b = this.f.b(view);
            if (b != null) {
                br6.d(zza, b);
                z2 = true;
            } else {
                z2 = false;
            }
            k(view, tq6Var, zza, k2, z || z2);
        }
        this.b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    public final void j() {
        l();
        this.a.clear();
        j.post(new kr6(this));
    }

    public final void k(View view, tq6 tq6Var, JSONObject jSONObject, int i2, boolean z) {
        tq6Var.a(view, jSONObject, this, i2 == 1, z);
    }
}
