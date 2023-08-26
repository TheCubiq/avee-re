.class public final Lcom/google/android/gms/internal/ads/zzbfg;
.super Ljava/lang/Object;


# static fields
.field private static final ISO_8859_1:Ljava/nio/charset/Charset;

.field protected static final UTF_8:Ljava/nio/charset/Charset;

.field public static final zzebs:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbfg;->UTF_8:Ljava/nio/charset/Charset;

    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbfg;->ISO_8859_1:Ljava/nio/charset/Charset;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbfg;->zzebs:Ljava/lang/Object;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzbfc;Lcom/google/android/gms/internal/ads/zzbfc;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbfc;->zzebk:Lcom/google/android/gms/internal/ads/zzbfe;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzbfc;->zzebk:Lcom/google/android/gms/internal/ads/zzbfe;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbfe;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbfe;

    iput-object p0, p1, Lcom/google/android/gms/internal/ads/zzbfc;->zzebk:Lcom/google/android/gms/internal/ads/zzbfe;

    :cond_0
    return-void
.end method
