package com.daaw;

import android.app.Activity;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.qw1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class o5 {
    public List<Object> a = new LinkedList();

    /* loaded from: classes.dex */
    public class a implements qw1.a<Object> {
        public a() {
        }

        @Override // com.daaw.qw1.a
        public void b(Object obj) {
            MainActivity r0 = MainActivity.r0();
            if (r0 != null) {
                r0.recreate();
            }
        }
    }

    public o5() {
        SettingsActivity.r.b(new a(), this.a);
    }

    public static int a(Activity activity) {
        switch (br1.w(j5.e().O(activity, "pref_appTheme", "0"))) {
            case 1:
                return R.style.AppTheme1;
            case 2:
                return R.style.AppTheme2;
            case 3:
                return R.style.AppTheme3;
            case 4:
                return R.style.AppTheme4;
            case 5:
                return R.style.AppTheme5;
            case 6:
                return R.style.AppTheme6;
            case 7:
                return R.style.AppTheme7;
            case 8:
                return R.style.AppTheme8Monochrome;
            case 9:
                return R.style.AppTheme9;
            default:
                return R.style.AppTheme;
        }
    }
}
