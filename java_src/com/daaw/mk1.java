package com.daaw;

import java.util.Locale;
/* loaded from: classes.dex */
public final class mk1 {

    /* renamed from: a */
    public static final lk1 f18929a = new C2191e(null, false);

    /* renamed from: b */
    public static final lk1 f18930b = new C2191e(null, true);

    /* renamed from: c */
    public static final lk1 f18931c;

    /* renamed from: d */
    public static final lk1 f18932d;

    /* renamed from: e */
    public static final lk1 f18933e;

    /* renamed from: f */
    public static final lk1 f18934f;

    /* renamed from: com.daaw.mk1$a */
    /* loaded from: classes.dex */
    public static class C2187a implements InterfaceC2189c {

        /* renamed from: b */
        public static final C2187a f18935b = new C2187a(true);

        /* renamed from: a */
        public final boolean f18936a;

        public C2187a(boolean z) {
            this.f18936a = z;
        }

        @Override // com.daaw.mk1.InterfaceC2189c
        /* renamed from: a */
        public int mo15991a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m15993a = mk1.m15993a(Character.getDirectionality(charSequence.charAt(i)));
                if (m15993a != 0) {
                    if (m15993a != 1) {
                        continue;
                        i++;
                    } else if (!this.f18936a) {
                        return 1;
                    }
                } else if (this.f18936a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f18936a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: com.daaw.mk1$b */
    /* loaded from: classes.dex */
    public static class C2188b implements InterfaceC2189c {

        /* renamed from: a */
        public static final C2188b f18937a = new C2188b();

        @Override // com.daaw.mk1.InterfaceC2189c
        /* renamed from: a */
        public int mo15991a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = mk1.m15992b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: com.daaw.mk1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2189c {
        /* renamed from: a */
        int mo15991a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: com.daaw.mk1$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2190d implements lk1 {

        /* renamed from: a */
        public final InterfaceC2189c f18938a;

        public AbstractC2190d(InterfaceC2189c interfaceC2189c) {
            this.f18938a = interfaceC2189c;
        }

        @Override // com.daaw.lk1
        /* renamed from: a */
        public boolean mo15990a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f18938a == null ? mo15988b() : m15989c(charSequence, i, i2);
        }

        /* renamed from: b */
        public abstract boolean mo15988b();

        /* renamed from: c */
        public final boolean m15989c(CharSequence charSequence, int i, int i2) {
            int mo15991a = this.f18938a.mo15991a(charSequence, i, i2);
            if (mo15991a != 0) {
                if (mo15991a != 1) {
                    return mo15988b();
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.daaw.mk1$e */
    /* loaded from: classes.dex */
    public static class C2191e extends AbstractC2190d {

        /* renamed from: b */
        public final boolean f18939b;

        public C2191e(InterfaceC2189c interfaceC2189c, boolean z) {
            super(interfaceC2189c);
            this.f18939b = z;
        }

        @Override // com.daaw.mk1.AbstractC2190d
        /* renamed from: b */
        public boolean mo15988b() {
            return this.f18939b;
        }
    }

    /* renamed from: com.daaw.mk1$f */
    /* loaded from: classes.dex */
    public static class C2192f extends AbstractC2190d {

        /* renamed from: b */
        public static final C2192f f18940b = new C2192f();

        public C2192f() {
            super(null);
        }

        @Override // com.daaw.mk1.AbstractC2190d
        /* renamed from: b */
        public boolean mo15988b() {
            return rk1.m11212a(Locale.getDefault()) == 1;
        }
    }

    static {
        C2188b c2188b = C2188b.f18937a;
        f18931c = new C2191e(c2188b, false);
        f18932d = new C2191e(c2188b, true);
        f18933e = new C2191e(C2187a.f18935b, false);
        f18934f = C2192f.f18940b;
    }

    /* renamed from: a */
    public static int m15993a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m15992b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
