package com.daaw;

import android.app.Activity;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.qw1;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.o5 */
/* loaded from: classes.dex */
public class C2407o5 {

    /* renamed from: a */
    public List<Object> f21044a = new LinkedList();

    /* renamed from: com.daaw.o5$a */
    /* loaded from: classes.dex */
    public class C2408a implements qw1.InterfaceC2788a<Object> {
        public C2408a() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: b */
        public void mo3122b(Object obj) {
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null) {
                m26903r0.recreate();
            }
        }
    }

    public C2407o5() {
        SettingsActivity.f3767r.m12017b(new C2408a(), this.f21044a);
    }

    /* renamed from: a */
    public static int m14554a(Activity activity) {
        switch (br1.m25886w(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18948O(activity, "pref_appTheme", "0"))) {
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
