package com.daaw;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: classes.dex */
public final class pb {
    public static final lk1 d;
    public static final String e;
    public static final String f;
    public static final pb g;
    public static final pb h;
    public final boolean a;
    public final int b;
    public final lk1 c;

    /* loaded from: classes.dex */
    public static final class a {
        public boolean a;
        public int b;
        public lk1 c;

        public a() {
            c(pb.e(Locale.getDefault()));
        }

        public static pb b(boolean z) {
            return z ? pb.h : pb.g;
        }

        public pb a() {
            return (this.b == 2 && this.c == pb.d) ? b(this.a) : new pb(this.a, this.b, this.c);
        }

        public final void c(boolean z) {
            this.a = z;
            this.c = pb.d;
            this.b = 2;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final byte[] f = new byte[1792];
        public final CharSequence a;
        public final boolean b;
        public final int c;
        public int d;
        public char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        public static byte c(char c) {
            return c < 1792 ? f[c] : Character.getDirectionality(c);
        }

        public byte a() {
            char charAt = this.a.charAt(this.d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            byte c = c(this.e);
            if (this.b) {
                char c2 = this.e;
                return c2 == '>' ? h() : c2 == ';' ? f() : c;
            }
            return c;
        }

        public byte b() {
            char charAt = this.a.charAt(this.d);
            this.e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.d++;
            byte c = c(this.e);
            if (this.b) {
                char c2 = this.e;
                return c2 == '<' ? i() : c2 == '&' ? g() : c;
            }
            return c;
        }

        public int d() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.c && i == 0) {
                byte b = b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        public int e() {
            this.d = this.c;
            int i = 0;
            int i2 = 0;
            while (this.d > 0) {
                byte a = a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }

        public final byte f() {
            char charAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                charAt = charSequence.charAt(i3);
                this.e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.d = i;
            this.e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i = this.d;
                if (i >= this.c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.a;
                this.d = i + 1;
                charAt = charSequence.charAt(i);
                this.e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.a;
                            int i5 = i4 - 1;
                            this.d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.d = i;
            this.e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 >= this.c) {
                    this.d = i;
                    this.e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.a;
                this.d = i2 + 1;
                char charAt2 = charSequence.charAt(i2);
                this.e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i3 = this.d;
                        if (i3 < this.c) {
                            CharSequence charSequence2 = this.a;
                            this.d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        lk1 lk1Var = mk1.c;
        d = lk1Var;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        g = new pb(false, 2, lk1Var);
        h = new pb(true, 2, lk1Var);
    }

    public pb(boolean z, int i, lk1 lk1Var) {
        this.a = z;
        this.b = i;
        this.c = lk1Var;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static pb c() {
        return new a().a();
    }

    public static boolean e(Locale locale) {
        return rk1.a(locale) == 1;
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public final String f(CharSequence charSequence, lk1 lk1Var) {
        boolean a2 = lk1Var.a(charSequence, 0, charSequence.length());
        return (this.a || !(a2 || b(charSequence) == 1)) ? this.a ? (!a2 || b(charSequence) == -1) ? f : "" : "" : e;
    }

    public final String g(CharSequence charSequence, lk1 lk1Var) {
        boolean a2 = lk1Var.a(charSequence, 0, charSequence.length());
        return (this.a || !(a2 || a(charSequence) == 1)) ? this.a ? (!a2 || a(charSequence) == -1) ? f : "" : "" : e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, lk1 lk1Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = lk1Var.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a2 ? mk1.b : mk1.a));
        }
        if (a2 != this.a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a2 ? mk1.b : mk1.a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.c, true);
    }

    public String k(String str, lk1 lk1Var, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, lk1Var, z).toString();
    }
}
