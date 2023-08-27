.class public final Lcom/google/android/gms/internal/ads/zzbfl;
.super Ljava/lang/Object;


# static fields
.field private static final zzebu:I = 0xb

.field private static final zzebv:I = 0xc

.field private static final zzebw:I = 0x10

.field private static final zzebx:I = 0x1a

.field public static final zzeby:[I

.field public static final zzebz:[J

.field private static final zzeca:[F

.field private static final zzecb:[D

.field private static final zzecc:[Z

.field public static final zzecd:[Ljava/lang/String;

.field public static final zzece:[[B

.field public static final zzecf:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbfl;->zzeby:[I

    new-array v1, v0, [J

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbfl;->zzebz:[J

    new-array v1, v0, [F

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbfl;->zzeca:[F

    new-array v1, v0, [D

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbfl;->zzecb:[D

    new-array v1, v0, [Z

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbfl;->zzecc:[Z

    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbfl;->zzecd:[Ljava/lang/String;

    new-array v1, v0, [[B

    sput-object v1, Lcom/google/android/gms/internal/ads/zzbfl;->zzece:[[B

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbfl;->zzecf:[B

    return-void
.end method

.method public static final zzb(Lcom/google/android/gms/internal/ads/zzbez;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->getPosition()I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzbq(I)Z

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzabk()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzbq(I)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzac(II)V

    return v1
.end method
