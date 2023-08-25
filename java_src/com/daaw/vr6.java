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
    /* renamed from: a */
    public final void mo6835a(String str) {
        lq6 m16667a;
        if (!TextUtils.isEmpty(str) && (m16667a = lq6.m16667a()) != null) {
            for (xp6 xp6Var : m16667a.m16665c()) {
                if (this.f24287c.contains(xp6Var.m4830h())) {
                    xp6Var.m4831g().m4807e(str, this.f24289e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (br6.m25873j(this.f24288d, this.f25542b.m18312a())) {
            return null;
        }
        this.f25542b.m18308e(this.f24288d);
        return this.f24288d.toString();
    }

    @Override // com.daaw.rr6, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
