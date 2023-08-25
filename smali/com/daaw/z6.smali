.class public Lcom/daaw/z6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qc0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/z6$b;
    }
.end annotation


# static fields
.field public static final h:Lcom/daaw/v40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/v40<",
            "Lcom/daaw/le0;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/qc0;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lcom/daaw/qc0;


# instance fields
.field public a:Lcom/daaw/le0;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/z6$a;

    invoke-direct {v0}, Lcom/daaw/z6$a;-><init>()V

    sput-object v0, Lcom/daaw/z6;->h:Lcom/daaw/v40;

    new-instance v0, Lcom/daaw/z6$b;

    invoke-direct {v0}, Lcom/daaw/z6$b;-><init>()V

    sput-object v0, Lcom/daaw/z6;->i:Lcom/daaw/qc0;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/le0;IIIIZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/z6;->f:I

    iput-object p1, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    iput-boolean p6, p0, Lcom/daaw/z6;->g:Z

    invoke-interface {p1}, Lcom/daaw/le0;->getHeight()I

    move-result p6

    if-lt p6, v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/le0;->getWidth()I

    move-result p1

    if-ge p1, v0, :cond_1

    :cond_0
    const-string p1, "texture invalid dimensions"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    iput p2, p0, Lcom/daaw/z6;->b:I

    iput p3, p0, Lcom/daaw/z6;->c:I

    iput p4, p0, Lcom/daaw/z6;->d:I

    iput p5, p0, Lcom/daaw/z6;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/le0;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/z6;->f:I

    iput-object p1, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    iput-boolean p2, p0, Lcom/daaw/z6;->g:Z

    const/4 p2, 0x0

    iput p2, p0, Lcom/daaw/z6;->b:I

    iput p2, p0, Lcom/daaw/z6;->c:I

    invoke-interface {p1}, Lcom/daaw/le0;->getWidth()I

    move-result p2

    iput p2, p0, Lcom/daaw/z6;->d:I

    invoke-interface {p1}, Lcom/daaw/le0;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/daaw/z6;->e:I

    iget-object p1, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    invoke-interface {p1}, Lcom/daaw/le0;->getHeight()I

    move-result p1

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    invoke-interface {p1}, Lcom/daaw/le0;->getWidth()I

    move-result p1

    if-ge p1, v0, :cond_1

    :cond_0
    const-string p1, "texture invalid dimensions"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/z6;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/le0;->a()V

    :cond_0
    return-void
.end method

.method public b(F)F
    .locals 3

    iget v0, p0, Lcom/daaw/z6;->c:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    invoke-interface {v1}, Lcom/daaw/le0;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/z6;->e:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    invoke-interface {v2}, Lcom/daaw/le0;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public c(F)Lcom/daaw/qc0;
    .locals 7

    iget-object v1, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    iget v2, p0, Lcom/daaw/z6;->b:I

    iget v3, p0, Lcom/daaw/z6;->c:I

    iget v4, p0, Lcom/daaw/z6;->d:I

    iget v5, p0, Lcom/daaw/z6;->e:I

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/z6;->h(Lcom/daaw/le0;IIIIZ)Lcom/daaw/qc0;

    move-result-object p1

    return-object p1
.end method

.method public d()Lcom/daaw/le0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    return-object v0
.end method

.method public e(F)F
    .locals 3

    iget v0, p0, Lcom/daaw/z6;->b:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    invoke-interface {v1}, Lcom/daaw/le0;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/z6;->d:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/z6;->a:Lcom/daaw/le0;

    invoke-interface {v2}, Lcom/daaw/le0;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public f()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/daaw/z6;->e:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/daaw/z6;->d:I

    return v0
.end method

.method public h(Lcom/daaw/le0;IIIIZ)Lcom/daaw/qc0;
    .locals 8

    new-instance v7, Lcom/daaw/z6;

    move-object v0, v7

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;IIIIZ)V

    return-object v7
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/daaw/z6;->f:I

    return v0
.end method
