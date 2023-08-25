.class public final Lcom/daaw/pr8;
.super Lcom/daaw/md3;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/md3;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/md3;-><init>(Lcom/daaw/md3;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/md3;-><init>(Ljava/lang/Object;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/md3;-><init>(Ljava/lang/Object;IIJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/md3;-><init>(Ljava/lang/Object;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/md3;-><init>(Ljava/lang/Object;JI)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Lcom/daaw/pr8;
    .locals 1

    new-instance v0, Lcom/daaw/pr8;

    invoke-super {p0, p1}, Lcom/daaw/md3;->a(Ljava/lang/Object;)Lcom/daaw/md3;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/pr8;-><init>(Lcom/daaw/md3;)V

    return-object v0
.end method
