package com.daaw;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z83 {
    public final Collection a = new ArrayList();
    public final Collection b = new ArrayList();
    public final Collection c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (y83 y83Var : this.b) {
            String str = (String) zzba.zzc().b(y83Var);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(h93.a());
        return arrayList;
    }

    public final List b() {
        List a = a();
        for (y83 y83Var : this.c) {
            String str = (String) zzba.zzc().b(y83Var);
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(h93.b());
        return a;
    }

    public final void c(y83 y83Var) {
        this.b.add(y83Var);
    }

    public final void d(y83 y83Var) {
        this.a.add(y83Var);
    }

    public final void e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (y83 y83Var : this.a) {
            if (y83Var.e() == 1) {
                y83Var.d(editor, y83Var.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            k04.zzg("Flag Json is null.");
        }
    }
}
