package com.daaw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class fx1 {

    /* renamed from: a */
    public static final Pattern f10076a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b */
    public static final Pattern f10077b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static Matcher m22154a(rv0 rv0Var) {
        String m10909k;
        while (true) {
            String m10909k2 = rv0Var.m10909k();
            if (m10909k2 == null) {
                return null;
            }
            if (f10076a.matcher(m10909k2).matches()) {
                do {
                    m10909k = rv0Var.m10909k();
                    if (m10909k != null) {
                    }
                } while (!m10909k.isEmpty());
            } else {
                Matcher matcher = cx1.f6247b.matcher(m10909k2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static float m22153b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m22152c(String str) {
        String[] m10021X = sq1.m10021X(str, "\\.");
        long j = 0;
        for (String str2 : sq1.m10022W(m10021X[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (m10021X.length == 2) {
            j2 += Long.parseLong(m10021X[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: d */
    public static void m22151d(rv0 rv0Var) {
        String m10909k = rv0Var.m10909k();
        if (m10909k == null || !f10077b.matcher(m10909k).matches()) {
            throw new vh1("Expected WEBVTT. Got " + m10909k);
        }
    }
}
