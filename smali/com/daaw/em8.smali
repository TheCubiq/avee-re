.class public final Lcom/daaw/em8;
.super Lcom/daaw/hp8;
.source ""

# interfaces
.implements Lcom/daaw/g78;


# instance fields
.field public final Q0:Landroid/content/Context;

.field public final R0:Lcom/daaw/dj8;

.field public final S0:Lcom/daaw/rj8;

.field public T0:I

.field public U0:Z

.field public V0:Lcom/daaw/f92;

.field public W0:J

.field public X0:Z

.field public Y0:Z

.field public Z0:Z

.field public a1:Lcom/daaw/f98;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ap8;Lcom/daaw/jp8;ZLandroid/os/Handler;Lcom/daaw/fj8;Lcom/daaw/rj8;)V
    .locals 6

    const/4 v1, 0x1

    const/4 v4, 0x0

    const v5, 0x472c4400    # 44100.0f

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/hp8;-><init>(ILcom/daaw/ap8;Lcom/daaw/jp8;ZF)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/em8;->Q0:Landroid/content/Context;

    iput-object p7, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    new-instance p1, Lcom/daaw/dj8;

    invoke-direct {p1, p5, p6}, Lcom/daaw/dj8;-><init>(Landroid/os/Handler;Lcom/daaw/fj8;)V

    iput-object p1, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    new-instance p1, Lcom/daaw/cm8;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/daaw/cm8;-><init>(Lcom/daaw/em8;Lcom/daaw/am8;)V

    invoke-interface {p7, p1}, Lcom/daaw/rj8;->m(Lcom/daaw/lj8;)V

    return-void
.end method

