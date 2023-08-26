package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class zzp {
    public final List<zzl> allHeaders;
    public final byte[] data;
    public final int statusCode;
    public final Map<String, String> zzab;
    public final boolean zzac;
    private final long zzad;

    private zzp(int i, byte[] bArr, Map<String, String> map, List<zzl> list, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.zzab = map;
        this.allHeaders = list == null ? null : Collections.unmodifiableList(list);
        this.zzac = z;
        this.zzad = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzp(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, r0, z, j);
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new zzl(entry.getKey(), entry.getValue()));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzp(int i, byte[] bArr, boolean z, long j, List<zzl> list) {
        this(i, bArr, r0, list, z, j);
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzl zzlVar : list) {
                treeMap.put(zzlVar.getName(), zzlVar.getValue());
            }
        }
    }

    @Deprecated
    public zzp(byte[] bArr, Map<String, String> map) {
        this((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, bArr, map, false, 0L);
    }
}
