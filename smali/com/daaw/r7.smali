.class public final Lcom/daaw/r7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/r7$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/r7$a;

.field public final b:[J

.field public c:Landroid/media/AudioTrack;

.field public d:I

.field public e:I

.field public f:Lcom/daaw/q7;

.field public g:I

.field public h:Z

.field public i:J

.field public j:J

.field public k:J

.field public l:Ljava/lang/reflect/Method;

.field public m:J

.field public n:Z

.field public o:Z

.field public p:J

.field public q:J

.field public r:J

.field public s:J

.field public t:I

.field public u:I

.field public v:J

.field public w:J

.field public x:J

.field public y:J


# direct methods
.method public constructor <init>(Lcom/daaw/r7$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/r7$a;

    iput-object p1, p0, Lcom/daaw/r7;->a:Lcom/daaw/r7$a;

    sget p1, Lcom/daaw/sq1;->a:I

    const/16 v0, 0x12

    if-lt p1, v0, :cond_0

    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    const-string v0, "getLatency"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/r7;->l:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/16 p1, 0xa

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/daaw/r7;->b:[J

    return-void
.end method

.method public static o(I)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 v0, 0x6

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final a()Z
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/r7;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/r7;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/r7;->g:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public c(J)I
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/r7;->e()J

    move-result-wide v0

    iget v2, p0, Lcom/daaw/r7;->d:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    sub-long/2addr p1, v0

    long-to-int p2, p1

    iget p1, p0, Lcom/daaw/r7;->e:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public d(Z)J
    .locals 6

    iget-object v0, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/r7;->m()V

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iget-object v2, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {v2}, Lcom/daaw/q7;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {p1}, Lcom/daaw/q7;->b()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/daaw/r7;->b(J)J

    move-result-wide v2

    iget-object p1, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {p1}, Lcom/daaw/q7;->e()Z

    move-result p1

    if-nez p1, :cond_1

    return-wide v2

    :cond_1
    iget-object p1, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {p1}, Lcom/daaw/q7;->c()J

    move-result-wide v4

    sub-long/2addr v0, v4

    add-long/2addr v2, v0

    return-wide v2

    :cond_2
    iget v2, p0, Lcom/daaw/r7;->u:I

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lcom/daaw/r7;->f()J

    move-result-wide v0

    goto :goto_0

    :cond_3
    iget-wide v2, p0, Lcom/daaw/r7;->j:J

    add-long/2addr v0, v2

    :goto_0
    if-nez p1, :cond_4

    iget-wide v2, p0, Lcom/daaw/r7;->m:J

    sub-long/2addr v0, v2

    :cond_4
    return-wide v0
.end method

.method public final e()J
    .locals 10

    iget-wide v0, p0, Lcom/daaw/r7;->v:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    iget-wide v2, p0, Lcom/daaw/r7;->v:J

    sub-long/2addr v0, v2

    iget v2, p0, Lcom/daaw/r7;->g:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    iget-wide v2, p0, Lcom/daaw/r7;->y:J

    iget-wide v4, p0, Lcom/daaw/r7;->x:J

    add-long/2addr v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x1

    const-wide/16 v4, 0x0

    if-ne v0, v1, :cond_1

    return-wide v4

    :cond_1
    const-wide v6, 0xffffffffL

    iget-object v1, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v1

    int-to-long v8, v1

    and-long/2addr v6, v8

    iget-boolean v1, p0, Lcom/daaw/r7;->h:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    cmp-long v1, v6, v4

    if-nez v1, :cond_2

    iget-wide v8, p0, Lcom/daaw/r7;->q:J

    iput-wide v8, p0, Lcom/daaw/r7;->s:J

    :cond_2
    iget-wide v8, p0, Lcom/daaw/r7;->s:J

    add-long/2addr v6, v8

    :cond_3
    sget v1, Lcom/daaw/sq1;->a:I

    const/16 v8, 0x1c

    if-gt v1, v8, :cond_6

    cmp-long v1, v6, v4

    if-nez v1, :cond_5

    iget-wide v8, p0, Lcom/daaw/r7;->q:J

    cmp-long v1, v8, v4

    if-lez v1, :cond_5

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    iget-wide v0, p0, Lcom/daaw/r7;->w:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/r7;->w:J

    :cond_4
    iget-wide v0, p0, Lcom/daaw/r7;->q:J

    return-wide v0

    :cond_5
    iput-wide v2, p0, Lcom/daaw/r7;->w:J

    :cond_6
    iget-wide v0, p0, Lcom/daaw/r7;->q:J

    cmp-long v2, v0, v6

    if-lez v2, :cond_7

    iget-wide v0, p0, Lcom/daaw/r7;->r:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/r7;->r:J

    :cond_7
    iput-wide v6, p0, Lcom/daaw/r7;->q:J

    iget-wide v0, p0, Lcom/daaw/r7;->r:J

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    add-long/2addr v6, v0

    return-wide v6
.end method

.method public final f()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/r7;->e()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/r7;->b(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/r7;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/r7;->x:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    iput-wide v0, p0, Lcom/daaw/r7;->v:J

    iput-wide p1, p0, Lcom/daaw/r7;->y:J

    return-void
.end method

.method public h(J)Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/r7;->e()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/r7;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(J)Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/r7;->w:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/daaw/r7;->w:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0xc8

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public k(J)Z
    .locals 8

    iget-object v0, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    iget-boolean v1, p0, Lcom/daaw/r7;->h:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput-boolean v3, p0, Lcom/daaw/r7;->n:Z

    return v3

    :cond_0
    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/r7;->e()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-nez v1, :cond_1

    return v3

    :cond_1
    iget-boolean v1, p0, Lcom/daaw/r7;->n:Z

    invoke-virtual {p0, p1, p2}, Lcom/daaw/r7;->h(J)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/r7;->n:Z

    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    if-eq v0, v2, :cond_2

    iget-object p1, p0, Lcom/daaw/r7;->a:Lcom/daaw/r7$a;

    if-eqz p1, :cond_2

    iget p2, p0, Lcom/daaw/r7;->e:I

    iget-wide v0, p0, Lcom/daaw/r7;->i:J

    invoke-static {v0, v1}, Lcom/daaw/dd;->b(J)J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, Lcom/daaw/r7$a;->a(IJ)V

    :cond_2
    return v2
.end method

.method public final l(JJ)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/q7;->f(J)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {v0}, Lcom/daaw/q7;->c()J

    move-result-wide v4

    iget-object v0, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {v0}, Lcom/daaw/q7;->b()J

    move-result-wide v2

    sub-long v0, v4, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v6, 0x4c4b40

    cmp-long v8, v0, v6

    if-lez v8, :cond_1

    iget-object v1, p0, Lcom/daaw/r7;->a:Lcom/daaw/r7$a;

    move-wide v6, p1

    move-wide v8, p3

    invoke-interface/range {v1 .. v9}, Lcom/daaw/r7$a;->d(JJJJ)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {p1}, Lcom/daaw/q7;->g()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2, v3}, Lcom/daaw/r7;->b(J)J

    move-result-wide v0

    sub-long/2addr v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    cmp-long v8, v0, v6

    if-lez v8, :cond_2

    iget-object v1, p0, Lcom/daaw/r7;->a:Lcom/daaw/r7$a;

    move-wide v6, p1

    move-wide v8, p3

    invoke-interface/range {v1 .. v9}, Lcom/daaw/r7$a;->c(JJJJ)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {p1}, Lcom/daaw/q7;->a()V

    :goto_1
    return-void
.end method

.method public final m()V
    .locals 13

    invoke-virtual {p0}, Lcom/daaw/r7;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    iget-wide v6, p0, Lcom/daaw/r7;->k:J

    sub-long v6, v4, v6

    const-wide/16 v8, 0x7530

    cmp-long v10, v6, v8

    if-ltz v10, :cond_2

    iget-object v6, p0, Lcom/daaw/r7;->b:[J

    iget v7, p0, Lcom/daaw/r7;->t:I

    sub-long v8, v0, v4

    aput-wide v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    const/16 v6, 0xa

    rem-int/2addr v7, v6

    iput v7, p0, Lcom/daaw/r7;->t:I

    iget v7, p0, Lcom/daaw/r7;->u:I

    if-ge v7, v6, :cond_1

    add-int/lit8 v7, v7, 0x1

    iput v7, p0, Lcom/daaw/r7;->u:I

    :cond_1
    iput-wide v4, p0, Lcom/daaw/r7;->k:J

    iput-wide v2, p0, Lcom/daaw/r7;->j:J

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lcom/daaw/r7;->u:I

    if-ge v2, v3, :cond_2

    iget-wide v6, p0, Lcom/daaw/r7;->j:J

    iget-object v8, p0, Lcom/daaw/r7;->b:[J

    aget-wide v9, v8, v2

    int-to-long v11, v3

    div-long/2addr v9, v11

    add-long/2addr v6, v9

    iput-wide v6, p0, Lcom/daaw/r7;->j:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-boolean v2, p0, Lcom/daaw/r7;->h:Z

    if-eqz v2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0, v4, v5, v0, v1}, Lcom/daaw/r7;->l(JJ)V

    invoke-virtual {p0, v4, v5}, Lcom/daaw/r7;->n(J)V

    return-void
.end method

.method public final n(J)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/r7;->o:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/r7;->l:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    iget-wide v1, p0, Lcom/daaw/r7;->p:J

    sub-long v1, p1, v1

    const-wide/32 v3, 0x7a120

    cmp-long v5, v1, v3

    if-ltz v5, :cond_1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    const-wide/16 v4, 0x3e8

    mul-long v2, v2, v4

    iget-wide v4, p0, Lcom/daaw/r7;->i:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/r7;->m:J

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/r7;->m:J

    const-wide/32 v6, 0x4c4b40

    cmp-long v0, v2, v6

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/r7;->a:Lcom/daaw/r7$a;

    invoke-interface {v0, v2, v3}, Lcom/daaw/r7$a;->b(J)V

    iput-wide v4, p0, Lcom/daaw/r7;->m:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iput-object v1, p0, Lcom/daaw/r7;->l:Ljava/lang/reflect/Method;

    :cond_0
    :goto_0
    iput-wide p1, p0, Lcom/daaw/r7;->p:J

    :cond_1
    return-void
.end method

.method public p()Z
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/r7;->r()V

    iget-wide v0, p0, Lcom/daaw/r7;->v:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {v0}, Lcom/daaw/q7;->h()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public q()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/r7;->r()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    iput-object v0, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    return-void
.end method

.method public final r()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/r7;->j:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/r7;->u:I

    iput v2, p0, Lcom/daaw/r7;->t:I

    iput-wide v0, p0, Lcom/daaw/r7;->k:J

    return-void
.end method

.method public s(Landroid/media/AudioTrack;III)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/r7;->c:Landroid/media/AudioTrack;

    iput p3, p0, Lcom/daaw/r7;->d:I

    iput p4, p0, Lcom/daaw/r7;->e:I

    new-instance v0, Lcom/daaw/q7;

    invoke-direct {v0, p1}, Lcom/daaw/q7;-><init>(Landroid/media/AudioTrack;)V

    iput-object v0, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result p1

    iput p1, p0, Lcom/daaw/r7;->g:I

    invoke-static {p2}, Lcom/daaw/r7;->o(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/r7;->h:Z

    invoke-static {p2}, Lcom/daaw/sq1;->I(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/r7;->o:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p1, :cond_0

    div-int/2addr p4, p3

    int-to-long p1, p4

    invoke-virtual {p0, p1, p2}, Lcom/daaw/r7;->b(J)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    move-wide p1, v0

    :goto_0
    iput-wide p1, p0, Lcom/daaw/r7;->i:J

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/r7;->q:J

    iput-wide p1, p0, Lcom/daaw/r7;->r:J

    iput-wide p1, p0, Lcom/daaw/r7;->s:J

    const/4 p3, 0x0

    iput-boolean p3, p0, Lcom/daaw/r7;->n:Z

    iput-wide v0, p0, Lcom/daaw/r7;->v:J

    iput-wide v0, p0, Lcom/daaw/r7;->w:J

    iput-wide p1, p0, Lcom/daaw/r7;->m:J

    return-void
.end method

.method public t()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r7;->f:Lcom/daaw/q7;

    invoke-virtual {v0}, Lcom/daaw/q7;->h()V

    return-void
.end method
