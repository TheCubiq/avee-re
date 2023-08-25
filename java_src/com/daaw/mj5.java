package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class mj5 implements o67 {
    public final /* synthetic */ nj5 a;

    public mj5(nj5 nj5Var) {
        this.a = nj5Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zo5 zo5Var;
        zo5 zo5Var2;
        fi6 fi6Var = (fi6) obj;
        if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue()) {
            zo5Var = this.a.e;
            zo5Var.i(fi6Var.b.b.e);
            zo5Var2 = this.a.e;
            zo5Var2.j(fi6Var.b.b.f);
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        Pattern pattern;
        zo5 zo5Var;
        if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue()) {
            pattern = nj5.h;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zo5Var = this.a.e;
                zo5Var.i(Integer.parseInt(group));
            }
        }
    }
}
