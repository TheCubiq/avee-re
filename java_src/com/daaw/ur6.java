package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ur6 extends qr6 {
    public ur6(jr6 jr6Var, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(jr6Var, hashSet, jSONObject, j, null);
    }

    @Override // com.daaw.rr6
    public final void a(String str) {
        c(str);
        super.onPostExecute(str);
    }

    public final void c(String str) {
        lq6 a = lq6.a();
        if (a != null) {
            for (xp6 xp6Var : a.c()) {
                if (this.c.contains(xp6Var.h())) {
                    xp6Var.g().d(str, this.e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // com.daaw.rr6, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
