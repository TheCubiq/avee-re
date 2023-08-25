.class public final Lcom/daaw/y44;
.super Lcom/google/android/gms/ads/internal/util/zzb;
.source ""


# instance fields
.field public final c:Lcom/daaw/y24;

.field public final d:Lcom/daaw/j54;

.field public final e:Ljava/lang/String;

.field public final f:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/y24;Lcom/daaw/j54;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/util/zzb;-><init>()V

    iput-object p1, p0, Lcom/daaw/y44;->c:Lcom/daaw/y24;

    iput-object p2, p0, Lcom/daaw/y44;->d:Lcom/daaw/j54;

    iput-object p3, p0, Lcom/daaw/y44;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/y44;->f:[Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzy()Lcom/daaw/z44;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/z44;->e(Lcom/daaw/y44;)V

    return-void
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/daaw/y44;->d:Lcom/daaw/j54;

    iget-object v1, p0, Lcom/daaw/y44;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/y44;->f:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/j54;->u(Ljava/lang/String;[Ljava/lang/String;Lcom/daaw/y44;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y44;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final zza()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/y44;->d:Lcom/daaw/j54;

    iget-object v1, p0, Lcom/daaw/y44;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/y44;->f:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/j54;->t(Ljava/lang/String;[Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v1, Lcom/daaw/x44;

    invoke-direct {v1, p0}, Lcom/daaw/x44;-><init>(Lcom/daaw/y44;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v2, Lcom/daaw/x44;

    invoke-direct {v2, p0}, Lcom/daaw/x44;-><init>(Lcom/daaw/y44;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    sget-object v0, Lcom/daaw/g93;->M1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/y44;->d:Lcom/daaw/j54;

    instance-of v0, v0, Lcom/daaw/s54;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/w44;

    invoke-direct {v1, p0}, Lcom/daaw/w44;-><init>(Lcom/daaw/y44;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/util/zzb;->zzb()Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
