package com.daaw;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class wh6 {
    public final List a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final boolean g;
    public final String h;
    public final vh6 i;
    public final Bundle j;
    public final String k;
    public final String l;

    public wh6(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        long j = 0;
        vh6 vh6Var = null;
        boolean z = false;
        String str4 = str3;
        String str5 = str4;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str5 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                String str6 = str3;
                if (((Boolean) zzba.zzc().b(g93.x7)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    vh6Var = new vh6(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("response_info_extras".equals(nextName)) {
                    if (((Boolean) zzba.zzc().b(g93.l6)).booleanValue()) {
                        try {
                            Bundle zza = zzbu.zza(zzbu.zzh(jsonReader));
                            if (zza != null) {
                                bundle = zza;
                            }
                        } catch (IOException | JSONException unused) {
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    jsonReader.skipValue();
                } else {
                    if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) zzba.zzc().b(g93.q8)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) zzba.zzc().b(g93.q8)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        }
                    }
                    jsonReader.skipValue();
                }
                str3 = str6;
            }
        }
        jsonReader.endObject();
        this.a = emptyList;
        this.c = i;
        this.b = str4;
        this.d = str5;
        this.e = i2;
        this.f = j;
        this.i = vh6Var;
        this.g = z;
        this.h = str;
        this.j = bundle;
        this.k = str2;
        this.l = str3;
    }
}
