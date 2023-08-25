.class public final Lcom/daaw/uw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/zzf;


# instance fields
.field public final a:Lcom/daaw/jq4;

.field public final b:Lcom/daaw/gr4;

.field public final c:Lcom/daaw/xy4;

.field public final d:Lcom/daaw/ny4;

.field public final e:Lcom/daaw/ah4;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/daaw/jq4;Lcom/daaw/gr4;Lcom/daaw/xy4;Lcom/daaw/ny4;Lcom/daaw/ah4;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/daaw/uw5;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/daaw/uw5;->a:Lcom/daaw/jq4;

    iput-object p2, p0, Lcom/daaw/uw5;->b:Lcom/daaw/gr4;

    iput-object p3, p0, Lcom/daaw/uw5;->c:Lcom/daaw/xy4;

    iput-object p4, p0, Lcom/daaw/uw5;->d:Lcom/daaw/ny4;

    iput-object p5, p0, Lcom/daaw/uw5;->e:Lcom/daaw/ah4;

    return-void
.end method


# virtual methods
.method public final declared-synchronized zza(Landroid/view/View;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/uw5;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/uw5;->e:Lcom/daaw/ah4;

    invoke-virtual {v0}, Lcom/daaw/ah4;->zzl()V

    iget-object v0, p0, Lcom/daaw/uw5;->d:Lcom/daaw/ny4;

    invoke-virtual {v0, p1}, Lcom/daaw/ny4;->C0(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uw5;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/uw5;->a:Lcom/daaw/jq4;

    invoke-virtual {v0}, Lcom/daaw/jq4;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uw5;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/uw5;->b:Lcom/daaw/gr4;

    invoke-virtual {v0}, Lcom/daaw/gr4;->zza()V

    iget-object v0, p0, Lcom/daaw/uw5;->c:Lcom/daaw/xy4;

    invoke-virtual {v0}, Lcom/daaw/xy4;->zza()V

    :cond_0
    return-void
.end method
