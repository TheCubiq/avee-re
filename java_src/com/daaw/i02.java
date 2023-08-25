package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.C1897k3;
import com.daaw.C1897k3.InterfaceC1901d;
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
public final class i02<O extends C1897k3.InterfaceC1901d> implements y70.InterfaceC3675a, y70.InterfaceC3676b {

    /* renamed from: B */
    public final /* synthetic */ z70 f13124B;
    @NotOnlyInitialized

    /* renamed from: q */
    public final C1897k3.InterfaceC1906f f13126q;

    /* renamed from: r */
    public final C2396o3<O> f13127r;

    /* renamed from: s */
    public final tz1 f13128s;

    /* renamed from: v */
    public final int f13131v;

    /* renamed from: w */
    public final f12 f13132w;

    /* renamed from: x */
    public boolean f13133x;

    /* renamed from: p */
    public final Queue<b22> f13125p = new LinkedList();

    /* renamed from: t */
    public final Set<g22> f13129t = new HashSet();

    /* renamed from: u */
    public final Map<gk0<?>, b12> f13130u = new HashMap();

    /* renamed from: y */
    public final List<k02> f13134y = new ArrayList();

    /* renamed from: z */
    public ConnectionResult f13135z = null;

    /* renamed from: A */
    public int f13123A = 0;

