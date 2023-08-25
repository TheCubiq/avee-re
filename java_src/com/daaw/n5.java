package com.daaw;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
public class n5 {
    public static File a(String str) {
        File file = new File(b(), "scenes");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static File b() {
        Context e = dx0.e();
        q6.f(e);
        return e.getFilesDir();
    }
}
