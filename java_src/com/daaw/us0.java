package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Handler;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.view.View;
import android.widget.ListView;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class us0 implements Preference.OnPreferenceClickListener {
    public final Activity a;
    public final List<String> b;

    public us0(Activity activity) {
        ug0.f(activity, "activity");
        this.a = activity;
        String[] stringArray = activity.getResources().getStringArray(R.array.pref_appTheme_entries);
        ug0.e(stringArray, "activity.resources.getSt…ay.pref_appTheme_entries)");
        ArrayList arrayList = new ArrayList();
        int length = stringArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = stringArray[i];
            int i3 = i2 + 1;
            if (i2 < 2) {
                arrayList.add(str);
            }
            i++;
            i2 = i3;
        }
        this.b = arrayList;
    }

    public static final void c(Preference preference, us0 us0Var) {
        ListView listView;
        ug0.f(us0Var, "this$0");
        DialogPreference dialogPreference = preference instanceof DialogPreference ? (DialogPreference) preference : null;
        Dialog dialog = dialogPreference == null ? null : dialogPreference.getDialog();
        AlertDialog alertDialog = dialog instanceof AlertDialog ? dialog : null;
        if (alertDialog == null || (listView = alertDialog.getListView()) == null) {
            return;
        }
        pg0 f = f31.f(0, listView.getChildCount());
        ArrayList arrayList = new ArrayList(lg.h(f, 10));
        Iterator<Integer> it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(listView.getChildAt(((mg0) it).a()));
        }
        ArrayList<View> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (us0Var.d((View) obj)) {
                arrayList2.add(obj);
            }
        }
        for (View view : arrayList2) {
            us0Var.b(view);
        }
    }

    public final void b(View view) {
        ug0.f(view, "view");
        u3 u3Var = view instanceof u3 ? (u3) view : null;
        if (u3Var == null) {
            return;
        }
        u3Var.setTypeface(null, 1);
    }

    public final boolean d(View view) {
        ug0.f(view, "child");
        List<String> list = this.b;
        u3 u3Var = view instanceof u3 ? (u3) view : null;
        return sg.j(list, u3Var != null ? u3Var.getText() : null);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(final Preference preference) {
        new Handler(this.a.getMainLooper()).post(new Runnable() { // from class: com.daaw.ts0
            @Override // java.lang.Runnable
            public final void run() {
                us0.c(preference, this);
            }
        });
        return false;
    }
}
