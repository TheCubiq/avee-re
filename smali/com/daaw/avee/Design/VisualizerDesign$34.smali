.class Lcom/daaw/avee/Design/VisualizerDesign$34;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 886
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$34;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Landroid/app/Activity;)V
    .locals 1

    .line 889
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    .line 893
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$34;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1502(Lcom/daaw/avee/Design/VisualizerDesign;Z)Z

    .line 895
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualPreferShowVideoContent:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result p1

    .line 896
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment2Instance()Lcom/daaw/avee/comp/VisualUI/Fragment2;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 897
    invoke-virtual {v0, p2, p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateSurfaceVisibility(ZZ)V

    goto :goto_0

    .line 900
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$34;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1502(Lcom/daaw/avee/Design/VisualizerDesign;Z)Z

    .line 902
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualPreferShowVideoContent:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result p1

    .line 903
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment2Instance()Lcom/daaw/avee/comp/VisualUI/Fragment2;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 904
    invoke-virtual {v0, p2, p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateSurfaceVisibility(ZZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 886
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign$34;->invoke(Ljava/lang/Integer;Landroid/app/Activity;)V

    return-void
.end method
