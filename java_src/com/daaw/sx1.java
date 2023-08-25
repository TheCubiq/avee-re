package com.daaw;

import android.content.Context;
import com.daaw.mj;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class sx1 implements mj.a {
    public static final String d = ll0.f("WorkConstraintsTracker");
    public final rx1 a;
    public final mj<?>[] b;
    public final Object c;

    public sx1(Context context, wj1 wj1Var, rx1 rx1Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = rx1Var;
        this.b = new mj[]{new jb(applicationContext, wj1Var), new lb(applicationContext, wj1Var), new ag1(applicationContext, wj1Var), new ks0(applicationContext, wj1Var), new rs0(applicationContext, wj1Var), new ns0(applicationContext, wj1Var), new ms0(applicationContext, wj1Var)};
        this.c = new Object();
    }

    @Override // com.daaw.mj.a
    public void a(List<String> list) {
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    ll0.c().a(d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            rx1 rx1Var = this.a;
            if (rx1Var != null) {
                rx1Var.f(arrayList);
            }
        }
    }

    @Override // com.daaw.mj.a
    public void b(List<String> list) {
        synchronized (this.c) {
            rx1 rx1Var = this.a;
            if (rx1Var != null) {
                rx1Var.b(list);
            }
        }
    }

    public boolean c(String str) {
        mj<?>[] mjVarArr;
        synchronized (this.c) {
            for (mj<?> mjVar : this.b) {
                if (mjVar.d(str)) {
                    ll0.c().a(d, String.format("Work %s constrained by %s", str, mjVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<qy1> iterable) {
        synchronized (this.c) {
            for (mj<?> mjVar : this.b) {
                mjVar.g(null);
            }
            for (mj<?> mjVar2 : this.b) {
                mjVar2.e(iterable);
            }
            for (mj<?> mjVar3 : this.b) {
                mjVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            for (mj<?> mjVar : this.b) {
                mjVar.f();
            }
        }
    }
}
