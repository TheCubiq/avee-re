package com.daaw;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* renamed from: com.daaw.pb */
/* loaded from: classes.dex */
public final class C2533pb {

    /* renamed from: d */
    public static final lk1 f22779d;

    /* renamed from: e */
    public static final String f22780e;

    /* renamed from: f */
    public static final String f22781f;

    /* renamed from: g */
    public static final C2533pb f22782g;

    /* renamed from: h */
    public static final C2533pb f22783h;

    /* renamed from: a */
    public final boolean f22784a;

    /* renamed from: b */
    public final int f22785b;

    /* renamed from: c */
    public final lk1 f22786c;

    /* renamed from: com.daaw.pb$a */
    /* loaded from: classes.dex */
    public static final class C2534a {

        /* renamed from: a */
        public boolean f22787a;

        /* renamed from: b */
        public int f22788b;

        /* renamed from: c */
        public lk1 f22789c;

        public C2534a() {
            m13517c(C2533pb.m13526e(Locale.getDefault()));
        }

        /* renamed from: b */
        public static C2533pb m13518b(boolean z) {
            return z ? C2533pb.f22783h : C2533pb.f22782g;
        }

        /* renamed from: a */
        public C2533pb m13519a() {
            return (this.f22788b == 2 && this.f22789c == C2533pb.f22779d) ? m13518b(this.f22787a) : new C2533pb(this.f22787a, this.f22788b, this.f22789c);
        }

        /* renamed from: c */
        public final void m13517c(boolean z) {
            this.f22787a = z;
            this.f22789c = C2533pb.f22779d;
            this.f22788b = 2;
        }
    }

    /* renamed from: com.daaw.pb$b */
    /* loaded from: classes.dex */
    public static class C2535b {

        /* renamed from: f */
        public static final byte[] f22790f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f22791a;

        /* renamed from: b */
        public final boolean f22792b;

        /* renamed from: c */
        public final int f22793c;

        /* renamed from: d */
        public int f22794d;

        /* renamed from: e */
        public char f22795e;

        static {
            for (int i = 0; i < 1792; i++) {
                f22790f[i] = Character.getDirectionality(i);
            }
        }

        public C2535b(CharSequence charSequence, boolean z) {
            this.f22791a = charSequence;
            this.f22792b = z;
            this.f22793c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m13514c(char c) {
            return c < 1792 ? f22790f[c] : Character.getDirectionality(c);
        }

        /* renamed from: a */
        public byte m13516a() {
            char charAt = this.f22791a.charAt(this.f22794d - 1);
            this.f22795e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f22791a, this.f22794d);
                this.f22794d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f22794d--;
            byte m13514c = m13514c(this.f22795e);
            if (this.f22792b) {
                char c = this.f22795e;
                return c == '>' ? m13509h() : c == ';' ? m13511f() : m13514c;
            }
            return m13514c;
        }

        /* renamed from: b */
        public byte m13515b() {
            char charAt = this.f22791a.charAt(this.f22794d);
            this.f22795e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f22791a, this.f22794d);
                this.f22794d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f22794d++;
            byte m13514c = m13514c(this.f22795e);
            if (this.f22792b) {
                char c = this.f22795e;
                return c == '<' ? m13508i() : c == '&' ? m13510g() : m13514c;
            }
            return m13514c;
        }

