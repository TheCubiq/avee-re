.class public final Lcom/google/android/gms/ads/internal/client/zzfl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/client/zzfl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Z

.field public final zzb:Z

.field public final zzc:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzfm;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzfm;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/zzfl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/VideoOptions;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/ads/VideoOptions;->getStartMuted()Z

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/VideoOptions;->getCustomControlsRequested()Z

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/VideoOptions;->getClickToExpandRequested()Z

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/ads/internal/client/zzfl;-><init>(ZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/client/zzfl;->zza:Z

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/client/zzfl;->zzb:Z

    iput-boolean p3, p0, Lcom/google/android/gms/ads/internal/client/zzfl;->zzc:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/zzfl;->zza:Z

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/zzfl;->zzb:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/zzfl;->zzc:Z

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
