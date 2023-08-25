package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class te0 {

    /* renamed from: a */
    public final WorkDatabase f27555a;

    public te0(WorkDatabase workDatabase) {
        this.f27555a = workDatabase;
    }

    /* renamed from: a */
    public static void m9237a(Context context, ji1 ji1Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            ji1Var.mo18499a();
            try {
                ji1Var.mo18493t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                ji1Var.mo18493t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                ji1Var.mo18494s();
            } finally {
                ji1Var.mo18503C();
            }
        }
    }

    /* renamed from: b */
    public int m9236b() {
        int m9235c;
        synchronized (te0.class) {
            m9235c = m9235c("next_alarm_manager_id");
        }
        return m9235c;
    }

    /* renamed from: c */
    public final int m9235c(String str) {
        this.f27555a.m26481c();
        try {
            Long mo3083b = this.f27555a.mo27937x().mo3083b(str);
            int i = 0;
            int intValue = mo3083b != null ? mo3083b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            m9233e(str, i);
            this.f27555a.m26466r();
            return intValue;
        } finally {
            this.f27555a.m26477g();
        }
    }

    /* renamed from: d */
    public int m9234d(int i, int i2) {
        synchronized (te0.class) {
            int m9235c = m9235c("next_job_scheduler_id");
            if (m9235c >= i && m9235c <= i2) {
                i = m9235c;
            }
            m9233e("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    /* renamed from: e */
    public final void m9233e(String str, int i) {
        this.f27555a.mo27937x().mo3084a(new wy0(str, i));
    }
}
