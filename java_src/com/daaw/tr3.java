package com.daaw;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class tr3 {

    /* renamed from: a */
    public final b86 f28000a;

    /* renamed from: b */
    public w07 f28001b;

    /* renamed from: c */
    public final z42 f28002c;

    /* renamed from: d */
    public final vz8 f28003d;

    public tr3() {
        b86 b86Var = new b86();
        this.f28000a = b86Var;
        this.f28001b = b86Var.f4545b.m6609a();
        this.f28002c = new z42();
        this.f28003d = new vz8();
        b86Var.f4547d.m20985a("internal.registerCallback", new Callable() { // from class: com.daaw.a32
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tr3.this.m8854b();
            }
        });
        b86Var.f4547d.m20985a("internal.eventLogger", new Callable() { // from class: com.daaw.xx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new q98(tr3.this.f28002c);
            }
        });
    }

    /* renamed from: a */
    public final z42 m8855a() {
        return this.f28002c;
    }

    /* renamed from: b */
    public final /* synthetic */ ad2 m8854b() {
        return new wu8(this.f28003d);
    }

    /* renamed from: c */
    public final void m8853c(rm7 rm7Var) {
        ad2 ad2Var;
        try {
            this.f28001b = this.f28000a.f4545b.m6609a();
            if (this.f28000a.m26328a(this.f28001b, (gs7[]) rm7Var.m11175F().toArray(new gs7[0])) instanceof oa2) {
                throw new IllegalStateException("Program loading failed");
            }
            for (lk7 lk7Var : rm7Var.m11177D().m22616G()) {
                List m16889F = lk7Var.m16889F();
                String m16890E = lk7Var.m16890E();
                Iterator it = m16889F.iterator();
                while (it.hasNext()) {
                    gl2 m26328a = this.f28000a.m26328a(this.f28001b, (gs7) it.next());
                    if (!(m26328a instanceof th2)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    w07 w07Var = this.f28001b;
                    if (w07Var.m6602h(m16890E)) {
                        gl2 m6606d = w07Var.m6606d(m16890E);
                        if (!(m6606d instanceof ad2)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(m16890E)));
                        }
                        ad2Var = (ad2) m6606d;
                    } else {
                        ad2Var = null;
                    }
                    if (ad2Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(m16890E)));
                    }
                    ad2Var.mo5780a(this.f28001b, Collections.singletonList(m26328a));
                }
            }
        } catch (Throwable th) {
            throw new sk4(th);
        }
    }

    /* renamed from: d */
    public final void m8852d(String str, Callable callable) {
        this.f28000a.f4547d.m20985a(str, callable);
    }

    /* renamed from: e */
    public final boolean m8851e(s32 s32Var) {
        try {
            this.f28002c.m2823d(s32Var);
            this.f28000a.f4546c.m6603g("runtime.counter", new tb2(Double.valueOf(0.0d)));
            this.f28003d.m6636b(this.f28001b.m6609a(), this.f28002c);
            if (m8849g()) {
                return true;
            }
            return m8850f();
        } catch (Throwable th) {
            throw new sk4(th);
        }
    }

    /* renamed from: f */
    public final boolean m8850f() {
        return !this.f28002c.m2824c().isEmpty();
    }

    /* renamed from: g */
    public final boolean m8849g() {
        z42 z42Var = this.f28002c;
        return !z42Var.m2825b().equals(z42Var.m2826a());
    }
}
