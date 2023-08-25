package com.daaw;

import android.util.Pair;
import com.google.android.exoplayer2.drm.InterfaceC3933d;
import java.util.Map;
/* loaded from: classes.dex */
public final class hx1 {
    /* renamed from: a */
    public static long m20335a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public static Pair<Long, Long> m20334b(InterfaceC3933d<?> interfaceC3933d) {
        Map<String, String> mo1665a = interfaceC3933d.mo1665a();
        if (mo1665a == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m20335a(mo1665a, "LicenseDurationRemaining")), Long.valueOf(m20335a(mo1665a, "PlaybackDurationRemaining")));
    }
}
