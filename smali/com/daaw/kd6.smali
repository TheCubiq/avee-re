.class public final Lcom/daaw/kd6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pz5;


# instance fields
.field public final synthetic a:Lcom/daaw/ld6;


# direct methods
.method public constructor <init>(Lcom/daaw/ld6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kd6;->a:Lcom/daaw/ld6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 5

    check-cast p1, Lcom/daaw/si4;

    iget-object v0, p0, Lcom/daaw/kd6;->a:Lcom/daaw/ld6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/kd6;->a:Lcom/daaw/ld6;

    iget-object v1, v1, Lcom/daaw/ld6;->y:Lcom/daaw/si4;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/zl4;->a()V

    :cond_0
    iget-object v1, p0, Lcom/daaw/kd6;->a:Lcom/daaw/ld6;

    iput-object p1, v1, Lcom/daaw/ld6;->y:Lcom/daaw/si4;

    invoke-virtual {p1, v1}, Lcom/daaw/si4;->i(Lcom/daaw/j23;)V

    iget-object v1, p0, Lcom/daaw/kd6;->a:Lcom/daaw/ld6;

    invoke-static {v1}, Lcom/daaw/ld6;->g3(Lcom/daaw/ld6;)Lcom/daaw/dd6;

    move-result-object v2

    new-instance v3, Lcom/daaw/ti4;

    invoke-static {v1}, Lcom/daaw/ld6;->g3(Lcom/daaw/ld6;)Lcom/daaw/dd6;

    move-result-object v4

    invoke-direct {v3, p1, v1, v4}, Lcom/daaw/ti4;-><init>(Lcom/daaw/si4;Lcom/google/android/gms/ads/internal/client/zzbu;Lcom/daaw/dd6;)V

    invoke-virtual {v2, v3}, Lcom/daaw/dd6;->k(Lcom/daaw/p23;)V

    invoke-virtual {p1}, Lcom/daaw/zl4;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/kd6;->a:Lcom/daaw/ld6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/kd6;->a:Lcom/daaw/ld6;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/daaw/ld6;->y:Lcom/daaw/si4;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
