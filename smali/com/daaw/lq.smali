.class public final Lcom/daaw/lq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ia;
.implements Lcom/daaw/bn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ia;",
        "Lcom/daaw/bn1<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/ia$a;

.field public final c:Lcom/daaw/yd1;

.field public final d:Lcom/daaw/zf;

.field public e:I

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:J


# direct methods
.method public constructor <init>()V
    .locals 7

    sget-object v6, Lcom/daaw/zf;->a:Lcom/daaw/zf;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/32 v3, 0xf4240

    const/16 v5, 0x7d0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/daaw/lq;-><init>(Landroid/os/Handler;Lcom/daaw/ia$a;JILcom/daaw/zf;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/ia$a;JILcom/daaw/zf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lq;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/lq;->b:Lcom/daaw/ia$a;

    new-instance p1, Lcom/daaw/yd1;

    invoke-direct {p1, p5}, Lcom/daaw/yd1;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/lq;->c:Lcom/daaw/yd1;

    iput-object p6, p0, Lcom/daaw/lq;->d:Lcom/daaw/zf;

    iput-wide p3, p0, Lcom/daaw/lq;->j:J

    return-void
.end method

.method public static synthetic e(Lcom/daaw/lq;)Lcom/daaw/ia$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/lq;->b:Lcom/daaw/ia$a;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/Object;I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/daaw/lq;->g:J

    int-to-long p1, p2

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/daaw/lq;->g:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/Object;)V
    .locals 11

    monitor-enter p0

    :try_start_0
    iget p1, p0, Lcom/daaw/lq;->e:I

    const/4 v0, 0x1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    iget-object p1, p0, Lcom/daaw/lq;->d:Lcom/daaw/zf;

    invoke-interface {p1}, Lcom/daaw/zf;->b()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/daaw/lq;->f:J

    sub-long v3, v1, v3

    long-to-int v6, v3

    iget-wide v3, p0, Lcom/daaw/lq;->h:J

    int-to-long v7, v6

    add-long/2addr v3, v7

    iput-wide v3, p0, Lcom/daaw/lq;->h:J

    iget-wide v3, p0, Lcom/daaw/lq;->i:J

    iget-wide v9, p0, Lcom/daaw/lq;->g:J

    add-long/2addr v3, v9

    iput-wide v3, p0, Lcom/daaw/lq;->i:J

    if-lez v6, :cond_2

    const-wide/16 v3, 0x1f40

    mul-long v3, v3, v9

    div-long/2addr v3, v7

    long-to-float p1, v3

    iget-object v3, p0, Lcom/daaw/lq;->c:Lcom/daaw/yd1;

    long-to-double v4, v9

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-virtual {v3, v4, p1}, Lcom/daaw/yd1;->a(IF)V

    iget-wide v3, p0, Lcom/daaw/lq;->h:J

    const-wide/16 v7, 0x7d0

    cmp-long p1, v3, v7

    if-gez p1, :cond_1

    iget-wide v3, p0, Lcom/daaw/lq;->i:J

    const-wide/32 v7, 0x80000

    cmp-long p1, v3, v7

    if-ltz p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/daaw/lq;->c:Lcom/daaw/yd1;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {p1, v3}, Lcom/daaw/yd1;->d(F)F

    move-result p1

    float-to-long v3, p1

    iput-wide v3, p0, Lcom/daaw/lq;->j:J

    :cond_2
    iget-wide v7, p0, Lcom/daaw/lq;->g:J

    iget-wide v9, p0, Lcom/daaw/lq;->j:J

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Lcom/daaw/lq;->f(IJJ)V

    iget p1, p0, Lcom/daaw/lq;->e:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/lq;->e:I

    if-lez p1, :cond_3

    iput-wide v1, p0, Lcom/daaw/lq;->f:J

    :cond_3
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/lq;->g:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c(Ljava/lang/Object;Lcom/daaw/pp;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iget p1, p0, Lcom/daaw/lq;->e:I

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/lq;->d:Lcom/daaw/zf;

    invoke-interface {p1}, Lcom/daaw/zf;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/lq;->f:J

    :cond_0
    iget p1, p0, Lcom/daaw/lq;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/lq;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d()J
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/daaw/lq;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f(IJJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/lq;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/lq;->b:Lcom/daaw/ia$a;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/lq$a;

    move-object v2, v1

    move-object v3, p0

    move v4, p1

    move-wide v5, p2

    move-wide v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/daaw/lq$a;-><init>(Lcom/daaw/lq;IJJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
