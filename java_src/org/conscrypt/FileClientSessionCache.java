package org.conscrypt;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import org.conscrypt.io.IoUtils;
/* loaded from: classes2.dex */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    private static final Logger logger = Logger.getLogger(FileClientSessionCache.class.getName());
    public static final Map<File, Impl> caches = new HashMap();

    /* loaded from: classes2.dex */
    public static class CacheFile extends File {
        public long lastModified;
        public final String name;

        public CacheFile(File file, String str) {
            super(file, str);
            this.lastModified = -1L;
            this.name = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.Comparable
        public int compareTo(File file) {
            long lastModified = lastModified() - file.lastModified();
            return lastModified == 0 ? super.compareTo(file) : lastModified < 0 ? -1 : 1;
        }

        @Override // java.io.File
        public long lastModified() {
            long j = this.lastModified;
            if (j == -1) {
                long lastModified = super.lastModified();
                this.lastModified = lastModified;
                return lastModified;
            }
            return j;
        }
    }

    /* loaded from: classes2.dex */
    public static class Impl implements SSLClientSessionCache {
        public Map<String, File> accessOrder = newAccessOrder();
        public final File directory;
        public String[] initialFiles;
        public int size;

        public Impl(File file) {
            int i;
            boolean exists = file.exists();
            if (exists && !file.isDirectory()) {
                throw new IOException(file + " exists but is not a directory.");
            }
            if (exists) {
                String[] list = file.list();
                this.initialFiles = list;
                if (list == null) {
                    throw new IOException(file + " exists but cannot list contents.");
                }
                Arrays.sort(list);
                i = this.initialFiles.length;
            } else if (!file.mkdirs()) {
                throw new IOException("Creation of " + file + " directory failed.");
            } else {
                i = 0;
            }
            this.size = i;
            this.directory = file;
        }

        private void delete(File file) {
            if (!file.delete()) {
                IOException iOException = new IOException("FileClientSessionCache: Failed to delete " + file + ".");
                FileClientSessionCache.logger.log(Level.WARNING, iOException.getMessage(), (Throwable) iOException);
            }
            this.size--;
        }

        private static String fileName(String str, int i) {
            Objects.requireNonNull(str, "host == null");
            return str + "." + i;
        }

        private void indexFiles() {
            String[] strArr = this.initialFiles;
            if (strArr != null) {
                this.initialFiles = null;
                TreeSet<CacheFile> treeSet = new TreeSet();
                for (String str : strArr) {
                    if (!this.accessOrder.containsKey(str)) {
                        treeSet.add(new CacheFile(this.directory, str));
                    }
                }
                if (treeSet.isEmpty()) {
                    return;
                }
                Map<String, File> newAccessOrder = newAccessOrder();
                for (CacheFile cacheFile : treeSet) {
                    newAccessOrder.put(cacheFile.name, cacheFile);
                }
                newAccessOrder.putAll(this.accessOrder);
                this.accessOrder = newAccessOrder;
            }
        }

        public static void logReadError(String str, File file, Throwable th) {
            Logger logger = FileClientSessionCache.logger;
            Level level = Level.WARNING;
            logger.log(level, "FileClientSessionCache: Error reading session data for " + str + " from " + file + ".", th);
        }

        public static void logWriteError(String str, File file, Throwable th) {
            Logger logger = FileClientSessionCache.logger;
            Level level = Level.WARNING;
            logger.log(level, "FileClientSessionCache: Error writing session data for " + str + " to " + file + ".", th);
        }

        private void makeRoom() {
            if (this.size <= 12) {
                return;
            }
            indexFiles();
            int i = this.size - 12;
            Iterator<File> it = this.accessOrder.values().iterator();
            do {
                delete(it.next());
                it.remove();
                i--;
            } while (i > 0);
        }

        private static Map<String, File> newAccessOrder() {
            return new LinkedHashMap(12, 0.75f, true);
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized byte[] getSessionData(String str, int i) {
            String fileName = fileName(str, i);
            File file = this.accessOrder.get(fileName);
            if (file == null) {
                String[] strArr = this.initialFiles;
                if (strArr == null) {
                    return null;
                }
                if (Arrays.binarySearch(strArr, fileName) < 0) {
                    return null;
                }
                file = new File(this.directory, fileName);
                this.accessOrder.put(fileName, file);
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[(int) file.length()];
                    new DataInputStream(fileInputStream).readFully(bArr);
                    IoUtils.closeQuietly(fileInputStream);
                    return bArr;
                } catch (IOException e) {
                    logReadError(str, file, e);
                    IoUtils.closeQuietly(fileInputStream);
                    return null;
                }
            } catch (FileNotFoundException e2) {
                logReadError(str, file, e2);
                return null;
            }
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized void putSessionData(SSLSession sSLSession, byte[] bArr) {
            String peerHost = sSLSession.getPeerHost();
            if (bArr == null) {
                throw new NullPointerException("sessionData == null");
            }
            String fileName = fileName(peerHost, sSLSession.getPeerPort());
            File file = new File(this.directory, fileName);
            boolean exists = file.exists();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (!exists) {
                    this.size++;
                    makeRoom();
                }
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        this.accessOrder.put(fileName, file);
                    } catch (IOException e) {
                        logWriteError(peerHost, file, e);
                        delete(file);
                    }
                } catch (IOException e2) {
                    logWriteError(peerHost, file, e2);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        logWriteError(peerHost, file, e3);
                    }
                }
            } catch (FileNotFoundException e4) {
                logWriteError(peerHost, file, e4);
            }
        }
    }

    private FileClientSessionCache() {
    }

    public static synchronized void reset() {
        synchronized (FileClientSessionCache.class) {
            caches.clear();
        }
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) {
        Impl impl;
        synchronized (FileClientSessionCache.class) {
            Map<File, Impl> map = caches;
            impl = map.get(file);
            if (impl == null) {
                impl = new Impl(file);
                map.put(file, impl);
            }
        }
        return impl;
    }
}