        /* renamed from: d */
        public int m13513d() {
            this.f22794d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f22794d < this.f22793c && i == 0) {
                byte m13515b = m13515b();
                if (m13515b != 0) {
                    if (m13515b == 1 || m13515b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (m13515b != 9) {
                        switch (m13515b) {
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
            while (this.f22794d > 0) {
                switch (m13516a()) {
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

        /* renamed from: e */
        public int m13512e() {
            this.f22794d = this.f22793c;
            int i = 0;
            int i2 = 0;
            while (this.f22794d > 0) {
                byte m13516a = m13516a();
                if (m13516a != 0) {
                    if (m13516a == 1 || m13516a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (m13516a != 9) {
                        switch (m13516a) {
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

        /* renamed from: f */
        public final byte m13511f() {
            char charAt;
            int i = this.f22794d;
            do {
                int i2 = this.f22794d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f22791a;
                int i3 = i2 - 1;
                this.f22794d = i3;
                charAt = charSequence.charAt(i3);
                this.f22795e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f22794d = i;
            this.f22795e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        public final byte m13510g() {
            char charAt;
            do {
                int i = this.f22794d;
                if (i >= this.f22793c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f22791a;
                this.f22794d = i + 1;
                charAt = charSequence.charAt(i);
                this.f22795e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        public final byte m13509h() {
            char charAt;
            int i = this.f22794d;
            while (true) {
                int i2 = this.f22794d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f22791a;
                int i3 = i2 - 1;
                this.f22794d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f22795e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f22794d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f22791a;
                            int i5 = i4 - 1;
                            this.f22794d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f22795e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f22794d = i;
            this.f22795e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        public final byte m13508i() {
            char charAt;
            int i = this.f22794d;
            while (true) {
                int i2 = this.f22794d;
                if (i2 >= this.f22793c) {
                    this.f22794d = i;
                    this.f22795e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f22791a;
                this.f22794d = i2 + 1;
                char charAt2 = charSequence.charAt(i2);
                this.f22795e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i3 = this.f22794d;
                        if (i3 < this.f22793c) {
                            CharSequence charSequence2 = this.f22791a;
                            this.f22794d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f22795e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        lk1 lk1Var = mk1.f18931c;
        f22779d = lk1Var;
        f22780e = Character.toString((char) 8206);
        f22781f = Character.toString((char) 8207);
        f22782g = new C2533pb(false, 2, lk1Var);
        f22783h = new C2533pb(true, 2, lk1Var);
    }

    public C2533pb(boolean z, int i, lk1 lk1Var) {
        this.f22784a = z;
        this.f22785b = i;
        this.f22786c = lk1Var;
    }

    /* renamed from: a */
    public static int m13530a(CharSequence charSequence) {
        return new C2535b(charSequence, false).m13513d();
    }

    /* renamed from: b */
    public static int m13529b(CharSequence charSequence) {
        return new C2535b(charSequence, false).m13512e();
    }

    /* renamed from: c */
    public static C2533pb m13528c() {
        return new C2534a().m13519a();
    }

    /* renamed from: e */
    public static boolean m13526e(Locale locale) {
        return rk1.m11212a(locale) == 1;
    }

    /* renamed from: d */
    public boolean m13527d() {
        return (this.f22785b & 2) != 0;
    }

    /* renamed from: f */
    public final String m13525f(CharSequence charSequence, lk1 lk1Var) {
        boolean mo15990a = lk1Var.mo15990a(charSequence, 0, charSequence.length());
        return (this.f22784a || !(mo15990a || m13529b(charSequence) == 1)) ? this.f22784a ? (!mo15990a || m13529b(charSequence) == -1) ? f22781f : "" : "" : f22780e;
    }

    /* renamed from: g */
    public final String m13524g(CharSequence charSequence, lk1 lk1Var) {
        boolean mo15990a = lk1Var.mo15990a(charSequence, 0, charSequence.length());
        return (this.f22784a || !(mo15990a || m13530a(charSequence) == 1)) ? this.f22784a ? (!mo15990a || m13530a(charSequence) == -1) ? f22781f : "" : "" : f22780e;
    }

    /* renamed from: h */
    public CharSequence m13523h(CharSequence charSequence) {
        return m13522i(charSequence, this.f22786c, true);
    }

    /* renamed from: i */
    public CharSequence m13522i(CharSequence charSequence, lk1 lk1Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean mo15990a = lk1Var.mo15990a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m13527d() && z) {
            spannableStringBuilder.append((CharSequence) m13524g(charSequence, mo15990a ? mk1.f18930b : mk1.f18929a));
        }
        if (mo15990a != this.f22784a) {
            spannableStringBuilder.append(mo15990a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m13525f(charSequence, mo15990a ? mk1.f18930b : mk1.f18929a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m13521j(String str) {
        return m13520k(str, this.f22786c, true);
    }

    /* renamed from: k */
    public String m13520k(String str, lk1 lk1Var, boolean z) {
        if (str == null) {
            return null;
        }
        return m13522i(str, lk1Var, z).toString();
    }
}
