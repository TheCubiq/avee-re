package com.daaw;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;
@AutoValue
/* loaded from: classes.dex */
public abstract class hl0 {
    /* renamed from: a */
    public static hl0 m20645a(long j) {
        return new C1814j9(j);
    }

    /* renamed from: b */
    public static hl0 m20644b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m20645a(Long.parseLong(jsonReader.nextString())) : m20645a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo18725c();
}
