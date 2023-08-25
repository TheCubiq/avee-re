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

    /* renamed from: i */
    public static final pr6 f23209i = new pr6();

    /* renamed from: j */
    public static final Handler f23210j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public static Handler f23211k = null;

    /* renamed from: l */
    public static final Runnable f23212l = new lr6();

    /* renamed from: m */
    public static final Runnable f23213m = new mr6();

    /* renamed from: b */
    public int f23215b;

    /* renamed from: h */
    public long f23221h;

    /* renamed from: a */
    public final List f23214a = new ArrayList();

    /* renamed from: c */
    public boolean f23216c = false;

    /* renamed from: d */
    public final List f23217d = new ArrayList();

    /* renamed from: f */
    public final ir6 f23219f = new ir6();

    /* renamed from: e */
    public final uq6 f23218e = new uq6();

    /* renamed from: g */
    public final jr6 f23220g = new jr6(new sr6());

    /* renamed from: d */
    public static pr6 m13193d() {
        return f23209i;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m13190g(pr6 pr6Var) {
        pr6Var.f23215b = 0;
        pr6Var.f23217d.clear();
        pr6Var.f23216c = false;
        for (xp6 xp6Var : lq6.m16667a().m16666b()) {
        }
        pr6Var.f23221h = System.nanoTime();
        pr6Var.f23219f.m19478i();
        long nanoTime = System.nanoTime();
        tq6 m7802a = pr6Var.f23218e.m7802a();
        if (pr6Var.f23219f.m19482e().size() > 0) {
            Iterator it = pr6Var.f23219f.m19482e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject m25882a = br6.m25882a(0, 0, 0, 0);
                View m19486a = pr6Var.f23219f.m19486a(str);
                tq6 m7801b = pr6Var.f23218e.m7801b();
                String m19484c = pr6Var.f23219f.m19484c(str);
                if (m19484c != null) {
                    JSONObject zza = m7801b.zza(m19486a);
                    br6.m25881b(zza, str);
                    br6.m25877f(zza, m19484c);
                    br6.m25880c(m25882a, zza);
                }
                br6.m25874i(m25882a);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                pr6Var.f23220g.m18310c(m25882a, hashSet, nanoTime);
            }
        }
        if (pr6Var.f23219f.m19481f().size() > 0) {
            JSONObject m25882a2 = br6.m25882a(0, 0, 0, 0);
            pr6Var.m13186k(null, m7802a, m25882a2, 1, false);
            br6.m25874i(m25882a2);
            pr6Var.f23220g.m18309d(m25882a2, pr6Var.f23219f.m19481f(), nanoTime);
        } else {
            pr6Var.f23220g.m18311b();
        }
        pr6Var.f23219f.m19480g();
        long nanoTime2 = System.nanoTime() - pr6Var.f23221h;
        if (pr6Var.f23214a.size() > 0) {
            for (or6 or6Var : pr6Var.f23214a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                or6Var.zzb();
                if (or6Var instanceof nr6) {
                    ((nr6) or6Var).zza();
                }
            }
        }
    }

    /* renamed from: l */
    public static final void m13185l() {
        Handler handler = f23211k;
        if (handler != null) {
            handler.removeCallbacks(f23213m);
            f23211k = null;
        }
    }

    @Override // com.daaw.sq6
    /* renamed from: a */
    public final void mo9989a(View view, tq6 tq6Var, JSONObject jSONObject, boolean z) {
        int m19476k;
        boolean z2;
        if (gr6.m21305b(view) != null || (m19476k = this.f23219f.m19476k(view)) == 3) {
            return;
        }
        JSONObject zza = tq6Var.zza(view);
        br6.m25880c(jSONObject, zza);
        String m19483d = this.f23219f.m19483d(view);
        if (m19483d != null) {
            br6.m25881b(zza, m19483d);
            br6.m25878e(zza, Boolean.valueOf(this.f23219f.m19477j(view)));
            this.f23219f.m19479h();
        } else {
            hr6 m19485b = this.f23219f.m19485b(view);
            if (m19485b != null) {
                br6.m25879d(zza, m19485b);
                z2 = true;
            } else {
                z2 = false;
            }
            m13186k(view, tq6Var, zza, m19476k, z || z2);
        }
        this.f23215b++;
    }

    /* renamed from: h */
    public final void m13189h() {
        m13185l();
    }

    /* renamed from: i */
    public final void m13188i() {
        if (f23211k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f23211k = handler;
            handler.post(f23212l);
            f23211k.postDelayed(f23213m, 200L);
        }
    }

    /* renamed from: j */
    public final void m13187j() {
        m13185l();
        this.f23214a.clear();
        f23210j.post(new kr6(this));
    }

    /* renamed from: k */
    public final void m13186k(View view, tq6 tq6Var, JSONObject jSONObject, int i, boolean z) {
        tq6Var.mo5843a(view, jSONObject, this, i == 1, z);
    }
}
