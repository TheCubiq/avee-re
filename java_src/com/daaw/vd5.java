package com.daaw;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
/* loaded from: classes.dex */
public final class vd5 {
    public final ag a;

    public vd5(ag agVar) {
        this.a = agVar;
    }

    public final void a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) ib3.a.e()).booleanValue()) {
            long a = this.a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                k04.zzh("unable to log", e);
            }
            k04.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
