.class public final Lcom/daaw/at4;
.super Lcom/daaw/kw4;
.source ""

# interfaces
.implements Lcom/daaw/ir4;
.implements Lcom/daaw/qs4;


# instance fields
.field public final q:Lcom/daaw/th6;

.field public final r:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/daaw/th6;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/kw4;-><init>(Ljava/util/Set;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lcom/daaw/at4;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Lcom/daaw/at4;->q:Lcom/daaw/th6;

    return-void
.end method


# virtual methods
.method public final synthetic C0(Lcom/daaw/ct4;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/at4;->q:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->g0:Lcom/google/android/gms/ads/internal/client/zzs;

    invoke-interface {p1, v0}, Lcom/daaw/ct4;->f(Lcom/google/android/gms/ads/internal/client/zzs;)V

    return-void
.end method

.method public final zzb()V
    .locals 3

    sget-object v0, Lcom/daaw/g93;->Y6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/at4;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/at4;->q:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->g0:Lcom/google/android/gms/ads/internal/client/zzs;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/zzs;->zza:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/daaw/zs4;

    invoke-direct {v0, p0}, Lcom/daaw/zs4;-><init>(Lcom/daaw/at4;)V

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    :cond_0
    return-void
.end method

.method public final zzh()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/at4;->q:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/at4;->zzb()V

    :cond_0
    return-void
.end method

.method public final zzl()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/at4;->q:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/at4;->zzb()V

    return-void
.end method
