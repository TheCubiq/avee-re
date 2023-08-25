package com.daaw;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class uh6 {
    public final int a;
    public final int b;
    public final boolean c;

    public uh6(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static List a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new uh6(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
