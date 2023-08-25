package com.daaw;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ts8 implements xw8, yq8 {
    public final Uri b;
    public final ny6 c;
    public final os8 d;
    public final m09 e;
    public final ds4 f;
    public volatile boolean h;
    public long j;
    public m42 l;
    public boolean m;
    public final /* synthetic */ ys8 n;
    public final f42 g = new f42();
    public boolean i = true;
    public final long a = ar8.a();
    public pa6 k = g(0);

    public ts8(ys8 ys8Var, Uri uri, p46 p46Var, os8 os8Var, m09 m09Var, ds4 ds4Var) {
        this.n = ys8Var;
        this.b = uri;
        this.c = new ny6(p46Var);
        this.d = os8Var;
        this.e = m09Var;
        this.f = ds4Var;
    }

    public static /* bridge */ /* synthetic */ long b(ts8 ts8Var) {
        return ts8Var.a;
    }

    public static /* bridge */ /* synthetic */ long c(ts8 ts8Var) {
        return ts8Var.j;
    }

    public static /* bridge */ /* synthetic */ pa6 d(ts8 ts8Var) {
        return ts8Var.k;
    }

    public static /* bridge */ /* synthetic */ ny6 e(ts8 ts8Var) {
        return ts8Var.c;
    }

    public static /* bridge */ /* synthetic */ void f(ts8 ts8Var, long j, long j2) {
        ts8Var.g.a = j;
        ts8Var.j = j2;
        ts8Var.i = true;
        ts8Var.m = false;
    }

    @Override // com.daaw.yq8
    public final void a(ik5 ik5Var) {
        long y;
        long max;
        if (this.m) {
            y = this.n.y(true);
            max = Math.max(y, this.j);
        } else {
            max = this.j;
        }
        int i = ik5Var.i();
        m42 m42Var = this.l;
        Objects.requireNonNull(m42Var);
        k42.b(m42Var, ik5Var, i);
        m42Var.b(max, 1, i, 0, null);
        this.m = true;
    }

    public final pa6 g(long j) {
        Map map;
        j86 j86Var = new j86();
        j86Var.d(this.b);
        j86Var.c(j);
        j86Var.a(6);
        map = ys8.a0;
        j86Var.b(map);
        return j86Var.e();
    }

    @Override // com.daaw.xw8
    public final void zzg() {
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0084 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009a A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00b0 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c6 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00e2 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0117 A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x012b A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x016b A[Catch: all -> 0x01ec, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0174 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #6 {all -> 0x01ec, blocks: (B:137:0x000b, B:139:0x001f, B:140:0x0025, B:143:0x003b, B:144:0x0041, B:154:0x0079, B:156:0x0084, B:158:0x0090, B:160:0x009a, B:162:0x00a6, B:164:0x00b0, B:166:0x00bc, B:168:0x00c6, B:170:0x00d8, B:172:0x00e2, B:173:0x00e8, B:183:0x0117, B:184:0x011e, B:186:0x012b, B:188:0x0133, B:190:0x0150, B:192:0x016b, B:193:0x0170, B:195:0x0174, B:176:0x00f0, B:180:0x0107, B:148:0x004b, B:152:0x0065), top: B:249:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01ca A[SYNTHETIC] */
    @Override // com.daaw.xw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ts8.zzh():void");
    }
}
