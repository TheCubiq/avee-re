.class public Lcom/daaw/hk$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/hk;
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
        "Lcom/daaw/er0<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hk$g;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yj;

    invoke-virtual {p0, p1}, Lcom/daaw/hk$g;->b(Lcom/daaw/yj;)Lcom/daaw/er0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/yj;)Lcom/daaw/er0;
    .locals 3
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

    iget-object v1, p0, Lcom/daaw/hk$g;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/hk;->X(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v2}, Lcom/daaw/er0;->m(Ljava/util/List;Ljava/lang/Object;)Lcom/daaw/er0;

    move-result-object p1

    return-object p1
.end method
