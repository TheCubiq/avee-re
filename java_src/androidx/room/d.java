package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class d {
    public final Context a;
    public final String b;
    public int c;
    public final androidx.room.c d;
    public final c.AbstractC0028c e;
    public androidx.room.b f;
    public final Executor g;
    public final androidx.room.a h = new a();
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final ServiceConnection j;
    public final Runnable k;
    public final Runnable l;
    public final Runnable m;

    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0025a {

        /* renamed from: androidx.room.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0029a implements Runnable {
            public final /* synthetic */ String[] p;

            public RunnableC0029a(String[] strArr) {
                this.p = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d.e(this.p);
            }
        }

        public a() {
        }

        @Override // androidx.room.a
        public void s0(String[] strArr) {
            d.this.g.execute(new RunnableC0029a(strArr));
        }
    }

    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.f = b.a.D(iBinder);
            d dVar = d.this;
            dVar.g.execute(dVar.k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.g.execute(dVar.l);
            d.this.f = null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d dVar = d.this;
                androidx.room.b bVar = dVar.f;
                if (bVar != null) {
                    dVar.c = bVar.J0(dVar.h, dVar.b);
                    d dVar2 = d.this;
                    dVar2.d.a(dVar2.e);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.room.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0030d implements Runnable {
        public RunnableC0030d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.d.g(dVar.e);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.d.g(dVar.e);
            try {
                d dVar2 = d.this;
                androidx.room.b bVar = dVar2.f;
                if (bVar != null) {
                    bVar.X2(dVar2.h, dVar2.c);
                }
            } catch (RemoteException unused) {
            }
            d dVar3 = d.this;
            dVar3.a.unbindService(dVar3.j);
        }
    }

    /* loaded from: classes.dex */
    public class f extends c.AbstractC0028c {
        public f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0028c
        public boolean a() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0028c
        public void b(Set<String> set) {
            if (d.this.i.get()) {
                return;
            }
            try {
                d dVar = d.this;
                androidx.room.b bVar = dVar.f;
                if (bVar != null) {
                    bVar.M2(dVar.c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public d(Context context, String str, androidx.room.c cVar, Executor executor) {
        b bVar = new b();
        this.j = bVar;
        this.k = new c();
        this.l = new RunnableC0030d();
        this.m = new e();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        this.d = cVar;
        this.g = executor;
        this.e = new f((String[]) cVar.a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
