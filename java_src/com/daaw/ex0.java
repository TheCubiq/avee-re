package com.daaw;

import android.os.Handler;
import android.os.Message;
import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class ex0 implements Handler.Callback {

    /* renamed from: A */
    public boolean f8891A;

    /* renamed from: p */
    public final InterfaceC2006l2 f8892p;

    /* renamed from: q */
    public final InterfaceC1231b f8893q;

    /* renamed from: u */
    public C3456wo f8897u;

    /* renamed from: v */
    public boolean f8898v;

    /* renamed from: w */
    public long f8899w;

    /* renamed from: z */
    public boolean f8902z;

    /* renamed from: t */
    public final TreeMap<Long, Long> f8896t = new TreeMap<>();

    /* renamed from: s */
    public final Handler f8895s = new Handler(this);

    /* renamed from: r */
    public final C1770iy f8894r = new C1770iy();

    /* renamed from: x */
    public long f8900x = -9223372036854775807L;

    /* renamed from: y */
    public long f8901y = -9223372036854775807L;

    /* renamed from: com.daaw.ex0$a */
    /* loaded from: classes.dex */
    public static final class C1230a {

        /* renamed from: a */
        public final long f8903a;

        /* renamed from: b */
        public final long f8904b;

        public C1230a(long j, long j2) {
            this.f8903a = j;
            this.f8904b = j2;
        }
    }

    /* renamed from: com.daaw.ex0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1231b {
        /* renamed from: a */
        void mo23067a();

        /* renamed from: b */
        void mo23066b(long j);

        /* renamed from: c */
        void mo23065c();
    }

    /* renamed from: com.daaw.ex0$c */
    /* loaded from: classes.dex */
    public final class C1232c implements sm1 {

        /* renamed from: a */
        public final b81 f8905a;

        /* renamed from: b */
        public final k30 f8906b = new k30();

        /* renamed from: c */
        public final tp0 f8907c = new tp0();

        public C1232c(b81 b81Var) {
            this.f8905a = b81Var;
        }

        @Override // com.daaw.sm1
        /* renamed from: a */
        public void mo10159a(long j, int i, int i2, int i3, sm1.C2956a c2956a) {
            this.f8905a.mo10159a(j, i, i2, i3, c2956a);
            m23058k();
        }

        @Override // com.daaw.sm1
        /* renamed from: b */
        public int mo10158b(a00 a00Var, int i, boolean z) {
            return this.f8905a.mo10158b(a00Var, i, z);
        }

        @Override // com.daaw.sm1
        /* renamed from: c */
        public void mo10157c(rv0 rv0Var, int i) {
            this.f8905a.mo10157c(rv0Var, i);
        }

        @Override // com.daaw.sm1
        /* renamed from: d */
        public void mo10156d(Format format) {
            this.f8905a.mo10156d(format);
        }

        /* renamed from: e */
        public final tp0 m23064e() {
            this.f8907c.mo3749f();
            if (this.f8905a.m26333y(this.f8906b, this.f8907c, false, false, 0L) == -4) {
                this.f8907c.m21350o();
                return this.f8907c;
            }
            return null;
        }

        /* renamed from: f */
        public boolean m23063f(long j) {
            return ex0.this.m23076l(j);
        }

        /* renamed from: g */
        public boolean m23062g(AbstractC1180ef abstractC1180ef) {
            return ex0.this.m23075m(abstractC1180ef);
        }

        /* renamed from: h */
        public void m23061h(AbstractC1180ef abstractC1180ef) {
            ex0.this.m23071q(abstractC1180ef);
        }

        /* renamed from: i */
        public final void m23060i(long j, long j2) {
            ex0.this.f8895s.sendMessage(ex0.this.f8895s.obtainMessage(2, new C1230a(j, j2)));
        }

        /* renamed from: j */
        public final void m23059j() {
            ex0.this.f8895s.sendMessage(ex0.this.f8895s.obtainMessage(1));
        }

        /* renamed from: k */
        public final void m23058k() {
            while (this.f8905a.m26337u()) {
                tp0 m23064e = m23064e();
                if (m23064e != null) {
                    long j = m23064e.f11566s;
                    EventMessage eventMessage = (EventMessage) ex0.this.f8894r.mo11098a(m23064e).m1649a(0);
                    if (ex0.m23078j(eventMessage.f35772p, eventMessage.f35773q)) {
                        m23057l(j, eventMessage);
                    }
                }
            }
            this.f8905a.m26346l();
        }

        /* renamed from: l */
        public final void m23057l(long j, EventMessage eventMessage) {
            long m23082f = ex0.m23082f(eventMessage);
            if (m23082f == -9223372036854775807L) {
                return;
            }
            if (ex0.m23079i(eventMessage)) {
                m23059j();
            } else {
                m23060i(j, m23082f);
            }
        }

        /* renamed from: m */
        public void m23056m() {
            this.f8905a.m26361C();
        }
    }

    public ex0(C3456wo c3456wo, InterfaceC1231b interfaceC1231b, InterfaceC2006l2 interfaceC2006l2) {
        this.f8897u = c3456wo;
        this.f8893q = interfaceC1231b;
        this.f8892p = interfaceC2006l2;
    }

    /* renamed from: f */
    public static long m23082f(EventMessage eventMessage) {
        try {
            return sq1.m10030O(new String(eventMessage.f35777u));
        } catch (tv0 unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: i */
    public static boolean m23079i(EventMessage eventMessage) {
        return eventMessage.f35775s == 0 && eventMessage.f35774r == 0;
    }

    /* renamed from: j */
    public static boolean m23078j(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* renamed from: e */
    public final Map.Entry<Long, Long> m23083e(long j) {
        return this.f8896t.ceilingEntry(Long.valueOf(j));
    }

    /* renamed from: g */
    public final void m23081g(long j, long j2) {
        Long l = this.f8896t.get(Long.valueOf(j2));
        if (l != null && l.longValue() <= j) {
            return;
        }
        this.f8896t.put(Long.valueOf(j2), Long.valueOf(j));
    }

    /* renamed from: h */
    public final void m23080h() {
        this.f8898v = true;
        m23072p();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f8891A) {
            return true;
        }
        int i = message.what;
        if (i == 1) {
            m23080h();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            C1230a c1230a = (C1230a) message.obj;
            m23081g(c1230a.f8903a, c1230a.f8904b);
            return true;
        }
    }

    /* renamed from: k */
    public final void m23077k() {
        long j = this.f8901y;
        if (j == -9223372036854775807L || j != this.f8900x) {
            this.f8902z = true;
            this.f8901y = this.f8900x;
            this.f8893q.mo23067a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m23076l(long j) {
        C3456wo c3456wo = this.f8897u;
        boolean z = false;
        if (c3456wo.f31404d) {
            if (this.f8902z) {
                return true;
            }
            if (!this.f8898v) {
                Map.Entry<Long, Long> m23083e = m23083e(c3456wo.f31408h);
                if (m23083e != null && m23083e.getValue().longValue() < j) {
                    this.f8899w = m23083e.getKey().longValue();
                    m23073o();
                }
                if (z) {
                    m23077k();
                }
                return z;
            }
            z = true;
            if (z) {
            }
            return z;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m23075m(AbstractC1180ef abstractC1180ef) {
        if (this.f8897u.f31404d) {
            if (this.f8902z) {
                return true;
            }
            long j = this.f8900x;
            if (j != -9223372036854775807L && j < abstractC1180ef.f8433f) {
                m23077k();
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: n */
    public C1232c m23074n() {
        return new C1232c(new b81(this.f8892p));
    }

    /* renamed from: o */
    public final void m23073o() {
        this.f8893q.mo23066b(this.f8899w);
    }

    /* renamed from: p */
    public final void m23072p() {
        this.f8893q.mo23065c();
    }

    /* renamed from: q */
    public void m23071q(AbstractC1180ef abstractC1180ef) {
        long j = this.f8900x;
        if (j != -9223372036854775807L || abstractC1180ef.f8434g > j) {
            this.f8900x = abstractC1180ef.f8434g;
        }
    }

    /* renamed from: r */
    public void m23070r() {
        this.f8891A = true;
        this.f8895s.removeCallbacksAndMessages(null);
    }

    /* renamed from: s */
    public final void m23069s() {
        Iterator<Map.Entry<Long, Long>> it = this.f8896t.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f8897u.f31408h) {
                it.remove();
            }
        }
    }

    /* renamed from: t */
    public void m23068t(C3456wo c3456wo) {
        this.f8902z = false;
        this.f8899w = -9223372036854775807L;
        this.f8897u = c3456wo;
        m23069s();
    }
}
