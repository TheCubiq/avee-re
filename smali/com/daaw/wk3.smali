.class public final Lcom/daaw/wk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g14;


# instance fields
.field public final synthetic a:Lcom/daaw/il3;

.field public final synthetic b:Lcom/daaw/io6;

.field public final synthetic c:Lcom/daaw/jl3;


# direct methods
.method public constructor <init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/io6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wk3;->c:Lcom/daaw/jl3;

    iput-object p2, p0, Lcom/daaw/wk3;->a:Lcom/daaw/il3;

    iput-object p3, p0, Lcom/daaw/wk3;->b:Lcom/daaw/io6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/wk3;->c:Lcom/daaw/jl3;

    invoke-static {v0}, Lcom/daaw/jl3;->f(Lcom/daaw/jl3;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/wk3;->c:Lcom/daaw/jl3;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/daaw/jl3;->h(Lcom/daaw/jl3;I)V

    const-string v1, "Failed loading new engine. Marking new engine destroyable."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/wk3;->a:Lcom/daaw/il3;

    invoke-virtual {v1}, Lcom/daaw/il3;->g()V

    sget-object v1, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/wk3;->c:Lcom/daaw/jl3;

    invoke-static {v1}, Lcom/daaw/jl3;->e(Lcom/daaw/jl3;)Lcom/daaw/vo6;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/jl3;->e(Lcom/daaw/jl3;)Lcom/daaw/vo6;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wk3;->b:Lcom/daaw/io6;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v2}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
