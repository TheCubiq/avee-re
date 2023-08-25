package com.daaw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class sg2 {
    /* renamed from: a */
    public static long m10373a(String str) {
        try {
            return m10370d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                cg2.m25389d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            cg2.m25390c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* renamed from: b */
    public static ve2 m10372b(mf2 mf2Var) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = mf2Var.f18851c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long m10373a = str != null ? m10373a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long m10373a2 = str3 != null ? m10373a(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long m10373a3 = str4 != null ? m10373a(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (m10373a <= 0 || m10373a2 < m10373a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (m10373a2 - m10373a);
                j3 = j4;
            }
        }
        ve2 ve2Var = new ve2();
        ve2Var.f30176a = mf2Var.f18850b;
        ve2Var.f30177b = str5;
        ve2Var.f30181f = j4;
        ve2Var.f30180e = j3;
        ve2Var.f30178c = m10373a;
        ve2Var.f30179d = m10373a3;
        ve2Var.f30182g = map;
        ve2Var.f30183h = mf2Var.f18852d;
        return ve2Var;
    }

    /* renamed from: c */
    public static String m10371c(long j) {
        return m10370d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* renamed from: d */
    public static SimpleDateFormat m10370d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
