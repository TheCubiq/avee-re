package com.daaw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes2.dex */
public abstract class qy8 {

    /* renamed from: a */
    public final String f24648a;

    /* renamed from: b */
    public final int f24649b;

    /* renamed from: c */
    public Boolean f24650c;

    /* renamed from: d */
    public Boolean f24651d;

    /* renamed from: e */
    public Long f24652e;

    /* renamed from: f */
    public Long f24653f;

    public qy8(String str, int i) {
        this.f24648a = str;
        this.f24649b = i;
    }

    /* renamed from: d */
    public static Boolean m11934d(String str, int i, boolean z, String str2, List list, String str3, om5 om5Var) {
        boolean startsWith;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (om5Var != null) {
                        om5Var.m14155w().m20652b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
        if (r8.compareTo(r5) <= 0) goto L37;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean m11933e(BigDecimal bigDecimal, tx5 tx5Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        ry0.m10830j(tx5Var);
        if (tx5Var.m8714J()) {
            if (tx5Var.m8709O() != 1) {
                if (tx5Var.m8709O() == 5) {
                    if (!tx5Var.m8710N() || !tx5Var.m8711M()) {
                        return null;
                    }
                } else if (!tx5Var.m8713K()) {
                    return null;
                }
                int m8709O = tx5Var.m8709O();
                if (tx5Var.m8709O() == 5) {
                    if (ec8.m23590N(tx5Var.m8716H()) && ec8.m23590N(tx5Var.m8717G())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(tx5Var.m8716H());
                            bigDecimal4 = new BigDecimal(tx5Var.m8717G());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!ec8.m23590N(tx5Var.m8718F())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(tx5Var.m8718F());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (m8709O == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = m8709O - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                } else if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                } else {
                    if (i != 3) {
                        if (i != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0) {
                        }
                    } else if (bigDecimal2 == null) {
                        return null;
                    } else {
                        r2 = d == 0.0d ? false : false;
                    }
                    return Boolean.valueOf(r2);
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Boolean m11932f(String str, q56 q56Var, om5 om5Var) {
        List list;
        ry0.m10830j(q56Var);
        if (str == null || !q56Var.m12759L() || q56Var.m12758M() == 1) {
            return null;
        }
        if (q56Var.m12758M() == 7) {
            if (q56Var.m12767D() == 0) {
                return null;
            }
        } else if (!q56Var.m12760K()) {
            return null;
        }
        int m12758M = q56Var.m12758M();
        boolean m12762I = q56Var.m12762I();
        String m12764G = (m12762I || m12758M == 2 || m12758M == 7) ? q56Var.m12764G() : q56Var.m12764G().toUpperCase(Locale.ENGLISH);
        if (q56Var.m12767D() == 0) {
            list = null;
        } else {
            List<String> m12763H = q56Var.m12763H();
            if (!m12762I) {
                ArrayList arrayList = new ArrayList(m12763H.size());
                for (String str2 : m12763H) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                m12763H = Collections.unmodifiableList(arrayList);
            }
            list = m12763H;
        }
        return m11934d(str, m12758M, m12762I, m12764G, list, m12758M == 2 ? m12764G : null, om5Var);
    }

    /* renamed from: g */
    public static Boolean m11931g(double d, tx5 tx5Var) {
        try {
            return m11933e(new BigDecimal(d), tx5Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m11930h(long j, tx5 tx5Var) {
        try {
            return m11933e(new BigDecimal(j), tx5Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m11929i(String str, tx5 tx5Var) {
        if (ec8.m23590N(str)) {
            try {
                return m11933e(new BigDecimal(str), tx5Var, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static Boolean m11928j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public abstract int mo4372a();

    /* renamed from: b */
    public abstract boolean mo4371b();

    /* renamed from: c */
    public abstract boolean mo4370c();
}
