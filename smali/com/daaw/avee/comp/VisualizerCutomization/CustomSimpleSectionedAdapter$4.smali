.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$4;
.super Ljava/lang/Object;
.source "CustomSimpleSectionedAdapter.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->setSections([Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;)I
    .locals 2

    .line 231
    iget v0, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    iget v1, p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    iget p2, p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    if-ge p1, p2, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 228
    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;

    check-cast p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$4;->compare(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;)I

    move-result p1

    return p1
.end method
