package com.daaw;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class pn5 {
    public int a = 0;
    public Map b = new HashMap();
    public String c = "";
    public long d = -1;

    public static pn5 a(Reader reader) {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap hashMap = new HashMap();
                String str = "";
                jsonReader.beginObject();
                int i = 0;
                long j = -1;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), zzbu.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                pn5 pn5Var = new pn5();
                pn5Var.a = i;
                if (str != null) {
                    pn5Var.c = str;
                }
                pn5Var.d = j;
                pn5Var.b = hashMap;
                return pn5Var;
            } finally {
                xd0.a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
            throw new xh6("Unable to parse Response", e);
        }
    }
}
