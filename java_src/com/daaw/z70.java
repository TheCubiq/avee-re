package com.daaw;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.daaw.C1897k3;
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

    /* renamed from: G */
    public static final Status f34530G = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: H */
    public static final Status f34531H = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: I */
    public static final Object f34532I = new Object();
    @GuardedBy("lock")

    /* renamed from: J */
    public static z70 f34533J;
    @NotOnlyInitialized

    /* renamed from: E */
    public final Handler f34538E;

    /* renamed from: F */
    public volatile boolean f34539F;

    /* renamed from: t */
    public TelemetryData f34544t;

    /* renamed from: u */
    public gk1 f34545u;

    /* renamed from: v */
    public final Context f34546v;

    /* renamed from: w */
    public final w70 f34547w;

    /* renamed from: x */
    public final d22 f34548x;

    /* renamed from: p */
    public long f34540p = 5000;

    /* renamed from: q */
    public long f34541q = 120000;

    /* renamed from: r */
    public long f34542r = 10000;

    /* renamed from: s */
    public boolean f34543s = false;

    /* renamed from: y */
    public final AtomicInteger f34549y = new AtomicInteger(1);

    /* renamed from: z */
    public final AtomicInteger f34550z = new AtomicInteger(0);

    /* renamed from: A */
    public final Map<C2396o3<?>, i02<?>> f34534A = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")

    /* renamed from: B */
    public uz1 f34535B = null;
    @GuardedBy("lock")

    /* renamed from: C */
    public final Set<C2396o3<?>> f34536C = new C1798j6();

    /* renamed from: D */
    public final Set<C2396o3<?>> f34537D = new C1798j6();

    public z70(Context context, Looper looper, w70 w70Var) {
        this.f34539F = true;
        this.f34546v = context;
        q22 q22Var = new q22(looper, this);
        this.f34538E = q22Var;
        this.f34547w = w70Var;
        this.f34548x = new d22(w70Var);
        if (C2365nt.m14840a(context)) {
            this.f34539F = false;
        }
        q22Var.sendMessage(q22Var.obtainMessage(6));
    }

    /* renamed from: h */
    public static Status m2752h(C2396o3<?> c2396o3, ConnectionResult connectionResult) {
        String m14599b = c2396o3.m14599b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(m14599b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(m14599b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    /* renamed from: x */
    public static z70 m2736x(Context context) {
        z70 z70Var;
        synchronized (f34532I) {
            if (f34533J == null) {
                f34533J = new z70(context.getApplicationContext(), u70.m8460c().getLooper(), w70.m6477m());
            }
            z70Var = f34533J;
        }
        return z70Var;
    }

    /* renamed from: D */
    public final <O extends C1897k3.InterfaceC1901d, ResultT> void m2762D(v70<O> v70Var, int i, sj1<C1897k3.InterfaceC1899b, ResultT> sj1Var, tj1<ResultT> tj1Var, vf1 vf1Var) {
        m2748l(tj1Var, sj1Var.m10301d(), v70Var);
        v12 v12Var = new v12(i, sj1Var, tj1Var, vf1Var);
        Handler handler = this.f34538E;
        handler.sendMessage(handler.obtainMessage(4, new a12(v12Var, this.f34550z.get(), v70Var)));
    }

    /* renamed from: E */
    public final void m2761E(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f34538E;
        handler.sendMessage(handler.obtainMessage(18, new x02(methodInvocation, i, j, i2)));
    }

    /* renamed from: F */
    public final void m2760F(ConnectionResult connectionResult, int i) {
        if (m2753g(connectionResult, i)) {
            return;
        }
        Handler handler = this.f34538E;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    /* renamed from: a */
    public final void m2759a() {
        Handler handler = this.f34538E;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: b */
    public final void m2758b(v70<?> v70Var) {
        Handler handler = this.f34538E;
        handler.sendMessage(handler.obtainMessage(7, v70Var));
    }

    /* renamed from: c */
    public final void m2757c(uz1 uz1Var) {
        synchronized (f34532I) {
            if (this.f34535B != uz1Var) {
                this.f34535B = uz1Var;
                this.f34536C.clear();
            }
            this.f34536C.addAll(uz1Var.m7569t());
        }
    }

    /* renamed from: d */
    public final void m2756d(uz1 uz1Var) {
        synchronized (f34532I) {
            if (this.f34535B == uz1Var) {
                this.f34535B = null;
                this.f34536C.clear();
            }
        }
    }

    /* renamed from: f */
    public final boolean m2754f() {
        if (this.f34543s) {
            return false;
        }
        RootTelemetryConfiguration m21903a = g61.m21902b().m21903a();
        if (m21903a == null || m21903a.m1163s()) {
            int m24768a = this.f34548x.m24768a(this.f34546v, 203400000);
            return m24768a == -1 || m24768a == 0;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m2753g(ConnectionResult connectionResult, int i) {
        return this.f34547w.m6467w(this.f34546v, connectionResult, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        i02<?> i02Var;
        tj1<Boolean> m6640b;
        Boolean valueOf;
        C2396o3 c2396o3;
        C2396o3 c2396o32;
        C2396o3 c2396o33;
        C2396o3 c2396o34;
        int i = message.what;
        switch (i) {
            case 1:
                this.f34542r = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f34538E.removeMessages(12);
                for (C2396o3<?> c2396o35 : this.f34534A.keySet()) {
                    Handler handler = this.f34538E;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2396o35), this.f34542r);
                }
                break;
            case 2:
                g22 g22Var = (g22) message.obj;
                Iterator<C2396o3<?>> it = g22Var.m22059a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C2396o3<?> next = it.next();
                        i02<?> i02Var2 = this.f34534A.get(next);
                        if (i02Var2 == null) {
                            g22Var.m22058b(next, new ConnectionResult(13), null);
                            break;
                        } else if (i02Var2.m20256O()) {
                            g22Var.m22058b(next, ConnectionResult.f36572t, i02Var2.m20236s().getEndpointPackageName());
                        } else {
                            ConnectionResult m20238q = i02Var2.m20238q();
                            if (m20238q != null) {
                                g22Var.m22058b(next, m20238q, null);
                            } else {
                                i02Var2.m20263H(g22Var);
                                i02Var2.m20269B();
                            }
                        }
                    }
                }
            case 3:
                for (i02<?> i02Var3 : this.f34534A.values()) {
                    i02Var3.m20270A();
                    i02Var3.m20269B();
                }
                break;
            case 4:
            case 8:
            case 13:
                a12 a12Var = (a12) message.obj;
                i02<?> i02Var4 = this.f34534A.get(a12Var.f2693c.m7382f());
                if (i02Var4 == null) {
                    i02Var4 = m2751i(a12Var.f2693c);
                }
                if (!i02Var4.m20255P() || this.f34550z.get() == a12Var.f2692b) {
                    i02Var4.m20268C(a12Var.f2691a);
                    break;
                } else {
                    a12Var.f2691a.mo7553a(f34530G);
                    i02Var4.m20260K();
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<i02<?>> it2 = this.f34534A.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        i02<?> next2 = it2.next();
                        i02Var = next2.m20240o() == i2 ? next2 : null;
                    }
                }
                if (i02Var != null) {
                    if (connectionResult.m1209h() == 13) {
                        String mo5493e = this.f34547w.mo5493e(connectionResult.m1209h());
                        String m1208q = connectionResult.m1208q();
                        StringBuilder sb = new StringBuilder(String.valueOf(mo5493e).length() + 69 + String.valueOf(m1208q).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(mo5493e);
                        sb.append(": ");
                        sb.append(m1208q);
                        i02.m20233v(i02Var, new Status(17, sb.toString()));
                        break;
                    } else {
                        i02.m20233v(i02Var, m2752h(i02.m20235t(i02Var), connectionResult));
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
                if (this.f34546v.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1265fa.m22822c((Application) this.f34546v.getApplicationContext());
                    ComponentCallbacks2C1265fa.m22823b().m22824a(new d02(this));
                    if (!ComponentCallbacks2C1265fa.m22823b().m22820e(true)) {
                        this.f34542r = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                m2751i((v70) message.obj);
                break;
            case 9:
                if (this.f34534A.containsKey(message.obj)) {
                    this.f34534A.get(message.obj).m20261J();
                    break;
                }
                break;
            case 10:
                for (C2396o3<?> c2396o36 : this.f34537D) {
                    i02<?> remove = this.f34534A.remove(c2396o36);
                    if (remove != null) {
                        remove.m20260K();
                    }
                }
                this.f34537D.clear();
                break;
            case 11:
                if (this.f34534A.containsKey(message.obj)) {
                    this.f34534A.get(message.obj).m20259L();
                    break;
                }
                break;
            case 12:
                if (this.f34534A.containsKey(message.obj)) {
                    this.f34534A.get(message.obj).m20254a();
                    break;
                }
                break;
            case 14:
                vz1 vz1Var = (vz1) message.obj;
                C2396o3<?> m6641a = vz1Var.m6641a();
                if (this.f34534A.containsKey(m6641a)) {
                    boolean m20257N = i02.m20257N(this.f34534A.get(m6641a), false);
                    m6640b = vz1Var.m6640b();
                    valueOf = Boolean.valueOf(m20257N);
                } else {
                    m6640b = vz1Var.m6640b();
                    valueOf = Boolean.FALSE;
                }
                m6640b.m9080c(valueOf);
                break;
            case 15:
                k02 k02Var = (k02) message.obj;
                Map<C2396o3<?>, i02<?>> map = this.f34534A;
                c2396o3 = k02Var.f15573a;
                if (map.containsKey(c2396o3)) {
                    Map<C2396o3<?>, i02<?>> map2 = this.f34534A;
                    c2396o32 = k02Var.f15573a;
                    i02.m20230y(map2.get(c2396o32), k02Var);
                    break;
                }
                break;
            case 16:
                k02 k02Var2 = (k02) message.obj;
                Map<C2396o3<?>, i02<?>> map3 = this.f34534A;
                c2396o33 = k02Var2.f15573a;
                if (map3.containsKey(c2396o33)) {
                    Map<C2396o3<?>, i02<?>> map4 = this.f34534A;
                    c2396o34 = k02Var2.f15573a;
                    i02.m20229z(map4.get(c2396o34), k02Var2);
                    break;
                }
                break;
            case 17:
                m2749k();
                break;
            case 18:
                x02 x02Var = (x02) message.obj;
                if (x02Var.f31713c == 0) {
                    m2750j().mo16295b(new TelemetryData(x02Var.f31712b, Arrays.asList(x02Var.f31711a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.f34544t;
                    if (telemetryData != null) {
                        List<MethodInvocation> m1159q = telemetryData.m1159q();
                        if (telemetryData.m1160h() != x02Var.f31712b || (m1159q != null && m1159q.size() >= x02Var.f31714d)) {
                            this.f34538E.removeMessages(17);
                            m2749k();
                        } else {
                            this.f34544t.m1158s(x02Var.f31711a);
                        }
                    }
                    if (this.f34544t == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(x02Var.f31711a);
                        this.f34544t = new TelemetryData(x02Var.f31712b, arrayList);
                        Handler handler2 = this.f34538E;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), x02Var.f31713c);
                        break;
                    }
                }
                break;
            case 19:
                this.f34543s = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                return false;
        }
        return true;
    }

    /* renamed from: i */
    public final i02<?> m2751i(v70<?> v70Var) {
        C2396o3<?> m7382f = v70Var.m7382f();
        i02<?> i02Var = this.f34534A.get(m7382f);
        if (i02Var == null) {
            i02Var = new i02<>(this, v70Var);
            this.f34534A.put(m7382f, i02Var);
        }
        if (i02Var.m20255P()) {
            this.f34537D.add(m7382f);
        }
        i02Var.m20269B();
        return i02Var;
    }

    /* renamed from: j */
    public final gk1 m2750j() {
        if (this.f34545u == null) {
            this.f34545u = fk1.m22530a(this.f34546v);
        }
        return this.f34545u;
    }

    /* renamed from: k */
    public final void m2749k() {
        TelemetryData telemetryData = this.f34544t;
        if (telemetryData != null) {
            if (telemetryData.m1160h() > 0 || m2754f()) {
                m2750j().mo16295b(telemetryData);
            }
            this.f34544t = null;
        }
    }

    /* renamed from: l */
    public final <T> void m2748l(tj1<T> tj1Var, int i, v70 v70Var) {
        w02 m6613b;
        if (i == 0 || (m6613b = w02.m6613b(this, i, v70Var.m7382f())) == null) {
            return;
        }
        rj1<T> m9082a = tj1Var.m9082a();
        final Handler handler = this.f34538E;
        handler.getClass();
        m9082a.mo11247c(new Executor() { // from class: com.daaw.c02
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, m6613b);
    }

    /* renamed from: m */
    public final int m2747m() {
        return this.f34549y.getAndIncrement();
    }

    /* renamed from: w */
    public final i02 m2737w(C2396o3<?> c2396o3) {
        return this.f34534A.get(c2396o3);
    }
}
