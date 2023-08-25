package com.daaw;
/* loaded from: classes.dex */
public abstract class by6 implements ty6 {
    /* renamed from: b */
    public static by6 m25734b(char c) {
        return new yx6(c);
    }

    /* renamed from: a */
    public abstract boolean mo3087a(char c);

    @Override // com.daaw.ty6
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return mo3087a(((Character) obj).charValue());
    }
}
