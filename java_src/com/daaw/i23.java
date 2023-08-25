package com.daaw;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public final class i23 {

    /* renamed from: a */
    public final u13 f13197a;

    /* renamed from: b */
    public final int f13198b;

    /* renamed from: c */
    public String f13199c;

    /* renamed from: d */
    public final int f13200d;

    public i23(int i, int i2, int i3) {
        this.f13198b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : 64;
        if (i3 <= 0) {
            this.f13200d = 1;
        } else {
            this.f13200d = i3;
        }
        this.f13197a = new g23(i2);
    }

    /* renamed from: a */
    public final String m20168a(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new h23(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((t13) arrayList2.get(i)).m9651e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                        z = true;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z = true;
                            }
                            i2++;
                        }
                        String sb2 = z ? sb.toString() : null;
                        if (sb2 != null) {
                            this.f13199c = sb2;
                            str = sb2;
                        }
                    }
                    String[] m26521b = b23.m26521b(str, true);
                    if (m26521b.length >= this.f13200d) {
                        for (int i5 = 0; i5 < m26521b.length; i5++) {
                            String str2 = "";
                            for (int i6 = 0; i6 < this.f13200d; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= m26521b.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(m26521b[i7]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.f13198b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f13198b) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        z13 z13Var = new z13();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                z13Var.f34332b.write(this.f13197a.mo8635b((String) it.next()));
            } catch (IOException e) {
                k04.zzh("Error while writing hash to byteStream", e);
            }
        }
        return z13Var.toString();
    }
}
