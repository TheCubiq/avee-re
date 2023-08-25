.class public Lcom/daaw/sf0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/sf0;->O(IIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:I

.field public final synthetic d:Landroid/widget/TextView;

.field public final synthetic e:Lcom/daaw/sf0;


# direct methods
.method public constructor <init>(Lcom/daaw/sf0;ILandroid/widget/TextView;ILandroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sf0$a;->e:Lcom/daaw/sf0;

    iput p2, p0, Lcom/daaw/sf0$a;->a:I

    iput-object p3, p0, Lcom/daaw/sf0$a;->b:Landroid/widget/TextView;

    iput p4, p0, Lcom/daaw/sf0$a;->c:I

    iput-object p5, p0, Lcom/daaw/sf0$a;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/sf0$a;->e:Lcom/daaw/sf0;

    iget v0, p0, Lcom/daaw/sf0$a;->a:I

    invoke-static {p1, v0}, Lcom/daaw/sf0;->a(Lcom/daaw/sf0;I)I

    iget-object p1, p0, Lcom/daaw/sf0$a;->e:Lcom/daaw/sf0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/sf0;->b(Lcom/daaw/sf0;Landroid/animation/Animator;)Landroid/animation/Animator;

    iget-object p1, p0, Lcom/daaw/sf0$a;->b:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget p1, p0, Lcom/daaw/sf0$a;->c:I

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lcom/daaw/sf0$a;->e:Lcom/daaw/sf0;

    invoke-static {p1}, Lcom/daaw/sf0;->c(Lcom/daaw/sf0;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/sf0$a;->e:Lcom/daaw/sf0;

    invoke-static {p1}, Lcom/daaw/sf0;->c(Lcom/daaw/sf0;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/sf0$a;->d:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTranslationY(F)V

    iget-object p1, p0, Lcom/daaw/sf0$a;->d:Landroid/widget/TextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    :cond_1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/sf0$a;->d:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method
