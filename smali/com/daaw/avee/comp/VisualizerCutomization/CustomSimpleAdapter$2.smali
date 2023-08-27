.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;
.super Ljava/lang/Object;
.source "CustomSimpleAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onBindViewHolder(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

.field final synthetic val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;->val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 138
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;->val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->getAdapterPosition()I

    move-result p1

    .line 139
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;->val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iget-object v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    invoke-interface {v0, p1, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;->onItemClick(ILandroid/view/View;)Z

    return-void
.end method
