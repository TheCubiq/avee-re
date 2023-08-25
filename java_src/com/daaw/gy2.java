package com.daaw;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class gy2 extends LinkedHashMap {
    public final /* synthetic */ zzc p;

    public gy2(zzc zzcVar) {
        this.p = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.p) {
            int size = size();
            zzc zzcVar = this.p;
            i = zzcVar.a;
            if (size <= i) {
                return false;
            }
            arrayDeque = zzcVar.f;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i2 = this.p.a;
            return size2 > i2;
        }
    }
}
