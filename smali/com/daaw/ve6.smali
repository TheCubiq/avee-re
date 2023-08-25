.class public final Lcom/daaw/ve6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/fk6;

.field public final b:Lcom/daaw/rp4;

.field public final c:Ljava/util/concurrent/Executor;

.field public d:Lcom/daaw/ue6;


# direct methods
.method public constructor <init>(Lcom/daaw/fk6;Lcom/daaw/rp4;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ve6;->a:Lcom/daaw/fk6;

    iput-object p2, p0, Lcom/daaw/ve6;->b:Lcom/daaw/rp4;

    iput-object p3, p0, Lcom/daaw/ve6;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/ve6;)Lcom/daaw/ue6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ve6;->d:Lcom/daaw/ue6;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/ve6;)Lcom/daaw/rk6;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ve6;->e()Lcom/daaw/rk6;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/ve6;Lcom/daaw/ue6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ve6;->d:Lcom/daaw/ue6;

    return-void
.end method


# virtual methods
.method public final c()Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ve6;->d:Lcom/daaw/ue6;

    if-nez v0, :cond_1

    sget-object v0, Lcom/daaw/lb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/ue6;

    invoke-virtual {p0}, Lcom/daaw/ve6;->e()Lcom/daaw/rk6;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/daaw/ue6;-><init>(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/rk6;Lcom/daaw/te6;)V

    iput-object v0, p0, Lcom/daaw/ve6;->d:Lcom/daaw/ue6;

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ve6;->b:Lcom/daaw/rp4;

    invoke-interface {v0}, Lcom/daaw/rp4;->zzb()Lcom/daaw/jn4;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ve6;->a:Lcom/daaw/fk6;

    invoke-interface {v1}, Lcom/daaw/fk6;->zza()Lcom/google/android/gms/internal/ads/zzfkz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/jn4;->e(Lcom/google/android/gms/internal/ads/zzfkz;)Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object v0

    new-instance v1, Lcom/daaw/se6;

    invoke-direct {v1, p0}, Lcom/daaw/se6;-><init>(Lcom/daaw/ve6;)V

    iget-object v2, p0, Lcom/daaw/ve6;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/re6;

    invoke-direct {v1, p0}, Lcom/daaw/re6;-><init>(Lcom/daaw/ve6;)V

    const-class v2, Lcom/daaw/pk5;

    iget-object v3, p0, Lcom/daaw/ve6;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1, v3}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/daaw/qe6;->a:Lcom/daaw/qe6;

    iget-object v2, p0, Lcom/daaw/ve6;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/daaw/rk6;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/ve6;->b:Lcom/daaw/rp4;

    invoke-interface {v0}, Lcom/daaw/rp4;->zzg()Lcom/daaw/ri6;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v2, v0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/ri6;->j:Lcom/google/android/gms/ads/internal/client/zzw;

    iget-object v3, p0, Lcom/daaw/ve6;->a:Lcom/daaw/fk6;

    invoke-interface {v3, v1, v2, v0}, Lcom/daaw/fk6;->c(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzw;)Lcom/daaw/rk6;

    move-result-object v0

    return-object v0
.end method
