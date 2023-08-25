package com.daaw;

import android.os.AsyncTask;
import com.daaw.ir1;
/* loaded from: classes.dex */
public class kr1<FromResult, Result> implements me0<Result> {
    public ir1<FromResult> a;
    public r40<FromResult, Result> b;

    /* loaded from: classes.dex */
    public class a implements ir1.b<FromResult> {
        public final /* synthetic */ ir1.b a;

        public a(ir1.b bVar) {
            this.a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.daaw.ir1.b
        public void a(FromResult fromresult, boolean z) {
            this.a.a(kr1.this.b.a(fromresult), z);
        }
    }

    public kr1(ir1<FromResult> ir1Var, r40<FromResult, Result> r40Var) {
        this.a = ir1Var;
        this.b = r40Var;
    }

    @Override // com.daaw.me0
    public void a(ir1.b<Result> bVar) {
        this.a.a(new a(bVar));
    }

    @Override // com.daaw.me0
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // com.daaw.me0
    public AsyncTask.Status getStatus() {
        return this.a.getStatus();
    }
}
