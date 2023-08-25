.class public final Lcom/daaw/lo8;
.super Lcom/daaw/z22;
.source ""


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.dynamite.IDynamiteLoader"

    invoke-direct {p0, p1, v0}, Lcom/daaw/z22;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final M(Lcom/daaw/yd0;Ljava/lang/String;Z)I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p3}, Lcom/daaw/sr3;->c(Landroid/os/Parcel;Z)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final g3(Lcom/daaw/yd0;Ljava/lang/String;Z)I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p3}, Lcom/daaw/sr3;->c(Landroid/os/Parcel;Z)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final h3(Lcom/daaw/yd0;Ljava/lang/String;I)Lcom/daaw/yd0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

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

.method public final i3(Lcom/daaw/yd0;Ljava/lang/String;ILcom/daaw/yd0;)Lcom/daaw/yd0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, p4}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final j3(Lcom/daaw/yd0;Ljava/lang/String;I)Lcom/daaw/yd0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final k3(Lcom/daaw/yd0;Ljava/lang/String;ZJ)Lcom/daaw/yd0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/sr3;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p3}, Lcom/daaw/sr3;->c(Landroid/os/Parcel;Z)V

    invoke-virtual {v0, p4, p5}, Landroid/os/Parcel;->writeLong(J)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/yd0$a;->I(Landroid/os/IBinder;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final zze()I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/z22;->I()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p0, v1, v0}, Lcom/daaw/z22;->D(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method
