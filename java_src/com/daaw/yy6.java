package com.daaw;
/* loaded from: classes.dex */
public final class yy6 extends dz6 {
    public final /* synthetic */ zy6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy6(zy6 zy6Var, fz6 fz6Var, CharSequence charSequence) {
        super(fz6Var, charSequence);
        this.v = zy6Var;
    }

    @Override // com.daaw.dz6
    public final int c(int i) {
        return i + 1;
    }

    @Override // com.daaw.dz6
    public final int d(int i) {
        by6 by6Var = this.v.a;
        CharSequence charSequence = this.r;
        int length = charSequence.length();
        sy6.b(i, length, "index");
        while (i < length) {
            if (by6Var.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
