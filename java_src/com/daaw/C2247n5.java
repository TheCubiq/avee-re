package com.daaw;

import android.content.Context;
import java.io.File;
/* renamed from: com.daaw.n5 */
/* loaded from: classes.dex */
public class C2247n5 {
    /* renamed from: a */
    public static File m15523a(String str) {
        File file = new File(m15522b(), "scenes");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    /* renamed from: b */
    public static File m15522b() {
        Context m23837e = dx0.m23837e();
        C2691q6.m12752f(m23837e);
        return m23837e.getFilesDir();
    }
}
