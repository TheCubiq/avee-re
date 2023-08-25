package com.daaw;

import java.util.Locale;
/* loaded from: classes.dex */
public final class mk1 {
    public static final lk1 a = new e(null, false);
    public static final lk1 b = new e(null, true);
    public static final lk1 c;
    public static final lk1 d;
    public static final lk1 e;
    public static final lk1 f;

    /* loaded from: classes.dex */
    public static class a implements c {
        public static final a b = new a(true);
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.daaw.mk1.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = mk1.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c {
        public static final b a = new b();

        @Override // com.daaw.mk1.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = mk1.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static abstract class d implements lk1 {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        @Override // com.daaw.lk1
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? b() : c(charSequence, i, i2);
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a != 0) {
                if (a != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // com.daaw.mk1.d
        public boolean b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // com.daaw.mk1.d
        public boolean b() {
            return rk1.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.b, false);
        f = f.b;
    }

    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
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
