.class public Lcom/daaw/hj1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/hj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj1;


# direct methods
.method public constructor <init>(Lcom/daaw/hj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj1$a;->a:Lcom/daaw/hj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSystemUiVisibilityChange(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hj1$a;->a:Lcom/daaw/hj1;

    invoke-static {v0}, Lcom/daaw/hj1;->e(Lcom/daaw/hj1;)I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/hj1$a;->a:Lcom/daaw/hj1;

    iget-object p1, p1, Lcom/daaw/gj1;->c:Lcom/daaw/gj1$b;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/hj1$a;->a:Lcom/daaw/hj1;

    iget-object v0, p1, Lcom/daaw/gj1;->a:Landroid/view/View;

    invoke-static {p1}, Lcom/daaw/hj1;->g(Lcom/daaw/hj1;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    iget-object p1, p0, Lcom/daaw/hj1$a;->a:Lcom/daaw/hj1;

    iget-object p1, p1, Lcom/daaw/gj1;->c:Lcom/daaw/gj1$b;

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1, v0}, Lcom/daaw/gj1$b;->a(Z)V

    iget-object p1, p0, Lcom/daaw/hj1$a;->a:Lcom/daaw/hj1;

    invoke-static {p1, v0}, Lcom/daaw/hj1;->f(Lcom/daaw/hj1;Z)Z

    return-void
.end method
