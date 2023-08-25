.class public final Lcom/daaw/na5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jr4;


# instance fields
.field public final p:Lcom/daaw/a74;


# direct methods
.method public constructor <init>(Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/na5;->p:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final f(Landroid/content/Context;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/na5;->p:Lcom/daaw/a74;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->destroy()V

    :cond_0
    return-void
.end method

.method public final l(Landroid/content/Context;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/na5;->p:Lcom/daaw/a74;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->onResume()V

    :cond_0
    return-void
.end method

.method public final s(Landroid/content/Context;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/na5;->p:Lcom/daaw/a74;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->onPause()V

    :cond_0
    return-void
.end method
