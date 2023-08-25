package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class ug1 {

    /* renamed from: a */
    public File f29038a;

    /* renamed from: b */
    public OutputStream f29039b;

    public ug1(File file, OutputStream outputStream) {
        this.f29038a = file;
        this.f29039b = outputStream;
    }

    /* renamed from: a */
    public boolean m8254a(wf1 wf1Var) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f29038a);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return true;
                }
                this.f29039b.write(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            lz1.m16363c("Error finishing StreamToFileBridge");
            if (wf1Var != null) {
                wf1Var.m6095b("Failed creating output file", e);
            }
            return false;
        } catch (IOException e2) {
            lz1.m16363c("Error finishing StreamToFileBridge");
            if (wf1Var != null) {
                wf1Var.m6095b("Failed creating output file", e2);
            }
            return false;
        }
    }
}
