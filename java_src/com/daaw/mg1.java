package com.daaw;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class mg1 implements InterfaceC3911zw<InputStream> {
    @Override // com.daaw.InterfaceC3911zw
    /* renamed from: b */
    public boolean mo1827a(InputStream inputStream, OutputStream outputStream) {
        byte[] m26225b = C0833bd.m26226a().m26225b();
        while (true) {
            try {
                int read = inputStream.read(m26225b);
                if (read == -1) {
                    return true;
                }
                outputStream.write(m26225b, 0, read);
            } catch (IOException unused) {
                Log.isLoggable("StreamEncoder", 3);
                return false;
            } finally {
                C0833bd.m26226a().m26224c(m26225b);
            }
        }
    }

    @Override // com.daaw.InterfaceC3911zw
    public String getId() {
        return "";
    }
}
