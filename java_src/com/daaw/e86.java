package com.daaw;

import android.os.Bundle;
import com.daaw.g5;
import com.daaw.p2;
/* loaded from: classes2.dex */
public final class e86 implements g5.a {
    public final /* synthetic */ z07 a;

    public e86(z07 z07Var) {
        this.a = z07Var;
    }

    @Override // com.daaw.pl7
    public final void a(String str, String str2, Bundle bundle, long j) {
        p2.b bVar;
        if (str == null || !yr3.e(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        bVar = this.a.a;
        bVar.a(3, bundle2);
    }
}
