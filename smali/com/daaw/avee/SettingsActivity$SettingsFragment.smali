.class public Lcom/daaw/avee/SettingsActivity$SettingsFragment;
.super Landroid/preference/PreferenceFragment;
.source "SettingsActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/SettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SettingsFragment"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Landroid/preference/PreferenceFragment;-><init>()V

    return-void
.end method

.method private addMyResetListener()V
    .locals 6

    const-string v0, "pref_resetToDefault"

    .line 94
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 95
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$1;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    const-string v0, "pref_disableHeaderAds"

    .line 116
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    check-cast v1, Landroid/preference/CheckBoxPreference;

    .line 117
    sget-boolean v2, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-virtual {v1, v2}, Landroid/preference/CheckBoxPreference;->setEnabled(Z)V

    .line 118
    sget-boolean v2, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    const v3, 0x7f0c00a4

    if-nez v2, :cond_0

    .line 119
    invoke-virtual {v1, v3}, Landroid/preference/CheckBoxPreference;->setWidgetLayoutResource(I)V

    .line 121
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v2

    invoke-virtual {p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v0, v5}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/preference/CheckBoxPreference;->setChecked(Z)V

    .line 122
    new-instance v0, Lcom/daaw/avee/SettingsActivity$SettingsFragment$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$2;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v1, v0}, Landroid/preference/CheckBoxPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const-string v0, "pref_alwaysHideAppLogo"

    .line 137
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    check-cast v1, Landroid/preference/CheckBoxPreference;

    .line 138
    sget-boolean v2, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    invoke-virtual {v1, v2}, Landroid/preference/CheckBoxPreference;->setEnabled(Z)V

    .line 139
    sget-boolean v2, Lcom/daaw/avee/Design/IAP2Design;->premium:Z

    if-nez v2, :cond_1

    .line 140
    invoke-virtual {v1, v3}, Landroid/preference/CheckBoxPreference;->setWidgetLayoutResource(I)V

    .line 142
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v2

    invoke-virtual {p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v5}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/preference/CheckBoxPreference;->setChecked(Z)V

    .line 143
    new-instance v0, Lcom/daaw/avee/-$$Lambda$SettingsActivity$SettingsFragment$YFvnCftfxsxEwMXebkXbHINR1nQ;

    invoke-direct {v0, p0}, Lcom/daaw/avee/-$$Lambda$SettingsActivity$SettingsFragment$YFvnCftfxsxEwMXebkXbHINR1nQ;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v1, v0}, Landroid/preference/CheckBoxPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const-string v0, "pref_appTheme"

    .line 155
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 157
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$3;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const-string v0, "pref_resetTips"

    .line 169
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 170
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$4;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    const-string v0, "pref_fontsLicenses"

    .line 182
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 183
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$5;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    const-string v0, "pref_openSourceLicenses"

    .line 193
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 194
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$6;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    const-string v0, "pref_playlistDefaultPath"

    .line 205
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/EditTextPreference;

    .line 206
    invoke-virtual {v0}, Landroid/preference/EditTextPreference;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/EditTextPreference;->setSummary(Ljava/lang/CharSequence;)V

    .line 207
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$7;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/EditTextPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const-string v0, "pref_audioVisOffset"

    .line 219
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/EditTextPreference;

    .line 220
    invoke-virtual {v0}, Landroid/preference/EditTextPreference;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/EditTextPreference;->setSummary(Ljava/lang/CharSequence;)V

    .line 221
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$8;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/EditTextPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const-string v0, "pref_highQualityBlur"

    .line 247
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    .line 248
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$9;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const-string v0, "pref_clearCache"

    .line 273
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 274
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$10;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    const-string v0, "pref_eula"

    .line 286
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 287
    new-instance v1, Lcom/daaw/avee/SettingsActivity$SettingsFragment$11;

    invoke-direct {v1, p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment$11;-><init>(Lcom/daaw/avee/SettingsActivity$SettingsFragment;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    return-void
.end method


# virtual methods
.method public synthetic lambda$addMyResetListener$0$SettingsActivity$SettingsFragment(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2

    .line 144
    instance-of p1, p2, Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    .line 145
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 147
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    invoke-virtual {p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "pref_alwaysHideAppLogo"

    invoke-virtual {p2, v0, v1, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesSetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 81
    invoke-super {p0, p1}, Landroid/preference/PreferenceFragment;->onCreate(Landroid/os/Bundle;)V

    .line 85
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->save(Landroid/content/Context;)V

    const p1, 0x7f130004

    .line 87
    invoke-virtual {p0, p1}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->addPreferencesFromResource(I)V

    .line 89
    invoke-direct {p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->addMyResetListener()V

    return-void
.end method

.method resetSettings(Landroid/content/Context;)V
    .locals 2

    .line 304
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 305
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 306
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 307
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const v0, 0x7f130004

    const/4 v1, 0x1

    .line 308
    invoke-static {p1, v0, v1}, Landroid/preference/PreferenceManager;->setDefaultValues(Landroid/content/Context;IZ)V

    const/4 p1, 0x0

    .line 310
    invoke-virtual {p0, p1}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 311
    invoke-virtual {p0, v0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->addPreferencesFromResource(I)V

    .line 313
    invoke-direct {p0}, Lcom/daaw/avee/SettingsActivity$SettingsFragment;->addMyResetListener()V

    return-void
.end method
