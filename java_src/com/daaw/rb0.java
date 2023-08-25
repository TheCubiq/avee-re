package com.daaw;

import android.os.Handler;
import com.daaw.b81;
import com.daaw.cp0;
import com.daaw.eb0;
import com.daaw.gb1;
import com.daaw.ib0;
import com.daaw.jk0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class rb0 implements jk0.InterfaceC1834a<AbstractC1180ef>, jk0.InterfaceC1837d, gb1, d00, b81.InterfaceC0826b {

    /* renamed from: F */
    public boolean f25038F;

    /* renamed from: H */
    public boolean f25040H;

    /* renamed from: J */
    public boolean f25042J;

    /* renamed from: K */
    public boolean f25043K;

    /* renamed from: L */
    public int f25044L;

    /* renamed from: M */
    public Format f25045M;

    /* renamed from: N */
    public boolean f25046N;

    /* renamed from: O */
    public TrackGroupArray f25047O;

    /* renamed from: P */
    public TrackGroupArray f25048P;

    /* renamed from: Q */
    public int[] f25049Q;

    /* renamed from: R */
    public int f25050R;

    /* renamed from: S */
    public boolean f25051S;

    /* renamed from: V */
    public long f25054V;

    /* renamed from: W */
    public long f25055W;

    /* renamed from: X */
    public boolean f25056X;

    /* renamed from: Y */
    public boolean f25057Y;

    /* renamed from: Z */
    public boolean f25058Z;

    /* renamed from: a0 */
    public boolean f25059a0;

    /* renamed from: b0 */
    public long f25060b0;

    /* renamed from: p */
    public final int f25061p;

    /* renamed from: q */
    public final InterfaceC2845c f25062q;

    /* renamed from: r */
    public final eb0 f25063r;

    /* renamed from: s */
    public final InterfaceC2006l2 f25064s;

    /* renamed from: t */
    public final Format f25065t;

    /* renamed from: u */
    public final int f25066u;

    /* renamed from: w */
    public final cp0.C0975a f25068w;

    /* renamed from: v */
    public final jk0 f25067v = new jk0("Loader:HlsSampleStreamWrapper");

    /* renamed from: x */
    public final eb0.C1174b f25069x = new eb0.C1174b();

    /* renamed from: E */
    public int[] f25037E = new int[0];

    /* renamed from: G */
    public int f25039G = -1;

    /* renamed from: I */
    public int f25041I = -1;

    /* renamed from: D */
    public b81[] f25036D = new b81[0];

    /* renamed from: U */
    public boolean[] f25053U = new boolean[0];

    /* renamed from: T */
    public boolean[] f25052T = new boolean[0];

    /* renamed from: y */
    public final ArrayList<jb0> f25070y = new ArrayList<>();

    /* renamed from: C */
    public final ArrayList<qb0> f25035C = new ArrayList<>();

    /* renamed from: z */
    public final Runnable f25071z = new RunnableC2843a();

    /* renamed from: A */
    public final Runnable f25033A = new RunnableC2844b();

    /* renamed from: B */
    public final Handler f25034B = new Handler();

    /* renamed from: com.daaw.rb0$a */
    /* loaded from: classes.dex */
    public class RunnableC2843a implements Runnable {
        public RunnableC2843a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rb0.this.m11495J();
        }
    }

    /* renamed from: com.daaw.rb0$b */
    /* loaded from: classes.dex */
    public class RunnableC2844b implements Runnable {
        public RunnableC2844b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rb0.this.m11489P();
        }
    }

    /* renamed from: com.daaw.rb0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2845c extends gb1.InterfaceC1390a<rb0> {
        /* renamed from: a */
        void mo11459a();

        /* renamed from: k */
        void mo11458k(ib0.C1674a c1674a);
    }

    public rb0(int i, InterfaceC2845c interfaceC2845c, eb0 eb0Var, InterfaceC2006l2 interfaceC2006l2, long j, Format format, int i2, cp0.C0975a c0975a) {
        this.f25061p = i;
        this.f25062q = interfaceC2845c;
        this.f25063r = eb0Var;
        this.f25064s = interfaceC2006l2;
        this.f25065t = format;
        this.f25066u = i2;
        this.f25068w = c0975a;
        this.f25054V = j;
        this.f25055W = j;
    }

    /* renamed from: A */
    public static Format m11504A(Format format, Format format2, boolean z) {
        if (format == null) {
            return format2;
        }
        int i = z ? format.f35717q : -1;
        String m9997s = sq1.m9997s(format.f35718r, hq0.m20498g(format2.f35721u));
        String m20501d = hq0.m20501d(m9997s);
        if (m20501d == null) {
            m20501d = format2.f35721u;
        }
        return format2.m1732a(format.f35716p, m20501d, m9997s, i, format.f35725y, format.f35726z, format.f35712M, format.f35713N);
    }

    /* renamed from: C */
    public static boolean m11502C(Format format, Format format2) {
        String str = format.f35721u;
        String str2 = format2.f35721u;
        int m20498g = hq0.m20498g(str);
        if (m20498g != 3) {
            return m20498g == hq0.m20498g(str2);
        } else if (sq1.m10016b(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || format.f35714O == format2.f35714O;
        } else {
            return false;
        }
    }

    /* renamed from: F */
    public static boolean m11499F(AbstractC1180ef abstractC1180ef) {
        return abstractC1180ef instanceof jb0;
    }

    /* renamed from: z */
    public static C1220ev m11460z(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        return new C1220ev();
    }

    /* renamed from: B */
    public final boolean m11503B(jb0 jb0Var) {
        int i = jb0Var.f14637j;
        int length = this.f25036D.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f25052T[i2] && this.f25036D[i2].m26336v() == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public final jb0 m11501D() {
        ArrayList<jb0> arrayList = this.f25070y;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: E */
    public void m11500E(int i, boolean z, boolean z2) {
        if (!z2) {
            this.f25038F = false;
            this.f25040H = false;
        }
        for (b81 b81Var : this.f25036D) {
            b81Var.m26355I(i);
        }
        if (z) {
            for (b81 b81Var2 : this.f25036D) {
                b81Var2.m26354J();
            }
        }
    }

    /* renamed from: G */
    public final boolean m11498G() {
        return this.f25055W != -9223372036854775807L;
    }

    /* renamed from: H */
    public boolean m11497H(int i) {
        return this.f25058Z || (!m11498G() && this.f25036D[i].m26337u());
    }

    /* renamed from: I */
    public final void m11496I() {
        int i = this.f25047O.f35848p;
        int[] iArr = new int[i];
        this.f25049Q = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                b81[] b81VarArr = this.f25036D;
                if (i3 >= b81VarArr.length) {
                    break;
                } else if (m11502C(b81VarArr[i3].m26339s(), this.f25047O.m1594a(i2).m1598a(0))) {
                    this.f25049Q[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<qb0> it = this.f25035C.iterator();
        while (it.hasNext()) {
            it.next().m12644b();
        }
    }

    /* renamed from: J */
    public final void m11495J() {
        if (!this.f25046N && this.f25049Q == null && this.f25042J) {
            for (b81 b81Var : this.f25036D) {
                if (b81Var.m26339s() == null) {
                    return;
                }
            }
            if (this.f25047O != null) {
                m11496I();
                return;
            }
            m11462x();
            this.f25043K = true;
            this.f25062q.mo11459a();
        }
    }

    /* renamed from: K */
    public void m11494K() {
        this.f25067v.mo16893a();
        this.f25063r.m23626e();
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: L */
    public void mo11472k(AbstractC1180ef abstractC1180ef, long j, long j2, boolean z) {
        this.f25068w.m25163e(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f25061p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, j, j2, abstractC1180ef.mo8279c());
        if (z) {
            return;
        }
        m11485T();
        if (this.f25044L > 0) {
            this.f25062q.mo2077n(this);
        }
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: M */
    public void mo11469o(AbstractC1180ef abstractC1180ef, long j, long j2) {
        this.f25063r.m23624g(abstractC1180ef);
        this.f25068w.m25160h(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f25061p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, j, j2, abstractC1180ef.mo8279c());
        if (this.f25043K) {
            this.f25062q.mo2077n(this);
        } else {
            mo2086c(this.f25054V);
        }
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: N */
    public int mo11468r(AbstractC1180ef abstractC1180ef, long j, long j2, IOException iOException) {
        boolean z;
        long mo8279c = abstractC1180ef.mo8279c();
        boolean m11499F = m11499F(abstractC1180ef);
        if (this.f25063r.m23623h(abstractC1180ef, !m11499F || mo8279c == 0, iOException)) {
            if (m11499F) {
                ArrayList<jb0> arrayList = this.f25070y;
                C2914s6.m10685f(arrayList.remove(arrayList.size() - 1) == abstractC1180ef);
                if (this.f25070y.isEmpty()) {
                    this.f25055W = this.f25054V;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.f25068w.m25157k(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f25061p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, j, j2, abstractC1180ef.mo8279c(), iOException, z);
        if (!z) {
            return iOException instanceof tv0 ? 3 : 0;
        } else if (this.f25043K) {
            this.f25062q.mo2077n(this);
            return 2;
        } else {
            mo2086c(this.f25054V);
            return 2;
        }
    }

    /* renamed from: O */
    public boolean m11490O(ib0.C1674a c1674a, boolean z) {
        return this.f25063r.m23622i(c1674a, z);
    }

    /* renamed from: P */
    public final void m11489P() {
        this.f25042J = true;
        m11495J();
    }

    /* renamed from: Q */
    public void m11488Q(TrackGroupArray trackGroupArray, int i, TrackGroupArray trackGroupArray2) {
        this.f25043K = true;
        this.f25047O = trackGroupArray;
        this.f25048P = trackGroupArray2;
        this.f25050R = i;
        this.f25062q.mo11459a();
    }

    /* renamed from: R */
    public int m11487R(int i, k30 k30Var, C1454gq c1454gq, boolean z) {
        if (m11498G()) {
            return -3;
        }
        if (!this.f25070y.isEmpty()) {
            int i2 = 0;
            while (i2 < this.f25070y.size() - 1 && m11503B(this.f25070y.get(i2))) {
                i2++;
            }
            if (i2 > 0) {
                sq1.m10027R(this.f25070y, 0, i2);
            }
            jb0 jb0Var = this.f25070y.get(0);
            Format format = jb0Var.f8430c;
            if (!format.equals(this.f25045M)) {
                this.f25068w.m25165c(this.f25061p, format, jb0Var.f8431d, jb0Var.f8432e, jb0Var.f8433f);
            }
            this.f25045M = format;
        }
        return this.f25036D[i].m26333y(k30Var, c1454gq, z, this.f25058Z, this.f25054V);
    }

    /* renamed from: S */
    public void m11486S() {
        if (this.f25043K) {
            for (b81 b81Var : this.f25036D) {
                b81Var.m26347k();
            }
        }
        this.f25067v.m18462j(this);
        this.f25034B.removeCallbacksAndMessages(null);
        this.f25046N = true;
        this.f25035C.clear();
    }

    /* renamed from: T */
    public final void m11485T() {
        for (b81 b81Var : this.f25036D) {
            b81Var.m26360D(this.f25056X);
        }
        this.f25056X = false;
    }

    /* renamed from: U */
    public final boolean m11484U(long j) {
        int i;
        int length = this.f25036D.length;
        while (true) {
            if (i >= length) {
                return true;
            }
            b81 b81Var = this.f25036D[i];
            b81Var.m26359E();
            i = ((b81Var.m26352f(j, true, false) != -1) || (!this.f25053U[i] && this.f25051S)) ? i + 1 : 0;
        }
        return false;
    }

    /* renamed from: V */
    public boolean m11483V(long j, boolean z) {
        this.f25054V = j;
        if (!this.f25042J || z || m11498G() || !m11484U(j)) {
            this.f25055W = j;
            this.f25058Z = false;
            this.f25070y.clear();
            if (this.f25067v.m18465g()) {
                this.f25067v.m18466f();
                return true;
            }
            m11485T();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m11482W(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        boolean z3;
        C2914s6.m10685f(this.f25043K);
        int i = this.f25044L;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC3970cArr.length; i3++) {
            if (d81VarArr[i3] != null && (interfaceC3970cArr[i3] == null || !zArr[i3])) {
                this.f25044L--;
                ((qb0) d81VarArr[i3]).m12642e();
                d81VarArr[i3] = null;
            }
        }
        boolean z4 = z || (!this.f25057Y ? j == this.f25054V : i != 0);
        InterfaceC3970c m23627d = this.f25063r.m23627d();
        boolean z5 = z4;
        InterfaceC3970c interfaceC3970c = m23627d;
        for (int i4 = 0; i4 < interfaceC3970cArr.length; i4++) {
            if (d81VarArr[i4] == null && interfaceC3970cArr[i4] != null) {
                this.f25044L++;
                InterfaceC3970c interfaceC3970c2 = interfaceC3970cArr[i4];
                int m1593b = this.f25047O.m1593b(interfaceC3970c2.mo1534a());
                if (m1593b == this.f25050R) {
                    this.f25063r.m23619l(interfaceC3970c2);
                    interfaceC3970c = interfaceC3970c2;
                }
                d81VarArr[i4] = new qb0(this, m1593b);
                zArr2[i4] = true;
                if (this.f25049Q != null) {
                    ((qb0) d81VarArr[i4]).m12644b();
                }
                if (this.f25042J && !z5) {
                    b81 b81Var = this.f25036D[this.f25049Q[m1593b]];
                    b81Var.m26359E();
                    z5 = b81Var.m26352f(j, true, true) == -1 && b81Var.m26340r() != 0;
                }
            }
        }
        if (this.f25044L == 0) {
            this.f25063r.m23621j();
            this.f25045M = null;
            this.f25070y.clear();
            if (this.f25067v.m18465g()) {
                if (this.f25042J) {
                    b81[] b81VarArr = this.f25036D;
                    int length = b81VarArr.length;
                    while (i2 < length) {
                        b81VarArr[i2].m26347k();
                        i2++;
                    }
                }
                this.f25067v.m18466f();
            } else {
                m11485T();
            }
        } else {
            if (!this.f25070y.isEmpty() && !sq1.m10016b(interfaceC3970c, m23627d)) {
                if (!this.f25057Y) {
                    interfaceC3970c.mo1521n(j, j < 0 ? -j : 0L, -9223372036854775807L);
                    if (interfaceC3970c.mo1525j() == this.f25063r.m23628c().m1597b(m11501D().f8430c)) {
                        z3 = false;
                        if (z3) {
                            this.f25056X = true;
                            z2 = true;
                            z5 = true;
                            if (z5) {
                                m11483V(j, z2);
                                while (i2 < d81VarArr.length) {
                                    if (d81VarArr[i2] != null) {
                                        zArr2[i2] = true;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                z3 = true;
                if (z3) {
                }
            }
            z2 = z;
            if (z5) {
            }
        }
        m11476b0(d81VarArr);
        this.f25057Y = true;
        return z5;
    }

    /* renamed from: X */
    public void m11481X(boolean z) {
        this.f25063r.m23617n(z);
    }

    /* renamed from: Y */
    public void m11480Y(long j) {
        this.f25060b0 = j;
        for (b81 b81Var : this.f25036D) {
            b81Var.m26357G(j);
        }
    }

    /* renamed from: Z */
    public int m11479Z(int i, long j) {
        if (m11498G()) {
            return 0;
        }
        b81 b81Var = this.f25036D[i];
        if (!this.f25058Z || j <= b81Var.m26341q()) {
            int m26352f = b81Var.m26352f(j, true, true);
            if (m26352f == -1) {
                return 0;
            }
            return m26352f;
        }
        return b81Var.m26351g();
    }

    @Override // com.daaw.d00
    /* renamed from: a */
    public sm1 mo11478a(int i, int i2) {
        b81[] b81VarArr = this.f25036D;
        int length = b81VarArr.length;
        boolean z = false;
        if (i2 == 1) {
            int i3 = this.f25039G;
            if (i3 != -1) {
                if (this.f25038F) {
                    return this.f25037E[i3] == i ? b81VarArr[i3] : m11460z(i, i2);
                }
                this.f25038F = true;
                this.f25037E[i3] = i;
                return b81VarArr[i3];
            } else if (this.f25059a0) {
                return m11460z(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.f25041I;
            if (i4 != -1) {
                if (this.f25040H) {
                    return this.f25037E[i4] == i ? b81VarArr[i4] : m11460z(i, i2);
                }
                this.f25040H = true;
                this.f25037E[i4] = i;
                return b81VarArr[i4];
            } else if (this.f25059a0) {
                return m11460z(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.f25037E[i5] == i) {
                    return this.f25036D[i5];
                }
            }
            if (this.f25059a0) {
                return m11460z(i, i2);
            }
        }
        b81 b81Var = new b81(this.f25064s);
        b81Var.m26357G(this.f25060b0);
        b81Var.m26356H(this);
        int i6 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f25037E, i6);
        this.f25037E = copyOf;
        copyOf[length] = i;
        b81[] b81VarArr2 = (b81[]) Arrays.copyOf(this.f25036D, i6);
        this.f25036D = b81VarArr2;
        b81VarArr2[length] = b81Var;
        boolean[] copyOf2 = Arrays.copyOf(this.f25053U, i6);
        this.f25053U = copyOf2;
        copyOf2[length] = (i2 == 1 || i2 == 2) ? true : true;
        this.f25051S = copyOf2[length] | this.f25051S;
        if (i2 == 1) {
            this.f25038F = true;
            this.f25039G = length;
        } else if (i2 == 2) {
            this.f25040H = true;
            this.f25041I = length;
        }
        this.f25052T = Arrays.copyOf(this.f25052T, i6);
        return b81Var;
    }

    /* renamed from: a0 */
    public void m11477a0(int i) {
        int i2 = this.f25049Q[i];
        C2914s6.m10685f(this.f25052T[i2]);
        this.f25052T[i2] = false;
    }

    @Override // com.daaw.gb1
    /* renamed from: b */
    public long mo2087b() {
        if (m11498G()) {
            return this.f25055W;
        }
        if (this.f25058Z) {
            return Long.MIN_VALUE;
        }
        return m11501D().f8434g;
    }

    /* renamed from: b0 */
    public final void m11476b0(d81[] d81VarArr) {
        this.f25035C.clear();
        for (d81 d81Var : d81VarArr) {
            if (d81Var != null) {
                this.f25035C.add((qb0) d81Var);
            }
        }
    }

    @Override // com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        jb0 m11501D;
        long j2;
        if (this.f25058Z || this.f25067v.m18465g()) {
            return false;
        }
        if (m11498G()) {
            m11501D = null;
            j2 = this.f25055W;
        } else {
            m11501D = m11501D();
            j2 = m11501D.f8434g;
        }
        this.f25063r.m23629b(m11501D, j, j2, this.f25069x);
        eb0.C1174b c1174b = this.f25069x;
        boolean z = c1174b.f8317b;
        AbstractC1180ef abstractC1180ef = c1174b.f8316a;
        ib0.C1674a c1674a = c1174b.f8318c;
        c1174b.m23613a();
        if (z) {
            this.f25055W = -9223372036854775807L;
            this.f25058Z = true;
            return true;
        } else if (abstractC1180ef == null) {
            if (c1674a != null) {
                this.f25062q.mo11458k(c1674a);
            }
            return false;
        } else {
            if (m11499F(abstractC1180ef)) {
                this.f25055W = -9223372036854775807L;
                jb0 jb0Var = (jb0) abstractC1180ef;
                jb0Var.m18654h(this);
                this.f25070y.add(jb0Var);
            }
            this.f25068w.m25154n(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f25061p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, this.f25067v.m18461k(abstractC1180ef, this, this.f25066u));
            return true;
        }
    }

    @Override // com.daaw.d00
    /* renamed from: d */
    public void mo11475d(da1 da1Var) {
    }

    @Override // com.daaw.gb1
    /* renamed from: f */
    public long mo2083f() {
        ArrayList<jb0> arrayList;
        if (this.f25058Z) {
            return Long.MIN_VALUE;
        }
        if (m11498G()) {
            return this.f25055W;
        }
        long j = this.f25054V;
        jb0 m11501D = m11501D();
        if (!m11501D.mo2103f()) {
            m11501D = this.f25070y.size() > 1 ? this.f25070y.get(arrayList.size() - 2) : null;
        }
        if (m11501D != null) {
            j = Math.max(j, m11501D.f8434g);
        }
        if (this.f25042J) {
            for (b81 b81Var : this.f25036D) {
                j = Math.max(j, b81Var.m26341q());
            }
        }
        return j;
    }

    @Override // com.daaw.gb1
    /* renamed from: g */
    public void mo2082g(long j) {
    }

    @Override // com.daaw.jk0.InterfaceC1837d
    /* renamed from: h */
    public void mo11474h() {
        m11485T();
    }

    @Override // com.daaw.b81.InterfaceC0826b
    /* renamed from: j */
    public void mo11473j(Format format) {
        this.f25034B.post(this.f25071z);
    }

    /* renamed from: l */
    public void m11471l() {
        m11494K();
    }

    @Override // com.daaw.d00
    /* renamed from: n */
    public void mo11470n() {
        this.f25059a0 = true;
        this.f25034B.post(this.f25033A);
    }

    /* renamed from: s */
    public TrackGroupArray m11467s() {
        return this.f25047O;
    }

    /* renamed from: t */
    public void m11466t(long j, boolean z) {
        if (this.f25042J) {
            int length = this.f25036D.length;
            for (int i = 0; i < length; i++) {
                this.f25036D[i].m26348j(j, z, this.f25052T[i]);
            }
        }
    }

    /* renamed from: w */
    public int m11463w(int i) {
        int i2 = this.f25049Q[i];
        if (i2 == -1) {
            return this.f25048P.m1593b(this.f25047O.m1594a(i)) == -1 ? -2 : -3;
        }
        boolean[] zArr = this.f25052T;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    /* renamed from: x */
    public final void m11462x() {
        int length = this.f25036D.length;
        int i = 0;
        char c = 0;
        int i2 = -1;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = this.f25036D[i].m26339s().f35721u;
            char c2 = hq0.m20492m(str) ? (char) 3 : hq0.m20494k(str) ? (char) 2 : hq0.m20493l(str) ? (char) 1 : (char) 0;
            if (c2 > c) {
                i2 = i;
                c = c2;
            } else if (c2 == c && i2 != -1) {
                i2 = -1;
            }
            i++;
        }
        TrackGroup m23628c = this.f25063r.m23628c();
        int i3 = m23628c.f35844p;
        this.f25050R = -1;
        this.f25049Q = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.f25049Q[i4] = i4;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i5 = 0; i5 < length; i5++) {
            Format m26339s = this.f25036D[i5].m26339s();
            if (i5 == i2) {
                Format[] formatArr = new Format[i3];
                for (int i6 = 0; i6 < i3; i6++) {
                    formatArr[i6] = m11504A(m23628c.m1598a(i6), m26339s, true);
                }
                trackGroupArr[i5] = new TrackGroup(formatArr);
                this.f25050R = i5;
            } else {
                trackGroupArr[i5] = new TrackGroup(m11504A((c == 3 && hq0.m20494k(m26339s.f35721u)) ? this.f25065t : null, m26339s, false));
            }
        }
        this.f25047O = new TrackGroupArray(trackGroupArr);
        C2914s6.m10685f(this.f25048P == null);
        this.f25048P = TrackGroupArray.f35847s;
    }

    /* renamed from: y */
    public void m11461y() {
        if (this.f25043K) {
            return;
        }
        mo2086c(this.f25054V);
    }
}
