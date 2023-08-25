package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class mf2 {

    /* renamed from: a */
    public final int f18849a;

    /* renamed from: b */
    public final byte[] f18850b;

    /* renamed from: c */
    public final Map f18851c;

    /* renamed from: d */
    public final List f18852d;

    /* renamed from: e */
    public final boolean f18853e;

    public mf2(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.f18849a = i;
        this.f18850b = bArr;
        this.f18851c = map;
        this.f18852d = list == null ? null : Collections.unmodifiableList(list);
        this.f18853e = z;
    }

    @Deprecated
    public mf2(int i, byte[] bArr, Map map, boolean z, long j) {
        this(i, bArr, map, m16041a(map), z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mf2(int i, byte[] bArr, boolean z, long j, List list) {
        this(i, bArr, r0, list, z, j);
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ef2 ef2Var = (ef2) it.next();
                treeMap.put(ef2Var.m23524a(), ef2Var.m23523b());
            }
        }
    }

    @Deprecated
    public mf2(byte[] bArr, Map map) {
        this(200, bArr, map, m16041a(map), false, 0L);
    }

    /* renamed from: a */
    public static List m16041a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ef2((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
