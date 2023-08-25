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

    /* renamed from: a */
    public final Collection f34594a = new ArrayList();

    /* renamed from: b */
    public final Collection f34595b = new ArrayList();

    /* renamed from: c */
    public final Collection f34596c = new ArrayList();

    /* renamed from: a */
    public final List m2628a() {
        ArrayList arrayList = new ArrayList();
        for (y83 y83Var : this.f34595b) {
            String str = (String) zzba.zzc().m23658b(y83Var);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(h93.m20926a());
        return arrayList;
    }

    /* renamed from: b */
    public final List m2627b() {
        List m2628a = m2628a();
        for (y83 y83Var : this.f34596c) {
            String str = (String) zzba.zzc().m23658b(y83Var);
            if (!TextUtils.isEmpty(str)) {
                m2628a.add(str);
            }
        }
        m2628a.addAll(h93.m20925b());
        return m2628a;
    }

    /* renamed from: c */
    public final void m2626c(y83 y83Var) {
        this.f34595b.add(y83Var);
    }

    /* renamed from: d */
    public final void m2625d(y83 y83Var) {
        this.f34594a.add(y83Var);
    }

    /* renamed from: e */
    public final void m2624e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (y83 y83Var : this.f34594a) {
            if (y83Var.m4011e() == 1) {
                y83Var.mo4012d(editor, y83Var.mo4015a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            k04.zzg("Flag Json is null.");
        }
    }
}
