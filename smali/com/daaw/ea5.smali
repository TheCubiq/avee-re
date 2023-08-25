.class public final synthetic Lcom/daaw/ea5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/ha5;

.field public final synthetic b:Lcom/daaw/a74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ha5;Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ea5;->a:Lcom/daaw/ha5;

    iput-object p2, p0, Lcom/daaw/ea5;->b:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ea5;->a:Lcom/daaw/ha5;

    iget-object v1, p0, Lcom/daaw/ea5;->b:Lcom/daaw/a74;

    check-cast p1, Lcom/daaw/a74;

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/ha5;->g(Lcom/daaw/a74;Lcom/daaw/a74;Ljava/util/Map;)V

    return-void
.end method
