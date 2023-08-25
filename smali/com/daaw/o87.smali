.class public final Lcom/daaw/o87;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/de7;


# direct methods
.method public constructor <init>(Lcom/daaw/de7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o87;->a:Lcom/daaw/de7;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o87;->a:Lcom/daaw/de7;

    invoke-virtual {v0, p1}, Lcom/daaw/de7;->b(Lcom/daaw/yq7;)Lcom/daaw/xt7;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/o87;->a:Lcom/daaw/de7;

    invoke-virtual {v0, p1}, Lcom/daaw/de7;->d(Lcom/daaw/xt7;)V

    iget-object v0, p0, Lcom/daaw/o87;->a:Lcom/daaw/de7;

    invoke-virtual {v0, p1}, Lcom/daaw/de7;->a(Lcom/daaw/xt7;)Lcom/daaw/xt7;

    move-result-object p1

    return-object p1
.end method
