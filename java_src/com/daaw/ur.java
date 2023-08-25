package com.daaw;

import com.daaw.ri1;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class ur implements q81 {
    public static final Logger f = Logger.getLogger(xn1.class.getName());
    public final py1 a;
    public final Executor b;
    public final ba c;
    public final ly d;
    public final ri1 e;

    public ur(Executor executor, ba baVar, py1 py1Var, ly lyVar, ri1 ri1Var) {
        this.b = executor;
        this.c = baVar;
        this.a = py1Var;
        this.d = lyVar;
        this.e = ri1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(sn1 sn1Var, by byVar) {
        this.d.v(sn1Var, byVar);
        this.a.a(sn1Var, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final sn1 sn1Var, ao1 ao1Var, by byVar) {
        try {
            rn1 a = this.c.a(sn1Var.b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", sn1Var.b());
                f.warning(format);
                ao1Var.a(new IllegalArgumentException(format));
                return;
            }
            final by b = a.b(byVar);
            this.e.q(new ri1.a() { // from class: com.daaw.rr
                @Override // com.daaw.ri1.a
                public final Object a() {
                    Object d;
                    d = ur.this.d(sn1Var, b);
                    return d;
                }
            });
            ao1Var.a(null);
        } catch (Exception e) {
            Logger logger = f;
            logger.warning("Error scheduling event " + e.getMessage());
            ao1Var.a(e);
        }
    }

    @Override // com.daaw.q81
    public void a(final sn1 sn1Var, final by byVar, final ao1 ao1Var) {
        this.b.execute(new Runnable() { // from class: com.daaw.sr
            @Override // java.lang.Runnable
            public final void run() {
                ur.this.e(sn1Var, ao1Var, byVar);
            }
        });
    }
}
