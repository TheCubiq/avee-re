.class public Lcom/daaw/lv0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lv0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/lv0$b;->a:Landroid/graphics/Paint;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lv0$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/lv0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lv0$b;->a:Landroid/graphics/Paint;

    return-object v0
.end method

.method public b(I)Lcom/daaw/lv0$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lv0$b;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object p0
.end method

.method public c(Landroid/graphics/Shader;)Lcom/daaw/lv0$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lv0$b;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-object p0
.end method

.method public d(F)Lcom/daaw/lv0$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lv0$b;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-object p0
.end method

.method public e(Landroid/graphics/Paint$Style;)Lcom/daaw/lv0$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lv0$b;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-object p0
.end method

.method public f(Landroid/graphics/PorterDuff$Mode;)Lcom/daaw/lv0$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/lv0$b;->a:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v1, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-object p0
.end method
