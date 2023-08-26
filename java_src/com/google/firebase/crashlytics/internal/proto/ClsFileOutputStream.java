package com.google.firebase.crashlytics.internal.proto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
/* loaded from: classes2.dex */
public class ClsFileOutputStream extends FileOutputStream {
    public static final String IN_PROGRESS_SESSION_FILE_EXTENSION = ".cls_temp";
    public static final String SESSION_FILE_EXTENSION = ".cls";
    public static final FilenameFilter TEMP_FILENAME_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.proto.ClsFileOutputStream.1
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    };
    private boolean closed;
    private File complete;
    private File inProgress;
    private final String root;

    public ClsFileOutputStream(String str, String str2) throws FileNotFoundException {
        this(new File(str), str2);
    }

    public ClsFileOutputStream(File file, String str) throws FileNotFoundException {
        super(new File(file, str + IN_PROGRESS_SESSION_FILE_EXTENSION));
        this.closed = false;
        this.root = file + File.separator + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.root);
        sb.append(IN_PROGRESS_SESSION_FILE_EXTENSION);
        this.inProgress = new File(sb.toString());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        super.flush();
        super.close();
        File file = new File(this.root + SESSION_FILE_EXTENSION);
        if (this.inProgress.renameTo(file)) {
            this.inProgress = null;
            this.complete = file;
            return;
        }
        String str = "";
        if (file.exists()) {
            str = " (target already exists)";
        } else if (!this.inProgress.exists()) {
            str = " (source does not exist)";
        }
        throw new IOException("Could not rename temp file: " + this.inProgress + " -> " + file + str);
    }

    public void closeInProgressStream() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        super.flush();
        super.close();
    }

    public File getCompleteFile() {
        return this.complete;
    }

    public File getInProgressFile() {
        return this.inProgress;
    }
}
