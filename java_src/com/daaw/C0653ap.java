package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.daaw.InterfaceC2200mp;
import com.daaw.InterfaceC3356vo;
import com.daaw.bp0;
import com.daaw.cp0;
import com.daaw.ex0;
import com.daaw.jk0;
import com.daaw.lk0;
import com.daaw.nl1;
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
/* renamed from: com.daaw.ap */
/* loaded from: classes.dex */
public final class C0653ap extends AbstractC3190ua {

    /* renamed from: A */
    public final cp0.C0975a f3360A;

    /* renamed from: B */
    public final vv0.InterfaceC3379a<? extends C3456wo> f3361B;

    /* renamed from: C */
    public final C0660g f3362C;

    /* renamed from: D */
    public final Object f3363D;

    /* renamed from: E */
    public final SparseArray<C3882zo> f3364E;

    /* renamed from: F */
    public final Runnable f3365F;

    /* renamed from: G */
    public final Runnable f3366G;

    /* renamed from: H */
    public final ex0.InterfaceC1231b f3367H;

    /* renamed from: I */
    public final lk0 f3368I;

    /* renamed from: J */
    public final Object f3369J;

    /* renamed from: K */
    public InterfaceC2200mp f3370K;

    /* renamed from: L */
    public jk0 f3371L;

    /* renamed from: M */
    public IOException f3372M;

    /* renamed from: N */
    public Handler f3373N;

    /* renamed from: O */
    public Uri f3374O;

    /* renamed from: P */
    public Uri f3375P;

    /* renamed from: Q */
    public C3456wo f3376Q;

    /* renamed from: R */
    public boolean f3377R;

    /* renamed from: S */
    public long f3378S;

    /* renamed from: T */
    public long f3379T;

    /* renamed from: U */
    public long f3380U;

    /* renamed from: V */
    public int f3381V;

    /* renamed from: W */
    public long f3382W;

    /* renamed from: X */
    public boolean f3383X;

    /* renamed from: Y */
    public int f3384Y;

    /* renamed from: u */
    public final boolean f3385u;

    /* renamed from: v */
    public final InterfaceC2200mp.InterfaceC2201a f3386v;

    /* renamed from: w */
    public final InterfaceC3356vo.InterfaceC3357a f3387w;

    /* renamed from: x */
    public final InterfaceC3441wi f3388x;

    /* renamed from: y */
    public final int f3389y;

    /* renamed from: z */
    public final long f3390z;

