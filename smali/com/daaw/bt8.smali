.class public final Lcom/daaw/bt8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/or8;


# instance fields
.field public final a:Lcom/daaw/m36;

.field public b:I

.field public final c:Lcom/daaw/at8;

.field public final d:Lcom/daaw/rw8;

.field public final e:Lcom/daaw/dn8;


# direct methods
.method public constructor <init>(Lcom/daaw/m36;Lcom/daaw/at8;[B)V
    .locals 2

    new-instance p3, Lcom/daaw/dn8;

    invoke-direct {p3}, Lcom/daaw/dn8;-><init>()V

    new-instance v0, Lcom/daaw/rw8;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/daaw/rw8;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bt8;->a:Lcom/daaw/m36;

    iput-object p2, p0, Lcom/daaw/bt8;->c:Lcom/daaw/at8;

    iput-object p3, p0, Lcom/daaw/bt8;->e:Lcom/daaw/dn8;

    iput-object v0, p0, Lcom/daaw/bt8;->d:Lcom/daaw/rw8;

    const/high16 p1, 0x100000

    iput p1, p0, Lcom/daaw/bt8;->b:I

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/daaw/bt8;
    .locals 0

    iput p1, p0, Lcom/daaw/bt8;->b:I

    return-object p0
.end method

.method public final b(Lcom/daaw/f53;)Lcom/daaw/dt8;
    .locals 10

    iget-object v0, p1, Lcom/daaw/f53;->b:Lcom/daaw/jv2;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/dt8;

    iget-object v3, p0, Lcom/daaw/bt8;->a:Lcom/daaw/m36;

    iget-object v4, p0, Lcom/daaw/bt8;->c:Lcom/daaw/at8;

    sget-object v5, Lcom/daaw/vn8;->a:Lcom/daaw/vn8;

    iget-object v6, p0, Lcom/daaw/bt8;->d:Lcom/daaw/rw8;

    iget v7, p0, Lcom/daaw/bt8;->b:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Lcom/daaw/dt8;-><init>(Lcom/daaw/f53;Lcom/daaw/m36;Lcom/daaw/at8;Lcom/daaw/vn8;Lcom/daaw/rw8;ILcom/daaw/ct8;[B)V

    return-object v0
.end method
