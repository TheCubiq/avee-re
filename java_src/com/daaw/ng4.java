package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
/* loaded from: classes.dex */
public final class ng4 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ pg4 f20106a;

    public ng4(pg4 pg4Var) {
        this.f20106a = pg4Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        aj6 aj6Var;
        kp6 kp6Var;
        fi6 fi6Var;
        th6 th6Var;
        th6 th6Var2;
        Context context;
        String str = (String) obj;
        pg4 pg4Var = this.f20106a;
        aj6Var = pg4Var.f22921w;
        kp6Var = pg4Var.f22920v;
        fi6Var = pg4Var.f22918t;
        th6Var = pg4Var.f22919u;
        th6Var2 = pg4Var.f22919u;
        List m17532d = kp6Var.m17532d(fi6Var, th6Var, false, "", str, th6Var2.f27684c);
        qz3 zzo = zzt.zzo();
        context = this.f20106a.f22914p;
        aj6Var.m27439c(m17532d, true == zzo.m11899x(context) ? 2 : 1);
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
    }
}
