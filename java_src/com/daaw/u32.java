package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public final class u32 extends pa8 {

    /* renamed from: d */
    public String f28504d;

    /* renamed from: e */
    public Set f28505e;

    /* renamed from: f */
    public Map f28506f;

    /* renamed from: g */
    public Long f28507g;

    /* renamed from: h */
    public Long f28508h;

    public u32(yb8 yb8Var) {
        super(yb8Var);
    }

    @Override // com.daaw.pa8
    /* renamed from: k */
    public final boolean mo8149k() {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:503|(1:505)(1:507)|506)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:463|(6:464|465|466|467|468|(1:471)(1:470))|472)|44|(1:46)(6:274|(11:276|277|278|279|280|(2:(3:282|(1:284)|285)|287)(1:449)|288|289|(3:384|(6:387|(1:446)(2:391|(4:397|398|(7:400|(4:403|(2:405|406)(1:408)|407|401)|409|410|(4:413|(3:415|416|417)(1:419)|418|411)|420|421)(6:425|(4:428|(2:430|431)(1:433)|432|426)|434|435|(4:438|(2:440|441)(1:443)|442|436)|444)|422)(4:393|394|395|396))|423|424|396|385)|448)|291|292)(1:462)|293|(10:296|(3:300|(4:303|(5:305|306|(1:308)(1:312)|309|310)(1:313)|311|301)|314)|315|(3:319|(4:322|(3:327|328|329)|330|320)|333)|334|(3:336|(6:339|(2:341|(3:343|344|345))(1:348)|346|347|345|337)|349)|350|(3:359|(8:362|(1:364)|365|(1:367)|368|(3:370|371|372)(1:374)|373|360)|375)|376|294)|382|383)|47|(3:175|(4:178|(10:180|181|(1:183)(1:271)|184|(9:186|187|188|189|190|191|193|194|(4:196|(11:197|198|199|200|201|202|203|(3:205|206|207)(1:248)|208|209|(1:212)(1:211))|213|214)(4:254|255|247|214))(1:270)|215|(4:218|(3:236|237|238)(4:220|221|(2:222|(2:224|(1:226)(2:227|228))(1:235))|(3:230|231|232)(1:234))|233|216)|239|240|241)(1:272)|242|176)|273)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(6:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|(2:129|128)|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:511|512))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:2|(2:4|(2:6|7))(2:526|527))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:503|(1:505)(1:507)|506)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:463|(6:464|465|466|467|468|(1:471)(1:470))|472)|44|(1:46)(6:274|(11:276|277|278|279|280|(2:(3:282|(1:284)|285)|287)(1:449)|288|289|(3:384|(6:387|(1:446)(2:391|(4:397|398|(7:400|(4:403|(2:405|406)(1:408)|407|401)|409|410|(4:413|(3:415|416|417)(1:419)|418|411)|420|421)(6:425|(4:428|(2:430|431)(1:433)|432|426)|434|435|(4:438|(2:440|441)(1:443)|442|436)|444)|422)(4:393|394|395|396))|423|424|396|385)|448)|291|292)(1:462)|293|(10:296|(3:300|(4:303|(5:305|306|(1:308)(1:312)|309|310)(1:313)|311|301)|314)|315|(3:319|(4:322|(3:327|328|329)|330|320)|333)|334|(3:336|(6:339|(2:341|(3:343|344|345))(1:348)|346|347|345|337)|349)|350|(3:359|(8:362|(1:364)|365|(1:367)|368|(3:370|371|372)(1:374)|373|360)|375)|376|294)|382|383)|47|(3:175|(4:178|(10:180|181|(1:183)(1:271)|184|(9:186|187|188|189|190|191|193|194|(4:196|(11:197|198|199|200|201|202|203|(3:205|206|207)(1:248)|208|209|(1:212)(1:211))|213|214)(4:254|255|247|214))(1:270)|215|(4:218|(3:236|237|238)(4:220|221|(2:222|(2:224|(1:226)(2:227|228))(1:235))|(3:230|231|232)(1:234))|233|216)|239|240|241)(1:272)|242|176)|273)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(6:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|(2:129|128)|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:511|512))|525|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ef, code lost:
        if (r5 == null) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x07b6, code lost:
        if (r5 != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0959, code lost:
        if (r13 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0a59, code lost:
        r0 = r64.f25143a.mo3895i().m14155w();
        r6 = com.daaw.om5.m14152z(r64.f28504d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0a6d, code lost:
        if (r7.m27756M() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0a6f, code lost:
        r7 = java.lang.Integer.valueOf(r7.m27765D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0a78, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0a79, code lost:
        r0.m20651c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0171, code lost:
        if (r5 == null) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0220, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0221, code lost:
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0226, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0227, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022b, code lost:
        r18 = "audience_id";
        r19 = "data";
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0 A[Catch: SQLiteException -> 0x0220, all -> 0x0b46, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:434:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[Catch: SQLiteException -> 0x0220, all -> 0x0b46, TRY_ENTER, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:434:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025c  */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m8607l(String str, List list, List list2, Long l, Long l2) {
        int i;
        int i2;
        boolean z;
        Cursor cursor;
        C1370g6 c1370g6;
        String str2;
        String str3;
        Cursor cursor2;
        C1370g6 c1370g62;
        String str4;
        C1370g6 c1370g63;
        String str5;
        String str6;
        String str7;
        String str8;
        List<xp5> list3;
        String str9;
        Cursor cursor3;
        Map map;
        Iterator it;
        String str10;
        to2 to2Var;
        cw8 cw8Var;
        Iterator it2;
        to2 to2Var2;
        String str11;
        Cursor cursor4;
        List list4;
        Iterator it3;
        String str12;
        String str13;
        Map map2;
        Cursor cursor5;
        Cursor cursor6;
        List list5;
        C1370g6 c1370g64;
        Cursor cursor7;
        List list6;
        String str14 = "current_results";
        ry0.m10834f(str);
        ry0.m10830j(list);
        ry0.m10830j(list2);
        this.f28504d = str;
        this.f28505e = new HashSet();
        this.f28506f = new C1370g6();
        this.f28507g = l;
        this.f28508h = l2;
        Iterator it4 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (it4.hasNext()) {
                if ("_s".equals(((it6) it4.next()).m19362K())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        wj8.m6042b();
        boolean m12677B = this.f25143a.m24020z().m12677B(this.f28504d, m75.f18517Y);
        wj8.m6042b();
        boolean m12677B2 = this.f25143a.m24020z().m12677B(this.f28504d, m75.f18516X);
        if (z) {
            uh2 m3915W = this.f19771b.m3915W();
            String str15 = this.f28504d;
            m3915W.m13533g();
            m3915W.mo6991f();
            ry0.m10834f(str15);
            ContentValues contentValues = new ContentValues();
            ?? r5 = "current_session_count";
            contentValues.put("current_session_count", (Integer) 0);
            try {
                r5 = new String[]{str15};
                m3915W.m8168P().update("events", contentValues, "app_id = ?", r5);
                cursor = r5;
            } catch (SQLiteException e) {
                m3915W.f25143a.mo3895i().m14160q().m20651c("Error resetting session-scoped event counts. appId", om5.m14152z(str15), e);
                cursor = r5;
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str16 = "Failed to merge filter. appId";
        String str17 = "Database error querying filters. appId";
        String str18 = "data";
        String str19 = "audience_id";
        try {
            if (m12677B2 && m12677B) {
                uh2 m3915W2 = this.f19771b.m3915W();
                String str20 = this.f28504d;
                ry0.m10834f(str20);
                C1370g6 c1370g65 = new C1370g6();
                try {
                    try {
                        cursor7 = m3915W2.m8168P().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str20}, null, null, null);
                        try {
                        } catch (SQLiteException e2) {
                            e = e2;
                            m3915W2.f25143a.mo3895i().m14160q().m20651c("Database error querying filters. appId", om5.m14152z(str20), e);
                            emptyMap = Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor7 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                    }
                    throw th;
                }
                if (cursor7.moveToFirst()) {
                    while (true) {
                        try {
                            xp5 xp5Var = (xp5) ((uo5) ec8.m23601C(xp5.m4850F(), cursor7.getBlob(i2))).m3975m();
                            if (xp5Var.m4839Q()) {
                                Integer valueOf = Integer.valueOf(cursor7.getInt(i));
                                List list7 = (List) c1370g65.get(valueOf);
                                if (list7 == null) {
                                    list6 = new ArrayList();
                                    c1370g65.put(valueOf, list6);
                                } else {
                                    list6 = list7;
                                }
                                list6.add(xp5Var);
                            }
                        } catch (IOException e4) {
                            m3915W2.f25143a.mo3895i().m14160q().m20651c("Failed to merge filter. appId", om5.m14152z(str20), e4);
                        }
                        if (!cursor7.moveToNext()) {
                            break;
                        }
                        i = 0;
                        i2 = 1;
                    }
                    cursor7.close();
                    c1370g6 = c1370g65;
                    uh2 m3915W3 = this.f19771b.m3915W();
                    String str21 = this.f28504d;
                    m3915W3.m13533g();
                    m3915W3.mo6991f();
                    ry0.m10834f(str21);
                    cursor2 = m3915W3.m8168P().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str21}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        cursor2.close();
                        c1370g62 = emptyMap2;
                        str2 = "audience_id";
                        str3 = "data";
                    } else {
                        C1370g6 c1370g66 = new C1370g6();
                        while (true) {
                            int i3 = cursor2.getInt(0);
                            try {
                                c1370g66.put(Integer.valueOf(i3), (ka7) ((h97) ec8.m23601C(ka7.m17871I(), cursor2.getBlob(1))).m3975m());
                                c1370g64 = c1370g66;
                                str2 = str19;
                                str3 = str18;
                            } catch (IOException e5) {
                                c1370g64 = c1370g66;
                                str2 = str19;
                                try {
                                    str3 = str18;
                                    try {
                                        m3915W3.f25143a.mo3895i().m14160q().m20650d("Failed to merge filter results. appId, audienceId, error", om5.m14152z(str21), Integer.valueOf(i3), e5);
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        m3915W3.f25143a.mo3895i().m14160q().m20651c("Database error querying filter results. appId", om5.m14152z(str21), e);
                                        Map emptyMap3 = Collections.emptyMap();
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        c1370g62 = emptyMap3;
                                        if (c1370g62.isEmpty()) {
                                        }
                                        if (!list.isEmpty()) {
                                        }
                                        String str22 = str14;
                                        if (!list2.isEmpty()) {
                                        }
                                        String str23 = str6;
                                        ArrayList arrayList = new ArrayList();
                                        Set<Integer> keySet = this.f28506f.keySet();
                                        keySet.removeAll(this.f28505e);
                                        while (r2.hasNext()) {
                                        }
                                        return arrayList;
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    str3 = str18;
                                    m3915W3.f25143a.mo3895i().m14160q().m20651c("Database error querying filter results. appId", om5.m14152z(str21), e);
                                    Map emptyMap32 = Collections.emptyMap();
                                    if (cursor2 != null) {
                                    }
                                    c1370g62 = emptyMap32;
                                    if (c1370g62.isEmpty()) {
                                    }
                                    if (!list.isEmpty()) {
                                    }
                                    String str222 = str14;
                                    if (!list2.isEmpty()) {
                                    }
                                    String str232 = str6;
                                    ArrayList arrayList2 = new ArrayList();
                                    Set<Integer> keySet2 = this.f28506f.keySet();
                                    keySet2.removeAll(this.f28505e);
                                    while (r2.hasNext()) {
                                    }
                                    return arrayList2;
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            c1370g66 = c1370g64;
                            str19 = str2;
                            str18 = str3;
                        }
                        cursor2.close();
                        c1370g62 = c1370g64;
                    }
                    if (c1370g62.isEmpty()) {
                        HashSet<Integer> hashSet = new HashSet(c1370g62.keySet());
                        if (z) {
                            String str24 = this.f28504d;
                            uh2 m3915W4 = this.f19771b.m3915W();
                            String str25 = this.f28504d;
                            m3915W4.m13533g();
                            m3915W4.mo6991f();
                            ry0.m10834f(str25);
                            Map c1370g67 = new C1370g6();
                            ?? m8168P = m3915W4.m8168P();
                            try {
                                try {
                                    cursor3 = m8168P.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str25, str25});
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor3.getInt(0));
                                                List list8 = (List) c1370g67.get(valueOf2);
                                                if (list8 == null) {
                                                    list8 = new ArrayList();
                                                    c1370g67.put(valueOf2, list8);
                                                }
                                                list8.add(Integer.valueOf(cursor3.getInt(1)));
                                            } while (cursor3.moveToNext());
                                        } else {
                                            c1370g67 = Collections.emptyMap();
                                        }
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        m3915W4.f25143a.mo3895i().m14160q().m20651c("Database error querying scoped filters. appId", om5.m14152z(str25), e);
                                        c1370g67 = Collections.emptyMap();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (m8168P != 0) {
                                        m8168P.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e9) {
                                e = e9;
                                cursor3 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                m8168P = 0;
                                if (m8168P != 0) {
                                }
                                throw th;
                            }
                            cursor3.close();
                            ry0.m10834f(str24);
                            ry0.m10830j(c1370g62);
                            C1370g6 c1370g68 = new C1370g6();
                            if (!c1370g62.isEmpty()) {
                                Iterator it5 = c1370g62.keySet().iterator();
                                while (it5.hasNext()) {
                                    int intValue = ((Integer) it5.next()).intValue();
                                    Integer valueOf3 = Integer.valueOf(intValue);
                                    ka7 ka7Var = (ka7) c1370g62.get(valueOf3);
                                    List list9 = (List) c1370g67.get(valueOf3);
                                    if (list9 == null || list9.isEmpty()) {
                                        map = c1370g67;
                                        it = it5;
                                        str10 = str17;
                                        c1370g68.put(valueOf3, ka7Var);
                                    } else {
                                        map = c1370g67;
                                        List m23597G = this.f19771b.m3898g0().m23597G(ka7Var.m17866N(), list9);
                                        if (m23597G.isEmpty()) {
                                            c1370g67 = map;
                                        } else {
                                            h97 h97Var = (h97) ka7Var.m18675A();
                                            h97Var.m20915x();
                                            h97Var.m20919t(m23597G);
                                            it = it5;
                                            List m23597G2 = this.f19771b.m3898g0().m23597G(ka7Var.m17864P(), list9);
                                            h97Var.m20913z();
                                            h97Var.m20917v(m23597G2);
                                            lk8.m16887b();
                                            str10 = str17;
                                            if (this.f25143a.m24020z().m12677B(null, m75.f18560u0)) {
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it6 = ka7Var.m17867M().iterator();
                                                while (it6.hasNext()) {
                                                    er6 er6Var = (er6) it6.next();
                                                    Iterator it7 = it6;
                                                    if (!list9.contains(Integer.valueOf(er6Var.m23242D()))) {
                                                        arrayList3.add(er6Var);
                                                    }
                                                    it6 = it7;
                                                }
                                                h97Var.m20916w();
                                                h97Var.m20920s(arrayList3);
                                                ArrayList arrayList4 = new ArrayList();
                                                for (qc7 qc7Var : ka7Var.m17865O()) {
                                                    if (!list9.contains(Integer.valueOf(qc7Var.m12621E()))) {
                                                        arrayList4.add(qc7Var);
                                                    }
                                                }
                                                h97Var.m20914y();
                                                h97Var.m20918u(arrayList4);
                                            } else {
                                                for (int i4 = 0; i4 < ka7Var.m17876D(); i4++) {
                                                    if (list9.contains(Integer.valueOf(ka7Var.m17872H(i4).m23242D()))) {
                                                        h97Var.m20922A(i4);
                                                    }
                                                }
                                                for (int i5 = 0; i5 < ka7Var.m17874F(); i5++) {
                                                    if (list9.contains(Integer.valueOf(ka7Var.m17868L(i5).m12621E()))) {
                                                        h97Var.m20921B(i5);
                                                    }
                                                }
                                            }
                                            c1370g68.put(Integer.valueOf(intValue), (ka7) h97Var.m3975m());
                                        }
                                    }
                                    c1370g67 = map;
                                    it5 = it;
                                    str17 = str10;
                                }
                            }
                            str4 = str17;
                            c1370g63 = c1370g68;
                        } else {
                            str4 = "Database error querying filters. appId";
                            c1370g63 = c1370g62;
                        }
                        for (Integer num : hashSet) {
                            int intValue2 = num.intValue();
                            ka7 ka7Var2 = (ka7) c1370g63.get(Integer.valueOf(intValue2));
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            C1370g6 c1370g69 = new C1370g6();
                            if (ka7Var2 != null && ka7Var2.m17876D() != 0) {
                                for (er6 er6Var2 : ka7Var2.m17867M()) {
                                    if (er6Var2.m23235K()) {
                                        c1370g69.put(Integer.valueOf(er6Var2.m23242D()), er6Var2.m23236J() ? Long.valueOf(er6Var2.m23241E()) : null);
                                    }
                                }
                            }
                            C1370g6 c1370g610 = new C1370g6();
                            if (ka7Var2 != null && ka7Var2.m17874F() != 0) {
                                for (qc7 qc7Var2 : ka7Var2.m17865O()) {
                                    if (qc7Var2.m12614L() && qc7Var2.m12622D() > 0) {
                                        c1370g610.put(Integer.valueOf(qc7Var2.m12621E()), Long.valueOf(qc7Var2.m12620F(qc7Var2.m12622D() - 1)));
                                        c1370g63 = c1370g63;
                                    }
                                }
                            }
                            Map map3 = c1370g63;
                            if (ka7Var2 != null) {
                                int i6 = 0;
                                while (i6 < ka7Var2.m17873G() * 64) {
                                    if (ec8.m23592L(ka7Var2.m17864P(), i6)) {
                                        str9 = str16;
                                        this.f25143a.mo3895i().m14156v().m20651c("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i6));
                                        bitSet2.set(i6);
                                        if (ec8.m23592L(ka7Var2.m17866N(), i6)) {
                                            bitSet.set(i6);
                                            i6++;
                                            str16 = str9;
                                        }
                                    } else {
                                        str9 = str16;
                                    }
                                    c1370g69.remove(Integer.valueOf(i6));
                                    i6++;
                                    str16 = str9;
                                }
                            }
                            String str26 = str16;
                            Integer valueOf4 = Integer.valueOf(intValue2);
                            ka7 ka7Var3 = (ka7) c1370g62.get(valueOf4);
                            if (m12677B2 && m12677B && (list3 = (List) c1370g6.get(valueOf4)) != null && this.f28508h != null && this.f28507g != null) {
                                for (xp5 xp5Var2 : list3) {
                                    int m4851E = xp5Var2.m4851E();
                                    long longValue = this.f28508h.longValue() / 1000;
                                    if (xp5Var2.m4841O()) {
                                        longValue = this.f28507g.longValue() / 1000;
                                    }
                                    Integer valueOf5 = Integer.valueOf(m4851E);
                                    if (c1370g69.containsKey(valueOf5)) {
                                        c1370g69.put(valueOf5, Long.valueOf(longValue));
                                    }
                                    if (c1370g610.containsKey(valueOf5)) {
                                        c1370g610.put(valueOf5, Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.f28506f.put(Integer.valueOf(intValue2), new st8(this, this.f28504d, ka7Var3, bitSet, bitSet2, c1370g69, c1370g610, null));
                            str16 = str26;
                            c1370g6 = c1370g6;
                            c1370g63 = map3;
                            c1370g62 = c1370g62;
                        }
                        str5 = str16;
                        str6 = str2;
                        str7 = str3;
                        str8 = str4;
                    } else {
                        str8 = "Database error querying filters. appId";
                        str5 = "Failed to merge filter. appId";
                        str6 = str2;
                        str7 = str3;
                    }
                    if (!list.isEmpty()) {
                        cw8 cw8Var2 = new cw8(this, null);
                        C1370g6 c1370g611 = new C1370g6();
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            it6 it6Var = (it6) it8.next();
                            it6 m24941a = cw8Var2.m24941a(this.f28504d, it6Var);
                            if (m24941a != null) {
                                uh2 m3915W5 = this.f19771b.m3915W();
                                String str27 = this.f28504d;
                                String m19362K = m24941a.m19362K();
                                to2 m8162V = m3915W5.m8162V(str27, it6Var.m19362K());
                                if (m8162V == null) {
                                    m3915W5.f25143a.mo3895i().m14155w().m20651c("Event aggregate wasn't created during raw event logging. appId, event", om5.m14152z(str27), m3915W5.f25143a.m24055D().m5133d(m19362K));
                                    to2Var = new to2(str27, it6Var.m19362K(), 1L, 1L, 1L, it6Var.m19366G(), 0L, null, null, null, null);
                                } else {
                                    to2Var = new to2(m8162V.f27916a, m8162V.f27917b, m8162V.f27918c + 1, m8162V.f27919d + 1, m8162V.f27920e + 1, m8162V.f27921f, m8162V.f27922g, m8162V.f27923h, m8162V.f27924i, m8162V.f27925j, m8162V.f27926k);
                                }
                                this.f19771b.m3915W().m8144p(to2Var);
                                long j = to2Var.f27918c;
                                String m19362K2 = m24941a.m19362K();
                                Map map4 = (Map) c1370g611.get(m19362K2);
                                if (map4 == null) {
                                    uh2 m3915W6 = this.f19771b.m3915W();
                                    String str28 = this.f28504d;
                                    m3915W6.m13533g();
                                    m3915W6.mo6991f();
                                    ry0.m10834f(str28);
                                    ry0.m10834f(m19362K2);
                                    cw8Var = cw8Var2;
                                    C1370g6 c1370g612 = new C1370g6();
                                    it2 = it8;
                                    str11 = str14;
                                    String str29 = str6;
                                    String str30 = str7;
                                    try {
                                        try {
                                            str7 = str30;
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            str7 = str30;
                                        }
                                        try {
                                            cursor4 = m3915W6.m8168P().query("event_filters", new String[]{str29, str30}, "app_id=? AND event_name=?", new String[]{str28, m19362K2}, null, null, null);
                                            try {
                                                try {
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    if (cursor4 != null) {
                                                        cursor4.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                to2Var2 = to2Var;
                                                str6 = str29;
                                            }
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            to2Var2 = to2Var;
                                            str6 = str29;
                                            cursor4 = null;
                                            m3915W6.f25143a.mo3895i().m14160q().m20651c(str8, om5.m14152z(str28), e);
                                            map4 = Collections.emptyMap();
                                        }
                                        if (cursor4.moveToFirst()) {
                                            str6 = str29;
                                            while (true) {
                                                try {
                                                    try {
                                                        xp5 xp5Var3 = (xp5) ((uo5) ec8.m23601C(xp5.m4850F(), cursor4.getBlob(1))).m3975m();
                                                        Integer valueOf6 = Integer.valueOf(cursor4.getInt(0));
                                                        List list10 = (List) c1370g612.get(valueOf6);
                                                        if (list10 == null) {
                                                            to2Var2 = to2Var;
                                                            try {
                                                                list4 = new ArrayList();
                                                                c1370g612.put(valueOf6, list4);
                                                            } catch (SQLiteException e13) {
                                                                e = e13;
                                                                m3915W6.f25143a.mo3895i().m14160q().m20651c(str8, om5.m14152z(str28), e);
                                                                map4 = Collections.emptyMap();
                                                            }
                                                        } else {
                                                            to2Var2 = to2Var;
                                                            list4 = list10;
                                                        }
                                                        list4.add(xp5Var3);
                                                    } catch (IOException e14) {
                                                        to2Var2 = to2Var;
                                                        m3915W6.f25143a.mo3895i().m14160q().m20651c(str5, om5.m14152z(str28), e14);
                                                    }
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                    }
                                                    to2Var = to2Var2;
                                                } catch (SQLiteException e15) {
                                                    e = e15;
                                                    to2Var2 = to2Var;
                                                }
                                            }
                                            cursor4.close();
                                            map4 = c1370g612;
                                            c1370g611.put(m19362K2, map4);
                                        } else {
                                            to2Var2 = to2Var;
                                            str6 = str29;
                                            map4 = Collections.emptyMap();
                                            cursor4.close();
                                            c1370g611.put(m19362K2, map4);
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        cursor4 = null;
                                    }
                                } else {
                                    cw8Var = cw8Var2;
                                    it2 = it8;
                                    to2Var2 = to2Var;
                                    str11 = str14;
                                }
                                for (Integer num2 : map4.keySet()) {
                                    int intValue3 = num2.intValue();
                                    Set set = this.f28505e;
                                    Integer valueOf7 = Integer.valueOf(intValue3);
                                    if (set.contains(valueOf7)) {
                                        this.f25143a.mo3895i().m14156v().m20652b("Skipping failed audience ID", valueOf7);
                                    } else {
                                        Iterator it9 = ((List) map4.get(valueOf7)).iterator();
                                        boolean z2 = true;
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                break;
                                            }
                                            xp5 xp5Var4 = (xp5) it9.next();
                                            jx8 jx8Var = new jx8(this, this.f28504d, intValue3, xp5Var4);
                                            z2 = jx8Var.m18174k(this.f28507g, this.f28508h, m24941a, j, to2Var2, m8605n(intValue3, xp5Var4.m4851E()));
                                            if (!z2) {
                                                this.f28505e.add(Integer.valueOf(intValue3));
                                                break;
                                            }
                                            m8606m(Integer.valueOf(intValue3)).m9880c(jx8Var);
                                        }
                                        if (!z2) {
                                            this.f28505e.add(Integer.valueOf(intValue3));
                                        }
                                    }
                                }
                                cw8Var2 = cw8Var;
                                it8 = it2;
                                str14 = str11;
                            }
                        }
                    }
                    String str2222 = str14;
                    if (!list2.isEmpty()) {
                        C1370g6 c1370g613 = new C1370g6();
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            we7 we7Var = (we7) it10.next();
                            String m6123I = we7Var.m6123I();
                            Map map5 = (Map) c1370g613.get(m6123I);
                            if (map5 == null) {
                                uh2 m3915W7 = this.f19771b.m3915W();
                                String str31 = this.f28504d;
                                m3915W7.m13533g();
                                m3915W7.mo6991f();
                                ry0.m10834f(str31);
                                ry0.m10834f(m6123I);
                                C1370g6 c1370g614 = new C1370g6();
                                str12 = str6;
                                str13 = str7;
                                try {
                                    cursor6 = m3915W7.m8168P().query("property_filters", new String[]{str12, str13}, "app_id=? AND property_name=?", new String[]{str31, m6123I}, null, null, null);
                                    try {
                                        try {
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cursor5 = cursor6;
                                            if (cursor5 != null) {
                                                cursor5.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e16) {
                                        e = e16;
                                        it3 = it10;
                                    }
                                } catch (SQLiteException e17) {
                                    e = e17;
                                    it3 = it10;
                                    cursor6 = null;
                                } catch (Throwable th8) {
                                    th = th8;
                                    cursor5 = null;
                                }
                                if (cursor6.moveToFirst()) {
                                    while (true) {
                                        try {
                                            a06 a06Var = (a06) ((wy5) ec8.m23601C(a06.m27763F(), cursor6.getBlob(1))).m3975m();
                                            Integer valueOf8 = Integer.valueOf(cursor6.getInt(0));
                                            List list11 = (List) c1370g614.get(valueOf8);
                                            if (list11 == null) {
                                                list5 = new ArrayList();
                                                c1370g614.put(valueOf8, list5);
                                            } else {
                                                list5 = list11;
                                            }
                                            list5.add(a06Var);
                                            it3 = it10;
                                        } catch (IOException e18) {
                                            it3 = it10;
                                            try {
                                                m3915W7.f25143a.mo3895i().m14160q().m20651c("Failed to merge filter", om5.m14152z(str31), e18);
                                            } catch (SQLiteException e19) {
                                                e = e19;
                                                m3915W7.f25143a.mo3895i().m14160q().m20651c(str8, om5.m14152z(str31), e);
                                                map5 = Collections.emptyMap();
                                            }
                                        }
                                        if (!cursor6.moveToNext()) {
                                            break;
                                        }
                                        it10 = it3;
                                    }
                                    cursor6.close();
                                    map5 = c1370g614;
                                    c1370g613.put(m6123I, map5);
                                } else {
                                    it3 = it10;
                                    map5 = Collections.emptyMap();
                                    cursor6.close();
                                    c1370g613.put(m6123I, map5);
                                }
                            } else {
                                it3 = it10;
                                str12 = str6;
                                str13 = str7;
                            }
                            Iterator it11 = map5.keySet().iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    int intValue4 = ((Integer) it11.next()).intValue();
                                    Set set2 = this.f28505e;
                                    Integer valueOf9 = Integer.valueOf(intValue4);
                                    if (set2.contains(valueOf9)) {
                                        this.f25143a.mo3895i().m14156v().m20652b("Skipping failed audience ID", valueOf9);
                                        break;
                                    }
                                    Iterator it12 = ((List) map5.get(valueOf9)).iterator();
                                    boolean z3 = true;
                                    while (true) {
                                        if (!it12.hasNext()) {
                                            map2 = map5;
                                            break;
                                        }
                                        a06 a06Var2 = (a06) it12.next();
                                        if (Log.isLoggable(this.f25143a.mo3895i().m14168C(), 2)) {
                                            map2 = map5;
                                            this.f25143a.mo3895i().m14156v().m20650d("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), a06Var2.m27756M() ? Integer.valueOf(a06Var2.m27765D()) : null, this.f25143a.m24055D().m5131f(a06Var2.m27761H()));
                                            this.f25143a.mo3895i().m14156v().m20652b("Filter definition", this.f19771b.m3898g0().m23598F(a06Var2));
                                        } else {
                                            map2 = map5;
                                        }
                                        if (!a06Var2.m27756M() || a06Var2.m27765D() > 256) {
                                            break;
                                        }
                                        xz8 xz8Var = new xz8(this, this.f28504d, intValue4, a06Var2);
                                        z3 = xz8Var.m4369k(this.f28507g, this.f28508h, we7Var, m8605n(intValue4, a06Var2.m27765D()));
                                        if (!z3) {
                                            this.f28505e.add(Integer.valueOf(intValue4));
                                            break;
                                        }
                                        m8606m(Integer.valueOf(intValue4)).m9880c(xz8Var);
                                        map5 = map2;
                                    }
                                    if (z3) {
                                        map5 = map2;
                                    }
                                    this.f28505e.add(Integer.valueOf(intValue4));
                                    map5 = map2;
                                }
                            }
                            it10 = it3;
                            str7 = str13;
                            str6 = str12;
                        }
                    }
                    String str2322 = str6;
                    ArrayList arrayList22 = new ArrayList();
                    Set<Integer> keySet22 = this.f28506f.keySet();
                    keySet22.removeAll(this.f28505e);
                    for (Integer num3 : keySet22) {
                        int intValue5 = num3.intValue();
                        Map map6 = this.f28506f;
                        Integer valueOf10 = Integer.valueOf(intValue5);
                        st8 st8Var = (st8) map6.get(valueOf10);
                        ry0.m10830j(st8Var);
                        xo6 m9882a = st8Var.m9882a(intValue5);
                        arrayList22.add(m9882a);
                        uh2 m3915W8 = this.f19771b.m3915W();
                        String str32 = this.f28504d;
                        ka7 m4871G = m9882a.m4871G();
                        m3915W8.m13533g();
                        m3915W8.mo6991f();
                        ry0.m10834f(str32);
                        ry0.m10830j(m4871G);
                        byte[] m6531i = m4871G.m6531i();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str32);
                        contentValues2.put(str2322, valueOf10);
                        String str33 = str2222;
                        contentValues2.put(str33, m6531i);
                        try {
                            try {
                                if (m3915W8.m8168P().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                    m3915W8.f25143a.mo3895i().m14160q().m20652b("Failed to insert filter results (got -1). appId", om5.m14152z(str32));
                                }
                            } catch (SQLiteException e20) {
                                e = e20;
                                m3915W8.f25143a.mo3895i().m14160q().m20651c("Error storing filter results. appId", om5.m14152z(str32), e);
                                str2222 = str33;
                            }
                        } catch (SQLiteException e21) {
                            e = e21;
                        }
                        str2222 = str33;
                    }
                    return arrayList22;
                }
                emptyMap = Collections.emptyMap();
                cursor7.close();
            }
            if (cursor2.moveToFirst()) {
            }
            if (c1370g62.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
            String str22222 = str14;
            if (!list2.isEmpty()) {
            }
            String str23222 = str6;
            ArrayList arrayList222 = new ArrayList();
            Set<Integer> keySet222 = this.f28506f.keySet();
            keySet222.removeAll(this.f28505e);
            while (r2.hasNext()) {
            }
            return arrayList222;
        } catch (Throwable th9) {
            th = th9;
            Cursor cursor8 = cursor2;
            if (cursor8 != null) {
                cursor8.close();
            }
            throw th;
        }
        c1370g6 = emptyMap;
        uh2 m3915W32 = this.f19771b.m3915W();
        String str212 = this.f28504d;
        m3915W32.m13533g();
        m3915W32.mo6991f();
        ry0.m10834f(str212);
        cursor2 = m3915W32.m8168P().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str212}, null, null, null);
    }

    /* renamed from: m */
    public final st8 m8606m(Integer num) {
        if (this.f28506f.containsKey(num)) {
            return (st8) this.f28506f.get(num);
        }
        st8 st8Var = new st8(this, this.f28504d, null);
        this.f28506f.put(num, st8Var);
        return st8Var;
    }

    /* renamed from: n */
    public final boolean m8605n(int i, int i2) {
        st8 st8Var = (st8) this.f28506f.get(Integer.valueOf(i));
        if (st8Var == null) {
            return false;
        }
        return st8.m9881b(st8Var).get(i2);
    }
}
