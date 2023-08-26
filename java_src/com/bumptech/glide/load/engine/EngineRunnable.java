package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.executor.Prioritized;
import com.bumptech.glide.request.ResourceCallback;
/* loaded from: classes.dex */
class EngineRunnable implements Runnable, Prioritized {
    private static final String TAG = "EngineRunnable";
    private final DecodeJob<?, ?, ?> decodeJob;
    private volatile boolean isCancelled;
    private final EngineRunnableManager manager;
    private final Priority priority;
    private Stage stage = Stage.CACHE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface EngineRunnableManager extends ResourceCallback {
        void submitForSource(EngineRunnable engineRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum Stage {
        CACHE,
        SOURCE
    }

    public EngineRunnable(EngineRunnableManager engineRunnableManager, DecodeJob<?, ?, ?> decodeJob, Priority priority) {
        this.manager = engineRunnableManager;
        this.decodeJob = decodeJob;
        this.priority = priority;
    }

    public void cancel() {
        this.isCancelled = true;
        this.decodeJob.cancel();
    }

    @Override // java.lang.Runnable
    public void run() {
        Exception errorWrappingGlideException;
        if (this.isCancelled) {
            return;
        }
        Resource<?> resource = null;
        try {
            resource = decode();
            errorWrappingGlideException = null;
        } catch (Exception e) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Exception decoding", e);
            }
            errorWrappingGlideException = e;
        } catch (OutOfMemoryError e2) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Out Of Memory Error decoding", e2);
            }
            errorWrappingGlideException = new ErrorWrappingGlideException(e2);
        }
        if (this.isCancelled) {
            if (resource != null) {
                resource.recycle();
            }
        } else if (resource == null) {
            onLoadFailed(errorWrappingGlideException);
        } else {
            onLoadComplete(resource);
        }
    }

    private boolean isDecodingFromCache() {
        return this.stage == Stage.CACHE;
    }

    private void onLoadComplete(Resource resource) {
        this.manager.onResourceReady(resource);
    }

    private void onLoadFailed(Exception exc) {
        if (isDecodingFromCache()) {
            this.stage = Stage.SOURCE;
            this.manager.submitForSource(this);
            return;
        }
        this.manager.onException(exc);
    }

    private Resource<?> decode() throws Exception {
        if (isDecodingFromCache()) {
            return decodeFromCache();
        }
        return decodeFromSource();
    }

    private Resource<?> decodeFromCache() throws Exception {
        Resource<?> resource;
        try {
            resource = this.decodeJob.decodeResultFromCache();
        } catch (Exception e) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Exception decoding result from cache: " + e);
            }
            resource = null;
        }
        return resource == null ? this.decodeJob.decodeSourceFromCache() : resource;
    }

    private Resource<?> decodeFromSource() throws Exception {
        return this.decodeJob.decodeFromSource();
    }

    @Override // com.bumptech.glide.load.engine.executor.Prioritized
    public int getPriority() {
        return this.priority.ordinal();
    }
}
