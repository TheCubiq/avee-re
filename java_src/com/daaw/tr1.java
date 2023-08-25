package com.daaw;

import android.os.AsyncTask;
import com.daaw.ir1;
/* loaded from: classes.dex */
public class tr1<Result> implements me0<Result> {
    public Result a;

    public tr1(Result result) {
        this.a = result;
    }

    @Override // com.daaw.me0
    public void a(ir1.b<Result> bVar) {
        bVar.a(this.a, false);
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
