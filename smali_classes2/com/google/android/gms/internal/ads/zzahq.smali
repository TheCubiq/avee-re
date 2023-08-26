.class public final Lcom/google/android/gms/internal/ads/zzahq;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field public final errorCode:I

.field public final zzbru:Ljava/lang/String;

.field public final zzbub:J

.field private final zzclx:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzahs;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzahs;->zza(Lcom/google/android/gms/internal/ads/zzahs;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzahq;->zzclx:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzahs;->zzb(Lcom/google/android/gms/internal/ads/zzahs;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzahq;->zzbru:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzahs;->zzc(Lcom/google/android/gms/internal/ads/zzahs;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzahq;->errorCode:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzahs;->zzd(Lcom/google/android/gms/internal/ads/zzahs;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzahq;->zzbub:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzahs;Lcom/google/android/gms/internal/ads/zzahr;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzahq;-><init>(Lcom/google/android/gms/internal/ads/zzahs;)V

    return-void
.end method
