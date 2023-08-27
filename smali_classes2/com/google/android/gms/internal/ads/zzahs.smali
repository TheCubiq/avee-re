.class public final Lcom/google/android/gms/internal/ads/zzahs;
.super Ljava/lang/Object;


# instance fields
.field private mErrorCode:I

.field private zzbth:Ljava/lang/String;

.field private zzcly:Ljava/lang/String;

.field private zzclz:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzahs;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzahs;->zzbth:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzahs;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzahs;->zzcly:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/ads/zzahs;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzahs;->mErrorCode:I

    return p0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzahs;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzahs;->zzclz:J

    return-wide v0
.end method


# virtual methods
.method public final zzad(I)Lcom/google/android/gms/internal/ads/zzahs;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzahs;->mErrorCode:I

    return-object p0
.end method

.method public final zzcc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzahs;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahs;->zzbth:Ljava/lang/String;

    return-object p0
.end method

.method public final zzcd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzahs;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahs;->zzcly:Ljava/lang/String;

    return-object p0
.end method

.method public final zzg(J)Lcom/google/android/gms/internal/ads/zzahs;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzahs;->zzclz:J

    return-object p0
.end method

.method public final zzpd()Lcom/google/android/gms/internal/ads/zzahq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzahq;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzahq;-><init>(Lcom/google/android/gms/internal/ads/zzahs;Lcom/google/android/gms/internal/ads/zzahr;)V

    return-object v0
.end method