    /* renamed from: com.daaw.ap$a */
    /* loaded from: classes.dex */
    public class RunnableC0654a implements Runnable {
        public RunnableC0654a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0653ap.this.m27299N();
        }
    }

    /* renamed from: com.daaw.ap$b */
    /* loaded from: classes.dex */
    public class RunnableC0655b implements Runnable {
        public RunnableC0655b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0653ap.this.m27305H(false);
        }
    }

    /* renamed from: com.daaw.ap$c */
    /* loaded from: classes.dex */
    public static final class C0656c extends nl1 {

        /* renamed from: b */
        public final long f3393b;

        /* renamed from: c */
        public final long f3394c;

        /* renamed from: d */
        public final int f3395d;

        /* renamed from: e */
        public final long f3396e;

        /* renamed from: f */
        public final long f3397f;

        /* renamed from: g */
        public final long f3398g;

        /* renamed from: h */
        public final C3456wo f3399h;

        /* renamed from: i */
        public final Object f3400i;

        public C0656c(long j, long j2, int i, long j3, long j4, long j5, C3456wo c3456wo, Object obj) {
            this.f3393b = j;
            this.f3394c = j2;
            this.f3395d = i;
            this.f3396e = j3;
            this.f3397f = j4;
            this.f3398g = j5;
            this.f3399h = c3456wo;
            this.f3400i = obj;
        }

        @Override // com.daaw.nl1
        /* renamed from: b */
        public int mo14379b(Object obj) {
            int intValue;
            int i;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= (i = this.f3395d) && intValue < i + mo14377h()) {
                return intValue - this.f3395d;
            }
            return -1;
        }

        @Override // com.daaw.nl1
        /* renamed from: g */
        public nl1.C2314b mo14378g(int i, nl1.C2314b c2314b, boolean z) {
            C2914s6.m10688c(i, 0, this.f3399h.m5923e());
            return c2314b.m15057o(z ? this.f3399h.m5924d(i).f11772a : null, z ? Integer.valueOf(this.f3395d + C2914s6.m10688c(i, 0, this.f3399h.m5923e())) : null, 0, this.f3399h.m5921g(i), C1075dd.m24527a(this.f3399h.m5924d(i).f11773b - this.f3399h.m5924d(0).f11773b) - this.f3396e);
        }

        @Override // com.daaw.nl1
        /* renamed from: h */
        public int mo14377h() {
            return this.f3399h.m5923e();
        }

        @Override // com.daaw.nl1
        /* renamed from: m */
        public nl1.C2315c mo14376m(int i, nl1.C2315c c2315c, boolean z, long j) {
            C2914s6.m10688c(i, 0, 1);
            long m27289q = m27289q(j);
            Object obj = z ? this.f3400i : null;
            long j2 = this.f3393b;
            long j3 = this.f3394c;
            C3456wo c3456wo = this.f3399h;
            return c2315c.m15051e(obj, j2, j3, true, c3456wo.f31404d, m27289q, this.f3397f, 0, c3456wo.m5923e() - 1, this.f3396e);
        }

        @Override // com.daaw.nl1
        /* renamed from: n */
        public int mo14375n() {
            return 1;
        }

        /* renamed from: q */
        public final long m27289q(long j) {
            InterfaceC0879bp mo19086i;
            long j2 = this.f3398g;
            C3456wo c3456wo = this.f3399h;
            if (c3456wo.f31404d) {
                if (j > 0) {
                    j2 += j;
                    if (j2 > this.f3397f) {
                        return -9223372036854775807L;
                    }
                }
                long j3 = this.f3396e + j2;
                long m5921g = c3456wo.m5921g(0);
                int i = 0;
                while (i < this.f3399h.m5923e() - 1 && j3 >= m5921g) {
                    j3 -= m5921g;
                    i++;
                    m5921g = this.f3399h.m5921g(i);
                }
                gw0 m5924d = this.f3399h.m5924d(i);
                int m21197a = m5924d.m21197a(2);
                return (m21197a == -1 || (mo19086i = m5924d.f11774c.get(m21197a).f8023c.get(0).mo19086i()) == null || mo19086i.mo12605h(m5921g) == 0) ? j2 : (j2 + mo19086i.mo12611b(mo19086i.mo12608e(j3, m5921g))) - j3;
            }
            return j2;
        }
    }

    /* renamed from: com.daaw.ap$d */
    /* loaded from: classes.dex */
    public final class C0657d implements ex0.InterfaceC1231b {
        public C0657d() {
        }

        public /* synthetic */ C0657d(C0653ap c0653ap, RunnableC0654a runnableC0654a) {
            this();
        }

        @Override // com.daaw.ex0.InterfaceC1231b
        /* renamed from: a */
        public void mo23067a() {
            C0653ap.this.m27290z();
        }

        @Override // com.daaw.ex0.InterfaceC1231b
        /* renamed from: b */
        public void mo23066b(long j) {
            C0653ap.this.m27291y(j);
        }

        @Override // com.daaw.ex0.InterfaceC1231b
        /* renamed from: c */
        public void mo23065c() {
            C0653ap.this.m27292x();
        }
    }

    /* renamed from: com.daaw.ap$e */
    /* loaded from: classes.dex */
    public static final class C0658e {

        /* renamed from: a */
        public final InterfaceC3356vo.InterfaceC3357a f3402a;

        /* renamed from: b */
        public final InterfaceC2200mp.InterfaceC2201a f3403b;

        /* renamed from: c */
        public vv0.InterfaceC3379a<? extends C3456wo> f3404c;

        /* renamed from: g */
        public boolean f3408g;

        /* renamed from: h */
        public Object f3409h;

        /* renamed from: e */
        public int f3406e = 3;

        /* renamed from: f */
        public long f3407f = -1;

        /* renamed from: d */
        public InterfaceC3441wi f3405d = new C2358nq();

        public C0658e(InterfaceC3356vo.InterfaceC3357a interfaceC3357a, InterfaceC2200mp.InterfaceC2201a interfaceC2201a) {
            this.f3402a = (InterfaceC3356vo.InterfaceC3357a) C2914s6.m10686e(interfaceC3357a);
            this.f3403b = interfaceC2201a;
        }

        /* renamed from: a */
        public C0653ap m27288a(Uri uri) {
            this.f3408g = true;
            if (this.f3404c == null) {
                this.f3404c = new C3561xo();
            }
            return new C0653ap(null, (Uri) C2914s6.m10686e(uri), this.f3403b, this.f3404c, this.f3402a, this.f3405d, this.f3406e, this.f3407f, this.f3409h, null);
        }

        /* renamed from: b */
        public C0658e m27287b(vv0.InterfaceC3379a<? extends C3456wo> interfaceC3379a) {
            C2914s6.m10685f(!this.f3408g);
            this.f3404c = (vv0.InterfaceC3379a) C2914s6.m10686e(interfaceC3379a);
            return this;
        }
    }

    /* renamed from: com.daaw.ap$f */
    /* loaded from: classes.dex */
    public static final class C0659f implements vv0.InterfaceC3379a<Long> {

        /* renamed from: a */
        public static final Pattern f3410a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.daaw.vv0.InterfaceC3379a
        /* renamed from: b */
        public Long mo3834a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = f3410a.matcher(readLine);
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

    /* renamed from: com.daaw.ap$g */
    /* loaded from: classes.dex */
    public final class C0660g implements jk0.InterfaceC1834a<vv0<C3456wo>> {
        public C0660g() {
        }

        public /* synthetic */ C0660g(C0653ap c0653ap, RunnableC0654a runnableC0654a) {
            this();
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: a */
        public void mo11472k(vv0<C3456wo> vv0Var, long j, long j2, boolean z) {
            C0653ap.this.m27312A(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: b */
        public void mo11469o(vv0<C3456wo> vv0Var, long j, long j2) {
            C0653ap.this.m27311B(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: c */
        public int mo11468r(vv0<C3456wo> vv0Var, long j, long j2, IOException iOException) {
            return C0653ap.this.m27310C(vv0Var, j, j2, iOException);
        }
    }

    /* renamed from: com.daaw.ap$h */
    /* loaded from: classes.dex */
    public final class C0661h implements lk0 {
        public C0661h() {
        }

        @Override // com.daaw.lk0
        /* renamed from: a */
        public void mo16893a() {
            C0653ap.this.f3371L.mo16893a();
            m27282b();
        }

        /* renamed from: b */
        public final void m27282b() {
            if (C0653ap.this.f3372M != null) {
                throw C0653ap.this.f3372M;
            }
        }
    }

    /* renamed from: com.daaw.ap$i */
    /* loaded from: classes.dex */
    public static final class C0662i {

        /* renamed from: a */
        public final boolean f3413a;

        /* renamed from: b */
        public final long f3414b;

        /* renamed from: c */
        public final long f3415c;

        public C0662i(boolean z, long j, long j2) {
            this.f3413a = z;
            this.f3414b = j;
            this.f3415c = j2;
        }

        /* renamed from: a */
        public static C0662i m27281a(gw0 gw0Var, long j) {
            int i;
            int size = gw0Var.f11774c.size();
            int i2 = 0;
            long j2 = Long.MAX_VALUE;
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            long j3 = 0;
            while (i3 < size) {
                InterfaceC0879bp mo19086i = gw0Var.f11774c.get(i3).f8023c.get(i2).mo19086i();
                if (mo19086i == null) {
                    return new C0662i(true, 0L, j);
                }
                z2 |= mo19086i.mo12607f();
                int mo12605h = mo19086i.mo12605h(j);
                if (mo12605h == 0) {
                    z = true;
                    i = i3;
                    j3 = 0;
                    j2 = 0;
                } else if (z) {
                    i = i3;
                } else {
                    long mo12606g = mo19086i.mo12606g();
                    i = i3;
                    j3 = Math.max(j3, mo19086i.mo12611b(mo12606g));
                    if (mo12605h != -1) {
                        long j4 = (mo12606g + mo12605h) - 1;
                        j2 = Math.min(j2, mo19086i.mo12611b(j4) + mo19086i.mo12610c(j4, j));
                    }
                }
                i3 = i + 1;
                i2 = 0;
            }
            return new C0662i(z2, j3, j2);
        }
    }

    /* renamed from: com.daaw.ap$j */
    /* loaded from: classes.dex */
    public final class C0663j implements jk0.InterfaceC1834a<vv0<Long>> {
        public C0663j() {
        }

        public /* synthetic */ C0663j(C0653ap c0653ap, RunnableC0654a runnableC0654a) {
            this();
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: a */
        public void mo11472k(vv0<Long> vv0Var, long j, long j2, boolean z) {
            C0653ap.this.m27312A(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: b */
        public void mo11469o(vv0<Long> vv0Var, long j, long j2) {
            C0653ap.this.m27309D(vv0Var, j, j2);
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: c */
        public int mo11468r(vv0<Long> vv0Var, long j, long j2, IOException iOException) {
            return C0653ap.this.m27308E(vv0Var, j, j2, iOException);
        }
    }

    /* renamed from: com.daaw.ap$k */
    /* loaded from: classes.dex */
    public static final class C0664k implements vv0.InterfaceC3379a<Long> {
        public C0664k() {
        }

        public /* synthetic */ C0664k(RunnableC0654a runnableC0654a) {
            this();
        }

        @Override // com.daaw.vv0.InterfaceC3379a
        /* renamed from: b */
        public Long mo3834a(Uri uri, InputStream inputStream) {
            return Long.valueOf(sq1.m10030O(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        C3387vz.m6643a("goog.exo.dash");
    }

    public C0653ap(C3456wo c3456wo, Uri uri, InterfaceC2200mp.InterfaceC2201a interfaceC2201a, vv0.InterfaceC3379a<? extends C3456wo> interfaceC3379a, InterfaceC3356vo.InterfaceC3357a interfaceC3357a, InterfaceC3441wi interfaceC3441wi, int i, long j, Object obj) {
        this.f3374O = uri;
        this.f3376Q = c3456wo;
        this.f3375P = uri;
        this.f3386v = interfaceC2201a;
        this.f3361B = interfaceC3379a;
        this.f3387w = interfaceC3357a;
        this.f3389y = i;
        this.f3390z = j;
        this.f3388x = interfaceC3441wi;
        this.f3369J = obj;
        boolean z = c3456wo != null;
        this.f3385u = z;
        this.f3360A = m8400j(null);
        this.f3363D = new Object();
        this.f3364E = new SparseArray<>();
        this.f3367H = new C0657d(this, null);
        this.f3382W = -9223372036854775807L;
        if (!z) {
            this.f3362C = new C0660g(this, null);
            this.f3368I = new C0661h();
            this.f3365F = new RunnableC0654a();
            this.f3366G = new RunnableC0655b();
            return;
        }
        C2914s6.m10685f(!c3456wo.f31404d);
        this.f3362C = null;
        this.f3365F = null;
        this.f3366G = null;
        this.f3368I = new lk0.C2054a();
    }

    public /* synthetic */ C0653ap(C3456wo c3456wo, Uri uri, InterfaceC2200mp.InterfaceC2201a interfaceC2201a, vv0.InterfaceC3379a interfaceC3379a, InterfaceC3356vo.InterfaceC3357a interfaceC3357a, InterfaceC3441wi interfaceC3441wi, int i, long j, Object obj, RunnableC0654a runnableC0654a) {
        this(c3456wo, uri, interfaceC2201a, interfaceC3379a, interfaceC3357a, interfaceC3441wi, i, j, obj);
    }

    /* renamed from: A */
    public void m27312A(vv0<?> vv0Var, long j, long j2) {
        this.f3360A.m25162f(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27311B(vv0<C3456wo> vv0Var, long j, long j2) {
        boolean z;
        this.f3360A.m25159i(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c());
        C3456wo m6737d = vv0Var.m6737d();
        C3456wo c3456wo = this.f3376Q;
        int m5923e = c3456wo == null ? 0 : c3456wo.m5923e();
        long j3 = m6737d.m5924d(0).f11773b;
        int i = 0;
        while (i < m5923e && this.f3376Q.m5924d(i).f11773b < j3) {
            i++;
        }
        if (m6737d.f31404d) {
            if (m5923e - i <= m6737d.m5923e()) {
                if (!this.f3383X) {
                    long j4 = this.f3382W;
                    if (j4 == -9223372036854775807L || m6737d.f31408h * 1000 > j4) {
                        z = false;
                        if (!z) {
                            int i2 = this.f3381V;
                            this.f3381V = i2 + 1;
                            if (i2 < this.f3389y) {
                                m27301L(m27294v());
                                return;
                            } else {
                                this.f3372M = new C3733yo();
                                return;
                            }
                        }
                        this.f3381V = 0;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Loaded stale dynamic manifest: ");
                sb.append(m6737d.f31408h);
                sb.append(", ");
                sb.append(this.f3383X);
                sb.append(", ");
                sb.append(this.f3382W);
            }
            z = true;
            if (!z) {
            }
        }
        this.f3376Q = m6737d;
        this.f3377R &= m6737d.f31404d;
        this.f3378S = j - j2;
        this.f3379T = j;
        if (m6737d.f31410j != null) {
            synchronized (this.f3363D) {
                if (vv0Var.f30638a.f23115a == this.f3375P) {
                    this.f3375P = this.f3376Q.f31410j;
                }
            }
        }
        if (m5923e == 0) {
            pq1 pq1Var = this.f3376Q.f31409i;
            if (pq1Var != null) {
                m27304I(pq1Var);
                return;
            }
        } else {
            this.f3384Y += i;
        }
        m27305H(true);
    }

    /* renamed from: C */
    public int m27310C(vv0<C3456wo> vv0Var, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof tv0;
        this.f3360A.m25156l(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c(), iOException, z);
        return z ? 3 : 0;
    }

    /* renamed from: D */
    public void m27309D(vv0<Long> vv0Var, long j, long j2) {
        this.f3360A.m25159i(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c());
        m27306G(vv0Var.m6737d().longValue() - j);
    }

    /* renamed from: E */
    public int m27308E(vv0<Long> vv0Var, long j, long j2, IOException iOException) {
        this.f3360A.m25156l(vv0Var.f30638a, vv0Var.f30639b, j, j2, vv0Var.m6738c(), iOException, true);
        m27307F(iOException);
        return 2;
    }

    /* renamed from: F */
    public final void m27307F(IOException iOException) {
        m27305H(true);
    }

    /* renamed from: G */
    public final void m27306G(long j) {
        this.f3380U = j;
        m27305H(true);
    }

    /* renamed from: H */
    public final void m27305H(boolean z) {
        long j;
        boolean z2;
        long j2;
        for (int i = 0; i < this.f3364E.size(); i++) {
            int keyAt = this.f3364E.keyAt(i);
            if (keyAt >= this.f3384Y) {
                this.f3364E.valueAt(i).m2088H(this.f3376Q, keyAt - this.f3384Y);
            }
        }
        int m5923e = this.f3376Q.m5923e() - 1;
        C0662i m27281a = C0662i.m27281a(this.f3376Q.m5924d(0), this.f3376Q.m5921g(0));
        C0662i m27281a2 = C0662i.m27281a(this.f3376Q.m5924d(m5923e), this.f3376Q.m5921g(m5923e));
        long j3 = m27281a.f3414b;
        long j4 = m27281a2.f3415c;
        if (!this.f3376Q.f31404d || m27281a2.f3413a) {
            j = j3;
            z2 = false;
        } else {
            j4 = Math.min((m27293w() - C1075dd.m24527a(this.f3376Q.f31401a)) - C1075dd.m24527a(this.f3376Q.m5924d(m5923e).f11773b), j4);
            long j5 = this.f3376Q.f31406f;
            if (j5 != -9223372036854775807L) {
                long m24527a = j4 - C1075dd.m24527a(j5);
                while (m24527a < 0 && m5923e > 0) {
                    m5923e--;
                    m24527a += this.f3376Q.m5921g(m5923e);
                }
                j3 = m5923e == 0 ? Math.max(j3, m24527a) : this.f3376Q.m5921g(0);
            }
            j = j3;
            z2 = true;
        }
        long j6 = j4 - j;
        for (int i2 = 0; i2 < this.f3376Q.m5923e() - 1; i2++) {
            j6 += this.f3376Q.m5921g(i2);
        }
        C3456wo c3456wo = this.f3376Q;
        if (c3456wo.f31404d) {
            long j7 = this.f3390z;
            if (j7 == -1) {
                long j8 = c3456wo.f31407g;
                if (j8 == -9223372036854775807L) {
                    j8 = 30000;
                }
                j7 = j8;
            }
            long m24527a2 = j6 - C1075dd.m24527a(j7);
            if (m24527a2 < 5000000) {
                m24527a2 = Math.min(5000000L, j6 / 2);
            }
            j2 = m24527a2;
        } else {
            j2 = 0;
        }
        C3456wo c3456wo2 = this.f3376Q;
        long m24526b = c3456wo2.f31401a + c3456wo2.m5924d(0).f11773b + C1075dd.m24526b(j);
        C3456wo c3456wo3 = this.f3376Q;
        m8397n(new C0656c(c3456wo3.f31401a, m24526b, this.f3384Y, j, j6, j2, c3456wo3, this.f3369J), this.f3376Q);
        if (this.f3385u) {
            return;
        }
        this.f3373N.removeCallbacks(this.f3366G);
        if (z2) {
            this.f3373N.postDelayed(this.f3366G, 5000L);
        }
        if (this.f3377R) {
            m27299N();
        } else if (z) {
            C3456wo c3456wo4 = this.f3376Q;
            if (c3456wo4.f31404d) {
                long j9 = c3456wo4.f31405e;
                if (j9 != -9223372036854775807L) {
                    m27301L(Math.max(0L, (this.f3378S + (j9 != 0 ? j9 : 5000L)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* renamed from: I */
    public final void m27304I(pq1 pq1Var) {
        vv0.InterfaceC3379a<Long> c0659f;
        String str = pq1Var.f23180a;
        if (sq1.m10016b(str, "urn:mpeg:dash:utc:direct:2014") || sq1.m10016b(str, "urn:mpeg:dash:utc:direct:2012")) {
            m27303J(pq1Var);
            return;
        }
        if (sq1.m10016b(str, "urn:mpeg:dash:utc:http-iso:2014") || sq1.m10016b(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            c0659f = new C0659f();
        } else if (!sq1.m10016b(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !sq1.m10016b(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m27307F(new IOException("Unsupported UTC timing scheme"));
            return;
        } else {
            c0659f = new C0664k(null);
        }
        m27302K(pq1Var, c0659f);
    }

    /* renamed from: J */
    public final void m27303J(pq1 pq1Var) {
        try {
            m27306G(sq1.m10030O(pq1Var.f23181b) - this.f3379T);
        } catch (tv0 e) {
            m27307F(e);
        }
    }

    /* renamed from: K */
    public final void m27302K(pq1 pq1Var, vv0.InterfaceC3379a<Long> interfaceC3379a) {
        m27300M(new vv0(this.f3370K, Uri.parse(pq1Var.f23181b), 5, interfaceC3379a), new C0663j(this, null), 1);
    }

    /* renamed from: L */
    public final void m27301L(long j) {
        this.f3373N.postDelayed(this.f3365F, j);
    }

    /* renamed from: M */
    public final <T> void m27300M(vv0<T> vv0Var, jk0.InterfaceC1834a<vv0<T>> interfaceC1834a, int i) {
        this.f3360A.m25153o(vv0Var.f30638a, vv0Var.f30639b, this.f3371L.m18461k(vv0Var, interfaceC1834a, i));
    }

    /* renamed from: N */
    public final void m27299N() {
        Uri uri;
        this.f3373N.removeCallbacks(this.f3365F);
        if (this.f3371L.m18465g()) {
            this.f3377R = true;
            return;
        }
        synchronized (this.f3363D) {
            uri = this.f3375P;
        }
        this.f3377R = false;
        m27300M(new vv0(this.f3370K, uri, 4, this.f3361B), this.f3362C, this.f3389y);
    }

    @Override // com.daaw.bp0
    /* renamed from: a */
    public void mo16120a(qo0 qo0Var) {
        C3882zo c3882zo = (C3882zo) qo0Var;
        c3882zo.m2093C();
        this.f3364E.remove(c3882zo.f35282p);
    }

    @Override // com.daaw.bp0
    /* renamed from: e */
    public void mo16119e() {
        this.f3368I.mo16893a();
    }

    @Override // com.daaw.bp0
    /* renamed from: g */
    public qo0 mo16118g(bp0.C0880a c0880a, InterfaceC2006l2 interfaceC2006l2) {
        int i = c0880a.f5022a;
        C3882zo c3882zo = new C3882zo(this.f3384Y + i, this.f3376Q, i, this.f3387w, this.f3389y, m8399l(c0880a, this.f3376Q.m5924d(i).f11773b), this.f3380U, this.f3368I, interfaceC2006l2, this.f3388x, this.f3367H);
        this.f3364E.put(c3882zo.f35282p, c3882zo);
        return c3882zo;
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: m */
    public void mo8398m(InterfaceC2898rz interfaceC2898rz, boolean z) {
        if (this.f3385u) {
            m27305H(false);
            return;
        }
        this.f3370K = this.f3386v.mo9376a();
        this.f3371L = new jk0("Loader:DashMediaSource");
        this.f3373N = new Handler();
        m27299N();
    }

    @Override // com.daaw.AbstractC3190ua
    /* renamed from: p */
    public void mo8396p() {
        this.f3377R = false;
        this.f3370K = null;
        jk0 jk0Var = this.f3371L;
        if (jk0Var != null) {
            jk0Var.m18463i();
            this.f3371L = null;
        }
        this.f3378S = 0L;
        this.f3379T = 0L;
        this.f3376Q = this.f3385u ? this.f3376Q : null;
        this.f3375P = this.f3374O;
        this.f3372M = null;
        Handler handler = this.f3373N;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3373N = null;
        }
        this.f3380U = 0L;
        this.f3381V = 0;
        this.f3382W = -9223372036854775807L;
        this.f3383X = false;
        this.f3384Y = 0;
        this.f3364E.clear();
    }

    /* renamed from: v */
    public final long m27294v() {
        return Math.min((this.f3381V - 1) * 1000, 5000);
    }

    /* renamed from: w */
    public final long m27293w() {
        return C1075dd.m24527a(this.f3380U != 0 ? SystemClock.elapsedRealtime() + this.f3380U : System.currentTimeMillis());
    }

    /* renamed from: x */
    public void m27292x() {
        this.f3383X = true;
    }

    /* renamed from: y */
    public void m27291y(long j) {
        long j2 = this.f3382W;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f3382W = j;
        }
    }

    /* renamed from: z */
    public void m27290z() {
        this.f3373N.removeCallbacks(this.f3366G);
        m27299N();
    }
}
