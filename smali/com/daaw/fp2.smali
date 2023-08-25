.class public abstract Lcom/daaw/fp2;
.super Lcom/daaw/cp2;
.source ""

# interfaces
.implements Lcom/daaw/gp2;


# direct methods
.method public static g3(Landroid/os/IBinder;)Lcom/daaw/gp2;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.clearcut.IClearcut"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/gp2;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/gp2;

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/ep2;

    invoke-direct {v0, p0}, Lcom/daaw/ep2;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
