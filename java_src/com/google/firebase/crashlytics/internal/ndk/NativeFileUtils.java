package com.google.firebase.crashlytics.internal.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class NativeFileUtils {
    private NativeFileUtils() {
    }

    public static byte[] binaryImagesJsonFromMapsFile(File file, Context context) throws IOException {
        if (file == null || !file.exists()) {
            return new byte[0];
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                byte[] convert = new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert(bufferedReader2);
                CommonUtils.closeQuietly(bufferedReader2);
                return convert;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                CommonUtils.closeQuietly(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
