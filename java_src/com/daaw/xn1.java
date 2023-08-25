package com.daaw;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class xn1 implements wn1 {
    public static volatile yn1 e;
    public final cg a;
    public final cg b;
    public final q81 c;
    public final eq1 d;

    public xn1(cg cgVar, cg cgVar2, q81 q81Var, eq1 eq1Var, by1 by1Var) {
        this.a = cgVar;
        this.b = cgVar2;
        this.c = q81Var;
        this.d = eq1Var;
        by1Var.c();
    }

    public static xn1 c() {
        yn1 yn1Var = e;
        if (yn1Var != null) {
            return yn1Var.n();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<bx> d(lt ltVar) {
        return ltVar instanceof vw ? Collections.unmodifiableSet(((vw) ltVar).b()) : Collections.singleton(bx.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (xn1.class) {
                if (e == null) {
                    e = uo.q().b(context).a();
                }
            }
        }
    }

    @Override // com.daaw.wn1
    public void a(db1 db1Var, ao1 ao1Var) {
        this.c.a(db1Var.f().f(db1Var.c().c()), b(db1Var), ao1Var);
    }

    public final by b(db1 db1Var) {
        return by.a().i(this.a.a()).k(this.b.a()).j(db1Var.g()).h(new ww(db1Var.b(), db1Var.d())).g(db1Var.c().a()).d();
    }

    public eq1 e() {
        return this.d;
    }

    public tn1 g(lt ltVar) {
        return new un1(d(ltVar), sn1.a().b(ltVar.a()).c(ltVar.getExtras()).a(), this);
    }
}
