.class public Lcom/daaw/cx0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    sget-object v0, Lcom/daaw/ko0;->I:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/cx0$c;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$c;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->J:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/cx0$d;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$d;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->K:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/cx0$e;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$e;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->L:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/cx0$f;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$f;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->O:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/cx0$g;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$g;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->H:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/cx0$h;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$h;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->b0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/cx0$i;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$i;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->c0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/cx0$j;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$j;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/l01;->w:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/cx0$k;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$k;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->A0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/cx0$a;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$a;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MediaControlsView;->p:Lcom/daaw/avee/MediaControlsView$a;

    invoke-virtual {v0}, Lcom/daaw/avee/MediaControlsView$a;->a()Lcom/daaw/sw1;

    move-result-object v0

    new-instance v1, Lcom/daaw/cx0$b;

    invoke-direct {v1, p0}, Lcom/daaw/cx0$b;-><init>(Lcom/daaw/cx0;)V

    iget-object v2, p0, Lcom/daaw/cx0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(ZI)I
    .locals 2

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
