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

    /* renamed from: a */
    public final Map f23532a = new HashMap();

    /* renamed from: b */
    public final List f23533b = new ArrayList();

    /* renamed from: c */
    public final Context f23534c;

    /* renamed from: d */
    public final ix3 f23535d;

    public py3(Context context, ix3 ix3Var) {
        this.f23534c = context;
        this.f23535d = ix3Var;
    }

    /* renamed from: b */
    public final /* synthetic */ void m12869b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f23535d.m19294e();
        }
    }

    /* renamed from: c */
    public final synchronized void m12868c(String str) {
        if (this.f23532a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.f23534c) : this.f23534c.getSharedPreferences(str, 0);
        oy3 oy3Var = new oy3(this, str);
        this.f23532a.put(str, oy3Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(oy3Var);
    }

    /* renamed from: d */
    public final synchronized void m12867d(ny3 ny3Var) {
        this.f23533b.add(ny3Var);
    }
}
