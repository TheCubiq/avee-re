package com.daaw;

import android.content.SharedPreferences;
import java.util.List;
/* loaded from: classes.dex */
public final class oy3 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ py3 b;

    public oy3(py3 py3Var, String str) {
        this.b = py3Var;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<ny3> list;
        synchronized (this.b) {
            list = this.b.b;
            for (ny3 ny3Var : list) {
                ny3Var.a.b(ny3Var.b, sharedPreferences, this.a, str);
            }
        }
    }
}
