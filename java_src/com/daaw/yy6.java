package com.daaw;
/* loaded from: classes.dex */
public final class yy6 extends dz6 {

    /* renamed from: v */
    public final /* synthetic */ zy6 f34264v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy6(zy6 zy6Var, fz6 fz6Var, CharSequence charSequence) {
        super(fz6Var, charSequence);
        this.f34264v = zy6Var;
    }

    @Override // com.daaw.dz6
    /* renamed from: c */
    public final int mo3067c(int i) {
        return i + 1;
    }

    @Override // com.daaw.dz6
    /* renamed from: d */
    public final int mo3066d(int i) {
        by6 by6Var = this.f34264v.f35681a;
        CharSequence charSequence = this.f8004r;
        int length = charSequence.length();
        sy6.m9707b(i, length, "index");
        while (i < length) {
            if (by6Var.mo3087a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
