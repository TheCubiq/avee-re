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
import com.daaw.AbstractC1643i0;
import com.daaw.AbstractC2150m4;
import com.daaw.C0645al;
import com.daaw.SharedPreferences$OnSharedPreferenceChangeListenerC1788j5;
import com.daaw.as0;
import com.daaw.avee.SettingsActivity;
import com.daaw.br1;
import com.daaw.lj0;
import com.daaw.nc0;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.us0;
import com.daaw.vw1;
/* loaded from: classes.dex */
public class SettingsActivity extends AbstractC2150m4 {

    /* renamed from: q */
    public static qw1<C0645al> f3766q = new qw1<>();

    /* renamed from: r */
    public static qw1<Object> f3767r = new qw1<>();

    /* renamed from: s */
    public static qw1<Boolean> f3768s = new qw1<>();

    /* renamed from: t */
    public static qw1<Integer> f3769t = new qw1<>();

    /* renamed from: u */
    public static pw1 f3770u = new pw1();

    /* renamed from: v */
    public static qw1<C0645al> f3771v = new qw1<>();

    /* renamed from: com.daaw.avee.SettingsActivity$a */
    /* loaded from: classes.dex */
    public static class C0687a extends PreferenceFragment {

        /* renamed from: com.daaw.avee.SettingsActivity$a$a */
        /* loaded from: classes.dex */
        public class C0688a implements Preference.OnPreferenceClickListener {

            /* renamed from: com.daaw.avee.SettingsActivity$a$a$a */
            /* loaded from: classes.dex */
            public class DialogInterface$OnClickListenerC0689a implements DialogInterface.OnClickListener {
                public DialogInterface$OnClickListenerC0689a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C0687a c0687a = C0687a.this;
                    c0687a.m26880d(c0687a.getActivity().getApplicationContext());
                }
            }

            public C0688a() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                AlertDialog.Builder builder = new AlertDialog.Builder(C0687a.this.getActivity());
                builder.setTitle(R.string.pref_reset_dialog_title);
                builder.setMessage(R.string.pref_reset_dialog_message);
                builder.setPositiveButton(R.string.dialog_ok, new DialogInterface$OnClickListenerC0689a());
                builder.setNegativeButton(R.string.dialog_cancel, (DialogInterface.OnClickListener) null);
                builder.create().show();
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$b */
        /* loaded from: classes.dex */
        public class C0690b implements Preference.OnPreferenceClickListener {
            public C0690b() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                SettingsActivity.f3770u.m12990a();
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$c */
        /* loaded from: classes.dex */
        public class C0691c implements Preference.OnPreferenceClickListener {
            public C0691c() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                SettingsActivity.f3771v.m12018a(new C0645al(C0687a.this.getActivity()));
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$d */
        /* loaded from: classes.dex */
        public class C0692d implements Preference.OnPreferenceClickListener {
            public C0692d() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                C0687a.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.iubenda.com/privacy-policy/8118546/full-legal")));
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$e */
        /* loaded from: classes.dex */
        public class C0693e implements Preference.OnPreferenceChangeListener {
            public C0693e() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                if (obj instanceof Boolean) {
                    SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18946Q(C0687a.this.getActivity(), "pref_disableHeaderAds", ((Boolean) obj).booleanValue());
                    return true;
                }
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$f */
        /* loaded from: classes.dex */
        public class C0694f implements Preference.OnPreferenceChangeListener {
            public C0694f() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsActivity.f3767r.m12018a(obj);
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$g */
        /* loaded from: classes.dex */
        public class C0695g implements Preference.OnPreferenceClickListener {
            public C0695g() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18944S();
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$h */
        /* loaded from: classes.dex */
        public class C0696h implements Preference.OnPreferenceClickListener {
            public C0696h() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                lj0.m16915e(C0687a.this.getFragmentManager(), true, R.raw.licenses_fonts, R.string.pref_fontsLicenses, "");
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$i */
        /* loaded from: classes.dex */
        public class C0697i implements Preference.OnPreferenceClickListener {
            public C0697i() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                lj0.m16915e(C0687a.this.getFragmentManager(), true, R.raw.licenses, R.string.pref_openSourceLicenses, "");
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$j */
        /* loaded from: classes.dex */
        public class C0698j implements Preference.OnPreferenceChangeListener {
            public C0698j() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setSummary(obj.toString());
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$k */
        /* loaded from: classes.dex */
        public class C0699k implements Preference.OnPreferenceChangeListener {
            public C0699k() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setSummary(obj.toString());
                SettingsActivity.f3769t.m12018a(Integer.valueOf(br1.m25885x(obj.toString(), 0)));
                return true;
            }
        }

