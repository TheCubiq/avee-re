.class public final Lcom/google/android/gms/internal/ads/zzbsl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzbsl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:I

.field public final q:I

.field public final r:Ljava/lang/String;

.field public final s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/kj3;

    invoke-direct {v0}, Lcom/daaw/kj3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbsl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbsl;->p:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbsl;->q:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbsl;->r:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzbsl;->s:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/daaw/z71;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbsl;->q:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbsl;->r:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/daaw/z71;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbsl;->s:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbsl;->p:I

    const/16 v1, 0x3e8

    invoke-static {p1, v1, v0}, Lcom/daaw/z71;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lcom/daaw/z71;->b(Landroid/os/Parcel;I)V

    return-void
.end method
