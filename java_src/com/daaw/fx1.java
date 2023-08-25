package com.daaw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class fx1 {
    public static final Pattern a = Pattern.compile("^NOTE(( |\t).*)?$");
    public static final Pattern b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static Matcher a(rv0 rv0Var) {
        String k;
        while (true) {
            String k2 = rv0Var.k();
            if (k2 == null) {
                return null;
            }
            if (a.matcher(k2).matches()) {
                do {
                    k = rv0Var.k();
                    if (k != null) {
                    }
                } while (!k.isEmpty());
            } else {
                Matcher matcher = cx1.b.matcher(k2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] X = sq1.X(str, "\\.");
        long j = 0;
        for (String str2 : sq1.W(X[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (X.length == 2) {
            j2 += Long.parseLong(X[1]);
        }
        return j2 * 1000;
    }

    public static void d(rv0 rv0Var) {
        String k = rv0Var.k();
        if (k == null || !b.matcher(k).matches()) {
            throw new vh1("Expected WEBVTT. Got " + k);
        }
    }
}
