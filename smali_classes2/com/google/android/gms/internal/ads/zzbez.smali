.class public final Lcom/google/android/gms/internal/ads/zzbez;
.super Ljava/lang/Object;


# instance fields
.field private final buffer:[B

.field private zzdpx:I

.field private zzdpy:I

.field private zzdpz:I

.field private zzdqe:I

.field private zzdqg:I

.field private zzdqh:I

.field private final zzebf:I

.field private final zzebg:I

.field private zzebh:I

.field private zzebi:I


# direct methods
.method private constructor <init>([BII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqh:I

    const/16 v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpy:I

    const/high16 v0, 0x4000000

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpz:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->buffer:[B

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebf:I

    add-int/2addr p3, p2

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebg:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    return-void
.end method

.method private final zzacg()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqe:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqh:I

    if-le v0, v1, :cond_0

    sub-int v1, v0, v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqe:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqe:I

    return-void
.end method

.method private final zzach()B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->buffer:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    aget-byte v0, v1, v0

    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagq()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object v0

    throw v0
.end method

.method private final zzbt(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ltz p1, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    add-int v1, v0, p1

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqh:I

    if-gt v1, v2, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    sub-int/2addr v1, v0

    if-gt p1, v1, :cond_0

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagq()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object p1

    throw p1

    :cond_1
    sub-int/2addr v2, v0

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzbez;->zzbt(I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagq()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagr()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object p1

    throw p1
.end method

.method public static zzi([BII)Lcom/google/android/gms/internal/ads/zzbez;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbez;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0, p2}, Lcom/google/android/gms/internal/ads/zzbez;-><init>([BII)V

    return-object p1
.end method


# virtual methods
.method public final getPosition()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebf:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final readBytes()[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    if-ltz v0, :cond_2

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbfl;->zzecf:[B

    return-object v0

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_1

    new-array v1, v0, [B

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbez;->buffer:[B

    const/4 v4, 0x0

    invoke-static {v3, v2, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    return-object v1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagq()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object v0

    throw v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagr()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object v0

    throw v0
.end method

.method public final readString()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    if-ltz v0, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->buffer:[B

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    sget-object v4, Lcom/google/android/gms/internal/ads/zzbfg;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    return-object v1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagq()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object v0

    throw v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagr()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object v0

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzbfi;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpx:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpy:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzbr(I)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpx:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpx:I

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzbfi;->zza(Lcom/google/android/gms/internal/ads/zzbez;)Lcom/google/android/gms/internal/ads/zzbfi;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzbp(I)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpx:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdpx:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzbs(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbfh;

    const-string v0, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzbfh;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzab(II)[B
    .locals 3

    if-nez p2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbfl;->zzecf:[B

    return-object p1

    :cond_0
    new-array v0, p2, [B

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebf:I

    add-int/2addr v1, p1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->buffer:[B

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public final zzabk()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebh:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqg:I

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqg:I

    if-eqz v0, :cond_1

    return v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbfh;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbfh;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzabm()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacd()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzabn()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    return v0
.end method

.method public final zzabq()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzac(II)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebf:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_1

    if-ltz p1, :cond_0

    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqg:I

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const/16 v0, 0x18

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Bad position "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebf:I

    sub-int/2addr v0, v1

    const/16 v1, 0x32

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Position "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is beyond current "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final zzacc()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    and-int/lit8 v0, v0, 0x7f

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    move-result v1

    if-ltz v1, :cond_1

    shl-int/lit8 v1, v1, 0x7

    :goto_0
    or-int/2addr v0, v1

    goto :goto_2

    :cond_1
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    move-result v1

    if-ltz v1, :cond_2

    shl-int/lit8 v1, v1, 0xe

    goto :goto_0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    move-result v1

    if-ltz v1, :cond_3

    shl-int/lit8 v1, v1, 0x15

    goto :goto_0

    :cond_3
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    move-result v1

    shl-int/lit8 v2, v1, 0x1c

    or-int/2addr v0, v2

    if-gez v1, :cond_6

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_5

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    move-result v2

    if-ltz v2, :cond_4

    return v0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzags()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object v0

    throw v0

    :cond_6
    :goto_2
    return v0
.end method

.method public final zzacd()J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v0, v3, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v0

    or-long/2addr v1, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v1

    :cond_0
    add-int/lit8 v0, v0, 0x7

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzags()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object v0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final zzagn()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqh:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final zzbp(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzbfh;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqg:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbfh;

    const-string v0, "Protocol message end-group tag did not match expected tag."

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzbfh;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzbq(I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v1, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v2, 0x4

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    return v1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbfh;

    const-string v0, "Protocol message tag had invalid wire type."

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzbfh;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzabk()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzbq(I)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_3
    ushr-int/2addr p1, v3

    shl-int/2addr p1, v3

    or-int/2addr p1, v2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzbp(I)V

    return v1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzbt(I)V

    return v1

    :cond_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzach()B

    return v1

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    return v1
.end method

.method public final zzbr(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzbfh;
        }
    .end annotation

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzebi:I

    add-int/2addr p1, v0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqh:I

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqh:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacg()V

    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagq()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbfh;->zzagr()Lcom/google/android/gms/internal/ads/zzbfh;

    move-result-object p1

    throw p1
.end method

.method public final zzbs(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqh:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzacg()V

    return-void
.end method

.method public final zzdc(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzdqg:I

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzac(II)V

    return-void
.end method
