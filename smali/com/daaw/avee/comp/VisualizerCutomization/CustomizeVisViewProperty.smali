.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;
.super Ljava/lang/Object;
.source "CustomizeVisViewProperty.java"


# instance fields
.field private customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field private linearLayoutRootContent:Landroid/view/ViewGroup;

.field private propertyViewRoot:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;)Landroid/view/ViewGroup;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->propertyViewRoot:Landroid/view/ViewGroup;

    return-object p0
.end method


# virtual methods
.method public closePropertyView()V
    .locals 3

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->propertyViewRoot:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$2;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public isPropertyViewVisible()Z
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->propertyViewRoot:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isViewCreated()Z
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->linearLayoutRootContent:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onCreatedView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 0

    const p1, 0x7f090189

    .line 33
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->propertyViewRoot:Landroid/view/ViewGroup;

    const p1, 0x7f09012c

    .line 34
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->linearLayoutRootContent:Landroid/view/ViewGroup;

    const p1, 0x7f090067

    .line 37
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    .line 38
    new-instance p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$1;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public openPropertyView()V
    .locals 3

    .line 84
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->propertyViewRoot:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 86
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->propertyViewRoot:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public parseProperty(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isView1Created()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->linearLayoutRootContent:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 72
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->propertyViewRoot:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 73
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->openPropertyView()V

    .line 75
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyHint(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->linearLayoutRootContent:Landroid/view/ViewGroup;

    const/4 v6, 0x1

    move-object v3, p1

    move-object v5, p2

    move-object v7, p3

    invoke-static/range {v1 .. v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyView(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Landroid/view/ViewGroup;Ljava/lang/String;ZLcom/daaw/avee/Common/Func/Func;)Z

    return-void

    .line 65
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->linearLayoutRootContent:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 66
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->closePropertyView()V

    :cond_3
    :goto_1
    return-void
.end method
