.class public final Lcom/daaw/nq6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/wr6;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/zp6;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/daaw/zp6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Lcom/daaw/wr6;

    invoke-direct {p3, p1}, Lcom/daaw/wr6;-><init>(Landroid/view/View;)V

    iput-object p3, p0, Lcom/daaw/nq6;->a:Lcom/daaw/wr6;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/nq6;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/nq6;->c:Lcom/daaw/zp6;

    const-string p1, "Ad overlay"

    iput-object p1, p0, Lcom/daaw/nq6;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/zp6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nq6;->c:Lcom/daaw/zp6;

    return-object v0
.end method

.method public final b()Lcom/daaw/wr6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nq6;->a:Lcom/daaw/wr6;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nq6;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nq6;->b:Ljava/lang/String;

    return-object v0
.end method
