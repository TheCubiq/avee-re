.class public final Lcom/daaw/yv1;
.super Lcom/daaw/rg1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/yv1$a;
    }
.end annotation


# instance fields
.field public n:Lcom/daaw/yv1$a;

.field public o:I

.field public p:Z

.field public q:Lcom/daaw/zv1$d;

.field public r:Lcom/daaw/zv1$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/rg1;-><init>()V

    return-void
.end method

.method public static l(Lcom/daaw/rv0;J)V
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/rv0;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->I(I)V

    iget-object v0, p0, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p0}, Lcom/daaw/rv0;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    const-wide/16 v2, 0xff

    and-long v4, p1, v2

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v0, v1

    iget-object v0, p0, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p0}, Lcom/daaw/rv0;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    const/16 v4, 0x8

    ushr-long v4, p1, v4

    and-long/2addr v4, v2

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v0, v1

    iget-object v0, p0, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p0}, Lcom/daaw/rv0;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    const/16 v4, 0x10

    ushr-long v4, p1, v4

    and-long/2addr v4, v2

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v0, v1

    iget-object v0, p0, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p0}, Lcom/daaw/rv0;->d()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/16 v1, 0x18

    ushr-long/2addr p1, v1

    and-long/2addr p1, v2

    long-to-int p2, p1

    int-to-byte p1, p2

    aput-byte p1, v0, p0

    return-void
.end method

.method public static m(BLcom/daaw/yv1$a;)I
    .locals 2

    iget v0, p1, Lcom/daaw/yv1$a;->e:I

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/daaw/yv1;->n(BII)I

    move-result p0

    iget-object v0, p1, Lcom/daaw/yv1$a;->d:[Lcom/daaw/zv1$c;

    aget-object p0, v0, p0

    iget-boolean p0, p0, Lcom/daaw/zv1$c;->a:Z

    if-nez p0, :cond_0

    iget-object p0, p1, Lcom/daaw/yv1$a;->a:Lcom/daaw/zv1$d;

    iget p0, p0, Lcom/daaw/zv1$d;->g:I

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lcom/daaw/yv1$a;->a:Lcom/daaw/zv1$d;

    iget p0, p0, Lcom/daaw/zv1$d;->h:I

    :goto_0
    return p0
.end method

.method public static n(BII)I
    .locals 0

    shr-int/2addr p0, p2

    rsub-int/lit8 p1, p1, 0x8

    const/16 p2, 0xff

    ushr-int p1, p2, p1

    and-int/2addr p0, p1

    return p0
.end method

.method public static p(Lcom/daaw/rv0;)Z
    .locals 1

    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0, p0, v0}, Lcom/daaw/zv1;->k(ILcom/daaw/rv0;Z)Z

    move-result p0
    :try_end_0
    .catch Lcom/daaw/tv0; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public d(J)V
    .locals 4

    invoke-super {p0, p1, p2}, Lcom/daaw/rg1;->d(J)V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/yv1;->p:Z

    iget-object p1, p0, Lcom/daaw/yv1;->q:Lcom/daaw/zv1$d;

    if-eqz p1, :cond_1

    iget v0, p1, Lcom/daaw/zv1$d;->g:I

    :cond_1
    iput v0, p0, Lcom/daaw/yv1;->o:I

    return-void
.end method

.method public e(Lcom/daaw/rv0;)J
    .locals 4

    iget-object v0, p1, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    aget-byte v2, v0, v1

    const/4 v3, 0x1

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    aget-byte v0, v0, v1

    iget-object v2, p0, Lcom/daaw/yv1;->n:Lcom/daaw/yv1$a;

    invoke-static {v0, v2}, Lcom/daaw/yv1;->m(BLcom/daaw/yv1$a;)I

    move-result v0

    iget-boolean v2, p0, Lcom/daaw/yv1;->p:Z

    if-eqz v2, :cond_1

    iget v1, p0, Lcom/daaw/yv1;->o:I

    add-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x4

    :cond_1
    int-to-long v1, v1

    invoke-static {p1, v1, v2}, Lcom/daaw/yv1;->l(Lcom/daaw/rv0;J)V

    iput-boolean v3, p0, Lcom/daaw/yv1;->p:Z

    iput v0, p0, Lcom/daaw/yv1;->o:I

    return-wide v1
