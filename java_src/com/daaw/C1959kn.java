package com.daaw;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.daaw.kn */
/* loaded from: classes.dex */
public final class C1959kn {

    /* renamed from: c */
    public static final Pattern f16461c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    public final rv0 f16462a = new rv0();

    /* renamed from: b */
    public final StringBuilder f16463b = new StringBuilder();

    /* renamed from: b */
    public static boolean m17659b(rv0 rv0Var) {
        int m10917c = rv0Var.m10917c();
        int m10916d = rv0Var.m10916d();
        byte[] bArr = rv0Var.f25637a;
        if (m10917c + 2 > m10916d) {
            return false;
        }
        int i = m10917c + 1;
        if (bArr[m10917c] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= m10916d) {
                rv0Var.m10920K(m10916d - rv0Var.m10917c());
                return true;
            } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 = i3 + 1;
                m10916d = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: c */
    public static boolean m17658c(rv0 rv0Var) {
        char m17651j = m17651j(rv0Var, rv0Var.m10917c());
        if (m17651j == '\t' || m17651j == '\n' || m17651j == '\f' || m17651j == '\r' || m17651j == ' ') {
            rv0Var.m10920K(1);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m17656e(rv0 rv0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int m10917c = rv0Var.m10917c();
        int m10916d = rv0Var.m10916d();
        while (m10917c < m10916d && !z) {
            char c = (char) rv0Var.f25637a[m10917c];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                m10917c++;
                sb.append(c);
            }
        }
        rv0Var.m10920K(m10917c - rv0Var.m10917c());
        return sb.toString();
    }

    /* renamed from: f */
    public static String m17655f(rv0 rv0Var, StringBuilder sb) {
        m17648m(rv0Var);
        if (rv0Var.m10919a() == 0) {
            return null;
        }
        String m17656e = m17656e(rv0Var, sb);
        if ("".equals(m17656e)) {
            return "" + ((char) rv0Var.m10896x());
        }
        return m17656e;
    }

    /* renamed from: g */
    public static String m17654g(rv0 rv0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int m10917c = rv0Var.m10917c();
            String m17655f = m17655f(rv0Var, sb);
            if (m17655f == null) {
                return null;
            }
            if ("}".equals(m17655f) || ";".equals(m17655f)) {
                rv0Var.m10921J(m10917c);
                z = true;
            } else {
                sb2.append(m17655f);
            }
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public static String m17653h(rv0 rv0Var, StringBuilder sb) {
        m17648m(rv0Var);
        if (rv0Var.m10919a() >= 5 && "::cue".equals(rv0Var.m10899u(5))) {
            int m10917c = rv0Var.m10917c();
            String m17655f = m17655f(rv0Var, sb);
            if (m17655f == null) {
                return null;
            }
            if ("{".equals(m17655f)) {
                rv0Var.m10921J(m10917c);
                return "";
            }
            String m17650k = "(".equals(m17655f) ? m17650k(rv0Var) : null;
            String m17655f2 = m17655f(rv0Var, sb);
            if (!")".equals(m17655f2) || m17655f2 == null) {
                return null;
            }
            return m17650k;
        }
        return null;
    }

    /* renamed from: i */
    public static void m17652i(rv0 rv0Var, ax1 ax1Var, StringBuilder sb) {
        m17648m(rv0Var);
        String m17656e = m17656e(rv0Var, sb);
        if (!"".equals(m17656e) && ":".equals(m17655f(rv0Var, sb))) {
            m17648m(rv0Var);
            String m17654g = m17654g(rv0Var, sb);
            if (m17654g == null || "".equals(m17654g)) {
                return;
            }
            int m10917c = rv0Var.m10917c();
            String m17655f = m17655f(rv0Var, sb);
            if (!";".equals(m17655f)) {
                if (!"}".equals(m17655f)) {
                    return;
                }
                rv0Var.m10921J(m10917c);
            }
            if ("color".equals(m17656e)) {
                ax1Var.m26610p(C3437wg.m6079c(m17654g));
            } else if ("background-color".equals(m17656e)) {
                ax1Var.m26612n(C3437wg.m6079c(m17654g));
            } else if ("text-decoration".equals(m17656e)) {
                if ("underline".equals(m17654g)) {
                    ax1Var.m26603w(true);
                }
            } else if ("font-family".equals(m17656e)) {
                ax1Var.m26609q(m17654g);
            } else if ("font-weight".equals(m17656e)) {
                if ("bold".equals(m17654g)) {
                    ax1Var.m26611o(true);
                }
            } else if ("font-style".equals(m17656e) && "italic".equals(m17654g)) {
                ax1Var.m26608r(true);
            }
        }
    }

    /* renamed from: j */
    public static char m17651j(rv0 rv0Var, int i) {
        return (char) rv0Var.f25637a[i];
    }

    /* renamed from: k */
    public static String m17650k(rv0 rv0Var) {
        int m10917c = rv0Var.m10917c();
        int m10916d = rv0Var.m10916d();
        boolean z = false;
        while (m10917c < m10916d && !z) {
            int i = m10917c + 1;
            z = ((char) rv0Var.f25637a[m10917c]) == ')';
            m10917c = i;
        }
        return rv0Var.m10899u((m10917c - 1) - rv0Var.m10917c()).trim();
    }

    /* renamed from: l */
    public static void m17649l(rv0 rv0Var) {
        do {
        } while (!TextUtils.isEmpty(rv0Var.m10909k()));
    }

    /* renamed from: m */
    public static void m17648m(rv0 rv0Var) {
        while (true) {
            for (boolean z = true; rv0Var.m10919a() > 0 && z; z = false) {
                if (!m17658c(rv0Var) && !m17659b(rv0Var)) {
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void m17660a(ax1 ax1Var, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f16461c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                ax1Var.m26604v(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] m10022W = sq1.m10022W(str, "\\.");
        String str2 = m10022W[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            ax1Var.m26605u(str2.substring(0, indexOf2));
            ax1Var.m26606t(str2.substring(indexOf2 + 1));
        } else {
            ax1Var.m26605u(str2);
        }
        if (m10022W.length > 1) {
            ax1Var.m26607s((String[]) Arrays.copyOfRange(m10022W, 1, m10022W.length));
        }
    }

    /* renamed from: d */
    public ax1 m17657d(rv0 rv0Var) {
        this.f16463b.setLength(0);
        int m10917c = rv0Var.m10917c();
        m17649l(rv0Var);
        this.f16462a.m10923H(rv0Var.f25637a, rv0Var.m10917c());
        this.f16462a.m10921J(m10917c);
        String m17653h = m17653h(this.f16462a, this.f16463b);
        if (m17653h == null || !"{".equals(m17655f(this.f16462a, this.f16463b))) {
            return null;
        }
        ax1 ax1Var = new ax1();
        m17660a(ax1Var, m17653h);
        String str = null;
        boolean z = false;
        while (!z) {
            int m10917c2 = this.f16462a.m10917c();
            str = m17655f(this.f16462a, this.f16463b);
            boolean z2 = str == null || "}".equals(str);
            if (!z2) {
                this.f16462a.m10921J(m10917c2);
                m17652i(this.f16462a, ax1Var, this.f16463b);
            }
            z = z2;
        }
        if ("}".equals(str)) {
            return ax1Var;
        }
        return null;
    }
}
