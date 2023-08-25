.class public final Lcom/daaw/wp8;
.super Lcom/daaw/z22;
.source ""


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.dynamite.IDynamiteLoaderV2"

    invoke-direct {p0, p1, v0}, Lcom/daaw/z22;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final M(Lcom/daaw/yd0;Ljava/lang/String;ILcom/daaw/yd0;)Lcom/daaw/yd0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, p4}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final g3(Lcom/daaw/yd0;Ljava/lang/String;ILcom/daaw/yd0;)Lcom/daaw/yd0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, p4}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method
