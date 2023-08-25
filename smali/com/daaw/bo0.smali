.class public Lcom/daaw/bo0;
.super Lcom/daaw/do0;
.source ""

# interfaces
.implements Lcom/daaw/ao0;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/bo0$b;
    }
.end annotation


# instance fields
.field public final m0:Landroid/content/Context;

.field public final n0:Lcom/daaw/n7$a;

.field public final o0:Lcom/daaw/o7;

.field public p0:I

.field public q0:Z

.field public r0:Z

.field public s0:Landroid/media/MediaFormat;

.field public t0:I

.field public u0:I

.field public v0:I

.field public w0:I

.field public x0:J

.field public y0:Z

.field public z0:Z


# direct methods
.method public varargs constructor <init>(Landroid/content/Context;Lcom/daaw/eo0;Lcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/n7;Lcom/daaw/g7;[Lcom/daaw/m7;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/eo0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;Z",
            "Landroid/os/Handler;",
            "Lcom/daaw/n7;",
            "Lcom/daaw/g7;",
            "[",
            "Lcom/daaw/m7;",
            ")V"
        }
    .end annotation

    new-instance v7, Lcom/daaw/kq;

    move-object v0, p7

    move-object/from16 v1, p8

    invoke-direct {v7, p7, v1}, Lcom/daaw/kq;-><init>(Lcom/daaw/g7;[Lcom/daaw/m7;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/daaw/bo0;-><init>(Landroid/content/Context;Lcom/daaw/eo0;Lcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/n7;Lcom/daaw/o7;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/eo0;Lcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/n7;Lcom/daaw/o7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/eo0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;Z",
            "Landroid/os/Handler;",
            "Lcom/daaw/n7;",
            "Lcom/daaw/o7;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p2, p3, p4}, Lcom/daaw/do0;-><init>(ILcom/daaw/eo0;Lcom/daaw/yu;Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/bo0;->m0:Landroid/content/Context;

    iput-object p7, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    new-instance p1, Lcom/daaw/n7$a;

    invoke-direct {p1, p5, p6}, Lcom/daaw/n7$a;-><init>(Landroid/os/Handler;Lcom/daaw/n7;)V

    iput-object p1, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    new-instance p1, Lcom/daaw/bo0$b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/daaw/bo0$b;-><init>(Lcom/daaw/bo0;Lcom/daaw/bo0$a;)V

    invoke-interface {p7, p1}, Lcom/daaw/o7;->u(Lcom/daaw/o7$c;)V

    return-void
.end method

.method public static B0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.aac.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/daaw/sq1;->c:Ljava/lang/String;

    const-string v0, "samsung"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/daaw/sq1;->b:Ljava/lang/String;

    const-string v0, "zeroflte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "herolte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "heroqlte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic y0(Lcom/daaw/bo0;)Lcom/daaw/n7$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    return-object p0
.end method

.method public static synthetic z0(Lcom/daaw/bo0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/bo0;->z0:Z

    return p1
.end method


# virtual methods
.method public A()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0}, Lcom/daaw/o7;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Lcom/daaw/do0;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v0}, Lcom/daaw/fq;->a()V

    iget-object v0, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    iget-object v1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v0, v1}, Lcom/daaw/n7$a;->e(Lcom/daaw/fq;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1}, Lcom/daaw/fq;->a()V

    iget-object v1, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    iget-object v2, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1, v2}, Lcom/daaw/n7$a;->e(Lcom/daaw/fq;)V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-super {p0}, Lcom/daaw/do0;->A()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1}, Lcom/daaw/fq;->a()V

    iget-object v1, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    iget-object v2, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1, v2}, Lcom/daaw/n7$a;->e(Lcom/daaw/fq;)V

    throw v0

    :catchall_2
    move-exception v0

    iget-object v1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1}, Lcom/daaw/fq;->a()V

    iget-object v1, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    iget-object v2, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1, v2}, Lcom/daaw/n7$a;->e(Lcom/daaw/fq;)V

    throw v0
.end method

