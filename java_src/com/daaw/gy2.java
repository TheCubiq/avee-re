package com.daaw;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class gy2 extends LinkedHashMap {

    /* renamed from: p */
    public final /* synthetic */ zzc f11852p;

    public gy2(zzc zzcVar) {
        this.f11852p = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.f11852p) {
            int size = size();
            zzc zzcVar = this.f11852p;
            i = zzcVar.f36527a;
            if (size <= i) {
                return false;
            }
            arrayDeque = zzcVar.f36532f;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i2 = this.f11852p.f36527a;
            return size2 > i2;
        }
    }
}
