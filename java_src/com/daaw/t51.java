package com.daaw;
/* loaded from: classes.dex */
public final class t51 {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m9520a(int i, TInput tinput, j50<TInput, TResult, TException> j50Var, u51<TInput, TResult> u51Var) {
        TResult apply;
        if (i < 1) {
            return j50Var.apply(tinput);
        }
        do {
            apply = j50Var.apply(tinput);
            tinput = u51Var.mo8579a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
