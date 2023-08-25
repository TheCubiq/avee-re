package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public class jb1 extends ib1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class a<T> implements eb1<T> {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // com.daaw.eb1
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    public static final <T> eb1<T> a(Iterator<? extends T> it) {
        ug0.f(it, "<this>");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> eb1<T> b(eb1<? extends T> eb1Var) {
        ug0.f(eb1Var, "<this>");
        return eb1Var instanceof kj ? eb1Var : new kj(eb1Var);
    }
}