.method public A0(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Lcom/daaw/hq0;->c(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0, p1}, Lcom/daaw/o7;->t(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public B(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/do0;->B(Z)V

    iget-object p1, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    iget-object v0, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {p1, v0}, Lcom/daaw/n7$a;->f(Lcom/daaw/fq;)V

    invoke-virtual {p0}, Lcom/daaw/xa;->w()Lcom/daaw/c41;

    move-result-object p1

    iget p1, p1, Lcom/daaw/c41;->a:I

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0, p1}, Lcom/daaw/o7;->r(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {p1}, Lcom/daaw/o7;->m()V

    :goto_0
    return-void
.end method

.method public C(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/do0;->C(JZ)V

    iget-object p3, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {p3}, Lcom/daaw/o7;->e()V

    iput-wide p1, p0, Lcom/daaw/bo0;->x0:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/bo0;->y0:Z

    iput-boolean p1, p0, Lcom/daaw/bo0;->z0:Z

    return-void
.end method

.method public final C0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;)I
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    iget-object p1, p1, Lcom/daaw/co0;->a:Ljava/lang/String;

    const-string v1, "OMX.google.raw.decoder"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    const/16 v1, 0x17

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/bo0;->m0:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android.software.leanback"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Lcom/google/android/exoplayer2/Format;->v:I

    return p1
.end method

.method public D()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/do0;->D()V

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0}, Lcom/daaw/o7;->s()V

    return-void
.end method

.method public D0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;[Lcom/google/android/exoplayer2/Format;)I
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/bo0;->C0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;)I

    move-result p1

    return p1
.end method

.method public E()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bo0;->I0()V

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0}, Lcom/daaw/o7;->b()V

    invoke-super {p0}, Lcom/daaw/do0;->E()V

    return-void
.end method

.method public E0(Lcom/google/android/exoplayer2/Format;Ljava/lang/String;I)Landroid/media/MediaFormat;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    new-instance v0, Landroid/media/MediaFormat;

    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    const-string v1, "mime"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget p2, p1, Lcom/google/android/exoplayer2/Format;->G:I

    const-string v1, "channel-count"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p2, p1, Lcom/google/android/exoplayer2/Format;->H:I

    const-string v1, "sample-rate"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->w:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/daaw/no0;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string p1, "max-input-size"

    invoke-static {v0, p1, p3}, Lcom/daaw/no0;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget p1, Lcom/daaw/sq1;->a:I

    const/16 p2, 0x17

    if-lt p1, p2, :cond_0

    const/4 p1, 0x0

    const-string p2, "priority"

    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_0
    return-object v0
.end method

.method public F0(I)V
    .locals 0

    return-void
.end method

.method public G0()V
    .locals 0

    return-void
.end method

.method public H0(IJJ)V
    .locals 0

    return-void
.end method

