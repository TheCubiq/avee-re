.class public final Lcom/daaw/ik3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final a:Lcom/daaw/zg3;

.field public final synthetic b:Lcom/daaw/jk3;


# direct methods
.method public constructor <init>(Lcom/daaw/jk3;Lcom/daaw/zg3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ik3;->b:Lcom/daaw/jk3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/ik3;->a:Lcom/daaw/zg3;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/ik3;)Lcom/daaw/zg3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ik3;->a:Lcom/daaw/zg3;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/daaw/a74;

    iget-object p1, p0, Lcom/daaw/ik3;->a:Lcom/daaw/zg3;

    iget-object v0, p0, Lcom/daaw/ik3;->b:Lcom/daaw/jk3;

    invoke-interface {p1, v0, p2}, Lcom/daaw/zg3;->a(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
