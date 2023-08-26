.class Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$1;
.super Ljava/lang/Object;
.source "CustomPropertiesList.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->GetAllPropertiesSortedByOrder()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 705
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$1;->this$0:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/daaw/avee/Common/Tuple2;Lcom/daaw/avee/Common/Tuple2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 708
    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 705
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList$1;->compare(Lcom/daaw/avee/Common/Tuple2;Lcom/daaw/avee/Common/Tuple2;)I

    move-result p1

    return p1
.end method
