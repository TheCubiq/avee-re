package com.daaw;

import com.daaw.ri1;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class by1 {
    public final Executor a;
    public final ly b;
    public final py1 c;
    public final ri1 d;

    public by1(Executor executor, ly lyVar, py1 py1Var, ri1 ri1Var) {
        this.a = executor;
        this.b = lyVar;
        this.c = py1Var;
        this.d = ri1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (sn1 sn1Var : this.b.o()) {
            this.c.a(sn1Var, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.d.q(new ri1.a() { // from class: com.daaw.zx1
            @Override // com.daaw.ri1.a
            public final Object a() {
                Object d;
                d = by1.this.d();
                return d;
            }
        });
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: com.daaw.ay1
            @Override // java.lang.Runnable
            public final void run() {
                by1.this.e();
            }
        });
    }
}
