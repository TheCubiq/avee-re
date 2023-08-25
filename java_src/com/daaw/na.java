package com.daaw;

import com.daaw.p51;
import java.io.Serializable;
/* loaded from: classes2.dex */
public abstract class na implements gl<Object>, vl, Serializable {
    public final gl<Object> p;

    @Override // com.daaw.vl
    public vl a() {
        gl<Object> glVar = this.p;
        if (glVar instanceof vl) {
            return (vl) glVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.gl
    public final void b(Object obj) {
        Object d;
        gl glVar = this;
        while (true) {
            zp.a(glVar);
            na naVar = (na) glVar;
            gl glVar2 = naVar.p;
            ug0.c(glVar2);
            try {
                d = naVar.d(obj);
            } catch (Throwable th) {
                p51.a aVar = p51.p;
                obj = p51.a(s51.a(th));
            }
            if (d == wg0.b()) {
                return;
            }
            p51.a aVar2 = p51.p;
            obj = p51.a(d);
            naVar.e();
            if (!(glVar2 instanceof na)) {
                glVar2.b(obj);
                return;
            }
            glVar = glVar2;
        }
    }

    public StackTraceElement c() {
        return yp.d(this);
    }

    public abstract Object d(Object obj);

    public void e() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object c = c();
        if (c == null) {
            c = getClass().getName();
        }
        sb.append(c);
        return sb.toString();
    }
}
