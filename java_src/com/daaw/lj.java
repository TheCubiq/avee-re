package com.daaw;

import com.daaw.de1;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class lj {
    public final qj b;
    public final b c;
    public lj d;
    public de1 g;
    public HashSet<lj> a = null;
    public int e = 0;
    public int f = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
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

    public lj(qj qjVar, b bVar) {
        this.b = qjVar;
        this.c = bVar;
    }

    public boolean a(lj ljVar, int i, int i2, boolean z) {
        if (ljVar == null) {
            k();
            return true;
        } else if (z || j(ljVar)) {
            this.d = ljVar;
            if (ljVar.a == null) {
                ljVar.a = new HashSet<>();
            }
            this.d.a.add(this);
            if (i > 0) {
                this.e = i;
            } else {
                this.e = 0;
            }
            this.f = i2;
            return true;
        } else {
            return false;
        }
    }

    public int b() {
        lj ljVar;
        if (this.b.M() == 8) {
            return 0;
        }
        return (this.f <= -1 || (ljVar = this.d) == null || ljVar.b.M() != 8) ? this.e : this.f;
    }

    public final lj c() {
        switch (a.a[this.c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.b.D;
            case 3:
                return this.b.B;
            case 4:
                return this.b.E;
            case 5:
                return this.b.C;
            default:
                throw new AssertionError(this.c.name());
        }
    }

    public qj d() {
        return this.b;
    }

    public de1 e() {
        return this.g;
    }

    public lj f() {
        return this.d;
    }

    public b g() {
        return this.c;
    }

    public boolean h() {
        HashSet<lj> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<lj> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().c().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.d != null;
    }

    public boolean j(lj ljVar) {
        boolean z = false;
        if (ljVar == null) {
            return false;
        }
        b g = ljVar.g();
        b bVar = this.c;
        if (g == bVar) {
            return bVar != b.BASELINE || (ljVar.d().Q() && d().Q());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (g == b.BASELINE || g == b.CENTER_X || g == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = g == b.LEFT || g == b.RIGHT;
                if (ljVar.d() instanceof k80) {
                    return (z2 || g == b.CENTER_X) ? true : true;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = g == b.TOP || g == b.BOTTOM;
                if (ljVar.d() instanceof k80) {
                    return (z3 || g == b.CENTER_Y) ? true : true;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.c.name());
        }
    }

    public void k() {
        HashSet<lj> hashSet;
        lj ljVar = this.d;
        if (ljVar != null && (hashSet = ljVar.a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public void l(gd gdVar) {
        de1 de1Var = this.g;
        if (de1Var == null) {
            this.g = new de1(de1.a.UNRESTRICTED, null);
        } else {
            de1Var.d();
        }
    }

    public String toString() {
        return this.b.p() + ":" + this.c.toString();
    }
}
