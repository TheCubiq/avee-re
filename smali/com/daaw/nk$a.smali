.class public Lcom/daaw/nk$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/r40<",
        "Lcom/daaw/yj;",
        "Ljava/util/List<",
        "Lcom/daaw/sc1;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/daaw/er0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/sc1;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/ak1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ak1<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/sc1;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/nk$a;->b:Lcom/daaw/er0;

    new-instance v0, Lcom/daaw/ak1;

    invoke-direct {v0}, Lcom/daaw/ak1;-><init>()V

    iput-object v0, p0, Lcom/daaw/nk$a;->c:Lcom/daaw/ak1;

    iput-object p1, p0, Lcom/daaw/nk$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/nk$a;Lcom/daaw/er0;)Lcom/daaw/er0;
    .locals 0

    iput-object p1, p0, Lcom/daaw/nk$a;->b:Lcom/daaw/er0;

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yj;

    invoke-virtual {p0, p1}, Lcom/daaw/nk$a;->c(Lcom/daaw/yj;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/daaw/yj;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/sc1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/nk$a;->b:Lcom/daaw/er0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/nk$a;->c:Lcom/daaw/ak1;

    invoke-virtual {v0, v1}, Lcom/daaw/ak1;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/nk$a;->c:Lcom/daaw/ak1;

    invoke-virtual {v0}, Lcom/daaw/ak1;->a()V

    invoke-static {}, Lcom/daaw/tc1;->e()Lcom/daaw/rc1;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/nk$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/daaw/rc1;->f(Ljava/lang/String;)Lcom/daaw/ir1;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/nk$a;->c:Lcom/daaw/ak1;

    new-instance v3, Lcom/daaw/nk$a$a;

    invoke-direct {v3, p0, p1}, Lcom/daaw/nk$a$a;-><init>(Lcom/daaw/nk$a;Lcom/daaw/yj;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/ak1;->b(Ljava/lang/String;Lcom/daaw/me0;Lcom/daaw/ir1$b;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/nk$a;->b:Lcom/daaw/er0;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/nk$a;->b:Lcom/daaw/er0;

    invoke-static {p1, v0}, Lcom/daaw/lk;->Z(Lcom/daaw/yj;Lcom/daaw/er0;)V

    iget-object p1, p0, Lcom/daaw/nk$a;->b:Lcom/daaw/er0;

    invoke-virtual {p1}, Lcom/daaw/er0;->x()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
