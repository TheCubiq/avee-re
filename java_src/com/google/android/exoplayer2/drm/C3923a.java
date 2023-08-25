package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.daaw.C1075dd;
import com.daaw.C2935sf;
import com.daaw.InterfaceC2376nz;
import com.daaw.hx1;
import com.daaw.ji0;
import com.google.android.exoplayer2.drm.InterfaceC3927b;
import com.google.android.exoplayer2.drm.InterfaceC3933d;
import com.google.android.exoplayer2.drm.InterfaceC3936f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@TargetApi(18)
/* renamed from: com.google.android.exoplayer2.drm.a */
/* loaded from: classes.dex */
public class C3923a<T extends InterfaceC2376nz> implements InterfaceC3933d<T> {

    /* renamed from: a */
    public final InterfaceC3936f<T> f35736a;

    /* renamed from: b */
    public final InterfaceC3926c<T> f35737b;

    /* renamed from: c */
    public final byte[] f35738c;

    /* renamed from: d */
    public final String f35739d;

    /* renamed from: e */
    public final int f35740e;

    /* renamed from: f */
    public final HashMap<String, String> f35741f;

    /* renamed from: g */
    public final int f35742g;

    /* renamed from: h */
    public final InterfaceC3940g f35743h;

    /* renamed from: i */
    public final UUID f35744i;

    /* renamed from: j */
    public final C3923a<T>.HandlerC3925b f35745j;

    /* renamed from: k */
    public int f35746k = 2;

    /* renamed from: l */
    public int f35747l;

    /* renamed from: m */
    public HandlerThread f35748m;

    /* renamed from: n */
    public C3923a<T>.HandlerC3924a f35749n;

    /* renamed from: o */
    public T f35750o;

    /* renamed from: p */
    public InterfaceC3933d.C3934a f35751p;

    /* renamed from: q */
    public byte[] f35752q;

