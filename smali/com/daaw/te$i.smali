.class public Lcom/daaw/te$i;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/te;->r(Landroid/view/ViewGroup;Lcom/daaw/on1;Lcom/daaw/on1;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/graphics/Rect;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Lcom/daaw/te;


# direct methods
.method public constructor <init>(Lcom/daaw/te;Landroid/view/View;Landroid/graphics/Rect;IIII)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/te$i;->h:Lcom/daaw/te;

    iput-object p2, p0, Lcom/daaw/te$i;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/daaw/te$i;->c:Landroid/graphics/Rect;

    iput p4, p0, Lcom/daaw/te$i;->d:I

    iput p5, p0, Lcom/daaw/te$i;->e:I

    iput p6, p0, Lcom/daaw/te$i;->f:I

    iput p7, p0, Lcom/daaw/te$i;->g:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/te$i;->a:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    iget-boolean p1, p0, Lcom/daaw/te$i;->a:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/te$i;->b:Landroid/view/View;

    iget-object v0, p0, Lcom/daaw/te$i;->c:Landroid/graphics/Rect;

    invoke-static {p1, v0}, Lcom/daaw/xs1;->y0(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/daaw/te$i;->b:Landroid/view/View;

    iget v0, p0, Lcom/daaw/te$i;->d:I

    iget v1, p0, Lcom/daaw/te$i;->e:I

    iget v2, p0, Lcom/daaw/te$i;->f:I

    iget v3, p0, Lcom/daaw/te$i;->g:I

    invoke-static {p1, v0, v1, v2, v3}, Lcom/daaw/gu1;->f(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method
