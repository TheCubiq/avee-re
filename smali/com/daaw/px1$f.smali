.class public Lcom/daaw/px1$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/px1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:Lcom/daaw/px1;

.field public b:[Lcom/daaw/gg0;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lcom/daaw/px1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/px1;-><init>(Lcom/daaw/px1;)V

    invoke-direct {p0, v0}, Lcom/daaw/px1$f;-><init>(Lcom/daaw/px1;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/px1$f;->a:Lcom/daaw/px1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/px1$f;->b:[Lcom/daaw/gg0;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, Lcom/daaw/px1$m;->a(I)I

    move-result v2

    aget-object v0, v0, v2

    iget-object v2, p0, Lcom/daaw/px1$f;->b:[Lcom/daaw/gg0;

    const/4 v3, 0x2

    invoke-static {v3}, Lcom/daaw/px1$m;->a(I)I

    move-result v4

    aget-object v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/px1$f;->a:Lcom/daaw/px1;

    invoke-virtual {v2, v3}, Lcom/daaw/px1;->f(I)Lcom/daaw/gg0;

    move-result-object v2

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/px1$f;->a:Lcom/daaw/px1;

    invoke-virtual {v0, v1}, Lcom/daaw/px1;->f(I)Lcom/daaw/gg0;

    move-result-object v0

    :cond_1
    invoke-static {v0, v2}, Lcom/daaw/gg0;->a(Lcom/daaw/gg0;Lcom/daaw/gg0;)Lcom/daaw/gg0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/px1$f;->f(Lcom/daaw/gg0;)V

    iget-object v0, p0, Lcom/daaw/px1$f;->b:[Lcom/daaw/gg0;

    const/16 v1, 0x10

    invoke-static {v1}, Lcom/daaw/px1$m;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/px1$f;->e(Lcom/daaw/gg0;)V

    :cond_2
    iget-object v0, p0, Lcom/daaw/px1$f;->b:[Lcom/daaw/gg0;

    const/16 v1, 0x20

    invoke-static {v1}, Lcom/daaw/px1$m;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/daaw/px1$f;->c(Lcom/daaw/gg0;)V

    :cond_3
    iget-object v0, p0, Lcom/daaw/px1$f;->b:[Lcom/daaw/gg0;

    const/16 v1, 0x40

    invoke-static {v1}, Lcom/daaw/px1$m;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lcom/daaw/px1$f;->g(Lcom/daaw/gg0;)V

    :cond_4
    return-void
.end method

.method public b()Lcom/daaw/px1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/px1$f;->a()V

    iget-object v0, p0, Lcom/daaw/px1$f;->a:Lcom/daaw/px1;

    return-object v0
.end method

.method public c(Lcom/daaw/gg0;)V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/gg0;)V
    .locals 0

    return-void
.end method

.method public e(Lcom/daaw/gg0;)V
    .locals 0

    return-void
.end method

.method public f(Lcom/daaw/gg0;)V
    .locals 0

    return-void
.end method

.method public g(Lcom/daaw/gg0;)V
    .locals 0

    return-void
.end method
