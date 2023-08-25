package com.daaw;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.daaw.k3;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public class z70 implements Handler.Callback {
    public static final Status G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object I = new Object();
    @GuardedBy("lock")
    public static z70 J;
    @NotOnlyInitialized
    public final Handler E;
    public volatile boolean F;
    public TelemetryData t;
    public gk1 u;
    public final Context v;
    public final w70 w;
    public final d22 x;
    public long p = 5000;
    public long q = 120000;
    public long r = 10000;
    public boolean s = false;
    public final AtomicInteger y = new AtomicInteger(1);
    public final AtomicInteger z = new AtomicInteger(0);
    public final Map<o3<?>, i02<?>> A = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")
    public uz1 B = null;
    @GuardedBy("lock")
    public final Set<o3<?>> C = new j6();
    public final Set<o3<?>> D = new j6();

    public z70(Context context, Looper looper, w70 w70Var) {
        this.F = true;
        this.v = context;
        q22 q22Var = new q22(looper, this);
        this.E = q22Var;
        this.w = w70Var;
        this.x = new d22(w70Var);
        if (nt.a(context)) {
            this.F = false;
        }
        q22Var.sendMessage(q22Var.obtainMessage(6));
    }

    public static Status h(o3<?> o3Var, ConnectionResult connectionResult) {
        String b = o3Var.b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    public static z70 x(Context context) {
        z70 z70Var;
        synchronized (I) {
            if (J == null) {
                J = new z70(context.getApplicationContext(), u70.c().getLooper(), w70.m());
            }
            z70Var = J;
        }
        return z70Var;
    }

    public final <O extends k3.d, ResultT> void D(v70<O> v70Var, int i, sj1<k3.b, ResultT> sj1Var, tj1<ResultT> tj1Var, vf1 vf1Var) {
        l(tj1Var, sj1Var.d(), v70Var);
        v12 v12Var = new v12(i, sj1Var, tj1Var, vf1Var);
        Handler handler = this.E;
        handler.sendMessage(handler.obtainMessage(4, new a12(v12Var, this.z.get(), v70Var)));
    }

    public final void E(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.E;
        handler.sendMessage(handler.obtainMessage(18, new x02(methodInvocation, i, j, i2)));
    }

    public final void F(ConnectionResult connectionResult, int i) {
        if (g(connectionResult, i)) {
            return;
        }
        Handler handler = this.E;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void a() {
        Handler handler = this.E;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(v70<?> v70Var) {
        Handler handler = this.E;
        handler.sendMessage(handler.obtainMessage(7, v70Var));
    }

    public final void c(uz1 uz1Var) {
        synchronized (I) {
            if (this.B != uz1Var) {
                this.B = uz1Var;
                this.C.clear();
            }
            this.C.addAll(uz1Var.t());
        }
    }

    public final void d(uz1 uz1Var) {
        synchronized (I) {
            if (this.B == uz1Var) {
                this.B = null;
                this.C.clear();
            }
        }
    }

    public final boolean f() {
        if (this.s) {
            return false;
        }
        RootTelemetryConfiguration a = g61.b().a();
        if (a == null || a.s()) {
            int a2 = this.x.a(this.v, 203400000);
            return a2 == -1 || a2 == 0;
        }
        return false;
    }

    public final boolean g(ConnectionResult connectionResult, int i) {
        return this.w.w(this.v, connectionResult, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        i02<?> i02Var;
        tj1<Boolean> b;
        Boolean valueOf;
        o3 o3Var;
        o3 o3Var2;
        o3 o3Var3;
        o3 o3Var4;
        int i = message.what;
        switch (i) {
            case 1:
                this.r = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.E.removeMessages(12);
                for (o3<?> o3Var5 : this.A.keySet()) {
                    Handler handler = this.E;
                    handler.sendMessageDelayed(handler.obtainMessage(12, o3Var5), this.r);
                }
                break;
            case 2:
                g22 g22Var = (g22) message.obj;
                Iterator<o3<?>> it = g22Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        o3<?> next = it.next();
                        i02<?> i02Var2 = this.A.get(next);
                        if (i02Var2 == null) {
                            g22Var.b(next, new ConnectionResult(13), null);
                            break;
                        } else if (i02Var2.O()) {
                            g22Var.b(next, ConnectionResult.t, i02Var2.s().getEndpointPackageName());
                        } else {
                            ConnectionResult q = i02Var2.q();
                            if (q != null) {
                                g22Var.b(next, q, null);
                            } else {
                                i02Var2.H(g22Var);
                                i02Var2.B();
                            }
                        }
                    }
                }
            case 3:
                for (i02<?> i02Var3 : this.A.values()) {
                    i02Var3.A();
                    i02Var3.B();
                }
                break;
            case 4:
            case 8:
            case 13:
                a12 a12Var = (a12) message.obj;
                i02<?> i02Var4 = this.A.get(a12Var.c.f());
                if (i02Var4 == null) {
                    i02Var4 = i(a12Var.c);
                }
                if (!i02Var4.P() || this.z.get() == a12Var.b) {
                    i02Var4.C(a12Var.a);
                    break;
                } else {
                    a12Var.a.a(G);
                    i02Var4.K();
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<i02<?>> it2 = this.A.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        i02<?> next2 = it2.next();
                        i02Var = next2.o() == i2 ? next2 : null;
                    }
                }
                if (i02Var != null) {
                    if (connectionResult.h() == 13) {
                        String e = this.w.e(connectionResult.h());
                        String q2 = connectionResult.q();
                        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 69 + String.valueOf(q2).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e);
                        sb.append(": ");
                        sb.append(q2);
                        i02.v(i02Var, new Status(17, sb.toString()));
                        break;
                    } else {
                        i02.v(i02Var, h(i02.t(i02Var), connectionResult));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.v.getApplicationContext() instanceof Application) {
                    fa.c((Application) this.v.getApplicationContext());
                    fa.b().a(new d02(this));
                    if (!fa.b().e(true)) {
                        this.r = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                i((v70) message.obj);
                break;
            case 9:
                if (this.A.containsKey(message.obj)) {
                    this.A.get(message.obj).J();
                    break;
                }
                break;
            case 10:
                for (o3<?> o3Var6 : this.D) {
                    i02<?> remove = this.A.remove(o3Var6);
                    if (remove != null) {
                        remove.K();
                    }
                }
                this.D.clear();
                break;
            case 11:
                if (this.A.containsKey(message.obj)) {
                    this.A.get(message.obj).L();
                    break;
                }
                break;
            case 12:
                if (this.A.containsKey(message.obj)) {
                    this.A.get(message.obj).a();
                    break;
                }
                break;
            case 14:
                vz1 vz1Var = (vz1) message.obj;
                o3<?> a = vz1Var.a();
                if (this.A.containsKey(a)) {
                    boolean N = i02.N(this.A.get(a), false);
                    b = vz1Var.b();
                    valueOf = Boolean.valueOf(N);
                } else {
                    b = vz1Var.b();
                    valueOf = Boolean.FALSE;
                }
                b.c(valueOf);
                break;
            case 15:
                k02 k02Var = (k02) message.obj;
                Map<o3<?>, i02<?>> map = this.A;
                o3Var = k02Var.a;
                if (map.containsKey(o3Var)) {
                    Map<o3<?>, i02<?>> map2 = this.A;
                    o3Var2 = k02Var.a;
                    i02.y(map2.get(o3Var2), k02Var);
                    break;
                }
                break;
            case 16:
                k02 k02Var2 = (k02) message.obj;
                Map<o3<?>, i02<?>> map3 = this.A;
                o3Var3 = k02Var2.a;
                if (map3.containsKey(o3Var3)) {
                    Map<o3<?>, i02<?>> map4 = this.A;
                    o3Var4 = k02Var2.a;
                    i02.z(map4.get(o3Var4), k02Var2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                x02 x02Var = (x02) message.obj;
                if (x02Var.c == 0) {
                    j().b(new TelemetryData(x02Var.b, Arrays.asList(x02Var.a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.t;
                    if (telemetryData != null) {
                        List<MethodInvocation> q3 = telemetryData.q();
                        if (telemetryData.h() != x02Var.b || (q3 != null && q3.size() >= x02Var.d)) {
                            this.E.removeMessages(17);
                            k();
                        } else {
                            this.t.s(x02Var.a);
                        }
                    }
                    if (this.t == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(x02Var.a);
                        this.t = new TelemetryData(x02Var.b, arrayList);
                        Handler handler2 = this.E;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), x02Var.c);
                        break;
                    }
                }
                break;
            case 19:
                this.s = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                return false;
        }
        return true;
    }

    public final i02<?> i(v70<?> v70Var) {
        o3<?> f = v70Var.f();
        i02<?> i02Var = this.A.get(f);
        if (i02Var == null) {
            i02Var = new i02<>(this, v70Var);
            this.A.put(f, i02Var);
        }
        if (i02Var.P()) {
            this.D.add(f);
        }
        i02Var.B();
        return i02Var;
    }

    public final gk1 j() {
        if (this.u == null) {
            this.u = fk1.a(this.v);
        }
        return this.u;
    }

    public final void k() {
        TelemetryData telemetryData = this.t;
        if (telemetryData != null) {
            if (telemetryData.h() > 0 || f()) {
                j().b(telemetryData);
            }
            this.t = null;
        }
    }

    public final <T> void l(tj1<T> tj1Var, int i, v70 v70Var) {
        w02 b;
        if (i == 0 || (b = w02.b(this, i, v70Var.f())) == null) {
            return;
        }
        rj1<T> a = tj1Var.a();
        final Handler handler = this.E;
        handler.getClass();
        a.c(new Executor() { // from class: com.daaw.c02
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b);
    }

    public final int m() {
        return this.y.getAndIncrement();
    }

    public final i02 w(o3<?> o3Var) {
        return this.A.get(o3Var);
    }
}
