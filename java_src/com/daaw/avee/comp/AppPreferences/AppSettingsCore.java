package com.daaw.avee.comp.AppPreferences;

import android.content.Context;
import com.daaw.avee.PlayerCore;
import java.io.File;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class AppSettingsCore {
    static final String scenesFolderName = "scenes";
    static final String settingsFolderName = "settings";
    static final String stringbigFileName = "stringpack";

    static File GetLocalStorageDir() {
        Context appContext = PlayerCore.s().getAppContext();
        Assert.assertNotNull(appContext);
        return appContext.getFilesDir();
    }

    public static File CreateOrGetScenesFolder(String str) {
        File file = new File(GetLocalStorageDir(), scenesFolderName);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    static File GetSettingsFolder() {
        File file = new File(GetLocalStorageDir(), settingsFolderName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
