.class public abstract Lcom/daaw/tg3;
.super Lcom/daaw/kd3;
.source ""

# interfaces
.implements Lcom/daaw/wh3;


# direct methods
.method public static I(Landroid/os/IBinder;)Lcom/daaw/wh3;
    .locals 2

    const-string v0, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/wh3;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/wh3;

    return-object v0

    :cond_0
    new-instance v0, Lcom/daaw/qf3;

    invoke-direct {v0, p0}, Lcom/daaw/qf3;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
