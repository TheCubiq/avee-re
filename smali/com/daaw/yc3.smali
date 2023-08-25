.class public abstract Lcom/daaw/yc3;
.super Lcom/daaw/cp2;
.source ""

# interfaces
.implements Lcom/daaw/zc3;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate"

    invoke-direct {p0, v0}, Lcom/daaw/cp2;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static zzbD(Landroid/os/IBinder;)Lcom/daaw/zc3;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/zc3;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/zc3;

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/xc3;

    invoke-direct {v0, p0}, Lcom/daaw/xc3;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public final M(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/daaw/zc3;->zzbB(Lcom/daaw/yd0;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p4, "com.google.android.gms.ads.internal.formats.client.IMediaContent"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/daaw/sc3;

    if-eqz v0, :cond_1

    move-object p1, p4

    check-cast p1, Lcom/daaw/sc3;

    goto :goto_0

    :cond_1
    new-instance p4, Lcom/daaw/qc3;

    invoke-direct {p4, p1}, Lcom/daaw/qc3;-><init>(Landroid/os/IBinder;)V

    move-object p1, p4

    :goto_0
    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/daaw/zc3;->zzbA(Lcom/daaw/sc3;)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/daaw/zc3;->zzd(Lcom/daaw/yd0;)V

    goto :goto_1

    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/daaw/zc3;->zzbz(Lcom/daaw/yd0;)V

    goto :goto_1

    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    goto :goto_1

    :pswitch_5
    invoke-interface {p0}, Lcom/daaw/zc3;->zzc()V

    goto :goto_1

    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/daaw/zc3;->zzbC(Lcom/daaw/yd0;)V

    goto :goto_1

    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/daaw/zc3;->zzb(Ljava/lang/String;)Lcom/daaw/yd0;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/daaw/dp2;->g(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p4

    invoke-static {p4}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p4

    invoke-static {p2}, Lcom/daaw/dp2;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lcom/daaw/zc3;->zzby(Ljava/lang/String;Lcom/daaw/yd0;)V

    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    :goto_2
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
