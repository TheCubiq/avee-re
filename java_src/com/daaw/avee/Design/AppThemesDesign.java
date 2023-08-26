package com.daaw.avee.Design;

import android.app.Activity;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class AppThemesDesign {
    private List<Object> listenerRefHolder = new LinkedList();

    public AppThemesDesign() {
        SettingsActivity.onPrefAppThemeChanged.subscribeWeak(new WeakEvent1.Handler<Object>() { // from class: com.daaw.avee.Design.AppThemesDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Object obj) {
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity != null) {
                    mainActivity.recreate();
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onCreate.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.AppThemesDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                switch (Utils.strToIntSafe(AppPreferences.createOrGetInstance().preferencesGetStringSafe(activity, "pref_appTheme", "0"))) {
                    case 0:
                        activity.setTheme(R.style.AppTheme);
                        return;
                    case 1:
                        activity.setTheme(R.style.AppTheme1);
                        return;
                    case 2:
                        activity.setTheme(R.style.AppTheme2);
                        return;
                    case 3:
                        activity.setTheme(R.style.AppTheme3);
                        return;
                    case 4:
                        activity.setTheme(R.style.AppTheme4);
                        return;
                    case 5:
                        activity.setTheme(R.style.AppTheme5);
                        return;
                    case 6:
                        activity.setTheme(R.style.AppTheme6);
                        return;
                    case 7:
                        activity.setTheme(R.style.AppTheme7);
                        return;
                    default:
                        return;
                }
            }
        }, this.listenerRefHolder);
    }
}
