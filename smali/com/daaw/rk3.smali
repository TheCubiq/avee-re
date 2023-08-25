.class public final Lcom/daaw/rk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/il3;

.field public final synthetic b:Lcom/daaw/bk3;

.field public final synthetic c:Lcom/daaw/jl3;


# direct methods
.method public constructor <init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/bk3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rk3;->c:Lcom/daaw/jl3;

    iput-object p2, p0, Lcom/daaw/rk3;->a:Lcom/daaw/il3;

    iput-object p3, p0, Lcom/daaw/rk3;->b:Lcom/daaw/bk3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    check-cast p1, Lcom/daaw/kl3;

    iget-object p1, p0, Lcom/daaw/rk3;->c:Lcom/daaw/jl3;

    invoke-static {p1}, Lcom/daaw/jl3;->f(Lcom/daaw/jl3;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lcom/daaw/rk3;->a:Lcom/daaw/il3;

    invoke-virtual {p2}, Lcom/daaw/l14;->a()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    iget-object p2, p0, Lcom/daaw/rk3;->a:Lcom/daaw/il3;

    invoke-virtual {p2}, Lcom/daaw/l14;->a()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/rk3;->c:Lcom/daaw/jl3;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/daaw/jl3;->h(Lcom/daaw/jl3;I)V

    iget-object p2, p0, Lcom/daaw/rk3;->b:Lcom/daaw/bk3;

    const-string v0, "/log"

    sget-object v1, Lcom/daaw/yg3;->g:Lcom/daaw/zg3;

    invoke-interface {p2, v0, v1}, Lcom/daaw/kl3;->B0(Ljava/lang/String;Lcom/daaw/zg3;)V

    const-string v0, "/result"

    sget-object v1, Lcom/daaw/yg3;->o:Lcom/daaw/nh3;

    invoke-interface {p2, v0, v1}, Lcom/daaw/kl3;->B0(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object p2, p0, Lcom/daaw/rk3;->a:Lcom/daaw/il3;

    iget-object v0, p0, Lcom/daaw/rk3;->b:Lcom/daaw/bk3;

    invoke-virtual {p2, v0}, Lcom/daaw/l14;->d(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/daaw/rk3;->c:Lcom/daaw/jl3;

    iget-object v0, p0, Lcom/daaw/rk3;->a:Lcom/daaw/il3;

    invoke-static {p2, v0}, Lcom/daaw/jl3;->g(Lcom/daaw/jl3;Lcom/daaw/il3;)V

    const-string p2, "Successfully loaded JS Engine."

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :cond_1
    :goto_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
