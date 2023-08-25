.class public final Lcom/daaw/oh6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pz5;


# instance fields
.field public final synthetic a:Lcom/daaw/qh6;


# direct methods
.method public constructor <init>(Lcom/daaw/qh6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oh6;->a:Lcom/daaw/qh6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/daaw/j95;

    iget-object v0, p0, Lcom/daaw/oh6;->a:Lcom/daaw/qh6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/oh6;->a:Lcom/daaw/qh6;

    invoke-static {v1, p1}, Lcom/daaw/qh6;->i3(Lcom/daaw/qh6;Lcom/daaw/j95;)V

    sget-object v1, Lcom/daaw/g93;->a3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/j95;->j()Lcom/daaw/hi6;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/oh6;->a:Lcom/daaw/qh6;

    invoke-static {v1}, Lcom/daaw/qh6;->h3(Lcom/daaw/qh6;)Lcom/daaw/gi6;

    move-result-object v1

    iput-object v1, p1, Lcom/daaw/hi6;->a:Lcom/daaw/gi6;

    :cond_0
    iget-object p1, p0, Lcom/daaw/oh6;->a:Lcom/daaw/qh6;

    invoke-static {p1}, Lcom/daaw/qh6;->g3(Lcom/daaw/qh6;)Lcom/daaw/j95;

    move-result-object p1

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

    iget-object v0, p0, Lcom/daaw/oh6;->a:Lcom/daaw/qh6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/oh6;->a:Lcom/daaw/qh6;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/qh6;->i3(Lcom/daaw/qh6;Lcom/daaw/j95;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
