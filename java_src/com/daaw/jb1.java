package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public class jb1 extends ib1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.daaw.jb1$a */
    /* loaded from: classes2.dex */
    public static final class C1818a<T> implements eb1<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f14654a;

        public C1818a(Iterator it) {
            this.f14654a = it;
        }

        @Override // com.daaw.eb1
        public Iterator<T> iterator() {
            return this.f14654a;
        }
    }

    /* renamed from: a */
    public static final <T> eb1<T> m18650a(Iterator<? extends T> it) {
        ug0.m8268f(it, "<this>");
        return m18649b(new C1818a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> eb1<T> m18649b(eb1<? extends T> eb1Var) {
        ug0.m8268f(eb1Var, "<this>");
        return eb1Var instanceof C1953kj ? eb1Var : new C1953kj(eb1Var);
    }
}
