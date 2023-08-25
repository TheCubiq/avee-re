package com.daaw;
/* loaded from: classes.dex */
public final class pm4 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ o67 f23057a;

    /* renamed from: b */
    public final /* synthetic */ qm4 f23058b;

    public pm4(qm4 qm4Var, o67 o67Var) {
        this.f23058b = qm4Var;
        this.f23057a = o67Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        z04.f34309e.execute(new Runnable() { // from class: com.daaw.km4
            @Override // java.lang.Runnable
            public final void run() {
                qm4.this.m12331d();
            }
        });
        this.f23057a.mo2151a((zl4) obj);
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        z04.f34309e.execute(new Runnable() { // from class: com.daaw.km4
            @Override // java.lang.Runnable
            public final void run() {
                qm4.this.m12331d();
            }
        });
        this.f23057a.mo2150b(th);
    }
}
