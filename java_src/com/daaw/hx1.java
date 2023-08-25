package com.daaw;

import android.util.Pair;
import java.util.Map;
/* loaded from: classes.dex */
public final class hx1 {
    public static long a(Map<String, String> map, String str) {
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

    public static Pair<Long, Long> b(com.google.android.exoplayer2.drm.d<?> dVar) {
        Map<String, String> a = dVar.a();
        if (a == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(a, "LicenseDurationRemaining")), Long.valueOf(a(a, "PlaybackDurationRemaining")));
    }
}
