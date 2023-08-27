package com.google.firebase.encoders;

import java.io.IOException;
/* loaded from: classes2.dex */
public interface ValueEncoderContext {
    ValueEncoderContext add(double d) throws IOException;

    ValueEncoderContext add(int i) throws IOException;

    ValueEncoderContext add(long j) throws IOException;

    ValueEncoderContext add(String str) throws IOException;

    ValueEncoderContext add(boolean z) throws IOException;

    ValueEncoderContext add(byte[] bArr) throws IOException;
}
