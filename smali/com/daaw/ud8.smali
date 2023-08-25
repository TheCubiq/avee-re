.class public final synthetic Lcom/daaw/ud8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e45;


# instance fields
.field public final synthetic a:Lcom/daaw/tg8;

.field public final synthetic b:Lcom/daaw/ty3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tg8;Lcom/daaw/ty3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ud8;->a:Lcom/daaw/tg8;

    iput-object p2, p0, Lcom/daaw/ud8;->b:Lcom/daaw/ty3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/daaw/r32;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ud8;->a:Lcom/daaw/tg8;

    iget-object v1, p0, Lcom/daaw/ud8;->b:Lcom/daaw/ty3;

    check-cast p1, Lcom/daaw/ob8;

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/tg8;->a0(Lcom/daaw/ty3;Lcom/daaw/ob8;Lcom/daaw/r32;)V

    return-void
.end method
