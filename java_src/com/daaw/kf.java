package com.daaw;

import com.daaw.tb0;
/* loaded from: classes.dex */
public final class kf {
    public static boolean a(com.google.android.exoplayer2.trackselection.c cVar, int i, Exception exc) {
        return b(cVar, i, exc, 60000L);
    }

    public static boolean b(com.google.android.exoplayer2.trackselection.c cVar, int i, Exception exc, long j) {
        if (c(exc)) {
            boolean c = cVar.c(i, j);
            int i2 = ((tb0.e) exc).r;
            if (c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Blacklisted: duration=");
                sb.append(j);
                sb.append(", responseCode=");
                sb.append(i2);
                sb.append(", format=");
                sb.append(cVar.d(i));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blacklisting failed (cannot blacklist last enabled track): responseCode=");
                sb2.append(i2);
                sb2.append(", format=");
                sb2.append(cVar.d(i));
            }
            return c;
        }
        return false;
    }

    public static boolean c(Exception exc) {
        if (exc instanceof tb0.e) {
            int i = ((tb0.e) exc).r;
            return i == 404 || i == 410;
        }
        return false;
    }
}
