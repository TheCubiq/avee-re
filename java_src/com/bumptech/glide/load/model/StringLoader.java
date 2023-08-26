package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;
/* loaded from: classes.dex */
public class StringLoader<T> implements ModelLoader<String, T> {
    private final ModelLoader<Uri, T> uriLoader;

    public StringLoader(ModelLoader<Uri, T> modelLoader) {
        this.uriLoader = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public DataFetcher<T> getResourceFetcher(String str, int i, int i2) {
        Uri fileUri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("/")) {
            fileUri = toFileUri(str);
        } else {
            Uri parse = Uri.parse(str);
            fileUri = parse.getScheme() == null ? toFileUri(str) : parse;
        }
        return this.uriLoader.getResourceFetcher(fileUri, i, i2);
    }

    private static Uri toFileUri(String str) {
        return Uri.fromFile(new File(str));
    }
}
