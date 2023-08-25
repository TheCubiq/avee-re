package com.daaw.avee;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.daaw.al;
import com.daaw.as0;
import com.daaw.avee.SettingsActivity;
import com.daaw.br1;
import com.daaw.i0;
import com.daaw.j5;
import com.daaw.lj0;
import com.daaw.m4;
import com.daaw.nc0;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.us0;
import com.daaw.vw1;
/* loaded from: classes.dex */
public class SettingsActivity extends m4 {
    public static qw1<al> q = new qw1<>();
    public static qw1<Object> r = new qw1<>();
    public static qw1<Boolean> s = new qw1<>();
    public static qw1<Integer> t = new qw1<>();
    public static pw1 u = new pw1();
    public static qw1<al> v = new qw1<>();

    /* loaded from: classes.dex */
    public static class a extends PreferenceFragment {

        /* renamed from: com.daaw.avee.SettingsActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0038a implements Preference.OnPreferenceClickListener {

            /* renamed from: com.daaw.avee.SettingsActivity$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class DialogInterface$OnClickListenerC0039a implements DialogInterface.OnClickListener {
                public DialogInterface$OnClickListenerC0039a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    a aVar = a.this;
                    aVar.d(aVar.getActivity().getApplicationContext());
                }
            }

            public C0038a() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                AlertDialog.Builder builder = new AlertDialog.Builder(a.this.getActivity());
                builder.setTitle(R.string.pref_reset_dialog_title);
                builder.setMessage(R.string.pref_reset_dialog_message);
                builder.setPositiveButton(R.string.dialog_ok, new DialogInterface$OnClickListenerC0039a());
                builder.setNegativeButton(R.string.dialog_cancel, (DialogInterface.OnClickListener) null);
                builder.create().show();
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Preference.OnPreferenceClickListener {
            public b() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                SettingsActivity.u.a();
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class c implements Preference.OnPreferenceClickListener {
            public c() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                SettingsActivity.v.a(new al(a.this.getActivity()));
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class d implements Preference.OnPreferenceClickListener {
            public d() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                a.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.iubenda.com/privacy-policy/8118546/full-legal")));
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class e implements Preference.OnPreferenceChangeListener {
            public e() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                if (obj instanceof Boolean) {
                    j5.e().Q(a.this.getActivity(), "pref_disableHeaderAds", ((Boolean) obj).booleanValue());
                    return true;
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class f implements Preference.OnPreferenceChangeListener {
            public f() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsActivity.r.a(obj);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class g implements Preference.OnPreferenceClickListener {
            public g() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                j5.e().S();
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class h implements Preference.OnPreferenceClickListener {
            public h() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                lj0.e(a.this.getFragmentManager(), true, R.raw.licenses_fonts, R.string.pref_fontsLicenses, "");
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class i implements Preference.OnPreferenceClickListener {
            public i() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                lj0.e(a.this.getFragmentManager(), true, R.raw.licenses, R.string.pref_openSourceLicenses, "");
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class j implements Preference.OnPreferenceChangeListener {
            public j() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setSummary(obj.toString());
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class k implements Preference.OnPreferenceChangeListener {
            public k() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setSummary(obj.toString());
                SettingsActivity.t.a(Integer.valueOf(br1.x(obj.toString(), 0)));
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class l implements Preference.OnPreferenceChangeListener {
            public l() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsActivity.s.a((Boolean) obj);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean c(Preference preference, Object obj) {
            if (obj instanceof Boolean) {
                j5.e().Q(getActivity(), "pref_alwaysHideAppLogo", ((Boolean) obj).booleanValue());
                return true;
            }
            return true;
        }

        public final void b() {
            findPreference("pref_resetToDefault").setOnPreferenceClickListener(new C0038a());
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("pref_disableHeaderAds");
            vw1<Boolean> vw1Var = nc0.g;
            Boolean bool = Boolean.FALSE;
            checkBoxPreference.setEnabled(vw1Var.a(bool).booleanValue());
            if (!nc0.g.a(bool).booleanValue()) {
                checkBoxPreference.setWidgetLayoutResource(R.layout.my_preference_widget_prcheckbox);
            }
            checkBoxPreference.setChecked(j5.e().K(getActivity(), "pref_disableHeaderAds", false));
            checkBoxPreference.setOnPreferenceChangeListener(new e());
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("pref_alwaysHideAppLogo");
            checkBoxPreference2.setEnabled(nc0.g.a(bool).booleanValue());
            if (!nc0.g.a(bool).booleanValue()) {
                checkBoxPreference2.setWidgetLayoutResource(R.layout.my_preference_widget_prcheckbox);
            }
            checkBoxPreference2.setChecked(j5.e().K(getActivity(), "pref_alwaysHideAppLogo", false));
            checkBoxPreference2.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.ub1
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    boolean c2;
                    c2 = SettingsActivity.a.this.c(preference, obj);
                    return c2;
                }
            });
            Preference findPreference = findPreference("pref_appTheme");
            findPreference.setOnPreferenceClickListener(new us0(getActivity()));
            findPreference.setOnPreferenceChangeListener(new f());
            findPreference("pref_resetTips").setOnPreferenceClickListener(new g());
            findPreference("pref_fontsLicenses").setOnPreferenceClickListener(new h());
            findPreference("pref_openSourceLicenses").setOnPreferenceClickListener(new i());
            EditTextPreference editTextPreference = (EditTextPreference) findPreference("pref_playlistDefaultPath");
            editTextPreference.setSummary(editTextPreference.getText());
            editTextPreference.setOnPreferenceChangeListener(new j());
            EditTextPreference editTextPreference2 = (EditTextPreference) findPreference("pref_audioVisOffset");
            editTextPreference2.setSummary(editTextPreference2.getText());
            editTextPreference2.setOnPreferenceChangeListener(new k());
            ((CheckBoxPreference) findPreference("pref_highQualityBlur")).setOnPreferenceChangeListener(new l());
            findPreference("pref_clearCache").setOnPreferenceClickListener(new b());
            findPreference("pref_eula").setOnPreferenceClickListener(new c());
            findPreference("pref_privacyPolicy").setOnPreferenceClickListener(new d());
        }

        public void d(Context context) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().clear().commit();
            PreferenceManager.setDefaultValues(context, R.xml.preferences, true);
            setPreferenceScreen(null);
            addPreferencesFromResource(R.xml.preferences);
            b();
        }

        public final void e(PreferenceGroup preferenceGroup) {
            if (preferenceGroup == null) {
                return;
            }
            for (int i2 = 0; i2 < preferenceGroup.getPreferenceCount(); i2++) {
                Preference preference = preferenceGroup.getPreference(i2);
                preference.setSingleLineTitle(false);
                if (preference instanceof PreferenceGroup) {
                    e((PreferenceGroup) preference);
                }
            }
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            j5.e().T(getActivity());
            addPreferencesFromResource(R.xml.preferences);
            b();
        }

        @Override // android.preference.PreferenceFragment
        public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
            if (Build.VERSION.SDK_INT >= 26) {
                e(preferenceScreen);
            }
            super.setPreferenceScreen(preferenceScreen);
        }
    }

    public void d() {
        i0 b = b();
        if (b != null) {
            b.x(getString(R.string.app_settings_name));
            b.s(true);
        }
    }

    @Override // com.daaw.m4, android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.preference_toolbar);
        c((Toolbar) findViewById(R.id.toolbar));
        d();
        getFragmentManager().beginTransaction().replace(R.id.content_frame, new a()).commit();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        as0.e(this);
        return true;
    }
}
