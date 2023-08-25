.class public final Lcom/daaw/yn2;
.super Lcom/daaw/no2;
.source ""


# instance fields
.field public final i:Lcom/daaw/wl2;

.field public final j:J

.field public final k:J


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;IILcom/daaw/wl2;JJ)V
    .locals 8

    move-object v7, p0

    const-string v2, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E"

    const-string v3, "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8="

    const/16 v6, 0xb

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/no2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    move-object v0, p7

    iput-object v0, v7, Lcom/daaw/yn2;->i:Lcom/daaw/wl2;

    move-wide/from16 v0, p8

    iput-wide v0, v7, Lcom/daaw/yn2;->j:J

    move-wide/from16 v0, p10

    iput-wide v0, v7, Lcom/daaw/yn2;->k:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/yn2;->i:Lcom/daaw/wl2;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/daaw/no2;->f:Ljava/lang/reflect/Method;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Lcom/daaw/wl2;->b()Landroid/net/NetworkCapabilities;

    move-result-object v0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    iget-wide v3, p0, Lcom/daaw/yn2;->j:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x2

    iget-wide v3, p0, Lcom/daaw/yn2;->k:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x0

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lcom/daaw/ul2;

    invoke-direct {v1, v0}, Lcom/daaw/ul2;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v3, v1, Lcom/daaw/ul2;->a:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/daaw/hi2;->x0(J)Lcom/daaw/hi2;

    iget-object v2, v1, Lcom/daaw/ul2;->b:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    iget-object v2, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v3, v1, Lcom/daaw/ul2;->b:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Lcom/daaw/hi2;->I(J)Lcom/daaw/hi2;

    :cond_0
    iget-object v2, v1, Lcom/daaw/ul2;->c:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    iget-object v2, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v1, v1, Lcom/daaw/ul2;->c:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/daaw/hi2;->d0(J)Lcom/daaw/hi2;

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    return-void
.end method
