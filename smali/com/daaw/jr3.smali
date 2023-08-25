.class public abstract Lcom/daaw/jr3;
.super Lcom/daaw/cp2;
.source ""

# interfaces
.implements Lcom/daaw/kr3;


# direct methods
.method public static g3(Landroid/os/IBinder;)Lcom/daaw/kr3;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/kr3;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/kr3;

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/ir3;

    invoke-direct {v0, p0}, Lcom/daaw/ir3;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
