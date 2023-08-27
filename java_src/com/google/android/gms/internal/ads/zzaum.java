package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxr;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final class zzaum<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private ConcurrentMap<String, List<zzaun<P>>> zzdhk = new ConcurrentHashMap();
    private zzaun<P> zzdhl;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaun<P> zza(P p, zzaxr.zzb zzbVar) throws GeneralSecurityException {
        ByteBuffer put;
        byte[] array;
        List<zzaun<P>> put2;
        int i = zzaud.zzdhh[zzbVar.zzzs().ordinal()];
        if (i == 1 || i == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else if (i != 3) {
            if (i == 4) {
                array = zzauc.zzdhg;
                zzaun<P> zzaunVar = new zzaun<>(p, array, zzbVar.zzzq(), zzbVar.zzzs());
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzaunVar);
                String str = new String(zzaunVar.zzwj(), UTF_8);
                put2 = this.zzdhk.put(str, Collections.unmodifiableList(arrayList));
                if (put2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(put2);
                    arrayList2.add(zzaunVar);
                    this.zzdhk.put(str, Collections.unmodifiableList(arrayList2));
                }
                return zzaunVar;
            }
            throw new GeneralSecurityException("unknown output prefix type");
        } else {
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        array = put.putInt(zzbVar.zzzr()).array();
        zzaun<P> zzaunVar2 = new zzaun<>(p, array, zzbVar.zzzq(), zzbVar.zzzs());
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(zzaunVar2);
        String str2 = new String(zzaunVar2.zzwj(), UTF_8);
        put2 = this.zzdhk.put(str2, Collections.unmodifiableList(arrayList3));
        if (put2 != null) {
        }
        return zzaunVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzaun<P> zzaunVar) {
        this.zzdhl = zzaunVar;
    }

    public final zzaun<P> zzwh() {
        return this.zzdhl;
    }
}
