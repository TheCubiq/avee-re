.class public final Lcom/google/android/gms/internal/ads/zzaft;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private zzchp:Ljava/lang/String;

.field private zzchq:Ljava/lang/String;

.field private zzchr:Lcom/google/android/gms/internal/ads/zzaoj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzaoj<",
            "Lcom/google/android/gms/internal/ads/zzafz;",
            ">;"
        }
    .end annotation
.end field

.field private final zzchs:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final zzcht:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final zzchu:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaft;->mLock:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchr:Lcom/google/android/gms/internal/ads/zzaoj;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzafu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzafu;-><init>(Lcom/google/android/gms/internal/ads/zzaft;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchs:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzafv;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzafv;-><init>(Lcom/google/android/gms/internal/ads/zzaft;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzcht:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzafw;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzafw;-><init>(Lcom/google/android/gms/internal/ads/zzaft;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaft;->mContext:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchq:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchp:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzaft;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzaft;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzaft;)Lcom/google/android/gms/internal/ads/zzaoj;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchr:Lcom/google/android/gms/internal/ads/zzaoj;

    return-object p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/ads/zzaft;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchp:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzaft;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzaft;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/ads/zzaft;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzaft;->zzchq:Ljava/lang/String;

    return-object p0
.end method
