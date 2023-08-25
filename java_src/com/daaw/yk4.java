package com.daaw;

import android.os.Bundle;
import com.daaw.g5;
import com.daaw.p2;
/* loaded from: classes2.dex */
public final class yk4 implements g5.a {
    public final /* synthetic */ fe5 a;

    public yk4(fe5 fe5Var) {
        this.a = fe5Var;
    }

    @Override // com.daaw.pl7
    public final void a(String str, String str2, Bundle bundle, long j) {
        p2.b bVar;
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", yr3.a(str2));
            bVar = this.a.b;
            bVar.a(2, bundle2);
        }
    }
}
