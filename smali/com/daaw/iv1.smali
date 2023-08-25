.class public Lcom/daaw/iv1;
.super Landroid/app/DialogFragment;
.source ""


# static fields
.field public static A:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/sv1;",
            ">;"
        }
    .end annotation
.end field

.field public static B:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/sv1;",
            ">;"
        }
    .end annotation
.end field

.field public static C:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/sv1;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static D:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/iv1;",
            "Lcom/daaw/sv1;",
            ">;"
        }
    .end annotation
.end field

.field public static E:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/iv1;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public static F:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/util/List<",
            "Lcom/daaw/sv1;",
            ">;",
            "Lcom/daaw/ir1<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public static G:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/iv1;",
            ">;"
        }
    .end annotation
.end field

.field public static x:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Lcom/daaw/iv1;",
            "Ljava/lang/Integer;",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public static y:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/util/List<",
            "Lcom/daaw/sv1;",
            ">;",
            "Lcom/daaw/lo1<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public static z:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/sv1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public p:Lcom/daaw/la;

.field public q:Landroid/widget/GridLayout;

.field public r:Landroidx/constraintlayout/widget/Group;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/ImageView;

.field public u:Lcom/daaw/sv1;

.field public v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final w:[Landroid/view/View;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->x:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->y:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->z:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->A:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->B:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->C:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->D:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->E:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/iv1;->F:Lcom/daaw/ww1;

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/iv1;->G:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/iv1;->u:Lcom/daaw/sv1;

    iput-object v0, p0, Lcom/daaw/iv1;->v:Ljava/util/List;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iput-object v1, p0, Lcom/daaw/iv1;->w:[Landroid/view/View;

    const/4 v0, 0x2

    invoke-virtual {p0, v0, v2}, Landroid/app/DialogFragment;->setStyle(II)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/iv1;->G:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/iv1;)Lcom/daaw/sv1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/iv1;->u:Lcom/daaw/sv1;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/iv1;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/iv1;->v:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/iv1;[Landroid/view/View;Landroid/view/View;Lcom/daaw/sv1;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/iv1;->h([Landroid/view/View;Landroid/view/View;Lcom/daaw/sv1;)V

    return-void
.end method

.method public static d(Landroid/app/Activity;)Lcom/daaw/iv1;
    .locals 2

    invoke-static {}, Lcom/daaw/iv1;->f()Lcom/daaw/iv1;

    move-result-object v0

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    const-string p0, "VisualizerChooseDialog"

    invoke-static {v0, p0, v1}, Lcom/daaw/gr1;->x(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/al;)V

    return-object v0
.end method

.method public static e()Lcom/daaw/iv1;
    .locals 1

    sget-object v0, Lcom/daaw/iv1;->G:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/iv1;

    return-object v0
.end method

.method public static f()Lcom/daaw/iv1;
    .locals 2

    new-instance v0, Lcom/daaw/iv1;

    invoke-direct {v0}, Lcom/daaw/iv1;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public g()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/daaw/iv1;->y:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/lo1;

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v2, v3, v4}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lo1;

    iget-object v2, v1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-virtual {p0, v2, v1, v0}, Lcom/daaw/iv1;->i(ILjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public final h([Landroid/view/View;Landroid/view/View;Lcom/daaw/sv1;)V
    .locals 0

    iput-object p3, p0, Lcom/daaw/iv1;->u:Lcom/daaw/sv1;

    invoke-static {p1, p2}, Lcom/daaw/gr1;->t([Landroid/view/View;Landroid/view/View;)V

    iget-boolean p1, p3, Lcom/daaw/sv1;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/iv1;->r:Landroidx/constraintlayout/widget/Group;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lcom/daaw/iv1;->s:Landroid/widget/TextView;

    const/high16 p2, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/iv1;->r:Landroidx/constraintlayout/widget/Group;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lcom/daaw/iv1;->s:Landroid/widget/TextView;

    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object p1, p0, Lcom/daaw/iv1;->t:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setAlpha(F)V

    return-void
.end method

.method public i(ILjava/util/List;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/sv1;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/iv1;->q:Landroid/widget/GridLayout;

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v1}, Landroid/widget/GridLayout;->removeAllViews()V

    iput-object p2, p0, Lcom/daaw/iv1;->v:Ljava/util/List;

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/daaw/iv1;->v:Ljava/util/List;

    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_4

    new-instance v1, Lcom/daaw/iv1$f;

    invoke-direct {v1, p0, p3}, Lcom/daaw/iv1$f;-><init>(Lcom/daaw/iv1;Ljava/util/List;)V

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/sv1;

    const v5, 0x7f0c003d

    invoke-static {v0, v5, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f090085

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageButton;

    invoke-virtual {v6, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    iget v7, v4, Lcom/daaw/sv1;->a:I

    if-ne p1, v7, :cond_3

    iget-object v7, p0, Lcom/daaw/iv1;->w:[Landroid/view/View;

    invoke-virtual {p0, v7, v6, v4}, Lcom/daaw/iv1;->h([Landroid/view/View;Landroid/view/View;Lcom/daaw/sv1;)V

    :cond_3
    iget-object v4, p0, Lcom/daaw/iv1;->q:Landroid/widget/GridLayout;

    invoke-virtual {v4, v5}, Landroid/widget/GridLayout;->addView(Landroid/view/View;)V

    invoke-interface {p2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/daaw/iv1;->F:Lcom/daaw/ww1;

    invoke-virtual {p1, p3, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ir1;

    new-instance p3, Lcom/daaw/iv1$g;

    invoke-direct {p3, p0, p2}, Lcom/daaw/iv1$g;-><init>(Lcom/daaw/iv1;Ljava/util/List;)V

    invoke-virtual {p1, p3}, Lcom/daaw/ir1;->a(Lcom/daaw/ir1$b;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/app/DialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    sget-object p2, Lcom/daaw/iv1;->x:Lcom/daaw/sw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p0, p1, p3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/DialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c003c

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090141

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/GridLayout;

    iput-object p2, p0, Lcom/daaw/iv1;->q:Landroid/widget/GridLayout;

    const p2, 0x7f090084

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/Group;

    new-instance p3, Lcom/daaw/iv1$a;

    invoke-direct {p3, p0}, Lcom/daaw/iv1$a;-><init>(Lcom/daaw/iv1;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09009a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/Group;

    iput-object p2, p0, Lcom/daaw/iv1;->r:Landroidx/constraintlayout/widget/Group;

    new-instance p3, Lcom/daaw/iv1$b;

    invoke-direct {p3, p0}, Lcom/daaw/iv1$b;-><init>(Lcom/daaw/iv1;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/daaw/iv1;->r:Landroidx/constraintlayout/widget/Group;

    new-instance p3, Lcom/daaw/iv1$c;

    invoke-direct {p3, p0}, Lcom/daaw/iv1$c;-><init>(Lcom/daaw/iv1;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const p2, 0x7f09009c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/iv1;->s:Landroid/widget/TextView;

    const p2, 0x7f09009b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/daaw/iv1;->t:Landroid/widget/ImageView;

    const p2, 0x7f0900a2

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/Group;

    new-instance p3, Lcom/daaw/iv1$d;

    invoke-direct {p3, p0}, Lcom/daaw/iv1$d;-><init>(Lcom/daaw/iv1;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09008f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/Group;

    new-instance p3, Lcom/daaw/iv1$e;

    invoke-direct {p3, p0}, Lcom/daaw/iv1$e;-><init>(Lcom/daaw/iv1;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p2, Lcom/daaw/la;

    const p3, 0x7f09004c

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    const/4 v0, 0x2

    invoke-direct {p2, v0, p3}, Lcom/daaw/la;-><init>(ILandroid/view/View;)V

    iput-object p2, p0, Lcom/daaw/iv1;->p:Lcom/daaw/la;

    const/16 p3, 0x19

    invoke-virtual {p2, p3}, Lcom/daaw/la;->d(I)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {p0}, Lcom/daaw/iv1;->g()V

    return-object p1
.end method

.method public onDestroyView()V
    .locals 0

    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroyView()V

    return-void
.end method
