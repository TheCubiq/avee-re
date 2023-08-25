.class public Lcom/daaw/ve1$a;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ve1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/graphics/drawable/Drawable$ConstantState;

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable$ConstantState;I)V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    iput-object p1, p0, Lcom/daaw/ve1$a;->a:Landroid/graphics/drawable/Drawable$ConstantState;

    iput p2, p0, Lcom/daaw/ve1$a;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ve1$a;)V
    .locals 1

    iget-object v0, p1, Lcom/daaw/ve1$a;->a:Landroid/graphics/drawable/Drawable$ConstantState;

    iget p1, p1, Lcom/daaw/ve1$a;->b:I

    invoke-direct {p0, v0, p1}, Lcom/daaw/ve1$a;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;I)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ve1$a;)Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ve1$a;->a:Landroid/graphics/drawable/Drawable$ConstantState;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/ve1$a;)I
    .locals 0

    iget p0, p0, Lcom/daaw/ve1$a;->b:I

    return p0
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/ve1$a;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lcom/daaw/ve1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/daaw/ve1;-><init>(Lcom/daaw/ve1$a;Lcom/daaw/l70;Landroid/content/res/Resources;)V

    return-object v0
.end method
