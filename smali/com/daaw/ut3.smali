.class public final Lcom/daaw/ut3;
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
    .locals 11

    invoke-static {p1}, Lcom/daaw/y71;->y(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v2

    move-object v6, v4

    move-object v7, v6

    move-object v9, v7

    move-object v10, v9

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {p1}, Lcom/daaw/y71;->r(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lcom/daaw/y71;->l(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    invoke-static {p1, v1}, Lcom/daaw/y71;->x(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    invoke-static {p1, v1}, Lcom/daaw/y71;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v10, v1

    goto :goto_0

    :pswitch_1
    invoke-static {p1, v1}, Lcom/daaw/y71;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_0

    :pswitch_2
    invoke-static {p1, v1}, Lcom/daaw/y71;->m(Landroid/os/Parcel;I)Z

    move-result v1

    move v8, v1

    goto :goto_0

    :pswitch_3
    invoke-static {p1, v1}, Lcom/daaw/y71;->b(Landroid/os/Parcel;I)[B

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :pswitch_4
    invoke-static {p1, v1}, Lcom/daaw/y71;->a(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v1

    move-object v6, v1

    goto :goto_0

    :pswitch_5
    invoke-static {p1, v1}, Lcom/daaw/y71;->t(Landroid/os/Parcel;I)I

    move-result v1

    move v5, v1

    goto :goto_0

    :pswitch_6
    invoke-static {p1, v1}, Lcom/daaw/y71;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lcom/daaw/y71;->k(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzcbj;

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/zzcbj;-><init>(Ljava/lang/String;ILandroid/os/Bundle;[BZLjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzcbj;

    return-object p1
.end method
