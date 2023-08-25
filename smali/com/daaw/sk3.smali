.class public final Lcom/daaw/sk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/bk3;

.field public final synthetic b:Lcom/google/android/gms/ads/internal/util/zzca;

.field public final synthetic c:Lcom/daaw/jl3;


# direct methods
.method public constructor <init>(Lcom/daaw/jl3;Lcom/daaw/sl2;Lcom/daaw/bk3;Lcom/google/android/gms/ads/internal/util/zzca;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sk3;->c:Lcom/daaw/jl3;

    iput-object p3, p0, Lcom/daaw/sk3;->a:Lcom/daaw/bk3;

    iput-object p4, p0, Lcom/daaw/sk3;->b:Lcom/google/android/gms/ads/internal/util/zzca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    check-cast p1, Lcom/daaw/kl3;

    iget-object p1, p0, Lcom/daaw/sk3;->c:Lcom/daaw/jl3;

    invoke-static {p1}, Lcom/daaw/jl3;->f(Lcom/daaw/jl3;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    const-string p2, "JS Engine is requesting an update"

    invoke-static {p2}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/sk3;->c:Lcom/daaw/jl3;

    invoke-static {p2}, Lcom/daaw/jl3;->a(Lcom/daaw/jl3;)I

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "Starting reload."

    invoke-static {p2}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/sk3;->c:Lcom/daaw/jl3;

    const/4 v0, 0x2

    invoke-static {p2, v0}, Lcom/daaw/jl3;->h(Lcom/daaw/jl3;I)V

    iget-object p2, p0, Lcom/daaw/sk3;->c:Lcom/daaw/jl3;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/daaw/jl3;->d(Lcom/daaw/sl2;)Lcom/daaw/il3;

    :cond_0
    iget-object p2, p0, Lcom/daaw/sk3;->a:Lcom/daaw/bk3;

    const-string v0, "/requestReload"

    iget-object v1, p0, Lcom/daaw/sk3;->b:Lcom/google/android/gms/ads/internal/util/zzca;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/util/zzca;->zza()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/kl3;->d0(Ljava/lang/String;Lcom/daaw/zg3;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
