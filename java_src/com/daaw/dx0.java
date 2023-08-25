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

    /* renamed from: d */
    public static final Object f7953d = new Object();

    /* renamed from: e */
    public static dx0 f7954e;

    /* renamed from: a */
    public boolean f7955a = false;

    /* renamed from: b */
    public List<Object> f7956b = new ArrayList(30);

    /* renamed from: c */
    public List<Object> f7957c = new LinkedList();

    /* renamed from: b */
    public static Context m23840b() {
        Context m23839c = m23839c();
        return m23839c == null ? m23837e() : m23839c;
    }

    /* renamed from: c */
    public static Context m23839c() {
        return MainActivity.m26903r0();
    }

    /* renamed from: d */
    public static Activity m23838d() {
        return MainActivity.m26903r0();
    }

    /* renamed from: e */
    public static Context m23837e() {
        MainActivity m26903r0 = MainActivity.m26903r0();
        Context applicationContext = m26903r0 != null ? m26903r0.getApplicationContext() : null;
        if (applicationContext != null) {
            return applicationContext;
        }
        MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
        if (m26827D != null) {
            applicationContext = m26827D.getApplicationContext();
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        lz1.m16363c("app context is null");
        return null;
    }

    /* renamed from: h */
    public static dx0 m23834h() {
        nc0 m23841a;
        dx0 dx0Var = f7954e;
        if (dx0Var == null) {
            synchronized (f7953d) {
                if (f7954e == null) {
                    dx0 dx0Var2 = new dx0();
                    f7954e = dx0Var2;
                    dx0Var2.m23836f();
                }
            }
        } else if (!dx0Var.f7955a && (m23841a = dx0Var.m23841a()) != null) {
            f7954e.m23835g(m23841a, new az0());
        }
        return f7954e;
    }

    /* renamed from: a */
    public final nc0 m23841a() {
        for (Object obj : this.f7956b) {
            if (obj instanceof nc0) {
                return (nc0) obj;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m23836f() {
        gr1.m21332c();
        az0 az0Var = new az0();
        this.f7956b.clear();
        nc0 nc0Var = new nc0();
        this.f7956b.add(new c60());
        this.f7956b.add(new C0812b5());
        this.f7956b.add(new v91());
        this.f7956b.add(new y91());
        this.f7956b.add(nc0Var);
        this.f7956b.add(new wd1());
        this.f7956b.add(new hj0());
        pv1 pv1Var = new pv1();
        this.f7956b.add(pv1Var);
        this.f7956b.add(new ww0());
        uf1 uf1Var = new uf1();
        xw0 xw0Var = new xw0(uf1Var);
        this.f7956b.add(xw0Var);
        vm0 vm0Var = new vm0();
        this.f7956b.add(vm0Var);
        this.f7956b.add(new C3211ui());
        this.f7956b.add(new ie1());
        this.f7956b.add(new yx0());
        this.f7956b.add(new cx0());
        this.f7956b.add(new C1293fl());
        m23835g(nc0Var, az0Var);
        this.f7956b.add(new C1800j7());
        this.f7956b.add(new C2407o5());
        this.f7956b.add(ix1.m19300a());
        this.f7956b.add(new qv1(pv1Var, xw0Var, vm0Var));
        this.f7956b.add(new w51());
        this.f7956b.add(new sa0());
        this.f7956b.add(uf1Var);
        this.f7956b.add(new ew0());
        this.f7956b.add(new ol0(az0Var));
        this.f7956b.add(new rv1());
        this.f7956b.add(new jv1());
        l01.m17249c();
        C1195el.m23403j();
        td1.m9289c();
        s70.m10608a();
        ko0.m17610q();
    }

    /* renamed from: g */
    public final void m23835g(nc0 nc0Var, az0 az0Var) {
        boolean z;
        Context m23837e = m23837e();
        if (m23837e == null) {
            z = false;
        } else {
            vw1 vw1Var = new vw1();
            Objects.requireNonNull(nc0Var);
            vw1Var.m6691b(new fc0(nc0Var), this.f7957c);
            this.f7956b.add(new C1649i1(m23837e, az0Var));
            this.f7956b.add(new C2812r1(m23837e, az0Var));
            this.f7956b.add(new my0(m23837e.getString(R.string.ads_interstitial), vw1Var, az0Var));
            z = true;
        }
        this.f7955a = z;
    }
}
