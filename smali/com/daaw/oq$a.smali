.class public Lcom/daaw/oq$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/oq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/oq;


# direct methods
.method public constructor <init>(Lcom/daaw/oq;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oq$a;->a:Lcom/daaw/oq;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/oq$a;->a:Lcom/daaw/oq;

    invoke-static {p2}, Lcom/daaw/oq;->d(Lcom/daaw/oq;)Z

    move-result p2

    iget-object v0, p0, Lcom/daaw/oq$a;->a:Lcom/daaw/oq;

    invoke-static {v0, p1}, Lcom/daaw/oq;->l(Lcom/daaw/oq;Landroid/content/Context;)Z

    move-result p1

    invoke-static {v0, p1}, Lcom/daaw/oq;->f(Lcom/daaw/oq;Z)Z

    iget-object p1, p0, Lcom/daaw/oq$a;->a:Lcom/daaw/oq;

    invoke-static {p1}, Lcom/daaw/oq;->d(Lcom/daaw/oq;)Z

    move-result p1

    if-eq p2, p1, :cond_0

    iget-object p1, p0, Lcom/daaw/oq$a;->a:Lcom/daaw/oq;

    invoke-static {p1}, Lcom/daaw/oq;->m(Lcom/daaw/oq;)Lcom/daaw/hj$a;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/oq$a;->a:Lcom/daaw/oq;

    invoke-static {p2}, Lcom/daaw/oq;->d(Lcom/daaw/oq;)Z

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/hj$a;->a(Z)V

    :cond_0
    return-void
.end method
