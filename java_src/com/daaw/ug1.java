package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class ug1 {
    public File a;
    public OutputStream b;

    public ug1(File file, OutputStream outputStream) {
        this.a = file;
        this.b = outputStream;
    }

    public boolean a(wf1 wf1Var) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return true;
                }
                this.b.write(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            lz1.c("Error finishing StreamToFileBridge");
            if (wf1Var != null) {
                wf1Var.b("Failed creating output file", e);
            }
            return false;
        } catch (IOException e2) {
            lz1.c("Error finishing StreamToFileBridge");
            if (wf1Var != null) {
                wf1Var.b("Failed creating output file", e2);
            }
            return false;
        }
    }
}
