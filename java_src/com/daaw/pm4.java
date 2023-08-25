package com.daaw;
/* loaded from: classes.dex */
public final class pm4 implements o67 {
    public final /* synthetic */ o67 a;
    public final /* synthetic */ qm4 b;

    public pm4(qm4 qm4Var, o67 o67Var) {
        this.b = qm4Var;
        this.a = o67Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        z04.e.execute(new Runnable() { // from class: com.daaw.km4
            @Override // java.lang.Runnable
            public final void run() {
                qm4.this.d();
            }
        });
        this.a.a((zl4) obj);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        z04.e.execute(new Runnable() { // from class: com.daaw.km4
            @Override // java.lang.Runnable
            public final void run() {
                qm4.this.d();
            }
        });
        this.a.b(th);
    }
}
