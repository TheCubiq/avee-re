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
    public boolean A;
    public final l2 p;
    public final b q;
    public wo u;
    public boolean v;
    public long w;
    public boolean z;
    public final TreeMap<Long, Long> t = new TreeMap<>();
    public final Handler s = new Handler(this);
    public final iy r = new iy();
    public long x = -9223372036854775807L;
    public long y = -9223372036854775807L;

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(long j);

        void c();
    }

    /* loaded from: classes.dex */
    public final class c implements sm1 {
        public final b81 a;
        public final k30 b = new k30();
        public final tp0 c = new tp0();

        public c(b81 b81Var) {
            this.a = b81Var;
        }

        @Override // com.daaw.sm1
        public void a(long j, int i, int i2, int i3, sm1.a aVar) {
            this.a.a(j, i, i2, i3, aVar);
            k();
        }

        @Override // com.daaw.sm1
        public int b(a00 a00Var, int i, boolean z) {
            return this.a.b(a00Var, i, z);
        }

        @Override // com.daaw.sm1
        public void c(rv0 rv0Var, int i) {
            this.a.c(rv0Var, i);
        }

        @Override // com.daaw.sm1
        public void d(Format format) {
            this.a.d(format);
        }

        public final tp0 e() {
            this.c.f();
            if (this.a.y(this.b, this.c, false, false, 0L) == -4) {
                this.c.o();
                return this.c;
            }
            return null;
        }

        public boolean f(long j) {
            return ex0.this.l(j);
        }

        public boolean g(ef efVar) {
            return ex0.this.m(efVar);
        }

        public void h(ef efVar) {
            ex0.this.q(efVar);
        }

        public final void i(long j, long j2) {
            ex0.this.s.sendMessage(ex0.this.s.obtainMessage(2, new a(j, j2)));
        }

        public final void j() {
            ex0.this.s.sendMessage(ex0.this.s.obtainMessage(1));
        }

        public final void k() {
            while (this.a.u()) {
                tp0 e = e();
                if (e != null) {
                    long j = e.s;
                    EventMessage eventMessage = (EventMessage) ex0.this.r.a(e).a(0);
                    if (ex0.j(eventMessage.p, eventMessage.q)) {
                        l(j, eventMessage);
                    }
                }
            }
            this.a.l();
        }

        public final void l(long j, EventMessage eventMessage) {
            long f = ex0.f(eventMessage);
            if (f == -9223372036854775807L) {
                return;
            }
            if (ex0.i(eventMessage)) {
                j();
            } else {
                i(j, f);
            }
        }

        public void m() {
            this.a.C();
        }
    }

    public ex0(wo woVar, b bVar, l2 l2Var) {
        this.u = woVar;
        this.q = bVar;
        this.p = l2Var;
    }

    public static long f(EventMessage eventMessage) {
        try {
            return sq1.O(new String(eventMessage.u));
        } catch (tv0 unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean i(EventMessage eventMessage) {
        return eventMessage.s == 0 && eventMessage.r == 0;
    }

    public static boolean j(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public final Map.Entry<Long, Long> e(long j) {
        return this.t.ceilingEntry(Long.valueOf(j));
    }

    public final void g(long j, long j2) {
        Long l = this.t.get(Long.valueOf(j2));
        if (l != null && l.longValue() <= j) {
            return;
        }
        this.t.put(Long.valueOf(j2), Long.valueOf(j));
    }

    public final void h() {
        this.v = true;
        p();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.A) {
            return true;
        }
        int i = message.what;
        if (i == 1) {
            h();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            a aVar = (a) message.obj;
            g(aVar.a, aVar.b);
            return true;
        }
    }

    public final void k() {
        long j = this.y;
        if (j == -9223372036854775807L || j != this.x) {
            this.z = true;
            this.y = this.x;
            this.q.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(long r7) {
        /*
            r6 = this;
            com.daaw.wo r0 = r6.u
            boolean r1 = r0.d
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            boolean r1 = r6.z
            r3 = 1
            if (r1 == 0) goto Le
            return r3
        Le:
            boolean r1 = r6.v
            if (r1 == 0) goto L14
        L12:
            r2 = 1
            goto L3a
        L14:
            long r0 = r0.h
            java.util.Map$Entry r0 = r6.e(r0)
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r0.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L3a
            java.lang.Object r7 = r0.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            r6.w = r7
            r6.o()
            goto L12
        L3a:
            if (r2 == 0) goto L3f
            r6.k()
        L3f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ex0.l(long):boolean");
    }

    public boolean m(ef efVar) {
        if (this.u.d) {
            if (this.z) {
                return true;
            }
            long j = this.x;
            if (j != -9223372036854775807L && j < efVar.f) {
                k();
                return true;
            }
            return false;
        }
        return false;
    }

    public c n() {
        return new c(new b81(this.p));
    }

    public final void o() {
        this.q.b(this.w);
    }

    public final void p() {
        this.q.c();
    }

    public void q(ef efVar) {
        long j = this.x;
        if (j != -9223372036854775807L || efVar.g > j) {
            this.x = efVar.g;
        }
    }

    public void r() {
        this.A = true;
        this.s.removeCallbacksAndMessages(null);
    }

    public final void s() {
        Iterator<Map.Entry<Long, Long>> it = this.t.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.u.h) {
                it.remove();
            }
        }
    }

    public void t(wo woVar) {
        this.z = false;
        this.w = -9223372036854775807L;
        this.u = woVar;
        s();
    }
}
