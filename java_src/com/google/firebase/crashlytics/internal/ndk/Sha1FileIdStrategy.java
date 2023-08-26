package com.google.firebase.crashlytics.internal.ndk;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.ndk.BinaryImagesConverter;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Sha1FileIdStrategy implements BinaryImagesConverter.FileIdStrategy {
    @Override // com.google.firebase.crashlytics.internal.ndk.BinaryImagesConverter.FileIdStrategy
    public String createId(File file) throws IOException {
        return getFileSHA(file.getPath());
    }

    private static String getFileSHA(String str) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String sha1 = CommonUtils.sha1(bufferedInputStream2);
                CommonUtils.closeQuietly(bufferedInputStream2);
                return sha1;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                CommonUtils.closeQuietly(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
