.class public final Lcom/daaw/bk6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/yk6;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/bk6;->a:Lcom/daaw/yk6;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/bk6;->a:Lcom/daaw/yk6;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/yk6;->a:Lcom/daaw/dl6;

    invoke-virtual {v0}, Lcom/daaw/dl6;->f()V

    :cond_0
    return-void
.end method

.method public final b(Lcom/daaw/yk6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bk6;->a:Lcom/daaw/yk6;

    return-void
.end method
