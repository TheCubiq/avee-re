.class public Lcom/daaw/a7$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qc0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/a7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/a7;

.field public final b:I


# direct methods
.method public constructor <init>(Lcom/daaw/a7;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    iput p2, p0, Lcom/daaw/a7$a;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(F)F
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    invoke-virtual {v0, p1}, Lcom/daaw/z6;->b(F)F

    move-result p1

    return p1
.end method

.method public c(F)Lcom/daaw/qc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    invoke-virtual {v0, p1}, Lcom/daaw/a7;->c(F)Lcom/daaw/qc0;

    move-result-object p1

    return-object p1
.end method

.method public d()Lcom/daaw/le0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    iget v1, p0, Lcom/daaw/a7$a;->b:I

    invoke-virtual {v0, v1}, Lcom/daaw/a7;->j(I)Lcom/daaw/le0;

    move-result-object v0

    return-object v0
.end method

.method public e(F)F
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    invoke-virtual {v0, p1}, Lcom/daaw/z6;->e(F)F

    move-result p1

    return p1
.end method

.method public f()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    invoke-virtual {v0}, Lcom/daaw/z6;->f()F

    move-result v0

    return v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    invoke-virtual {v0}, Lcom/daaw/a7;->g()Z

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    invoke-virtual {v0}, Lcom/daaw/z6;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/a7$a;->a:Lcom/daaw/a7;

    invoke-virtual {v0}, Lcom/daaw/z6;->getWidth()I

    move-result v0

    return v0
.end method
