.class public Lcom/daaw/s60$a;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/s60;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/a70;

.field public b:[B

.field public c:Landroid/content/Context;

.field public d:Lcom/daaw/cn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:Lcom/daaw/r60$a;

.field public h:Lcom/daaw/bc;

.field public i:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lcom/daaw/a70;[BLandroid/content/Context;Lcom/daaw/cn1;IILcom/daaw/r60$a;Lcom/daaw/bc;Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a70;",
            "[B",
            "Landroid/content/Context;",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Lcom/daaw/r60$a;",
            "Lcom/daaw/bc;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const-string v0, "The first frame of the GIF must not be null"

    invoke-static {p9, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/s60$a;->a:Lcom/daaw/a70;

    iput-object p2, p0, Lcom/daaw/s60$a;->b:[B

    iput-object p8, p0, Lcom/daaw/s60$a;->h:Lcom/daaw/bc;

    iput-object p9, p0, Lcom/daaw/s60$a;->i:Landroid/graphics/Bitmap;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/s60$a;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/s60$a;->d:Lcom/daaw/cn1;

    iput p5, p0, Lcom/daaw/s60$a;->e:I

    iput p6, p0, Lcom/daaw/s60$a;->f:I

    iput-object p7, p0, Lcom/daaw/s60$a;->g:Lcom/daaw/r60$a;

    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lcom/daaw/s60;

    invoke-direct {v0, p0}, Lcom/daaw/s60;-><init>(Lcom/daaw/s60$a;)V

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/s60$a;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method
