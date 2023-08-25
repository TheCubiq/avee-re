package com.daaw;
/* loaded from: classes2.dex */
public final class hd8 implements vd8 {
    public final vd8[] a;

    public hd8(vd8... vd8VarArr) {
        this.a = vd8VarArr;
    }

    @Override // com.daaw.vd8
    public final td8 a(Class cls) {
        vd8[] vd8VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            vd8 vd8Var = vd8VarArr[i];
            if (vd8Var.b(cls)) {
                return vd8Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vd8
    public final boolean b(Class cls) {
        vd8[] vd8VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (vd8VarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
