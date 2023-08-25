.class public final Lcom/google/android/gms/internal/ads/zzftj;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzftj;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:I

.field public q:Lcom/daaw/fj2;

.field public r:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/st6;

    invoke-direct {v0}, Lcom/daaw/st6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzftj;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzftj;->p:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzftj;->q:Lcom/daaw/fj2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzftj;->zzb()V

    return-void
.end method


# virtual methods
.method public final h()Lcom/daaw/fj2;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->q:Lcom/daaw/fj2;

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/fj2;->G0([BLcom/daaw/vr7;)Lcom/daaw/fj2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->q:Lcom/daaw/fj2;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzftj;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->q:Lcom/daaw/fj2;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->p:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->q:Lcom/daaw/fj2;

    invoke-virtual {v0}, Lcom/daaw/hq7;->a()[B

    move-result-object v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->f(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, p2}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzb()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->q:Lcom/daaw/fj2;

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - full"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftj;->r:[B

    if-nez v0, :cond_6

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Impossible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
