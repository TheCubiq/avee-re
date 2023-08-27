.class public Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;
.super Ljava/lang/Object;
.source "CustomPropertiesList.java"


# instance fields
.field protected jsonObj:Lorg/json/JSONObject;

.field private name:Ljava/lang/String;

.field private parent:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field private putOrderCounter:I


# direct methods
.method public constructor <init>(ILorg/json/JSONObject;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->name:Ljava/lang/String;

    .line 50
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->parent:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 51
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    .line 54
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->resetPutOrderIndex()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->name:Ljava/lang/String;

    .line 59
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->parent:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 60
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    .line 62
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->resetPutOrderIndex()V

    return-void
.end method

.method public static MakeHierarchyPathKeyString(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, ";"

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 201
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private getHierarchyPath(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 179
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->parent:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    if-eqz v0, :cond_0

    .line 180
    invoke-direct {v0, p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getHierarchyPath(Ljava/util/List;)V

    .line 182
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->name:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static getPropertyTypeParts(Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    const-string v0, "\\s+"

    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 36
    array-length v1, v0

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    new-array v0, v2, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    :cond_0
    return-object v0
.end method

.method private putPropertyArray4f(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 485
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    .line 486
    invoke-static {p2}, Lcom/daaw/avee/Common/Array4f;->toString([F)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 487
    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 488
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v1, p4, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 489
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "hint"

    .line 490
    invoke-virtual {v0, p2, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 491
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private putPropertyFloat(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 433
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    float-to-double v2, p2

    .line 434
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 435
    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 436
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v1, p4, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 437
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "hint"

    .line 438
    invoke-virtual {v0, p2, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 439
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 408
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    .line 409
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 410
    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 411
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v1, p4, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 412
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "hint"

    .line 413
    invoke-virtual {v0, p2, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 414
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private putPropertyString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 509
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, ""

    .line 510
    :goto_0
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 511
    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 512
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v1, p4, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 513
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 514
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private putPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 459
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    .line 460
    invoke-virtual {p2}, Lcom/daaw/avee/Common/Vec2f;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 461
    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 462
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v1, p4, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 463
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "hint"

    .line 464
    invoke-virtual {v0, p2, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 465
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private resetPutOrderIndex()V
    .locals 1

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    return-void
.end method


# virtual methods
.method public GetAllProperties()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 759
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public GetAllPropertiesGroupedSortedByOrder()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 716
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 719
    new-instance v1, Ljava/util/TreeMap;

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$2;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 727
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 728
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "0_general"

    .line 729
    invoke-virtual {p0, v2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyGroupTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 730
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_0

    goto :goto_0

    .line 732
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/Common/MultiList;

    if-nez v4, :cond_1

    .line 734
    new-instance v4, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v4}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    .line 735
    invoke-virtual {v1, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    :cond_1
    new-instance v3, Lcom/daaw/avee/Common/Tuple2;

    .line 740
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyOrderIndex(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v3, v2, v5}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 738
    invoke-virtual {v4, v3}, Lcom/daaw/avee/Common/MultiList;->add(Lcom/daaw/avee/Common/Tuple2;)Z

    goto :goto_0

    .line 744
    :cond_2
    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/Common/MultiList;

    .line 745
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$3;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$3;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    invoke-static {v2, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_1

    :cond_3
    return-object v1
.end method

.method public GetAllPropertiesSortedByKey()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 681
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 682
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 683
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 684
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 687
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 688
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public GetAllPropertiesSortedByOrder()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 693
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 695
    new-instance v1, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v1}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    .line 696
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 697
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 698
    new-instance v3, Lcom/daaw/avee/Common/Tuple2;

    .line 700
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyOrderIndex(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 698
    invoke-virtual {v1, v3}, Lcom/daaw/avee/Common/MultiList;->add(Lcom/daaw/avee/Common/Tuple2;)Z

    goto :goto_0

    .line 705
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$1;-><init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 712
    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->iterator1()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public clearAll(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    return-void

    .line 164
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 165
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    .line 167
    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putChildTypeValue(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setVersionId(Ljava/lang/String;)V

    return-void
.end method

.method public getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;
    .locals 2

    .line 291
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 294
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    invoke-direct {v1, p1, v0, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 296
    :catch_0
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {v0, p1, v1, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-object v0
.end method

.method public getCustomizationName()Ljava/lang/String;
    .locals 2

    .line 79
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "_name"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method

.method public getHierarchyPath()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 173
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getHierarchyPath(Ljava/util/List;)V

    return-object v0
.end method

.method public getParent()Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->parent:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    return-object v0
.end method

.method public getPropertyArray4f(Ljava/lang/String;[F)[F
    .locals 2

    const/4 v0, 0x4

    :try_start_0
    new-array v0, v0, [F

    .line 614
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "v"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0, p2}, Lcom/daaw/avee/Common/Array4f;->fromString(Ljava/lang/String;[F[F)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object p2
.end method

.method public getPropertyBool(Ljava/lang/String;Z)Z
    .locals 1

    .line 572
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :catch_0
    return p2
.end method

.method public getPropertyFloat(Ljava/lang/String;F)F
    .locals 1

    .line 588
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    double-to-float p1, p1

    return p1

    :catch_0
    return p2
.end method

.method public getPropertyGroupTag(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 668
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "tag"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p2
.end method

.method public getPropertyHint(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 650
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "hint"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, ""

    return-object p1
.end method

.method public getPropertyInt(Ljava/lang/String;I)I
    .locals 1

    .line 580
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return p2
.end method

.method public getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    .locals 1

    .line 631
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->FromString(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p2
.end method

.method public getPropertyMeasuredVar(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;
    .locals 1

    .line 623
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->FromString(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p2
.end method

.method public getPropertyOrderIndex(Ljava/lang/String;)I
    .locals 1

    .line 659
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "o"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, -0x1

    return p1
.end method

.method public getPropertySelectString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 339
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p2
.end method

.method public getPropertySelectStringIndex(Ljava/lang/String;[Ljava/lang/String;I)I
    .locals 1

    const/4 v0, 0x0

    .line 333
    aget-object v0, p2, v0

    invoke-static {p2, p3, v0}, Lcom/daaw/avee/Common/Utils;->IndexToString([Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 334
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, p3}, Lcom/daaw/avee/Common/Utils;->StringToIndex([Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 596
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p2
.end method

.method public getPropertyType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 640
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "t"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, ""

    return-object p1
.end method

.method public getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;
    .locals 1

    .line 604
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/Vec2f;->FromString(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p2
.end method

.method public getTagName()Ljava/lang/String;
    .locals 2

    const-string v0, "tag"

    const-string v1, ""

    .line 132
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    .line 103
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTypeName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 109
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "v"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method

.method public getVersionId()Ljava/lang/String;
    .locals 3

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v2, "ver"

    .line 96
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object v1
.end method

.method public putChildTypeValue(Ljava/lang/String;)V
    .locals 2

    .line 138
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "v"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "objType"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 263
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    return-object p1
.end method

.method public putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;
    .locals 5

    .line 267
    new-instance p5, Lorg/json/JSONObject;

    invoke-direct {p5}, Lorg/json/JSONObject;-><init>()V

    .line 269
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_child"

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    array-length v1, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p4, v2

    const-string v4, " "

    .line 274
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string p4, "v"

    .line 279
    invoke-virtual {p5, p4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 280
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p5, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 281
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v0, p4, 0x1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {p5, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 282
    invoke-virtual {p5, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 283
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 286
    :catch_0
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    invoke-direct {p2, p1, p5, p0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-object p2
.end method

.method public putPropertyArray4fAsCHSL(Ljava/lang/String;[FLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 804
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCHSL(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fAsCHSL(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v4, "chsl4f"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 821
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4f(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fAsCHSLA(Ljava/lang/String;[FLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 800
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCHSLA(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fAsCHSLA(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v4, "chsla4f"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 817
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4f(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fAsCRGB(Ljava/lang/String;[FLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 796
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCRGB(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fAsCRGB(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v4, "crgb4f"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 813
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4f(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fAsCRGBA(Ljava/lang/String;[FLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 792
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCRGBA(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fAsCRGBA(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v4, "crgba4f"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 809
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4f(Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyArray4fValue(Ljava/lang/String;[F)V
    .locals 2

    .line 472
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 473
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    .line 474
    invoke-static {p2}, Lcom/daaw/avee/Common/Array4f;->toString([F)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 476
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 3

    const-string v0, "b"

    .line 361
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "v"

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 362
    :goto_0
    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 363
    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 364
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 365
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "hint"

    const/4 p3, 0x0

    .line 366
    invoke-virtual {v1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 367
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyBoolValue(Ljava/lang/String;Z)V
    .locals 2

    .line 349
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 350
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 351
    :goto_0
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 353
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V
    .locals 7

    .line 837
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "f "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloat(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;)V
    .locals 7

    .line 841
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "f "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v6, p6

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloat(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyFloatValue(Ljava/lang/String;F)V
    .locals 4

    .line 422
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 423
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    float-to-double v2, p2

    .line 424
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 426
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyIntAsCRGB(Ljava/lang/String;ILjava/lang/String;)V
    .locals 6

    const-string v4, "crgb"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 783
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V
    .locals 6

    const-string v4, "crgba"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 775
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v4, "crgba"

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 779
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyIntAsCRGB_HL(Ljava/lang/String;ILjava/lang/String;)V
    .locals 6

    const-string v4, "crgb_hl"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 787
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyIntAsHidden(Ljava/lang/String;ILjava/lang/String;)V
    .locals 6

    const-string v4, "ih"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 825
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V
    .locals 7

    .line 833
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "i "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyIntAsRangeHidden(Ljava/lang/String;ILjava/lang/String;II)V
    .locals 7

    .line 829
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ih "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyInt(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyIntValue(Ljava/lang/String;I)V
    .locals 2

    .line 397
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 398
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    .line 399
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 401
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V
    .locals 3

    .line 546
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    .line 547
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 548
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mvarf "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 549
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 p5, p4, 0x1

    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 550
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 551
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyMVariableFloatValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V
    .locals 2

    .line 532
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 533
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    .line 534
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 538
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyMVariableVec2f(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V
    .locals 3

    .line 558
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    .line 559
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 560
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mvarf2 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 561
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 p5, p4, 0x1

    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 562
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 563
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyMeasuredVar(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 3

    .line 521
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "v"

    .line 522
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    const-string v1, "mea"

    .line 523
    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 524
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 525
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertySelectStringValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 324
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 325
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const-string p2, ""

    .line 326
    :goto_0
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 327
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyStringAsAsset(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 894
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "asset"

    .line 896
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 898
    array-length v1, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p4, v2

    const-string v4, " "

    .line 899
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 900
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 903
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyStringAsAssetPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 881
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "passet"

    .line 883
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    array-length v1, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p4, v2

    const-string v4, " "

    .line 886
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 887
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 890
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 907
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 867
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "img"

    .line 869
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    array-length v1, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p4, v2

    const-string v4, " "

    .line 872
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 876
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyStringAsImagePr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 853
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pimg"

    .line 855
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 857
    array-length v1, p4

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p4, v2

    const-string v4, " "

    .line 858
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 859
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 862
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyStringAsTxt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "txt"

    .line 911
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "ptxt"

    .line 915
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyStringValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 498
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 499
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const-string p2, ""

    .line 500
    :goto_0
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 502
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V
    .locals 7

    .line 845
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "f2 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FFLjava/lang/String;)V
    .locals 7

    .line 849
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "f2 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p4, " "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p6

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putPropertyVec2fValue(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)V
    .locals 2

    .line 446
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 447
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    const-string v1, "v"

    .line 448
    invoke-virtual {p2}, Lcom/daaw/avee/Common/Vec2f;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 450
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public putSelectString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    .line 302
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 304
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sel"

    .line 306
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    array-length v2, p4

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p4, v3

    const-string v5, " "

    .line 309
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const-string p4, "v"

    .line 313
    invoke-virtual {v0, p4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "t"

    .line 314
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "o"

    .line 315
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    add-int/lit8 v1, p4, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putOrderCounter:I

    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p2, "tag"

    .line 316
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 317
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public removeProperty(Ljava/lang/String;)V
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public setCustomizationName(Ljava/lang/String;)V
    .locals 2

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "_name"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public setTagName(Ljava/lang/String;)V
    .locals 2

    const-string v0, "tag"

    const-string v1, "0_general"

    .line 122
    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setVersionId(Ljava/lang/String;)V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "ver"

    .line 88
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public updatePropertyBool(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 375
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "t"

    .line 379
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "hint"

    .line 381
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 382
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->jsonObj:Lorg/json/JSONObject;

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
