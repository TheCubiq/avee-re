.class public Lcom/daaw/f4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Lcom/daaw/hw;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f4;->a:Landroid/widget/TextView;

    new-instance v0, Lcom/daaw/hw;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/daaw/hw;-><init>(Landroid/widget/TextView;Z)V

    iput-object v0, p0, Lcom/daaw/f4;->b:Lcom/daaw/hw;

    return-void
.end method


# virtual methods
.method public a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    iget-object v0, p0, Lcom/daaw/f4;->b:Lcom/daaw/hw;

    invoke-virtual {v0, p1}, Lcom/daaw/hw;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/f4;->b:Lcom/daaw/hw;

    invoke-virtual {v0}, Lcom/daaw/hw;->b()Z

    move-result v0

    return v0
.end method

.method public c(Landroid/util/AttributeSet;I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/f4;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/daaw/x21;->g0:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    sget p2, Lcom/daaw/x21;->u0:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, v1}, Lcom/daaw/f4;->e(Z)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/f4;->b:Lcom/daaw/hw;

    invoke-virtual {v0, p1}, Lcom/daaw/hw;->c(Z)V

    return-void
.end method

.method public e(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/f4;->b:Lcom/daaw/hw;

    invoke-virtual {v0, p1}, Lcom/daaw/hw;->d(Z)V

    return-void
.end method

.method public f(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    iget-object v0, p0, Lcom/daaw/f4;->b:Lcom/daaw/hw;

    invoke-virtual {v0, p1}, Lcom/daaw/hw;->e(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method
