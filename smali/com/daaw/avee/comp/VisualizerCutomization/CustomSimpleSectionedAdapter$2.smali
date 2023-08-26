.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;
.super Ljava/lang/Object;
.source "CustomSimpleSectionedAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

.field final synthetic val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;->val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 165
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;->val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->getAdapterPosition()I

    move-result p1

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$200(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;->val$holder:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iget-object v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    invoke-interface {v0, p1, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;->onItemClick(ILandroid/view/View;)Z

    return-void
.end method
