package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
/* loaded from: classes2.dex */
final /* synthetic */ class JsonDataEncoderBuilder$$Lambda$4 implements ValueEncoder {
    private static final JsonDataEncoderBuilder$$Lambda$4 instance = new JsonDataEncoderBuilder$$Lambda$4();

    private JsonDataEncoderBuilder$$Lambda$4() {
    }

    public static ValueEncoder lambdaFactory$() {
        return instance;
    }

    @Override // com.google.firebase.encoders.Encoder
    public void encode(Object obj, ValueEncoderContext valueEncoderContext) {
        valueEncoderContext.add((String) obj);
    }
}
