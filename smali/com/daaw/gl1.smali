.class public Lcom/daaw/gl1;
.super Landroid/widget/PopupWindow;
.source ""


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Landroid/widget/ImageView;

.field public c:Landroid/widget/ImageView;

.field public d:Landroid/widget/ImageView;

.field public e:Landroid/widget/ImageView;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/ImageView;

.field public h:[Landroid/widget/TextView;

.field public i:[Landroid/widget/ImageView;

.field public j:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 11

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v4, 0x7f110115

    invoke-direct {p0, v0, v1, v2, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x7

    new-array v4, v0, [Landroid/widget/TextView;

    iput-object v4, p0, Lcom/daaw/gl1;->h:[Landroid/widget/TextView;

    new-array v4, v0, [Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/gl1;->i:[Landroid/widget/ImageView;

    new-instance v4, Landroid/os/Handler;

    new-instance v5, Lcom/daaw/gl1$a;

    invoke-direct {v5, p0}, Lcom/daaw/gl1$a;-><init>(Lcom/daaw/gl1;)V

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v4, p0, Lcom/daaw/gl1;->a:Landroid/os/Handler;

    const v4, 0x7f040271

    invoke-static {p1, v4}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v4

    iput v4, p0, Lcom/daaw/gl1;->j:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f0c00cd

    invoke-static {v4, v5, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    new-array v0, v0, [Landroid/view/View;

    const v4, 0x7f09014c

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    aput-object v4, v0, v2

    const v4, 0x7f09014d

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v0, v5

    const v4, 0x7f090152

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v0, v6

    const v4, 0x7f090150

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v7, 0x3

    aput-object v4, v0, v7

    const v4, 0x7f09014f

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x4

    aput-object v4, v0, v8

    const v4, 0x7f09014e

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v9, 0x5

    aput-object v4, v0, v9

    const v4, 0x7f090097

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/gl1;->d:Landroid/widget/ImageView;

    aget-object v4, v0, v2

    new-instance v10, Lcom/daaw/gl1$b;

    invoke-direct {v10, p0}, Lcom/daaw/gl1$b;-><init>(Lcom/daaw/gl1;)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f090098

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/gl1;->e:Landroid/widget/ImageView;

    aget-object v4, v0, v5

    new-instance v10, Lcom/daaw/gl1$c;

    invoke-direct {v10, p0}, Lcom/daaw/gl1$c;-><init>(Lcom/daaw/gl1;)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0900a7

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/gl1;->f:Landroid/widget/ImageView;

    aget-object v4, v0, v6

    new-instance v10, Lcom/daaw/gl1$d;

    invoke-direct {v10, p0}, Lcom/daaw/gl1$d;-><init>(Lcom/daaw/gl1;)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0900a5

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/gl1;->g:Landroid/widget/ImageView;

    aget-object v4, v0, v7

    new-instance v7, Lcom/daaw/gl1$e;

    invoke-direct {v7, p0}, Lcom/daaw/gl1$e;-><init>(Lcom/daaw/gl1;)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f09009e

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/gl1;->b:Landroid/widget/ImageView;

    aget-object v4, v0, v8

    new-instance v7, Lcom/daaw/gl1$f;

    invoke-direct {v7, p0}, Lcom/daaw/gl1$f;-><init>(Lcom/daaw/gl1;)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f09009d

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/gl1;->c:Landroid/widget/ImageView;

    aget-object v0, v0, v9

    new-instance v4, Lcom/daaw/gl1$g;

    invoke-direct {v4, p0}, Lcom/daaw/gl1$g;-><init>(Lcom/daaw/gl1;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const/4 v0, -0x2

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {p0, v5}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    invoke-virtual {p0, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v0, p0, Lcom/daaw/gl1;->g:Landroid/widget/ImageView;

    iget v1, p0, Lcom/daaw/gl1;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    sget-object v0, Lcom/daaw/ko0;->i0:Lcom/daaw/vw1;

    invoke-virtual {v0, v3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/gl1;->d(I)V

    sget-object v0, Lcom/daaw/ko0;->f0:Lcom/daaw/vw1;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/gl1;->a(I)V

    sget-object v0, Lcom/daaw/ko0;->d0:Lcom/daaw/vw1;

    invoke-virtual {v0, v3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/gl1;->b(I)V

    sget-object v0, Lcom/daaw/ko0;->b0:Lcom/daaw/vw1;

    invoke-virtual {v0, v3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/gl1;->c(I)V

    new-array v0, v6, [I

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v1, v1, Landroid/graphics/Point;->y:I

    aget v3, v0, v5

    sub-int/2addr v1, v3

    aput v1, v0, v5

    const v1, 0x800053

    aget v2, v0, v2

    aget v0, v0, v5

    invoke-virtual {p0, p1, v1, v2, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    const v0, 0x7f040273

    const v1, 0x7f040271

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/gl1;->d:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    iget-object p1, p0, Lcom/daaw/gl1;->e:Landroid/widget/ImageView;

    invoke-static {p1, v1}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/gl1;->d:Landroid/widget/ImageView;

    invoke-static {p1, v1}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    iget-object p1, p0, Lcom/daaw/gl1;->e:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method

.method public b(I)V
    .locals 2

    const v0, 0x7f040273

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lcom/daaw/gl1;->b:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    iget-object p1, p0, Lcom/daaw/gl1;->c:Landroid/widget/ImageView;

    iget v0, p0, Lcom/daaw/gl1;->j:I

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_2

    :cond_0
    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/daaw/gl1;->b:Landroid/widget/ImageView;

    iget v1, p0, Lcom/daaw/gl1;->j:I

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    iget-object p1, p0, Lcom/daaw/gl1;->c:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/daaw/gl1;->b:Landroid/widget/ImageView;

    iget v0, p0, Lcom/daaw/gl1;->j:I

    goto :goto_0

    :goto_2
    return-void
.end method

.method public c(I)V
    .locals 0

    return-void
.end method

.method public d(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/gl1;->f:Landroid/widget/ImageView;

    const v0, 0x7f08012a

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/gl1;->f:Landroid/widget/ImageView;

    const v0, 0x7f08012b

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/daaw/gl1;->f:Landroid/widget/ImageView;

    const v0, 0x7f08012d

    goto :goto_0

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/daaw/gl1;->f:Landroid/widget/ImageView;

    iget v0, p0, Lcom/daaw/gl1;->j:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method
