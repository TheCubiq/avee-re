package com.daaw;

import android.util.Base64;
import android.util.JsonReader;
import com.daaw.AbstractC2057lm;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
/* renamed from: com.daaw.tm */
/* loaded from: classes2.dex */
public class C3095tm {

    /* renamed from: a */
    public static final InterfaceC1603hp f27855a = new zh0().m2316j(C3164u7.f28635a).m2315k(true).m2317i();

    /* renamed from: com.daaw.tm$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3096a<T> {
        /* renamed from: a */
        T mo8970a(JsonReader jsonReader);
    }

    /* renamed from: A */
    public static AbstractC2057lm m9001A(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2060b m16847b = AbstractC2057lm.m16847b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16847b.mo16811f(m8972y(jsonReader));
                    break;
                case 1:
                    m16847b.mo16809h(jsonReader.nextString());
                    break;
                case 2:
                    m16847b.mo16815b(jsonReader.nextString());
                    break;
                case 3:
                    m16847b.mo16813d(jsonReader.nextString());
                    break;
                case 4:
                    m16847b.mo16812e(jsonReader.nextString());
                    break;
                case 5:
                    m16847b.mo16810g(jsonReader.nextInt());
                    break;
                case 6:
                    m16847b.mo16814c(jsonReader.nextString());
                    break;
                case 7:
                    m16847b.mo16808i(m9000B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16847b.mo16816a();
    }

    /* renamed from: B */
    public static AbstractC2057lm.AbstractC2067e m9000B(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2071b m16789a = AbstractC2057lm.AbstractC2067e.m16789a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16789a.mo16747l(jsonReader.nextLong());
                    break;
                case 1:
                    m16789a.m16749j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    m16789a.mo16754e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    m16789a.mo16755d(m8984m(jsonReader));
                    break;
                case 4:
                    m16789a.mo16753f(m8986k(jsonReader, new InterfaceC3096a() { // from class: com.daaw.nm
                        @Override // com.daaw.C3095tm.InterfaceC3096a
                        /* renamed from: a */
                        public final Object mo8970a(JsonReader jsonReader2) {
                            AbstractC2057lm.AbstractC2067e.AbstractC2074d m8983n;
                            m8983n = C3095tm.m8983n(jsonReader2);
                            return m8983n;
                        }
                    }));
                    break;
                case 5:
                    m16789a.mo16748k(m8971z(jsonReader));
                    break;
                case 6:
                    m16789a.mo16757b(m8988i(jsonReader));
                    break;
                case 7:
                    m16789a.mo16746m(m8999C(jsonReader));
                    break;
                case '\b':
                    m16789a.mo16752g(jsonReader.nextString());
                    break;
                case '\t':
                    m16789a.mo16756c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    m16789a.mo16751h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16789a.mo16758a();
    }

    /* renamed from: C */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2096f m8999C(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2096f.AbstractC2097a m16731a = AbstractC2057lm.AbstractC2067e.AbstractC2096f.m16731a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("identifier")) {
                m16731a.mo2640b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m16731a.mo2641a();
    }

    /* renamed from: i */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2068a m8988i(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a m16773a = AbstractC2057lm.AbstractC2067e.AbstractC2068a.m16773a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16773a.mo16761e(jsonReader.nextString());
                    break;
                case 1:
                    m16773a.mo16764b(jsonReader.nextString());
                    break;
                case 2:
                    m16773a.mo16763c(jsonReader.nextString());
                    break;
                case 3:
                    m16773a.mo16759g(jsonReader.nextString());
                    break;
                case 4:
                    m16773a.mo16760f(jsonReader.nextString());
                    break;
                case 5:
                    m16773a.mo16762d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16773a.mo16765a();
    }

    /* renamed from: j */
    public static AbstractC2057lm.AbstractC2058a m8987j(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2058a.AbstractC2059a m16834a = AbstractC2057lm.AbstractC2058a.m16834a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16834a.mo16823c(jsonReader.nextInt());
                    break;
                case 1:
                    m16834a.mo16821e(jsonReader.nextLong());
                    break;
                case 2:
                    m16834a.mo16819g(jsonReader.nextLong());
                    break;
                case 3:
                    m16834a.mo16818h(jsonReader.nextLong());
                    break;
                case 4:
                    m16834a.mo16822d(jsonReader.nextString());
                    break;
                case 5:
                    m16834a.mo16820f(jsonReader.nextInt());
                    break;
                case 6:
                    m16834a.mo16817i(jsonReader.nextString());
                    break;
                case 7:
                    m16834a.mo16824b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16834a.mo16825a();
    }

    /* renamed from: k */
    public static <T> of0<T> m8986k(JsonReader jsonReader, InterfaceC3096a<T> interfaceC3096a) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC3096a.mo8970a(jsonReader));
        }
        jsonReader.endArray();
        return of0.m14316d(arrayList);
    }

    /* renamed from: l */
    public static AbstractC2057lm.AbstractC2061c m8985l(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2061c.AbstractC2062a m16807a = AbstractC2057lm.AbstractC2061c.m16807a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                m16807a.mo16803b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                m16807a.mo16802c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m16807a.mo16804a();
    }

    /* renamed from: m */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2072c m8984m(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a m16745a = AbstractC2057lm.AbstractC2067e.AbstractC2072c.m16745a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16745a.mo15460i(jsonReader.nextBoolean());
                    break;
                case 1:
                    m16745a.mo15464e(jsonReader.nextString());
                    break;
                case 2:
                    m16745a.mo15461h(jsonReader.nextLong());
                    break;
                case 3:
                    m16745a.mo15467b(jsonReader.nextInt());
                    break;
                case 4:
                    m16745a.mo15465d(jsonReader.nextLong());
                    break;
                case 5:
                    m16745a.mo15466c(jsonReader.nextInt());
                    break;
                case 6:
                    m16745a.mo15463f(jsonReader.nextString());
                    break;
                case 7:
                    m16745a.mo15459j(jsonReader.nextInt());
                    break;
                case '\b':
                    m16745a.mo15462g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16745a.mo15468a();
    }

    /* renamed from: n */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d m8983n(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b m16744a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.m16744a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16744a.mo14476c(m8980q(jsonReader));
                    break;
                case 1:
                    m16744a.mo14477b(m8982o(jsonReader));
                    break;
                case 2:
                    m16744a.mo14475d(m8976u(jsonReader));
                    break;
                case 3:
                    m16744a.mo14473f(jsonReader.nextString());
                    break;
                case 4:
                    m16744a.mo14474e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16744a.mo14478a();
    }

    /* renamed from: o */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a m8982o(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a m16743a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.m16743a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16743a.mo13603b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    m16743a.mo13601d(m8979r(jsonReader));
                    break;
                case 2:
                    m16743a.mo13600e(m8986k(jsonReader, new InterfaceC3096a() { // from class: com.daaw.sm
                        @Override // com.daaw.C3095tm.InterfaceC3096a
                        /* renamed from: a */
                        public final Object mo8970a(JsonReader jsonReader2) {
                            AbstractC2057lm.AbstractC2061c m8985l;
                            m8985l = C3095tm.m8985l(jsonReader2);
                            return m8985l;
                        }
                    }));
                    break;
                case 3:
                    m16743a.mo13602c(m8986k(jsonReader, new InterfaceC3096a() { // from class: com.daaw.sm
                        @Override // com.daaw.C3095tm.InterfaceC3096a
                        /* renamed from: a */
                        public final Object mo8970a(JsonReader jsonReader2) {
                            AbstractC2057lm.AbstractC2061c m8985l;
                            m8985l = C3095tm.m8985l(jsonReader2);
                            return m8985l;
                        }
                    }));
                    break;
                case 4:
                    m16743a.mo13599f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16743a.mo13604a();
    }

    /* renamed from: p */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a m8981p(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a m16741a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.m16741a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16741a.mo11597c(jsonReader.nextString());
                    break;
                case 1:
                    m16741a.mo11596d(jsonReader.nextLong());
                    break;
                case 2:
                    m16741a.m16739f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m16741a.mo11598b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16741a.mo11599a();
    }

    /* renamed from: q */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c m8980q(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a m16734a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.m16734a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16734a.mo6351b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    m16734a.mo6350c(jsonReader.nextInt());
                    break;
                case 2:
                    m16734a.mo6348e(jsonReader.nextInt());
                    break;
                case 3:
                    m16734a.mo6349d(jsonReader.nextLong());
                    break;
                case 4:
                    m16734a.mo6346g(jsonReader.nextLong());
                    break;
                case 5:
                    m16734a.mo6347f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16734a.mo6352a();
    }

    /* renamed from: r */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b m8979r(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b m16742a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.m16742a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16742a.mo12715b(m8987j(jsonReader));
                    break;
                case 1:
                    m16742a.mo12711f(m8986k(jsonReader, new InterfaceC3096a() { // from class: com.daaw.pm
                        @Override // com.daaw.C3095tm.InterfaceC3096a
                        /* renamed from: a */
                        public final Object mo8970a(JsonReader jsonReader2) {
                            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e m8974w;
                            m8974w = C3095tm.m8974w(jsonReader2);
                            return m8974w;
                        }
                    }));
                    break;
                case 2:
                    m16742a.mo12712e(m8975v(jsonReader));
                    break;
                case 3:
                    m16742a.mo12714c(m8986k(jsonReader, new InterfaceC3096a() { // from class: com.daaw.rm
                        @Override // com.daaw.C3095tm.InterfaceC3096a
                        /* renamed from: a */
                        public final Object mo8970a(JsonReader jsonReader2) {
                            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a m8981p;
                            m8981p = C3095tm.m8981p(jsonReader2);
                            return m8981p;
                        }
                    }));
                    break;
                case 4:
                    m16742a.mo12713d(m8978s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16742a.mo12716a();
    }

    /* renamed from: s */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c m8978s(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a m16738a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.m16738a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16738a.mo10553c(m8986k(jsonReader, C2453om.f21649a));
                    break;
                case 1:
                    m16738a.mo10551e(jsonReader.nextString());
                    break;
                case 2:
                    m16738a.mo10550f(jsonReader.nextString());
                    break;
                case 3:
                    m16738a.mo10554b(m8978s(jsonReader));
                    break;
                case 4:
                    m16738a.mo10552d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16738a.mo10555a();
    }

    /* renamed from: t */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b m8977t(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a m16735a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.m16735a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16735a.mo7351d(jsonReader.nextLong());
                    break;
                case 1:
                    m16735a.mo7349f(jsonReader.nextString());
                    break;
                case 2:
                    m16735a.mo7350e(jsonReader.nextLong());
                    break;
                case 3:
                    m16735a.mo7353b(jsonReader.nextString());
                    break;
                case 4:
                    m16735a.mo7352c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16735a.mo7354a();
    }

    /* renamed from: u */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d m8976u(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d.AbstractC2093a m16733a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d.m16733a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("content")) {
                m16733a.mo5446b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m16733a.mo5447a();
    }

    /* renamed from: v */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d m8975v(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a m16737a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.m16737a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16737a.mo9460b(jsonReader.nextLong());
                    break;
                case 1:
                    m16737a.mo9459c(jsonReader.nextString());
                    break;
                case 2:
                    m16737a.mo9458d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16737a.mo9461a();
    }

    /* renamed from: w */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e m8974w(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a m16736a = AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.m16736a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16736a.mo8439b(m8986k(jsonReader, C2453om.f21649a));
                    break;
                case 1:
                    m16736a.mo8437d(jsonReader.nextString());
                    break;
                case 2:
                    m16736a.mo8438c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16736a.mo8440a();
    }

    /* renamed from: x */
    public static AbstractC2057lm.AbstractC2063d.AbstractC2065b m8973x(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2063d.AbstractC2065b.AbstractC2066a m16795a = AbstractC2057lm.AbstractC2063d.AbstractC2065b.m16795a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                m16795a.mo16790c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                m16795a.mo16791b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m16795a.mo16792a();
    }

    /* renamed from: y */
    public static AbstractC2057lm.AbstractC2063d m8972y(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2063d.AbstractC2064a m16801a = AbstractC2057lm.AbstractC2063d.m16801a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                m16801a.mo16797b(m8986k(jsonReader, new InterfaceC3096a() { // from class: com.daaw.qm
                    @Override // com.daaw.C3095tm.InterfaceC3096a
                    /* renamed from: a */
                    public final Object mo8970a(JsonReader jsonReader2) {
                        AbstractC2057lm.AbstractC2063d.AbstractC2065b m8973x;
                        m8973x = C3095tm.m8973x(jsonReader2);
                        return m8973x;
                    }
                }));
            } else if (nextName.equals("orgId")) {
                m16801a.mo16796c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m16801a.mo16798a();
    }

    /* renamed from: z */
    public static AbstractC2057lm.AbstractC2067e.AbstractC2094e m8971z(JsonReader jsonReader) {
        AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a m16732a = AbstractC2057lm.AbstractC2067e.AbstractC2094e.m16732a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m16732a.mo4022b(jsonReader.nextString());
                    break;
                case 1:
                    m16732a.mo4021c(jsonReader.nextBoolean());
                    break;
                case 2:
                    m16732a.mo4019e(jsonReader.nextString());
                    break;
                case 3:
                    m16732a.mo4020d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m16732a.mo4023a();
    }

    /* renamed from: D */
    public AbstractC2057lm m8998D(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            AbstractC2057lm m9001A = m9001A(jsonReader);
            jsonReader.close();
            return m9001A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: E */
    public String m8997E(AbstractC2057lm abstractC2057lm) {
        return f27855a.mo2308b(abstractC2057lm);
    }

    /* renamed from: g */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d m8990g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            AbstractC2057lm.AbstractC2067e.AbstractC2074d m8983n = m8983n(jsonReader);
            jsonReader.close();
            return m8983n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: h */
    public String m8989h(AbstractC2057lm.AbstractC2067e.AbstractC2074d abstractC2074d) {
        return f27855a.mo2308b(abstractC2074d);
    }
}
