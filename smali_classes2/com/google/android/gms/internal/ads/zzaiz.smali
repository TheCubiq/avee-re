.class final synthetic Lcom/google/android/gms/internal/ads/zzaiz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final zzcnx:Lcom/google/android/gms/internal/ads/zzaiy;

.field private final zzcny:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaiy;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaiz;->zzcnx:Lcom/google/android/gms/internal/ads/zzaiy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaiz;->zzcny:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiz;->zzcnx:Lcom/google/android/gms/internal/ads/zzaiy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaiz;->zzcny:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaiy;->zzad(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
