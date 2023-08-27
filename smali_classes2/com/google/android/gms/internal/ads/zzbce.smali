.class abstract Lcom/google/android/gms/internal/ads/zzbce;
.super Ljava/lang/Object;


# static fields
.field private static final zzdvq:Lcom/google/android/gms/internal/ads/zzbce;

.field private static final zzdvr:Lcom/google/android/gms/internal/ads/zzbce;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbcg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcg;-><init>(Lcom/google/android/gms/internal/ads/zzbcf;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbce;->zzdvq:Lcom/google/android/gms/internal/ads/zzbce;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbch;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbch;-><init>(Lcom/google/android/gms/internal/ads/zzbcf;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbce;->zzdvr:Lcom/google/android/gms/internal/ads/zzbce;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbcf;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbce;-><init>()V

    return-void
.end method

.method static zzady()Lcom/google/android/gms/internal/ads/zzbce;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbce;->zzdvq:Lcom/google/android/gms/internal/ads/zzbce;

    return-object v0
.end method

.method static zzadz()Lcom/google/android/gms/internal/ads/zzbce;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbce;->zzdvr:Lcom/google/android/gms/internal/ads/zzbce;

    return-object v0
.end method


# virtual methods
.method abstract zza(Ljava/lang/Object;J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "T",
            "L;",
            ">;"
        }
    .end annotation
.end method

.method abstract zza(Ljava/lang/Object;Ljava/lang/Object;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation
.end method

.method abstract zzb(Ljava/lang/Object;J)V
.end method
