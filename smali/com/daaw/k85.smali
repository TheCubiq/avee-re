.class public final Lcom/daaw/k85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/th6;

.field public final synthetic b:Lcom/daaw/wh6;


# direct methods
.method public constructor <init>(Lcom/daaw/u85;Lcom/daaw/th6;Lcom/daaw/wh6;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/k85;->a:Lcom/daaw/th6;

    iput-object p3, p0, Lcom/daaw/k85;->b:Lcom/daaw/wh6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/daaw/a74;

    iget-object v0, p0, Lcom/daaw/k85;->a:Lcom/daaw/th6;

    iget-object v1, p0, Lcom/daaw/k85;->b:Lcom/daaw/wh6;

    invoke-interface {p1, v0, v1}, Lcom/daaw/a74;->P(Lcom/daaw/th6;Lcom/daaw/wh6;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
