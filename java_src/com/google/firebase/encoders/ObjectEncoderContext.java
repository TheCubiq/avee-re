package com.google.firebase.encoders;

import java.io.IOException;
/* loaded from: classes2.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext add(String str, double d) throws IOException;

    ObjectEncoderContext add(String str, int i) throws IOException;

    ObjectEncoderContext add(String str, long j) throws IOException;

    ObjectEncoderContext add(String str, Object obj) throws IOException;

    ObjectEncoderContext add(String str, boolean z) throws IOException;

    ObjectEncoderContext inline(Object obj) throws IOException;

    ObjectEncoderContext nested(String str) throws IOException;
}
