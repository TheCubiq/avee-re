package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.FragmentC0358i;
import com.daaw.C2124lw;
import com.daaw.sj0;
/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public class C0353h implements sj0 {

    /* renamed from: x */
    public static final C0353h f1771x = new C0353h();

    /* renamed from: t */
    public Handler f1776t;

    /* renamed from: p */
    public int f1772p = 0;

    /* renamed from: q */
    public int f1773q = 0;

    /* renamed from: r */
    public boolean f1774r = true;

    /* renamed from: s */
    public boolean f1775s = true;

    /* renamed from: u */
    public final C0349e f1777u = new C0349e(this);

    /* renamed from: v */
    public Runnable f1778v = new RunnableC0354a();

    /* renamed from: w */
    public FragmentC0358i.InterfaceC0359a f1779w = new C0355b();

    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: classes.dex */
    public class RunnableC0354a implements Runnable {
        public RunnableC0354a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0353h.this.m29019h();
            C0353h.this.m29018j();
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    /* loaded from: classes.dex */
    public class C0355b implements FragmentC0358i.InterfaceC0359a {
        public C0355b() {
        }

        @Override // androidx.lifecycle.FragmentC0358i.InterfaceC0359a
        /* renamed from: a */
        public void mo29007a() {
            C0353h.this.m29022e();
        }

        @Override // androidx.lifecycle.FragmentC0358i.InterfaceC0359a
        /* renamed from: b */
        public void mo29006b() {
        }

        @Override // androidx.lifecycle.FragmentC0358i.InterfaceC0359a
        public void onResume() {
            C0353h.this.m29023d();
        }
    }

    /* renamed from: androidx.lifecycle.h$c */
    /* loaded from: classes.dex */
    public class C0356c extends C2124lw {

        /* renamed from: androidx.lifecycle.h$c$a */
        /* loaded from: classes.dex */
        public class C0357a extends C2124lw {
            public C0357a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C0353h.this.m29023d();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C0353h.this.m29022e();
            }
        }

        public C0356c() {
        }

        @Override // com.daaw.C2124lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC0358i.m29010f(activity).m29008h(C0353h.this.f1779w);
            }
        }

        @Override // com.daaw.C2124lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C0353h.this.m29024b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0357a());
        }

        @Override // com.daaw.C2124lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C0353h.this.m29021f();
        }
    }

    /* renamed from: k */
    public static sj0 m29017k() {
        return f1771x;
    }

    /* renamed from: l */
    public static void m29016l(Context context) {
        f1771x.m29020g(context);
    }

    @Override // com.daaw.sj0
    /* renamed from: a */
    public AbstractC0344c mo2327a() {
        return this.f1777u;
    }

    /* renamed from: b */
    public void m29024b() {
        int i = this.f1773q - 1;
        this.f1773q = i;
        if (i == 0) {
            this.f1776t.postDelayed(this.f1778v, 700L);
        }
    }

    /* renamed from: d */
    public void m29023d() {
        int i = this.f1773q + 1;
        this.f1773q = i;
        if (i == 1) {
            if (!this.f1774r) {
                this.f1776t.removeCallbacks(this.f1778v);
                return;
            }
            this.f1777u.m29041h(AbstractC0344c.EnumC0346b.ON_RESUME);
            this.f1774r = false;
        }
    }

    /* renamed from: e */
    public void m29022e() {
        int i = this.f1772p + 1;
        this.f1772p = i;
        if (i == 1 && this.f1775s) {
            this.f1777u.m29041h(AbstractC0344c.EnumC0346b.ON_START);
            this.f1775s = false;
        }
    }

    /* renamed from: f */
    public void m29021f() {
        this.f1772p--;
        m29018j();
    }

    /* renamed from: g */
    public void m29020g(Context context) {
        this.f1776t = new Handler();
        this.f1777u.m29041h(AbstractC0344c.EnumC0346b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0356c());
    }

    /* renamed from: h */
    public void m29019h() {
        if (this.f1773q == 0) {
            this.f1774r = true;
            this.f1777u.m29041h(AbstractC0344c.EnumC0346b.ON_PAUSE);
        }
    }

    /* renamed from: j */
    public void m29018j() {
        if (this.f1772p == 0 && this.f1774r) {
            this.f1777u.m29041h(AbstractC0344c.EnumC0346b.ON_STOP);
            this.f1775s = true;
        }
    }
}
