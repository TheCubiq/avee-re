.class public abstract Lcom/google/android/gms/internal/ads/zzajx;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzalc;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzalc<",
        "Lcom/google/android/gms/internal/ads/zzanz;",
        ">;"
    }
.end annotation


# instance fields
.field private volatile zzcqr:Ljava/lang/Thread;

.field private zzcqs:Z

.field private final zzy:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzajy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzajy;-><init>(Lcom/google/android/gms/internal/ads/zzajx;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzy:Ljava/lang/Runnable;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzcqs:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzajy;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzajy;-><init>(Lcom/google/android/gms/internal/ads/zzajx;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzy:Ljava/lang/Runnable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzcqs:Z

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzajx;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzcqr:Ljava/lang/Thread;

    return-object p1
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzajx;->onStop()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzcqr:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzcqr:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method

.method public abstract onStop()V
.end method

.method public abstract zzdn()V
.end method

.method public final synthetic zznt()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzcqs:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzy:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaki;->zzc(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzy:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaki;->zzb(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v0

    return-object v0
.end method

.method public final zzqo()Lcom/google/android/gms/internal/ads/zzanz;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzcqs:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzy:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaki;->zzc(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajx;->zzy:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaki;->zzb(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v0

    return-object v0
.end method
