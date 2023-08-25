package com.daaw;
/* loaded from: classes.dex */
public final class ot7 implements vt7 {
    public final vt7[] a;

    public ot7(vt7... vt7VarArr) {
        this.a = vt7VarArr;
    }

    @Override // com.daaw.vt7
    public final ut7 a(Class cls) {
        vt7[] vt7VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            vt7 vt7Var = vt7VarArr[i];
            if (vt7Var.b(cls)) {
                return vt7Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vt7
    public final boolean b(Class cls) {
        vt7[] vt7VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (vt7VarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
