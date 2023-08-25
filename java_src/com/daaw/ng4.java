package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
/* loaded from: classes.dex */
public final class ng4 implements o67 {
    public final /* synthetic */ pg4 a;

    public ng4(pg4 pg4Var) {
        this.a = pg4Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aj6 aj6Var;
        kp6 kp6Var;
        fi6 fi6Var;
        th6 th6Var;
        th6 th6Var2;
        Context context;
        String str = (String) obj;
        pg4 pg4Var = this.a;
        aj6Var = pg4Var.w;
        kp6Var = pg4Var.v;
        fi6Var = pg4Var.t;
        th6Var = pg4Var.u;
        th6Var2 = pg4Var.u;
        List d = kp6Var.d(fi6Var, th6Var, false, "", str, th6Var2.c);
        qz3 zzo = zzt.zzo();
        context = this.a.p;
        aj6Var.c(d, true == zzo.x(context) ? 2 : 1);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
    }
}
