.class public final Lcom/daaw/vk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i14;


# instance fields
.field public final synthetic a:Lcom/daaw/il3;

.field public final synthetic b:Lcom/daaw/io6;

.field public final synthetic c:Lcom/daaw/jl3;


# direct methods
.method public constructor <init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/io6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vk3;->c:Lcom/daaw/jl3;

    iput-object p2, p0, Lcom/daaw/vk3;->a:Lcom/daaw/il3;

    iput-object p3, p0, Lcom/daaw/vk3;->b:Lcom/daaw/io6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/daaw/bk3;

    iget-object p1, p0, Lcom/daaw/vk3;->c:Lcom/daaw/jl3;

    invoke-static {p1}, Lcom/daaw/jl3;->f(Lcom/daaw/jl3;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/vk3;->c:Lcom/daaw/jl3;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/jl3;->h(Lcom/daaw/jl3;I)V

    iget-object v0, p0, Lcom/daaw/vk3;->c:Lcom/daaw/jl3;

    invoke-static {v0}, Lcom/daaw/jl3;->c(Lcom/daaw/jl3;)Lcom/daaw/il3;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/vk3;->a:Lcom/daaw/il3;

    invoke-static {v0}, Lcom/daaw/jl3;->c(Lcom/daaw/jl3;)Lcom/daaw/il3;

    move-result-object v0

    if-eq v1, v0, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/vk3;->c:Lcom/daaw/jl3;

    invoke-static {v0}, Lcom/daaw/jl3;->c(Lcom/daaw/jl3;)Lcom/daaw/il3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/il3;->g()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/vk3;->c:Lcom/daaw/jl3;

    iget-object v1, p0, Lcom/daaw/vk3;->a:Lcom/daaw/il3;

    invoke-static {v0, v1}, Lcom/daaw/jl3;->g(Lcom/daaw/jl3;Lcom/daaw/il3;)V

    sget-object v0, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/vk3;->c:Lcom/daaw/jl3;

    invoke-static {v0}, Lcom/daaw/jl3;->e(Lcom/daaw/jl3;)Lcom/daaw/vo6;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/daaw/jl3;->e(Lcom/daaw/jl3;)Lcom/daaw/vo6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/vk3;->b:Lcom/daaw/io6;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v1}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    :cond_1
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
