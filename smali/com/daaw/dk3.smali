.class public final synthetic Lcom/daaw/dk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uy0;


# instance fields
.field public final synthetic a:Lcom/daaw/zg3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/zg3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dk3;->a:Lcom/daaw/zg3;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/dk3;->a:Lcom/daaw/zg3;

    check-cast p1, Lcom/daaw/zg3;

    instance-of v1, p1, Lcom/daaw/ik3;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/daaw/ik3;

    invoke-static {p1}, Lcom/daaw/ik3;->b(Lcom/daaw/ik3;)Lcom/daaw/zg3;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
