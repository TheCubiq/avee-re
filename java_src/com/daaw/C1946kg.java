package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.kg */
/* loaded from: classes2.dex */
public class C1946kg extends C1827jg {
    /* renamed from: c */
    public static final <T> ArrayList<T> m17762c(T... tArr) {
        ug0.m8268f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C0816b6(tArr, true));
    }

    /* renamed from: d */
    public static final <T> List<T> m17761d() {
        return C2647pw.f23425p;
    }

    /* renamed from: e */
    public static final <T> List<T> m17760e(T... tArr) {
        ug0.m8268f(tArr, "elements");
        return tArr.length > 0 ? C2248n6.m15512a(tArr) : m17761d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final <T> List<T> m17759f(List<? extends T> list) {
        ug0.m8268f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C1827jg.m18530b(list.get(0)) : m17761d();
    }

    /* renamed from: g */
    public static final void m17758g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
