package com.daaw.avee.comp.AppPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.AOSPutils.Context_storage;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.Common.UtilsSerialize;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.Visualizer.CustomScene;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public class AppPreferences implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static WeakEvent3<Integer, Integer, Boolean> onIntPreferenceChanged = new WeakEvent3<>();
    public static WeakEvent2<Integer, Boolean> onBoolPreferenceChanged = new WeakEvent2<>();
    public static WeakEvent3<Integer, String, Boolean> onStringPreferenceChanged = new WeakEvent3<>();
    public static WeakEvent2<String, AppPreferences> onSharedPreferenceChanged = new WeakEvent2<>();
    private static final Object createInstanceLock = new Object();
    private static volatile WeakReference<AppPreferences> instanceWeak = new WeakReference<>(null);
    private static int offset_Bool = 1000;
    public static int PREF_Bool_pref_visControlsTimeout = 1000;
    public static int PREF_Bool_visualPreferShowVideoContent = 1000 + 1;
    public static int PREF_Bool_fixAssumeMonoOutputFromMonoInput = 1000 + 2;
    public static int PREF_Bool_followCurrentState = 1000 + 3;
    public static int PREF_Bool_audioMuteState = 1000 + 4;
    public static int PREF_Bool_showAlbumArtInstead = 1000 + 5;
    public static int PREF_Bool_tipShow_reorder = 1000 + 6;
    public static int PREF_Bool_firstLaunch = 1000 + 7;
    public static int PREF_Bool_uiSectionOpened0 = 1000 + 8;
    public static int PREF_Bool_uiSectionOpened1 = 1000 + 9;
    public static int PREF_Bool_uiSectionOpened00 = 1000 + 10;
    public static int PREF_Bool_uiSectionOpened01 = 1000 + 11;
    public static int PREF_Bool_uiSectionOpened2 = 1000 + 12;
    public static int PREF_Bool_visualizerUseGlobalSession = 1000 + 13;
    public static int PREF_Bool_equalizerEnabled = 1000 + 14;
    public static int PREF_Bool_disableHeaderAds = 1000 + 15;
    public static int PREF_Bool_disableFooterAds_unused = 1000 + 16;
    private static int PREF_Bool_COUNT = 1000 + 17;
    private static int offset_Int = 2000;
    public static int PREF_Int_mainPageIndex = 2000;
    public static int PREF_Int_recentlyAddedWeeks = 2000 + 1;
    public static int PREF_Int_visualizerThemeId = 2000 + 2;
    public static int PREF_Int_lockOrient = 2000 + 3;
    public static int PREF_Int_playbackEngine = 2000 + 4;
    public static int PREF_Int_videoScalingMode = 2000 + 5;
    public static int PREF_Int_SortSelectedRadioOption = 2000 + 6;
    public static int PREF_Int_SortMaskCheckOptions = 2000 + 7;
    public static int PREF_Int_volumeStereoBalance = 2000 + 8;
    public static int PREF_Int_crossFadeValue = 2000 + 9;
    public static int PREF_Int_equalizerPreset = 2000 + 10;
    public static int PREF_Int_equalizerBassValue = 2000 + 11;
    public static int PREF_Int_equalizerTrebleValue = 2000 + 12;
    public static int PREF_Int_virtualizerStrength = 2000 + 13;
    public static int PREF_Int_reverbPreset = 2000 + 14;
    public static int PREF_Int_containerItemViewMode = 2000 + 15;
    public static int PREF_Int_audioVisOffset = 2000 + 16;
    public static int PREF_Int_acceptedEula = 2000 + 17;
    private static int PREF_Int_COUNT = 2000 + 18;
    private static int offset_String = PathInterpolatorCompat.MAX_NUM_POINTS;
    public static int PREF_String_currentAbsoluteLibraryAddress = PathInterpolatorCompat.MAX_NUM_POINTS;
    public static int PREF_String_vThemeCustomization0 = PathInterpolatorCompat.MAX_NUM_POINTS + 1;
    public static int PREF_String_vThemeCustomization1 = PathInterpolatorCompat.MAX_NUM_POINTS + 2;
    public static int PREF_String_vThemeCustomization2 = PathInterpolatorCompat.MAX_NUM_POINTS + 3;
    public static int PREF_String_vThemeCustomization3 = PathInterpolatorCompat.MAX_NUM_POINTS + 4;
    public static int PREF_String_vThemeCustomization4 = PathInterpolatorCompat.MAX_NUM_POINTS + 5;
    public static int PREF_String_vThemeCustomization5 = PathInterpolatorCompat.MAX_NUM_POINTS + 6;
    public static int PREF_String_vThemeCustomization6 = PathInterpolatorCompat.MAX_NUM_POINTS + 7;
    public static int PREF_String_vThemeCustomization7 = PathInterpolatorCompat.MAX_NUM_POINTS + 8;
    public static int PREF_String_vThemeCustomization8 = PathInterpolatorCompat.MAX_NUM_POINTS + 9;
    public static int PREF_String_vThemeCustomization9 = PathInterpolatorCompat.MAX_NUM_POINTS + 10;
    public static int PREF_String_vThemeCustomization10 = PathInterpolatorCompat.MAX_NUM_POINTS + 11;
    public static int PREF_String_equalizerBarsValues = PathInterpolatorCompat.MAX_NUM_POINTS + 12;
    public static int PREF_String_vThemeCustomization11 = PathInterpolatorCompat.MAX_NUM_POINTS + 13;
    public static int PREF_String_vThemeCustomization12 = PathInterpolatorCompat.MAX_NUM_POINTS + 14;
    public static int PREF_String_vThemeCustomization13 = PathInterpolatorCompat.MAX_NUM_POINTS + 15;
    public static int PREF_String_vThemeCustomization14 = PathInterpolatorCompat.MAX_NUM_POINTS + 16;
    public static int PREF_String_vThemeCustomization15 = PathInterpolatorCompat.MAX_NUM_POINTS + 17;
    public static int PREF_String_vThemeCustomization16start = PathInterpolatorCompat.MAX_NUM_POINTS + 18;
    public static int PREF_String_vThemeCustomization116end = PathInterpolatorCompat.MAX_NUM_POINTS + 118;
    public static int PREF_String_themeCustomizationIndexes = PathInterpolatorCompat.MAX_NUM_POINTS + 119;
    public static int PREF_String_currentExportSettingsExportDir_absolute = PathInterpolatorCompat.MAX_NUM_POINTS + 220;
    public static int PREF_String_currentExportSettings = PathInterpolatorCompat.MAX_NUM_POINTS + 221;
    public static int PREF_String_currentExportSettingsProfile = PathInterpolatorCompat.MAX_NUM_POINTS + 222;
    private static int PREF_String_COUNT = PathInterpolatorCompat.MAX_NUM_POINTS + 223;
    private AtomicIntegerArray prefBool = new AtomicIntegerArray(PREF_Bool_COUNT - offset_Bool);
    private AtomicIntegerArray prefsInt = new AtomicIntegerArray(PREF_Int_COUNT - offset_Int);
    private AtomicReferenceArray<String> prefsString = new AtomicReferenceArray<>(PREF_String_COUNT - offset_String);
    private String defaultFolderString = null;
    private String standartFolderString = null;
    private boolean loaded = false;

    void save_pref_disableHeaderAds(SharedPreferences.Editor editor) {
    }

    private AppPreferences() {
        setBoolDefault(PREF_Bool_pref_visControlsTimeout, false);
        setBoolDefault(PREF_Bool_visualPreferShowVideoContent, false);
        setBoolDefault(PREF_Bool_fixAssumeMonoOutputFromMonoInput, true);
        setBoolDefault(PREF_Bool_followCurrentState, true);
        setBoolDefault(PREF_Bool_audioMuteState, false);
        setBoolDefault(PREF_Bool_showAlbumArtInstead, true);
        setBoolDefault(PREF_Bool_tipShow_reorder, true);
        setBoolDefault(PREF_Bool_firstLaunch, true);
        setBoolDefault(PREF_Bool_uiSectionOpened0, true);
        setBoolDefault(PREF_Bool_uiSectionOpened1, true);
        setBoolDefault(PREF_Bool_uiSectionOpened00, true);
        setBoolDefault(PREF_Bool_uiSectionOpened01, true);
        setBoolDefault(PREF_Bool_visualizerUseGlobalSession, true);
        setBoolDefault(PREF_Bool_equalizerEnabled, false);
        setBoolDefault(PREF_Bool_disableFooterAds_unused, false);
        setBoolDefault(PREF_Bool_disableHeaderAds, false);
        setIntDefault(PREF_Int_mainPageIndex, 1);
        setIntDefault(PREF_Int_recentlyAddedWeeks, 1);
        setIntDefault(PREF_Int_visualizerThemeId, 14);
        setIntDefault(PREF_Int_lockOrient, 0);
        setIntDefault(PREF_Int_playbackEngine, 1);
        setIntDefault(PREF_Int_videoScalingMode, 1);
        setIntDefault(PREF_Int_SortSelectedRadioOption, 8);
        setIntDefault(PREF_Int_SortMaskCheckOptions, 0);
        setIntDefault(PREF_Int_volumeStereoBalance, 0);
        setIntDefault(PREF_Int_crossFadeValue, -1000);
        setIntDefault(PREF_Int_equalizerPreset, -1);
        setIntDefault(PREF_Int_equalizerBassValue, 0);
        setIntDefault(PREF_Int_equalizerTrebleValue, 0);
        setIntDefault(PREF_Int_virtualizerStrength, 0);
        setIntDefault(PREF_Int_reverbPreset, 0);
        setIntDefault(PREF_Int_containerItemViewMode, 1);
        setIntDefault(PREF_Int_audioVisOffset, 10);
        setIntDefault(PREF_Int_acceptedEula, 0);
        setStringDefault(PREF_String_currentAbsoluteLibraryAddress, "");
        setStringDefault(PREF_String_equalizerBarsValues, "");
        setStringDefault(PREF_String_currentExportSettingsExportDir_absolute, "");
        setStringDefault(PREF_String_currentExportSettings, "");
        setStringDefault(PREF_String_currentExportSettingsProfile, "");
    }

    public static AppPreferences createOrGetInstance() {
        AppPreferences appPreferences;
        AppPreferences appPreferences2 = instanceWeak.get();
        if (appPreferences2 != null) {
            return appPreferences2;
        }
        synchronized (createInstanceLock) {
            appPreferences = instanceWeak.get();
            if (appPreferences == null) {
                appPreferences = new AppPreferences();
                instanceWeak = new WeakReference<>(appPreferences);
            }
        }
        return appPreferences;
    }

    public static boolean preferencesGetBoolSafe(SharedPreferences sharedPreferences, String str, boolean z) {
        try {
            return sharedPreferences.getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public void preferencesSetBoolSafe(Context context, String str, boolean z) {
        preferencesSetBoolSafe(getPreferences(context), str, z);
    }

    public static void preferencesSetBoolSafe(SharedPreferences sharedPreferences, String str, boolean z) {
        try {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static int preferencesGetIntSafe(SharedPreferences sharedPreferences, String str, int i) {
        try {
            return sharedPreferences.getInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long preferencesGetLongSafe(SharedPreferences sharedPreferences, String str, long j) {
        try {
            return sharedPreferences.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public static float preferencesGetFloatSafe(SharedPreferences sharedPreferences, String str, float f) {
        try {
            return sharedPreferences.getFloat(str, f);
        } catch (Exception unused) {
            return f;
        }
    }

    public static String preferencesGetStringSafe(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return sharedPreferences.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public boolean preferencesGetBoolSafe(Context context, String str, boolean z) {
        return preferencesGetBoolSafe(getPreferences(context), str, z);
    }

    public int preferencesGetIntSafe(Context context, String str, int i) {
        return preferencesGetIntSafe(getPreferences(context), str, i);
    }

    public String preferencesGetStringSafe(Context context, String str, String str2) {
        return preferencesGetStringSafe(getPreferences(context), str, str2);
    }

    public boolean getBool(int i) {
        return this.prefBool.get(i - offset_Bool) != 0;
    }

    public int getInt(int i) {
        return this.prefsInt.get(i - offset_Int);
    }

    public String getString(int i) {
        return this.prefsString.get(i - offset_String);
    }

    public void toggleBool(int i) {
        setBool(i, this.prefBool.get(i - offset_Bool) == 0);
    }

    public void setBool(int i, boolean z) {
        if (z != (this.prefBool.getAndSet(i - offset_Bool, z ? 1 : 0) != 0)) {
            onBoolPreferenceChanged.invoke(Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    public void setInt(int i, int i2) {
        setInt(i, i2, false);
    }

    public void setInt(int i, int i2, boolean z) {
        int andSet = this.prefsInt.getAndSet(i - offset_Int, i2);
        if (z || i2 != andSet) {
            onIntPreferenceChanged.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        }
    }

    public void setString(int i, String str) {
        setString(i, str, false);
    }

    public void setString(int i, String str, boolean z) {
        String andSet = this.prefsString.getAndSet(i - offset_String, str);
        if (z || !Utils.compareNullEqual(andSet, str)) {
            onStringPreferenceChanged.invoke(Integer.valueOf(i), str, Boolean.valueOf(z));
        }
    }

    public void setBoolDefault(int i, boolean z) {
        this.prefBool.set(i - offset_Bool, z ? 1 : 0);
    }

    public void setIntDefault(int i, int i2) {
        this.prefsInt.set(i - offset_Int, i2);
    }

    public void setStringDefault(int i, String str) {
        this.prefsString.set(i - offset_String, str);
    }

    private void onContext(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        load_pref_visControlsTimeout(defaultSharedPreferences);
        load_pref_visualizerGlobalSession(defaultSharedPreferences);
        load_pref_audioVisOffset(defaultSharedPreferences);
        load_pref_disableHeaderAds(defaultSharedPreferences);
    }

    public void load(Context context) {
        if (this.loaded) {
            return;
        }
        this.loaded = true;
        onContext(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        for (int i = 0; i < this.prefBool.length(); i++) {
            try {
                setBool(offset_Bool + i, preferencesGetBoolSafe(defaultSharedPreferences, "bool" + i, this.prefBool.get(i) != 0));
            } catch (Exception unused) {
            }
        }
        for (int i2 = 0; i2 < this.prefsInt.length(); i2++) {
            try {
                setInt(offset_Int + i2, preferencesGetIntSafe(defaultSharedPreferences, "int" + i2, this.prefsInt.get(i2)));
            } catch (Exception unused2) {
            }
        }
        for (int i3 = 0; i3 < this.prefsString.length(); i3++) {
            try {
                setString(offset_String + i3, preferencesGetStringSafe(defaultSharedPreferences, "string" + i3, this.prefsString.get(i3)));
            } catch (Exception unused3) {
            }
        }
    }

    public void save(Context context) {
        if (this.loaded) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            for (int i = 0; i < this.prefBool.length(); i++) {
                boolean z = this.prefBool.get(i) != 0;
                edit.putBoolean("bool" + i, z);
            }
            for (int i2 = 0; i2 < this.prefsInt.length(); i2++) {
                int i3 = this.prefsInt.get(i2);
                edit.putInt("int" + i2, i3);
            }
            for (int i4 = 0; i4 < this.prefsString.length(); i4++) {
                edit.putString("string" + i4, this.prefsString.get(i4));
            }
            save_pref_visControlsTimeout(edit);
            save_pref_visualizerGlobalSession(edit);
            save_pref_audioVisOffset(edit);
            edit.apply();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        switch (str.hashCode()) {
            case -546842823:
                if (str.equals("pref_audioVisOffset")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -373283545:
                if (str.equals("pref_visControlsTimeout")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1792058231:
                if (str.equals("pref_disableHeaderAds")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2099578649:
                if (str.equals("pref_visualizerGlobalSession")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            load_pref_visControlsTimeout(sharedPreferences);
        } else if (c == 1) {
            load_pref_visualizerGlobalSession(sharedPreferences);
        } else if (c == 2) {
            load_pref_audioVisOffset(sharedPreferences);
        } else if (c == 3) {
            load_pref_disableHeaderAds(sharedPreferences);
        }
        onSharedPreferenceChanged.invoke(str, this);
    }

    void load_pref_visControlsTimeout(SharedPreferences sharedPreferences) {
        setBool(PREF_Bool_pref_visControlsTimeout, preferencesGetBoolSafe(sharedPreferences, "pref_visControlsTimeout", false));
    }

    void save_pref_visControlsTimeout(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visControlsTimeout", getBool(PREF_Bool_pref_visControlsTimeout));
    }

    void load_pref_visualizerGlobalSession(SharedPreferences sharedPreferences) {
        setBool(PREF_Bool_visualizerUseGlobalSession, preferencesGetBoolSafe(sharedPreferences, "pref_visualizerGlobalSession", true));
    }

    void save_pref_visualizerGlobalSession(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visualizerGlobalSession", getBool(PREF_Bool_visualizerUseGlobalSession));
    }

    void load_pref_audioVisOffset(SharedPreferences sharedPreferences) {
        setInt(PREF_Int_audioVisOffset, Utils.strToIntSafe(preferencesGetStringSafe(sharedPreferences, "pref_audioVisOffset", "0")));
    }

    void save_pref_audioVisOffset(SharedPreferences.Editor editor) {
        editor.putString("pref_audioVisOffset", "" + getInt(PREF_Int_audioVisOffset));
    }

    void load_pref_disableHeaderAds(SharedPreferences sharedPreferences) {
        setBool(PREF_Bool_disableHeaderAds, preferencesGetBoolSafe(sharedPreferences, "pref_disableHeaderAds", false));
    }

    public SharedPreferences getPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void saveAddTokenList(List<String> list, Context context, String str) {
        SharedPreferences preferences = getPreferences(context);
        List<String> deserializeIterableAsList = UtilsSerialize.deserializeIterableAsList(";", preferencesGetStringSafe(preferences, str, ""));
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(str, UtilsSerialize.serializeIterableSkipInvalidWithAdd((CharSequence) ";", (Iterable) deserializeIterableAsList, (Iterable) list, true));
        edit.apply();
    }

    public void prefAddLibraryFolderGenerateHash(String str, Context context) {
        String str2;
        MultiList<String, String> prefGetLibraryFolders = prefGetLibraryFolders(context);
        Random random = new Random();
        int i = 0;
        do {
            i++;
            str2 = "" + random.nextInt(1000000);
            if (!prefGetLibraryFolders.contains1(str2)) {
                break;
            }
        } while (i < 1000000);
        prefAddLibraryFolder(str2, str, context);
    }

    public void prefAddLibraryFolder(String str, String str2, Context context) {
        if (str.contains(";") || str.contains(":") || str2.contains(";") || str2.contains(":")) {
            return;
        }
        SharedPreferences preferences = getPreferences(context);
        List<String> deserializeIterableAsList = UtilsSerialize.deserializeIterableAsList(";", getLibFoldersString(preferences));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString("libFolders", UtilsSerialize.serializeIterableSkipInvalidWithAdd((CharSequence) ";", (Iterable) deserializeIterableAsList, (Object) str3, true));
        edit.apply();
    }

    public void prefRemoveLibraryFolder(String str, String str2, Context context) {
        SharedPreferences preferences = getPreferences(context);
        List<String> deserializeIterableAsList = UtilsSerialize.deserializeIterableAsList(";", getLibFoldersString(preferences));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString("libFolders", UtilsSerialize.serializeIterableSkipInvalidWithExclude(";", deserializeIterableAsList, str3, true));
        edit.apply();
    }

    public MultiList<String, String> prefGetLibraryFolders(Context context) {
        List<String> deserializeIterableAsList = UtilsSerialize.deserializeIterableAsList(";", getLibFoldersString(getPreferences(context)));
        MultiList<String, String> multiList = new MultiList<>(deserializeIterableAsList.size());
        for (String str : deserializeIterableAsList) {
            int indexOf = str.indexOf(":");
            if (indexOf >= 0) {
                multiList.add(new Tuple2<>(str.substring(0, indexOf), str.substring(indexOf + 1)));
            }
        }
        return multiList;
    }

    String getStandartFolderString() {
        if (this.standartFolderString == null) {
            StringBuilder sb = new StringBuilder();
            try {
                String internalStoragePath = Context_storage.getInternalStoragePath();
                if (!internalStoragePath.isEmpty()) {
                    sb.append("-02:");
                    sb.append(internalStoragePath);
                    sb.append(";");
                }
            } catch (Exception unused) {
            }
            try {
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext != null) {
                    String sDCardPathOnce = Context_storage.getSDCardPathOnce(appContext);
                    if (!sDCardPathOnce.isEmpty()) {
                        sb.append("-01:");
                        sb.append(sDCardPathOnce);
                        sb.append(";");
                    }
                }
            } catch (Exception unused2) {
            }
            this.standartFolderString = sb.toString();
        }
        return this.standartFolderString;
    }

    String getDefaultFolderString() {
        if (this.defaultFolderString == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("001:");
            sb.append("/storage");
            sb.append(";");
            try {
                sb.append("002:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused) {
            }
            try {
                sb.append("003:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused2) {
            }
            try {
                sb.append("004:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused3) {
            }
            try {
                sb.append("005:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getCanonicalPath());
            } catch (IOException unused4) {
            }
            this.defaultFolderString = sb.toString();
        }
        return this.defaultFolderString;
    }

    public String getLibFoldersString(SharedPreferences sharedPreferences) {
        String standartFolderString = getStandartFolderString();
        return preferencesGetStringSafe(sharedPreferences, "libFolders", standartFolderString + getDefaultFolderString());
    }

    public void prefAddStandalonePlaylistGenerateHash(Context context, String str, boolean z) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        prefAddStandalonePlaylistGenerateHash(context, arrayList, z);
    }

    public void prefAddStandalonePlaylistGenerateHash(Context context, List<String> list, boolean z) {
        String str;
        MultiList<String, String> prefGetStandalonePlaylists = prefGetStandalonePlaylists(context);
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for (String str2 : list) {
            if (!z || !prefGetStandalonePlaylists.contains2(str2)) {
                do {
                    str = "" + random.nextInt(1000000);
                } while (prefGetStandalonePlaylists.contains1(str));
                if (!str.contains(";") && !str.contains(":") && !str2.contains(";") && !str2.contains(":")) {
                    arrayList.add(str + ":" + str2);
                }
            }
        }
        saveAddTokenList(arrayList, context, "libStandalonePlaylists");
    }

    public void prefRemoveStandalonePlaylist(String str, String str2, Context context) {
        SharedPreferences preferences = getPreferences(context);
        List<String> deserializeIterableAsList = UtilsSerialize.deserializeIterableAsList(";", preferencesGetStringSafe(preferences, "libStandalonePlaylists", ""));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString("libStandalonePlaylists", UtilsSerialize.serializeIterableSkipInvalidWithExclude(";", deserializeIterableAsList, str3, true));
        edit.apply();
    }

    public MultiList<String, String> prefGetStandalonePlaylists(Context context) {
        List<String> deserializeIterableAsList = UtilsSerialize.deserializeIterableAsList(";", preferencesGetStringSafe(getPreferences(context), "libStandalonePlaylists", ""));
        MultiList<String, String> multiList = new MultiList<>(deserializeIterableAsList.size());
        for (String str : deserializeIterableAsList) {
            int indexOf = str.indexOf(":");
            if (indexOf >= 0) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (UtilsFileSys.fileExists(substring2)) {
                    multiList.add(new Tuple2<>(substring, substring2));
                }
            }
        }
        return multiList;
    }

    public static int generateVisualizerCustomizationHash(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public List<Integer> getPrefThemeCustomizationIndexes() {
        List<String> deserializeIterableAsList = UtilsSerialize.deserializeIterableAsList(";", getString(PREF_String_themeCustomizationIndexes));
        ArrayList arrayList = new ArrayList(deserializeIterableAsList.size());
        for (String str : deserializeIterableAsList) {
            int strToIntSafe = Utils.strToIntSafe(str, -1);
            if (strToIntSafe >= 0) {
                arrayList.add(Integer.valueOf(strToIntSafe));
            }
        }
        return arrayList;
    }

    public void setPrefThemeCustomizationIndexes(List<Integer> list) {
        setString(PREF_String_themeCustomizationIndexes, UtilsSerialize.serializeIterable(";", list));
    }

    private String getPrefThemeCustomization(int i) {
        int themeCustomizationIdentifierToPref = themeCustomizationIdentifierToPref(i);
        if (themeCustomizationIdentifierToPref < 0) {
            tlog.w("invalid _identifier");
            return null;
        }
        String string = getString(themeCustomizationIdentifierToPref);
        if (Crave.iscry(string)) {
            string = Crave.decry(string);
        }
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public CustomScene getPrefThemeCustomizationData(int i, int[] iArr) {
        String prefThemeCustomization = getPrefThemeCustomization(i);
        if (iArr != null) {
            iArr[0] = generateVisualizerCustomizationHash(null);
        }
        if (prefThemeCustomization == null) {
            return null;
        }
        if (iArr != null) {
            iArr[0] = generateVisualizerCustomizationHash(prefThemeCustomization);
        }
        return CustomScene.deserialize(prefThemeCustomization);
    }

    public void savePrefThemeCustomizationData(int i, CustomScene customScene, boolean z) {
        savePrefThemeCustomization(i, customScene != null ? customScene.serialize() : null, z);
    }

    private void savePrefThemeCustomization(int i, String str, boolean z) {
        int themeCustomizationIdentifierToPref = themeCustomizationIdentifierToPref(i);
        if (themeCustomizationIdentifierToPref < 0) {
            tlog.w("invalid _identifier");
        } else if (str == null) {
            setString(themeCustomizationIdentifierToPref, "", z);
        } else {
            setString(themeCustomizationIdentifierToPref, str, z);
        }
    }

    public static int themeCustomizationIdentifierToPref(int i) {
        if (i >= 0) {
            int i2 = PREF_String_vThemeCustomization116end;
            int i3 = PREF_String_vThemeCustomization16start;
            if (i <= i2 - i3) {
                return i + i3;
            }
            return -1;
        }
        return -1;
    }

    public void resetTips() {
        setBool(PREF_Bool_tipShow_reorder, true);
    }

    public static File GetVisualizerFolderFromIdentifier(int i) {
        return AppSettingsCore.CreateOrGetScenesFolder("visualizer" + i);
    }

    public static File SaveFileToLocal(File file, File file2) {
        File GetUniqueFileName;
        if (file2 == null || (GetUniqueFileName = UtilsFileSys.GetUniqueFileName(file, file2.getName())) == null) {
            return null;
        }
        try {
            UtilsFileSys.CopyFile(file2, GetUniqueFileName);
            return GetUniqueFileName;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File SaveFileToLocal(File file, InputStream inputStream, String str) {
        File GetUniqueFileName;
        if (inputStream == null || (GetUniqueFileName = UtilsFileSys.GetUniqueFileName(file, str)) == null) {
            return null;
        }
        try {
            UtilsFileSys.CopyFile(inputStream, GetUniqueFileName);
            return GetUniqueFileName;
        } catch (IOException unused) {
            return null;
        }
    }
}
