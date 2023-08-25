.class public Lcom/daaw/yn;
.super Landroidx/recyclerview/widget/RecyclerView$c0;
.source ""


# static fields
.field public static final A:[Lcom/daaw/l0;

.field public static final B:[Lcom/daaw/l0;

.field public static final C:[Lcom/daaw/l0;

.field public static z:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public t:Z

.field public final u:Landroid/widget/TextView;

.field public final v:Landroid/widget/TextView;

.field public final w:Landroid/widget/ImageButton;

.field public final x:Landroid/view/ViewGroup;

.field public y:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/yn;->z:Lcom/daaw/vw1;

    const/4 v0, 0x1

    new-array v1, v0, [Lcom/daaw/l0;

    new-instance v2, Lcom/daaw/yn$a;

    invoke-direct {v2}, Lcom/daaw/yn$a;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sput-object v1, Lcom/daaw/yn;->A:[Lcom/daaw/l0;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/daaw/l0;

    new-instance v2, Lcom/daaw/yn$b;

    invoke-direct {v2}, Lcom/daaw/yn$b;-><init>()V

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/yn$c;

    invoke-direct {v2}, Lcom/daaw/yn$c;-><init>()V

    aput-object v2, v1, v0

    sput-object v1, Lcom/daaw/yn;->B:[Lcom/daaw/l0;

    new-array v0, v0, [Lcom/daaw/l0;

    new-instance v1, Lcom/daaw/yn$d;

    invoke-direct {v1}, Lcom/daaw/yn$d;-><init>()V

    aput-object v1, v0, v3

    sput-object v0, Lcom/daaw/yn;->C:[Lcom/daaw/l0;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$c0;-><init>(Landroid/view/View;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/yn;->t:Z

    const v0, 0x7f0902e4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/yn;->u:Landroid/widget/TextView;

    const v0, 0x7f0902e5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/yn;->v:Landroid/widget/TextView;

    const v0, 0x7f0900cc

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/daaw/yn;->x:Landroid/view/ViewGroup;

    const v0, 0x7f09008e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/yn;->w:Landroid/widget/ImageButton;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lcom/daaw/wn$c;Landroid/view/ViewGroup;)V
    .locals 2

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$c0;-><init>(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/yn;->t:Z

    const v0, 0x7f0902e4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/yn;->u:Landroid/widget/TextView;

    const v0, 0x7f0902e5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/yn;->v:Landroid/widget/TextView;

    const v0, 0x7f0900cc

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/daaw/yn;->x:Landroid/view/ViewGroup;

    const v0, 0x7f09008e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/daaw/yn;->w:Landroid/widget/ImageButton;

    new-instance v1, Lcom/daaw/yn$e;

    invoke-direct {v1, p0, p2, p1}, Lcom/daaw/yn$e;-><init>(Lcom/daaw/yn;Lcom/daaw/wn$c;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    new-instance p1, Lcom/daaw/yn$f;

    invoke-direct {p1, p0, p3}, Lcom/daaw/yn$f;-><init>(Lcom/daaw/yn;Landroid/view/ViewGroup;)V

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public O(Landroid/view/View;[Lcom/daaw/l0;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/widget/PopupMenu;

    invoke-direct {v1, v0, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    new-instance v0, Lcom/daaw/yn$h;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/yn$h;-><init>(Lcom/daaw/yn;[Lcom/daaw/l0;Landroid/view/View;)V

    invoke-virtual {v1, v0}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    array-length v2, p2

    if-ge v0, v2, :cond_1

    aget-object v2, p2, v0

    invoke-virtual {v2}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/ch0;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    aget-object v2, p2, v0

    invoke-virtual {v2}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/ch0;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v2

    aget-object v3, p2, v0

    invoke-virtual {v3}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/ch0;->c()I

    move-result v3

    aget-object v4, p2, v0

    invoke-virtual {v4}, Lcom/daaw/l0;->b()Lcom/daaw/ch0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/ch0;->d()I

    move-result v4

    invoke-interface {v2, p1, v0, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->show()V

    return-void
.end method

.method public P()V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$c0;->l()I

    move-result v0

    iput v0, p0, Lcom/daaw/yn;->y:I

    iget-boolean v1, p0, Lcom/daaw/yn;->t:Z

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/yn;->Q([Lcom/daaw/l0;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/yn;->C:[Lcom/daaw/l0;

    invoke-virtual {p0, v0}, Lcom/daaw/yn;->Q([Lcom/daaw/l0;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/daaw/yn;->z:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/daaw/yn;->B:[Lcom/daaw/l0;

    invoke-virtual {p0, v0}, Lcom/daaw/yn;->Q([Lcom/daaw/l0;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/daaw/yn;->A:[Lcom/daaw/l0;

    invoke-virtual {p0, v0}, Lcom/daaw/yn;->Q([Lcom/daaw/l0;)V

    :goto_0
    return-void
.end method

.method public Q([Lcom/daaw/l0;)V
    .locals 2

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance v1, Lcom/daaw/yn$g;

    invoke-direct {v1, p0, p1}, Lcom/daaw/yn$g;-><init>(Lcom/daaw/yn;[Lcom/daaw/l0;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :goto_0
    return-void
.end method

.method public R(Ljava/lang/CharSequence;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yn;->v:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/daaw/yn;->v:Landroid/widget/TextView;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/yn;->v:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/daaw/yn;->v:Landroid/widget/TextView;

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
