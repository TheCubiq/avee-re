package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.k3;
import com.daaw.k3.d;
import com.daaw.y70;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class i02<O extends k3.d> implements y70.a, y70.b {
    public final /* synthetic */ z70 B;
    @NotOnlyInitialized
    public final k3.f q;
    public final o3<O> r;
    public final tz1 s;
    public final int v;
    public final f12 w;
    public boolean x;
    public final Queue<b22> p = new LinkedList();
    public final Set<g22> t = new HashSet();
    public final Map<gk0<?>, b12> u = new HashMap();
    public final List<k02> y = new ArrayList();
    public ConnectionResult z = null;
    public int A = 0;

    public i02(z70 z70Var, v70<O> v70Var) {
        Handler handler;
        Context context;
        Handler handler2;
        this.B = z70Var;
        handler = z70Var.E;
        k3.f i = v70Var.i(handler.getLooper(), this);
        this.q = i;
        this.r = v70Var.f();
        this.s = new tz1();
        this.v = v70Var.h();
        if (!i.requiresSignIn()) {
            this.w = null;
            return;
        }
        context = z70Var.v;
        handler2 = z70Var.E;
        this.w = v70Var.j(context, handler2);
    }

    public static /* bridge */ /* synthetic */ boolean N(i02 i02Var, boolean z) {
        return i02Var.n(false);
    }

    public static /* bridge */ /* synthetic */ o3 t(i02 i02Var) {
        return i02Var.r;
    }

    public static /* bridge */ /* synthetic */ void v(i02 i02Var, Status status) {
        i02Var.d(status);
    }

    public static /* bridge */ /* synthetic */ void y(i02 i02Var, k02 k02Var) {
        if (i02Var.y.contains(k02Var) && !i02Var.x) {
            if (i02Var.q.isConnected()) {
                i02Var.f();
            } else {
                i02Var.B();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(i02 i02Var, k02 k02Var) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] g;
        if (i02Var.y.remove(k02Var)) {
            handler = i02Var.B.E;
            handler.removeMessages(15, k02Var);
            handler2 = i02Var.B.E;
            handler2.removeMessages(16, k02Var);
            feature = k02Var.b;
            ArrayList arrayList = new ArrayList(i02Var.p.size());
            for (b22 b22Var : i02Var.p) {
                if ((b22Var instanceof q02) && (g = ((q02) b22Var).g(i02Var)) != null && k6.c(g, feature)) {
                    arrayList.add(b22Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b22 b22Var2 = (b22) arrayList.get(i);
                i02Var.p.remove(b22Var2);
                b22Var2.b(new rp1(feature));
            }
        }
    }

    public final void A() {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        this.z = null;
    }

    public final void B() {
        Handler handler;
        ConnectionResult connectionResult;
        d22 d22Var;
        Context context;
        handler = this.B.E;
        ry0.d(handler);
        if (this.q.isConnected() || this.q.isConnecting()) {
            return;
        }
        try {
            z70 z70Var = this.B;
            d22Var = z70Var.x;
            context = z70Var.v;
            int b = d22Var.b(context, this.q);
            if (b != 0) {
                ConnectionResult connectionResult2 = new ConnectionResult(b, null);
                String name = this.q.getClass().getName();
                String obj = connectionResult2.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(obj);
                F(connectionResult2, null);
                return;
            }
            z70 z70Var2 = this.B;
            k3.f fVar = this.q;
            m02 m02Var = new m02(z70Var2, fVar, this.r);
            if (fVar.requiresSignIn()) {
                ((f12) ry0.j(this.w)).j3(m02Var);
            }
            try {
                this.q.connect(m02Var);
            } catch (SecurityException e) {
                e = e;
                connectionResult = new ConnectionResult(10);
                F(connectionResult, e);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            connectionResult = new ConnectionResult(10);
        }
    }

    public final void C(b22 b22Var) {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        if (this.q.isConnected()) {
            if (l(b22Var)) {
                i();
                return;
            } else {
                this.p.add(b22Var);
                return;
            }
        }
        this.p.add(b22Var);
        ConnectionResult connectionResult = this.z;
        if (connectionResult == null || !connectionResult.t()) {
            B();
        } else {
            F(this.z, null);
        }
    }

    @Override // com.daaw.ej
    public final void D(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.B.E;
        if (myLooper == handler.getLooper()) {
            h(i);
            return;
        }
        handler2 = this.B.E;
        handler2.post(new f02(this, i));
    }

    public final void E() {
        this.A++;
    }

    public final void F(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        d22 d22Var;
        boolean z;
        Status h;
        Status h2;
        Status h3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.B.E;
        ry0.d(handler);
        f12 f12Var = this.w;
        if (f12Var != null) {
            f12Var.k3();
        }
        A();
        d22Var = this.B.x;
        d22Var.c();
        c(connectionResult);
        if ((this.q instanceof o22) && connectionResult.h() != 24) {
            this.B.s = true;
            z70 z70Var = this.B;
            handler5 = z70Var.E;
            handler6 = z70Var.E;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.h() == 4) {
            status = z70.H;
            d(status);
        } else if (this.p.isEmpty()) {
            this.z = connectionResult;
        } else if (exc != null) {
            handler4 = this.B.E;
            ry0.d(handler4);
            e(null, exc, false);
        } else {
            z = this.B.F;
            if (!z) {
                h = z70.h(this.r, connectionResult);
                d(h);
                return;
            }
            h2 = z70.h(this.r, connectionResult);
            e(h2, null, true);
            if (this.p.isEmpty() || m(connectionResult) || this.B.g(connectionResult, this.v)) {
                return;
            }
            if (connectionResult.h() == 18) {
                this.x = true;
            }
            if (!this.x) {
                h3 = z70.h(this.r, connectionResult);
                d(h3);
                return;
            }
            z70 z70Var2 = this.B;
            handler2 = z70Var2.E;
            handler3 = z70Var2.E;
            Message obtain = Message.obtain(handler3, 9, this.r);
            j = this.B.p;
            handler2.sendMessageDelayed(obtain, j);
        }
    }

    public final void G(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        k3.f fVar = this.q;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.disconnect(sb.toString());
        F(connectionResult, null);
    }

    public final void H(g22 g22Var) {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        this.t.add(g22Var);
    }

    @Override // com.daaw.du0
    public final void I(ConnectionResult connectionResult) {
        F(connectionResult, null);
    }

    public final void J() {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        if (this.x) {
            B();
        }
    }

    public final void K() {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        d(z70.G);
        this.s.d();
        for (gk0 gk0Var : (gk0[]) this.u.keySet().toArray(new gk0[0])) {
            C(new y12(gk0Var, new tj1()));
        }
        c(new ConnectionResult(4));
        if (this.q.isConnected()) {
            this.q.onUserSignOut(new h02(this));
        }
    }

    public final void L() {
        Handler handler;
        w70 w70Var;
        Context context;
        handler = this.B.E;
        ry0.d(handler);
        if (this.x) {
            k();
            z70 z70Var = this.B;
            w70Var = z70Var.w;
            context = z70Var.v;
            d(w70Var.g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.q.disconnect("Timing out connection while resuming.");
        }
    }

    @Override // com.daaw.ej
    public final void M(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.B.E;
        if (myLooper == handler.getLooper()) {
            g();
            return;
        }
        handler2 = this.B.E;
        handler2.post(new e02(this));
    }

    public final boolean O() {
        return this.q.isConnected();
    }

    public final boolean P() {
        return this.q.requiresSignIn();
    }

    public final boolean a() {
        return n(true);
    }

    public final Feature b(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.q.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            g6 g6Var = new g6(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                g6Var.put(feature.h(), Long.valueOf(feature.q()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) g6Var.get(feature2.h());
                if (l == null || l.longValue() < feature2.q()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void c(ConnectionResult connectionResult) {
        for (g22 g22Var : this.t) {
            g22Var.b(this.r, connectionResult, ot0.a(connectionResult, ConnectionResult.t) ? this.q.getEndpointPackageName() : null);
        }
        this.t.clear();
    }

    public final void d(Status status) {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        e(status, null, false);
    }

    public final void e(Status status, Exception exc, boolean z) {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<b22> it = this.p.iterator();
        while (it.hasNext()) {
            b22 next = it.next();
            if (!z || next.a == 2) {
                if (status != null) {
                    next.a(status);
                } else {
                    next.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.p);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b22 b22Var = (b22) arrayList.get(i);
            if (!this.q.isConnected()) {
                return;
            }
            if (l(b22Var)) {
                this.p.remove(b22Var);
            }
        }
    }

    public final void g() {
        A();
        c(ConnectionResult.t);
        k();
        Iterator<b12> it = this.u.values().iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw null;
        }
        f();
        i();
    }

    public final void h(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        d22 d22Var;
        A();
        this.x = true;
        this.s.c(i, this.q.getLastDisconnectMessage());
        z70 z70Var = this.B;
        handler = z70Var.E;
        handler2 = z70Var.E;
        Message obtain = Message.obtain(handler2, 9, this.r);
        j = this.B.p;
        handler.sendMessageDelayed(obtain, j);
        z70 z70Var2 = this.B;
        handler3 = z70Var2.E;
        handler4 = z70Var2.E;
        Message obtain2 = Message.obtain(handler4, 11, this.r);
        j2 = this.B.q;
        handler3.sendMessageDelayed(obtain2, j2);
        d22Var = this.B.x;
        d22Var.c();
        for (b12 b12Var : this.u.values()) {
            b12Var.a.run();
        }
    }

    public final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.B.E;
        handler.removeMessages(12, this.r);
        z70 z70Var = this.B;
        handler2 = z70Var.E;
        handler3 = z70Var.E;
        Message obtainMessage = handler3.obtainMessage(12, this.r);
        j = this.B.r;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    public final void j(b22 b22Var) {
        b22Var.d(this.s, P());
        try {
            b22Var.c(this);
        } catch (DeadObjectException unused) {
            D(1);
            this.q.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void k() {
        Handler handler;
        Handler handler2;
        if (this.x) {
            handler = this.B.E;
            handler.removeMessages(11, this.r);
            handler2 = this.B.E;
            handler2.removeMessages(9, this.r);
            this.x = false;
        }
    }

    public final boolean l(b22 b22Var) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(b22Var instanceof q02)) {
            j(b22Var);
            return true;
        }
        q02 q02Var = (q02) b22Var;
        Feature b = b(q02Var.g(this));
        if (b == null) {
            j(b22Var);
            return true;
        }
        String name = this.q.getClass().getName();
        String h = b.h();
        long q = b.q();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(h).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(h);
        sb.append(", ");
        sb.append(q);
        sb.append(").");
        z = this.B.F;
        if (!z || !q02Var.f(this)) {
            q02Var.b(new rp1(b));
            return true;
        }
        k02 k02Var = new k02(this.r, b, null);
        int indexOf = this.y.indexOf(k02Var);
        if (indexOf >= 0) {
            k02 k02Var2 = this.y.get(indexOf);
            handler5 = this.B.E;
            handler5.removeMessages(15, k02Var2);
            z70 z70Var = this.B;
            handler6 = z70Var.E;
            handler7 = z70Var.E;
            Message obtain = Message.obtain(handler7, 15, k02Var2);
            j3 = this.B.p;
            handler6.sendMessageDelayed(obtain, j3);
            return false;
        }
        this.y.add(k02Var);
        z70 z70Var2 = this.B;
        handler = z70Var2.E;
        handler2 = z70Var2.E;
        Message obtain2 = Message.obtain(handler2, 15, k02Var);
        j = this.B.p;
        handler.sendMessageDelayed(obtain2, j);
        z70 z70Var3 = this.B;
        handler3 = z70Var3.E;
        handler4 = z70Var3.E;
        Message obtain3 = Message.obtain(handler4, 16, k02Var);
        j2 = this.B.q;
        handler3.sendMessageDelayed(obtain3, j2);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (m(connectionResult)) {
            return false;
        }
        this.B.g(connectionResult, this.v);
        return false;
    }

    public final boolean m(ConnectionResult connectionResult) {
        Object obj;
        uz1 uz1Var;
        Set set;
        uz1 uz1Var2;
        obj = z70.I;
        synchronized (obj) {
            z70 z70Var = this.B;
            uz1Var = z70Var.B;
            if (uz1Var != null) {
                set = z70Var.C;
                if (set.contains(this.r)) {
                    uz1Var2 = this.B.B;
                    uz1Var2.s(connectionResult, this.v);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean n(boolean z) {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        if (this.q.isConnected() && this.u.size() == 0) {
            if (!this.s.e()) {
                this.q.disconnect("Timing out service connection.");
                return true;
            }
            if (z) {
                i();
            }
            return false;
        }
        return false;
    }

    public final int o() {
        return this.v;
    }

    public final int p() {
        return this.A;
    }

    public final ConnectionResult q() {
        Handler handler;
        handler = this.B.E;
        ry0.d(handler);
        return this.z;
    }

    public final k3.f s() {
        return this.q;
    }

    public final Map<gk0<?>, b12> u() {
        return this.u;
    }
}
