package com.daaw;
/* loaded from: classes2.dex */
public final class hd8 implements vd8 {

    /* renamed from: a */
    public final vd8[] f12433a;

    public hd8(vd8... vd8VarArr) {
        this.f12433a = vd8VarArr;
    }

    @Override // com.daaw.vd8
    /* renamed from: a */
    public final td8 mo7240a(Class cls) {
        vd8[] vd8VarArr = this.f12433a;
        for (int i = 0; i < 2; i++) {
            vd8 vd8Var = vd8VarArr[i];
            if (vd8Var.mo7239b(cls)) {
                return vd8Var.mo7240a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vd8
    /* renamed from: b */
    public final boolean mo7239b(Class cls) {
        vd8[] vd8VarArr = this.f12433a;
        for (int i = 0; i < 2; i++) {
            if (vd8VarArr[i].mo7239b(cls)) {
                return true;
            }
        }
        return false;
    }
}
