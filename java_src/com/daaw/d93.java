package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class d93 implements ub3 {
    public final /* synthetic */ e93 a;

    public d93(e93 e93Var) {
        this.a = e93Var;
    }

    @Override // com.daaw.ub3
    public final String a(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.a.e;
        return sharedPreferences.getString(str, str2);
    }

    @Override // com.daaw.ub3
    public final Double b(String str, double d) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.a.e;
            return Double.valueOf(sharedPreferences2.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            sharedPreferences = this.a.e;
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.daaw.ub3
    public final Long c(String str, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.a.e;
            return Long.valueOf(sharedPreferences2.getLong(str, j));
        } catch (ClassCastException unused) {
            sharedPreferences = this.a.e;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    @Override // com.daaw.ub3
    public final Boolean d(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.a.e;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.a.e;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }
}
