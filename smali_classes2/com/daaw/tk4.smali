.class public abstract Lcom/daaw/tk4;
.super Lcom/daaw/c38;
.source ""

# interfaces
.implements Lcom/daaw/oe5;


# direct methods
.method public static D(Landroid/os/IBinder;)Lcom/daaw/oe5;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/oe5;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/oe5;

    return-object v0

    :cond_1
    new-instance v0, Lcom/daaw/ur3;

    invoke-direct {v0, p0}, Lcom/daaw/ur3;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
