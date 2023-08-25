package com.daaw;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class uh6 {

    /* renamed from: a */
    public final int f29083a;

    /* renamed from: b */
    public final int f29084b;

    /* renamed from: c */
    public final boolean f29085c;

    public uh6(int i, int i2, boolean z) {
        this.f29083a = i;
        this.f29084b = i2;
        this.f29085c = z;
    }

    /* renamed from: a */
    public static List m8134a(JsonReader jsonReader) {
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
