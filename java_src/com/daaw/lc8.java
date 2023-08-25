package com.daaw;
/* loaded from: classes2.dex */
public final class lc8 extends zc8 {
    public /* synthetic */ lc8(ic8 ic8Var) {
        super(null);
    }

    @Override // com.daaw.zc8
    /* renamed from: a */
    public final void mo2483a(Object obj, long j) {
        ((db8) ih8.m19802k(obj, j)).zzb();
    }

    @Override // com.daaw.zc8
    /* renamed from: b */
    public final void mo2482b(Object obj, Object obj2, long j) {
        db8 db8Var = (db8) ih8.m19802k(obj, j);
        db8 db8Var2 = (db8) ih8.m19802k(obj2, j);
        int size = db8Var.size();
        int size2 = db8Var2.size();
        if (size > 0 && size2 > 0) {
            if (!db8Var.zzc()) {
                db8Var = db8Var.mo5295b(size2 + size);
            }
            db8Var.addAll(db8Var2);
        }
        if (size > 0) {
            db8Var2 = db8Var;
        }
        ih8.m19789x(obj, j, db8Var2);
    }
}
