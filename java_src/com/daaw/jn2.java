package com.daaw;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class jn2 extends no2 {
    public jn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", hi2Var, i, 49);
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        this.f20528e.m20772T(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f20529f.invoke(null, this.f20525b.m6004b())).booleanValue();
            hi2 hi2Var = this.f20528e;
            if (true == booleanValue) {
                i = 2;
            }
            hi2Var.m20772T(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
