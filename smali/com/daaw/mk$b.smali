.class public Lcom/daaw/mk$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/r40<",
        "Lcom/daaw/yj;",
        "Ljava/util/List<",
        "Lcom/daaw/h60;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:Lcom/daaw/ak1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ak1<",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/rc1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rc1<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/sc1;",
            ">;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/sc1;",
            ">;",
            "Lcom/daaw/h60;",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/mk$b;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/mk$b;->b:Z

    new-instance v0, Lcom/daaw/ak1;

    invoke-direct {v0}, Lcom/daaw/ak1;-><init>()V

    iput-object v0, p0, Lcom/daaw/mk$b;->c:Lcom/daaw/ak1;

    invoke-static {}, Lcom/daaw/tc1;->e()Lcom/daaw/rc1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/mk$b;->d:Lcom/daaw/rc1;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yj;

    invoke-virtual {p0, p1}, Lcom/daaw/mk$b;->b(Lcom/daaw/yj;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/yj;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/mk$b;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/mk$b;->c:Lcom/daaw/ak1;

    invoke-virtual {v0, v1}, Lcom/daaw/ak1;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/mk$b;->c:Lcom/daaw/ak1;

    invoke-virtual {v0}, Lcom/daaw/ak1;->a()V

    invoke-static {v1}, Lcom/daaw/tc1;->c(Ljava/lang/String;)Lcom/daaw/me0;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/mk$b;->c:Lcom/daaw/ak1;

    new-instance v3, Lcom/daaw/mk$b$a;

    invoke-direct {v3, p0, p1}, Lcom/daaw/mk$b$a;-><init>(Lcom/daaw/mk$b;Lcom/daaw/yj;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/ak1;->b(Ljava/lang/String;Lcom/daaw/me0;Lcom/daaw/ir1$b;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/mk$b;->a:Ljava/util/List;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/mk$b;->a:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/mk$b;->c(Lcom/daaw/yj;Ljava/util/List;)V

    iget-object p1, p0, Lcom/daaw/mk$b;->a:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/daaw/yj;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
