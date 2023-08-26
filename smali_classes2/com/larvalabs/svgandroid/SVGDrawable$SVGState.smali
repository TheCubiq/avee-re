.class final Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SVGDrawable.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/larvalabs/svgandroid/SVGDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "SVGState"
.end annotation


# instance fields
.field mChangingConfigurations:I

.field private mSvg:Lcom/larvalabs/svgandroid/SVG;


# direct methods
.method private constructor <init>(Lcom/larvalabs/svgandroid/SVG;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 100
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;->mSvg:Lcom/larvalabs/svgandroid/SVG;

    return-void
.end method

.method synthetic constructor <init>(Lcom/larvalabs/svgandroid/SVG;Lcom/larvalabs/svgandroid/SVGDrawable$1;)V
    .locals 0

    .line 95
    invoke-direct {p0, p1}, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;-><init>(Lcom/larvalabs/svgandroid/SVG;)V

    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    .line 118
    iget v0, p0, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;->mChangingConfigurations:I

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 109
    new-instance v0, Lcom/larvalabs/svgandroid/SVGDrawable;

    iget-object v1, p0, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;->mSvg:Lcom/larvalabs/svgandroid/SVG;

    invoke-direct {v0, v1}, Lcom/larvalabs/svgandroid/SVGDrawable;-><init>(Lcom/larvalabs/svgandroid/SVG;)V

    return-object v0
.end method