    /* renamed from: r */
    public byte[] f35753r;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.a$a */
    /* loaded from: classes.dex */
    public class HandlerC3924a extends Handler {
        public HandlerC3924a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final long m1679a(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        /* renamed from: b */
        public final boolean m1678b(Message message) {
            int i;
            if ((message.arg1 == 1) && (i = message.arg2 + 1) <= C3923a.this.f35742g) {
                Message obtain = Message.obtain(message);
                obtain.arg2 = i;
                sendMessageDelayed(obtain, m1679a(i));
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public Message m1677c(int i, Object obj, boolean z) {
            return obtainMessage(i, z ? 1 : 0, 0, obj);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    C3923a c3923a = C3923a.this;
                    e = c3923a.f35743h.m1650b(c3923a.f35744i, (InterfaceC3936f.InterfaceC3939c) message.obj);
                } else if (i != 1) {
                    throw new RuntimeException();
                } else {
                    C3923a c3923a2 = C3923a.this;
                    e = c3923a2.f35743h.m1651a(c3923a2.f35744i, (InterfaceC3936f.InterfaceC3938b) message.obj);
                }
            } catch (Exception e) {
                e = e;
                if (m1678b(message)) {
                    return;
                }
            }
            C3923a.this.f35745j.obtainMessage(message.what, e).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.a$b */
    /* loaded from: classes.dex */
    public class HandlerC3925b extends Handler {
        public HandlerC3925b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C3923a.this.m1685t(message.obj);
            } else if (i != 1) {
            } else {
                C3923a.this.m1691n(message.obj);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3926c<T extends InterfaceC2376nz> {
        /* renamed from: b */
        void mo1675b(C3923a<T> c3923a);

        /* renamed from: c */
        void mo1674c(Exception exc);

        /* renamed from: e */
        void mo1672e();
    }

    public C3923a(UUID uuid, InterfaceC3936f<T> interfaceC3936f, InterfaceC3926c<T> interfaceC3926c, byte[] bArr, String str, int i, byte[] bArr2, HashMap<String, String> hashMap, InterfaceC3940g interfaceC3940g, Looper looper, InterfaceC3927b.C3928a c3928a, int i2) {
        this.f35744i = uuid;
        this.f35737b = interfaceC3926c;
        this.f35736a = interfaceC3936f;
        this.f35740e = i;
        this.f35753r = bArr2;
        this.f35741f = hashMap;
        this.f35743h = interfaceC3940g;
        this.f35742g = i2;
        this.f35745j = new HandlerC3925b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f35748m = handlerThread;
        handlerThread.start();
        this.f35749n = new HandlerC3924a(this.f35748m.getLooper());
        if (bArr2 == null) {
            this.f35738c = bArr;
            this.f35739d = str;
            return;
        }
        this.f35738c = null;
        this.f35739d = null;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3933d
    /* renamed from: a */
    public Map<String, String> mo1665a() {
        byte[] bArr = this.f35752q;
        if (bArr == null) {
            return null;
        }
        return this.f35736a.m1662a(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3933d
    /* renamed from: b */
    public final T mo1664b() {
        return this.f35750o;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3933d
    /* renamed from: c */
    public final InterfaceC3933d.C3934a mo1663c() {
        if (this.f35746k == 1) {
            return this.f35751p;
        }
        return null;
    }

    /* renamed from: g */
    public void m1698g() {
        int i = this.f35747l + 1;
        this.f35747l = i;
        if (i == 1 && this.f35746k != 1 && m1684u(true)) {
            m1697h(true);
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3933d
    public final int getState() {
        return this.f35746k;
    }

    /* renamed from: h */
    public final void m1697h(boolean z) {
        int i = this.f35740e;
        int i2 = 1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.f35753r != null && !m1680y()) {
                    return;
                }
                m1683v(2, z);
                return;
            }
            i2 = 3;
            if (i != 3 || !m1680y()) {
                return;
            }
            m1683v(i2, z);
        }
        if (this.f35753r != null) {
            if (this.f35746k == 4 || m1680y()) {
                long m1696i = m1696i();
                if (this.f35740e != 0 || m1696i > 60) {
                    if (m1696i <= 0) {
                        m1692m(new ji0());
                        return;
                    } else {
                        this.f35746k = 4;
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                sb.append(m1696i);
                m1683v(2, z);
                return;
            }
            return;
        }
        m1683v(i2, z);
    }

    /* renamed from: i */
    public final long m1696i() {
        if (C1075dd.f6945e.equals(this.f35744i)) {
            Pair<Long, Long> m20334b = hx1.m20334b(this);
            return Math.min(((Long) m20334b.first).longValue(), ((Long) m20334b.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: j */
    public boolean m1695j(byte[] bArr) {
        return Arrays.equals(this.f35738c, bArr);
    }

    /* renamed from: k */
    public boolean m1694k(byte[] bArr) {
        return Arrays.equals(this.f35752q, bArr);
    }

    /* renamed from: l */
    public final boolean m1693l() {
        int i = this.f35746k;
        return i == 3 || i == 4;
    }

    /* renamed from: m */
    public final void m1692m(Exception exc) {
        this.f35751p = new InterfaceC3933d.C3934a(exc);
        throw null;
    }

    /* renamed from: n */
    public final void m1691n(Object obj) {
        if (m1693l()) {
            if (obj instanceof Exception) {
                m1690o((Exception) obj);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj;
                if (C1075dd.f6944d.equals(this.f35744i)) {
                    bArr = C2935sf.m10429b(bArr);
                }
                if (this.f35740e == 3) {
                    this.f35736a.m1655h(this.f35753r, bArr);
                    throw null;
                }
                byte[] m1655h = this.f35736a.m1655h(this.f35752q, bArr);
                int i = this.f35740e;
                if ((i == 2 || (i == 0 && this.f35753r != null)) && m1655h != null && m1655h.length != 0) {
                    this.f35753r = m1655h;
                }
                this.f35746k = 4;
                throw null;
            } catch (Exception e) {
                m1690o(e);
            }
        }
    }

    /* renamed from: o */
    public final void m1690o(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f35737b.mo1675b(this);
        } else {
            m1692m(exc);
        }
    }

    /* renamed from: p */
    public final void m1689p() {
        if (this.f35746k == 4) {
            this.f35746k = 3;
            m1692m(new ji0());
        }
    }

    /* renamed from: q */
    public void m1688q(int i) {
        if (m1693l()) {
            if (i == 1) {
                this.f35746k = 3;
                this.f35737b.mo1675b(this);
            } else if (i == 2) {
                m1697h(false);
            } else if (i != 3) {
            } else {
                m1689p();
            }
        }
    }

    /* renamed from: r */
    public void m1687r() {
        if (m1684u(false)) {
            m1697h(true);
        }
    }

    /* renamed from: s */
    public void m1686s(Exception exc) {
        m1692m(exc);
    }

    /* renamed from: t */
    public final void m1685t(Object obj) {
        if (this.f35746k == 2 || m1693l()) {
            if (obj instanceof Exception) {
                this.f35737b.mo1674c((Exception) obj);
                return;
            }
            try {
                this.f35736a.m1654i((byte[]) obj);
                this.f35737b.mo1672e();
            } catch (Exception e) {
                this.f35737b.mo1674c(e);
            }
        }
    }

    /* renamed from: u */
    public final boolean m1684u(boolean z) {
        if (m1693l()) {
            return true;
        }
        try {
            byte[] m1658e = this.f35736a.m1658e();
            this.f35752q = m1658e;
            this.f35750o = this.f35736a.m1661b(m1658e);
            this.f35746k = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.f35737b.mo1675b(this);
                return false;
            }
            m1692m(e);
            return false;
        } catch (Exception e2) {
            m1692m(e2);
            return false;
        }
    }

    /* renamed from: v */
    public final void m1683v(int i, boolean z) {
        try {
            InterfaceC3936f.InterfaceC3938b m1659d = this.f35736a.m1659d(i == 3 ? this.f35753r : this.f35752q, this.f35738c, this.f35739d, i, this.f35741f);
            if (C1075dd.f6944d.equals(this.f35744i)) {
                m1659d = new InterfaceC3936f.C3937a(C2935sf.m10430a(m1659d.mo1652b()), m1659d.mo1653a());
            }
            this.f35749n.m1677c(1, m1659d, z).sendToTarget();
        } catch (Exception e) {
            m1690o(e);
        }
    }

    /* renamed from: w */
    public void m1682w() {
        this.f35749n.m1677c(0, this.f35736a.m1660c(), true).sendToTarget();
    }

    /* renamed from: x */
    public boolean m1681x() {
        int i = this.f35747l - 1;
        this.f35747l = i;
        if (i == 0) {
            this.f35746k = 0;
            this.f35745j.removeCallbacksAndMessages(null);
            this.f35749n.removeCallbacksAndMessages(null);
            this.f35749n = null;
            this.f35748m.quit();
            this.f35748m = null;
            this.f35750o = null;
            this.f35751p = null;
            byte[] bArr = this.f35752q;
            if (bArr != null) {
                this.f35736a.m1656g(bArr);
                this.f35752q = null;
            }
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m1680y() {
        try {
            this.f35736a.m1657f(this.f35752q, this.f35753r);
            return true;
        } catch (Exception e) {
            m1692m(e);
            return false;
        }
    }
}
