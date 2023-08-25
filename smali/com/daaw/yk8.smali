.class public final Lcom/daaw/yk8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[Lcom/daaw/hi8;

.field public final b:Lcom/daaw/um8;

.field public final c:Lcom/daaw/ym8;


# direct methods
.method public varargs constructor <init>([Lcom/daaw/hi8;)V
    .locals 4

    new-instance v0, Lcom/daaw/um8;

    invoke-direct {v0}, Lcom/daaw/um8;-><init>()V

    new-instance v1, Lcom/daaw/ym8;

    invoke-direct {v1}, Lcom/daaw/ym8;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/daaw/hi8;

    iput-object v2, p0, Lcom/daaw/yk8;->a:[Lcom/daaw/hi8;

    const/4 v3, 0x0

    invoke-static {p1, v3, v2, v3, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/daaw/yk8;->b:Lcom/daaw/um8;

    iput-object v1, p0, Lcom/daaw/yk8;->c:Lcom/daaw/ym8;

    aput-object v0, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/yk8;->c:Lcom/daaw/ym8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ym8;->c(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/yk8;->b:Lcom/daaw/um8;

    invoke-virtual {v0}, Lcom/daaw/um8;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(Lcom/daaw/pp3;)Lcom/daaw/pp3;
    .locals 2

    iget-object v0, p0, Lcom/daaw/yk8;->c:Lcom/daaw/ym8;

    iget v1, p1, Lcom/daaw/pp3;->a:F

    invoke-virtual {v0, v1}, Lcom/daaw/ym8;->e(F)V

    iget-object v0, p0, Lcom/daaw/yk8;->c:Lcom/daaw/ym8;

    iget v1, p1, Lcom/daaw/pp3;->b:F

    invoke-virtual {v0, v1}, Lcom/daaw/ym8;->d(F)V

    return-object p1
.end method

.method public final d(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/yk8;->b:Lcom/daaw/um8;

    invoke-virtual {v0, p1}, Lcom/daaw/um8;->j(Z)V

    return p1
.end method

.method public final e()[Lcom/daaw/hi8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yk8;->a:[Lcom/daaw/hi8;

    return-object v0
.end method
