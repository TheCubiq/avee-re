.class public final Lcom/google/android/gms/ads/internal/client/zzdv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 5

    invoke-static {p1}, Lcom/daaw/y71;->y(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_1

    invoke-static {p1}, Lcom/daaw/y71;->r(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Lcom/daaw/y71;->l(I)I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    invoke-static {p1, v2}, Lcom/daaw/y71;->x(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v2}, Lcom/daaw/y71;->t(Landroid/os/Parcel;I)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lcom/daaw/y71;->k(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/ads/internal/client/zzdu;

    invoke-direct {p1, v1}, Lcom/google/android/gms/ads/internal/client/zzdu;-><init>(I)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/ads/internal/client/zzdu;

    return-object p1
.end method
