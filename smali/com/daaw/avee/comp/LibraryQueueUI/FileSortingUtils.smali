.class public Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;
.super Ljava/lang/Object;
.source "FileSortingUtils.java"


# static fields
.field static comparatorDateModified:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation
.end field

.field static comparatorName:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation
.end field

.field static comparatorPath:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation
.end field

.field static comparatorSize:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$1;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorName:Ljava/util/Comparator;

    .line 21
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$2;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorPath:Ljava/util/Comparator;

    .line 27
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$3;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorDateModified:Ljava/util/Comparator;

    .line 33
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$4;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorSize:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static Long_compare(JJ)I
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    cmp-long v0, p0, p2

    if-nez v0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static getSortComparator(Lcom/daaw/avee/Design/SortDesign$SortDesc;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Design/SortDesign$SortDesc;",
            ")",
            "Ljava/util/Comparator<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation

    .line 45
    iget v0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    invoke-static {p0, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->getSortComparator_(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static getSortComparator(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Design/SortDesign$SortDesc;",
            "I)",
            "Ljava/util/Comparator<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation

    .line 49
    iget v0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    iget p1, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    :cond_0
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->getSortComparator_(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static getSortComparator_(Lcom/daaw/avee/Design/SortDesign$SortDesc;I)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Design/SortDesign$SortDesc;",
            "I)",
            "Ljava/util/Comparator<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    .line 60
    :cond_0
    iget-boolean v0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortDescending:Z

    .line 62
    iget p0, p0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    .line 64
    :pswitch_1
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorName:Ljava/util/Comparator;

    goto :goto_1

    .line 94
    :pswitch_2
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorSize:Ljava/util/Comparator;

    goto :goto_0

    .line 90
    :pswitch_3
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorSize:Ljava/util/Comparator;

    goto :goto_0

    .line 86
    :pswitch_4
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorDateModified:Ljava/util/Comparator;

    goto :goto_0

    .line 82
    :pswitch_5
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorDateModified:Ljava/util/Comparator;

    :goto_0
    xor-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 79
    :pswitch_6
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorPath:Ljava/util/Comparator;

    goto :goto_1

    .line 73
    :pswitch_7
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorName:Ljava/util/Comparator;

    goto :goto_1

    .line 76
    :pswitch_8
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorName:Ljava/util/Comparator;

    goto :goto_1

    .line 70
    :pswitch_9
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;->comparatorName:Ljava/util/Comparator;

    :goto_1
    :pswitch_a
    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    .line 101
    invoke-static {p1}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_a
    .end packed-switch
.end method
