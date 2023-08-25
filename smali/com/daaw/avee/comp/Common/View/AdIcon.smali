.class public final Lcom/daaw/avee/comp/Common/View/AdIcon;
.super Lcom/daaw/j4;
.source ""


# instance fields
.field public s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Common/View/AdIcon;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/daaw/pq;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/j4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, -0x1

    iput p3, p0, Lcom/daaw/avee/comp/Common/View/AdIcon;->s:I

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/daaw/u21;->j:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "context.theme.obtainStyl\u2026R.styleable.AdIcon, 0, 0)"

    invoke-static {p1, p2}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p1, v1, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Lcom/daaw/avee/comp/Common/View/AdIcon;->s:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez p2, :cond_0

    sget-object p1, Lcom/daaw/oy0;->e:Lcom/daaw/vw1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f0800ca

    invoke-virtual {p0, p1}, Lcom/daaw/j4;->setImageResource(I)V

    new-instance p1, Lcom/daaw/b1;

    invoke-direct {p1, p0}, Lcom/daaw/b1;-><init>(Lcom/daaw/avee/comp/Common/View/AdIcon;)V

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/daaw/pq;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Common/View/AdIcon;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/avee/comp/Common/View/AdIcon;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Common/View/AdIcon;->d(Lcom/daaw/avee/comp/Common/View/AdIcon;Landroid/view/View;)V

    return-void
.end method

.method public static final d(Lcom/daaw/avee/comp/Common/View/AdIcon;Landroid/view/View;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/daaw/oy0;->b:Lcom/daaw/ww1;

    iget p0, p0, Lcom/daaw/avee/comp/Common/View/AdIcon;->s:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p0, v0}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getTargetId()I
    .locals 1

    iget v0, p0, Lcom/daaw/avee/comp/Common/View/AdIcon;->s:I

    return v0
.end method

.method public final setTargetId(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/avee/comp/Common/View/AdIcon;->s:I

    return-void
.end method
