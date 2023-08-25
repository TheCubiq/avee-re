package com.daaw;

import com.google.android.gms.ads.internal.util.zzbo;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class o73 extends ah2 {

    /* renamed from: D */
    public final /* synthetic */ byte[] f21108D;

    /* renamed from: E */
    public final /* synthetic */ Map f21109E;

    /* renamed from: F */
    public final /* synthetic */ j04 f21110F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o73(zzbo zzboVar, int i, String str, vf2 vf2Var, uf2 uf2Var, byte[] bArr, Map map, j04 j04Var) {
        super(i, str, vf2Var, uf2Var);
        this.f21108D = bArr;
        this.f21109E = map;
        this.f21110F = j04Var;
    }

    @Override // com.daaw.qf2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo1347c(Object obj) {
        mo14488i((String) obj);
    }

    @Override // com.daaw.ah2
    /* renamed from: i */
    public final void mo14488i(String str) {
        this.f21110F.m19193g(str);
        super.mo14488i(str);
    }

    @Override // com.daaw.qf2
    public final Map zzl() {
        Map map = this.f21109E;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.daaw.qf2
    public final byte[] zzx() {
        byte[] bArr = this.f21108D;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
