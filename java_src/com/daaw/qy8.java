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
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public qy8(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static Boolean d(String str, int i, boolean z, String str2, List list, String str3, om5 om5Var) {
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
                        om5Var.w().b("Invalid regular expression in REGEXP audience filter. expression", str3);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.daaw.tx5 r9, double r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qy8.e(java.math.BigDecimal, com.daaw.tx5, double):java.lang.Boolean");
    }

    public static Boolean f(String str, q56 q56Var, om5 om5Var) {
        List list;
        ry0.j(q56Var);
        if (str == null || !q56Var.L() || q56Var.M() == 1) {
            return null;
        }
        if (q56Var.M() == 7) {
            if (q56Var.D() == 0) {
                return null;
            }
        } else if (!q56Var.K()) {
            return null;
        }
        int M = q56Var.M();
        boolean I = q56Var.I();
        String G = (I || M == 2 || M == 7) ? q56Var.G() : q56Var.G().toUpperCase(Locale.ENGLISH);
        if (q56Var.D() == 0) {
            list = null;
        } else {
            List<String> H = q56Var.H();
            if (!I) {
                ArrayList arrayList = new ArrayList(H.size());
                for (String str2 : H) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                H = Collections.unmodifiableList(arrayList);
            }
            list = H;
        }
        return d(str, M, I, G, list, M == 2 ? G : null, om5Var);
    }

    public static Boolean g(double d, tx5 tx5Var) {
        try {
            return e(new BigDecimal(d), tx5Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(long j, tx5 tx5Var) {
        try {
            return e(new BigDecimal(j), tx5Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, tx5 tx5Var) {
        if (ec8.N(str)) {
            try {
                return e(new BigDecimal(str), tx5Var, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static Boolean j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
