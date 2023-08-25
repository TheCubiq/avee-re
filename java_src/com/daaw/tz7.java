package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class tz7 {
    /* renamed from: a */
    public static HashSet m8660a(int i) {
        return new HashSet(m8657d(i));
    }

    /* renamed from: b */
    public static LinkedHashMap m8659b(int i) {
        return new LinkedHashMap(m8657d(i));
    }

    /* renamed from: c */
    public static List m8658c(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    /* renamed from: d */
    public static int m8657d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
