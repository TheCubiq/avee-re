.class public Lcom/daaw/zj$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/n91$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/zj;


# direct methods
.method public constructor <init>(Lcom/daaw/zj;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/AsyncTask;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/zj$g;->d(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    const-string p2, ""

    invoke-static {p1, p2}, Lcom/daaw/zj;->T(Lcom/daaw/zj;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lcom/daaw/zj;->U(Lcom/daaw/zj;ZZ)V

    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    invoke-virtual {p1}, Lcom/daaw/zj;->A()Z

    return-void
.end method

.method public b(Landroid/os/AsyncTask;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/zj$g;->d(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    const-string v0, ""

    invoke-static {p1, v0}, Lcom/daaw/zj;->R(Lcom/daaw/zj;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/zj;->S(Lcom/daaw/zj;ZZ)V

    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    invoke-static {p1}, Lcom/daaw/zj;->Q(Lcom/daaw/zj;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    invoke-virtual {p1}, Lcom/daaw/zj;->A()Z

    return-void
.end method

.method public c(Landroid/os/AsyncTask;Lcom/daaw/zj$s;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/zj$g;->d(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    const-string v0, ""

    invoke-static {p1, v0}, Lcom/daaw/zj;->V(Lcom/daaw/zj;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    invoke-virtual {p1, p2}, Lcom/daaw/zj;->f0(Lcom/daaw/zj$s;)V

    return-void
.end method

.method public d(Landroid/os/AsyncTask;)Z
    .locals 3

    sget-object v0, Lcom/daaw/yj;->y:Lcom/daaw/xw1;

    iget-object v1, p0, Lcom/daaw/zj$g;->a:Lcom/daaw/zj;

    invoke-static {v1}, Lcom/daaw/zj;->P(Lcom/daaw/zj;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
