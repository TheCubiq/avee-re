.class public Lcom/daaw/fl;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/daaw/sd0;",
            "Lcom/daaw/jh0<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public c:Ljava/util/List;
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

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/fl;->a:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/fl;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    sget-object v0, Lcom/daaw/el;->e:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/fl$b;

    invoke-direct {v1, p0}, Lcom/daaw/fl$b;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/el;->f:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/fl$c;

    invoke-direct {v1, p0}, Lcom/daaw/fl$c;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/el;->g:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/fl$d;

    invoke-direct {v1, p0}, Lcom/daaw/fl$d;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/el;->h:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/fl$e;

    invoke-direct {v1, p0}, Lcom/daaw/fl$e;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/el;->i:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/fl$f;

    invoke-direct {v1, p0}, Lcom/daaw/fl$f;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->h0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/fl$g;

    invoke-direct {v1, p0}, Lcom/daaw/fl$g;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->n0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/fl$h;

    invoke-direct {v1, p0}, Lcom/daaw/fl$h;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->N:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/fl$i;

    invoke-direct {v1, p0}, Lcom/daaw/fl$i;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->O:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/fl$j;

    invoke-direct {v1, p0}, Lcom/daaw/fl$j;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->g0:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/fl$a;

    invoke-direct {v1, p0}, Lcom/daaw/fl$a;-><init>(Lcom/daaw/fl;)V

    iget-object v2, p0, Lcom/daaw/fl;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/fl;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/fl;->a:Z

    return p0
.end method

.method public static synthetic b(Lcom/daaw/fl;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/fl;->a:Z

    return p1
.end method

.method public static synthetic c(Lcom/daaw/fl;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fl;->b:Ljava/util/HashMap;

    return-object p0
.end method


# virtual methods
.method public d(Lcom/daaw/jh0$a;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/fl;->b:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/daaw/jh0$a;->c()Lcom/daaw/sd0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/jh0;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/jh0$a;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/jh0;->b(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
