package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.foreground.C0538a;
import com.daaw.ll0;
import com.daaw.uj0;
/* loaded from: classes.dex */
public class SystemForegroundService extends uj0 implements C0538a.InterfaceC0540b {

    /* renamed from: u */
    public static final String f2537u = ll0.m16883f("SystemFgService");

    /* renamed from: v */
    public static SystemForegroundService f2538v = null;

    /* renamed from: q */
    public Handler f2539q;

    /* renamed from: r */
    public boolean f2540r;

    /* renamed from: s */
    public C0538a f2541s;

    /* renamed from: t */
    public NotificationManager f2542t;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    /* loaded from: classes.dex */
    public class RunnableC0535a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f2543p;

        /* renamed from: q */
        public final /* synthetic */ Notification f2544q;

        /* renamed from: r */
        public final /* synthetic */ int f2545r;

        public RunnableC0535a(int i, Notification notification, int i2) {
            this.f2543p = i;
            this.f2544q = notification;
            this.f2545r = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f2543p, this.f2544q, this.f2545r);
            } else {
                SystemForegroundService.this.startForeground(this.f2543p, this.f2544q);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    /* loaded from: classes.dex */
    public class RunnableC0536b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f2547p;

        /* renamed from: q */
        public final /* synthetic */ Notification f2548q;

        public RunnableC0536b(int i, Notification notification) {
            this.f2547p = i;
            this.f2548q = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f2542t.notify(this.f2547p, this.f2548q);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    /* loaded from: classes.dex */
    public class RunnableC0537c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f2550p;

        public RunnableC0537c(int i) {
            this.f2550p = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f2542t.cancel(this.f2550p);
        }
    }

    @Override // androidx.work.impl.foreground.C0538a.InterfaceC0540b
    /* renamed from: d */
    public void mo27887d(int i, int i2, Notification notification) {
        this.f2539q.post(new RunnableC0535a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.C0538a.InterfaceC0540b
    /* renamed from: e */
    public void mo27886e(int i, Notification notification) {
        this.f2539q.post(new RunnableC0536b(i, notification));
    }

    @Override // androidx.work.impl.foreground.C0538a.InterfaceC0540b
    /* renamed from: f */
    public void mo27885f(int i) {
        this.f2539q.post(new RunnableC0537c(i));
    }

    /* renamed from: g */
    public final void m27898g() {
        this.f2539q = new Handler(Looper.getMainLooper());
        this.f2542t = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0538a c0538a = new C0538a(getApplicationContext());
        this.f2541s = c0538a;
        c0538a.m27888m(this);
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onCreate() {
        super.onCreate();
        f2538v = this;
        m27898g();
    }

    @Override // com.daaw.uj0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f2541s.m27890k();
    }

    @Override // com.daaw.uj0, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f2540r) {
            ll0.m16885c().mo16880d(f2537u, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f2541s.m27890k();
            m27898g();
            this.f2540r = false;
        }
        if (intent != null) {
            this.f2541s.m27889l(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.C0538a.InterfaceC0540b
    public void stop() {
        this.f2540r = true;
        ll0.m16885c().mo16882a(f2537u, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f2538v = null;
        stopSelf();
    }
}
