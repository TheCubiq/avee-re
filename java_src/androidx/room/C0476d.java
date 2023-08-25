package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.C0471c;
import androidx.room.InterfaceC0465a;
import androidx.room.InterfaceC0468b;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: androidx.room.d */
/* loaded from: classes.dex */
public class C0476d {

    /* renamed from: a */
    public final Context f2310a;

    /* renamed from: b */
    public final String f2311b;

    /* renamed from: c */
    public int f2312c;

    /* renamed from: d */
    public final C0471c f2313d;

    /* renamed from: e */
    public final C0471c.AbstractC0474c f2314e;

    /* renamed from: f */
    public InterfaceC0468b f2315f;

    /* renamed from: g */
    public final Executor f2316g;

    /* renamed from: h */
    public final InterfaceC0465a f2317h = new BinderC0477a();

    /* renamed from: i */
    public final AtomicBoolean f2318i = new AtomicBoolean(false);

    /* renamed from: j */
    public final ServiceConnection f2319j;

    /* renamed from: k */
    public final Runnable f2320k;

    /* renamed from: l */
    public final Runnable f2321l;

    /* renamed from: m */
    public final Runnable f2322m;

    /* renamed from: androidx.room.d$a */
    /* loaded from: classes.dex */
    public class BinderC0477a extends InterfaceC0465a.AbstractBinderC0466a {

        /* renamed from: androidx.room.d$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0478a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ String[] f2324p;

            public RunnableC0478a(String[] strArr) {
                this.f2324p = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0476d.this.f2313d.m28082e(this.f2324p);
            }
        }

        public BinderC0477a() {
        }

        @Override // androidx.room.InterfaceC0465a
        /* renamed from: s0 */
        public void mo28066s0(String[] strArr) {
            C0476d.this.f2316g.execute(new RunnableC0478a(strArr));
        }
    }

    /* renamed from: androidx.room.d$b */
    /* loaded from: classes.dex */
    public class ServiceConnectionC0479b implements ServiceConnection {
        public ServiceConnectionC0479b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0476d.this.f2315f = InterfaceC0468b.AbstractBinderC0469a.m28090D(iBinder);
            C0476d c0476d = C0476d.this;
            c0476d.f2316g.execute(c0476d.f2320k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0476d c0476d = C0476d.this;
            c0476d.f2316g.execute(c0476d.f2321l);
            C0476d.this.f2315f = null;
        }
    }

    /* renamed from: androidx.room.d$c */
    /* loaded from: classes.dex */
    public class RunnableC0480c implements Runnable {
        public RunnableC0480c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0476d c0476d = C0476d.this;
                InterfaceC0468b interfaceC0468b = c0476d.f2315f;
                if (interfaceC0468b != null) {
                    c0476d.f2312c = interfaceC0468b.mo28089J0(c0476d.f2317h, c0476d.f2311b);
                    C0476d c0476d2 = C0476d.this;
                    c0476d2.f2313d.m28086a(c0476d2.f2314e);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.room.d$d */
    /* loaded from: classes.dex */
    public class RunnableC0481d implements Runnable {
        public RunnableC0481d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0476d c0476d = C0476d.this;
            c0476d.f2313d.m28080g(c0476d.f2314e);
        }
    }

    /* renamed from: androidx.room.d$e */
    /* loaded from: classes.dex */
    public class RunnableC0482e implements Runnable {
        public RunnableC0482e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0476d c0476d = C0476d.this;
            c0476d.f2313d.m28080g(c0476d.f2314e);
            try {
                C0476d c0476d2 = C0476d.this;
                InterfaceC0468b interfaceC0468b = c0476d2.f2315f;
                if (interfaceC0468b != null) {
                    interfaceC0468b.mo28087X2(c0476d2.f2317h, c0476d2.f2312c);
                }
            } catch (RemoteException unused) {
            }
            C0476d c0476d3 = C0476d.this;
            c0476d3.f2310a.unbindService(c0476d3.f2319j);
        }
    }

    /* renamed from: androidx.room.d$f */
    /* loaded from: classes.dex */
    public class C0483f extends C0471c.AbstractC0474c {
        public C0483f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C0471c.AbstractC0474c
        /* renamed from: a */
        public boolean mo28065a() {
            return true;
        }

        @Override // androidx.room.C0471c.AbstractC0474c
        /* renamed from: b */
        public void mo28064b(Set<String> set) {
            if (C0476d.this.f2318i.get()) {
                return;
            }
            try {
                C0476d c0476d = C0476d.this;
                InterfaceC0468b interfaceC0468b = c0476d.f2315f;
                if (interfaceC0468b != null) {
                    interfaceC0468b.mo28088M2(c0476d.f2312c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public C0476d(Context context, String str, C0471c c0471c, Executor executor) {
        ServiceConnectionC0479b serviceConnectionC0479b = new ServiceConnectionC0479b();
        this.f2319j = serviceConnectionC0479b;
        this.f2320k = new RunnableC0480c();
        this.f2321l = new RunnableC0481d();
        this.f2322m = new RunnableC0482e();
        Context applicationContext = context.getApplicationContext();
        this.f2310a = applicationContext;
        this.f2311b = str;
        this.f2313d = c0471c;
        this.f2316g = executor;
        this.f2314e = new C0483f((String[]) c0471c.f2287a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), serviceConnectionC0479b, 1);
    }
}
