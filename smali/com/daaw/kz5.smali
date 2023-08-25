.class public final Lcom/daaw/kz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pz5;


# instance fields
.field public final synthetic a:Lcom/daaw/lz5;


# direct methods
.method public constructor <init>(Lcom/daaw/lz5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kz5;->a:Lcom/daaw/lz5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/kz5;->a:Lcom/daaw/lz5;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/kz5;->a:Lcom/daaw/lz5;

    move-object v2, p1

    check-cast v2, Lcom/daaw/zl4;

    invoke-virtual {v2}, Lcom/daaw/zl4;->c()Lcom/daaw/eq4;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/daaw/lz5;->c(Lcom/daaw/lz5;Lcom/google/android/gms/ads/internal/client/zzdn;)V

    check-cast p1, Lcom/daaw/zl4;

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
    .locals 2

    iget-object v0, p0, Lcom/daaw/kz5;->a:Lcom/daaw/lz5;

    monitor-enter v0

    :try_start_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
