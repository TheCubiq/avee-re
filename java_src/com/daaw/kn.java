package com.daaw;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class kn {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final rv0 a = new rv0();
    public final StringBuilder b = new StringBuilder();

    public static boolean b(rv0 rv0Var) {
        int c2 = rv0Var.c();
        int d = rv0Var.d();
        byte[] bArr = rv0Var.a;
        if (c2 + 2 > d) {
            return false;
        }
        int i = c2 + 1;
        if (bArr[c2] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= d) {
                rv0Var.K(d - rv0Var.c());
                return true;
            } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 = i3 + 1;
                d = i2;
            } else {
                i2 = i3;
            }
        }
    }

    public static boolean c(rv0 rv0Var) {
        char j = j(rv0Var, rv0Var.c());
        if (j == '\t' || j == '\n' || j == '\f' || j == '\r' || j == ' ') {
            rv0Var.K(1);
            return true;
        }
        return false;
    }

    public static String e(rv0 rv0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c2 = rv0Var.c();
        int d = rv0Var.d();
        while (c2 < d && !z) {
            char c3 = (char) rv0Var.a[c2];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z = true;
            } else {
                c2++;
                sb.append(c3);
            }
        }
        rv0Var.K(c2 - rv0Var.c());
        return sb.toString();
    }

    public static String f(rv0 rv0Var, StringBuilder sb) {
        m(rv0Var);
        if (rv0Var.a() == 0) {
            return null;
        }
        String e = e(rv0Var, sb);
        if ("".equals(e)) {
            return "" + ((char) rv0Var.x());
        }
        return e;
    }

    public static String g(rv0 rv0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c2 = rv0Var.c();
            String f = f(rv0Var, sb);
            if (f == null) {
                return null;
            }
            if ("}".equals(f) || ";".equals(f)) {
                rv0Var.J(c2);
                z = true;
            } else {
                sb2.append(f);
            }
        }
        return sb2.toString();
    }

    public static String h(rv0 rv0Var, StringBuilder sb) {
        m(rv0Var);
        if (rv0Var.a() >= 5 && "::cue".equals(rv0Var.u(5))) {
            int c2 = rv0Var.c();
            String f = f(rv0Var, sb);
            if (f == null) {
                return null;
            }
            if ("{".equals(f)) {
                rv0Var.J(c2);
                return "";
            }
            String k = "(".equals(f) ? k(rv0Var) : null;
            String f2 = f(rv0Var, sb);
            if (!")".equals(f2) || f2 == null) {
                return null;
            }
            return k;
        }
        return null;
    }

    public static void i(rv0 rv0Var, ax1 ax1Var, StringBuilder sb) {
        m(rv0Var);
        String e = e(rv0Var, sb);
        if (!"".equals(e) && ":".equals(f(rv0Var, sb))) {
            m(rv0Var);
            String g = g(rv0Var, sb);
            if (g == null || "".equals(g)) {
                return;
            }
            int c2 = rv0Var.c();
            String f = f(rv0Var, sb);
            if (!";".equals(f)) {
                if (!"}".equals(f)) {
                    return;
                }
                rv0Var.J(c2);
            }
            if ("color".equals(e)) {
                ax1Var.p(wg.c(g));
            } else if ("background-color".equals(e)) {
                ax1Var.n(wg.c(g));
            } else if ("text-decoration".equals(e)) {
                if ("underline".equals(g)) {
                    ax1Var.w(true);
                }
            } else if ("font-family".equals(e)) {
                ax1Var.q(g);
            } else if ("font-weight".equals(e)) {
                if ("bold".equals(g)) {
                    ax1Var.o(true);
                }
            } else if ("font-style".equals(e) && "italic".equals(g)) {
                ax1Var.r(true);
            }
        }
    }

    public static char j(rv0 rv0Var, int i) {
        return (char) rv0Var.a[i];
    }

    public static String k(rv0 rv0Var) {
        int c2 = rv0Var.c();
        int d = rv0Var.d();
        boolean z = false;
        while (c2 < d && !z) {
            int i = c2 + 1;
            z = ((char) rv0Var.a[c2]) == ')';
            c2 = i;
        }
        return rv0Var.u((c2 - 1) - rv0Var.c()).trim();
    }

    public static void l(rv0 rv0Var) {
        do {
        } while (!TextUtils.isEmpty(rv0Var.k()));
    }

    public static void m(rv0 rv0Var) {
        while (true) {
            for (boolean z = true; rv0Var.a() > 0 && z; z = false) {
                if (!c(rv0Var) && !b(rv0Var)) {
                }
            }
            return;
        }
    }

    public final void a(ax1 ax1Var, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                ax1Var.v(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] W = sq1.W(str, "\\.");
        String str2 = W[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            ax1Var.u(str2.substring(0, indexOf2));
            ax1Var.t(str2.substring(indexOf2 + 1));
        } else {
            ax1Var.u(str2);
        }
        if (W.length > 1) {
            ax1Var.s((String[]) Arrays.copyOfRange(W, 1, W.length));
        }
    }

    public ax1 d(rv0 rv0Var) {
        this.b.setLength(0);
        int c2 = rv0Var.c();
        l(rv0Var);
        this.a.H(rv0Var.a, rv0Var.c());
        this.a.J(c2);
        String h = h(this.a, this.b);
        if (h == null || !"{".equals(f(this.a, this.b))) {
            return null;
        }
        ax1 ax1Var = new ax1();
        a(ax1Var, h);
        String str = null;
        boolean z = false;
        while (!z) {
            int c3 = this.a.c();
            str = f(this.a, this.b);
            boolean z2 = str == null || "}".equals(str);
            if (!z2) {
                this.a.J(c3);
                i(this.a, ax1Var, this.b);
            }
            z = z2;
        }
        if ("}".equals(str)) {
            return ax1Var;
        }
        return null;
    }
}