        /* renamed from: com.daaw.avee.SettingsActivity$a$l */
        /* loaded from: classes.dex */
        public class C0700l implements Preference.OnPreferenceChangeListener {
            public C0700l() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsActivity.f3768s.m12018a((Boolean) obj);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ boolean m26881c(Preference preference, Object obj) {
            if (obj instanceof Boolean) {
                SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18946Q(getActivity(), "pref_alwaysHideAppLogo", ((Boolean) obj).booleanValue());
                return true;
            }
            return true;
        }

        /* renamed from: b */
        public final void m26882b() {
            findPreference("pref_resetToDefault").setOnPreferenceClickListener(new C0688a());
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("pref_disableHeaderAds");
            vw1<Boolean> vw1Var = nc0.f19989g;
            Boolean bool = Boolean.FALSE;
            checkBoxPreference.setEnabled(vw1Var.m6692a(bool).booleanValue());
            if (!nc0.f19989g.m6692a(bool).booleanValue()) {
                checkBoxPreference.setWidgetLayoutResource(R.layout.my_preference_widget_prcheckbox);
            }
            checkBoxPreference.setChecked(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getActivity(), "pref_disableHeaderAds", false));
            checkBoxPreference.setOnPreferenceChangeListener(new C0693e());
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("pref_alwaysHideAppLogo");
            checkBoxPreference2.setEnabled(nc0.f19989g.m6692a(bool).booleanValue());
            if (!nc0.f19989g.m6692a(bool).booleanValue()) {
                checkBoxPreference2.setWidgetLayoutResource(R.layout.my_preference_widget_prcheckbox);
            }
            checkBoxPreference2.setChecked(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getActivity(), "pref_alwaysHideAppLogo", false));
            checkBoxPreference2.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.ub1
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    boolean m26881c;
                    m26881c = SettingsActivity.C0687a.this.m26881c(preference, obj);
                    return m26881c;
                }
            });
            Preference findPreference = findPreference("pref_appTheme");
            findPreference.setOnPreferenceClickListener(new us0(getActivity()));
            findPreference.setOnPreferenceChangeListener(new C0694f());
            findPreference("pref_resetTips").setOnPreferenceClickListener(new C0695g());
            findPreference("pref_fontsLicenses").setOnPreferenceClickListener(new C0696h());
            findPreference("pref_openSourceLicenses").setOnPreferenceClickListener(new C0697i());
            EditTextPreference editTextPreference = (EditTextPreference) findPreference("pref_playlistDefaultPath");
            editTextPreference.setSummary(editTextPreference.getText());
            editTextPreference.setOnPreferenceChangeListener(new C0698j());
            EditTextPreference editTextPreference2 = (EditTextPreference) findPreference("pref_audioVisOffset");
            editTextPreference2.setSummary(editTextPreference2.getText());
            editTextPreference2.setOnPreferenceChangeListener(new C0699k());
            ((CheckBoxPreference) findPreference("pref_highQualityBlur")).setOnPreferenceChangeListener(new C0700l());
            findPreference("pref_clearCache").setOnPreferenceClickListener(new C0690b());
            findPreference("pref_eula").setOnPreferenceClickListener(new C0691c());
            findPreference("pref_privacyPolicy").setOnPreferenceClickListener(new C0692d());
        }

        /* renamed from: d */
        public void m26880d(Context context) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().clear().commit();
            PreferenceManager.setDefaultValues(context, R.xml.preferences, true);
            setPreferenceScreen(null);
            addPreferencesFromResource(R.xml.preferences);
            m26882b();
        }

        /* renamed from: e */
        public final void m26879e(PreferenceGroup preferenceGroup) {
            if (preferenceGroup == null) {
                return;
            }
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                Preference preference = preferenceGroup.getPreference(i);
                preference.setSingleLineTitle(false);
                if (preference instanceof PreferenceGroup) {
                    m26879e((PreferenceGroup) preference);
                }
            }
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18943T(getActivity());
            addPreferencesFromResource(R.xml.preferences);
            m26882b();
        }

        @Override // android.preference.PreferenceFragment
        public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
            if (Build.VERSION.SDK_INT >= 26) {
                m26879e(preferenceScreen);
            }
            super.setPreferenceScreen(preferenceScreen);
        }
    }

    /* renamed from: d */
    public void m26884d() {
        AbstractC1643i0 m16234b = m16234b();
        if (m16234b != null) {
            m16234b.mo15685x(getString(R.string.app_settings_name));
            m16234b.mo15690s(true);
        }
    }

    @Override // com.daaw.AbstractC2150m4, android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.preference_toolbar);
        m16233c((Toolbar) findViewById(R.id.toolbar));
        m26884d();
        getFragmentManager().beginTransaction().replace(R.id.content_frame, new C0687a()).commit();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        as0.m27107e(this);
        return true;
    }
}
