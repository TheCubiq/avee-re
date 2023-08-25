.class public Lcom/daaw/i91$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/i91;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/i91;


# direct methods
.method public constructor <init>(Lcom/daaw/i91;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i91$a;->a:Lcom/daaw/i91;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;
    .locals 4

    iget-object p1, p0, Lcom/daaw/i91$a;->a:Lcom/daaw/i91;

    iget-object v0, p1, Lcom/daaw/i91;->q:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p1, Lcom/daaw/i91;->q:Landroid/graphics/Rect;

    :cond_0
    iget-object p1, p0, Lcom/daaw/i91$a;->a:Lcom/daaw/i91;

    iget-object p1, p1, Lcom/daaw/i91;->q:Landroid/graphics/Rect;

    invoke-virtual {p2}, Lcom/daaw/px1;->j()I

    move-result v0

    invoke-virtual {p2}, Lcom/daaw/px1;->l()I

    move-result v1

    invoke-virtual {p2}, Lcom/daaw/px1;->k()I

    move-result v2

    invoke-virtual {p2}, Lcom/daaw/px1;->i()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Lcom/daaw/i91$a;->a:Lcom/daaw/i91;

    invoke-virtual {p1, p2}, Lcom/daaw/i91;->a(Lcom/daaw/px1;)V

    iget-object p1, p0, Lcom/daaw/i91$a;->a:Lcom/daaw/i91;

    invoke-virtual {p2}, Lcom/daaw/px1;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/i91$a;->a:Lcom/daaw/i91;

    iget-object v0, v0, Lcom/daaw/i91;->p:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    iget-object p1, p0, Lcom/daaw/i91$a;->a:Lcom/daaw/i91;

    invoke-static {p1}, Lcom/daaw/xs1;->i0(Landroid/view/View;)V

    invoke-virtual {p2}, Lcom/daaw/px1;->c()Lcom/daaw/px1;

    move-result-object p1

    return-object p1
.end method
