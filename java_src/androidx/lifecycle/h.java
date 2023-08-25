package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.c;
import androidx.lifecycle.i;
import com.daaw.lw;
import com.daaw.sj0;
/* loaded from: classes.dex */
public class h implements sj0 {
    public static final h x = new h();
    public Handler t;
    public int p = 0;
    public int q = 0;
    public boolean r = true;
    public boolean s = true;
    public final e u = new e(this);
    public Runnable v = new a();
    public i.a w = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.h();
            h.this.j();
        }
    }

    /* loaded from: classes.dex */
    public class b implements i.a {
        public b() {
        }

        @Override // androidx.lifecycle.i.a
        public void a() {
            h.this.e();
        }

        @Override // androidx.lifecycle.i.a
        public void b() {
        }

        @Override // androidx.lifecycle.i.a
        public void onResume() {
            h.this.d();
        }
    }

    /* loaded from: classes.dex */
    public class c extends lw {

        /* loaded from: classes.dex */
        public class a extends lw {
            public a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                h.this.d();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                h.this.e();
            }
        }

        public c() {
        }

        @Override // com.daaw.lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                i.f(activity).h(h.this.w);
            }
        }

        @Override // com.daaw.lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            h.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // com.daaw.lw, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            h.this.f();
        }
    }

    public static sj0 k() {
        return x;
    }

    public static void l(Context context) {
        x.g(context);
    }

    @Override // com.daaw.sj0
    public androidx.lifecycle.c a() {
        return this.u;
    }

    public void b() {
        int i = this.q - 1;
        this.q = i;
        if (i == 0) {
            this.t.postDelayed(this.v, 700L);
        }
    }

    public void d() {
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            if (!this.r) {
                this.t.removeCallbacks(this.v);
                return;
            }
            this.u.h(c.b.ON_RESUME);
            this.r = false;
        }
    }

    public void e() {
        int i = this.p + 1;
        this.p = i;
        if (i == 1 && this.s) {
            this.u.h(c.b.ON_START);
            this.s = false;
        }
    }

    public void f() {
        this.p--;
        j();
    }

    public void g(Context context) {
        this.t = new Handler();
        this.u.h(c.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    public void h() {
        if (this.q == 0) {
            this.r = true;
            this.u.h(c.b.ON_PAUSE);
        }
    }

    public void j() {
        if (this.p == 0 && this.r) {
            this.u.h(c.b.ON_STOP);
            this.s = true;
        }
    }
}
