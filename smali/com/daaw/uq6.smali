.class public final Lcom/daaw/uq6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/wq6;

.field public final b:Lcom/daaw/vq6;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/wq6;

    invoke-direct {v0}, Lcom/daaw/wq6;-><init>()V

    iput-object v0, p0, Lcom/daaw/uq6;->a:Lcom/daaw/wq6;

    new-instance v1, Lcom/daaw/vq6;

    invoke-direct {v1, v0}, Lcom/daaw/vq6;-><init>(Lcom/daaw/tq6;)V

    iput-object v1, p0, Lcom/daaw/uq6;->b:Lcom/daaw/vq6;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/tq6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/uq6;->b:Lcom/daaw/vq6;

    return-object v0
.end method

.method public final b()Lcom/daaw/tq6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/uq6;->a:Lcom/daaw/wq6;

    return-object v0
.end method
