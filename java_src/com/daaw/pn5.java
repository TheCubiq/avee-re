package com.daaw;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class pn5 {

    /* renamed from: a */
    public int f23079a = 0;

    /* renamed from: b */
    public Map f23080b = new HashMap();

    /* renamed from: c */
    public String f23081c = "";

    /* renamed from: d */
    public long f23082d = -1;

    /* renamed from: a */
    public static pn5 m13270a(Reader reader) {
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
                pn5Var.f23079a = i;
                if (str != null) {
                    pn5Var.f23081c = str;
                }
                pn5Var.f23082d = j;
                pn5Var.f23080b = hashMap;
                return pn5Var;
            } finally {
                xd0.m5227a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
            throw new xh6("Unable to parse Response", e);
        }
    }
}
