.class public Lcom/daaw/te$a;
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
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/graphics/drawable/BitmapDrawable;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:F

.field public final synthetic e:Lcom/daaw/te;


# direct methods
.method public constructor <init>(Lcom/daaw/te;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/te$a;->e:Lcom/daaw/te;

    iput-object p2, p0, Lcom/daaw/te$a;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/daaw/te$a;->b:Landroid/graphics/drawable/BitmapDrawable;

    iput-object p4, p0, Lcom/daaw/te$a;->c:Landroid/view/View;

    iput p5, p0, Lcom/daaw/te$a;->d:F

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/te$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lcom/daaw/gu1;->b(Landroid/view/View;)Lcom/daaw/rt1;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/te$a;->b:Landroid/graphics/drawable/BitmapDrawable;

    invoke-interface {p1, v0}, Lcom/daaw/rt1;->b(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/daaw/te$a;->c:Landroid/view/View;

    iget v0, p0, Lcom/daaw/te$a;->d:F

    invoke-static {p1, v0}, Lcom/daaw/gu1;->g(Landroid/view/View;F)V

    return-void
.end method
