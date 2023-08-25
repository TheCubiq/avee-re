package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class x9 extends Exception {
    public final g6<o3<?>, ConnectionResult> p;

    public x9(g6<o3<?>, ConnectionResult> g6Var) {
        this.p = g6Var;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (o3<?> o3Var : this.p.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) ry0.j(this.p.get(o3Var));
            z &= !connectionResult.u();
            String b = o3Var.b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
