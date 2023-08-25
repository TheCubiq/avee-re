package com.daaw;

import android.content.SharedPreferences;
import java.util.List;
/* loaded from: classes.dex */
public final class oy3 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final String f22113a;

    /* renamed from: b */
    public final /* synthetic */ py3 f22114b;

    public oy3(py3 py3Var, String str) {
        this.f22114b = py3Var;
        this.f22113a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<ny3> list;
        synchronized (this.f22114b) {
            list = this.f22114b.f23533b;
            for (ny3 ny3Var : list) {
                ny3Var.f20851a.m12869b(ny3Var.f20852b, sharedPreferences, this.f22113a, str);
            }
        }
    }
}
