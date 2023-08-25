.class public Lcom/daaw/dk$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/r40<",
        "Lcom/daaw/yj;",
        "Ljava/util/List<",
        "Lcom/daaw/tx0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/er0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/pf1;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/ak1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ak1<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/pf1;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/dk$g;->a:Lcom/daaw/er0;

    new-instance v0, Lcom/daaw/ak1;

    invoke-direct {v0}, Lcom/daaw/ak1;-><init>()V

    iput-object v0, p0, Lcom/daaw/dk$g;->b:Lcom/daaw/ak1;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/dk$g;Lcom/daaw/yj;Lcom/daaw/lo1;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/dk$g;->c(Lcom/daaw/yj;Lcom/daaw/lo1;Z)V

    return-void
.end method

.method private synthetic c(Lcom/daaw/yj;Lcom/daaw/lo1;Z)V
    .locals 2

    if-eqz p3, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x0

    if-eqz p2, :cond_2

    iget-object v0, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/er0;

    iget-object v1, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/wf1;

    invoke-virtual {v1}, Lcom/daaw/wf1;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p2, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/wf1;

    invoke-virtual {p2}, Lcom/daaw/wf1;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/yj;->O(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p3}, Lcom/daaw/yj;->O(Ljava/lang/String;)V

    :goto_0
    move-object p3, v0

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p3}, Lcom/daaw/yj;->O(Ljava/lang/String;)V

    :goto_1
    if-nez p3, :cond_3

    new-instance p3, Lcom/daaw/er0;

    invoke-direct {p3}, Lcom/daaw/er0;-><init>()V

    :cond_3
    iput-object p3, p0, Lcom/daaw/dk$g;->a:Lcom/daaw/er0;

    invoke-virtual {p1}, Lcom/daaw/yj;->A()Z

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yj;

    invoke-virtual {p0, p1}, Lcom/daaw/dk$g;->d(Lcom/daaw/yj;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/daaw/yj;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dk$g;->a:Lcom/daaw/er0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dk$g;->b:Lcom/daaw/ak1;

    invoke-virtual {v0, v1}, Lcom/daaw/ak1;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/dk$g;->b:Lcom/daaw/ak1;

    invoke-virtual {v0}, Lcom/daaw/ak1;->a()V

    invoke-static {}, Lcom/daaw/pe0;->a()Lcom/daaw/oe0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/oe0;->a()Lcom/daaw/ir1;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/dk$g;->b:Lcom/daaw/ak1;

    new-instance v3, Lcom/daaw/ek;

    invoke-direct {v3, p0, p1}, Lcom/daaw/ek;-><init>(Lcom/daaw/dk$g;Lcom/daaw/yj;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/ak1;->b(Ljava/lang/String;Lcom/daaw/me0;Lcom/daaw/ir1$b;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/dk$g;->a:Lcom/daaw/er0;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/dk$g;->a:Lcom/daaw/er0;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/dk$g;->e(Lcom/daaw/yj;Lcom/daaw/er0;)V

    iget-object p1, p0, Lcom/daaw/dk$g;->a:Lcom/daaw/er0;

    invoke-virtual {p1}, Lcom/daaw/er0;->w()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lcom/daaw/yj;Lcom/daaw/er0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/pf1;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/yj;->s:Lcom/daaw/xw1;

    invoke-virtual {p1}, Lcom/daaw/yj;->I()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ie1$h;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lcom/daaw/tf1;->d(Lcom/daaw/ie1$h;I)Ljava/util/Comparator;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p2, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Comparator<Tuple2<PlaylistSong, StationEntry>> exception"

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
