.class public abstract Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;
.super Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;
.source "SectionTitleIndicator.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final DEFAULT_BACKGROUND_COLOR:I = 0x1060000

.field private static final DEFAULT_TEXT_COLOR:I = 0x106000b

.field private static final DEFAULT_TITLE_INDICATOR_LAYOUT:I

.field private static final STYLEABLE:[I


# instance fields
.field private final mIndicatorBackground:Landroid/view/View;

.field private final mTitleText:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    sget-object v0, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->SectionTitleIndicator:[I

    sput-object v0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->STYLEABLE:[I

    .line 20
    sget v0, Lxyz/danoz/recyclerviewfastscroller/R$layout;->section_indicator_with_title:I

    sput v0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->DEFAULT_TITLE_INDICATOR_LAYOUT:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, p1, v0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, p2, v0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    sget p1, Lxyz/danoz/recyclerviewfastscroller/R$id;->section_title_popup:I

    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->mIndicatorBackground:Landroid/view/View;

    .line 38
    sget p1, Lxyz/danoz/recyclerviewfastscroller/R$id;->section_indicator_text:I

    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->mTitleText:Landroid/widget/TextView;

    .line 40
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object p3, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->STYLEABLE:[I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 42
    :try_start_0
    sget p2, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->SectionTitleIndicator_rfs_backgroundColor:I

    .line 43
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->getDefaultBackgroundColor()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    .line 44
    invoke-virtual {p0, p2}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->applyCustomBackgroundColorAttribute(I)V

    .line 46
    sget p2, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->SectionTitleIndicator_rfs_textColor:I

    .line 47
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->getDefaultBackgroundColor()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    .line 48
    invoke-virtual {p0, p2}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->applyCustomTextColorAttribute(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method


# virtual methods
.method protected applyCustomBackgroundColorAttribute(I)V
    .locals 0

    .line 78
    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->setIndicatorBackgroundColor(I)V

    return-void
.end method

.method protected applyCustomTextColorAttribute(I)V
    .locals 0

    .line 103
    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->setIndicatorTextColor(I)V

    return-void
.end method

.method protected getDefaultBackgroundColor()I
    .locals 1

    const/high16 v0, 0x1060000

    return v0
.end method

.method protected getDefaultLayoutId()I
    .locals 1

    .line 60
    sget v0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->DEFAULT_TITLE_INDICATOR_LAYOUT:I

    return v0
.end method

.method protected getDefaultTextColor()I
    .locals 1

    const v0, 0x106000b

    return v0
.end method

.method public setIndicatorBackgroundColor(I)V
    .locals 2

    .line 87
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->mIndicatorBackground:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 89
    instance-of v1, v0, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v1, :cond_0

    .line 90
    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    .line 91
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_0

    .line 93
    :cond_0
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->mIndicatorBackground:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_0
    return-void
.end method

.method public setIndicatorTextColor(I)V
    .locals 1

    .line 111
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->mTitleText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/title/SectionTitleIndicator;->mTitleText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
