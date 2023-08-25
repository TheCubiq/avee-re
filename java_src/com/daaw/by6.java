package com.daaw;
/* loaded from: classes.dex */
public abstract class by6 implements ty6 {
    public static by6 b(char c) {
        return new yx6(c);
    }

    public abstract boolean a(char c);

    @Override // com.daaw.ty6
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return a(((Character) obj).charValue());
    }
}
