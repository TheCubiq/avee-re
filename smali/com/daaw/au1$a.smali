.class public Lcom/daaw/au1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/au1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/au1$a$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/sd1;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/au1$a$a;

.field public d:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/au1$a;->b:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/au1$a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/au1$a;->b()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/au1$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/au1$a;->g()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/au1$a;->f()I

    move-result v1

    invoke-virtual {p0, v0}, Lcom/daaw/au1$a;->h(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/daaw/au1$a;->h(I)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0, v1}, Lcom/daaw/au1$a;->i(II)V

    iget-object v0, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/au1$a;->c:Lcom/daaw/au1$a$a;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/au1$a;->c:Lcom/daaw/au1$a$a;

    :cond_3
    :goto_0
    return-void
.end method

.method public final c()Landroid/graphics/Point;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xd
    .end annotation

    iget-object v0, p0, Lcom/daaw/au1$a;->d:Landroid/graphics/Point;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    iput-object v1, p0, Lcom/daaw/au1$a;->d:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget-object v0, p0, Lcom/daaw/au1$a;->d:Landroid/graphics/Point;

    return-object v0
.end method

.method public d(Lcom/daaw/sd1;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/au1$a;->g()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/au1$a;->f()I

    move-result v1

    invoke-virtual {p0, v0}, Lcom/daaw/au1$a;->h(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/au1$a;->h(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v0, v1}, Lcom/daaw/sd1;->f(II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/au1$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/au1$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object p1, p0, Lcom/daaw/au1$a;->c:Lcom/daaw/au1$a$a;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Lcom/daaw/au1$a$a;

    invoke-direct {v0, p0}, Lcom/daaw/au1$a$a;-><init>(Lcom/daaw/au1$a;)V

    iput-object v0, p0, Lcom/daaw/au1$a;->c:Lcom/daaw/au1$a$a;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final e(IZ)I
    .locals 1

    const/4 v0, -0x2

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/au1$a;->c()Landroid/graphics/Point;

    move-result-object p1

    if-eqz p2, :cond_0

    iget p1, p1, Landroid/graphics/Point;->y:I

    goto :goto_0

    :cond_0
    iget p1, p1, Landroid/graphics/Point;->x:I

    :cond_1
    :goto_0
    return p1
.end method

.method public final f()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/au1$a;->h(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0

    :cond_0
    if-eqz v0, :cond_1

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/au1$a;->e(IZ)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final g()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/au1$a;->h(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/daaw/au1$a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/au1$a;->e(IZ)I

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method public final h(I)Z
    .locals 1

    if-gtz p1, :cond_1

    const/4 v0, -0x2

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final i(II)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/au1$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/sd1;

    invoke-interface {v1, p1, p2}, Lcom/daaw/sd1;->f(II)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/au1$a;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method