    public i02(z70 z70Var, v70<O> v70Var) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f13124B = z70Var;
        handler = z70Var.f34538E;
        C1897k3.InterfaceC1906f m7379i = v70Var.m7379i(handler.getLooper(), this);
        this.f13126q = m7379i;
        this.f13127r = v70Var.m7382f();
        this.f13128s = new tz1();
        this.f13131v = v70Var.m7380h();
        if (!m7379i.requiresSignIn()) {
            this.f13132w = null;
            return;
        }
        context = z70Var.f34546v;
        handler2 = z70Var.f34538E;
        this.f13132w = v70Var.m7378j(context, handler2);
    }

    /* renamed from: N */
    public static /* bridge */ /* synthetic */ boolean m20257N(i02 i02Var, boolean z) {
        return i02Var.m20241n(false);
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ C2396o3 m20235t(i02 i02Var) {
        return i02Var.f13127r;
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ void m20233v(i02 i02Var, Status status) {
        i02Var.m20251d(status);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m20230y(i02 i02Var, k02 k02Var) {
        if (i02Var.f13134y.contains(k02Var) && !i02Var.f13133x) {
            if (i02Var.f13126q.isConnected()) {
                i02Var.m20249f();
            } else {
                i02Var.m20269B();
            }
        }
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ void m20229z(i02 i02Var, k02 k02Var) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] mo4270g;
        if (i02Var.f13134y.remove(k02Var)) {
            handler = i02Var.f13124B.f34538E;
            handler.removeMessages(15, k02Var);
            handler2 = i02Var.f13124B.f34538E;
            handler2.removeMessages(16, k02Var);
            feature = k02Var.f15574b;
            ArrayList arrayList = new ArrayList(i02Var.f13125p.size());
            for (b22 b22Var : i02Var.f13125p) {
                if ((b22Var instanceof q02) && (mo4270g = ((q02) b22Var).mo4270g(i02Var)) != null && C1913k6.m18036c(mo4270g, feature)) {
                    arrayList.add(b22Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b22 b22Var2 = (b22) arrayList.get(i);
                i02Var.f13125p.remove(b22Var2);
                b22Var2.mo7552b(new rp1(feature));
            }
        }
    }

    /* renamed from: A */
    public final void m20270A() {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        this.f13135z = null;
    }

    /* renamed from: B */
    public final void m20269B() {
        Handler handler;
        ConnectionResult connectionResult;
        d22 d22Var;
        Context context;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        if (this.f13126q.isConnected() || this.f13126q.isConnecting()) {
            return;
        }
        try {
            z70 z70Var = this.f13124B;
            d22Var = z70Var.f34548x;
            context = z70Var.f34546v;
            int m24767b = d22Var.m24767b(context, this.f13126q);
            if (m24767b != 0) {
                ConnectionResult connectionResult2 = new ConnectionResult(m24767b, null);
                String name = this.f13126q.getClass().getName();
                String obj = connectionResult2.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(obj);
                m20265F(connectionResult2, null);
                return;
            }
            z70 z70Var2 = this.f13124B;
            C1897k3.InterfaceC1906f interfaceC1906f = this.f13126q;
            m02 m02Var = new m02(z70Var2, interfaceC1906f, this.f13127r);
            if (interfaceC1906f.requiresSignIn()) {
                ((f12) ry0.m10830j(this.f13132w)).m22968j3(m02Var);
            }
            try {
                this.f13126q.connect(m02Var);
            } catch (SecurityException e) {
                e = e;
                connectionResult = new ConnectionResult(10);
                m20265F(connectionResult, e);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            connectionResult = new ConnectionResult(10);
        }
    }

    /* renamed from: C */
    public final void m20268C(b22 b22Var) {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        if (this.f13126q.isConnected()) {
            if (m20243l(b22Var)) {
                m20246i();
                return;
            } else {
                this.f13125p.add(b22Var);
                return;
            }
        }
        this.f13125p.add(b22Var);
        ConnectionResult connectionResult = this.f13135z;
        if (connectionResult == null || !connectionResult.m1206t()) {
            m20269B();
        } else {
            m20265F(this.f13135z, null);
        }
    }

    @Override // com.daaw.InterfaceC1192ej
    /* renamed from: D */
    public final void mo20267D(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f13124B.f34538E;
        if (myLooper == handler.getLooper()) {
            m20247h(i);
            return;
        }
        handler2 = this.f13124B.f34538E;
        handler2.post(new f02(this, i));
    }

    /* renamed from: E */
    public final void m20266E() {
        this.f13123A++;
    }

    /* renamed from: F */
    public final void m20265F(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        d22 d22Var;
        boolean z;
        Status m2752h;
        Status m2752h2;
        Status m2752h3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        f12 f12Var = this.f13132w;
        if (f12Var != null) {
            f12Var.m22967k3();
        }
        m20270A();
        d22Var = this.f13124B.f34548x;
        d22Var.m24766c();
        m20252c(connectionResult);
        if ((this.f13126q instanceof o22) && connectionResult.m1209h() != 24) {
            this.f13124B.f34543s = true;
            z70 z70Var = this.f13124B;
            handler5 = z70Var.f34538E;
            handler6 = z70Var.f34538E;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.m1209h() == 4) {
            status = z70.f34531H;
            m20251d(status);
        } else if (this.f13125p.isEmpty()) {
            this.f13135z = connectionResult;
        } else if (exc != null) {
            handler4 = this.f13124B.f34538E;
            ry0.m10836d(handler4);
            m20250e(null, exc, false);
        } else {
            z = this.f13124B.f34539F;
            if (!z) {
                m2752h = z70.m2752h(this.f13127r, connectionResult);
                m20251d(m2752h);
                return;
            }
            m2752h2 = z70.m2752h(this.f13127r, connectionResult);
            m20250e(m2752h2, null, true);
            if (this.f13125p.isEmpty() || m20242m(connectionResult) || this.f13124B.m2753g(connectionResult, this.f13131v)) {
                return;
            }
            if (connectionResult.m1209h() == 18) {
                this.f13133x = true;
            }
            if (!this.f13133x) {
                m2752h3 = z70.m2752h(this.f13127r, connectionResult);
                m20251d(m2752h3);
                return;
            }
            z70 z70Var2 = this.f13124B;
            handler2 = z70Var2.f34538E;
            handler3 = z70Var2.f34538E;
            Message obtain = Message.obtain(handler3, 9, this.f13127r);
            j = this.f13124B.f34540p;
            handler2.sendMessageDelayed(obtain, j);
        }
    }

    /* renamed from: G */
    public final void m20264G(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        C1897k3.InterfaceC1906f interfaceC1906f = this.f13126q;
        String name = interfaceC1906f.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        interfaceC1906f.disconnect(sb.toString());
        m20265F(connectionResult, null);
    }

    /* renamed from: H */
    public final void m20263H(g22 g22Var) {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        this.f13129t.add(g22Var);
    }

    @Override // com.daaw.du0
    /* renamed from: I */
    public final void mo20262I(ConnectionResult connectionResult) {
        m20265F(connectionResult, null);
    }

    /* renamed from: J */
    public final void m20261J() {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        if (this.f13133x) {
            m20269B();
        }
    }

    /* renamed from: K */
    public final void m20260K() {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        m20251d(z70.f34530G);
        this.f13128s.m8665d();
        for (gk0 gk0Var : (gk0[]) this.f13130u.keySet().toArray(new gk0[0])) {
            m20268C(new y12(gk0Var, new tj1()));
        }
        m20252c(new ConnectionResult(4));
        if (this.f13126q.isConnected()) {
            this.f13126q.onUserSignOut(new h02(this));
        }
    }

    /* renamed from: L */
    public final void m20259L() {
        Handler handler;
        w70 w70Var;
        Context context;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        if (this.f13133x) {
            m20244k();
            z70 z70Var = this.f13124B;
            w70Var = z70Var.f34547w;
            context = z70Var.f34546v;
            m20251d(w70Var.mo5491g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f13126q.disconnect("Timing out connection while resuming.");
        }
    }

    @Override // com.daaw.InterfaceC1192ej
    /* renamed from: M */
    public final void mo20258M(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f13124B.f34538E;
        if (myLooper == handler.getLooper()) {
            m20248g();
            return;
        }
        handler2 = this.f13124B.f34538E;
        handler2.post(new e02(this));
    }

    /* renamed from: O */
    public final boolean m20256O() {
        return this.f13126q.isConnected();
    }

    /* renamed from: P */
    public final boolean m20255P() {
        return this.f13126q.requiresSignIn();
    }

    /* renamed from: a */
    public final boolean m20254a() {
        return m20241n(true);
    }

    /* renamed from: b */
    public final Feature m20253b(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f13126q.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C1370g6 c1370g6 = new C1370g6(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                c1370g6.put(feature.m1203h(), Long.valueOf(feature.m1202q()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c1370g6.get(feature2.m1203h());
                if (l == null || l.longValue() < feature2.m1202q()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m20252c(ConnectionResult connectionResult) {
        for (g22 g22Var : this.f13129t) {
            g22Var.m22058b(this.f13127r, connectionResult, ot0.m13981a(connectionResult, ConnectionResult.f36572t) ? this.f13126q.getEndpointPackageName() : null);
        }
        this.f13129t.clear();
    }

    /* renamed from: d */
    public final void m20251d(Status status) {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        m20250e(status, null, false);
    }

    /* renamed from: e */
    public final void m20250e(Status status, Exception exc, boolean z) {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<b22> it = this.f13125p.iterator();
        while (it.hasNext()) {
            b22 next = it.next();
            if (!z || next.f4229a == 2) {
                if (status != null) {
                    next.mo7553a(status);
                } else {
                    next.mo7552b(exc);
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    public final void m20249f() {
        ArrayList arrayList = new ArrayList(this.f13125p);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b22 b22Var = (b22) arrayList.get(i);
            if (!this.f13126q.isConnected()) {
                return;
            }
            if (m20243l(b22Var)) {
                this.f13125p.remove(b22Var);
            }
        }
    }

    /* renamed from: g */
    public final void m20248g() {
        m20270A();
        m20252c(ConnectionResult.f36572t);
        m20244k();
        Iterator<b12> it = this.f13130u.values().iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw null;
        }
        m20249f();
        m20246i();
    }

    /* renamed from: h */
    public final void m20247h(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        d22 d22Var;
        m20270A();
        this.f13133x = true;
        this.f13128s.m8666c(i, this.f13126q.getLastDisconnectMessage());
        z70 z70Var = this.f13124B;
        handler = z70Var.f34538E;
        handler2 = z70Var.f34538E;
        Message obtain = Message.obtain(handler2, 9, this.f13127r);
        j = this.f13124B.f34540p;
        handler.sendMessageDelayed(obtain, j);
        z70 z70Var2 = this.f13124B;
        handler3 = z70Var2.f34538E;
        handler4 = z70Var2.f34538E;
        Message obtain2 = Message.obtain(handler4, 11, this.f13127r);
        j2 = this.f13124B.f34541q;
        handler3.sendMessageDelayed(obtain2, j2);
        d22Var = this.f13124B.f34548x;
        d22Var.m24766c();
        for (b12 b12Var : this.f13130u.values()) {
            b12Var.f4221a.run();
        }
    }

    /* renamed from: i */
    public final void m20246i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.f13124B.f34538E;
        handler.removeMessages(12, this.f13127r);
        z70 z70Var = this.f13124B;
        handler2 = z70Var.f34538E;
        handler3 = z70Var.f34538E;
        Message obtainMessage = handler3.obtainMessage(12, this.f13127r);
        j = this.f13124B.f34542r;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: j */
    public final void m20245j(b22 b22Var) {
        b22Var.mo4272d(this.f13128s, m20255P());
        try {
            b22Var.mo7551c(this);
        } catch (DeadObjectException unused) {
            mo20267D(1);
            this.f13126q.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    public final void m20244k() {
        Handler handler;
        Handler handler2;
        if (this.f13133x) {
            handler = this.f13124B.f34538E;
            handler.removeMessages(11, this.f13127r);
            handler2 = this.f13124B.f34538E;
            handler2.removeMessages(9, this.f13127r);
            this.f13133x = false;
        }
    }

    /* renamed from: l */
    public final boolean m20243l(b22 b22Var) {
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
            m20245j(b22Var);
            return true;
        }
        q02 q02Var = (q02) b22Var;
        Feature m20253b = m20253b(q02Var.mo4270g(this));
        if (m20253b == null) {
            m20245j(b22Var);
            return true;
        }
        String name = this.f13126q.getClass().getName();
        String m1203h = m20253b.m1203h();
        long m1202q = m20253b.m1202q();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(m1203h).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(m1203h);
        sb.append(", ");
        sb.append(m1202q);
        sb.append(").");
        z = this.f13124B.f34539F;
        if (!z || !q02Var.mo4271f(this)) {
            q02Var.mo7552b(new rp1(m20253b));
            return true;
        }
        k02 k02Var = new k02(this.f13127r, m20253b, null);
        int indexOf = this.f13134y.indexOf(k02Var);
        if (indexOf >= 0) {
            k02 k02Var2 = this.f13134y.get(indexOf);
            handler5 = this.f13124B.f34538E;
            handler5.removeMessages(15, k02Var2);
            z70 z70Var = this.f13124B;
            handler6 = z70Var.f34538E;
            handler7 = z70Var.f34538E;
            Message obtain = Message.obtain(handler7, 15, k02Var2);
            j3 = this.f13124B.f34540p;
            handler6.sendMessageDelayed(obtain, j3);
            return false;
        }
        this.f13134y.add(k02Var);
        z70 z70Var2 = this.f13124B;
        handler = z70Var2.f34538E;
        handler2 = z70Var2.f34538E;
        Message obtain2 = Message.obtain(handler2, 15, k02Var);
        j = this.f13124B.f34540p;
        handler.sendMessageDelayed(obtain2, j);
        z70 z70Var3 = this.f13124B;
        handler3 = z70Var3.f34538E;
        handler4 = z70Var3.f34538E;
        Message obtain3 = Message.obtain(handler4, 16, k02Var);
        j2 = this.f13124B.f34541q;
        handler3.sendMessageDelayed(obtain3, j2);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (m20242m(connectionResult)) {
            return false;
        }
        this.f13124B.m2753g(connectionResult, this.f13131v);
        return false;
    }

    /* renamed from: m */
    public final boolean m20242m(ConnectionResult connectionResult) {
        Object obj;
        uz1 uz1Var;
        Set set;
        uz1 uz1Var2;
        obj = z70.f34532I;
        synchronized (obj) {
            z70 z70Var = this.f13124B;
            uz1Var = z70Var.f34535B;
            if (uz1Var != null) {
                set = z70Var.f34536C;
                if (set.contains(this.f13127r)) {
                    uz1Var2 = this.f13124B.f34535B;
                    uz1Var2.m13752s(connectionResult, this.f13131v);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: n */
    public final boolean m20241n(boolean z) {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        if (this.f13126q.isConnected() && this.f13130u.size() == 0) {
            if (!this.f13128s.m8664e()) {
                this.f13126q.disconnect("Timing out service connection.");
                return true;
            }
            if (z) {
                m20246i();
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public final int m20240o() {
        return this.f13131v;
    }

    /* renamed from: p */
    public final int m20239p() {
        return this.f13123A;
    }

    /* renamed from: q */
    public final ConnectionResult m20238q() {
        Handler handler;
        handler = this.f13124B.f34538E;
        ry0.m10836d(handler);
        return this.f13135z;
    }

    /* renamed from: s */
    public final C1897k3.InterfaceC1906f m20236s() {
        return this.f13126q;
    }

    /* renamed from: u */
    public final Map<gk0<?>, b12> m20234u() {
        return this.f13130u;
    }
}
