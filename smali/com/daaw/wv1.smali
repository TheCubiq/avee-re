.class public Lcom/daaw/wv1;
.super Landroid/widget/PopupWindow;
.source ""


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Landroid/widget/ImageButton;

.field public c:Landroid/widget/ImageButton;

.field public d:Landroid/view/View;

.field public e:Landroid/widget/SeekBar;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/SeekBar;

.field public h:Landroid/widget/TextView;

.field public i:F

.field public j:F

.field public k:Landroid/widget/SeekBar;

.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/view/View;)V
    .locals 8

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v4, 0x7f110115

    invoke-direct {p0, v0, v1, v2, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance v0, Landroid/os/Handler;

    new-instance v4, Lcom/daaw/wv1$a;

    invoke-direct {v4, p0}, Lcom/daaw/wv1$a;-><init>(Lcom/daaw/wv1;)V

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/daaw/wv1;->a:Landroid/os/Handler;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v4, 0x7f0c00ce

    invoke-static {v0, v4, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0900a9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p0, Lcom/daaw/wv1;->b:Landroid/widget/ImageButton;

    new-instance v4, Lcom/daaw/wv1$b;

    invoke-direct {v4, p0}, Lcom/daaw/wv1$b;-><init>(Lcom/daaw/wv1;)V

    invoke-virtual {v1, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f09024a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    iput-object v1, p0, Lcom/daaw/wv1;->k:Landroid/widget/SeekBar;

    const v1, 0x7f0902ff

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/wv1;->l:Landroid/widget/TextView;

    sget-object v1, Lcom/daaw/ko0;->P:Lcom/daaw/vw1;

    new-instance v4, Lcom/daaw/lo1;

    invoke-direct {v4, v3, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lo1;

    iget-object v4, v1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p0, v4, v5, v2}, Lcom/daaw/wv1;->h(IIZ)V

    iget-object v4, p0, Lcom/daaw/wv1;->k:Landroid/widget/SeekBar;

    new-instance v5, Lcom/daaw/wv1$c;

    invoke-direct {v5, p0, v1}, Lcom/daaw/wv1$c;-><init>(Lcom/daaw/wv1;Lcom/daaw/lo1;)V

    invoke-virtual {v4, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    sget-object v1, Lcom/daaw/ko0;->W:Lcom/daaw/vw1;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v4}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const v5, 0x7f09017c

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/wv1;->d:Landroid/view/View;

    const v5, 0x7f090088

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageButton;

    iput-object v5, p0, Lcom/daaw/wv1;->c:Landroid/widget/ImageButton;

    const/4 v5, 0x1

    invoke-virtual {p0, v1, v5}, Lcom/daaw/wv1;->l(ZZ)V

    iget-object v1, p0, Lcom/daaw/wv1;->c:Landroid/widget/ImageButton;

    new-instance v6, Lcom/daaw/wv1$d;

    invoke-direct {v6, p0}, Lcom/daaw/wv1$d;-><init>(Lcom/daaw/wv1;)V

    invoke-virtual {v1, v6}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f09024b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    iput-object v1, p0, Lcom/daaw/wv1;->e:Landroid/widget/SeekBar;

    const v1, 0x7f090301

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/wv1;->f:Landroid/widget/TextView;

    sget-object v1, Lcom/daaw/ko0;->Q:Lcom/daaw/vw1;

    new-instance v6, Lcom/daaw/lo1;

    invoke-direct {v6, v3, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v6}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lo1;

    iget-object v6, v1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v7, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {p0, v6, v7, v2}, Lcom/daaw/wv1;->g(IIZ)V

    iget-object v6, p0, Lcom/daaw/wv1;->e:Landroid/widget/SeekBar;

    new-instance v7, Lcom/daaw/wv1$e;

    invoke-direct {v7, p0, v1}, Lcom/daaw/wv1$e;-><init>(Lcom/daaw/wv1;Lcom/daaw/lo1;)V

    invoke-virtual {v6, v7}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    const v1, 0x7f090247

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    iput-object v1, p0, Lcom/daaw/wv1;->g:Landroid/widget/SeekBar;

    const v1, 0x7f0902d6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/wv1;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0701af

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/daaw/wv1;->i:F

    iget-object p1, p0, Lcom/daaw/wv1;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    move-result p1

    iput p1, p0, Lcom/daaw/wv1;->j:F

    sget-object p1, Lcom/daaw/ko0;->S:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/mo1;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-direct {v1, v3, v3, v6}, Lcom/daaw/mo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mo1;

    iget-object v1, p1, Lcom/daaw/mo1;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v3, p1, Lcom/daaw/mo1;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v6, p1, Lcom/daaw/mo1;->c:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {p0, v1, v3, v6, v2}, Lcom/daaw/wv1;->i(IIFZ)V

    iget-object v1, p0, Lcom/daaw/wv1;->g:Landroid/widget/SeekBar;

    new-instance v3, Lcom/daaw/wv1$f;

    invoke-direct {v3, p0, p1}, Lcom/daaw/wv1$f;-><init>(Lcom/daaw/wv1;Lcom/daaw/mo1;)V

    invoke-virtual {v1, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    const p1, 0x7f090087

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/wv1;->m:Landroid/widget/ImageButton;

    new-instance v1, Lcom/daaw/wv1$g;

    invoke-direct {v1, p0}, Lcom/daaw/wv1$g;-><init>(Lcom/daaw/wv1;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const/4 p1, -0x2

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setHeight(I)V

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {p0, v5}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    invoke-virtual {p0, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    sget-object p1, Lcom/daaw/ko0;->F:Lcom/daaw/vw1;

    invoke-virtual {p1, v4}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, Lcom/daaw/ko0;->G:Lcom/daaw/vw1;

    invoke-virtual {v0, v4}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/wv1;->k(ZZ)V

    sget-object p1, Lcom/daaw/ko0;->a0:Lcom/daaw/vw1;

    invoke-virtual {p1, v4}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/wv1;->j(Z)V

    const/4 p1, 0x2

    new-array p1, p1, [I

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p2, p1}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {p2}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v0, v0, Landroid/graphics/Point;->y:I

    aget v1, p1, v5

    sub-int/2addr v0, v1

    aput v0, p1, v5

    const v0, 0x800053

    aget v1, p1, v2

    aget p1, p1, v5

    invoke-virtual {p0, p2, v0, v1, p1}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/wv1;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wv1;->a:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/wv1;IIZ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/wv1;->h(IIZ)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/wv1;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wv1;->d:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/wv1;ZZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/wv1;->l(ZZ)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/wv1;IIZ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/wv1;->g(IIZ)V

    return-void
.end method

.method public static synthetic f(Lcom/daaw/wv1;IIFZ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/wv1;->i(IIFZ)V

    return-void
.end method


# virtual methods
.method public final g(IIZ)V
    .locals 6

    div-int/lit8 v0, p2, 0x2

    sub-int v1, p1, v0

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/wv1;->f:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const v4, 0x7f0e0002

    invoke-virtual {v2, v4, v0, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez p3, :cond_0

    iget-object p3, p0, Lcom/daaw/wv1;->e:Landroid/widget/SeekBar;

    invoke-virtual {p3, p2}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object p2, p0, Lcom/daaw/wv1;->e:Landroid/widget/SeekBar;

    invoke-virtual {p2, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/daaw/ko0;->U:Lcom/daaw/rw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final h(IIZ)V
    .locals 6

    int-to-float v0, p1

    int-to-float v1, p2

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/wv1;->l:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const v4, 0x7f0e0004

    invoke-virtual {v2, v4, v0, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez p3, :cond_0

    iget-object p3, p0, Lcom/daaw/wv1;->k:Landroid/widget/SeekBar;

    invoke-virtual {p3, p2}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object p2, p0, Lcom/daaw/wv1;->k:Landroid/widget/SeekBar;

    invoke-virtual {p2, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/daaw/ko0;->T:Lcom/daaw/rw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final i(IIFZ)V
    .locals 6

    if-nez p1, :cond_0

    iget-object p3, p0, Lcom/daaw/wv1;->h:Landroid/widget/TextView;

    const v0, 0x7f1001e5

    :goto_0
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p3, p0, Lcom/daaw/wv1;->h:Landroid/widget/TextView;

    const v0, 0x7f1001e6

    goto :goto_0

    :cond_1
    add-int/lit8 v1, p1, -0x1

    int-to-float v1, v1

    mul-float v1, v1, p3

    iget-object p3, p0, Lcom/daaw/wv1;->h:Landroid/widget/TextView;

    invoke-virtual {p3}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e0006

    float-to-int v4, v1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-virtual {v2, v3, v4, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    if-nez p4, :cond_2

    iget-object p3, p0, Lcom/daaw/wv1;->g:Landroid/widget/SeekBar;

    invoke-virtual {p3, p2}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object p2, p0, Lcom/daaw/wv1;->g:Landroid/widget/SeekBar;

    invoke-virtual {p2, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_2

    :cond_2
    sget-object p3, Lcom/daaw/ko0;->V:Lcom/daaw/rw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public j(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/wv1;->m:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/daaw/wv1;->b:Landroid/widget/ImageButton;

    const v1, 0x7f040273

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/wv1;->m:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/daaw/wv1;->b:Landroid/widget/ImageButton;

    const v1, 0x7f040271

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setColorFilter(I)V

    return-void
.end method

.method public k(ZZ)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/wv1;->b:Landroid/widget/ImageButton;

    const p2, 0x7f040273

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/wv1;->b:Landroid/widget/ImageButton;

    const p2, 0x7f040271

    :goto_0
    invoke-static {p1, p2}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setColorFilter(I)V

    return-void
.end method

.method public final l(ZZ)V
    .locals 3

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/wv1;->c:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 v2, 0x42b40000    # 90.0f

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    :cond_0
    iget-object p1, p0, Lcom/daaw/wv1;->d:Landroid/view/View;

    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/wv1;->c:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    if-eqz p2, :cond_2

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    :cond_2
    iget-object p1, p0, Lcom/daaw/wv1;->d:Landroid/view/View;

    const/16 p2, 0x8

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
