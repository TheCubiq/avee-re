.class Lcom/google/android/gms/internal/ads/zzaus;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaug;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzaug<",
        "Lcom/google/android/gms/internal/ads/zzatz;",
        ">;"
    }
.end annotation


# static fields
.field private static final logger:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ads/zzaus;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaus;->logger:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaut;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaut;-><init>()V

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzauo;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaug;)V

    return-void
.end method

.method private final zzd(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzatz;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzavo;->zzi(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzavo;

    move-result-object p1

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzavo;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzavo;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->getVersion()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzazq;->zzj(II)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayx;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->zzwn()Lcom/google/android/gms/internal/ads/zzavs;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzauo;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbcu;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzazi;

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->zzwo()Lcom/google/android/gms/internal/ads/zzaxc;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzauo;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbcu;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzauk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->zzwo()Lcom/google/android/gms/internal/ads/zzaxc;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxc;->zzym()Lcom/google/android/gms/internal/ads/zzaxg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxg;->zzyt()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzayx;-><init>(Lcom/google/android/gms/internal/ads/zzazi;Lcom/google/android/gms/internal/ads/zzauk;I)V

    check-cast v0, Lcom/google/android/gms/internal/ads/zzatz;

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesCtrHmacAeadKey proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzbbu; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected serialized AesCtrHmacAeadKey proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final getVersion()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzbah;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaus;->zzd(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzatz;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzbcu;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzavo;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzavo;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->getVersion()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzazq;->zzj(II)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayx;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->zzwn()Lcom/google/android/gms/internal/ads/zzavs;

    move-result-object v1

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzauo;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbcu;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzazi;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->zzwo()Lcom/google/android/gms/internal/ads/zzaxc;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzauo;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbcu;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzauk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavo;->zzwo()Lcom/google/android/gms/internal/ads/zzaxc;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxc;->zzym()Lcom/google/android/gms/internal/ads/zzaxg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxg;->zzyt()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzayx;-><init>(Lcom/google/android/gms/internal/ads/zzazi;Lcom/google/android/gms/internal/ads/zzauk;I)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesCtrHmacAeadKey proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzbcu;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzavq;->zzj(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzavq;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzaus;->zzb(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzbbu; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected serialized AesCtrHmacAeadKeyFormat proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzavq;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzavq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavq;->zzwr()Lcom/google/android/gms/internal/ads/zzavu;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzauo;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzavs;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavq;->zzws()Lcom/google/android/gms/internal/ads/zzaxe;

    move-result-object p1

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zzauo;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaxc;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzavo;->zzwp()Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzavo$zza;->zzb(Lcom/google/android/gms/internal/ads/zzavs;)Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzavo$zza;->zzb(Lcom/google/android/gms/internal/ads/zzaxc;)Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzavo$zza;->zzal(I)Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbbo;

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesCtrHmacAeadKeyFormat proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaxi;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzaus;->zzb(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzavo;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxi;->zzyz()Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaxi$zza;->zzeb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzazy;->zzaav()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaxi$zza;->zzai(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxi$zzb;->zzdkx:Lcom/google/android/gms/internal/ads/zzaxi$zzb;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaxi$zza;->zzb(Lcom/google/android/gms/internal/ads/zzaxi$zzb;)Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaxi;

    return-object p1
.end method
