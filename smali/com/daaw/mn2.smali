.class public final Lcom/daaw/mn2;
.super Lcom/daaw/no2;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V
    .locals 7

    const-string v2, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z"

    const-string v3, "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM="

    const/4 v6, 0x5

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/no2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hi2;->k0(J)Lcom/daaw/hi2;

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hi2;->j0(J)Lcom/daaw/hi2;

    iget-object v0, p0, Lcom/daaw/no2;->f:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v3}, Lcom/daaw/wm2;->b()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iget-object v2, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    aget v4, v0, v4

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Lcom/daaw/hi2;->k0(J)Lcom/daaw/hi2;

    iget-object v3, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    aget v1, v0, v1

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Lcom/daaw/hi2;->j0(J)Lcom/daaw/hi2;

    const/4 v1, 0x2

    aget v0, v0, v1

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    int-to-long v3, v0

    invoke-virtual {v1, v3, v4}, Lcom/daaw/hi2;->i0(J)Lcom/daaw/hi2;

    :cond_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
