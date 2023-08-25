package com.daaw;

import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public class ck1 {
    public static <TResult> void a(Status status, TResult tresult, tj1<TResult> tj1Var) {
        if (status.u()) {
            tj1Var.c(tresult);
        } else {
            tj1Var.b(new l3(status));
        }
    }
}
