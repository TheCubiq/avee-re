.class public final synthetic Lcom/daaw/ts5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/ws5;

.field public final synthetic b:Lcom/daaw/fi6;

.field public final synthetic c:Lcom/daaw/th6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ws5;Lcom/daaw/fi6;Lcom/daaw/th6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ts5;->a:Lcom/daaw/ws5;

    iput-object p2, p0, Lcom/daaw/ts5;->b:Lcom/daaw/fi6;

    iput-object p3, p0, Lcom/daaw/ts5;->c:Lcom/daaw/th6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ts5;->a:Lcom/daaw/ws5;

    iget-object v1, p0, Lcom/daaw/ts5;->b:Lcom/daaw/fi6;

    iget-object v2, p0, Lcom/daaw/ts5;->c:Lcom/daaw/th6;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ws5;->c(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/zi4;

    move-result-object v0

    return-object v0
.end method
