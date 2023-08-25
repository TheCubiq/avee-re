.class public Lcom/daaw/tv1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Ljava/lang/String; = "10"

.field public static d:Lcom/daaw/tv1;


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/sv1;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/sv1;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/tv1;->b:Ljava/util/List;

    sput-object p0, Lcom/daaw/tv1;->d:Lcom/daaw/tv1;

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$k;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$k;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$l;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$l;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$m;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$m;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$n;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$n;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$o;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$o;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$p;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$p;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$q;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$q;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$r;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$r;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$s;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$s;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$a;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$a;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$b;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$b;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$c;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$c;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$d;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$d;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$e;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$e;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$f;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$f;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$g;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$g;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$h;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$h;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/tv1;->a:Ljava/util/List;

    new-instance v1, Lcom/daaw/lo1;

    new-instance v2, Lcom/daaw/sv1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v3, Lcom/daaw/tv1$i;

    invoke-direct {v3, p0}, Lcom/daaw/tv1$i;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/tv1;->b:Ljava/util/List;

    new-instance v2, Lcom/daaw/lo1;

    new-instance v3, Lcom/daaw/sv1;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Lcom/daaw/sv1;-><init>(I)V

    new-instance v4, Lcom/daaw/tv1$j;

    invoke-direct {v4, p0}, Lcom/daaw/tv1$j;-><init>(Lcom/daaw/tv1;)V

    invoke-direct {v2, v3, v4}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(I)Lcom/daaw/f61;
    .locals 2

    new-instance v0, Lcom/daaw/f61;

    sget-object v1, Lcom/daaw/tv1;->c:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Lcom/daaw/f61;-><init>(Ljava/lang/String;I)V

    new-instance p0, Lcom/daaw/xi;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/daaw/xi;-><init>(Z)V

    invoke-virtual {v0, p0}, Lcom/daaw/f61;->h0(Lcom/daaw/xi;)V

    return-object v0
.end method

.method public static h(Lcom/daaw/f61;Lcom/daaw/rd0;Z)Lcom/daaw/f61;
    .locals 0

    return-object p0
.end method

.method public static i()Lcom/daaw/tv1;
    .locals 1

    sget-object v0, Lcom/daaw/tv1;->d:Lcom/daaw/tv1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/tv1;

    invoke-direct {v0}, Lcom/daaw/tv1;-><init>()V

    :cond_0
    sget-object v0, Lcom/daaw/tv1;->d:Lcom/daaw/tv1;

    return-object v0
.end method


# virtual methods
.method public b(I)Lcom/daaw/vn;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/tv1;->c(IZ)Lcom/daaw/vn;

    move-result-object p1

    return-object p1
.end method

.method public final c(IZ)Lcom/daaw/vn;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tv1;->d(IZ)Lcom/daaw/vn;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lcom/daaw/vn;->q(I)V

    :cond_0
    return-object p2
.end method

.method public final d(IZ)Lcom/daaw/vn;
    .locals 1

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    packed-switch p1, :pswitch_data_0

    return-object v0

    :pswitch_0
    const p1, 0x7f0f0030

    :goto_0
    invoke-static {p2, p1}, Lcom/daaw/cr1;->q(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/vn;->e(Ljava/lang/String;)Lcom/daaw/vn;

    move-result-object p1

    return-object p1

    :pswitch_1
    const p1, 0x7f0f002f

    goto :goto_0

    :pswitch_2
    const p1, 0x7f0f002e

    goto :goto_0

    :pswitch_3
    const p1, 0x7f0f002d

    goto :goto_0

    :pswitch_4
    const p1, 0x7f0f002c

    goto :goto_0

    :pswitch_5
    const p1, 0x7f0f002b

    goto :goto_0

    :pswitch_6
    const p1, 0x7f0f002a

    goto :goto_0

    :pswitch_7
    const p1, 0x7f0f0029

    goto :goto_0

    :pswitch_8
    const p1, 0x7f0f0038

    goto :goto_0

    :pswitch_9
    const p1, 0x7f0f0037

    goto :goto_0

    :pswitch_a
    const p1, 0x7f0f0036

    goto :goto_0

    :pswitch_b
    const p1, 0x7f0f0035

    goto :goto_0

    :pswitch_c
    const p1, 0x7f0f0034

    goto :goto_0

    :pswitch_d
    const p1, 0x7f0f0033

    goto :goto_0

    :pswitch_e
    const p1, 0x7f0f0032

    goto :goto_0

    :pswitch_f
    const p1, 0x7f0f0031

    goto :goto_0

    :pswitch_10
    const p1, 0x7f0f0028

    goto :goto_0

    :pswitch_11
    const p1, 0x7f0f0027

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method public e(IZLjava/lang/String;)Lcom/daaw/f61;
    .locals 0

    invoke-static {p1}, Lcom/daaw/tv1;->a(I)Lcom/daaw/f61;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lcom/daaw/tv1;->h(Lcom/daaw/f61;Lcom/daaw/rd0;Z)Lcom/daaw/f61;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/sv1;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/tv1;->b:Ljava/util/List;

    return-object v0
.end method

.method public g(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/tv1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
