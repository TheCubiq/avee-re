package com.daaw.avee;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import com.AOSP.AppCompatPreferenceActivity;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Design.IAP2Design;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import nz.net.speakman.androidlicensespage.LicensesFragment;
/* loaded from: classes.dex */
public class SettingsActivity extends AppCompatPreferenceActivity {
    public static WeakEvent1<ContextData> onSendGeneralFeedbackAction = new WeakEvent1<>();
    public static WeakEvent1<Object> onPrefAppThemeChanged = new WeakEvent1<>();
    public static WeakEvent1<Boolean> onPrefHighQualityBlurChanged = new WeakEvent1<>();
    public static WeakEvent1<Integer> onPrefAudioVisOffsetChanged = new WeakEvent1<>();
    public static WeakEvent onClearCacheAction = new WeakEvent();
    public static WeakEvent1<ContextData> onEulaAction = new WeakEvent1<>();

    @Override // com.AOSP.AppCompatPreferenceActivity, android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.preference_toolbar);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        setupActionBar();
        getFragmentManager().beginTransaction().replace(R.id.content_frame, new SettingsFragment()).commit();
    }

    void setupActionBar() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* loaded from: classes.dex */
    public static class SettingsFragment extends PreferenceFragment {
        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            AppPreferences.createOrGetInstance().save(getActivity());
            addPreferencesFromResource(R.xml.preferences);
            addMyResetListener();
        }

        private void addMyResetListener() {
            findPreference("pref_resetToDefault").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.1
                @Override // android.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(Preference preference) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SettingsFragment.this.getActivity());
                    builder.setTitle(R.string.pref_reset_dialog_title);
                    builder.setMessage(R.string.pref_reset_dialog_message);
                    builder.setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            SettingsFragment.this.resetSettings(SettingsFragment.this.getActivity().getApplicationContext());
                        }
                    });
                    builder.setNegativeButton(R.string.dialog_cancel, (DialogInterface.OnClickListener) null);
                    builder.create().show();
                    return true;
                }
            });
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("pref_disableHeaderAds");
            checkBoxPreference.setEnabled(IAP2Design.premium);
            if (!IAP2Design.premium) {
                checkBoxPreference.setWidgetLayoutResource(R.layout.my_preference_widget_prcheckbox);
            }
            checkBoxPreference.setChecked(AppPreferences.createOrGetInstance().preferencesGetBoolSafe((Context) getActivity(), "pref_disableHeaderAds", false));
            checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.2
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    if (obj instanceof Boolean) {
                        AppPreferences.createOrGetInstance().preferencesSetBoolSafe(SettingsFragment.this.getActivity(), "pref_disableHeaderAds", ((Boolean) obj).booleanValue());
                        return true;
                    }
                    return true;
                }
            });
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("pref_alwaysHideAppLogo");
            checkBoxPreference2.setEnabled(IAP2Design.premium);
            if (!IAP2Design.premium) {
                checkBoxPreference2.setWidgetLayoutResource(R.layout.my_preference_widget_prcheckbox);
            }
            checkBoxPreference2.setChecked(AppPreferences.createOrGetInstance().preferencesGetBoolSafe((Context) getActivity(), "pref_alwaysHideAppLogo", false));
            checkBoxPreference2.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.avee.-$$Lambda$SettingsActivity$SettingsFragment$YFvnCftfxsxEwMXebkXbHINR1nQ
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    return SettingsActivity.SettingsFragment.this.lambda$addMyResetListener$0$SettingsActivity$SettingsFragment(preference, obj);
                }
            });
            findPreference("pref_appTheme").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.3
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    SettingsActivity.onPrefAppThemeChanged.invoke(obj);
                    return true;
                }
            });
            findPreference("pref_resetTips").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.4
                @Override // android.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(Preference preference) {
                    AppPreferences.createOrGetInstance().resetTips();
                    return true;
                }
            });
            findPreference("pref_fontsLicenses").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.5
                @Override // android.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(Preference preference) {
                    LicensesFragment.displayLicensesFragment(SettingsFragment.this.getFragmentManager(), true, R.raw.licenses_fonts, R.string.pref_fontsLicenses, "");
                    return true;
                }
            });
            findPreference("pref_openSourceLicenses").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.6
                @Override // android.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(Preference preference) {
                    LicensesFragment.displayLicensesFragment(SettingsFragment.this.getFragmentManager(), true, R.raw.licenses, R.string.pref_openSourceLicenses, "");
                    return true;
                }
            });
            EditTextPreference editTextPreference = (EditTextPreference) findPreference("pref_playlistDefaultPath");
            editTextPreference.setSummary(editTextPreference.getText());
            editTextPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.7
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    preference.setSummary(obj.toString());
                    return true;
                }
            });
            EditTextPreference editTextPreference2 = (EditTextPreference) findPreference("pref_audioVisOffset");
            editTextPreference2.setSummary(editTextPreference2.getText());
            editTextPreference2.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.8
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    preference.setSummary(obj.toString());
                    SettingsActivity.onPrefAudioVisOffsetChanged.invoke(Integer.valueOf(Utils.strToIntSafe(obj.toString(), 0)));
                    return true;
                }
            });
            ((CheckBoxPreference) findPreference("pref_highQualityBlur")).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.9
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    SettingsActivity.onPrefHighQualityBlurChanged.invoke((Boolean) obj);
                    return true;
                }
            });
            findPreference("pref_clearCache").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.10
                @Override // android.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(Preference preference) {
                    SettingsActivity.onClearCacheAction.invoke();
                    return true;
                }
            });
            findPreference("pref_eula").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.avee.SettingsActivity.SettingsFragment.11
                @Override // android.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(Preference preference) {
                    SettingsActivity.onEulaAction.invoke(new ContextData(SettingsFragment.this.getActivity()));
                    return true;
                }
            });
        }

        public /* synthetic */ boolean lambda$addMyResetListener$0$SettingsActivity$SettingsFragment(Preference preference, Object obj) {
            if (obj instanceof Boolean) {
                AppPreferences.createOrGetInstance().preferencesSetBoolSafe(getActivity(), "pref_alwaysHideAppLogo", ((Boolean) obj).booleanValue());
                return true;
            }
            return true;
        }

        void resetSettings(Context context) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().clear().commit();
            PreferenceManager.setDefaultValues(context, R.xml.preferences, true);
            setPreferenceScreen(null);
            addPreferencesFromResource(R.xml.preferences);
            addMyResetListener();
        }
    }
}
