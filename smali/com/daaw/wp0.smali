.class public Lcom/daaw/wp0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/wp0$a;,
        Lcom/daaw/wp0$c;,
        Lcom/daaw/wp0$b;
    }
.end annotation


# direct methods
.method public static a(Lcom/daaw/wp0$c;)Lcom/daaw/wp0$b;
    .locals 12

    const/4 v0, 0x4

    invoke-interface {p0, v0}, Lcom/daaw/wp0$c;->a(I)V

    invoke-interface {p0}, Lcom/daaw/wp0$c;->b()I

    move-result v1

    const-string v2, "Cannot read metadata."

    const/16 v3, 0x64

    if-gt v1, v3, :cond_5

    const/4 v3, 0x6

    invoke-interface {p0, v3}, Lcom/daaw/wp0$c;->a(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-wide/16 v5, -0x1

    if-ge v4, v1, :cond_1

    invoke-interface {p0}, Lcom/daaw/wp0$c;->c()I

    move-result v7

    invoke-interface {p0, v0}, Lcom/daaw/wp0$c;->a(I)V

    invoke-interface {p0}, Lcom/daaw/wp0$c;->d()J

    move-result-wide v8

    invoke-interface {p0, v0}, Lcom/daaw/wp0$c;->a(I)V

    const v10, 0x6d657461

    if-ne v10, v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-wide v8, v5

    :goto_1
    cmp-long v0, v8, v5

    if-eqz v0, :cond_4

    invoke-interface {p0}, Lcom/daaw/wp0$c;->getPosition()J

    move-result-wide v0

    sub-long v0, v8, v0

    long-to-int v1, v0

    invoke-interface {p0, v1}, Lcom/daaw/wp0$c;->a(I)V

    const/16 v0, 0xc

    invoke-interface {p0, v0}, Lcom/daaw/wp0$c;->a(I)V

    invoke-interface {p0}, Lcom/daaw/wp0$c;->d()J

    move-result-wide v0

    :goto_2
    int-to-long v4, v3

    cmp-long v6, v4, v0

    if-gez v6, :cond_4

    invoke-interface {p0}, Lcom/daaw/wp0$c;->c()I

    move-result v4

    invoke-interface {p0}, Lcom/daaw/wp0$c;->d()J

    move-result-wide v5

    invoke-interface {p0}, Lcom/daaw/wp0$c;->d()J

    move-result-wide v10

    const v7, 0x456d6a69

    if-eq v7, v4, :cond_3

    const v7, 0x656d6a69

    if-ne v7, v4, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    new-instance p0, Lcom/daaw/wp0$b;

    add-long/2addr v5, v8

    invoke-direct {p0, v5, v6, v10, v11}, Lcom/daaw/wp0$b;-><init>(JJ)V

    return-object p0

    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :goto_4
    throw p0

    :goto_5
    goto :goto_4
.end method

.method public static b(Ljava/nio/ByteBuffer;)Lcom/daaw/vp0;
    .locals 2

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    new-instance v0, Lcom/daaw/wp0$a;

    invoke-direct {v0, p0}, Lcom/daaw/wp0$a;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-static {v0}, Lcom/daaw/wp0;->a(Lcom/daaw/wp0$c;)Lcom/daaw/wp0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/wp0$b;->a()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {p0}, Lcom/daaw/vp0;->h(Ljava/nio/ByteBuffer;)Lcom/daaw/vp0;

    move-result-object p0

    return-object p0
.end method

.method public static c(I)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public static d(S)I
    .locals 1

    const v0, 0xffff

    and-int/2addr p0, v0

    return p0
.end method
