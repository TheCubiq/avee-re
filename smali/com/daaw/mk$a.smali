.class public Lcom/daaw/mk$a;
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
    name = "a"
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
.field public a:Ljava/lang/String;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;"
        }
    .end annotation
.end field

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


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/mk$a;->b:Ljava/util/List;

    new-instance v0, Lcom/daaw/ak1;

    invoke-direct {v0}, Lcom/daaw/ak1;-><init>()V

    iput-object v0, p0, Lcom/daaw/mk$a;->c:Lcom/daaw/ak1;

    iput-object p1, p0, Lcom/daaw/mk$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/mk$a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/daaw/mk$a;->b:Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yj;

    invoke-virtual {p0, p1}, Lcom/daaw/mk$a;->c(Lcom/daaw/yj;)Ljava/util/List;

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
            "Lcom/daaw/h60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/mk$a;->b:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/mk$a;->c:Lcom/daaw/ak1;

    invoke-virtual {v0, v1}, Lcom/daaw/ak1;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/mk$a;->c:Lcom/daaw/ak1;

    invoke-virtual {v0}, Lcom/daaw/ak1;->a()V

    iget-object v0, p0, Lcom/daaw/mk$a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/tc1;->c(Ljava/lang/String;)Lcom/daaw/me0;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/mk$a;->c:Lcom/daaw/ak1;

    new-instance v3, Lcom/daaw/mk$a$a;

    invoke-direct {v3, p0, p1}, Lcom/daaw/mk$a$a;-><init>(Lcom/daaw/mk$a;Lcom/daaw/yj;)V

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/ak1;->b(Ljava/lang/String;Lcom/daaw/me0;Lcom/daaw/ir1$b;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/mk$a;->b:Ljava/util/List;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->L(Z)V

    iget-object v0, p0, Lcom/daaw/mk$a;->b:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/mk$a;->d(Lcom/daaw/yj;Ljava/util/List;)V

    iget-object p1, p0, Lcom/daaw/mk$a;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/yj;Ljava/util/List;)V
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
