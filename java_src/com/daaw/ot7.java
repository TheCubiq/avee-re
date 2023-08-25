package com.daaw;
/* loaded from: classes.dex */
public final class ot7 implements vt7 {

    /* renamed from: a */
    public final vt7[] f21965a;

    public ot7(vt7... vt7VarArr) {
        this.f21965a = vt7VarArr;
    }

    @Override // com.daaw.vt7
    /* renamed from: a */
    public final ut7 mo6791a(Class cls) {
        vt7[] vt7VarArr = this.f21965a;
        for (int i = 0; i < 2; i++) {
            vt7 vt7Var = vt7VarArr[i];
            if (vt7Var.mo6790b(cls)) {
                return vt7Var.mo6791a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.daaw.vt7
    /* renamed from: b */
    public final boolean mo6790b(Class cls) {
        vt7[] vt7VarArr = this.f21965a;
        for (int i = 0; i < 2; i++) {
            if (vt7VarArr[i].mo6790b(cls)) {
                return true;
            }
        }
        return false;
    }
}