.method public final I0()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-virtual {p0}, Lcom/daaw/bo0;->c()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/daaw/o7;->l(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-boolean v2, p0, Lcom/daaw/bo0;->z0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lcom/daaw/bo0;->x0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lcom/daaw/bo0;->x0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/bo0;->z0:Z

    :cond_1
    return-void
.end method

.method public J(Landroid/media/MediaCodec;Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public R(Lcom/daaw/co0;Landroid/media/MediaCodec;Lcom/google/android/exoplayer2/Format;Landroid/media/MediaCrypto;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/xa;->y()[Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lcom/daaw/bo0;->D0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;[Lcom/google/android/exoplayer2/Format;)I

    move-result v0

    iput v0, p0, Lcom/daaw/bo0;->p0:I

    iget-object v0, p1, Lcom/daaw/co0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/bo0;->B0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/bo0;->r0:Z

    iget-boolean v0, p1, Lcom/daaw/co0;->g:Z

    iput-boolean v0, p0, Lcom/daaw/bo0;->q0:Z

    iget-object p1, p1, Lcom/daaw/co0;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, "audio/raw"

    :cond_0
    iget v0, p0, Lcom/daaw/bo0;->p0:I

    invoke-virtual {p0, p3, p1, v0}, Lcom/daaw/bo0;->E0(Lcom/google/android/exoplayer2/Format;Ljava/lang/String;I)Landroid/media/MediaFormat;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, p4, v0}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    iget-boolean p2, p0, Lcom/daaw/bo0;->q0:Z

    if-eqz p2, :cond_1

    iput-object p1, p0, Lcom/daaw/bo0;->s0:Landroid/media/MediaFormat;

    iget-object p2, p3, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    const-string p3, "mime"

    invoke-virtual {p1, p3, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iput-object v1, p0, Lcom/daaw/bo0;->s0:Landroid/media/MediaFormat;

    :goto_0
    return-void
.end method

.method public Y(Lcom/daaw/eo0;Lcom/google/android/exoplayer2/Format;Z)Lcom/daaw/co0;
    .locals 1

    iget-object v0, p2, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/daaw/bo0;->A0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/eo0;->a()Lcom/daaw/co0;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/do0;->Y(Lcom/daaw/eo0;Lcom/google/android/exoplayer2/Format;Z)Lcom/daaw/co0;

    move-result-object p1

    return-object p1
.end method

.method public c()Z
    .locals 1

    invoke-super {p0}, Lcom/daaw/do0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0}, Lcom/daaw/o7;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0}, Lcom/daaw/o7;->k()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lcom/daaw/do0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f(Lcom/daaw/zw0;)Lcom/daaw/zw0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0, p1}, Lcom/daaw/o7;->f(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    move-result-object p1

    return-object p1
.end method

.method public f0(Ljava/lang/String;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/n7$a;->d(Ljava/lang/String;JJ)V

    return-void
.end method

.method public g0(Lcom/google/android/exoplayer2/Format;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/do0;->g0(Lcom/google/android/exoplayer2/Format;)V

    iget-object v0, p0, Lcom/daaw/bo0;->n0:Lcom/daaw/n7$a;

    invoke-virtual {v0, p1}, Lcom/daaw/n7$a;->g(Lcom/google/android/exoplayer2/Format;)V

    iget-object v0, p1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p1, Lcom/google/android/exoplayer2/Format;->I:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    iput v0, p0, Lcom/daaw/bo0;->t0:I

    iget v0, p1, Lcom/google/android/exoplayer2/Format;->G:I

    iput v0, p0, Lcom/daaw/bo0;->u0:I

    iget v0, p1, Lcom/google/android/exoplayer2/Format;->J:I

    iput v0, p0, Lcom/daaw/bo0;->v0:I

    iget p1, p1, Lcom/google/android/exoplayer2/Format;->K:I

    iput p1, p0, Lcom/daaw/bo0;->w0:I

    return-void
.end method

.method public h()Lcom/daaw/zw0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0}, Lcom/daaw/o7;->h()Lcom/daaw/zw0;

    move-result-object v0

    return-object v0
.end method

.method public h0(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object p1, p0, Lcom/daaw/bo0;->s0:Landroid/media/MediaFormat;

    if-eqz p1, :cond_0

    const-string p2, "mime"

    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/hq0;->c(Ljava/lang/String;)I

    move-result p1

    iget-object p2, p0, Lcom/daaw/bo0;->s0:Landroid/media/MediaFormat;

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/daaw/bo0;->t0:I

    :goto_0
    move v1, p1

    const-string p1, "channel-count"

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    const-string p1, "sample-rate"

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    iget-boolean p1, p0, Lcom/daaw/bo0;->r0:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x6

    if-ne v2, p1, :cond_1

    iget p2, p0, Lcom/daaw/bo0;->u0:I

    if-ge p2, p1, :cond_1

    new-array p1, p2, [I

    const/4 p2, 0x0

    :goto_1
    iget v0, p0, Lcom/daaw/bo0;->u0:I

    if-ge p2, v0, :cond_2

    aput p2, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :cond_2
    move-object v5, p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    const/4 v4, 0x0

    iget v6, p0, Lcom/daaw/bo0;->v0:I

    iget v7, p0, Lcom/daaw/bo0;->w0:I

    invoke-interface/range {v0 .. v7}, Lcom/daaw/o7;->i(IIII[III)V
    :try_end_0
    .catch Lcom/daaw/o7$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public j0(Lcom/daaw/gq;)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/bo0;->y0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/rc;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lcom/daaw/gq;->s:J

    iget-wide v2, p0, Lcom/daaw/bo0;->x0:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-wide v0, p1, Lcom/daaw/gq;->s:J

    iput-wide v0, p0, Lcom/daaw/bo0;->x0:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/bo0;->y0:Z

    :cond_1
    return-void
.end method

.method public l0(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/bo0;->q0:Z

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-virtual {p5, p7, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return p3

    :cond_0
    if-eqz p11, :cond_1

    invoke-virtual {p5, p7, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget-object p1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget p2, p1, Lcom/daaw/fq;->f:I

    add-int/2addr p2, p3

    iput p2, p1, Lcom/daaw/fq;->f:I

    iget-object p1, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {p1}, Lcom/daaw/o7;->o()V

    return p3

    :cond_1
    :try_start_0
    iget-object p1, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {p1, p6, p9, p10}, Lcom/daaw/o7;->q(Ljava/nio/ByteBuffer;J)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p5, p7, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget-object p1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget p2, p1, Lcom/daaw/fq;->e:I

    add-int/2addr p2, p3

    iput p2, p1, Lcom/daaw/fq;->e:I
    :try_end_0
    .catch Lcom/daaw/o7$b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/daaw/o7$d; {:try_start_0 .. :try_end_0} :catch_0

    return p3

    :cond_2
    return p2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    throw p1
.end method

.method public o()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/xa;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/bo0;->I0()V

    :cond_0
    iget-wide v0, p0, Lcom/daaw/bo0;->x0:J

    return-wide v0
.end method

.method public p0()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {v0}, Lcom/daaw/o7;->j()V
    :try_end_0
    .catch Lcom/daaw/o7$d; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object v0

    throw v0
.end method

.method public r(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2}, Lcom/daaw/xa;->r(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    check-cast p2, Lcom/daaw/f7;

    iget-object p1, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    invoke-interface {p1, p2}, Lcom/daaw/o7;->n(Lcom/daaw/f7;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/o7;->p(F)V

    :goto_0
    return-void
.end method

.method public v()Lcom/daaw/ao0;
    .locals 0

    return-object p0
.end method

.method public w0(Lcom/daaw/eo0;Lcom/daaw/yu;Lcom/google/android/exoplayer2/Format;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/eo0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;",
            "Lcom/google/android/exoplayer2/Format;",
            ")I"
        }
    .end annotation

    iget-object v0, p3, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/hq0;->k(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    sget v1, Lcom/daaw/sq1;->a:I

    const/16 v3, 0x15

    if-lt v1, v3, :cond_1

    const/16 v1, 0x20

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v4, p3, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    invoke-static {p2, v4}, Lcom/daaw/xa;->I(Lcom/daaw/yu;Lcom/google/android/exoplayer2/drm/DrmInitData;)Z

    move-result p2

    const/4 v4, 0x4

    if-eqz p2, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/bo0;->A0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p1}, Lcom/daaw/eo0;->a()Lcom/daaw/co0;

    move-result-object v5

    if-eqz v5, :cond_2

    or-int/lit8 p1, v1, 0x8

    or-int/2addr p1, v4

    return p1

    :cond_2
    const-string v5, "audio/raw"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    iget-object v5, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    iget v7, p3, Lcom/google/android/exoplayer2/Format;->I:I

    invoke-interface {v5, v7}, Lcom/daaw/o7;->t(I)Z

    move-result v5

    if-eqz v5, :cond_4

    :cond_3
    iget-object v5, p0, Lcom/daaw/bo0;->o0:Lcom/daaw/o7;

    const/4 v7, 0x2

    invoke-interface {v5, v7}, Lcom/daaw/o7;->t(I)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    return v6

    :cond_5
    iget-object v5, p3, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    if-eqz v5, :cond_6

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    iget v10, v5, Lcom/google/android/exoplayer2/drm/DrmInitData;->s:I

    if-ge v8, v10, :cond_7

    invoke-virtual {v5, v8}, Lcom/google/android/exoplayer2/drm/DrmInitData;->h(I)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    move-result-object v10

    iget-boolean v10, v10, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->t:Z

    or-int/2addr v9, v10

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_6
    const/4 v9, 0x0

    :cond_7
    invoke-interface {p1, v0, v9}, Lcom/daaw/eo0;->b(Ljava/lang/String;Z)Lcom/daaw/co0;

    move-result-object v5

    if-nez v5, :cond_9

    if-eqz v9, :cond_8

    invoke-interface {p1, v0, v2}, Lcom/daaw/eo0;->b(Ljava/lang/String;Z)Lcom/daaw/co0;

    move-result-object p1

    if-eqz p1, :cond_8

    const/4 v6, 0x2

    :cond_8
    return v6

    :cond_9
    if-nez p2, :cond_a

    return v7

    :cond_a
    sget p1, Lcom/daaw/sq1;->a:I

    if-lt p1, v3, :cond_c

    iget p1, p3, Lcom/google/android/exoplayer2/Format;->H:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_b

    invoke-virtual {v5, p1}, Lcom/daaw/co0;->h(I)Z

    move-result p1

    if-eqz p1, :cond_d

    :cond_b
    iget p1, p3, Lcom/google/android/exoplayer2/Format;->G:I

    if-eq p1, p2, :cond_c

    invoke-virtual {v5, p1}, Lcom/daaw/co0;->g(I)Z

    move-result p1

    if-eqz p1, :cond_d

    :cond_c
    const/4 v2, 0x1

    :cond_d
    if-eqz v2, :cond_e

    goto :goto_2

    :cond_e
    const/4 v4, 0x3

    :goto_2
    or-int/lit8 p1, v1, 0x8

    or-int/2addr p1, v4

    return p1
.end method
