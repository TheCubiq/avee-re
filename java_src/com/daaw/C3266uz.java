package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.daaw.C2204mr;
import com.daaw.bp0;
import com.daaw.fx0;
import com.daaw.nl1;
import com.daaw.qo0;
import com.daaw.wm1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.daaw.uz */
/* loaded from: classes.dex */
public final class C3266uz implements Handler.Callback, qo0.InterfaceC2744a, wm1.InterfaceC3449a, bp0.InterfaceC0881b, C2204mr.InterfaceC2205a, fx0.InterfaceC1342a {

    /* renamed from: A */
    public final long f29614A;

    /* renamed from: B */
    public final boolean f29615B;

    /* renamed from: C */
    public final C2204mr f29616C;

    /* renamed from: E */
    public final ArrayList<C3269c> f29618E;

    /* renamed from: F */
    public final InterfaceC3836zf f29619F;

    /* renamed from: I */
    public yw0 f29622I;

    /* renamed from: J */
    public bp0 f29623J;

    /* renamed from: K */
    public a41[] f29624K;

    /* renamed from: L */
    public boolean f29625L;

    /* renamed from: M */
    public boolean f29626M;

    /* renamed from: N */
    public boolean f29627N;

    /* renamed from: O */
    public int f29628O;

    /* renamed from: P */
    public boolean f29629P;

    /* renamed from: Q */
    public int f29630Q;

    /* renamed from: R */
    public C3271e f29631R;

    /* renamed from: S */
    public long f29632S;

    /* renamed from: T */
    public int f29633T;

    /* renamed from: p */
    public final a41[] f29634p;

    /* renamed from: q */
    public final b41[] f29635q;

    /* renamed from: r */
    public final wm1 f29636r;

    /* renamed from: s */
    public final xm1 f29637s;

    /* renamed from: t */
    public final hk0 f29638t;

    /* renamed from: u */
    public final u80 f29639u;

    /* renamed from: v */
    public final HandlerThread f29640v;

    /* renamed from: w */
    public final Handler f29641w;

    /* renamed from: x */
    public final InterfaceC2898rz f29642x;

    /* renamed from: y */
    public final nl1.C2315c f29643y;

    /* renamed from: z */
    public final nl1.C2314b f29644z;

    /* renamed from: G */
    public final to0 f29620G = new to0();

    /* renamed from: H */
    public ea1 f29621H = ea1.f8286g;

    /* renamed from: D */
    public final C3270d f29617D = new C3270d(null);

    /* renamed from: com.daaw.uz$a */
    /* loaded from: classes.dex */
    public class RunnableC3267a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ fx0 f29645p;

