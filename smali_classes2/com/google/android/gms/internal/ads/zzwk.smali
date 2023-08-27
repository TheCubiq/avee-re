.class public final Lcom/google/android/gms/internal/ads/zzwk;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# static fields
.field private static final UTF_8:Ljava/nio/charset/Charset;

.field public static final zzbrc:Lcom/google/android/gms/internal/ads/zzwj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzwj<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzbrd:Lcom/google/android/gms/internal/ads/zzwh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzwh<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzwk;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzwm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzwm;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzwk;->zzbrc:Lcom/google/android/gms/internal/ads/zzwj;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzwl;->zzbre:Lcom/google/android/gms/internal/ads/zzwh;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzwk;->zzbrd:Lcom/google/android/gms/internal/ads/zzwh;

    return-void
.end method

.method static final synthetic zzf(Lorg/json/JSONObject;)Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzwk;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method
