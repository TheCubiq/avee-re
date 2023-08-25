package com.daaw;

import com.google.android.gms.ads.internal.util.zzbo;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class o73 extends ah2 {
    public final /* synthetic */ byte[] D;
    public final /* synthetic */ Map E;
    public final /* synthetic */ j04 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o73(zzbo zzboVar, int i, String str, vf2 vf2Var, uf2 uf2Var, byte[] bArr, Map map, j04 j04Var) {
        super(i, str, vf2Var, uf2Var);
        this.D = bArr;
        this.E = map;
        this.F = j04Var;
    }

    @Override // com.daaw.qf2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        i((String) obj);
    }

    @Override // com.daaw.ah2
    public final void i(String str) {
        this.F.g(str);
        super.i(str);
    }

    @Override // com.daaw.qf2
    public final Map zzl() {
        Map map = this.E;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.daaw.qf2
    public final byte[] zzx() {
        byte[] bArr = this.D;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
