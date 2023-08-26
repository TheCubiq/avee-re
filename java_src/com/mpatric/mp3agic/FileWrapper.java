package com.mpatric.mp3agic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes2.dex */
public class FileWrapper {
    protected File file;
    protected long lastModified;
    protected long length;

    /* JADX INFO: Access modifiers changed from: protected */
    public FileWrapper() {
    }

    public FileWrapper(String str) throws IOException {
        this.file = new File(str);
        init();
    }

    public FileWrapper(File file) throws IOException {
        if (file == null) {
            throw null;
        }
        this.file = file;
        init();
    }

    private void init() throws IOException {
        if (!this.file.exists()) {
            throw new FileNotFoundException("File not found " + this.file.getPath());
        } else if (!this.file.canRead()) {
            throw new IOException("File not readable " + this.file.getPath());
        } else {
            this.length = this.file.length();
            this.lastModified = this.file.lastModified();
        }
    }

    public String getFilename() {
        return this.file.getPath();
    }

    public long getLength() {
        return this.length;
    }

    public long getLastModified() {
        return this.lastModified;
    }
}
