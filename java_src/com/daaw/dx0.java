package com.daaw;

import android.app.Activity;
import android.content.Context;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class dx0 {
    public static final Object d = new Object();
    public static dx0 e;
    public boolean a = false;
    public List<Object> b = new ArrayList(30);
    public List<Object> c = new LinkedList();

    public static Context b() {
        Context c = c();
        return c == null ? e() : c;
    }

    public static Context c() {
        return MainActivity.r0();
    }

    public static Activity d() {
        return MainActivity.r0();
    }

    public static Context e() {
        MainActivity r0 = MainActivity.r0();
        Context applicationContext = r0 != null ? r0.getApplicationContext() : null;
        if (applicationContext != null) {
            return applicationContext;
        }
        MediaPlaybackService D = MediaPlaybackService.D();
        if (D != null) {
            applicationContext = D.getApplicationContext();
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        lz1.c("app context is null");
        return null;
    }

    public static dx0 h() {
        nc0 a;
        dx0 dx0Var = e;
        if (dx0Var == null) {
            synchronized (d) {
                if (e == null) {
                    dx0 dx0Var2 = new dx0();
                    e = dx0Var2;
                    dx0Var2.f();
                }
            }
        } else if (!dx0Var.a && (a = dx0Var.a()) != null) {
            e.g(a, new az0());
        }
        return e;
    }

    public final nc0 a() {
        for (Object obj : this.b) {
            if (obj instanceof nc0) {
                return (nc0) obj;
            }
        }
        return null;
    }

    public final void f() {
        gr1.c();
        az0 az0Var = new az0();
        this.b.clear();
        nc0 nc0Var = new nc0();
        this.b.add(new c60());
        this.b.add(new b5());
        this.b.add(new v91());
        this.b.add(new y91());
        this.b.add(nc0Var);
        this.b.add(new wd1());
        this.b.add(new hj0());
        pv1 pv1Var = new pv1();
        this.b.add(pv1Var);
        this.b.add(new ww0());
        uf1 uf1Var = new uf1();
        xw0 xw0Var = new xw0(uf1Var);
        this.b.add(xw0Var);
        vm0 vm0Var = new vm0();
        this.b.add(vm0Var);
        this.b.add(new ui());
        this.b.add(new ie1());
        this.b.add(new yx0());
        this.b.add(new cx0());
        this.b.add(new fl());
        g(nc0Var, az0Var);
        this.b.add(new j7());
        this.b.add(new o5());
        this.b.add(ix1.a());
        this.b.add(new qv1(pv1Var, xw0Var, vm0Var));
        this.b.add(new w51());
        this.b.add(new sa0());
        this.b.add(uf1Var);
        this.b.add(new ew0());
        this.b.add(new ol0(az0Var));
        this.b.add(new rv1());
        this.b.add(new jv1());
        l01.c();
        el.j();
        td1.c();
        s70.a();
        ko0.q();
    }

    public final void g(nc0 nc0Var, az0 az0Var) {
        boolean z;
        Context e2 = e();
        if (e2 == null) {
            z = false;
        } else {
            vw1 vw1Var = new vw1();
            Objects.requireNonNull(nc0Var);
            vw1Var.b(new fc0(nc0Var), this.c);
            this.b.add(new i1(e2, az0Var));
            this.b.add(new r1(e2, az0Var));
            this.b.add(new my0(e2.getString(R.string.ads_interstitial), vw1Var, az0Var));
            z = true;
        }
        this.a = z;
    }
}
