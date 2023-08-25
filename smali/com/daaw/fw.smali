.class public Lcom/daaw/fw;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/daaw/up0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Landroidx/emoji2/text/e;

.field public volatile c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/daaw/fw;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Landroidx/emoji2/text/e;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/fw;->c:I

    iput-object p1, p0, Lcom/daaw/fw;->b:Landroidx/emoji2/text/e;

    iput p2, p0, Lcom/daaw/fw;->a:I

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/fw;->b:Landroidx/emoji2/text/e;

    invoke-virtual {v0}, Landroidx/emoji2/text/e;->g()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p4}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p4, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, p0, Lcom/daaw/fw;->a:I

    mul-int/lit8 v4, v0, 0x2

    iget-object v0, p0, Lcom/daaw/fw;->b:Landroidx/emoji2/text/e;

    invoke-virtual {v0}, Landroidx/emoji2/text/e;->c()[C

    move-result-object v3

    const/4 v5, 0x2

    move-object v2, p1

    move v6, p2

    move v7, p3

    move-object v8, p4

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    invoke-virtual {p4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public b(I)I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw;->g()Lcom/daaw/up0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/up0;->h(I)I

    move-result p1

    return p1
.end method

.method public c()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw;->g()Lcom/daaw/up0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/up0;->i()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KotlinPropertyAccess"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/fw;->c:I

    return v0
.end method

.method public e()S
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw;->g()Lcom/daaw/up0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/up0;->k()S

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw;->g()Lcom/daaw/up0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/up0;->l()I

    move-result v0

    return v0
.end method

.method public final g()Lcom/daaw/up0;
    .locals 3

    sget-object v0, Lcom/daaw/fw;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/up0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/up0;

    invoke-direct {v1}, Lcom/daaw/up0;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/fw;->b:Landroidx/emoji2/text/e;

    invoke-virtual {v0}, Landroidx/emoji2/text/e;->d()Lcom/daaw/vp0;

    move-result-object v0

    iget v2, p0, Lcom/daaw/fw;->a:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vp0;->j(Lcom/daaw/up0;I)Lcom/daaw/up0;

    return-object v1
.end method

.method public h()S
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw;->g()Lcom/daaw/up0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/up0;->m()S

    move-result v0

    return v0
.end method

.method public i()S
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw;->g()Lcom/daaw/up0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/up0;->n()S

    move-result v0

    return v0
.end method

.method public j()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw;->g()Lcom/daaw/up0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/up0;->j()Z

    move-result v0

    return v0
.end method

.method public k(Z)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KotlinPropertyAccess"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput p1, p0, Lcom/daaw/fw;->c:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/fw;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codepoints:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/fw;->c()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, Lcom/daaw/fw;->b(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
