.class final Lcom/google/android/gms/internal/ads/zzbde;
.super Ljava/lang/Object;


# static fields
.field private static final zzdwy:Lcom/google/android/gms/internal/ads/zzbdc;

.field private static final zzdwz:Lcom/google/android/gms/internal/ads/zzbdc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbde;->zzaen()Lcom/google/android/gms/internal/ads/zzbdc;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbde;->zzdwy:Lcom/google/android/gms/internal/ads/zzbdc;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbdd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbdd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbde;->zzdwz:Lcom/google/android/gms/internal/ads/zzbdc;

    return-void
.end method

.method static zzael()Lcom/google/android/gms/internal/ads/zzbdc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbde;->zzdwy:Lcom/google/android/gms/internal/ads/zzbdc;

    return-object v0
.end method

.method static zzaem()Lcom/google/android/gms/internal/ads/zzbdc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbde;->zzdwz:Lcom/google/android/gms/internal/ads/zzbdc;

    return-object v0
.end method

.method private static zzaen()Lcom/google/android/gms/internal/ads/zzbdc;
    .locals 3

    :try_start_0
    const-string v0, "com.google.protobuf.NewInstanceSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbdc;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
