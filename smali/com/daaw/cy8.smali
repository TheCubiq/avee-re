.class public final Lcom/daaw/cy8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ox8;

.field public final b:Lcom/daaw/yx8;

.field public final c:Lcom/daaw/by8;

.field public d:Z

.field public e:Landroid/view/Surface;

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:I

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ox8;

    invoke-direct {v0}, Lcom/daaw/ox8;-><init>()V

    iput-object v0, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lcom/daaw/it5;->a:I

    invoke-static {p1}, Lcom/daaw/ay8;->b(Landroid/content/Context;)Lcom/daaw/yx8;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {p1}, Lcom/daaw/zx8;->b(Landroid/content/Context;)Lcom/daaw/yx8;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :cond_1
    :goto_0
    iput-object v1, p0, Lcom/daaw/cy8;->b:Lcom/daaw/yx8;

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/daaw/by8;->a()Lcom/daaw/by8;

    move-result-object v0

    :cond_2
    iput-object v0, p0, Lcom/daaw/cy8;->c:Lcom/daaw/by8;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/cy8;->k:J

    iput-wide v0, p0, Lcom/daaw/cy8;->l:J

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/daaw/cy8;->f:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/daaw/cy8;->i:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/cy8;->j:I

    return-void
.end method

.method public static synthetic b(Lcom/daaw/cy8;Landroid/view/Display;)V
    .locals 4

    if-eqz p1, :cond_0

    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    move-result p1

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    double-to-long v0, v0

    iput-wide v0, p0, Lcom/daaw/cy8;->k:J

    const-wide/16 v2, 0x50

    mul-long v0, v0, v2

    const-wide/16 v2, 0x64

    div-long/2addr v0, v2

    :goto_0
    iput-wide v0, p0, Lcom/daaw/cy8;->l:J

    return-void

    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    const-string v0, "Unable to query display refresh rate"

    invoke-static {p1, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/cy8;->k:J

    goto :goto_0
.end method


# virtual methods
.method public final a(J)J
    .locals 10

    iget-wide v0, p0, Lcom/daaw/cy8;->p:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {v0}, Lcom/daaw/ox8;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {v0}, Lcom/daaw/ox8;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/cy8;->q:J

    iget-wide v4, p0, Lcom/daaw/cy8;->m:J

    iget-wide v6, p0, Lcom/daaw/cy8;->p:J

    sub-long/2addr v4, v6

    mul-long v0, v0, v4

    long-to-float v0, v0

    iget v1, p0, Lcom/daaw/cy8;->i:F

    div-float/2addr v0, v1

    float-to-long v0, v0

    add-long/2addr v2, v0

    sub-long v0, p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v4, 0x1312d00

    cmp-long v6, v0, v4

    if-gtz v6, :cond_0

    move-wide p1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/cy8;->l()V

    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/daaw/cy8;->m:J

    iput-wide v0, p0, Lcom/daaw/cy8;->n:J

    iput-wide p1, p0, Lcom/daaw/cy8;->o:J

    iget-object v0, p0, Lcom/daaw/cy8;->c:Lcom/daaw/by8;

    if-eqz v0, :cond_6

    iget-wide v1, p0, Lcom/daaw/cy8;->k:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_2

    goto :goto_3

    :cond_2
    iget-wide v0, v0, Lcom/daaw/by8;->p:J

    cmp-long v2, v0, v3

    if-nez v2, :cond_3

    return-wide p1

    :cond_3
    iget-wide v2, p0, Lcom/daaw/cy8;->k:J

    sub-long v4, p1, v0

    div-long/2addr v4, v2

    mul-long v4, v4, v2

    add-long/2addr v0, v4

    cmp-long v4, p1, v0

    if-gtz v4, :cond_4

    sub-long v2, v0, v2

    goto :goto_1

    :cond_4
    add-long/2addr v2, v0

    move-wide v8, v0

    move-wide v0, v2

    move-wide v2, v8

    :goto_1
    sub-long v4, v0, p1

    sub-long/2addr p1, v2

    cmp-long v6, v4, p1

    if-gez v6, :cond_5

    goto :goto_2

    :cond_5
    move-wide v0, v2

    :goto_2
    iget-wide p1, p0, Lcom/daaw/cy8;->l:J

    sub-long/2addr v0, p1

    return-wide v0

    :cond_6
    :goto_3
    return-wide p1
.end method

.method public final c(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/cy8;->f:F

    iget-object p1, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {p1}, Lcom/daaw/ox8;->f()V

    invoke-virtual {p0}, Lcom/daaw/cy8;->m()V

    return-void
.end method

.method public final d(J)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/cy8;->n:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v0, p0, Lcom/daaw/cy8;->p:J

    iget-wide v0, p0, Lcom/daaw/cy8;->o:J

    iput-wide v0, p0, Lcom/daaw/cy8;->q:J

    :cond_0
    iget-wide v0, p0, Lcom/daaw/cy8;->m:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/cy8;->m:J

    iget-object v0, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    const-wide/16 v1, 0x3e8

    mul-long p1, p1, v1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ox8;->e(J)V

    invoke-virtual {p0}, Lcom/daaw/cy8;->m()V

    return-void
.end method

.method public final e(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/cy8;->i:F

    invoke-virtual {p0}, Lcom/daaw/cy8;->l()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/cy8;->n(Z)V

    return-void
.end method

.method public final f()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/cy8;->l()V

    return-void
.end method

.method public final g()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/cy8;->d:Z

    invoke-virtual {p0}, Lcom/daaw/cy8;->l()V

    iget-object v0, p0, Lcom/daaw/cy8;->b:Lcom/daaw/yx8;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/cy8;->c:Lcom/daaw/by8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/daaw/by8;->b()V

    iget-object v0, p0, Lcom/daaw/cy8;->b:Lcom/daaw/yx8;

    new-instance v1, Lcom/daaw/wx8;

    invoke-direct {v1, p0}, Lcom/daaw/wx8;-><init>(Lcom/daaw/cy8;)V

    invoke-interface {v0, v1}, Lcom/daaw/yx8;->a(Lcom/daaw/wx8;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/cy8;->n(Z)V

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/cy8;->d:Z

    iget-object v0, p0, Lcom/daaw/cy8;->b:Lcom/daaw/yx8;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/yx8;->zza()V

    iget-object v0, p0, Lcom/daaw/cy8;->c:Lcom/daaw/by8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/daaw/by8;->c()V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/cy8;->k()V

    return-void
.end method

.method public final i(Landroid/view/Surface;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzxk;

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Lcom/daaw/cy8;->e:Landroid/view/Surface;

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/cy8;->k()V

    iput-object p1, p0, Lcom/daaw/cy8;->e:Landroid/view/Surface;

    invoke-virtual {p0, v1}, Lcom/daaw/cy8;->n(Z)V

    return-void
.end method

.method public final j(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/cy8;->j:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/cy8;->j:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/cy8;->n(Z)V

    return-void
.end method

.method public final k()V
    .locals 3

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/cy8;->e:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/daaw/cy8;->j:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    iget v1, p0, Lcom/daaw/cy8;->h:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iput v2, p0, Lcom/daaw/cy8;->h:F

    invoke-static {v0, v2}, Lcom/daaw/xx8;->a(Landroid/view/Surface;F)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final l()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/cy8;->m:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/cy8;->p:J

    iput-wide v0, p0, Lcom/daaw/cy8;->n:J

    return-void
.end method

.method public final m()V
    .locals 9

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_8

    iget-object v0, p0, Lcom/daaw/cy8;->e:Landroid/view/Surface;

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v0, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {v0}, Lcom/daaw/ox8;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {v0}, Lcom/daaw/ox8;->a()F

    move-result v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/daaw/cy8;->f:F

    :goto_0
    iget v2, p0, Lcom/daaw/cy8;->g:F

    cmpl-float v3, v0, v2

    if-nez v3, :cond_2

    return-void

    :cond_2
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v6, v0, v5

    if-eqz v6, :cond_4

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_4

    iget-object v1, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {v1}, Lcom/daaw/ox8;->g()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {v1}, Lcom/daaw/ox8;->d()J

    move-result-wide v5

    const-wide v7, 0x12a05f200L

    cmp-long v1, v5, v7

    if-ltz v1, :cond_3

    const v2, 0x3ca3d70a    # 0.02f

    :cond_3
    iget v1, p0, Lcom/daaw/cy8;->g:F

    sub-float v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_5

    goto :goto_1

    :cond_4
    cmpl-float v2, v0, v5

    if-nez v2, :cond_7

    iget-object v2, p0, Lcom/daaw/cy8;->a:Lcom/daaw/ox8;

    invoke-virtual {v2}, Lcom/daaw/ox8;->b()I

    move-result v2

    if-lt v2, v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    return-void

    :cond_7
    :goto_2
    iput v0, p0, Lcom/daaw/cy8;->g:F

    invoke-virtual {p0, v4}, Lcom/daaw/cy8;->n(Z)V

    :cond_8
    :goto_3
    return-void
.end method

.method public final n(Z)V
    .locals 4

    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lcom/daaw/cy8;->e:Landroid/view/Surface;

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/daaw/cy8;->j:I

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/cy8;->d:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/daaw/cy8;->g:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v3, v1, v3

    if-eqz v3, :cond_1

    iget v2, p0, Lcom/daaw/cy8;->i:F

    mul-float v2, v2, v1

    :cond_1
    if-nez p1, :cond_2

    iget p1, p0, Lcom/daaw/cy8;->h:F

    cmpl-float p1, p1, v2

    if-nez p1, :cond_2

    return-void

    :cond_2
    iput v2, p0, Lcom/daaw/cy8;->h:F

    invoke-static {v0, v2}, Lcom/daaw/xx8;->a(Landroid/view/Surface;F)V

    :cond_3
    :goto_0
    return-void
.end method
