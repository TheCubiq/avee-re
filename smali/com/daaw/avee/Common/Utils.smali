.class public Lcom/daaw/avee/Common/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# static fields
.field public static final DEBUG_BUILD:Z = false

.field public static final PRE_Q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/daaw/avee/Common/Utils;->PRE_Q:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IndexToString([Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    if-ltz p1, :cond_0

    .line 194
    array-length v0, p0

    if-le v0, p1, :cond_0

    .line 195
    aget-object p0, p0, p1

    return-object p0

    :cond_0
    return-object p2
.end method

.method public static IsOdd(I)Z
    .locals 0

    .line 253
    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static IsPowerOfTwo(J)Z
    .locals 3

    const-wide/16 v0, 0x1

    sub-long v0, p0, v0

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static SignNonZern(F)F
    .locals 1

    const/4 v0, 0x0

    cmpg-float p0, p0, v0

    if-gez p0, :cond_0

    const/high16 p0, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_0
    return p0
.end method

.method public static StringToIndex([Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const/4 v0, -0x1

    .line 176
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/Common/Utils;->StringToIndex([Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static StringToIndex([Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    const/4 v0, 0x0

    .line 182
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 183
    aget-object v1, p0, v0

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move p2, v0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static compareNullEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)Z"
        }
    .end annotation

    if-nez p0, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    if-eqz p0, :cond_2

    .line 171
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-nez p0, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    if-eqz p0, :cond_2

    .line 166
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static disposeSafe(Lcom/daaw/avee/Common/IDisposable;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/avee/Common/IDisposable;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 23
    invoke-interface {p0}, Lcom/daaw/avee/Common/IDisposable;->dispose()V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ensureRange(FFF)F
    .locals 0

    .line 36
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {p0, p2}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method public static ensureRange(III)I
    .locals 0

    .line 32
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static fixIncludedNullTerminatorString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 160
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_0

    return-object p0

    .line 162
    :cond_0
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getAppVersionName()Ljava/lang/String;
    .locals 1

    const-string v0, "1.2.101"

    return-object v0
.end method

.method public static getDurationStringHHMMSS(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 201
    invoke-static {p0, v0}, Lcom/daaw/avee/Common/Utils;->getDurationStringHHMMSS(IZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getDurationStringHHMMSS(IZ)Ljava/lang/String;
    .locals 3

    .line 210
    div-int/lit16 v0, p0, 0xe10

    .line 211
    rem-int/lit16 v1, p0, 0xe10

    div-int/lit8 v1, v1, 0x3c

    .line 212
    rem-int/lit8 p0, p0, 0x3c

    const-string v2, ":"

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    .line 215
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->twoDigitString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->twoDigitString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 217
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lcom/daaw/avee/Common/Utils;->twoDigitString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->twoDigitString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->twoDigitString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getDurationStringHMSS(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 205
    invoke-static {p0, v0}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(IZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getDurationStringHMSS(IZ)Ljava/lang/String;
    .locals 3

    .line 222
    div-int/lit16 v0, p0, 0xe10

    .line 223
    rem-int/lit16 v1, p0, 0xe10

    div-int/lit8 v1, v1, 0x3c

    .line 224
    rem-int/lit8 p0, p0, 0x3c

    const-string v2, ":"

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    .line 227
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->twoDigitString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 229
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->twoDigitString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getListTupleObj1ToArray(Ljava/util/List;)[Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 355
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 359
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/Common/Tuple2;

    iget-object v3, v3, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static getListTupleObj2ToArray(Ljava/util/List;)[Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 367
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 371
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/Common/Tuple2;

    iget-object v3, v3, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static int0(I)B
    .locals 0

    int-to-byte p0, p0

    return p0
.end method

.method public static int1(I)B
    .locals 0

    shr-int/lit8 p0, p0, 0x8

    int-to-byte p0, p0

    return p0
.end method

.method public static int2(I)B
    .locals 0

    shr-int/lit8 p0, p0, 0x10

    int-to-byte p0, p0

    return p0
.end method

.method public static int3(I)B
    .locals 0

    shr-int/lit8 p0, p0, 0x18

    int-to-byte p0, p0

    return p0
.end method

.method public static intToHexString(I)Ljava/lang/String;
    .locals 0

    .line 258
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static lerpHsla([F[F[FF)V
    .locals 4

    const/4 v0, 0x0

    .line 245
    aget v1, p0, v0

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, p3

    mul-float v1, v1, v2

    aget v3, p1, v0

    mul-float v3, v3, p3

    add-float/2addr v1, v3

    aput v1, p2, v0

    const/4 v0, 0x1

    .line 246
    aget v1, p0, v0

    mul-float v1, v1, v2

    aget v3, p1, v0

    mul-float v3, v3, p3

    add-float/2addr v1, v3

    aput v1, p2, v0

    const/4 v0, 0x2

    .line 247
    aget v1, p0, v0

    mul-float v1, v1, v2

    aget v3, p1, v0

    mul-float v3, v3, p3

    add-float/2addr v1, v3

    aput v1, p2, v0

    const/4 v0, 0x3

    .line 248
    aget p0, p0, v0

    mul-float p0, p0, v2

    aget p1, p1, v0

    mul-float p1, p1, p3

    add-float/2addr p0, p1

    aput p0, p2, v0

    return-void
.end method

.method public static pow2roundup(II)I
    .locals 1

    if-gez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    shr-int/lit8 v0, p0, 0x1

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x2

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x4

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x8

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x10

    or-int/2addr p0, v0

    add-int/lit8 p0, p0, 0x1

    .line 55
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static putFloatB([BIF)V
    .locals 0

    .line 292
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/Common/Utils;->putIntB([BII)V

    return-void
.end method

.method public static putFloatL([BIF)V
    .locals 0

    .line 296
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/Common/Utils;->putIntL([BII)V

    return-void
.end method

.method public static putIntB([BII)V
    .locals 2

    .line 300
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int3(I)B

    move-result v0

    aput-byte v0, p0, p1

    add-int/lit8 v0, p1, 0x1

    .line 301
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int2(I)B

    move-result v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, p1, 0x2

    .line 302
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int1(I)B

    move-result v1

    aput-byte v1, p0, v0

    add-int/lit8 p1, p1, 0x3

    .line 303
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int0(I)B

    move-result p2

    aput-byte p2, p0, p1

    return-void
.end method

.method public static putIntL([BII)V
    .locals 2

    add-int/lit8 v0, p1, 0x3

    .line 307
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int3(I)B

    move-result v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, p1, 0x2

    .line 308
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int2(I)B

    move-result v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, p1, 0x1

    .line 309
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int1(I)B

    move-result v1

    aput-byte v1, p0, v0

    .line 310
    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->int0(I)B

    move-result p2

    aput-byte p2, p0, p1

    return-void
.end method

.method public static strToBoolSafe(Ljava/lang/String;Z)Z
    .locals 3

    if-eqz p0, :cond_3

    .line 115
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 117
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x74

    if-eq v0, v2, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x54

    if-eq v0, v2, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x31

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1

    :cond_3
    :goto_1
    return p1
.end method

.method public static strToFloatSafe(Ljava/lang/String;)F
    .locals 1

    const/4 v0, 0x0

    .line 147
    invoke-static {p0, v0}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result p0

    return p0
.end method

.method public static strToFloatSafe(Ljava/lang/String;F)F
    .locals 0

    if-nez p0, :cond_0

    return p1

    .line 153
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p1
.end method

.method public static strToIntSafe(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 134
    invoke-static {p0, v0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static strToIntSafe(Ljava/lang/String;I)I
    .locals 0

    if-nez p0, :cond_0

    return p1

    .line 140
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return p1
.end method

.method public static strToLongSafe(Ljava/lang/String;)J
    .locals 2

    const-wide/16 v0, 0x0

    .line 121
    invoke-static {p0, v0, v1}, Lcom/daaw/avee/Common/Utils;->strToLongSafe(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static strToLongSafe(Ljava/lang/String;J)J
    .locals 0

    if-nez p0, :cond_0

    return-wide p1

    .line 127
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    return-wide p1
.end method

.method public static strToStrSafe(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 109
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public static stringSplitInTwo(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    const-string v1, ""

    const/4 v2, 0x0

    if-nez p0, :cond_0

    .line 61
    aput-object v1, p2, v2

    .line 62
    aput-object v1, p2, v0

    return-void

    .line 66
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_1

    .line 68
    aput-object v1, p2, v2

    .line 69
    aput-object v1, p2, v0

    return-void

    .line 72
    :cond_1
    invoke-virtual {p0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, v2

    add-int/2addr p1, v0

    .line 73
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, p2, v0

    return-void
.end method

.method public static stringSplitInTwo(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    const-string v1, ""

    const/4 v2, 0x0

    if-nez p0, :cond_0

    .line 79
    aput-object v1, p2, v2

    .line 80
    aput-object v1, p2, v0

    return-void

    .line 84
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-gez v3, :cond_1

    .line 86
    aput-object v1, p2, v2

    .line 87
    aput-object v1, p2, v0

    return-void

    .line 90
    :cond_1
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, v2

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr v3, p1

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    aput-object p0, p2, v0

    return-void
.end method

.method public static stringSplitInTwoGetSecond(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    return-object p2

    .line 100
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-gez p1, :cond_1

    return-object p2

    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 105
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static tickCount()J
    .locals 2

    .line 28
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static tryExtractPrettyNameFromUri(Landroid/net/Uri;)Ljava/lang/String;
    .locals 5

    .line 263
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    .line 264
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "."

    .line 266
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_0

    add-int/lit8 v1, v0, -0x1

    :cond_0
    const/16 v2, 0x2f

    .line 268
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    .line 269
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    if-gez v1, :cond_1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v0, 0x1

    :cond_1
    const/4 v0, 0x0

    .line 274
    :try_start_0
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 275
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, p0

    :catch_0
    :goto_0
    return-object v0
.end method

.method private static twoDigitString(I)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, "00"

    return-object p0

    .line 237
    :cond_0
    div-int/lit8 v0, p0, 0xa

    if-nez v0, :cond_1

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 240
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
