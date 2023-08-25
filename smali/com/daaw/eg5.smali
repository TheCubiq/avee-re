.class public final Lcom/daaw/eg5;
.super Lcom/daaw/cj3;
.source ""


# instance fields
.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:J

.field public final synthetic s:Lcom/daaw/io6;

.field public final synthetic t:Lcom/daaw/e14;

.field public final synthetic u:Lcom/daaw/fg5;


# direct methods
.method public constructor <init>(Lcom/daaw/fg5;Ljava/lang/Object;Ljava/lang/String;JLcom/daaw/io6;Lcom/daaw/e14;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    iput-object p2, p0, Lcom/daaw/eg5;->p:Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/eg5;->q:Ljava/lang/String;

    iput-wide p4, p0, Lcom/daaw/eg5;->r:J

    iput-object p6, p0, Lcom/daaw/eg5;->s:Lcom/daaw/io6;

    iput-object p7, p0, Lcom/daaw/eg5;->t:Lcom/daaw/e14;

    invoke-direct {p0}, Lcom/daaw/cj3;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/eg5;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    iget-object v2, p0, Lcom/daaw/eg5;->q:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/ag;->b()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/daaw/eg5;->r:J

    sub-long/2addr v3, v5

    long-to-int v4, v3

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, p1, v4}, Lcom/daaw/fg5;->k(Lcom/daaw/fg5;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    invoke-static {v1}, Lcom/daaw/fg5;->d(Lcom/daaw/fg5;)Lcom/daaw/td5;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eg5;->q:Ljava/lang/String;

    const-string v4, "error"

    invoke-virtual {v1, v2, v4}, Lcom/daaw/td5;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    invoke-static {v1}, Lcom/daaw/fg5;->c(Lcom/daaw/fg5;)Lcom/daaw/wx4;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eg5;->q:Ljava/lang/String;

    const-string v4, "error"

    invoke-virtual {v1, v2, v4}, Lcom/daaw/wx4;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    invoke-static {v1}, Lcom/daaw/fg5;->e(Lcom/daaw/fg5;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eg5;->s:Lcom/daaw/io6;

    invoke-interface {v2, p1}, Lcom/daaw/io6;->m(Ljava/lang/String;)Lcom/daaw/io6;

    invoke-interface {v2, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v2}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    iget-object p1, p0, Lcom/daaw/eg5;->t:Lcom/daaw/e14;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzf()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/eg5;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    iget-object v2, p0, Lcom/daaw/eg5;->q:Ljava/lang/String;

    const-string v3, ""

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/ag;->b()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/eg5;->r:J

    sub-long/2addr v4, v6

    long-to-int v5, v4

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3, v5}, Lcom/daaw/fg5;->k(Lcom/daaw/fg5;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    invoke-static {v1}, Lcom/daaw/fg5;->d(Lcom/daaw/fg5;)Lcom/daaw/td5;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eg5;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/daaw/td5;->d(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    invoke-static {v1}, Lcom/daaw/fg5;->c(Lcom/daaw/fg5;)Lcom/daaw/wx4;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eg5;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/daaw/wx4;->l(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/eg5;->u:Lcom/daaw/fg5;

    invoke-static {v1}, Lcom/daaw/fg5;->e(Lcom/daaw/fg5;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/eg5;->s:Lcom/daaw/io6;

    invoke-interface {v2, v4}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v2}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    iget-object v1, p0, Lcom/daaw/eg5;->t:Lcom/daaw/e14;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
