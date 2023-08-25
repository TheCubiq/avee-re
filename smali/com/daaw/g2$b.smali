.class public Lcom/daaw/g2$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/g2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Lcom/daaw/jf0;",
        "Lcom/daaw/k60;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/bc;

.field public b:Landroid/content/Context;

.field public c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:I

.field public final h:Z

.field public i:Ljava/lang/String;

.field public final synthetic j:Lcom/daaw/g2;


# direct methods
.method public constructor <init>(Lcom/daaw/g2;Lcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;IIZ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g2$b;->j:Lcom/daaw/g2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/g2$b;->a:Lcom/daaw/bc;

    iput-object p3, p0, Lcom/daaw/g2$b;->b:Landroid/content/Context;

    iput-boolean p4, p0, Lcom/daaw/g2$b;->c:Z

    iput-object p5, p0, Lcom/daaw/g2$b;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/g2$b;->e:Ljava/lang/String;

    iput p7, p0, Lcom/daaw/g2$b;->f:I

    iput p8, p0, Lcom/daaw/g2$b;->g:I

    iput-boolean p9, p0, Lcom/daaw/g2$b;->h:Z

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "src:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "t:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p9, :cond_0

    const-string p2, "t"

    goto :goto_0

    :cond_0
    const-string p2, "f"

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/g2$b;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Lcom/daaw/jf0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/g2$b;->d(Lcom/daaw/jf0;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/daaw/jf0;II)Lcom/daaw/z41;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jf0;",
            "II)",
            "Lcom/daaw/z41<",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    iget p1, p0, Lcom/daaw/g2$b;->f:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/daaw/g2$b;->h:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/g2$b;->d:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/g2$b;->j:Lcom/daaw/g2;

    iget-object v1, p0, Lcom/daaw/g2$b;->d:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/daaw/g2;->f(Lcom/daaw/g2;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-nez p1, :cond_2

    iget-object v1, p0, Lcom/daaw/g2$b;->j:Lcom/daaw/g2;

    iget-object v2, p0, Lcom/daaw/g2$b;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/g2$b;->e:Ljava/lang/String;

    iget v6, p0, Lcom/daaw/g2$b;->f:I

    iget v7, p0, Lcom/daaw/g2$b;->g:I

    move v4, p2

    move v5, p3

    invoke-static/range {v1 .. v7}, Lcom/daaw/g2;->g(Lcom/daaw/g2;Ljava/lang/String;Ljava/lang/String;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    if-nez p1, :cond_3

    return-object v0

    :cond_3
    new-instance p2, Lcom/daaw/k60;

    iget-object p3, p0, Lcom/daaw/g2$b;->a:Lcom/daaw/bc;

    invoke-static {p1, p3}, Lcom/daaw/dc;->d(Landroid/graphics/Bitmap;Lcom/daaw/bc;)Lcom/daaw/dc;

    move-result-object p1

    invoke-direct {p2, p1, v0}, Lcom/daaw/k60;-><init>(Lcom/daaw/z41;Lcom/daaw/z41;)V

    new-instance p1, Lcom/daaw/m60;

    invoke-direct {p1, p2}, Lcom/daaw/m60;-><init>(Lcom/daaw/k60;)V

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g2$b;->i:Ljava/lang/String;

    return-object v0
.end method
