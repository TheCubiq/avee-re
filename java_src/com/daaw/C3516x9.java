package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
/* renamed from: com.daaw.x9 */
/* loaded from: classes.dex */
public class C3516x9 extends Exception {

    /* renamed from: p */
    public final C1370g6<C2396o3<?>, ConnectionResult> f32188p;

    public C3516x9(C1370g6<C2396o3<?>, ConnectionResult> c1370g6) {
        this.f32188p = c1370g6;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C2396o3<?> c2396o3 : this.f32188p.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) ry0.m10830j(this.f32188p.get(c2396o3));
            z &= !connectionResult.m1205u();
            String m14599b = c2396o3.m14599b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(m14599b).length() + 2 + valueOf.length());
            sb.append(m14599b);
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
