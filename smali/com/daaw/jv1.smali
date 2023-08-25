.class public Lcom/daaw/jv1;
.super Lcom/daaw/kt;
.source ""


# instance fields
.field public b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/kt;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/jv1;->b:Ljava/lang/ref/WeakReference;

    sget-object v0, Lcom/daaw/ho;->T:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/jv1$c;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$c;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->w:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/jv1$d;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$d;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->F:Lcom/daaw/uw1;

    new-instance v1, Lcom/daaw/jv1$e;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$e;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->R:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/jv1$f;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$f;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->Q:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/jv1$g;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$g;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->N:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/jv1$h;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$h;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->S:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/jv1$i;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$i;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/lj0;->u:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/jv1$j;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$j;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->O:Lcom/daaw/yw1;

    new-instance v1, Lcom/daaw/jv1$k;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$k;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/yw1;->b(Lcom/daaw/yw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->P:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/jv1$a;

    invoke-direct {v1, p0}, Lcom/daaw/jv1$a;-><init>(Lcom/daaw/jv1;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/jv1;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1;->b:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public static synthetic b(Lcom/daaw/jv1;Lcom/daaw/vn;ZI)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/jv1;->d(Lcom/daaw/vn;ZI)V

    return-void
.end method


# virtual methods
.method public c(Lcom/daaw/vn;Ljava/lang/String;)V
    .locals 1

    const-string v0, "Composition"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/vn;->f()Lcom/daaw/rn;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/vn;->c()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/vn;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/daaw/vn;->j(I)Lcom/daaw/rn;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/rn;->w0()Lcom/daaw/un;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1, p2}, Lcom/daaw/un;->E(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final d(Lcom/daaw/vn;ZI)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jv1;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/jv1$b;

    invoke-direct {v1, p0, p2, p3}, Lcom/daaw/jv1$b;-><init>(Lcom/daaw/jv1;ZI)V

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->o(Lcom/daaw/vn;Lcom/daaw/e0;)V

    :cond_0
    return-void
.end method
