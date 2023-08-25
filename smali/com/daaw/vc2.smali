.class public final Lcom/daaw/vc2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/cr5;

.field public final b:Lcom/daaw/ik5;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:J

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/cr5;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/cr5;-><init>(J)V

    iput-object v0, p0, Lcom/daaw/vc2;->a:Lcom/daaw/cr5;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/vc2;->f:J

    iput-wide v0, p0, Lcom/daaw/vc2;->g:J

    iput-wide v0, p0, Lcom/daaw/vc2;->h:J

    new-instance v0, Lcom/daaw/ik5;

    invoke-direct {v0}, Lcom/daaw/ik5;-><init>()V

    iput-object v0, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    return-void
.end method

.method public static c(Lcom/daaw/ik5;)J
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->k()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik5;->i()I

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v5, 0x9

    if-ge v2, v5, :cond_0

    return-wide v3

    :cond_0
    new-array v2, v5, [B

    const/4 v6, 0x0

    invoke-virtual {v0, v2, v6, v5}, Lcom/daaw/ik5;->b([BII)V

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->f(I)V

    aget-byte v0, v2, v6

    and-int/lit16 v0, v0, 0xc4

    const/16 v1, 0x44

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    aget-byte v1, v2, v0

    const/4 v5, 0x4

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_2

    aget-byte v1, v2, v5

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_2

    const/4 v1, 0x5

    aget-byte v7, v2, v1

    const/4 v8, 0x1

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_2

    const/16 v7, 0x8

    aget-byte v7, v2, v7

    const/4 v9, 0x3

    and-int/2addr v7, v9

    if-ne v7, v9, :cond_2

    aget-byte v3, v2, v6

    int-to-long v3, v3

    aget-byte v6, v2, v8

    aget-byte v0, v2, v0

    int-to-long v7, v0

    const-wide/16 v10, 0x38

    and-long/2addr v10, v3

    shr-long/2addr v10, v9

    const/16 v0, 0x1e

    shl-long/2addr v10, v0

    const-wide/16 v12, 0x3

    and-long/2addr v3, v12

    const/16 v0, 0x1c

    shl-long/2addr v3, v0

    or-long/2addr v3, v10

    int-to-long v10, v6

    const-wide/16 v14, 0xff

    and-long/2addr v10, v14

    const/16 v0, 0x14

    shl-long/2addr v10, v0

    or-long/2addr v3, v10

    const-wide/16 v10, 0xf8

    and-long v16, v7, v10

    shr-long v16, v16, v9

    const/16 v0, 0xf

    shl-long v16, v16, v0

    or-long v3, v3, v16

    and-long/2addr v7, v12

    const/16 v0, 0xd

    shl-long v6, v7, v0

    or-long/2addr v3, v6

    aget-byte v0, v2, v9

    int-to-long v6, v0

    and-long/2addr v6, v14

    shl-long v0, v6, v1

    or-long/2addr v0, v3

    aget-byte v2, v2, v5

    int-to-long v2, v2

    and-long/2addr v2, v10

    shr-long/2addr v2, v9

    or-long/2addr v0, v2

    return-wide v0

    :cond_2
    :goto_0
    return-wide v3
.end method

.method public static final g([BI)I
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 12

    iget-boolean v0, p0, Lcom/daaw/vc2;->e:Z

    const/16 v1, 0x1ba

    const-wide/16 v2, 0x4e20

    const/4 v4, 0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    if-nez v0, :cond_3

    invoke-interface {p1}, Lcom/daaw/k09;->zzd()J

    move-result-wide v8

    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    int-to-long v2, v0

    sub-long/2addr v8, v2

    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v2

    cmp-long v10, v2, v8

    if-eqz v10, :cond_0

    iput-wide v8, p2, Lcom/daaw/f42;->a:J

    goto :goto_2

    :cond_0
    iget-object p2, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v0}, Lcom/daaw/ik5;->c(I)V

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    iget-object p2, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, p2, v7, v0, v7}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object p1, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    invoke-virtual {p1}, Lcom/daaw/ik5;->k()I

    move-result p2

    invoke-virtual {p1}, Lcom/daaw/ik5;->l()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    :goto_0
    if-lt v0, p2, :cond_2

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    invoke-static {v2, v0}, Lcom/daaw/vc2;->g([BI)I

    move-result v2

    if-ne v2, v1, :cond_1

    add-int/lit8 v2, v0, 0x4

    invoke-virtual {p1, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-static {p1}, Lcom/daaw/vc2;->c(Lcom/daaw/ik5;)J

    move-result-wide v2

    cmp-long v8, v2, v5

    if-eqz v8, :cond_1

    move-wide v5, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput-wide v5, p0, Lcom/daaw/vc2;->g:J

    iput-boolean v4, p0, Lcom/daaw/vc2;->e:Z

    const/4 v4, 0x0

    :goto_2
    return v4

    :cond_3
    iget-wide v8, p0, Lcom/daaw/vc2;->g:J

    cmp-long v0, v8, v5

    if-nez v0, :cond_4

    invoke-virtual {p0, p1}, Lcom/daaw/vc2;->f(Lcom/daaw/k09;)I

    return v7

    :cond_4
    iget-boolean v0, p0, Lcom/daaw/vc2;->d:Z

    const-wide/16 v8, 0x0

    if-nez v0, :cond_8

    invoke-interface {p1}, Lcom/daaw/k09;->zzd()J

    move-result-wide v10

    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v2

    cmp-long v10, v2, v8

    if-eqz v10, :cond_5

    iput-wide v8, p2, Lcom/daaw/f42;->a:J

    goto :goto_5

    :cond_5
    iget-object p2, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2, v0}, Lcom/daaw/ik5;->c(I)V

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    iget-object p2, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, p2, v7, v0, v7}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object p1, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    invoke-virtual {p1}, Lcom/daaw/ik5;->k()I

    move-result p2

    invoke-virtual {p1}, Lcom/daaw/ik5;->l()I

    move-result v0

    :goto_3
    add-int/lit8 v2, v0, -0x3

    if-ge p2, v2, :cond_7

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    invoke-static {v2, p2}, Lcom/daaw/vc2;->g([BI)I

    move-result v2

    if-ne v2, v1, :cond_6

    add-int/lit8 v2, p2, 0x4

    invoke-virtual {p1, v2}, Lcom/daaw/ik5;->f(I)V

    invoke-static {p1}, Lcom/daaw/vc2;->c(Lcom/daaw/ik5;)J

    move-result-wide v2

    cmp-long v8, v2, v5

    if-eqz v8, :cond_6

    move-wide v5, v2

    goto :goto_4

    :cond_6
    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    iput-wide v5, p0, Lcom/daaw/vc2;->f:J

    iput-boolean v4, p0, Lcom/daaw/vc2;->d:Z

    const/4 v4, 0x0

    :goto_5
    return v4

    :cond_8
    iget-wide v0, p0, Lcom/daaw/vc2;->f:J

    cmp-long p2, v0, v5

    if-nez p2, :cond_9

    invoke-virtual {p0, p1}, Lcom/daaw/vc2;->f(Lcom/daaw/k09;)I

    return v7

    :cond_9
    iget-object p2, p0, Lcom/daaw/vc2;->a:Lcom/daaw/cr5;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/cr5;->b(J)J

    move-result-wide v0

    iget-object p2, p0, Lcom/daaw/vc2;->a:Lcom/daaw/cr5;

    iget-wide v2, p0, Lcom/daaw/vc2;->g:J

    invoke-virtual {p2, v2, v3}, Lcom/daaw/cr5;->b(J)J

    move-result-wide v2

    sub-long/2addr v2, v0

    iput-wide v2, p0, Lcom/daaw/vc2;->h:J

    cmp-long p2, v2, v8

    if-gez p2, :cond_a

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid duration: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ". Using TIME_UNSET instead."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "PsDurationReader"

    invoke-static {v0, p2}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-wide v5, p0, Lcom/daaw/vc2;->h:J

    :cond_a
    invoke-virtual {p0, p1}, Lcom/daaw/vc2;->f(Lcom/daaw/k09;)I

    return v7
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/vc2;->h:J

    return-wide v0
.end method

.method public final d()Lcom/daaw/cr5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vc2;->a:Lcom/daaw/cr5;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/vc2;->c:Z

    return v0
.end method

.method public final f(Lcom/daaw/k09;)I
    .locals 3

    iget-object v0, p0, Lcom/daaw/vc2;->b:Lcom/daaw/ik5;

    sget-object v1, Lcom/daaw/it5;->f:[B

    array-length v2, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ik5;->d([BI)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/vc2;->c:Z

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    return v2
.end method
