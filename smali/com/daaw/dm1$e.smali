.class public Lcom/daaw/dm1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/a4$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/dm1;


# direct methods
.method public constructor <init>(Lcom/daaw/dm1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dm1$e;->a:Lcom/daaw/dm1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/dm1$e;->a:Lcom/daaw/dm1;

    iget-boolean v0, p1, Lcom/daaw/dm1;->d:Z

    if-nez v0, :cond_0

    iget-object p1, p1, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {p1}, Lcom/daaw/iq;->c()V

    iget-object p1, p0, Lcom/daaw/dm1$e;->a:Lcom/daaw/dm1;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/daaw/dm1;->d:Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Landroid/view/View;

    iget-object v0, p0, Lcom/daaw/dm1$e;->a:Lcom/daaw/dm1;

    iget-object v0, v0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