.method private final u0()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-virtual {p0}, Lcom/daaw/hp8;->zzM()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/daaw/rj8;->e(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-boolean v2, p0, Lcom/daaw/em8;->Y0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lcom/daaw/em8;->W0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lcom/daaw/em8;->W0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/em8;->Y0:Z

    :cond_1
    return-void
.end method

.method public static bridge synthetic w0(Lcom/daaw/em8;)Lcom/daaw/f98;
    .locals 0

    iget-object p0, p0, Lcom/daaw/em8;->a1:Lcom/daaw/f98;

    return-object p0
.end method

.method public static bridge synthetic x0(Lcom/daaw/em8;)Lcom/daaw/dj8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    return-object p0
.end method

.method public static z0(Lcom/daaw/jp8;Lcom/daaw/f92;ZLcom/daaw/rj8;)Ljava/util/List;
    .locals 0

    iget-object p0, p1, Lcom/daaw/f92;->l:Ljava/lang/String;

    if-nez p0, :cond_0

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p3, p1}, Lcom/daaw/rj8;->h(Lcom/daaw/f92;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/daaw/hq8;->d()Lcom/daaw/ep8;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const/4 p2, 0x0

    invoke-static {p0, p2, p2}, Lcom/daaw/hq8;->f(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    invoke-static {p1}, Lcom/daaw/hq8;->e(Lcom/daaw/f92;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-static {p0}, Lcom/daaw/y17;->s(Ljava/util/Collection;)Lcom/daaw/y17;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p1, p2, p2}, Lcom/daaw/hq8;->f(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lcom/daaw/y17;->o()Lcom/daaw/v17;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/daaw/v17;->g(Ljava/lang/Iterable;)Lcom/daaw/v17;

    invoke-virtual {p2, p1}, Lcom/daaw/v17;->g(Ljava/lang/Iterable;)Lcom/daaw/v17;

    invoke-virtual {p2}, Lcom/daaw/v17;->h()Lcom/daaw/y17;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Lcom/daaw/hp8;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lcom/daaw/em8;->Z0:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/daaw/em8;->Z0:Z

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzj()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    iget-boolean v2, p0, Lcom/daaw/em8;->Z0:Z

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v0, p0, Lcom/daaw/em8;->Z0:Z

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzj()V

    :goto_0
    throw v1
.end method

.method public final B()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzh()V

    return-void
.end method

.method public final C()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/em8;->u0()V

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzg()V

    return-void
.end method

.method public final E(FLcom/daaw/f92;[Lcom/daaw/f92;)F
    .locals 4

    array-length p2, p3

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    iget v3, v3, Lcom/daaw/f92;->z:I

    if-eq v3, v0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ne v2, v0, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    return p1

    :cond_2
    int-to-float p2, v2

    mul-float p2, p2, p1

    return p2
.end method

.method public final F(Lcom/daaw/jp8;Lcom/daaw/f92;)I
    .locals 9

    iget-object v0, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ak3;->g(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x80

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget v0, Lcom/daaw/it5;->a:I

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-lt v0, v2, :cond_1

    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v2, p2, Lcom/daaw/f92;->E:I

    invoke-static {p2}, Lcom/daaw/hp8;->r0(Lcom/daaw/f92;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v5, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v5, p2}, Lcom/daaw/rj8;->h(Lcom/daaw/f92;)Z

    move-result v5

    if-eqz v5, :cond_3

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/daaw/hq8;->d()Lcom/daaw/ep8;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    or-int/lit16 p1, v0, 0x8c

    return p1

    :cond_3
    :goto_1
    iget-object v2, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v5, "audio/raw"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/16 v5, 0x81

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v2, p2}, Lcom/daaw/rj8;->h(Lcom/daaw/f92;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    return v5

    :cond_5
    :goto_2
    iget-object v2, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    const/4 v6, 0x2

    iget v7, p2, Lcom/daaw/f92;->y:I

    iget v8, p2, Lcom/daaw/f92;->z:I

    invoke-static {v6, v7, v8}, Lcom/daaw/it5;->f(III)Lcom/daaw/f92;

    move-result-object v6

    invoke-interface {v2, v6}, Lcom/daaw/rj8;->h(Lcom/daaw/f92;)Z

    move-result v2

    if-nez v2, :cond_6

    return v5

    :cond_6
    iget-object v2, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-static {p1, p2, v3, v2}, Lcom/daaw/em8;->z0(Lcom/daaw/jp8;Lcom/daaw/f92;ZLcom/daaw/rj8;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    return v5

    :cond_7
    if-nez v4, :cond_8

    const/16 p1, 0x82

    return p1

    :cond_8
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ep8;

    invoke-virtual {v2, p2}, Lcom/daaw/ep8;->d(Lcom/daaw/f92;)Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_a

    const/4 v6, 0x1

    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_a

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/ep8;

    invoke-virtual {v7, p2}, Lcom/daaw/ep8;->d(Lcom/daaw/f92;)Z

    move-result v8

    if-eqz v8, :cond_9

    move-object v2, v7

    const/4 p1, 0x0

    const/4 v4, 0x1

    goto :goto_4

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_a
    const/4 p1, 0x1

    :goto_4
    if-eq v5, v4, :cond_b

    const/4 v6, 0x3

    goto :goto_5

    :cond_b
    const/4 v6, 0x4

    :goto_5
    const/16 v7, 0x8

    if-eqz v4, :cond_c

    invoke-virtual {v2, p2}, Lcom/daaw/ep8;->e(Lcom/daaw/f92;)Z

    move-result p2

    if-eqz p2, :cond_c

    const/16 v7, 0x10

    :cond_c
    iget-boolean p2, v2, Lcom/daaw/ep8;->g:Z

    if-eq v5, p2, :cond_d

    const/4 p2, 0x0

    goto :goto_6

    :cond_d
    const/16 p2, 0x40

    :goto_6
    if-eq v5, p1, :cond_e

    const/4 v1, 0x0

    :cond_e
    or-int p1, v6, v7

    or-int/2addr p1, v0

    or-int/2addr p1, p2

    or-int/2addr p1, v1

    return p1
.end method

.method public final G(Lcom/daaw/ep8;Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;
    .locals 9

    invoke-virtual {p1, p2, p3}, Lcom/daaw/ep8;->b(Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;

    move-result-object v0

    iget v1, v0, Lcom/daaw/tm7;->e:I

    invoke-virtual {p0, p1, p3}, Lcom/daaw/em8;->y0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v2

    iget v3, p0, Lcom/daaw/em8;->T0:I

    if-le v2, v3, :cond_0

    or-int/lit8 v1, v1, 0x40

    :cond_0
    new-instance v8, Lcom/daaw/tm7;

    iget-object v3, p1, Lcom/daaw/ep8;->a:Ljava/lang/String;

    const/4 p1, 0x0

    if-eqz v1, :cond_1

    move v7, v1

    const/4 v6, 0x0

    goto :goto_0

    :cond_1
    iget v0, v0, Lcom/daaw/tm7;->d:I

    move v6, v0

    const/4 v7, 0x0

    :goto_0
    move-object v2, v8

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lcom/daaw/tm7;-><init>(Ljava/lang/String;Lcom/daaw/f92;Lcom/daaw/f92;II)V

    return-object v8
.end method

.method public final H(Lcom/daaw/a78;)Lcom/daaw/tm7;
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/hp8;->H(Lcom/daaw/a78;)Lcom/daaw/tm7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    iget-object p1, p1, Lcom/daaw/a78;->a:Lcom/daaw/f92;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/dj8;->g(Lcom/daaw/f92;Lcom/daaw/tm7;)V

    return-object v0
.end method

.method public final K(Lcom/daaw/ep8;Lcom/daaw/f92;Landroid/media/MediaCrypto;F)Lcom/daaw/zo8;
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/nk7;->p()[Lcom/daaw/f92;

    move-result-object p3

    invoke-virtual {p0, p1, p2}, Lcom/daaw/em8;->y0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v0

    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    aget-object v5, p3, v4

    invoke-virtual {p1, p2, v5}, Lcom/daaw/ep8;->b(Lcom/daaw/f92;Lcom/daaw/f92;)Lcom/daaw/tm7;

    move-result-object v6

    iget v6, v6, Lcom/daaw/tm7;->d:I

    if-eqz v6, :cond_1

    invoke-virtual {p0, p1, v5}, Lcom/daaw/em8;->y0(Lcom/daaw/ep8;Lcom/daaw/f92;)I

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput v0, p0, Lcom/daaw/em8;->T0:I

    iget-object p3, p1, Lcom/daaw/ep8;->a:Ljava/lang/String;

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v4, "OMX.SEC.aac.dec"

    invoke-virtual {v4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p3, Lcom/daaw/it5;->c:Ljava/lang/String;

    const-string v4, "samsung"

    invoke-virtual {v4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p3, Lcom/daaw/it5;->b:Ljava/lang/String;

    const-string v4, "zeroflte"

    invoke-virtual {p3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "herolte"

    invoke-virtual {p3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "heroqlte"

    invoke-virtual {p3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    :cond_3
    const/4 p3, 0x1

    goto :goto_2

    :cond_4
    const/4 p3, 0x0

    :goto_2
    iput-boolean p3, p0, Lcom/daaw/em8;->U0:Z

    iget-object p3, p1, Lcom/daaw/ep8;->c:Ljava/lang/String;

    iget v4, p0, Lcom/daaw/em8;->T0:I

    new-instance v5, Landroid/media/MediaFormat;

    invoke-direct {v5}, Landroid/media/MediaFormat;-><init>()V

    const-string v6, "mime"

    invoke-virtual {v5, v6, p3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget p3, p2, Lcom/daaw/f92;->y:I

    const-string v6, "channel-count"

    invoke-virtual {v5, v6, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p3, p2, Lcom/daaw/f92;->z:I

    const-string v6, "sample-rate"

    invoke-virtual {v5, v6, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p3, p2, Lcom/daaw/f92;->n:Ljava/util/List;

    invoke-static {v5, p3}, Lcom/daaw/yb5;->b(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string p3, "max-input-size"

    invoke-static {v5, p3, v4}, Lcom/daaw/yb5;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const/16 p3, 0x17

    if-lt v0, p3, :cond_6

    const-string v4, "priority"

    invoke-virtual {v5, v4, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v2, p4, v2

    if-eqz v2, :cond_6

    if-ne v0, p3, :cond_5

    sget-object p3, Lcom/daaw/it5;->d:Ljava/lang/String;

    const-string v2, "ZTE B2017G"

    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "AXON 7 mini"

    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    :cond_5
    const-string p3, "operating-rate"

    invoke-virtual {v5, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_6
    const/16 p3, 0x1c

    if-gt v0, p3, :cond_7

    iget-object p3, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string p4, "audio/ac4"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    const-string p3, "ac4-is-sync"

    invoke-virtual {v5, p3, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_7
    if-lt v0, v1, :cond_8

    iget-object p3, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    iget p4, p2, Lcom/daaw/f92;->y:I

    iget v1, p2, Lcom/daaw/f92;->z:I

    const/4 v2, 0x4

    invoke-static {v2, p4, v1}, Lcom/daaw/it5;->f(III)Lcom/daaw/f92;

    move-result-object p4

    invoke-interface {p3, p4}, Lcom/daaw/rj8;->a(Lcom/daaw/f92;)I

    move-result p3

    const/4 p4, 0x2

    if-ne p3, p4, :cond_8

    const-string p3, "pcm-encoding"

    invoke-virtual {v5, p3, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_8
    const/16 p3, 0x20

    if-lt v0, p3, :cond_9

    const/16 p3, 0x63

    const-string p4, "max-output-channel-count"

    invoke-virtual {v5, p4, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_9
    iget-object p3, p1, Lcom/daaw/ep8;->b:Ljava/lang/String;

    const-string p4, "audio/raw"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_a

    iget-object p3, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_a

    move-object p3, p2

    goto :goto_3

    :cond_a
    move-object p3, v0

    :goto_3
    iput-object p3, p0, Lcom/daaw/em8;->V0:Lcom/daaw/f92;

    invoke-static {p1, v5, p2, v0}, Lcom/daaw/zo8;->a(Lcom/daaw/ep8;Landroid/media/MediaFormat;Lcom/daaw/f92;Landroid/media/MediaCrypto;)Lcom/daaw/zo8;

    move-result-object p1

    return-object p1
.end method

.method public final L(Lcom/daaw/jp8;Lcom/daaw/f92;Z)Ljava/util/List;
    .locals 1

    iget-object p3, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p3}, Lcom/daaw/em8;->z0(Lcom/daaw/jp8;Lcom/daaw/f92;ZLcom/daaw/rj8;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/hq8;->g(Ljava/util/List;Lcom/daaw/f92;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final M(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio codec error"

    invoke-static {v0, v1, p1}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    invoke-virtual {v0, p1}, Lcom/daaw/dj8;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final N(Ljava/lang/String;Lcom/daaw/zo8;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/dj8;->c(Ljava/lang/String;JJ)V

    return-void
.end method

.method public final O(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    invoke-virtual {v0, p1}, Lcom/daaw/dj8;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final W(Lcom/daaw/f92;Landroid/media/MediaFormat;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/em8;->V0:Lcom/daaw/f92;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/hp8;->f0()Lcom/daaw/bp8;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v0, p1, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v3, "audio/raw"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p1, Lcom/daaw/f92;->A:I

    goto :goto_0

    :cond_2
    sget v0, Lcom/daaw/it5;->a:I

    const/16 v4, 0x18

    if-lt v0, v4, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/daaw/it5;->X(I)I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    :goto_0
    new-instance v4, Lcom/daaw/b72;

    invoke-direct {v4}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v4, v3}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v4, v0}, Lcom/daaw/b72;->n(I)Lcom/daaw/b72;

    iget v0, p1, Lcom/daaw/f92;->B:I

    invoke-virtual {v4, v0}, Lcom/daaw/b72;->c(I)Lcom/daaw/b72;

    iget v0, p1, Lcom/daaw/f92;->C:I

    invoke-virtual {v4, v0}, Lcom/daaw/b72;->d(I)Lcom/daaw/b72;

    const-string v0, "channel-count"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    const-string v0, "sample-rate"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v4, p2}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {v4}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p2

    iget-boolean v0, p0, Lcom/daaw/em8;->U0:Z

    if-eqz v0, :cond_5

    iget v0, p2, Lcom/daaw/f92;->y:I

    const/4 v3, 0x6

    if-ne v0, v3, :cond_5

    iget v0, p1, Lcom/daaw/f92;->y:I

    if-ge v0, v3, :cond_5

    new-array v2, v0, [I

    const/4 v0, 0x0

    :goto_1
    iget v3, p1, Lcom/daaw/f92;->y:I

    if-ge v0, v3, :cond_5

    aput v0, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move-object p1, p2

    :goto_2
    :try_start_0
    iget-object p2, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {p2, p1, v1, v2}, Lcom/daaw/rj8;->f(Lcom/daaw/f92;I[I)V
    :try_end_0
    .catch Lcom/daaw/hj8; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p1, Lcom/daaw/hj8;->p:Lcom/daaw/f92;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object p1

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method public final X()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/em8;->Y0:Z

    return-void
.end method

.method public final Y()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzf()V

    return-void
.end method

.method public final Z(Lcom/daaw/ma7;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/em8;->X0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/i37;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lcom/daaw/ma7;->e:J

    iget-wide v2, p0, Lcom/daaw/em8;->W0:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-wide v0, p1, Lcom/daaw/ma7;->e:J

    iput-wide v0, p0, Lcom/daaw/em8;->W0:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/em8;->X0:Z

    :cond_1
    return-void
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public final a0()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzi()V
    :try_end_0
    .catch Lcom/daaw/pj8; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, v0, Lcom/daaw/pj8;->r:Lcom/daaw/f92;

    iget-boolean v2, v0, Lcom/daaw/pj8;->q:Z

    const/16 v3, 0x138a

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object v0

    throw v0
.end method

.method public final b0(JJLcom/daaw/bp8;Ljava/nio/ByteBuffer;IIIJZZLcom/daaw/f92;)Z
    .locals 0

    invoke-static {p6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/em8;->V0:Lcom/daaw/f92;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-static {p5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p5, p7, p3}, Lcom/daaw/bp8;->g(IZ)V

    return p2

    :cond_0
    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7, p3}, Lcom/daaw/bp8;->g(IZ)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget p3, p1, Lcom/daaw/ql7;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lcom/daaw/ql7;->f:I

    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {p1}, Lcom/daaw/rj8;->zzf()V

    return p2

    :cond_2
    :try_start_0
    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {p1, p6, p10, p11, p9}, Lcom/daaw/rj8;->c(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lcom/daaw/jj8; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/daaw/pj8; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7, p3}, Lcom/daaw/bp8;->g(IZ)V

    :cond_3
    iget-object p1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    iget p3, p1, Lcom/daaw/ql7;->e:I

    add-int/2addr p3, p9

    iput p3, p1, Lcom/daaw/ql7;->e:I

    return p2

    :cond_4
    return p3

    :catch_0
    move-exception p1

    iget-boolean p2, p1, Lcom/daaw/pj8;->q:Z

    const/16 p3, 0x138a

    invoke-virtual {p0, p1, p14, p2, p3}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    iget-object p2, p1, Lcom/daaw/jj8;->r:Lcom/daaw/f92;

    iget-boolean p3, p1, Lcom/daaw/jj8;->q:Z

    const/16 p4, 0x1389

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/nk7;->s(Ljava/lang/Throwable;Lcom/daaw/f92;ZI)Lcom/daaw/vu7;

    move-result-object p1

    throw p1
.end method

.method public final c0(Lcom/daaw/f92;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0, p1}, Lcom/daaw/rj8;->h(Lcom/daaw/f92;)Z

    move-result p1

    return p1
.end method

.method public final h(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    check-cast p2, Lcom/daaw/f98;

    iput-object p2, p0, Lcom/daaw/em8;->a1:Lcom/daaw/f98;

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/rj8;->g(I)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/rj8;->k(Z)V

    return-void

    :cond_0
    check-cast p2, Lcom/daaw/sc8;

    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {p1, p2}, Lcom/daaw/rj8;->i(Lcom/daaw/sc8;)V

    return-void

    :cond_1
    check-cast p2, Lcom/daaw/o98;

    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {p1, p2}, Lcom/daaw/rj8;->l(Lcom/daaw/o98;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/rj8;->j(F)V

    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Lcom/daaw/pp3;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0, p1}, Lcom/daaw/rj8;->n(Lcom/daaw/pp3;)V

    return-void
.end method

.method public final x()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/em8;->Z0:Z

    :try_start_0
    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zze()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Lcom/daaw/hp8;->x()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    iget-object v1, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {v0, v1}, Lcom/daaw/dj8;->e(Lcom/daaw/ql7;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    iget-object v2, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {v1, v2}, Lcom/daaw/dj8;->e(Lcom/daaw/ql7;)V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-super {p0}, Lcom/daaw/hp8;->x()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v1, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    iget-object v2, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {v1, v2}, Lcom/daaw/dj8;->e(Lcom/daaw/ql7;)V

    throw v0

    :catchall_2
    move-exception v0

    iget-object v1, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    iget-object v2, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {v1, v2}, Lcom/daaw/dj8;->e(Lcom/daaw/ql7;)V

    throw v0
.end method

.method public final y(ZZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/hp8;->y(ZZ)V

    iget-object p1, p0, Lcom/daaw/em8;->R0:Lcom/daaw/dj8;

    iget-object p2, p0, Lcom/daaw/hp8;->J0:Lcom/daaw/ql7;

    invoke-virtual {p1, p2}, Lcom/daaw/dj8;->f(Lcom/daaw/ql7;)V

    invoke-virtual {p0}, Lcom/daaw/nk7;->v()Lcom/daaw/x98;

    iget-object p1, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-virtual {p0}, Lcom/daaw/nk7;->w()Lcom/daaw/lh8;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/rj8;->d(Lcom/daaw/lh8;)V

    return-void
.end method

.method public final y0(Lcom/daaw/ep8;Lcom/daaw/f92;)I
    .locals 1

    iget-object p1, p1, Lcom/daaw/ep8;->a:Ljava/lang/String;

    const-string v0, "OMX.google.raw.decoder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lcom/daaw/it5;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/em8;->Q0:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/it5;->x(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Lcom/daaw/f92;->m:I

    return p1
.end method

.method public final z(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/hp8;->z(JZ)V

    iget-object p3, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {p3}, Lcom/daaw/rj8;->zze()V

    iput-wide p1, p0, Lcom/daaw/em8;->W0:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/em8;->X0:Z

    iput-boolean p1, p0, Lcom/daaw/em8;->Y0:Z

    return-void
.end method

.method public final zzM()Z
    .locals 1

    invoke-super {p0}, Lcom/daaw/hp8;->zzM()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzN()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzt()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lcom/daaw/hp8;->zzN()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final zza()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/nk7;->m()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/daaw/em8;->u0()V

    :cond_0
    iget-wide v0, p0, Lcom/daaw/em8;->W0:J

    return-wide v0
.end method

.method public final zzc()Lcom/daaw/pp3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/em8;->S0:Lcom/daaw/rj8;

    invoke-interface {v0}, Lcom/daaw/rj8;->zzc()Lcom/daaw/pp3;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Lcom/daaw/g78;
    .locals 0

    return-object p0
.end method
