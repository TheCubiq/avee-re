.class final Lcom/google/android/gms/internal/measurement/zzft;
.super Lcom/google/android/gms/internal/measurement/zzff;
.source "com.google.android.gms:play-services-measurement-impl@@17.5.0"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/measurement/zzff<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final transient zza:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field private transient zzb:I


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzff;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdw;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzff;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzb:I

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzb:I

    if-nez v0, :cond_0

    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzb:I

    :cond_0
    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzex;->zzb()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x5b

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final zza()Z
    .locals 1

    .line 21
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zzb:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzb([Ljava/lang/Object;I)I
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    aput-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    return p2
.end method

.method public final zzb()Lcom/google/android/gms/internal/measurement/zzfs;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/measurement/zzfs<",
            "TE;>;"
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    .line 11
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzfg;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzfg;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method

.method final zzg()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final zzh()Lcom/google/android/gms/internal/measurement/zzew;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/measurement/zzew<",
            "TE;>;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzft;->zza:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzew;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzew;

    move-result-object v0

    return-object v0
.end method
