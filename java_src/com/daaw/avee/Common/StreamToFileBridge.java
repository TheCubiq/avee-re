package com.daaw.avee.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class StreamToFileBridge {
    File file;
    OutputStream output;

    public StreamToFileBridge(File file, OutputStream outputStream) {
        this.file = file;
        this.output = outputStream;
    }

    public boolean finish(StatusMsg statusMsg) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return true;
                }
                this.output.write(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            tlog.w("Error finishing StreamToFileBridge");
            if (statusMsg != null) {
                statusMsg.addCriticalErrorException("Failed creating output file", e);
            }
            return false;
        } catch (IOException e2) {
            tlog.w("Error finishing StreamToFileBridge");
            if (statusMsg != null) {
                statusMsg.addCriticalErrorException("Failed creating output file", e2);
            }
            return false;
        }
    }
}
