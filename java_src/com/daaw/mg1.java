package com.daaw;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class mg1 implements zw<InputStream> {
    @Override // com.daaw.zw
    /* renamed from: b */
    public boolean a(InputStream inputStream, OutputStream outputStream) {
        byte[] b = bd.a().b();
        while (true) {
            try {
                int read = inputStream.read(b);
                if (read == -1) {
                    return true;
                }
                outputStream.write(b, 0, read);
            } catch (IOException unused) {
                Log.isLoggable("StreamEncoder", 3);
                return false;
            } finally {
                bd.a().c(b);
            }
        }
    }

    @Override // com.daaw.zw
    public String getId() {
        return "";
    }
}
