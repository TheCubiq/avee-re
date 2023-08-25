package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.foreground.a;
import com.daaw.ll0;
import com.daaw.uj0;
/* loaded from: classes.dex */
public class SystemForegroundService extends uj0 implements a.b {
    public static final String u = ll0.f("SystemFgService");
    public static SystemForegroundService v = null;
    public Handler q;
    public boolean r;
    public androidx.work.impl.foreground.a s;
    public NotificationManager t;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int p;
        public final /* synthetic */ Notification q;
        public final /* synthetic */ int r;

        public a(int i, Notification notification, int i2) {
            this.p = i;
            this.q = notification;
            this.r = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.p, this.q, this.r);
            } else {
                SystemForegroundService.this.startForeground(this.p, this.q);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int p;
        public final /* synthetic */ Notification q;

        public b(int i, Notification notification) {
            this.p = i;
            this.q = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.t.notify(this.p, this.q);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ int p;

        public c(int i) {
            this.p = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.t.cancel(this.p);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i, int i2, Notification notification) {
        this.q.post(new a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i, Notification notification) {
        this.q.post(new b(i, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void f(int i) {
        this.q.post(new c(i));
    }

    public final void g() {
        this.q = new Handler(Looper.getMainLooper());
        this.t = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.s = aVar;
        aVar.m(this);
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onCreate() {
        super.onCreate();
        v = this;
        g();
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.s.k();
    }

    @Override // com.daaw.uj0, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.r) {
            ll0.c().d(u, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.s.k();
            g();
            this.r = false;
        }
        if (intent != null) {
            this.s.l(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.r = true;
        ll0.c().a(u, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        v = null;
        stopSelf();
    }
}
