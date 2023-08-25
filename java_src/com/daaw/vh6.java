package com.daaw;

import android.util.JsonReader;
/* loaded from: classes.dex */
public final class vh6 {

    /* renamed from: a */
    public String f30234a;

    public vh6(JsonReader jsonReader) {
        char c;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("description")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                jsonReader.nextInt();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f30234a = str;
    }

    /* renamed from: a */
    public final String m7141a() {
        return this.f30234a;
    }
}
