package com.daaw;
/* loaded from: classes.dex */
public abstract class dg0 {

    /* loaded from: classes.dex */
    public class a extends dg0 {
        @Override // com.daaw.dg0
        public cg0 a(String str) {
            return null;
        }
    }

    public static dg0 c() {
        return new a();
    }

    public abstract cg0 a(String str);

    public final cg0 b(String str) {
        cg0 a2 = a(str);
        return a2 == null ? cg0.a(str) : a2;
    }
}
