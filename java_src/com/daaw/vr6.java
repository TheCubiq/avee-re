package com.daaw;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class vr6 extends qr6 {
    public vr6(jr6 jr6Var, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(jr6Var, hashSet, jSONObject, j, null);
    }

    @Override // com.daaw.rr6
    public final void a(String str) {
        lq6 a;
        if (!TextUtils.isEmpty(str) && (a = lq6.a()) != null) {
            for (xp6 xp6Var : a.c()) {
                if (this.c.contains(xp6Var.h())) {
                    xp6Var.g().e(str, this.e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (br6.j(this.d, this.b.a())) {
            return null;
        }
        this.b.e(this.d);
        return this.d.toString();
    }

    @Override // com.daaw.rr6, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
