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

    /* renamed from: o */
    public static final ThreadLocal<Boolean> f36597o = new r22();

    /* renamed from: p */
    public static final /* synthetic */ int f36598p = 0;

    /* renamed from: f */
    public r51<? super R> f36604f;

    /* renamed from: h */
    public R f36606h;

    /* renamed from: i */
    public Status f36607i;

    /* renamed from: j */
    public volatile boolean f36608j;

    /* renamed from: k */
    public boolean f36609k;

    /* renamed from: l */
    public boolean f36610l;

    /* renamed from: m */
    public uc0 f36611m;
    @KeepName
    private t22 mResultGuardian;

    /* renamed from: a */
    public final Object f36599a = new Object();

    /* renamed from: d */
    public final CountDownLatch f36602d = new CountDownLatch(1);

    /* renamed from: e */
    public final ArrayList<fw0.InterfaceC1335a> f36603e = new ArrayList<>();

    /* renamed from: g */
    public final AtomicReference<n12> f36605g = new AtomicReference<>();

    /* renamed from: n */
    public boolean f36612n = false;

    /* renamed from: b */
    public final HandlerC3987a<R> f36600b = new HandlerC3987a<>(Looper.getMainLooper());

    /* renamed from: c */
    public final WeakReference<y70> f36601c = new WeakReference<>(null);

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes.dex */
    public static class HandlerC3987a<R extends q51> extends q22 {
        public HandlerC3987a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m1184a(r51<? super R> r51Var, R r) {
            int i = BasePendingResult.f36598p;
            sendMessage(obtainMessage(1, new Pair((r51) ry0.m10830j(r51Var), r)));
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
                    r51Var.m11732a(q51Var);
                } catch (RuntimeException e) {
                    BasePendingResult.m1185h(q51Var);
                    throw e;
                }
            } else if (i == 2) {
                ((BasePendingResult) message.obj).m1191b(Status.f36590y);
            } else {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            }
        }
    }

    /* renamed from: h */
    public static void m1185h(q51 q51Var) {
        if (q51Var instanceof p31) {
            try {
                ((p31) q51Var).mo10704a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(q51Var));
            }
        }
    }

    /* renamed from: a */
    public abstract R m1192a(Status status);

    @Deprecated
    /* renamed from: b */
    public final void m1191b(Status status) {
        synchronized (this.f36599a) {
            if (!m1190c()) {
                m1189d(m1192a(status));
                this.f36610l = true;
            }
        }
    }

    /* renamed from: c */
    public final boolean m1190c() {
        return this.f36602d.getCount() == 0;
    }

    /* renamed from: d */
    public final void m1189d(R r) {
        synchronized (this.f36599a) {
            if (this.f36610l || this.f36609k) {
                m1185h(r);
                return;
            }
            m1190c();
            ry0.m10826n(!m1190c(), "Results have already been set");
            ry0.m10826n(!this.f36608j, "Result has already been consumed");
            m1187f(r);
        }
    }

    /* renamed from: e */
    public final R m1188e() {
        R r;
        synchronized (this.f36599a) {
            ry0.m10826n(!this.f36608j, "Result has already been consumed.");
            ry0.m10826n(m1190c(), "Result is not ready.");
            r = this.f36606h;
            this.f36606h = null;
            this.f36604f = null;
            this.f36608j = true;
        }
        if (this.f36605g.getAndSet(null) == null) {
            return (R) ry0.m10830j(r);
        }
        throw null;
    }

    /* renamed from: f */
    public final void m1187f(R r) {
        this.f36606h = r;
        this.f36607i = r.getStatus();
        this.f36611m = null;
        this.f36602d.countDown();
        if (this.f36609k) {
            this.f36604f = null;
        } else {
            r51<? super R> r51Var = this.f36604f;
            if (r51Var != null) {
                this.f36600b.removeMessages(2);
                this.f36600b.m1184a(r51Var, m1188e());
            } else if (this.f36606h instanceof p31) {
                this.mResultGuardian = new t22(this, null);
            }
        }
        ArrayList<fw0.InterfaceC1335a> arrayList = this.f36603e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m22222a(this.f36607i);
        }
        this.f36603e.clear();
    }
}
