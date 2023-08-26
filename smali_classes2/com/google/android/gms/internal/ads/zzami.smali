.class public final Lcom/google/android/gms/internal/ads/zzami;
.super Lcom/google/android/gms/internal/ads/zzajx;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final zzag:Ljava/lang/String;

.field private final zzctw:Lcom/google/android/gms/internal/ads/zzanf;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/zzakk;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzakk;->zzm(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p3, p1}, Lcom/google/android/gms/internal/ads/zzami;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajx;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzanf;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzanf;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzctw:Lcom/google/android/gms/internal/ads/zzanf;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onStop()V
    .locals 0

    return-void
.end method

.method public final zzdn()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzctw:Lcom/google/android/gms/internal/ads/zzanf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzanf;->zzcz(Ljava/lang/String;)V

    return-void
.end method
