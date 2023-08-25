package com.daaw;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class tr3 {
    public final b86 a;
    public w07 b;
    public final z42 c;
    public final vz8 d;

    public tr3() {
        b86 b86Var = new b86();
        this.a = b86Var;
        this.b = b86Var.b.a();
        this.c = new z42();
        this.d = new vz8();
        b86Var.d.a("internal.registerCallback", new Callable() { // from class: com.daaw.a32
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tr3.this.b();
            }
        });
        b86Var.d.a("internal.eventLogger", new Callable() { // from class: com.daaw.xx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new q98(tr3.this.c);
            }
        });
    }

    public final z42 a() {
        return this.c;
    }

    public final /* synthetic */ ad2 b() {
        return new wu8(this.d);
    }

    public final void c(rm7 rm7Var) {
        ad2 ad2Var;
        try {
            this.b = this.a.b.a();
            if (this.a.a(this.b, (gs7[]) rm7Var.F().toArray(new gs7[0])) instanceof oa2) {
                throw new IllegalStateException("Program loading failed");
            }
            for (lk7 lk7Var : rm7Var.D().G()) {
                List F = lk7Var.F();
                String E = lk7Var.E();
                Iterator it = F.iterator();
                while (it.hasNext()) {
                    gl2 a = this.a.a(this.b, (gs7) it.next());
                    if (!(a instanceof th2)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    w07 w07Var = this.b;
                    if (w07Var.h(E)) {
                        gl2 d = w07Var.d(E);
                        if (!(d instanceof ad2)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(E)));
                        }
                        ad2Var = (ad2) d;
                    } else {
                        ad2Var = null;
                    }
                    if (ad2Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(E)));
                    }
                    ad2Var.a(this.b, Collections.singletonList(a));
                }
            }
        } catch (Throwable th) {
            throw new sk4(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.a.d.a(str, callable);
    }

    public final boolean e(s32 s32Var) {
        try {
            this.c.d(s32Var);
            this.a.c.g("runtime.counter", new tb2(Double.valueOf(0.0d)));
            this.d.b(this.b.a(), this.c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new sk4(th);
        }
    }

    public final boolean f() {
        return !this.c.c().isEmpty();
    }

    public final boolean g() {
        z42 z42Var = this.c;
        return !z42Var.b().equals(z42Var.a());
    }
}