.end method

.method public h(Lcom/daaw/rv0;JLcom/daaw/rg1$b;)Z
    .locals 11

    iget-object p2, p0, Lcom/daaw/yv1;->n:Lcom/daaw/yv1$a;

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/yv1;->o(Lcom/daaw/rv0;)Lcom/daaw/yv1$a;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/yv1;->n:Lcom/daaw/yv1$a;

    const/4 p2, 0x1

    if-nez p1, :cond_1

    return p2

    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p0, Lcom/daaw/yv1;->n:Lcom/daaw/yv1$a;

    iget-object p1, p1, Lcom/daaw/yv1$a;->a:Lcom/daaw/zv1$d;

    iget-object p1, p1, Lcom/daaw/zv1$d;->j:[B

    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/yv1;->n:Lcom/daaw/yv1$a;

    iget-object p1, p1, Lcom/daaw/yv1$a;->c:[B

    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    const/4 v2, 0x0

    iget-object p1, p0, Lcom/daaw/yv1;->n:Lcom/daaw/yv1$a;

    iget-object p1, p1, Lcom/daaw/yv1$a;->a:Lcom/daaw/zv1$d;

    iget v3, p1, Lcom/daaw/zv1$d;->e:I

    const/4 v4, -0x1

    iget v5, p1, Lcom/daaw/zv1$d;->b:I

    iget-wide v8, p1, Lcom/daaw/zv1$d;->c:J

    long-to-int v6, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v1, "audio/vorbis"

    invoke-static/range {v0 .. v10}, Lcom/google/android/exoplayer2/Format;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    iput-object p1, p4, Lcom/daaw/rg1$b;->a:Lcom/google/android/exoplayer2/Format;

    return p2
.end method

.method public j(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/rg1;->j(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/yv1;->n:Lcom/daaw/yv1$a;

    iput-object p1, p0, Lcom/daaw/yv1;->q:Lcom/daaw/zv1$d;

    iput-object p1, p0, Lcom/daaw/yv1;->r:Lcom/daaw/zv1$b;

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/yv1;->o:I

    iput-boolean p1, p0, Lcom/daaw/yv1;->p:Z

    return-void
.end method

.method public o(Lcom/daaw/rv0;)Lcom/daaw/yv1$a;
    .locals 7

    iget-object v0, p0, Lcom/daaw/yv1;->q:Lcom/daaw/zv1$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/daaw/zv1;->i(Lcom/daaw/rv0;)Lcom/daaw/zv1$d;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/yv1;->q:Lcom/daaw/zv1$d;

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/yv1;->r:Lcom/daaw/zv1$b;

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/daaw/zv1;->h(Lcom/daaw/rv0;)Lcom/daaw/zv1$b;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/yv1;->r:Lcom/daaw/zv1$b;

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/rv0;->d()I

    move-result v0

    new-array v4, v0, [B

    iget-object v0, p1, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p1}, Lcom/daaw/rv0;->d()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/daaw/yv1;->q:Lcom/daaw/zv1$d;

    iget v0, v0, Lcom/daaw/zv1$d;->b:I

    invoke-static {p1, v0}, Lcom/daaw/zv1;->j(Lcom/daaw/rv0;I)[Lcom/daaw/zv1$c;

    move-result-object v5

    array-length p1, v5

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Lcom/daaw/zv1;->a(I)I

    move-result v6

    new-instance p1, Lcom/daaw/yv1$a;

    iget-object v2, p0, Lcom/daaw/yv1;->q:Lcom/daaw/zv1$d;

    iget-object v3, p0, Lcom/daaw/yv1;->r:Lcom/daaw/zv1$b;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/yv1$a;-><init>(Lcom/daaw/zv1$d;Lcom/daaw/zv1$b;[B[Lcom/daaw/zv1$c;I)V

    return-object p1
.end method
