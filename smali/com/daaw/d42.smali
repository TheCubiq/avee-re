.class public final Lcom/daaw/d42;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a([B)Ljava/util/List;
    .locals 4

    const/16 v0, 0xb

    aget-byte v0, p0, v0

    const/16 v1, 0xa

    aget-byte v1, p0, v1

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    and-int/lit16 p0, v0, 0xff

    shl-int/lit8 p0, p0, 0x8

    and-int/lit16 v0, v1, 0xff

    or-int/2addr p0, v0

    int-to-long v0, p0

    invoke-static {v0, v1}, Lcom/daaw/d42;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/d42;->c(J)[B

    move-result-object p0

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-wide/16 v0, 0xf00

    invoke-static {v0, v1}, Lcom/daaw/d42;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/d42;->c(J)[B

    move-result-object p0

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method public static b(J)J
    .locals 2

    const-wide/32 v0, 0x3b9aca00

    mul-long p0, p0, v0

    const-wide/32 v0, 0xbb80

    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static c(J)[B
    .locals 2

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0
.end method
