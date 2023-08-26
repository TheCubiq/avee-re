package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class AssetPathFetcher<T> implements DataFetcher<T> {
    private static final String TAG = "AssetUriFetcher";
    private final AssetManager assetManager;
    private final String assetPath;
    private T data;

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    protected abstract void close(T t) throws IOException;

    protected abstract T loadResource(AssetManager assetManager, String str) throws IOException;

    public AssetPathFetcher(AssetManager assetManager, String str) {
        this.assetManager = assetManager;
        this.assetPath = str;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public T loadData(Priority priority) throws Exception {
        T loadResource = loadResource(this.assetManager, this.assetPath);
        this.data = loadResource;
        return loadResource;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        T t = this.data;
        if (t == null) {
            return;
        }
        try {
            close(t);
        } catch (IOException e) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Failed to close data", e);
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public String getId() {
        return this.assetPath;
    }
}
