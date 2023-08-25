package com.daaw;

import android.os.AsyncTask;
import com.daaw.ir1;
/* loaded from: classes.dex */
public class tr1<Result> implements me0<Result> {

    /* renamed from: a */
    public Result f27993a;

    public tr1(Result result) {
        this.f27993a = result;
    }

    @Override // com.daaw.me0
    /* renamed from: a */
    public void mo8856a(ir1.InterfaceC1750b<Result> interfaceC1750b) {
        interfaceC1750b.mo15140a(this.f27993a, false);
    }

    @Override // com.daaw.me0
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // com.daaw.me0
    public AsyncTask.Status getStatus() {
        return null;
    }
}