        public RunnableC3267a(fx0 fx0Var) {
            this.f29645p = fx0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3266uz.this.m7609f(this.f29645p);
            } catch (C2802qz e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.daaw.uz$b */
    /* loaded from: classes.dex */
    public static final class C3268b {

        /* renamed from: a */
        public final bp0 f29647a;

        /* renamed from: b */
        public final nl1 f29648b;

        /* renamed from: c */
        public final Object f29649c;

        public C3268b(bp0 bp0Var, nl1 nl1Var, Object obj) {
            this.f29647a = bp0Var;
            this.f29648b = nl1Var;
            this.f29649c = obj;
        }
    }

    /* renamed from: com.daaw.uz$c */
    /* loaded from: classes.dex */
    public static final class C3269c implements Comparable<C3269c> {

        /* renamed from: p */
        public final fx0 f29650p;

        /* renamed from: q */
        public int f29651q;

        /* renamed from: r */
        public long f29652r;

        /* renamed from: s */
        public Object f29653s;

        public C3269c(fx0 fx0Var) {
            this.f29650p = fx0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C3269c c3269c) {
            Object obj = this.f29653s;
            if ((obj == null) != (c3269c.f29653s == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i = this.f29651q - c3269c.f29651q;
                return i != 0 ? i : sq1.m10006j(this.f29652r, c3269c.f29652r);
            }
        }

        /* renamed from: b */
        public void m7579b(int i, long j, Object obj) {
            this.f29651q = i;
            this.f29652r = j;
            this.f29653s = obj;
        }
    }

    /* renamed from: com.daaw.uz$d */
    /* loaded from: classes.dex */
    public static final class C3270d {

        /* renamed from: a */
        public yw0 f29654a;

        /* renamed from: b */
        public int f29655b;

        /* renamed from: c */
        public boolean f29656c;

        /* renamed from: d */
        public int f29657d;

        public C3270d() {
        }

        public /* synthetic */ C3270d(RunnableC3267a runnableC3267a) {
            this();
        }

        /* renamed from: d */
        public boolean m7575d(yw0 yw0Var) {
            return yw0Var != this.f29654a || this.f29655b > 0 || this.f29656c;
        }

        /* renamed from: e */
        public void m7574e(int i) {
            this.f29655b += i;
        }

        /* renamed from: f */
        public void m7573f(yw0 yw0Var) {
            this.f29654a = yw0Var;
            this.f29655b = 0;
            this.f29656c = false;
        }

        /* renamed from: g */
        public void m7572g(int i) {
            if (this.f29656c && this.f29657d != 4) {
                C2914s6.m10690a(i == 4);
                return;
            }
            this.f29656c = true;
            this.f29657d = i;
        }
    }

    /* renamed from: com.daaw.uz$e */
    /* loaded from: classes.dex */
    public static final class C3271e {

        /* renamed from: a */
        public final nl1 f29658a;

        /* renamed from: b */
        public final int f29659b;

        /* renamed from: c */
        public final long f29660c;

        public C3271e(nl1 nl1Var, int i, long j) {
            this.f29658a = nl1Var;
            this.f29659b = i;
            this.f29660c = j;
        }
    }

    public C3266uz(a41[] a41VarArr, wm1 wm1Var, xm1 xm1Var, hk0 hk0Var, boolean z, int i, boolean z2, Handler handler, InterfaceC2898rz interfaceC2898rz, InterfaceC3836zf interfaceC3836zf) {
        this.f29634p = a41VarArr;
        this.f29636r = wm1Var;
        this.f29637s = xm1Var;
        this.f29638t = hk0Var;
        this.f29626M = z;
        this.f29628O = i;
        this.f29629P = z2;
        this.f29641w = handler;
        this.f29642x = interfaceC2898rz;
        this.f29619F = interfaceC3836zf;
        this.f29614A = hk0Var.mo16634d();
        this.f29615B = hk0Var.mo16636b();
        this.f29622I = new yw0(nl1.f20215a, -9223372036854775807L, TrackGroupArray.f35847s, xm1Var);
        this.f29635q = new b41[a41VarArr.length];
        for (int i2 = 0; i2 < a41VarArr.length; i2++) {
            a41VarArr[i2].mo5363e(i2);
            this.f29635q[i2] = a41VarArr[i2].mo5356n();
        }
        this.f29616C = new C2204mr(this, interfaceC3836zf);
        this.f29618E = new ArrayList<>();
        this.f29624K = new a41[0];
        this.f29643y = new nl1.C2315c();
        this.f29644z = new nl1.C2314b();
        wm1Var.m6006a(this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f29640v = handlerThread;
        handlerThread.start();
        this.f29639u = interfaceC3836zf.mo2361d(handlerThread.getLooper(), this);
    }

    /* renamed from: p */
    public static Format[] m7592p(InterfaceC3970c interfaceC3970c) {
        int length = interfaceC3970c != null ? interfaceC3970c.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = interfaceC3970c.mo1531d(i);
        }
        return formatArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r6.f29633T < r6.f29618E.size()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        r1 = r6.f29618E.get(r6.f29633T);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r1.f29653s == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        r3 = r1.f29651q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r3 < r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r3 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (r1.f29652r > r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        r1 = r6.f29633T + 1;
        r6.f29633T = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        if (r1 >= r6.f29618E.size()) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1.f29653s == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        if (r1.f29651q != r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
        r3 = r1.f29652r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
        if (r3 <= r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
        if (r3 > r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
        m7622W(r1.f29650p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
        if (r1.f29650p.m22167b() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
        if (r1.f29650p.m22159j() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ae, code lost:
        r6.f29633T++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
        r6.f29618E.remove(r6.f29633T);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
        if (r6.f29633T >= r6.f29618E.size()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
        r1 = r6.f29618E.get(r6.f29633T);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:15:0x0034). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004a -> B:13:0x002a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0062 -> B:28:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0081 -> B:26:0x0057). Please submit an issue!!! */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7644A(long j, long j2) {
        C3269c c3269c;
        int i;
        if (this.f29618E.isEmpty() || this.f29622I.f34181c.m25954b()) {
            return;
        }
        yw0 yw0Var = this.f29622I;
        if (yw0Var.f34182d == j) {
            j--;
        }
        int i2 = yw0Var.f34181c.f5022a;
        int i3 = this.f29633T;
        if (i3 > 0) {
            ArrayList<C3269c> arrayList = this.f29618E;
            c3269c = arrayList.get(i3 - 1);
            if (c3269c == null && ((i = c3269c.f29651q) > i2 || (i == i2 && c3269c.f29652r > j))) {
                i3 = this.f29633T - 1;
                this.f29633T = i3;
                if (i3 > 0) {
                    arrayList = this.f29618E;
                    c3269c = arrayList.get(i3 - 1);
                    if (c3269c == null) {
                    }
                }
            }
        }
        c3269c = null;
        if (c3269c == null) {
        }
    }

    /* renamed from: B */
    public final void m7643B() {
        this.f29620G.m8921v(this.f29632S);
        if (this.f29620G.m8947B()) {
            so0 m8930m = this.f29620G.m8930m(this.f29632S, this.f29622I);
            if (m8930m == null) {
                this.f29623J.mo16119e();
                return;
            }
            this.f29620G.m8938e(this.f29635q, this.f29636r, this.f29638t.mo16630h(), this.f29623J, this.f29622I.f34179a.mo14378g(m8930m.f26441a.f5022a, this.f29644z, true).f20217b, m8930m).mo2075p(this, m8930m.f26442b);
            m7620Y(true);
        }
    }

    @Override // com.daaw.gb1.InterfaceC1390a
    /* renamed from: C */
    public void mo2077n(qo0 qo0Var) {
        this.f29639u.mo5064f(10, qo0Var).sendToTarget();
    }

    /* renamed from: D */
    public void m7641D(bp0 bp0Var, boolean z, boolean z2) {
        this.f29639u.mo5067c(0, z ? 1 : 0, z2 ? 1 : 0, bp0Var).sendToTarget();
    }

    /* renamed from: E */
    public final void m7640E(bp0 bp0Var, boolean z, boolean z2) {
        this.f29630Q++;
        m7635J(true, z, z2);
        this.f29638t.mo16637a();
        this.f29623J = bp0Var;
        m7608f0(2);
        bp0Var.mo8403f(this.f29642x, true, this);
        this.f29639u.mo5068b(2);
    }

    /* renamed from: F */
    public synchronized void m7639F() {
        if (this.f29625L) {
            return;
        }
        this.f29639u.mo5068b(7);
        boolean z = false;
        while (!this.f29625L) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: G */
    public final void m7638G() {
        m7635J(true, true, true);
        this.f29638t.mo16631g();
        m7608f0(1);
        this.f29640v.quit();
        synchronized (this) {
            this.f29625L = true;
            notifyAll();
        }
    }

    /* renamed from: H */
    public final boolean m7637H(a41 a41Var) {
        ro0 ro0Var = this.f29620G.m8928o().f25442i;
        return ro0Var != null && ro0Var.f25439f && a41Var.mo5360j();
    }

    /* renamed from: I */
    public final void m7636I() {
        if (this.f29620G.m8925r()) {
            float f = this.f29616C.mo15827h().f35605a;
            ro0 m8928o = this.f29620G.m8928o();
            boolean z = true;
            for (ro0 m8929n = this.f29620G.m8929n(); m8929n != null && m8929n.f25439f; m8929n = m8929n.f25442i) {
                if (m8929n.m11111o(f)) {
                    if (z) {
                        ro0 m8929n2 = this.f29620G.m8929n();
                        boolean m8920w = this.f29620G.m8920w(m8929n2);
                        boolean[] zArr = new boolean[this.f29634p.length];
                        long m11124b = m8929n2.m11124b(this.f29622I.f34188j, m8920w, zArr);
                        m7598l0(m8929n2.f25443j, m8929n2.f25444k);
                        yw0 yw0Var = this.f29622I;
                        if (yw0Var.f34184f != 4 && m11124b != yw0Var.f34188j) {
                            yw0 yw0Var2 = this.f29622I;
                            this.f29622I = yw0Var2.m3156g(yw0Var2.f34181c, m11124b, yw0Var2.f34183e);
                            this.f29617D.m7572g(4);
                            m7634K(m11124b);
                        }
                        boolean[] zArr2 = new boolean[this.f29634p.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            a41[] a41VarArr = this.f29634p;
                            if (i >= a41VarArr.length) {
                                break;
                            }
                            a41 a41Var = a41VarArr[i];
                            zArr2[i] = a41Var.getState() != 0;
                            d81 d81Var = m8929n2.f25436c[i];
                            if (d81Var != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (d81Var != a41Var.mo5364b()) {
                                    m7607g(a41Var);
                                } else if (zArr[i]) {
                                    a41Var.mo5352t(this.f29632S);
                                }
                            }
                            i++;
                        }
                        this.f29622I = this.f29622I.m3157f(m8929n2.f25443j, m8929n2.f25444k);
                        m7599l(zArr2, i2);
                    } else {
                        this.f29620G.m8920w(m8929n);
                        if (m8929n.f25439f) {
                            m8929n.m11125a(Math.max(m8929n.f25441h.f26442b, m8929n.m11110p(this.f29632S)), false);
                            m7598l0(m8929n.f25443j, m8929n.f25444k);
                        }
                    }
                    if (this.f29622I.f34184f != 4) {
                        m7583x();
                        m7595n0();
                        this.f29639u.mo5068b(2);
                        return;
                    }
                    return;
                }
                if (m8929n == m8928o) {
                    z = false;
                }
            }
        }
    }

    /* renamed from: J */
    public final void m7635J(boolean z, boolean z2, boolean z3) {
        bp0 bp0Var;
        this.f29639u.mo5065e(2);
        this.f29627N = false;
        this.f29616C.m15826i();
        this.f29632S = 0L;
        for (a41 a41Var : this.f29624K) {
            try {
                m7607g(a41Var);
            } catch (C2802qz | RuntimeException unused) {
            }
        }
        this.f29624K = new a41[0];
        this.f29620G.m8939d(!z2);
        m7620Y(false);
        if (z2) {
            this.f29631R = null;
        }
        if (z3) {
            this.f29620G.m8948A(nl1.f20215a);
            Iterator<C3269c> it = this.f29618E.iterator();
            while (it.hasNext()) {
                it.next().f29650p.m22158k(false);
            }
            this.f29618E.clear();
            this.f29633T = 0;
        }
        nl1 nl1Var = z3 ? nl1.f20215a : this.f29622I.f34179a;
        Object obj = z3 ? null : this.f29622I.f34180b;
        bp0.C0880a c0880a = z2 ? new bp0.C0880a(m7594o()) : this.f29622I.f34181c;
        long j = z2 ? -9223372036854775807L : this.f29622I.f34188j;
        long j2 = z2 ? -9223372036854775807L : this.f29622I.f34183e;
        yw0 yw0Var = this.f29622I;
        this.f29622I = new yw0(nl1Var, obj, c0880a, j, j2, yw0Var.f34184f, false, z3 ? TrackGroupArray.f35847s : yw0Var.f34186h, z3 ? this.f29637s : yw0Var.f34187i);
        if (!z || (bp0Var = this.f29623J) == null) {
            return;
        }
        bp0Var.mo8402h(this);
        this.f29623J = null;
    }

    /* renamed from: K */
    public final void m7634K(long j) {
        if (this.f29620G.m8925r()) {
            j = this.f29620G.m8929n().m11109q(j);
        }
        this.f29632S = j;
        this.f29616C.m15830e(j);
        for (a41 a41Var : this.f29624K) {
            a41Var.mo5352t(this.f29632S);
        }
    }

    /* renamed from: L */
    public final boolean m7633L(C3269c c3269c) {
        Object obj = c3269c.f29653s;
        if (obj == null) {
            Pair<Integer, Long> m7631N = m7631N(new C3271e(c3269c.f29650p.m22162g(), c3269c.f29650p.m22160i(), C1075dd.m24527a(c3269c.f29650p.m22164e())), false);
            if (m7631N == null) {
                return false;
            }
            c3269c.m7579b(((Integer) m7631N.first).intValue(), ((Long) m7631N.second).longValue(), this.f29622I.f34179a.mo14378g(((Integer) m7631N.first).intValue(), this.f29644z, true).f20217b);
        } else {
            int mo14379b = this.f29622I.f34179a.mo14379b(obj);
            if (mo14379b == -1) {
                return false;
            }
            c3269c.f29651q = mo14379b;
        }
        return true;
    }

    /* renamed from: M */
    public final void m7632M() {
        for (int size = this.f29618E.size() - 1; size >= 0; size--) {
            if (!m7633L(this.f29618E.get(size))) {
                this.f29618E.get(size).f29650p.m22158k(false);
                this.f29618E.remove(size);
            }
        }
        Collections.sort(this.f29618E);
    }

    /* renamed from: N */
    public final Pair<Integer, Long> m7631N(C3271e c3271e, boolean z) {
        int m7630O;
        nl1 nl1Var = this.f29622I.f34179a;
        nl1 nl1Var2 = c3271e.f29658a;
        if (nl1Var.m15073o()) {
            return null;
        }
        if (nl1Var2.m15073o()) {
            nl1Var2 = nl1Var;
        }
        try {
            Pair<Integer, Long> m15077i = nl1Var2.m15077i(this.f29643y, this.f29644z, c3271e.f29659b, c3271e.f29660c);
            if (nl1Var == nl1Var2) {
                return m15077i;
            }
            int mo14379b = nl1Var.mo14379b(nl1Var2.mo14378g(((Integer) m15077i.first).intValue(), this.f29644z, true).f20217b);
            if (mo14379b != -1) {
                return Pair.create(Integer.valueOf(mo14379b), m15077i.second);
            }
            if (!z || (m7630O = m7630O(((Integer) m15077i.first).intValue(), nl1Var2, nl1Var)) == -1) {
                return null;
            }
            return m7590q(nl1Var, nl1Var.m15078f(m7630O, this.f29644z).f20218c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new we0(nl1Var, c3271e.f29659b, c3271e.f29660c);
        }
    }

    /* renamed from: O */
    public final int m7630O(int i, nl1 nl1Var, nl1 nl1Var2) {
        int mo14377h = nl1Var.mo14377h();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < mo14377h && i3 == -1; i4++) {
            i2 = nl1Var.m15080d(i2, this.f29644z, this.f29643y, this.f29628O, this.f29629P);
            if (i2 == -1) {
                break;
            }
            i3 = nl1Var2.mo14379b(nl1Var.mo14378g(i2, this.f29644z, true).f20217b);
        }
        return i3;
    }

    /* renamed from: P */
    public final void m7629P(long j, long j2) {
        this.f29639u.mo5065e(2);
        this.f29639u.mo5066d(2, j + j2);
    }

    /* renamed from: Q */
    public void m7628Q(nl1 nl1Var, int i, long j) {
        this.f29639u.mo5064f(3, new C3271e(nl1Var, i, j)).sendToTarget();
    }

    /* renamed from: R */
    public final void m7627R(boolean z) {
        bp0.C0880a c0880a = this.f29620G.m8929n().f25441h.f26441a;
        long m7624U = m7624U(c0880a, this.f29622I.f34188j, true);
        if (m7624U != this.f29622I.f34188j) {
            yw0 yw0Var = this.f29622I;
            this.f29622I = yw0Var.m3156g(c0880a, m7624U, yw0Var.f34183e);
            if (z) {
                this.f29617D.m7572g(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:15:0x005d, B:17:0x0061, B:22:0x006a, B:23:0x0072, B:25:0x007c, B:29:0x0088, B:31:0x0092, B:33:0x00a2, B:39:0x00b9, B:43:0x00c3, B:44:0x00c7), top: B:57:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:15:0x005d, B:17:0x0061, B:22:0x006a, B:23:0x0072, B:25:0x007c, B:29:0x0088, B:31:0x0092, B:33:0x00a2, B:39:0x00b9, B:43:0x00c3, B:44:0x00c7), top: B:57:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7626S(C3271e c3271e) {
        long longValue;
        boolean z;
        bp0.C0880a c0880a;
        long j;
        long j2;
        long j3;
        boolean z2 = true;
        this.f29617D.m7574e(1);
        Pair<Integer, Long> m7631N = m7631N(c3271e, true);
        try {
            if (m7631N == null) {
                c0880a = new bp0.C0880a(m7594o());
                longValue = -9223372036854775807L;
                j = -9223372036854775807L;
            } else {
                int intValue = ((Integer) m7631N.first).intValue();
                long longValue2 = ((Long) m7631N.second).longValue();
                bp0.C0880a m8919x = this.f29620G.m8919x(intValue, longValue2);
                if (m8919x.m25954b()) {
                    longValue = 0;
                    c0880a = m8919x;
                    j = longValue2;
                } else {
                    longValue = ((Long) m7631N.second).longValue();
                    z = c3271e.f29660c == -9223372036854775807L;
                    c0880a = m8919x;
                    j = longValue2;
                    if (this.f29623J != null && this.f29630Q <= 0) {
                        if (longValue != -9223372036854775807L) {
                            m7608f0(4);
                            m7635J(false, true, false);
                            j2 = longValue;
                            this.f29622I = this.f29622I.m3156g(c0880a, j2, j);
                            if (z) {
                                return;
                            }
                            this.f29617D.m7572g(2);
                            return;
                        }
                        if (c0880a.equals(this.f29622I.f34181c)) {
                            ro0 m8929n = this.f29620G.m8929n();
                            j3 = (m8929n == null || longValue == 0) ? longValue : m8929n.f25434a.mo2084e(longValue, this.f29621H);
                            if (C1075dd.m24526b(j3) == C1075dd.m24526b(this.f29622I.f34188j)) {
                                this.f29622I = this.f29622I.m3156g(c0880a, this.f29622I.f34188j, j);
                                if (z) {
                                    this.f29617D.m7572g(2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            j3 = longValue;
                        }
                        long m7625T = m7625T(c0880a, j3);
                        if (longValue == m7625T) {
                            z2 = false;
                        }
                        z |= z2;
                        j2 = m7625T;
                        this.f29622I = this.f29622I.m3156g(c0880a, j2, j);
                        if (z) {
                        }
                    }
                    this.f29631R = c3271e;
                    j2 = longValue;
                    this.f29622I = this.f29622I.m3156g(c0880a, j2, j);
                    if (z) {
                    }
                }
            }
            if (this.f29623J != null) {
                if (longValue != -9223372036854775807L) {
                }
            }
            this.f29631R = c3271e;
            j2 = longValue;
            this.f29622I = this.f29622I.m3156g(c0880a, j2, j);
            if (z) {
            }
        } catch (Throwable th) {
            this.f29622I = this.f29622I.m3156g(c0880a, longValue, j);
            if (z) {
                this.f29617D.m7572g(2);
            }
            throw th;
        }
        z = true;
    }

    /* renamed from: T */
    public final long m7625T(bp0.C0880a c0880a, long j) {
        return m7624U(c0880a, j, this.f29620G.m8929n() != this.f29620G.m8928o());
    }

    /* renamed from: U */
    public final long m7624U(bp0.C0880a c0880a, long j, boolean z) {
        m7600k0();
        this.f29627N = false;
        m7608f0(2);
        ro0 m8929n = this.f29620G.m8929n();
        ro0 ro0Var = m8929n;
        while (true) {
            if (ro0Var == null) {
                break;
            } else if (m7606g0(c0880a, j, ro0Var)) {
                this.f29620G.m8920w(ro0Var);
                break;
            } else {
                ro0Var = this.f29620G.m8942a();
            }
        }
        if (m8929n != ro0Var || z) {
            for (a41 a41Var : this.f29624K) {
                m7607g(a41Var);
            }
            this.f29624K = new a41[0];
            m8929n = null;
        }
        if (ro0Var != null) {
            m7593o0(m8929n);
            if (ro0Var.f25440g) {
                long mo2078m = ro0Var.f25434a.mo2078m(j);
                ro0Var.f25434a.mo2071t(mo2078m - this.f29614A, this.f29615B);
                j = mo2078m;
            }
            m7634K(j);
            m7583x();
        } else {
            this.f29620G.m8939d(true);
            m7634K(j);
        }
        this.f29639u.mo5068b(2);
        return j;
    }

    /* renamed from: V */
    public final void m7623V(fx0 fx0Var) {
        if (fx0Var.m22164e() == -9223372036854775807L) {
            m7622W(fx0Var);
        } else if (this.f29623J == null || this.f29630Q > 0) {
            this.f29618E.add(new C3269c(fx0Var));
        } else {
            C3269c c3269c = new C3269c(fx0Var);
            if (!m7633L(c3269c)) {
                fx0Var.m22158k(false);
                return;
            }
            this.f29618E.add(c3269c);
            Collections.sort(this.f29618E);
        }
    }

    /* renamed from: W */
    public final void m7622W(fx0 fx0Var) {
        if (fx0Var.m22166c().getLooper() != this.f29639u.mo5063g()) {
            this.f29639u.mo5064f(15, fx0Var).sendToTarget();
            return;
        }
        m7609f(fx0Var);
        int i = this.f29622I.f34184f;
        if (i == 3 || i == 2) {
            this.f29639u.mo5068b(2);
        }
    }

    /* renamed from: X */
    public final void m7621X(fx0 fx0Var) {
        fx0Var.m22166c().post(new RunnableC3267a(fx0Var));
    }

    /* renamed from: Y */
    public final void m7620Y(boolean z) {
        yw0 yw0Var = this.f29622I;
        if (yw0Var.f34185g != z) {
            this.f29622I = yw0Var.m3161b(z);
        }
    }

    /* renamed from: Z */
    public void m7619Z(boolean z) {
        this.f29639u.mo5069a(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a0 */
    public final void m7618a0(boolean z) {
        this.f29627N = false;
        this.f29626M = z;
        if (!z) {
            m7600k0();
            m7595n0();
            return;
        }
        int i = this.f29622I.f34184f;
        if (i == 3) {
            m7602i0();
        } else if (i != 2) {
            return;
        }
        this.f29639u.mo5068b(2);
    }

    @Override // com.daaw.fx0.InterfaceC1342a
    /* renamed from: b */
    public synchronized void mo7617b(fx0 fx0Var) {
        if (this.f29625L) {
            fx0Var.m22158k(false);
        } else {
            this.f29639u.mo5064f(14, fx0Var).sendToTarget();
        }
    }

    /* renamed from: b0 */
    public final void m7616b0(zw0 zw0Var) {
        this.f29616C.mo15829f(zw0Var);
    }

    @Override // com.daaw.C2204mr.InterfaceC2205a
    /* renamed from: c */
    public void mo7615c(zw0 zw0Var) {
        this.f29641w.obtainMessage(1, zw0Var).sendToTarget();
        m7591p0(zw0Var.f35605a);
    }

    /* renamed from: c0 */
    public final void m7614c0(int i) {
        this.f29628O = i;
        if (this.f29620G.m8944E(i)) {
            return;
        }
        m7627R(true);
    }

    @Override // com.daaw.bp0.InterfaceC0881b
    /* renamed from: d */
    public void mo7613d(bp0 bp0Var, nl1 nl1Var, Object obj) {
        this.f29639u.mo5064f(8, new C3268b(bp0Var, nl1Var, obj)).sendToTarget();
    }

    /* renamed from: d0 */
    public final void m7612d0(ea1 ea1Var) {
        this.f29621H = ea1Var;
    }

    /* renamed from: e0 */
    public final void m7610e0(boolean z) {
        this.f29629P = z;
        if (this.f29620G.m8943F(z)) {
            return;
        }
        m7627R(true);
    }

    /* renamed from: f */
    public final void m7609f(fx0 fx0Var) {
        if (fx0Var.m22159j()) {
            return;
        }
        try {
            fx0Var.m22163f().mo5354r(fx0Var.m22161h(), fx0Var.m22165d());
        } finally {
            fx0Var.m22158k(true);
        }
    }

    /* renamed from: f0 */
    public final void m7608f0(int i) {
        yw0 yw0Var = this.f29622I;
        if (yw0Var.f34184f != i) {
            this.f29622I = yw0Var.m3159d(i);
        }
    }

    /* renamed from: g */
    public final void m7607g(a41 a41Var) {
        this.f29616C.m15832c(a41Var);
        m7597m(a41Var);
        a41Var.mo5362g();
    }

    /* renamed from: g0 */
    public final boolean m7606g0(bp0.C0880a c0880a, long j, ro0 ro0Var) {
        if (c0880a.equals(ro0Var.f25441h.f26441a) && ro0Var.f25439f) {
            this.f29622I.f34179a.m15078f(ro0Var.f25441h.f26441a.f5022a, this.f29644z);
            int m15068d = this.f29644z.m15068d(j);
            return m15068d == -1 || this.f29644z.m15066f(m15068d) == ro0Var.f25441h.f26443c;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7605h() {
        a41[] a41VarArr;
        int i;
        long mo2362c = this.f29619F.mo2362c();
        m7596m0();
        if (!this.f29620G.m8925r()) {
            m7581z();
            m7629P(mo2362c, 10L);
            return;
        }
        ro0 m8929n = this.f29620G.m8929n();
        mm1.m15937a("doSomeWork");
        m7595n0();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        m8929n.f25434a.mo2071t(this.f29622I.f34188j - this.f29614A, this.f29615B);
        boolean z = true;
        boolean z2 = true;
        for (a41 a41Var : this.f29624K) {
            a41Var.mo3457q(this.f29632S, elapsedRealtime);
            z2 = z2 && a41Var.mo3459c();
            boolean z3 = a41Var.mo3458d() || a41Var.mo3459c() || m7637H(a41Var);
            if (!z3) {
                a41Var.mo5353s();
            }
            z = z && z3;
        }
        if (!z) {
            m7581z();
        }
        long j = m8929n.f25441h.f26445e;
        if (!z2 || ((j != -9223372036854775807L && j > this.f29622I.f34188j) || !m8929n.f25441h.f26447g)) {
            if (this.f29622I.f34184f == 2 && m7604h0(z)) {
                m7608f0(3);
                if (this.f29626M) {
                    m7602i0();
                }
            } else if (this.f29622I.f34184f == 3 && (this.f29624K.length != 0 ? !z : !m7584w())) {
                this.f29627N = this.f29626M;
                m7608f0(2);
            }
            if (this.f29622I.f34184f == 2) {
                for (a41 a41Var2 : this.f29624K) {
                    a41Var2.mo5353s();
                }
            }
            if ((!this.f29626M && this.f29622I.f34184f == 3) || (i = this.f29622I.f34184f) == 2) {
                m7629P(mo2362c, 10L);
            } else if (this.f29624K.length != 0 || i == 4) {
                this.f29639u.mo5065e(2);
            } else {
                m7629P(mo2362c, 1000L);
            }
            mm1.m15935c();
        }
        m7608f0(4);
        m7600k0();
        if (this.f29622I.f34184f == 2) {
        }
        if (!this.f29626M) {
        }
        if (this.f29624K.length != 0) {
        }
        this.f29639u.mo5065e(2);
        mm1.m15935c();
    }

    /* renamed from: h0 */
    public final boolean m7604h0(boolean z) {
        if (this.f29624K.length == 0) {
            return m7584w();
        }
        if (z) {
            if (this.f29622I.f34185g) {
                ro0 m8934i = this.f29620G.m8934i();
                long m11118h = m8934i.m11118h(!m8934i.f25441h.f26447g);
                return m11118h == Long.MIN_VALUE || this.f29638t.mo16633e(m11118h - m8934i.m11110p(this.f29632S), this.f29616C.mo15827h().f35605a, this.f29627N);
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Handler handler;
        C2802qz e;
        try {
            switch (message.what) {
                case 0:
                    m7640E((bp0) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    m7618a0(message.arg1 != 0);
                    break;
                case 2:
                    m7605h();
                    break;
                case 3:
                    m7626S((C3271e) message.obj);
                    break;
                case 4:
                    m7616b0((zw0) message.obj);
                    break;
                case 5:
                    m7612d0((ea1) message.obj);
                    break;
                case 6:
                    m7601j0(message.arg1 != 0, true);
                    break;
                case 7:
                    m7638G();
                    return true;
                case 8:
                    m7585v((C3268b) message.obj);
                    break;
                case 9:
                    m7587t((qo0) message.obj);
                    break;
                case 10:
                    m7588s((qo0) message.obj);
                    break;
                case 11:
                    m7636I();
                    break;
                case 12:
                    m7614c0(message.arg1);
                    break;
                case 13:
                    m7610e0(message.arg1 != 0);
                    break;
                case 14:
                    m7623V((fx0) message.obj);
                    break;
                case 15:
                    m7621X((fx0) message.obj);
                    break;
                default:
                    return false;
            }
            m7582y();
        } catch (C2802qz e2) {
            e = e2;
            m7601j0(false, false);
            handler = this.f29641w;
            handler.obtainMessage(2, e).sendToTarget();
            m7582y();
            return true;
        } catch (IOException e3) {
            m7601j0(false, false);
            handler = this.f29641w;
            e = C2802qz.m11926b(e3);
            handler.obtainMessage(2, e).sendToTarget();
            m7582y();
            return true;
        } catch (RuntimeException e4) {
            m7601j0(false, false);
            handler = this.f29641w;
            e = C2802qz.m11925c(e4);
            handler.obtainMessage(2, e).sendToTarget();
            m7582y();
            return true;
        }
        return true;
    }

    /* renamed from: i */
    public final void m7603i(int i, boolean z, int i2) {
        ro0 m8929n = this.f29620G.m8929n();
        a41 a41Var = this.f29634p[i];
        this.f29624K[i2] = a41Var;
        if (a41Var.getState() == 0) {
            xm1 xm1Var = m8929n.f25444k;
            c41 c41Var = xm1Var.f32792b[i];
            Format[] m7592p = m7592p(xm1Var.f32793c.m8019a(i));
            boolean z2 = this.f29626M && this.f29622I.f34184f == 3;
            a41Var.mo5359k(c41Var, m7592p, m8929n.f25436c[i], this.f29632S, !z && z2, m8929n.m11116j());
            this.f29616C.m15831d(a41Var);
            if (z2) {
                a41Var.start();
            }
        }
    }

    /* renamed from: i0 */
    public final void m7602i0() {
        this.f29627N = false;
        this.f29616C.m15828g();
        for (a41 a41Var : this.f29624K) {
            a41Var.start();
        }
    }

    @Override // com.daaw.qo0.InterfaceC2744a
    /* renamed from: j */
    public void mo3792j(qo0 qo0Var) {
        this.f29639u.mo5064f(9, qo0Var).sendToTarget();
    }

    /* renamed from: j0 */
    public final void m7601j0(boolean z, boolean z2) {
        m7635J(true, z, z);
        this.f29617D.m7574e(this.f29630Q + (z2 ? 1 : 0));
        this.f29630Q = 0;
        this.f29638t.mo16629i();
        m7608f0(1);
    }

    /* renamed from: k0 */
    public final void m7600k0() {
        this.f29616C.m15826i();
        for (a41 a41Var : this.f29624K) {
            m7597m(a41Var);
        }
    }

    /* renamed from: l */
    public final void m7599l(boolean[] zArr, int i) {
        this.f29624K = new a41[i];
        ro0 m8929n = this.f29620G.m8929n();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f29634p.length; i3++) {
            if (m8929n.f25444k.m5004c(i3)) {
                m7603i(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    /* renamed from: l0 */
    public final void m7598l0(TrackGroupArray trackGroupArray, xm1 xm1Var) {
        this.f29638t.mo16635c(this.f29634p, trackGroupArray, xm1Var.f32793c);
    }

    /* renamed from: m */
    public final void m7597m(a41 a41Var) {
        if (a41Var.getState() == 2) {
            a41Var.stop();
        }
    }

    /* renamed from: m0 */
    public final void m7596m0() {
        bp0 bp0Var = this.f29623J;
        if (bp0Var == null) {
            return;
        }
        if (this.f29630Q > 0) {
            bp0Var.mo16119e();
            return;
        }
        m7643B();
        ro0 m8934i = this.f29620G.m8934i();
        int i = 0;
        if (m8934i == null || m8934i.m11114l()) {
            m7620Y(false);
        } else if (!this.f29622I.f34185g) {
            m7583x();
        }
        if (!this.f29620G.m8925r()) {
            return;
        }
        ro0 m8929n = this.f29620G.m8929n();
        ro0 m8928o = this.f29620G.m8928o();
        boolean z = false;
        while (this.f29626M && m8929n != m8928o && this.f29632S >= m8929n.f25442i.f25438e) {
            if (z) {
                m7582y();
            }
            int i2 = m8929n.f25441h.f26446f ? 0 : 3;
            ro0 m8942a = this.f29620G.m8942a();
            m7593o0(m8929n);
            yw0 yw0Var = this.f29622I;
            so0 so0Var = m8942a.f25441h;
            this.f29622I = yw0Var.m3156g(so0Var.f26441a, so0Var.f26442b, so0Var.f26444d);
            this.f29617D.m7572g(i2);
            m7595n0();
            m8929n = m8942a;
            z = true;
        }
        if (m8928o.f25441h.f26447g) {
            while (true) {
                a41[] a41VarArr = this.f29634p;
                if (i >= a41VarArr.length) {
                    return;
                }
                a41 a41Var = a41VarArr[i];
                d81 d81Var = m8928o.f25436c[i];
                if (d81Var != null && a41Var.mo5364b() == d81Var && a41Var.mo5360j()) {
                    a41Var.mo5358l();
                }
                i++;
            }
        } else {
            ro0 ro0Var = m8928o.f25442i;
            if (ro0Var == null || !ro0Var.f25439f) {
                return;
            }
            int i3 = 0;
            while (true) {
                a41[] a41VarArr2 = this.f29634p;
                if (i3 < a41VarArr2.length) {
                    a41 a41Var2 = a41VarArr2[i3];
                    d81 d81Var2 = m8928o.f25436c[i3];
                    if (a41Var2.mo5364b() != d81Var2) {
                        return;
                    }
                    if (d81Var2 != null && !a41Var2.mo5360j()) {
                        return;
                    }
                    i3++;
                } else {
                    xm1 xm1Var = m8928o.f25444k;
                    ro0 m8941b = this.f29620G.m8941b();
                    xm1 xm1Var2 = m8941b.f25444k;
                    boolean z2 = m8941b.f25434a.mo2074q() != -9223372036854775807L;
                    int i4 = 0;
                    while (true) {
                        a41[] a41VarArr3 = this.f29634p;
                        if (i4 >= a41VarArr3.length) {
                            return;
                        }
                        a41 a41Var3 = a41VarArr3[i4];
                        if (xm1Var.m5004c(i4)) {
                            if (!z2) {
                                if (!a41Var3.mo5351u()) {
                                    InterfaceC3970c m8019a = xm1Var2.f32793c.m8019a(i4);
                                    boolean m5004c = xm1Var2.m5004c(i4);
                                    boolean z3 = this.f29635q[i4].mo5361i() == 5;
                                    c41 c41Var = xm1Var.f32792b[i4];
                                    c41 c41Var2 = xm1Var2.f32792b[i4];
                                    if (m5004c && c41Var2.equals(c41Var) && !z3) {
                                        a41Var3.mo5357m(m7592p(m8019a), m8941b.f25436c[i4], m8941b.m11116j());
                                    }
                                }
                            }
                            a41Var3.mo5358l();
                        }
                        i4++;
                    }
                }
            }
        }
    }

    /* renamed from: n0 */
    public final void m7595n0() {
        if (this.f29620G.m8925r()) {
            ro0 m8929n = this.f29620G.m8929n();
            long mo2074q = m8929n.f25434a.mo2074q();
            if (mo2074q != -9223372036854775807L) {
                m7634K(mo2074q);
                if (mo2074q != this.f29622I.f34188j) {
                    yw0 yw0Var = this.f29622I;
                    this.f29622I = yw0Var.m3156g(yw0Var.f34181c, mo2074q, yw0Var.f34183e);
                    this.f29617D.m7572g(4);
                }
            } else {
                long m15825j = this.f29616C.m15825j();
                this.f29632S = m15825j;
                long m11110p = m8929n.m11110p(m15825j);
                m7644A(this.f29622I.f34188j, m11110p);
                this.f29622I.f34188j = m11110p;
            }
            this.f29622I.f34189k = this.f29624K.length == 0 ? m8929n.f25441h.f26445e : m8929n.m11118h(true);
        }
    }

    /* renamed from: o */
    public final int m7594o() {
        nl1 nl1Var = this.f29622I.f34179a;
        if (nl1Var.m15073o()) {
            return 0;
        }
        return nl1Var.m15075k(nl1Var.m15082a(this.f29629P), this.f29643y).f20227f;
    }

    /* renamed from: o0 */
    public final void m7593o0(ro0 ro0Var) {
        ro0 m8929n = this.f29620G.m8929n();
        if (m8929n == null || ro0Var == m8929n) {
            return;
        }
        boolean[] zArr = new boolean[this.f29634p.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            a41[] a41VarArr = this.f29634p;
            if (i >= a41VarArr.length) {
                this.f29622I = this.f29622I.m3157f(m8929n.f25443j, m8929n.f25444k);
                m7599l(zArr, i2);
                return;
            }
            a41 a41Var = a41VarArr[i];
            zArr[i] = a41Var.getState() != 0;
            if (m8929n.f25444k.m5004c(i)) {
                i2++;
            }
            if (zArr[i] && (!m8929n.f25444k.m5004c(i) || (a41Var.mo5351u() && a41Var.mo5364b() == ro0Var.f25436c[i]))) {
                m7607g(a41Var);
            }
            i++;
        }
    }

    /* renamed from: p0 */
    public final void m7591p0(float f) {
        InterfaceC3970c[] m8018b;
        for (ro0 m8935h = this.f29620G.m8935h(); m8935h != null; m8935h = m8935h.f25442i) {
            xm1 xm1Var = m8935h.f25444k;
            if (xm1Var != null) {
                for (InterfaceC3970c interfaceC3970c : xm1Var.f32793c.m8018b()) {
                    if (interfaceC3970c != null) {
                        interfaceC3970c.mo1522m(f);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public final Pair<Integer, Long> m7590q(nl1 nl1Var, int i, long j) {
        return nl1Var.m15077i(this.f29643y, this.f29644z, i, j);
    }

    /* renamed from: r */
    public Looper m7589r() {
        return this.f29640v.getLooper();
    }

    /* renamed from: s */
    public final void m7588s(qo0 qo0Var) {
        if (this.f29620G.m8922u(qo0Var)) {
            this.f29620G.m8921v(this.f29632S);
            m7583x();
        }
    }

    /* renamed from: t */
    public final void m7587t(qo0 qo0Var) {
        if (this.f29620G.m8922u(qo0Var)) {
            ro0 m8934i = this.f29620G.m8934i();
            m8934i.m11115k(this.f29616C.mo15827h().f35605a);
            m7598l0(m8934i.f25443j, m8934i.f25444k);
            if (!this.f29620G.m8925r()) {
                m7634K(this.f29620G.m8942a().f25441h.f26442b);
                m7593o0(null);
            }
            m7583x();
        }
    }

    /* renamed from: u */
    public final void m7586u() {
        m7608f0(4);
        m7635J(false, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r11.m25954b() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
        if (r11.m25954b() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
        r12 = r14;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7585v(C3268b c3268b) {
        yw0 m3156g;
        long longValue;
        bp0.C0880a m8919x;
        yw0 yw0Var;
        long j;
        if (c3268b.f29647a != this.f29623J) {
            return;
        }
        nl1 nl1Var = this.f29622I.f34179a;
        nl1 nl1Var2 = c3268b.f29648b;
        Object obj = c3268b.f29649c;
        this.f29620G.m8948A(nl1Var2);
        this.f29622I = this.f29622I.m3158e(nl1Var2, obj);
        m7632M();
        int i = this.f29630Q;
        if (i > 0) {
            this.f29617D.m7574e(i);
            this.f29630Q = 0;
            C3271e c3271e = this.f29631R;
            if (c3271e != null) {
                Pair<Integer, Long> m7631N = m7631N(c3271e, true);
                this.f29631R = null;
                if (m7631N != null) {
                    int intValue = ((Integer) m7631N.first).intValue();
                    longValue = ((Long) m7631N.second).longValue();
                    m8919x = this.f29620G.m8919x(intValue, longValue);
                    yw0Var = this.f29622I;
                }
                m7586u();
                return;
            } else if (this.f29622I.f34182d == -9223372036854775807L) {
                if (!nl1Var2.m15073o()) {
                    Pair<Integer, Long> m7590q = m7590q(nl1Var2, nl1Var2.m15082a(this.f29629P), -9223372036854775807L);
                    int intValue2 = ((Integer) m7590q.first).intValue();
                    longValue = ((Long) m7590q.second).longValue();
                    m8919x = this.f29620G.m8919x(intValue2, longValue);
                    yw0Var = this.f29622I;
                }
                m7586u();
                return;
            } else {
                return;
            }
            this.f29622I = yw0Var.m3156g(m8919x, j, longValue);
            return;
        }
        yw0 yw0Var2 = this.f29622I;
        int i2 = yw0Var2.f34181c.f5022a;
        long j2 = yw0Var2.f34183e;
        if (nl1Var.m15073o()) {
            if (nl1Var2.m15073o()) {
                return;
            }
            bp0.C0880a m8919x2 = this.f29620G.m8919x(i2, j2);
            this.f29622I = this.f29622I.m3156g(m8919x2, m8919x2.m25954b() ? 0L : j2, j2);
            return;
        }
        ro0 m8935h = this.f29620G.m8935h();
        int mo14379b = nl1Var2.mo14379b(m8935h == null ? nl1Var.mo14378g(i2, this.f29644z, true).f20217b : m8935h.f25435b);
        if (mo14379b != -1) {
            if (mo14379b != i2) {
                this.f29622I = this.f29622I.m3160c(mo14379b);
            }
            bp0.C0880a c0880a = this.f29622I.f34181c;
            if (c0880a.m25954b()) {
                bp0.C0880a m8919x3 = this.f29620G.m8919x(mo14379b, j2);
                if (!m8919x3.equals(c0880a)) {
                    m3156g = this.f29622I.m3156g(m8919x3, m7625T(m8919x3, m8919x3.m25954b() ? 0L : j2), j2);
                }
            }
            if (this.f29620G.m8945D(c0880a, this.f29632S)) {
                return;
            }
            m7627R(false);
            return;
        }
        int m7630O = m7630O(i2, nl1Var, nl1Var2);
        if (m7630O == -1) {
            m7586u();
            return;
        }
        Pair<Integer, Long> m7590q2 = m7590q(nl1Var2, nl1Var2.m15078f(m7630O, this.f29644z).f20218c, -9223372036854775807L);
        int intValue3 = ((Integer) m7590q2.first).intValue();
        long longValue2 = ((Long) m7590q2.second).longValue();
        bp0.C0880a m8919x4 = this.f29620G.m8919x(intValue3, longValue2);
        nl1Var2.mo14378g(intValue3, this.f29644z, true);
        if (m8935h != null) {
            Object obj2 = this.f29644z.f20217b;
            loop0: while (true) {
                so0 m10129a = m8935h.f25441h.m10129a(-1);
                while (true) {
                    m8935h.f25441h = m10129a;
                    m8935h = m8935h.f25442i;
                    if (m8935h == null) {
                        break loop0;
                    } else if (m8935h.f25435b.equals(obj2)) {
                        m10129a = this.f29620G.m8927p(m8935h.f25441h, intValue3);
                    }
                }
            }
        }
        m3156g = this.f29622I.m3156g(m8919x4, m7625T(m8919x4, m8919x4.m25954b() ? 0L : longValue2), longValue2);
        this.f29622I = m3156g;
    }

    /* renamed from: w */
    public final boolean m7584w() {
        ro0 ro0Var;
        ro0 m8929n = this.f29620G.m8929n();
        long j = m8929n.f25441h.f26445e;
        return j == -9223372036854775807L || this.f29622I.f34188j < j || ((ro0Var = m8929n.f25442i) != null && (ro0Var.f25439f || ro0Var.f25441h.f26441a.m25954b()));
    }

    /* renamed from: x */
    public final void m7583x() {
        ro0 m8934i = this.f29620G.m8934i();
        long m11117i = m8934i.m11117i();
        if (m11117i == Long.MIN_VALUE) {
            m7620Y(false);
            return;
        }
        boolean mo16632f = this.f29638t.mo16632f(m11117i - m8934i.m11110p(this.f29632S), this.f29616C.mo15827h().f35605a);
        m7620Y(mo16632f);
        if (mo16632f) {
            m8934i.m11122d(this.f29632S);
        }
    }

    /* renamed from: y */
    public final void m7582y() {
        if (this.f29617D.m7575d(this.f29622I)) {
            this.f29641w.obtainMessage(0, this.f29617D.f29655b, this.f29617D.f29656c ? this.f29617D.f29657d : -1, this.f29622I).sendToTarget();
            this.f29617D.m7573f(this.f29622I);
        }
    }

    /* renamed from: z */
    public final void m7581z() {
        ro0 m8934i = this.f29620G.m8934i();
        ro0 m8928o = this.f29620G.m8928o();
        if (m8934i == null || m8934i.f25439f) {
            return;
        }
        if (m8928o == null || m8928o.f25442i == m8934i) {
            for (a41 a41Var : this.f29624K) {
                if (!a41Var.mo5360j()) {
                    return;
                }
            }
            m8934i.f25434a.mo2079l();
        }
    }
}
