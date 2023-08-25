package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ur6 extends qr6 {
    public ur6(jr6 jr6Var, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(jr6Var, hashSet, jSONObject, j, null);
    }

    @Override // com.daaw.rr6
    /* renamed from: a */
    public final void mo6835a(String str) {
        m7772c(str);
        super.onPostExecute(str);
    }

    /* renamed from: c */
    public final void m7772c(String str) {
        lq6 m16667a = lq6.m16667a();
        if (m16667a != null) {
            for (xp6 xp6Var : m16667a.m16665c()) {
                if (this.f24287c.contains(xp6Var.m4830h())) {
                    xp6Var.m4831g().m4808d(str, this.f24289e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f24288d.toString();
    }

    @Override // com.daaw.rr6, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m7772c(str);
        super.onPostExecute(str);
    }
}
