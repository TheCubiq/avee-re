.class public Lcom/daaw/kq$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/kq$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/kq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:[Lcom/daaw/m7;

.field public final b:Lcom/daaw/bd1;

.field public final c:Lcom/daaw/he1;


# direct methods
.method public varargs constructor <init>([Lcom/daaw/m7;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/m7;

    iput-object v0, p0, Lcom/daaw/kq$d;->a:[Lcom/daaw/m7;

    new-instance v1, Lcom/daaw/bd1;

    invoke-direct {v1}, Lcom/daaw/bd1;-><init>()V

    iput-object v1, p0, Lcom/daaw/kq$d;->b:Lcom/daaw/bd1;

    new-instance v2, Lcom/daaw/he1;

    invoke-direct {v2}, Lcom/daaw/he1;-><init>()V

    iput-object v2, p0, Lcom/daaw/kq$d;->c:Lcom/daaw/he1;

    array-length v3, p1

    aput-object v1, v0, v3

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object v2, v0, p1

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/kq$d;->c:Lcom/daaw/he1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/he1;->a(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(Lcom/daaw/zw0;)Lcom/daaw/zw0;
    .locals 4

    iget-object v0, p0, Lcom/daaw/kq$d;->b:Lcom/daaw/bd1;

    iget-boolean v1, p1, Lcom/daaw/zw0;->c:Z

    invoke-virtual {v0, v1}, Lcom/daaw/bd1;->u(Z)V

    new-instance v0, Lcom/daaw/zw0;

    iget-object v1, p0, Lcom/daaw/kq$d;->c:Lcom/daaw/he1;

    iget v2, p1, Lcom/daaw/zw0;->a:F

    invoke-virtual {v1, v2}, Lcom/daaw/he1;->m(F)F

    move-result v1

    iget-object v2, p0, Lcom/daaw/kq$d;->c:Lcom/daaw/he1;

    iget v3, p1, Lcom/daaw/zw0;->b:F

    invoke-virtual {v2, v3}, Lcom/daaw/he1;->b(F)F

    move-result v2

    iget-boolean p1, p1, Lcom/daaw/zw0;->c:Z

    invoke-direct {v0, v1, v2, p1}, Lcom/daaw/zw0;-><init>(FFZ)V

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/kq$d;->b:Lcom/daaw/bd1;

    invoke-virtual {v0}, Lcom/daaw/bd1;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public d()[Lcom/daaw/m7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kq$d;->a:[Lcom/daaw/m7;

    return-object v0
.end method
