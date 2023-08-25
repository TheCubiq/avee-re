package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class d93 implements ub3 {

    /* renamed from: a */
    public final /* synthetic */ e93 f6647a;

    public d93(e93 e93Var) {
        this.f6647a = e93Var;
    }

    @Override // com.daaw.ub3
    /* renamed from: a */
    public final String mo8352a(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6647a.f8267e;
        return sharedPreferences.getString(str, str2);
    }

    @Override // com.daaw.ub3
    /* renamed from: b */
    public final Double mo8351b(String str, double d) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f6647a.f8267e;
            return Double.valueOf(sharedPreferences2.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f6647a.f8267e;
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.daaw.ub3
    /* renamed from: c */
    public final Long mo8350c(String str, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f6647a.f8267e;
            return Long.valueOf(sharedPreferences2.getLong(str, j));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f6647a.f8267e;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    @Override // com.daaw.ub3
    /* renamed from: d */
    public final Boolean mo8349d(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f6647a.f8267e;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f6647a.f8267e;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }
}
