package com.daaw;

import android.os.Bundle;
import com.daaw.p2;
import java.util.Locale;
/* loaded from: classes2.dex */
public class yl implements p2.b {
    public w2 a;
    public w2 b;

    public static void b(w2 w2Var, String str, Bundle bundle) {
        if (w2Var == null) {
            return;
        }
        w2Var.L(str, bundle);
    }

    @Override // com.daaw.p2.b
    public void a(int i, Bundle bundle) {
        String string;
        ml0.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.a : this.b, str, bundle);
    }

    public void d(w2 w2Var) {
        this.b = w2Var;
    }

    public void e(w2 w2Var) {
        this.a = w2Var;
    }
}
