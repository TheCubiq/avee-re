package com.daaw;
/* loaded from: classes.dex */
public final class lm4 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ o67 f17541a;

    /* renamed from: b */
    public final /* synthetic */ qm4 f17542b;

    public lm4(qm4 qm4Var, o67 o67Var) {
        this.f17542b = qm4Var;
        this.f17541a = o67Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        qm4.m12333b(this.f17542b, ((gm4) obj).f11442a, this.f17541a);
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        this.f17541a.mo2150b(th);
        z04.f34309e.execute(new Runnable() { // from class: com.daaw.km4
            @Override // java.lang.Runnable
            public final void run() {
                qm4.this.m12331d();
            }
        });
    }
}
