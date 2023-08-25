package com.daaw;
/* renamed from: com.daaw.ve */
/* loaded from: classes.dex */
public class C3325ve {

    /* renamed from: a */
    public final char f30165a;

    /* renamed from: b */
    public final char f30166b;

    /* renamed from: c */
    public final int f30167c;

    public C3325ve(char c, char c2) {
        this.f30165a = c;
        this.f30166b = c2;
        this.f30167c = (c2 - c) + 1;
    }

    /* renamed from: b */
    public static C3325ve m7237b() {
        return new C3325ve((char) 1536, (char) 1791);
    }

    /* renamed from: c */
    public static C3325ve m7236c() {
        return new C3325ve(' ', '~');
    }

    /* renamed from: d */
    public static C3325ve m7235d() {
        return new C3325ve('0', 'Z');
    }

    /* renamed from: e */
    public static C3325ve m7234e() {
        return new C3325ve((char) 1024, (char) 1279);
    }

    /* renamed from: f */
    public static C3325ve m7233f() {
        return new C3325ve((char) 2304, (char) 2431);
    }

    /* renamed from: g */
    public static C3325ve m7232g() {
        return new C3325ve((char) 2688, (char) 2815);
    }

    /* renamed from: h */
    public static C3325ve m7231h() {
        return new C3325ve((char) 4352, (char) 4607);
    }

    /* renamed from: i */
    public static C3325ve m7230i() {
        return new C3325ve((char) 12352, (char) 12447);
    }

    /* renamed from: j */
    public static C3325ve m7229j() {
        return new C3325ve((char) 12448, (char) 12543);
    }

    /* renamed from: k */
    public static C3325ve m7228k() {
        return new C3325ve((char) 6016, (char) 6143);
    }

    /* renamed from: l */
    public static C3325ve m7227l() {
        return new C3325ve((char) 191, (char) 382);
    }

    /* renamed from: a */
    public int m7238a() {
        return this.f30167c;
    }

    /* renamed from: m */
    public char m7226m(int i) {
        if (i >= this.f30167c) {
            i = 0;
        }
        return (char) (this.f30165a + i);
    }

    /* renamed from: n */
    public int m7225n(char c) {
        char c2 = this.f30165a;
        if (c - c2 < this.f30167c && c - c2 >= 0) {
            return c - c2;
        }
        return 0;
    }
}
