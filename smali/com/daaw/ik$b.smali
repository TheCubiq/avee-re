.class public Lcom/daaw/ik$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ik;
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
        "Lcom/daaw/er0<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/ik$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ik$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yj;

    invoke-virtual {p0, p1}, Lcom/daaw/ik$b;->b(Lcom/daaw/yj;)Lcom/daaw/er0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/yj;)Lcom/daaw/er0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            ")",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/yj;->I()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/daaw/ik;->j0(Landroid/content/Context;ILcom/daaw/sd0;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/er0;->m(Ljava/util/List;Ljava/lang/Object;)Lcom/daaw/er0;

    move-result-object p1

    return-object p1
.end method
