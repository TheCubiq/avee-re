package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class gj4 {
    public final xl4 a;
    public final View b;
    public final uh6 c;
    public final a74 d;

    public gj4(View view, a74 a74Var, xl4 xl4Var, uh6 uh6Var) {
        this.b = view;
        this.d = a74Var;
        this.a = xl4Var;
        this.c = uh6Var;
    }

    public static final ly4 f(final Context context, final zzchu zzchuVar, final th6 th6Var, final ri6 ri6Var) {
        return new ly4(new fs4() { // from class: com.daaw.ej4
            @Override // com.daaw.fs4
            public final void zzn() {
                zzt.zzs().zzn(context, zzchuVar.p, th6Var.D.toString(), ri6Var.f);
            }
        }, z04.f);
    }

    public static final Set g(ol4 ol4Var) {
        return Collections.singleton(new ly4(ol4Var, z04.f));
    }

    public static final ly4 h(ml4 ml4Var) {
        return new ly4(ml4Var, z04.e);
    }

    public final View a() {
        return this.b;
    }

    public final a74 b() {
        return this.d;
    }

    public final xl4 c() {
        return this.a;
    }

    public as4 d(Set set) {
        return new as4(set);
    }

    public final uh6 e() {
        return this.c;
    }
}
