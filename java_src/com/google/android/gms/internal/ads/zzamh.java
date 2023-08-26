package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@zzadh
/* loaded from: classes2.dex */
public final class zzamh {
    private Map<Integer, Bitmap> zzctu = new ConcurrentHashMap();
    private AtomicInteger zzctv = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return this.zzctu.get(num);
    }

    public final int zzb(Bitmap bitmap) {
        if (bitmap == null) {
            zzakb.zzck("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.zzctv.getAndIncrement();
        this.zzctu.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    public final void zzb(Integer num) {
        this.zzctu.remove(num);
    }
}
