package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.daaw.fw0;
import com.daaw.n12;
import com.daaw.p31;
import com.daaw.q22;
import com.daaw.q51;
import com.daaw.r22;
import com.daaw.r51;
import com.daaw.ry0;
import com.daaw.t22;
import com.daaw.uc0;
import com.daaw.y70;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends q51> extends fw0<R> {
    public static final ThreadLocal<Boolean> o = new r22();
    public static final /* synthetic */ int p = 0;
    public r51<? super R> f;
    public R h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public uc0 m;
    @KeepName
    private t22 mResultGuardian;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList<fw0.a> e = new ArrayList<>();
    public final AtomicReference<n12> g = new AtomicReference<>();
    public boolean n = false;
    public final a<R> b = new a<>(Looper.getMainLooper());
    public final WeakReference<y70> c = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public static class a<R extends q51> extends q22 {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(r51<? super R> r51Var, R r) {
            int i = BasePendingResult.p;
            sendMessage(obtainMessage(1, new Pair((r51) ry0.j(r51Var), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                r51 r51Var = (r51) pair.first;
                q51 q51Var = (q51) pair.second;
                try {
                    r51Var.a(q51Var);
                } catch (RuntimeException e) {
                    BasePendingResult.h(q51Var);
                    throw e;
                }
            } else if (i == 2) {
                ((BasePendingResult) message.obj).b(Status.y);
            } else {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            }
        }
    }

    public static void h(q51 q51Var) {
        if (q51Var instanceof p31) {
            try {
                ((p31) q51Var).a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(q51Var));
            }
        }
    }

    public abstract R a(Status status);

    @Deprecated
    public final void b(Status status) {
        synchronized (this.a) {
            if (!c()) {
                d(a(status));
                this.l = true;
            }
        }
    }

    public final boolean c() {
        return this.d.getCount() == 0;
    }

    public final void d(R r) {
        synchronized (this.a) {
            if (this.l || this.k) {
                h(r);
                return;
            }
            c();
            ry0.n(!c(), "Results have already been set");
            ry0.n(!this.j, "Result has already been consumed");
            f(r);
        }
    }

    public final R e() {
        R r;
        synchronized (this.a) {
            ry0.n(!this.j, "Result has already been consumed.");
            ry0.n(c(), "Result is not ready.");
            r = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        if (this.g.getAndSet(null) == null) {
            return (R) ry0.j(r);
        }
        throw null;
    }

    public final void f(R r) {
        this.h = r;
        this.i = r.getStatus();
        this.m = null;
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            r51<? super R> r51Var = this.f;
            if (r51Var != null) {
                this.b.removeMessages(2);
                this.b.a(r51Var, e());
            } else if (this.h instanceof p31) {
                this.mResultGuardian = new t22(this, null);
            }
        }
        ArrayList<fw0.a> arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(this.i);
        }
        this.e.clear();
    }
}
