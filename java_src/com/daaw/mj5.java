package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class mj5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ nj5 f18901a;

    public mj5(nj5 nj5Var) {
        this.f18901a = nj5Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        zo5 zo5Var;
        zo5 zo5Var2;
        fi6 fi6Var = (fi6) obj;
        if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue()) {
            zo5Var = this.f18901a.f20166e;
            zo5Var.m2031i(fi6Var.f9624b.f8508b.f31255e);
            zo5Var2 = this.f18901a.f20166e;
            zo5Var2.m2030j(fi6Var.f9624b.f8508b.f31256f);
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        Pattern pattern;
        zo5 zo5Var;
        if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue()) {
            pattern = nj5.f20161h;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zo5Var = this.f18901a.f20166e;
                zo5Var.m2031i(Integer.parseInt(group));
            }
        }
    }
}
