package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.daaw.bp0;
import com.daaw.cp0;
import com.daaw.ex0;
import com.daaw.jk0;
import com.daaw.lk0;
import com.daaw.mp;
import com.daaw.nl1;
import com.daaw.vo;
import com.daaw.vv0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class ap extends ua {
    public final cp0.a A;
    public final vv0.a<? extends wo> B;
    public final g C;
    public final Object D;
    public final SparseArray<zo> E;
    public final Runnable F;
    public final Runnable G;
    public final ex0.b H;
    public final lk0 I;
    public final Object J;
    public mp K;
    public jk0 L;
    public IOException M;
    public Handler N;
    public Uri O;
    public Uri P;
    public wo Q;
    public boolean R;
    public long S;
    public long T;
    public long U;
    public int V;
    public long W;
    public boolean X;
    public int Y;
    public final boolean u;
    public final mp.a v;
    public final vo.a w;
    public final wi x;
    public final int y;
    public final long z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ap.this.N();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ap.this.H(false);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends nl1 {
        public final long b;
        public final long c;
        public final int d;
        public final long e;
        public final long f;
        public final long g;
        public final wo h;
        public final Object i;

        public c(long j, long j2, int i, long j3, long j4, long j5, wo woVar, Object obj) {
            this.b = j;
            this.c = j2;
            this.d = i;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.h = woVar;
            this.i = obj;
        }

        @Override // com.daaw.nl1
        public int b(Object obj) {
            int intValue;
            int i;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= (i = this.d) && intValue < i + h()) {
                return intValue - this.d;
            }
            return -1;
        }

        @Override // com.daaw.nl1
        public nl1.b g(int i, nl1.b bVar, boolean z) {
            s6.c(i, 0, this.h.e());
            return bVar.o(z ? this.h.d(i).a : null, z ? Integer.valueOf(this.d + s6.c(i, 0, this.h.e())) : null, 0, this.h.g(i), dd.a(this.h.d(i).b - this.h.d(0).b) - this.e);
        }

        @Override // com.daaw.nl1
        public int h() {
            return this.h.e();
        }

        @Override // com.daaw.nl1
        public nl1.c m(int i, nl1.c cVar, boolean z, long j) {
            s6.c(i, 0, 1);
            long q = q(j);
            Object obj = z ? this.i : null;
            long j2 = this.b;
            long j3 = this.c;
            wo woVar = this.h;
            return cVar.e(obj, j2, j3, true, woVar.d, q, this.f, 0, woVar.e() - 1, this.e);
        }

        @Override // com.daaw.nl1
        public int n() {
            return 1;
        }

        public final long q(long j) {
            bp i;
            long j2 = this.g;
            wo woVar = this.h;
            if (woVar.d) {
                if (j > 0) {
                    j2 += j;
                    if (j2 > this.f) {
                        return -9223372036854775807L;
                    }
                }
                long j3 = this.e + j2;
                long g = woVar.g(0);
                int i2 = 0;
                while (i2 < this.h.e() - 1 && j3 >= g) {
                    j3 -= g;
                    i2++;
                    g = this.h.g(i2);
                }
                gw0 d = this.h.d(i2);
                int a = d.a(2);
                return (a == -1 || (i = d.c.get(a).c.get(0).i()) == null || i.h(g) == 0) ? j2 : (j2 + i.b(i.e(j3, g))) - j3;
            }
            return j2;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements ex0.b {
        public d() {
        }

        public /* synthetic */ d(ap apVar, a aVar) {
            this();
        }

        @Override // com.daaw.ex0.b
        public void a() {
            ap.this.z();
        }

        @Override // com.daaw.ex0.b
        public void b(long j) {
            ap.this.y(j);
        }

        @Override // com.daaw.ex0.b
        public void c() {
            ap.this.x();
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final vo.a a;
        public final mp.a b;
        public vv0.a<? extends wo> c;
        public boolean g;
        public Object h;
        public int e = 3;
        public long f = -1;
        public wi d = new nq();

        public e(vo.a aVar, mp.a aVar2) {
            this.a = (vo.a) s6.e(aVar);
            this.b = aVar2;
        }

        public ap a(Uri uri) {
            this.g = true;
            if (this.c == null) {
                this.c = new xo();
            }
            return new ap(null, (Uri) s6.e(uri), this.b, this.c, this.a, this.d, this.e, this.f, this.h, null);
        }

        public e b(vv0.a<? extends wo> aVar) {
            s6.f(!this.g);
            this.c = (vv0.a) s6.e(aVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements vv0.a<Long> {
        public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.daaw.vv0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = a.matcher(readLine);
                if (!matcher.matches()) {
                    throw new tv0("Couldn't parse timestamp: " + readLine);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw new tv0(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class g implements jk0.a<vv0<wo>> {
        public g() {
        }

        public /* synthetic */ g(ap apVar, a aVar) {
            this();
        }

        @Override // com.daaw.jk0.a
        /* renamed from: a */
        public void k(vv0<wo> vv0Var, long j, long j2, boolean z) {
            ap.this.A(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.a
        /* renamed from: b */
        public void o(vv0<wo> vv0Var, long j, long j2) {
            ap.this.B(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.a
        /* renamed from: c */
        public int r(vv0<wo> vv0Var, long j, long j2, IOException iOException) {
            return ap.this.C(vv0Var, j, j2, iOException);
        }
    }

    /* loaded from: classes.dex */
    public final class h implements lk0 {
        public h() {
        }

        @Override // com.daaw.lk0
        public void a() {
            ap.this.L.a();
            b();
        }

        public final void b() {
            if (ap.this.M != null) {
                throw ap.this.M;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class i {
        public final boolean a;
        public final long b;
        public final long c;

        public i(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
        }

        public static i a(gw0 gw0Var, long j) {
            int i;
            int size = gw0Var.c.size();
            int i2 = 0;
            long j2 = Long.MAX_VALUE;
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            long j3 = 0;
            while (i3 < size) {
                bp i4 = gw0Var.c.get(i3).c.get(i2).i();
                if (i4 == null) {
                    return new i(true, 0L, j);
                }
                z2 |= i4.f();
                int h = i4.h(j);
                if (h == 0) {
                    z = true;
                    i = i3;
                    j3 = 0;
                    j2 = 0;
                } else if (z) {
                    i = i3;
                } else {
                    long g = i4.g();
                    i = i3;
                    j3 = Math.max(j3, i4.b(g));
                    if (h != -1) {
                        long j4 = (g + h) - 1;
                        j2 = Math.min(j2, i4.b(j4) + i4.c(j4, j));
                    }
                }
                i3 = i + 1;
                i2 = 0;
            }
            return new i(z2, j3, j2);
        }
    }

    /* loaded from: classes.dex */
    public final class j implements jk0.a<vv0<Long>> {
        public j() {
        }

        public /* synthetic */ j(ap apVar, a aVar) {
            this();
        }

        @Override // com.daaw.jk0.a
        /* renamed from: a */
        public void k(vv0<Long> vv0Var, long j, long j2, boolean z) {
            ap.this.A(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.a
        /* renamed from: b */
        public void o(vv0<Long> vv0Var, long j, long j2) {
            ap.this.D(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.a
        /* renamed from: c */
        public int r(vv0<Long> vv0Var, long j, long j2, IOException iOException) {
            return ap.this.E(vv0Var, j, j2, iOException);
        }
    }

    /* loaded from: classes.dex */
    public static final class k implements vv0.a<Long> {
        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.daaw.vv0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(sq1.O(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        vz.a("goog.exo.dash");
    }

    public ap(wo woVar, Uri uri, mp.a aVar, vv0.a<? extends wo> aVar2, vo.a aVar3, wi wiVar, int i2, long j2, Object obj) {
        this.O = uri;
        this.Q = woVar;
        this.P = uri;
        this.v = aVar;
        this.B = aVar2;
        this.w = aVar3;
        this.y = i2;
        this.z = j2;
        this.x = wiVar;
        this.J = obj;
        boolean z = woVar != null;
        this.u = z;
        this.A = j(null);
        this.D = new Object();
        this.E = new SparseArray<>();
        this.H = new d(this, null);
        this.W = -9223372036854775807L;
        if (!z) {
            this.C = new g(this, null);
            this.I = new h();
            this.F = new a();
            this.G = new b();
            return;
        }
        s6.f(!woVar.d);
        this.C = null;
        this.F = null;
        this.G = null;
        this.I = new lk0.a();
    }

    public /* synthetic */ ap(wo woVar, Uri uri, mp.a aVar, vv0.a aVar2, vo.a aVar3, wi wiVar, int i2, long j2, Object obj, a aVar4) {
        this(woVar, uri, aVar, aVar2, aVar3, wiVar, i2, j2, obj);
    }

    public void A(vv0<?> vv0Var, long j2, long j3) {
        this.A.f(vv0Var.a, vv0Var.b, j2, j3, vv0Var.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(com.daaw.vv0<com.daaw.wo> r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ap.B(com.daaw.vv0, long, long):void");
    }

    public int C(vv0<wo> vv0Var, long j2, long j3, IOException iOException) {
        boolean z = iOException instanceof tv0;
        this.A.l(vv0Var.a, vv0Var.b, j2, j3, vv0Var.c(), iOException, z);
        return z ? 3 : 0;
    }

    public void D(vv0<Long> vv0Var, long j2, long j3) {
        this.A.i(vv0Var.a, vv0Var.b, j2, j3, vv0Var.c());
        G(vv0Var.d().longValue() - j2);
    }

    public int E(vv0<Long> vv0Var, long j2, long j3, IOException iOException) {
        this.A.l(vv0Var.a, vv0Var.b, j2, j3, vv0Var.c(), iOException, true);
        F(iOException);
        return 2;
    }

    public final void F(IOException iOException) {
        H(true);
    }

    public final void G(long j2) {
        this.U = j2;
        H(true);
    }

    public final void H(boolean z) {
        long j2;
        boolean z2;
        long j3;
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            int keyAt = this.E.keyAt(i2);
            if (keyAt >= this.Y) {
                this.E.valueAt(i2).H(this.Q, keyAt - this.Y);
            }
        }
        int e2 = this.Q.e() - 1;
        i a2 = i.a(this.Q.d(0), this.Q.g(0));
        i a3 = i.a(this.Q.d(e2), this.Q.g(e2));
        long j4 = a2.b;
        long j5 = a3.c;
        if (!this.Q.d || a3.a) {
            j2 = j4;
            z2 = false;
        } else {
            j5 = Math.min((w() - dd.a(this.Q.a)) - dd.a(this.Q.d(e2).b), j5);
            long j6 = this.Q.f;
            if (j6 != -9223372036854775807L) {
                long a4 = j5 - dd.a(j6);
                while (a4 < 0 && e2 > 0) {
                    e2--;
                    a4 += this.Q.g(e2);
                }
                j4 = e2 == 0 ? Math.max(j4, a4) : this.Q.g(0);
            }
            j2 = j4;
            z2 = true;
        }
        long j7 = j5 - j2;
        for (int i3 = 0; i3 < this.Q.e() - 1; i3++) {
            j7 += this.Q.g(i3);
        }
        wo woVar = this.Q;
        if (woVar.d) {
            long j8 = this.z;
            if (j8 == -1) {
                long j9 = woVar.g;
                if (j9 == -9223372036854775807L) {
                    j9 = 30000;
                }
                j8 = j9;
            }
            long a5 = j7 - dd.a(j8);
            if (a5 < 5000000) {
                a5 = Math.min(5000000L, j7 / 2);
            }
            j3 = a5;
        } else {
            j3 = 0;
        }
        wo woVar2 = this.Q;
        long b2 = woVar2.a + woVar2.d(0).b + dd.b(j2);
        wo woVar3 = this.Q;
        n(new c(woVar3.a, b2, this.Y, j2, j7, j3, woVar3, this.J), this.Q);
        if (this.u) {
            return;
        }
        this.N.removeCallbacks(this.G);
        if (z2) {
            this.N.postDelayed(this.G, 5000L);
        }
        if (this.R) {
            N();
        } else if (z) {
            wo woVar4 = this.Q;
            if (woVar4.d) {
                long j10 = woVar4.e;
                if (j10 != -9223372036854775807L) {
                    L(Math.max(0L, (this.S + (j10 != 0 ? j10 : 5000L)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void I(pq1 pq1Var) {
        vv0.a<Long> fVar;
        String str = pq1Var.a;
        if (sq1.b(str, "urn:mpeg:dash:utc:direct:2014") || sq1.b(str, "urn:mpeg:dash:utc:direct:2012")) {
            J(pq1Var);
            return;
        }
        if (sq1.b(str, "urn:mpeg:dash:utc:http-iso:2014") || sq1.b(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            fVar = new f();
        } else if (!sq1.b(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !sq1.b(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            F(new IOException("Unsupported UTC timing scheme"));
            return;
        } else {
            fVar = new k(null);
        }
        K(pq1Var, fVar);
    }

    public final void J(pq1 pq1Var) {
        try {
            G(sq1.O(pq1Var.b) - this.T);
        } catch (tv0 e2) {
            F(e2);
        }
    }

    public final void K(pq1 pq1Var, vv0.a<Long> aVar) {
        M(new vv0(this.K, Uri.parse(pq1Var.b), 5, aVar), new j(this, null), 1);
    }

    public final void L(long j2) {
        this.N.postDelayed(this.F, j2);
    }

    public final <T> void M(vv0<T> vv0Var, jk0.a<vv0<T>> aVar, int i2) {
        this.A.o(vv0Var.a, vv0Var.b, this.L.k(vv0Var, aVar, i2));
    }

    public final void N() {
        Uri uri;
        this.N.removeCallbacks(this.F);
        if (this.L.g()) {
            this.R = true;
            return;
        }
        synchronized (this.D) {
            uri = this.P;
        }
        this.R = false;
        M(new vv0(this.K, uri, 4, this.B), this.C, this.y);
    }

    @Override // com.daaw.bp0
    public void a(qo0 qo0Var) {
        zo zoVar = (zo) qo0Var;
        zoVar.C();
        this.E.remove(zoVar.p);
    }

    @Override // com.daaw.bp0
    public void e() {
        this.I.a();
    }

    @Override // com.daaw.bp0
    public qo0 g(bp0.a aVar, l2 l2Var) {
        int i2 = aVar.a;
        zo zoVar = new zo(this.Y + i2, this.Q, i2, this.w, this.y, l(aVar, this.Q.d(i2).b), this.U, this.I, l2Var, this.x, this.H);
        this.E.put(zoVar.p, zoVar);
        return zoVar;
    }

    @Override // com.daaw.ua
    public void m(rz rzVar, boolean z) {
        if (this.u) {
            H(false);
            return;
        }
        this.K = this.v.a();
        this.L = new jk0("Loader:DashMediaSource");
        this.N = new Handler();
        N();
    }

    @Override // com.daaw.ua
    public void p() {
        this.R = false;
        this.K = null;
        jk0 jk0Var = this.L;
        if (jk0Var != null) {
            jk0Var.i();
            this.L = null;
        }
        this.S = 0L;
        this.T = 0L;
        this.Q = this.u ? this.Q : null;
        this.P = this.O;
        this.M = null;
        Handler handler = this.N;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.N = null;
        }
        this.U = 0L;
        this.V = 0;
        this.W = -9223372036854775807L;
        this.X = false;
        this.Y = 0;
        this.E.clear();
    }

    public final long v() {
        return Math.min((this.V - 1) * 1000, 5000);
    }

    public final long w() {
        return dd.a(this.U != 0 ? SystemClock.elapsedRealtime() + this.U : System.currentTimeMillis());
    }

    public void x() {
        this.X = true;
    }

    public void y(long j2) {
        long j3 = this.W;
        if (j3 == -9223372036854775807L || j3 < j2) {
            this.W = j2;
        }
    }

    public void z() {
        this.N.removeCallbacks(this.G);
        N();
    }
}
