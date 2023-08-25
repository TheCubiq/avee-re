.class public Lcom/daaw/io;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/widget/ScrollView;

.field public b:Landroidx/recyclerview/widget/RecyclerView;

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Landroid/view/View;

.field public f:Landroid/widget/ImageButton;

.field public g:Landroid/widget/ImageButton;

.field public h:Landroid/widget/GridLayout;

.field public i:Lcom/daaw/wn;

.field public j:Lcom/daaw/xn;

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ho$i;",
            ">;"
        }
    .end annotation
.end field

.field public l:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/io;->l:I

    return-void
.end method

.method public static C(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/daaw/io;->i(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static synthetic a(Lcom/daaw/io;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/io;->h()V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/io;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/io;->A()V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/io;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/io;->g()V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/io;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/io;->B()V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/io;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/io;Ljava/util/List;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/io;->D(Ljava/util/List;Z)V

    return-void
.end method

.method public static i(Ljava/lang/String;)I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    :goto_0
    const/4 p0, -0x1

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "MotionBlurEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0xa

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "MirrorEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/16 p0, 0x9

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "AppLogo"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/16 p0, 0x8

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "Composition"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x7

    goto :goto_1

    :sswitch_4
    const-string v0, "Particles"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x6

    goto :goto_1

    :sswitch_5
    const-string v0, "BlurEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 p0, 0x5

    goto :goto_1

    :sswitch_6
    const-string v0, "Image"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p0, 0x4

    goto :goto_1

    :sswitch_7
    const-string v0, "RgbSplitEffect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 p0, 0x3

    goto :goto_1

    :sswitch_8
    const-string v0, "Text"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 p0, 0x2

    goto :goto_1

    :sswitch_9
    const-string v0, "Bars"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 p0, 0x1

    goto :goto_1

    :sswitch_a
    const-string v0, "AudioProvider"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 p0, 0x0

    :goto_1
    packed-switch p0, :pswitch_data_0

    return v1

    :pswitch_0
    const p0, 0x7f100027

    return p0

    :pswitch_1
    const p0, 0x7f100026

    return p0

    :pswitch_2
    const p0, 0x7f10029e

    return p0

    :pswitch_3
    const p0, 0x7f100024

    return p0

    :pswitch_4
    const p0, 0x7f100028

    return p0

    :pswitch_5
    const p0, 0x7f100023

    return p0

    :pswitch_6
    const p0, 0x7f100025

    return p0

    :pswitch_7
    const p0, 0x7f100029

    return p0

    :pswitch_8
    const p0, 0x7f10002b

    return p0

    :pswitch_9
    const p0, 0x7f10002a

    return p0

    :pswitch_a
    const p0, 0x7f100022

    return p0

    :sswitch_data_0
    .sparse-switch
        -0x7e6b0039 -> :sswitch_a
        0x1f7ae0 -> :sswitch_9
        0x27b94d -> :sswitch_8
        0x423ae5e -> :sswitch_7
        0x437b93b -> :sswitch_6
        0xbc988f8 -> :sswitch_5
        0xc23828d -> :sswitch_4
        0x3168b18a -> :sswitch_3
        0x33e2534c -> :sswitch_2
        0x461e5a50 -> :sswitch_1
        0x5754e14e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static p(Lcom/daaw/rn;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rn;",
            "Ljava/util/List<",
            "Lcom/daaw/ho$i;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/rn;->c()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lcom/daaw/rn;->A0(I)Lcom/daaw/un;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "CustomPropertiesList is null"

    invoke-static {v2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lcom/daaw/un;->B()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/daaw/dx0;->c()Landroid/content/Context;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/io;->C(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    const-string v5, "_id"

    invoke-virtual {v2, v5, v4}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v4

    new-instance v5, Lcom/daaw/ho$i;

    invoke-direct {v5, v3, v2, v4}, Lcom/daaw/ho$i;-><init>(Ljava/lang/String;Lcom/daaw/un;I)V

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/io;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/io;->g()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/io;->n()V

    :goto_0
    return-void
.end method

.method public final B()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/io;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/io;->h()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/io;->o()V

    :goto_0
    return-void
.end method

.method public final D(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ho$i;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/daaw/ho;->y:Lcom/daaw/vn;

    invoke-virtual {p0, v1, p1}, Lcom/daaw/io;->t(Lcom/daaw/vn;Ljava/util/List;)V

    iget p1, p0, Lcom/daaw/io;->l:I

    invoke-virtual {p0, p1}, Lcom/daaw/io;->y(I)V

    invoke-virtual {v0, p2}, Lcom/daaw/ho;->r(Z)V

    return-void
.end method

.method public E(I)V
    .locals 4

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ho$i;

    iget-object v1, p0, Lcom/daaw/io;->j:Lcom/daaw/xn;

    new-instance v2, Lcom/daaw/lo1;

    iget-object v3, v0, Lcom/daaw/ho$i;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/daaw/ho$i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2}, Lcom/daaw/xn;->B(ILcom/daaw/lo1;)V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 5

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/io;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v3, v0, Lcom/daaw/ho;->p:I

    int-to-long v3, v3

    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    iget-object v1, p0, Lcom/daaw/io;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v0, v0, Lcom/daaw/ho;->p:I

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/daaw/io$a;

    invoke-direct {v1, p0}, Lcom/daaw/io$a;-><init>(Lcom/daaw/io;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public final h()V
    .locals 5

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/io;->f:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v3, v0, Lcom/daaw/ho;->p:I

    int-to-long v3, v3

    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    iget-object v1, p0, Lcom/daaw/io;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v0, v0, Lcom/daaw/ho;->p:I

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/daaw/io$c;

    invoke-direct {v1, p0}, Lcom/daaw/io$c;-><init>(Lcom/daaw/io;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public j(I)Lcom/daaw/ho$i;
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ho$i;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public k()Z
    .locals 5

    iget-object v0, p0, Lcom/daaw/io;->i:Lcom/daaw/wn;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/wn;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v3, p0, Lcom/daaw/io;->c:Landroid/view/View;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-ne v3, v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v3, 0x1

    :goto_3
    if-eqz v3, :cond_4

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    return v1
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/io;->g:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 9

    const p1, 0x7f09004a

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/io;->c:Landroid/view/View;

    const p1, 0x7f090129

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/io;->e:Landroid/view/View;

    const p1, 0x7f09012a

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/io;->d:Landroid/view/View;

    const p1, 0x7f090089

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/io;->g:Landroid/widget/ImageButton;

    new-instance p3, Lcom/daaw/io$e;

    invoke-direct {p3, p0}, Lcom/daaw/io$e;-><init>(Lcom/daaw/io;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f09008a

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/io;->f:Landroid/widget/ImageButton;

    new-instance p3, Lcom/daaw/io$f;

    invoke-direct {p3, p0}, Lcom/daaw/io$f;-><init>(Lcom/daaw/io;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f09009f

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p3, Lcom/daaw/io$g;

    invoke-direct {p3, p0, p4}, Lcom/daaw/io$g;-><init>(Lcom/daaw/io;Landroid/app/Activity;)V

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/daaw/io;->e:Landroid/view/View;

    check-cast p1, Landroid/widget/GridLayout;

    iput-object p1, p0, Lcom/daaw/io;->h:Landroid/widget/GridLayout;

    invoke-virtual {p1}, Landroid/widget/GridLayout;->removeAllViews()V

    new-instance p1, Lcom/daaw/io$h;

    invoke-direct {p1, p0, p5}, Lcom/daaw/io$h;-><init>(Lcom/daaw/io;[Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v1, p5

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    :try_start_0
    aget-object v1, p5, v0

    invoke-virtual {p3, v1}, Lcom/daaw/ho;->n(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f0c0041

    invoke-static {p4, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    goto :goto_1

    :cond_1
    const v1, 0x7f0c0040

    invoke-static {p4, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    const v2, 0x7f090085

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object v3, p5, v0

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/io;->C(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/daaw/io;->h:Landroid/widget/GridLayout;

    invoke-virtual {v2, v1}, Landroid/widget/GridLayout;->addView(Landroid/view/View;)V

    goto :goto_2

    :catch_0
    move-exception v1

    const-string v2, "error inflating"

    invoke-static {v1, v2}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const p1, 0x7f090231

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/daaw/io;->a:Landroid/widget/ScrollView;

    const p1, 0x7f09020f

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/daaw/io;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    new-instance v7, Lcom/daaw/wn;

    iget-object p1, p0, Lcom/daaw/io;->a:Landroid/widget/ScrollView;

    invoke-direct {v7, p4, v2, p1}, Lcom/daaw/wn;-><init>(Landroid/content/Context;Ljava/util/List;Landroid/view/ViewGroup;)V

    iput-object v7, p0, Lcom/daaw/io;->i:Lcom/daaw/wn;

    new-instance p1, Lcom/daaw/xn;

    const v5, 0x7f0c0029

    const/4 v6, 0x0

    new-instance v8, Lcom/daaw/io$i;

    invoke-direct {v8, p0}, Lcom/daaw/io$i;-><init>(Lcom/daaw/io;)V

    move-object v3, p1

    move-object v4, p4

    invoke-direct/range {v3 .. v8}, Lcom/daaw/xn;-><init>(Landroid/content/Context;IILcom/daaw/wn;Lcom/daaw/w40;)V

    iput-object p1, p0, Lcom/daaw/io;->j:Lcom/daaw/xn;

    iget-object p2, p0, Lcom/daaw/io;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    new-instance p1, Lcom/daaw/lu;

    invoke-direct {p1}, Lcom/daaw/lu;-><init>()V

    const p2, 0x7f09008e

    invoke-virtual {p1, p2}, Lcom/daaw/lu;->x(I)V

    const p2, 0x3ecccccd    # 0.4f

    invoke-virtual {p1, p2}, Lcom/daaw/lu;->t(F)V

    invoke-virtual {p4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f060142

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/lu;->u(I)V

    const p2, 0x3e99999a    # 0.3f

    invoke-virtual {p1, p2}, Lcom/daaw/lu;->r(F)V

    const p2, 0x3dcccccd    # 0.1f

    invoke-virtual {p1, p2}, Lcom/daaw/lu;->s(F)V

    new-instance p2, Lcom/daaw/io$j;

    invoke-direct {p2, p0}, Lcom/daaw/io$j;-><init>(Lcom/daaw/io;)V

    invoke-virtual {p1, p2}, Lcom/daaw/lu;->w(Lcom/daaw/lu$c;)V

    iget-object p2, p0, Lcom/daaw/io;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    iget-object p2, p0, Lcom/daaw/io;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/RecyclerView$s;)V

    iget-object p2, p0, Lcom/daaw/io;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Lcom/daaw/lu;->q()Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    iget-object p2, p0, Lcom/daaw/io;->i:Lcom/daaw/wn;

    new-instance p3, Lcom/daaw/io$k;

    invoke-direct {p3, p0, p1}, Lcom/daaw/io$k;-><init>(Lcom/daaw/io;Lcom/daaw/lu;)V

    invoke-virtual {p2, p3}, Lcom/daaw/wn;->E(Lcom/daaw/wn$c;)V

    iget-object p1, p0, Lcom/daaw/io;->i:Lcom/daaw/wn;

    new-instance p2, Lcom/daaw/io$l;

    invoke-direct {p2, p0}, Lcom/daaw/io$l;-><init>(Lcom/daaw/io;)V

    invoke-virtual {p1, p2}, Lcom/daaw/wn;->F(Lcom/daaw/wn$d;)V

    iget-object p1, p0, Lcom/daaw/io;->j:Lcom/daaw/xn;

    new-instance p2, Lcom/daaw/io$m;

    invoke-direct {p2, p0}, Lcom/daaw/io$m;-><init>(Lcom/daaw/io;)V

    invoke-virtual {p1, p2}, Lcom/daaw/xn;->E(Lcom/daaw/wn$d;)V

    return-void
.end method

.method public final n()V
    .locals 4

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/io;->g:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, -0x3dcc0000    # -45.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v2, v0, Lcom/daaw/ho;->p:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    iget-object v1, p0, Lcom/daaw/io;->e:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/daaw/io;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v0, v0, Lcom/daaw/ho;->p:I

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    iget-object v0, p0, Lcom/daaw/io;->a:Landroid/widget/ScrollView;

    new-instance v1, Lcom/daaw/io$b;

    invoke-direct {v1, p0}, Lcom/daaw/io$b;-><init>(Lcom/daaw/io;)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final o()V
    .locals 4

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/io;->f:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, -0x3dcc0000    # -45.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v2, v0, Lcom/daaw/ho;->p:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    iget-object v1, p0, Lcom/daaw/io;->d:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/daaw/io;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget v0, v0, Lcom/daaw/ho;->p:I

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    iget-object v0, p0, Lcom/daaw/io;->a:Landroid/widget/ScrollView;

    new-instance v1, Lcom/daaw/io$d;

    invoke-direct {v1, p0}, Lcom/daaw/io$d;-><init>(Lcom/daaw/io;)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public q(Lcom/daaw/vn;)V
    .locals 10

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ho;->p()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/io;->l()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/vn;->c()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    invoke-virtual {p1, v3}, Lcom/daaw/vn;->j(I)Lcom/daaw/rn;

    move-result-object v4

    if-nez v4, :cond_2

    const-string v4, "CustomPropertiesList is null"

    invoke-static {v4}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const/4 v5, 0x1

    if-nez v3, :cond_3

    const v6, 0x7f1002d7

    invoke-virtual {v0, v6}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0e000b

    new-array v8, v5, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v2

    invoke-virtual {v6, v7, v3, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    :goto_1
    const/4 v7, -0x1

    const-string v8, "_id"

    invoke-virtual {v4, v8, v7}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v7

    iget-object v8, p0, Lcom/daaw/io;->k:Ljava/util/List;

    new-instance v9, Lcom/daaw/ho$i;

    invoke-direct {v9, v6, v4, v7, v5}, Lcom/daaw/ho$i;-><init>(Ljava/lang/String;Lcom/daaw/rn;IZ)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-static {v4, v5}, Lcom/daaw/io;->p(Lcom/daaw/rn;Ljava/util/List;)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    iget p1, p0, Lcom/daaw/io;->l:I

    invoke-virtual {p0, p1}, Lcom/daaw/io;->y(I)V

    :cond_5
    :goto_3
    return-void
.end method

.method public r(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/io;->s(IZ)V

    return-void
.end method

.method public s(IZ)V
    .locals 1

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/io;->l:I

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ho;->w(IZ)V

    iget-object p2, p0, Lcom/daaw/io;->j:Lcom/daaw/xn;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lcom/daaw/xn;->G(I)V

    :cond_1
    if-ltz p1, :cond_2

    iget-object p2, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_2

    iget-object p2, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ho$i;

    invoke-virtual {p1}, Lcom/daaw/ho$i;->b()Lcom/daaw/un;

    move-result-object p2

    invoke-virtual {p1}, Lcom/daaw/ho$i;->a()Lcom/daaw/rn;

    move-result-object p1

    if-eqz p2, :cond_3

    invoke-virtual {v0, p2}, Lcom/daaw/ho;->y(Lcom/daaw/un;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :cond_3
    invoke-virtual {v0, p1}, Lcom/daaw/ho;->y(Lcom/daaw/un;)V

    :goto_0
    return-void
.end method

.method public t(Lcom/daaw/vn;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vn;",
            "Ljava/util/List<",
            "Lcom/daaw/ho$i;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/vn;->m()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/ho$i;

    invoke-virtual {v5}, Lcom/daaw/ho$i;->a()Lcom/daaw/rn;

    move-result-object v6

    invoke-virtual {v5}, Lcom/daaw/ho$i;->b()Lcom/daaw/un;

    move-result-object v5

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/daaw/rn;->D0()V

    invoke-virtual {p1, v3, v6}, Lcom/daaw/vn;->r(ILcom/daaw/rn;)V

    add-int/lit8 v3, v3, 0x1

    move-object v1, v6

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    if-eqz v5, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v4, v5}, Lcom/daaw/rn;->F0(ILcom/daaw/un;)V

    add-int/lit8 v4, v4, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public u(I)V
    .locals 2

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ho;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/io;->l()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/io;->D(Ljava/util/List;Z)V

    :cond_2
    iget v0, p0, Lcom/daaw/io;->l:I

    if-ne p1, v0, :cond_3

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lcom/daaw/io;->r(I)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Lcom/daaw/io;->r(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public v()V
    .locals 2

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ho;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/io;->l()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/io;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->j1(I)V

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/daaw/io;->r(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public w(I)V
    .locals 5

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ho;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/daaw/io;->l()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, -0x1

    :goto_0
    iget-object v3, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ho$i;

    invoke-virtual {v3}, Lcom/daaw/ho$i;->a()Lcom/daaw/rn;

    move-result-object v3

    if-eqz v3, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    if-le v1, p1, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v0, 0x1

    move v4, v2

    move v2, v0

    move v0, v4

    goto :goto_0

    :cond_4
    :goto_1
    if-lez v2, :cond_5

    iget-object p1, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v2, :cond_5

    iget-object p1, p0, Lcom/daaw/io;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->j1(I)V

    invoke-virtual {p0, v2}, Lcom/daaw/io;->r(I)V

    :cond_5
    :goto_2
    return-void
.end method

.method public x(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/io;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/daaw/io;->i:Lcom/daaw/wn;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/daaw/wn;->C(Z)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/io;->h()V

    invoke-virtual {p0}, Lcom/daaw/io;->g()V

    :cond_3
    return-void
.end method

.method public y(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/io;->k:Ljava/util/List;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/io;->z(Ljava/util/List;I)V

    return-void
.end method

.method public z(Ljava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ho$i;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/io;->i:Lcom/daaw/wn;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/ho$i;

    invoke-virtual {v5}, Lcom/daaw/ho$i;->d()Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v6, Lcom/daaw/xn$d;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    iget-object v5, v5, Lcom/daaw/ho$i;->a:Ljava/lang/String;

    invoke-direct {v6, v7, v5}, Lcom/daaw/xn$d;-><init>(ILjava/lang/CharSequence;)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v6, Lcom/daaw/lo1;

    iget-object v7, v5, Lcom/daaw/ho$i;->a:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/daaw/ho$i;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/daaw/io;->i:Lcom/daaw/wn;

    invoke-virtual {p1, v1}, Lcom/daaw/wn;->B(Ljava/util/List;)V

    iget-object p1, p0, Lcom/daaw/io;->j:Lcom/daaw/xn;

    invoke-virtual {p1, v2}, Lcom/daaw/xn;->F(Ljava/util/List;)V

    iget-object p1, p0, Lcom/daaw/io;->j:Lcom/daaw/xn;

    invoke-virtual {p1, p2}, Lcom/daaw/xn;->G(I)V

    iget p1, p0, Lcom/daaw/io;->l:I

    invoke-virtual {v0, p1, v3}, Lcom/daaw/ho;->w(IZ)V

    return-void
.end method
