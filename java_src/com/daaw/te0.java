package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class te0 {
    public final WorkDatabase a;

    public te0(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void a(Context context, ji1 ji1Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            ji1Var.a();
            try {
                ji1Var.t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                ji1Var.t("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                ji1Var.s();
            } finally {
                ji1Var.C();
            }
        }
    }

    public int b() {
        int c;
        synchronized (te0.class) {
            c = c("next_alarm_manager_id");
        }
        return c;
    }

    public final int c(String str) {
        this.a.c();
        try {
            Long b = this.a.x().b(str);
            int i = 0;
            int intValue = b != null ? b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            e(str, i);
            this.a.r();
            return intValue;
        } finally {
            this.a.g();
        }
    }

    public int d(int i, int i2) {
        synchronized (te0.class) {
            int c = c("next_job_scheduler_id");
            if (c >= i && c <= i2) {
                i = c;
            }
            e("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    public final void e(String str, int i) {
        this.a.x().a(new wy0(str, i));
    }
}
