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

    /* renamed from: a */
    public final Activity f29502a;

    /* renamed from: b */
    public final List<String> f29503b;

    public us0(Activity activity) {
        ug0.m8268f(activity, "activity");
        this.f29502a = activity;
        String[] stringArray = activity.getResources().getStringArray(R.array.pref_appTheme_entries);
        ug0.m8269e(stringArray, "activity.resources.getSt…ay.pref_appTheme_entries)");
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
        this.f29503b = arrayList;
    }

    /* renamed from: c */
    public static final void m7745c(Preference preference, us0 us0Var) {
        ListView listView;
        ug0.m8268f(us0Var, "this$0");
        DialogPreference dialogPreference = preference instanceof DialogPreference ? (DialogPreference) preference : null;
        Dialog dialog = dialogPreference == null ? null : dialogPreference.getDialog();
        AlertDialog alertDialog = dialog instanceof AlertDialog ? dialog : null;
        if (alertDialog == null || (listView = alertDialog.getListView()) == null) {
            return;
        }
        pg0 m22943f = f31.m22943f(0, listView.getChildCount());
        ArrayList arrayList = new ArrayList(C2037lg.m16966h(m22943f, 10));
        Iterator<Integer> it = m22943f.iterator();
        while (it.hasNext()) {
            arrayList.add(listView.getChildAt(((mg0) it).mo14310a()));
        }
        ArrayList<View> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (us0Var.m7744d((View) obj)) {
                arrayList2.add(obj);
            }
        }
        for (View view : arrayList2) {
            us0Var.m7746b(view);
        }
    }

    /* renamed from: b */
    public final void m7746b(View view) {
        ug0.m8268f(view, "view");
        C3159u3 c3159u3 = view instanceof C3159u3 ? (C3159u3) view : null;
        if (c3159u3 == null) {
            return;
        }
        c3159u3.setTypeface(null, 1);
    }

    /* renamed from: d */
    public final boolean m7744d(View view) {
        ug0.m8268f(view, "child");
        List<String> list = this.f29503b;
        C3159u3 c3159u3 = view instanceof C3159u3 ? (C3159u3) view : null;
        return C2937sg.m10381j(list, c3159u3 != null ? c3159u3.getText() : null);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(final Preference preference) {
        new Handler(this.f29502a.getMainLooper()).post(new Runnable() { // from class: com.daaw.ts0
            @Override // java.lang.Runnable
            public final void run() {
                us0.m7745c(preference, this);
            }
        });
        return false;
    }
}
