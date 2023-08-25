package com.daaw;

import com.daaw.de1;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.daaw.lj */
/* loaded from: classes.dex */
public class C2041lj {

    /* renamed from: b */
    public final C2716qj f17431b;

    /* renamed from: c */
    public final EnumC2043b f17432c;

    /* renamed from: d */
    public C2041lj f17433d;

    /* renamed from: g */
    public de1 f17436g;

    /* renamed from: a */
    public HashSet<C2041lj> f17430a = null;

    /* renamed from: e */
    public int f17434e = 0;

    /* renamed from: f */
    public int f17435f = -1;

    /* renamed from: com.daaw.lj$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2042a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17437a;

        static {
            int[] iArr = new int[EnumC2043b.values().length];
            f17437a = iArr;
            try {
                iArr[EnumC2043b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17437a[EnumC2043b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17437a[EnumC2043b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17437a[EnumC2043b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17437a[EnumC2043b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17437a[EnumC2043b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17437a[EnumC2043b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17437a[EnumC2043b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17437a[EnumC2043b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: com.daaw.lj$b */
    /* loaded from: classes.dex */
    public enum EnumC2043b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C2041lj(C2716qj c2716qj, EnumC2043b enumC2043b) {
        this.f17431b = c2716qj;
        this.f17432c = enumC2043b;
    }

    /* renamed from: a */
    public boolean m16931a(C2041lj c2041lj, int i, int i2, boolean z) {
        if (c2041lj == null) {
            m16921k();
            return true;
        } else if (z || m16922j(c2041lj)) {
            this.f17433d = c2041lj;
            if (c2041lj.f17430a == null) {
                c2041lj.f17430a = new HashSet<>();
            }
            this.f17433d.f17430a.add(this);
            if (i > 0) {
                this.f17434e = i;
            } else {
                this.f17434e = 0;
            }
            this.f17435f = i2;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public int m16930b() {
        C2041lj c2041lj;
        if (this.f17431b.m12451M() == 8) {
            return 0;
        }
        return (this.f17435f <= -1 || (c2041lj = this.f17433d) == null || c2041lj.f17431b.m12451M() != 8) ? this.f17434e : this.f17435f;
    }

    /* renamed from: c */
    public final C2041lj m16929c() {
        switch (C2042a.f17437a[this.f17432c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f17431b.f23992D;
            case 3:
                return this.f17431b.f23990B;
            case 4:
                return this.f17431b.f23993E;
            case 5:
                return this.f17431b.f23991C;
            default:
                throw new AssertionError(this.f17432c.name());
        }
    }

    /* renamed from: d */
    public C2716qj m16928d() {
        return this.f17431b;
    }

    /* renamed from: e */
    public de1 m16927e() {
        return this.f17436g;
    }

    /* renamed from: f */
    public C2041lj m16926f() {
        return this.f17433d;
    }

    /* renamed from: g */
    public EnumC2043b m16925g() {
        return this.f17432c;
    }

    /* renamed from: h */
    public boolean m16924h() {
        HashSet<C2041lj> hashSet = this.f17430a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C2041lj> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m16929c().m16923i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean m16923i() {
        return this.f17433d != null;
    }

    /* renamed from: j */
    public boolean m16922j(C2041lj c2041lj) {
        boolean z = false;
        if (c2041lj == null) {
            return false;
        }
        EnumC2043b m16925g = c2041lj.m16925g();
        EnumC2043b enumC2043b = this.f17432c;
        if (m16925g == enumC2043b) {
            return enumC2043b != EnumC2043b.BASELINE || (c2041lj.m16928d().m12447Q() && m16928d().m12447Q());
        }
        switch (C2042a.f17437a[enumC2043b.ordinal()]) {
            case 1:
                return (m16925g == EnumC2043b.BASELINE || m16925g == EnumC2043b.CENTER_X || m16925g == EnumC2043b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = m16925g == EnumC2043b.LEFT || m16925g == EnumC2043b.RIGHT;
                if (c2041lj.m16928d() instanceof k80) {
                    return (z2 || m16925g == EnumC2043b.CENTER_X) ? true : true;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = m16925g == EnumC2043b.TOP || m16925g == EnumC2043b.BOTTOM;
                if (c2041lj.m16928d() instanceof k80) {
                    return (z3 || m16925g == EnumC2043b.CENTER_Y) ? true : true;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f17432c.name());
        }
    }

    /* renamed from: k */
    public void m16921k() {
        HashSet<C2041lj> hashSet;
        C2041lj c2041lj = this.f17433d;
        if (c2041lj != null && (hashSet = c2041lj.f17430a) != null) {
            hashSet.remove(this);
        }
        this.f17433d = null;
        this.f17434e = 0;
        this.f17435f = -1;
    }

    /* renamed from: l */
    public void m16920l(C1395gd c1395gd) {
        de1 de1Var = this.f17436g;
        if (de1Var == null) {
            this.f17436g = new de1(de1.EnumC1078a.UNRESTRICTED, null);
        } else {
            de1Var.m24448d();
        }
    }

    public String toString() {
        return this.f17431b.m12411p() + ":" + this.f17432c.toString();
    }
}
