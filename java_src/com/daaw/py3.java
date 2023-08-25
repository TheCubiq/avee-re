package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class py3 {
    public final Map a = new HashMap();
    public final List b = new ArrayList();
    public final Context c;
    public final ix3 d;

    public py3(Context context, ix3 ix3Var) {
        this.c = context;
        this.d = ix3Var;
    }

    public final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.d.e();
        }
    }

    public final synchronized void c(String str) {
        if (this.a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
        oy3 oy3Var = new oy3(this, str);
        this.a.put(str, oy3Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(oy3Var);
    }

    public final synchronized void d(ny3 ny3Var) {
        this.b.add(ny3Var);
    }
}
