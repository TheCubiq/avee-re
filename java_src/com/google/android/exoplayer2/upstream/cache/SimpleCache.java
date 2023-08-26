package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class SimpleCache implements Cache {
    private static final String TAG = "SimpleCache";
    private static boolean cacheFolderLockingDisabled;
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    private final CacheEvictor evictor;
    private final CachedContentIndex index;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private boolean released;
    private long totalSpace;

    public static synchronized boolean isCacheFolderLocked(File file) {
        boolean contains;
        synchronized (SimpleCache.class) {
            contains = lockedCacheDirs.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    @Deprecated
    public static synchronized void disableCacheFolderLocking() {
        synchronized (SimpleCache.class) {
            cacheFolderLockingDisabled = true;
            lockedCacheDirs.clear();
        }
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, false);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr) {
        this(file, cacheEvictor, bArr, bArr != null);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, byte[] bArr, boolean z) {
        this(file, cacheEvictor, new CachedContentIndex(file, bArr, z));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.exoplayer2.upstream.cache.SimpleCache$1] */
    SimpleCache(File file, CacheEvictor cacheEvictor, CachedContentIndex cachedContentIndex) {
        if (!lockFolder(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.cacheDir = file;
        this.evictor = cacheEvictor;
        this.index = cachedContentIndex;
        this.listeners = new HashMap<>();
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread("SimpleCache.initialize()") { // from class: com.google.android.exoplayer2.upstream.cache.SimpleCache.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                synchronized (SimpleCache.this) {
                    conditionVariable.open();
                    SimpleCache.this.initialize();
                    SimpleCache.this.evictor.onCacheInitialized();
                }
            }
        }.start();
        conditionVariable.block();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() throws Cache.CacheException {
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpansAndCachedContents();
        unlockFolder(this.cacheDir);
        this.released = true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> addListener(String str, Cache.Listener listener) {
        Assertions.checkState(!this.released);
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.listeners.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeListener(String str, Cache.Listener listener) {
        if (this.released) {
            return;
        }
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> getCachedSpans(String str) {
        TreeSet treeSet;
        Assertions.checkState(!this.released);
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent != null && !cachedContent.isEmpty()) {
            treeSet = new TreeSet((Collection) cachedContent.getSpans());
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized Set<String> getKeys() {
        Assertions.checkState(!this.released);
        return new HashSet(this.index.getKeys());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCacheSpace() {
        Assertions.checkState(!this.released);
        return this.totalSpace;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized SimpleCacheSpan startReadWrite(String str, long j) throws InterruptedException, Cache.CacheException {
        SimpleCacheSpan startReadWriteNonBlocking;
        while (true) {
            startReadWriteNonBlocking = startReadWriteNonBlocking(str, j);
            if (startReadWriteNonBlocking == null) {
                wait();
            }
        }
        return startReadWriteNonBlocking;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized SimpleCacheSpan startReadWriteNonBlocking(String str, long j) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        SimpleCacheSpan span = getSpan(str, j);
        if (span.isCached) {
            SimpleCacheSpan simpleCacheSpan = this.index.get(str).touch(span);
            notifySpanTouched(span, simpleCacheSpan);
            return simpleCacheSpan;
        }
        CachedContent orAdd = this.index.getOrAdd(str);
        if (orAdd.isLocked()) {
            return null;
        }
        orAdd.setLocked(true);
        return span;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File startFile(String str, long j, long j2) throws Cache.CacheException {
        CachedContent cachedContent;
        Assertions.checkState(!this.released);
        cachedContent = this.index.get(str);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        if (!this.cacheDir.exists()) {
            this.cacheDir.mkdirs();
            removeStaleSpansAndCachedContents();
        }
        this.evictor.onStartFile(this, str, j, j2);
        return SimpleCacheSpan.getCacheFile(this.cacheDir, cachedContent.id, j, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(File file) throws Cache.CacheException {
        boolean z = true;
        Assertions.checkState(!this.released);
        SimpleCacheSpan createCacheEntry = SimpleCacheSpan.createCacheEntry(file, this.index);
        Assertions.checkState(createCacheEntry != null);
        CachedContent cachedContent = this.index.get(createCacheEntry.key);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long contentLength = ContentMetadataInternal.getContentLength(cachedContent.getMetadata());
            if (contentLength != -1) {
                if (createCacheEntry.position + createCacheEntry.length > contentLength) {
                    z = false;
                }
                Assertions.checkState(z);
            }
            addSpan(createCacheEntry);
            this.index.store();
            notifyAll();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void releaseHoleSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        CachedContent cachedContent = this.index.get(cacheSpan.key);
        Assertions.checkNotNull(cachedContent);
        Assertions.checkState(cachedContent.isLocked());
        cachedContent.setLocked(false);
        this.index.maybeRemove(cachedContent.key);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeSpan(CacheSpan cacheSpan) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        removeSpan(cacheSpan, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r4.getCachedBytesLength(r5, r7) >= r7) goto L11;
     */
    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isCached(String str, long j, long j2) {
        boolean z;
        z = true;
        Assertions.checkState(!this.released);
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent != null) {
        }
        z = false;
        return z;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedLength(String str, long j, long j2) {
        CachedContent cachedContent;
        Assertions.checkState(!this.released);
        cachedContent = this.index.get(str);
        return cachedContent != null ? cachedContent.getCachedBytesLength(j, j2) : -j2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void setContentLength(String str, long j) throws Cache.CacheException {
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        ContentMetadataInternal.setContentLength(contentMetadataMutations, j);
        applyContentMetadataMutations(str, contentMetadataMutations);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getContentLength(String str) {
        return ContentMetadataInternal.getContentLength(getContentMetadata(str));
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        this.index.applyContentMetadataMutations(str, contentMetadataMutations);
        this.index.store();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized ContentMetadata getContentMetadata(String str) {
        Assertions.checkState(!this.released);
        return this.index.getContentMetadata(str);
    }

    private SimpleCacheSpan getSpan(String str, long j) throws Cache.CacheException {
        SimpleCacheSpan span;
        CachedContent cachedContent = this.index.get(str);
        if (cachedContent == null) {
            return SimpleCacheSpan.createOpenHole(str, j);
        }
        while (true) {
            span = cachedContent.getSpan(j);
            if (!span.isCached || span.file.exists()) {
                break;
            }
            removeStaleSpansAndCachedContents();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            this.cacheDir.mkdirs();
            return;
        }
        this.index.load();
        File[] listFiles = this.cacheDir.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                SimpleCacheSpan createCacheEntry = file.length() > 0 ? SimpleCacheSpan.createCacheEntry(file, this.index) : null;
                if (createCacheEntry != null) {
                    addSpan(createCacheEntry);
                } else {
                    file.delete();
                }
            }
        }
        this.index.removeEmpty();
        try {
            this.index.store();
        } catch (Cache.CacheException e) {
            Log.e(TAG, "Storing index file failed", e);
        }
    }

    private void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.index.getOrAdd(simpleCacheSpan.key).addSpan(simpleCacheSpan);
        this.totalSpace += simpleCacheSpan.length;
        notifySpanAdded(simpleCacheSpan);
    }

    private void removeSpan(CacheSpan cacheSpan, boolean z) throws Cache.CacheException {
        CachedContent cachedContent = this.index.get(cacheSpan.key);
        if (cachedContent == null || !cachedContent.removeSpan(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (z) {
            try {
                this.index.maybeRemove(cachedContent.key);
                this.index.store();
            } finally {
                notifySpanRemoved(cacheSpan);
            }
        }
    }

    private void removeStaleSpansAndCachedContents() throws Cache.CacheException {
        ArrayList arrayList = new ArrayList();
        for (CachedContent cachedContent : this.index.getAll()) {
            Iterator<SimpleCacheSpan> it = cachedContent.getSpans().iterator();
            while (it.hasNext()) {
                SimpleCacheSpan next = it.next();
                if (!next.file.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpan((CacheSpan) arrayList.get(i), false);
        }
        this.index.removeEmpty();
        this.index.store();
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanAdded(SimpleCacheSpan simpleCacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, simpleCacheSpan);
            }
        }
        this.evictor.onSpanAdded(this, simpleCacheSpan);
    }

    private void notifySpanTouched(SimpleCacheSpan simpleCacheSpan, CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(simpleCacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, simpleCacheSpan, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, simpleCacheSpan, cacheSpan);
    }

    private static synchronized boolean lockFolder(File file) {
        synchronized (SimpleCache.class) {
            if (cacheFolderLockingDisabled) {
                return true;
            }
            return lockedCacheDirs.add(file.getAbsoluteFile());
        }
    }

    private static synchronized void unlockFolder(File file) {
        synchronized (SimpleCache.class) {
            if (!cacheFolderLockingDisabled) {
                lockedCacheDirs.remove(file.getAbsoluteFile());
            }
        }
    }
}
