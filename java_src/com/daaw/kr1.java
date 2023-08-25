package com.daaw;

import android.os.AsyncTask;
import com.daaw.ir1;
/* loaded from: classes.dex */
public class kr1<FromResult, Result> implements me0<Result> {

    /* renamed from: a */
    public ir1<FromResult> f16708a;

    /* renamed from: b */
    public r40<FromResult, Result> f16709b;

    /* renamed from: com.daaw.kr1$a */
    /* loaded from: classes.dex */
    public class C1981a implements ir1.InterfaceC1750b<FromResult> {

        /* renamed from: a */
        public final /* synthetic */ ir1.InterfaceC1750b f16710a;

        public C1981a(ir1.InterfaceC1750b interfaceC1750b) {
            this.f16710a = interfaceC1750b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.daaw.ir1.InterfaceC1750b
        /* renamed from: a */
        public void mo15140a(FromResult fromresult, boolean z) {
            this.f16710a.mo15140a(kr1.this.f16709b.mo5050a(fromresult), z);
        }
    }

    public kr1(ir1<FromResult> ir1Var, r40<FromResult, Result> r40Var) {
        this.f16708a = ir1Var;
        this.f16709b = r40Var;
    }

    @Override // com.daaw.me0
    /* renamed from: a */
    public void mo8856a(ir1.InterfaceC1750b<Result> interfaceC1750b) {
        this.f16708a.mo8856a(new C1981a(interfaceC1750b));
    }

    @Override // com.daaw.me0
    public boolean cancel(boolean z) {
        return this.f16708a.cancel(z);
    }

    @Override // com.daaw.me0
    public AsyncTask.Status getStatus() {
        return this.f16708a.getStatus();
    }
}
