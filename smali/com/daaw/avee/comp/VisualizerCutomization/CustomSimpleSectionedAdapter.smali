.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "CustomSimpleSectionedAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field private static final SECTION_TYPE:I


# instance fields
.field private final isCollapsed:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

.field private final mContext:Landroid/content/Context;

.field private mSectionResourceId:I

.field private mSections:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;",
            ">;"
        }
    .end annotation
.end field

.field private mValid:Z

.field private onItemClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

.field private selectedItemPosition:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IILcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "II",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    const/4 p3, 0x1

    .line 26
    iput-boolean p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mValid:Z

    .line 33
    new-instance p3, Landroid/util/SparseArray;

    invoke-direct {p3}, Landroid/util/SparseArray;-><init>()V

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    const/4 p3, -0x1

    .line 35
    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->selectedItemPosition:I

    .line 49
    iput p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSectionResourceId:I

    .line 51
    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    .line 52
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mContext:Landroid/content/Context;

    .line 53
    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->isCollapsed:Lcom/daaw/avee/Common/Func/Func;

    .line 55
    new-instance p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)V

    invoke-virtual {p4, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    return-void
.end method

.method private _setSelectedItem(ILandroid/view/View;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    .line 120
    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    .line 122
    :cond_0
    iget p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->selectedItemPosition:I

    if-ltz p2, :cond_1

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyItemChanged(I)V

    .line 125
    :cond_1
    :goto_0
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->selectedItemPosition:I

    if-ltz p1, :cond_2

    .line 126
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyItemChanged(I)V

    :cond_2
    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Z)Z
    .locals 0

    .line 21
    iput-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mValid:Z

    return p1
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->onItemClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

    return-object p0
.end method


# virtual methods
.method public baseAdapterSetDataAt(ILcom/daaw/avee/Common/Tuple2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->sectionedPositionToPosition(I)I

    move-result v1

    invoke-virtual {v0, v1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setDataAt(ILcom/daaw/avee/Common/Tuple2;)V

    .line 86
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyItemChanged(I)V

    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 310
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemCount()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 302
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->isSectionHeaderPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7fffffff

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    .line 303
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result p1

    sub-int/2addr v0, p1

    int-to-long v0, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    .line 304
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->sectionedPositionToPosition(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemId(I)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 198
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->isSectionHeaderPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    .line 200
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->sectionedPositionToPosition(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemViewType(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    :goto_0
    return p1
.end method

.method public isSectionHeaderPosition(I)Z
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    .line 153
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->isSectionHeaderPosition(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    .line 156
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->initItem()V

    .line 157
    iget-object v0, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->title:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;

    iget-object p2, p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->title:Ljava/lang/CharSequence;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p2, ""

    .line 158
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->setTextSubtitle(Ljava/lang/CharSequence;)V

    .line 159
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->collapsible:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->isCollapsed:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 160
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$2;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$3;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$3;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemPosition:I

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->selectedItemPosition:I

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setSelected(Z)V

    goto :goto_1

    .line 186
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->sectionedPositionToPosition(I)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onBindViewHolder(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;I)V

    :goto_1
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2

    if-nez p2, :cond_0

    .line 144
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mContext:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSectionResourceId:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 145
    new-instance p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    invoke-direct {p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public positionToSectionedPosition(I)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 271
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 272
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    if-le v2, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/2addr p1, v1

    return p1
.end method

.method public sectionedPositionToPosition(I)I
    .locals 3

    .line 281
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->isSectionHeaderPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 286
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 287
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->sectionedPosition:I

    if-le v2, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/2addr p1, v1

    return p1
.end method

.method public setOnItemClickListener(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->onItemClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

    return-void
.end method

.method public setSections(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;",
            ">;)V"
        }
    .end annotation

    .line 248
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 260
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;

    .line 261
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    add-int/2addr v2, v0

    iput v2, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->sectionedPosition:I

    .line 262
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    iget v3, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->sectionedPosition:I

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 266
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setSections([Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;)V
    .locals 6

    .line 226
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 228
    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$4;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)V

    invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 238
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v3, p1, v1

    .line 239
    iget v4, v3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->firstPosition:I

    add-int/2addr v4, v2

    iput v4, v3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->sectionedPosition:I

    .line 240
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mSections:Landroid/util/SparseArray;

    iget v5, v3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;->sectionedPosition:I

    invoke-virtual {v4, v5, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 244
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setSelectedItem(I)V
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->setSelectedItem(ILandroid/view/View;)V

    return-void
.end method

.method public setSelectedItem(ILandroid/view/View;)V
    .locals 3

    .line 101
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->isSectionHeaderPosition(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    invoke-virtual {v0, v2, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setSelectedItem(ILandroid/view/View;)V

    .line 103
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->_setSelectedItem(ILandroid/view/View;)V

    goto :goto_0

    .line 105
    :cond_0
    invoke-direct {p0, v2, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->_setSelectedItem(ILandroid/view/View;)V

    .line 106
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->mBaseAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setSelectedItem(ILandroid/view/View;)V

    :goto_0
    return-void
.end method
