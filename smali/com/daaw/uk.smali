.class public Lcom/daaw/uk;
.super Lcom/daaw/eb;
.source ""


# static fields
.field public static H:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "[",
            "Lcom/daaw/l0;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static I:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static J:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/widget/ImageButton;

.field public D:Landroid/graphics/drawable/Drawable;

.field public E:[Lcom/daaw/l0;

.field public F:Z

.field public G:Lcom/daaw/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/e0<",
            "Lcom/daaw/uk;",
            ">;"
        }
    .end annotation
.end field

.field public t:Lcom/daaw/jh0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:Landroid/view/View;

.field public x:Landroid/widget/ImageView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/uk;->H:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/uk;->I:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/uk;->J:Lcom/daaw/qw1;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0087

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/eb;-><init>(Landroid/view/View;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    iput-object p1, p0, Lcom/daaw/uk;->u:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/uk;->E:[Lcom/daaw/l0;

    iput-boolean v2, p0, Lcom/daaw/uk;->F:Z

    iput-object p1, p0, Lcom/daaw/uk;->G:Lcom/daaw/e0;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const v0, 0x7f09030e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/uk;->w:Landroid/view/View;

    const v0, 0x7f090168

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    const v0, 0x7f0902e7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const v0, 0x7f0902e4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    const v0, 0x7f0902e5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/uk;->A:Landroid/widget/TextView;

    const v0, 0x7f0902e3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const v0, 0x7f09008e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/widget/ImageButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/uk;->D:Landroid/graphics/drawable/Drawable;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLongClickable(Z)V

    return-void
.end method

.method public static synthetic P(Lcom/daaw/uk;)[Lcom/daaw/l0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/uk;->E:[Lcom/daaw/l0;

    return-object p0
.end method

.method public static synthetic Q(Lcom/daaw/uk;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/uk;->Z(Z)V

    return-void
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 0

    return-void
.end method

.method public R()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uk;->G:Lcom/daaw/e0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Lcom/daaw/uk;->I:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/uk;->Z(Z)V

    :cond_1
    return-void
.end method

.method public final S(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    const v1, 0xffffff

    and-int/2addr v1, p1

    const/high16 v2, -0x1000000

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setColorFilter(I)V

    iget-object v0, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    return-void
.end method

.method public T(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageResource(I)V

    return-void
.end method

.method public U(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    new-instance v0, Lcom/daaw/g2;

    invoke-direct {v0}, Lcom/daaw/g2;-><init>()V

    iget-object v1, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/daaw/g2;->j(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public V(I)V
    .locals 3

    const v0, 0xffffff

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    and-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    iget-object p1, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageAlpha(I)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    and-int/2addr v0, p1

    const/high16 v2, -0x1000000

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    iget-object v0, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageAlpha(I)V

    return-void
.end method

.method public W(I)V
    .locals 2

    new-instance v0, Lcom/daaw/g2;

    invoke-direct {v0}, Lcom/daaw/g2;-><init>()V

    iget-object v1, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/daaw/g2;->j(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public X([Lcom/daaw/l0;ILcom/daaw/wc0;)V
    .locals 7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V

    return-void
.end method

.method public Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/l0;",
            "I",
            "Lcom/daaw/wc0;",
            "ZZ",
            "Lcom/daaw/e0<",
            "Lcom/daaw/uk;",
            ">;)V"
        }
    .end annotation

    iput-object p6, p0, Lcom/daaw/uk;->G:Lcom/daaw/e0;

    iput-object p1, p0, Lcom/daaw/uk;->E:[Lcom/daaw/l0;

    if-nez p1, :cond_0

    const/4 p2, -0x1

    :cond_0
    const/4 p1, 0x0

    iget-object p5, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    if-eqz p4, :cond_1

    const p6, 0x7f080173

    invoke-virtual {p5, p6}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object p5, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    new-instance p6, Lcom/daaw/uk$d;

    invoke-direct {p6, p0, p3}, Lcom/daaw/uk$d;-><init>(Lcom/daaw/uk;Lcom/daaw/wc0;)V

    invoke-virtual {p5, p6}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    goto :goto_0

    :cond_1
    iget-object p6, p0, Lcom/daaw/uk;->D:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p5, p6}, Landroid/widget/ImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p5, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    invoke-virtual {p5, p1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :goto_0
    iget-object p5, p0, Lcom/daaw/uk;->E:[Lcom/daaw/l0;

    if-eqz p5, :cond_2

    array-length p5, p5

    if-lez p5, :cond_2

    iget-object p1, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    const/4 p5, 0x0

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    const p5, 0x7f08010a

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setImageResource(I)V

    iget-object p1, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    new-instance p5, Lcom/daaw/uk$e;

    invoke-direct {p5, p0, p4, p3}, Lcom/daaw/uk$e;-><init>(Lcom/daaw/uk;ZLcom/daaw/wc0;)V

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object p1, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    new-instance p5, Lcom/daaw/uk$f;

    invoke-direct {p5, p0, p4}, Lcom/daaw/uk$f;-><init>(Lcom/daaw/uk;Z)V

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_2
    iget-object p4, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    const/16 p5, 0x8

    invoke-virtual {p4, p5}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object p4, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    invoke-virtual {p4, p1}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object p4, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    invoke-virtual {p4, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    if-ltz p2, :cond_3

    iget-object p1, p0, Lcom/daaw/uk;->E:[Lcom/daaw/l0;

    array-length p4, p1

    if-lez p4, :cond_3

    aget-object p1, p1, p2

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance p3, Lcom/daaw/uk$g;

    invoke-direct {p3, p0, p1}, Lcom/daaw/uk$g;-><init>(Lcom/daaw/uk;Lcom/daaw/l0;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance p2, Lcom/daaw/uk$h;

    invoke-direct {p2, p0, p3}, Lcom/daaw/uk$h;-><init>(Lcom/daaw/uk;Lcom/daaw/wc0;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2
    iget-object p1, p0, Lcom/daaw/uk;->E:[Lcom/daaw/l0;

    if-eqz p1, :cond_4

    array-length p1, p1

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance p2, Lcom/daaw/uk$i;

    invoke-direct {p2, p0}, Lcom/daaw/uk$i;-><init>(Lcom/daaw/uk;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_4
    return-void
.end method

.method public final Z(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method

.method public a0(Lcom/daaw/wc0;Lcom/daaw/sd0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    return-void
.end method

.method public b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V
    .locals 3

    invoke-interface {p1}, Lcom/daaw/wc0;->s()Lcom/daaw/lo1;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/uk;->F:Z

    iget-object v1, p0, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, p0, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget-object v0, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/uk;->u:Ljava/lang/Object;

    if-eqz p2, :cond_0

    new-instance v1, Lcom/daaw/jh0$a;

    invoke-direct {v1, p3, p2}, Lcom/daaw/jh0$a;-><init>(Lcom/daaw/sd0;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    :goto_0
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance p3, Lcom/daaw/uk$a;

    invoke-direct {p3, p0, p1}, Lcom/daaw/uk$a;-><init>(Lcom/daaw/uk;Lcom/daaw/wc0;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance p3, Lcom/daaw/uk$b;

    invoke-direct {p3, p0}, Lcom/daaw/uk$b;-><init>(Lcom/daaw/uk;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object p2, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object p2, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    const p3, 0x7f08010a

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setImageResource(I)V

    iget-object p2, p0, Lcom/daaw/uk;->C:Landroid/widget/ImageButton;

    const p3, 0x7f040281

    invoke-static {p2, p3}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/daaw/uk;->S(I)V

    iget-object p2, p0, Lcom/daaw/uk;->w:Landroid/view/View;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/View;->setActivated(Z)V

    const/4 p2, -0x1

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/uk;->X([Lcom/daaw/l0;ILcom/daaw/wc0;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance p2, Lcom/daaw/uk$c;

    invoke-direct {p2, p0}, Lcom/daaw/uk$c;-><init>(Lcom/daaw/uk;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public c0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uk;->A:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d0(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/uk;->F:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/uk;->A:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/uk;->A:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
