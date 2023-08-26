.class final Lcom/google/android/gms/internal/ads/zzavj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzayn;


# instance fields
.field private final zzdic:Ljava/lang/String;

.field private final zzdid:I

.field private zzdie:Lcom/google/android/gms/internal/ads/zzawe;

.field private zzdif:Lcom/google/android/gms/internal/ads/zzavo;

.field private zzdig:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaxn;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxn;->zzyw()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdic:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxn;->zzyx()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzawg;->zzt(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzawg;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzauo;->zzb(Lcom/google/android/gms/internal/ads/zzaxn;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawe;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdie:Lcom/google/android/gms/internal/ads/zzawe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzawg;->getKeySize()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdid:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzbbu; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdic:Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxn;->zzyx()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzavq;->zzj(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzavq;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzauo;->zzb(Lcom/google/android/gms/internal/ads/zzaxn;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzavo;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdif:Lcom/google/android/gms/internal/ads/zzavo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzavq;->zzwr()Lcom/google/android/gms/internal/ads/zzavu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzavu;->getKeySize()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdig:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzavq;->zzws()Lcom/google/android/gms/internal/ads/zzaxe;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaxe;->getKeySize()I

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdig:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdid:I
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzbbu; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unsupported AEAD DEM key type: "

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdic:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final zzi([B)Lcom/google/android/gms/internal/ads/zzatz;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    array-length v0, p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdid:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdic:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawe;->zzxk()Lcom/google/android/gms/internal/ads/zzawe$zza;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdie:Lcom/google/android/gms/internal/ads/zzawe;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zza(Lcom/google/android/gms/internal/ads/zzbbo;)Lcom/google/android/gms/internal/ads/zzbbo$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzawe$zza;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdid:I

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzbah;->zzc([BII)Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzawe$zza;->zzs(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzawe$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawe;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdic:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzauo;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbcu;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzatz;

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdic:Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdig:I

    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdig:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdid:I

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzavs;->zzww()Lcom/google/android/gms/internal/ads/zzavs$zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdif:Lcom/google/android/gms/internal/ads/zzavo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzavo;->zzwn()Lcom/google/android/gms/internal/ads/zzavs;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zza(Lcom/google/android/gms/internal/ads/zzbbo;)Lcom/google/android/gms/internal/ads/zzbbo$zza;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzavs$zza;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbah;->zzo([B)Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzavs$zza;->zzm(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzavs$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzavs;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxc;->zzyn()Lcom/google/android/gms/internal/ads/zzaxc$zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdif:Lcom/google/android/gms/internal/ads/zzavo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzavo;->zzwo()Lcom/google/android/gms/internal/ads/zzaxc;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zza(Lcom/google/android/gms/internal/ads/zzbbo;)Lcom/google/android/gms/internal/ads/zzbbo$zza;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaxc$zza;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbah;->zzo([B)Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzaxc$zza;->zzaf(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaxc$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaxc;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzavo;->zzwp()Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdif:Lcom/google/android/gms/internal/ads/zzavo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzavo;->getVersion()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzavo$zza;->zzal(I)Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzavo$zza;->zzb(Lcom/google/android/gms/internal/ads/zzavs;)Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzavo$zza;->zzb(Lcom/google/android/gms/internal/ads/zzaxc;)Lcom/google/android/gms/internal/ads/zzavo$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzavo;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown DEM key type"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Symmetric key has incorrect length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final zzwm()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzavj;->zzdid:I

    return v0
.end method
