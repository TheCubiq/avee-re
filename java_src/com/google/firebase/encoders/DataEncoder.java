package com.google.firebase.encoders;

import java.io.IOException;
import java.io.Writer;
/* loaded from: classes2.dex */
public interface DataEncoder {
    String encode(Object obj);

    void encode(Object obj, Writer writer) throws IOException;
}
