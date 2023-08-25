.class public Lcom/daaw/hj1;
.super Lcom/daaw/gj1;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# instance fields
.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:Landroid/view/View$OnSystemUiVisibilityChangeListener;


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/gj1;-><init>(Landroid/view/View;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/hj1;->h:Z

    new-instance p2, Lcom/daaw/hj1$a;

    invoke-direct {p2, p0}, Lcom/daaw/hj1$a;-><init>(Lcom/daaw/hj1;)V

    iput-object p2, p0, Lcom/daaw/hj1;->i:Landroid/view/View$OnSystemUiVisibilityChangeListener;

    const/4 p2, 0x0

    iput p2, p0, Lcom/daaw/hj1;->e:I

    iput p1, p0, Lcom/daaw/hj1;->f:I

    iput p1, p0, Lcom/daaw/hj1;->g:I

    iget p1, p0, Lcom/daaw/gj1;->b:I

    and-int/lit8 p2, p1, 0x2

    if-eqz p2, :cond_0

    const/16 p2, 0x400

    iput p2, p0, Lcom/daaw/hj1;->e:I

    const/16 p2, 0x404

    iput p2, p0, Lcom/daaw/hj1;->f:I

    const/4 p2, 0x4

    iput p2, p0, Lcom/daaw/hj1;->g:I

    :cond_0
    and-int/lit8 p1, p1, 0x6

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/daaw/hj1;->e:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lcom/daaw/hj1;->e:I

    iget p1, p0, Lcom/daaw/hj1;->f:I

    or-int/lit16 p1, p1, 0x202

    iput p1, p0, Lcom/daaw/hj1;->f:I

    iget p1, p0, Lcom/daaw/hj1;->g:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/daaw/hj1;->g:I

    :cond_1
    return-void
.end method

.method public static synthetic e(Lcom/daaw/hj1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/hj1;->g:I

    return p0
.end method

.method public static synthetic f(Lcom/daaw/hj1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/hj1;->h:Z

    return p1
.end method

.method public static synthetic g(Lcom/daaw/hj1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/hj1;->e:I

    return p0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/gj1;->a:Landroid/view/View;

    iget v1, p0, Lcom/daaw/hj1;->f:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/gj1;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/daaw/hj1;->i:Landroid/view/View$OnSystemUiVisibilityChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/gj1;->a:Landroid/view/View;

    iget v1, p0, Lcom/daaw/hj1;->e:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
