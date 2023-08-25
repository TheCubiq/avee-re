.class public Lcom/daaw/n10$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/s91$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/n10;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/s91$b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/n10;


# direct methods
.method public constructor <init>(Lcom/daaw/n10;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/AsyncTask;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/n10$a;->d(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    iget-object p2, p1, Lcom/daaw/n10;->H:Ljava/util/List;

    if-nez p2, :cond_1

    return-void

    :cond_1
    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lcom/daaw/yj;->N(ZZ)V

    iget-object p1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    invoke-virtual {p1}, Lcom/daaw/bk0;->A()Z

    return-void
.end method

.method public b(Landroid/os/AsyncTask;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/n10$a;->d(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    iget-object v0, p1, Lcom/daaw/n10;->H:Ljava/util/List;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/yj;->N(ZZ)V

    iget-object p1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    iget-object p1, p1, Lcom/daaw/n10;->H:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    invoke-virtual {p1}, Lcom/daaw/bk0;->A()Z

    return-void
.end method

.method public c(Landroid/os/AsyncTask;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    iget-object v0, v0, Lcom/daaw/n10;->H:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/n10$a;->d(Landroid/os/AsyncTask;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    invoke-virtual {p1, p2}, Lcom/daaw/n10;->U(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/os/AsyncTask;)Z
    .locals 3

    sget-object v0, Lcom/daaw/yj;->y:Lcom/daaw/xw1;

    iget-object v1, p0, Lcom/daaw/n10$a;->a:Lcom/daaw/n10;

    iget v1, v1, Lcom/daaw/yj;->l:I

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
