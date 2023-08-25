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
    public final u13 a;
    public final int b;
    public String c;
    public final int d;

    public i23(int i, int i2, int i3) {
        this.b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : 64;
        if (i3 <= 0) {
            this.d = 1;
        } else {
            this.d = i3;
        }
        this.a = new g23(i2);
    }

    public final String a(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new h23(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((t13) arrayList2.get(i)).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
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
                            this.c = sb2;
                            str = sb2;
                        }
                    }
                    String[] b = b23.b(str, true);
                    if (b.length >= this.d) {
                        for (int i5 = 0; i5 < b.length; i5++) {
                            String str2 = "";
                            for (int i6 = 0; i6 < this.d; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= b.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(b[i7]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.b) {
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
                z13Var.b.write(this.a.b((String) it.next()));
            } catch (IOException e) {
                k04.zzh("Error while writing hash to byteStream", e);
            }
        }
        return z13Var.toString();
    }
}
