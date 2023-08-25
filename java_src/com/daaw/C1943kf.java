package com.daaw;

import com.daaw.tb0;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
/* renamed from: com.daaw.kf */
/* loaded from: classes.dex */
public final class C1943kf {
    /* renamed from: a */
    public static boolean m17771a(InterfaceC3970c interfaceC3970c, int i, Exception exc) {
        return m17770b(interfaceC3970c, i, exc, 60000L);
    }

    /* renamed from: b */
    public static boolean m17770b(InterfaceC3970c interfaceC3970c, int i, Exception exc, long j) {
        if (m17769c(exc)) {
            boolean mo1532c = interfaceC3970c.mo1532c(i, j);
            int i2 = ((tb0.C3040e) exc).f27195r;
            if (mo1532c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Blacklisted: duration=");
                sb.append(j);
                sb.append(", responseCode=");
                sb.append(i2);
                sb.append(", format=");
                sb.append(interfaceC3970c.mo1531d(i));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blacklisting failed (cannot blacklist last enabled track): responseCode=");
                sb2.append(i2);
                sb2.append(", format=");
                sb2.append(interfaceC3970c.mo1531d(i));
            }
            return mo1532c;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m17769c(Exception exc) {
        if (exc instanceof tb0.C3040e) {
            int i = ((tb0.C3040e) exc).f27195r;
            return i == 404 || i == 410;
        }
        return false;
    }
}
