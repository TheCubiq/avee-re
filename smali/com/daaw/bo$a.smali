.class public Lcom/daaw/bo$a;
.super Lcom/daaw/xc0$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bo;->b(Lcom/daaw/ao;)Lcom/daaw/xc0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public p:Landroid/os/Handler;

.field public final synthetic q:Lcom/daaw/bo;


# direct methods
.method public constructor <init>(Lcom/daaw/bo;Lcom/daaw/ao;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bo$a;->q:Lcom/daaw/bo;

    invoke-direct {p0}, Lcom/daaw/xc0$a;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/daaw/bo$a;->p:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public J2(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public P0(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public Q1(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public R2(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public T2(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public m2(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method
