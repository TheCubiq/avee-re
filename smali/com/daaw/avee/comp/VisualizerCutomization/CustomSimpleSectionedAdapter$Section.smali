.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;
.super Ljava/lang/Object;
.source "CustomSimpleSectionedAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Section"
.end annotation


# instance fields
.field firstPosition:I

.field sectionedPosition:I

.field title:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;)V
    .locals 0

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    .line 211
    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->title:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->title:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public setFirstPosition(I)V
    .locals 0

    .line 220
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    return-void
.end method
