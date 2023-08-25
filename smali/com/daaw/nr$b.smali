.class public Lcom/daaw/nr$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/da1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nr;


# direct methods
.method public constructor <init>(Lcom/daaw/nr;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nr$b;->a:Lcom/daaw/nr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/nr;Lcom/daaw/nr$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nr$b;-><init>(Lcom/daaw/nr;)V

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)Lcom/daaw/da1$a;
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    new-instance p1, Lcom/daaw/da1$a;

    new-instance p2, Lcom/daaw/fa1;

    iget-object v2, p0, Lcom/daaw/nr$b;->a:Lcom/daaw/nr;

    invoke-static {v2}, Lcom/daaw/nr;->b(Lcom/daaw/nr;)J

    move-result-wide v2

    invoke-direct {p2, v0, v1, v2, v3}, Lcom/daaw/fa1;-><init>(JJ)V

    invoke-direct {p1, p2}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/nr$b;->a:Lcom/daaw/nr;

    invoke-static {v0}, Lcom/daaw/nr;->e(Lcom/daaw/nr;)Lcom/daaw/rg1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/rg1;->b(J)J

    move-result-wide v4

    iget-object v1, p0, Lcom/daaw/nr$b;->a:Lcom/daaw/nr;

    invoke-static {v1}, Lcom/daaw/nr;->b(Lcom/daaw/nr;)J

    move-result-wide v2

    const-wide/16 v6, 0x7530

    invoke-static/range {v1 .. v7}, Lcom/daaw/nr;->f(Lcom/daaw/nr;JJJ)J

    move-result-wide v0

    new-instance v2, Lcom/daaw/da1$a;

    new-instance v3, Lcom/daaw/fa1;

    invoke-direct {v3, p1, p2, v0, v1}, Lcom/daaw/fa1;-><init>(JJ)V

    invoke-direct {v2, v3}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    return-object v2
.end method

.method public h()J
    .locals 3

    iget-object v0, p0, Lcom/daaw/nr$b;->a:Lcom/daaw/nr;

    invoke-static {v0}, Lcom/daaw/nr;->e(Lcom/daaw/nr;)Lcom/daaw/rg1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/nr$b;->a:Lcom/daaw/nr;

    invoke-static {v1}, Lcom/daaw/nr;->g(Lcom/daaw/nr;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rg1;->a(J)J

    move-result-wide v0

    return-wide v0
.end method
