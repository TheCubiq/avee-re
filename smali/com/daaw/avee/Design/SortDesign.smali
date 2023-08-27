.class public Lcom/daaw/avee/Design/SortDesign;
.super Ljava/lang/Object;
.source "SortDesign.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Design/SortDesign$SortOptions;,
        Lcom/daaw/avee/Design/SortDesign$SortDesc;
    }
.end annotation


# static fields
.field public static final SortDialogArg_Files:Ljava/lang/String; = "files"

.field public static final SortDialogArg_Regular:Ljava/lang/String; = "regular"

.field public static final SortDialogArg_Stations:Ljava/lang/String; = "stations"

.field public static final Sort_Descending:I = 0x1

.field public static final Sort_Mode_Album:I = 0x2

.field public static final Sort_Mode_Artist:I = 0x1

.field public static final Sort_Mode_Bitrate:I = 0x9

.field public static final Sort_Mode_Bitrate_:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final Sort_Mode_DateAdded:I = 0x4

.field public static final Sort_Mode_DateModified:I = 0x5

.field public static final Sort_Mode_Default:I = 0x8

.field public static final Sort_Mode_Default_:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final Sort_Mode_Duration:I = 0x6

.field public static final Sort_Mode_Path:I = 0x3

.field public static final Sort_Mode_Path_:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final Sort_Mode_Size:I = 0x7

.field public static final Sort_Mode_Title:I = 0x0

.field public static final Sort_Mode_Title_:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final Sort_Mode_Unsorted:I = 0xa

.field public static final Sort_Mode_Unsorted_:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private checkOptions:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private radioOptions:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Default"

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/Design/SortDesign;->Sort_Mode_Default_:Lcom/daaw/avee/Common/Tuple2;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Title/Name"

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/Design/SortDesign;->Sort_Mode_Title_:Lcom/daaw/avee/Common/Tuple2;

    .line 49
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Path/Url"

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/Design/SortDesign;->Sort_Mode_Path_:Lcom/daaw/avee/Common/Tuple2;

    .line 50
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Bitrate"

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/Design/SortDesign;->Sort_Mode_Bitrate_:Lcom/daaw/avee/Common/Tuple2;

    .line 51
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Unsorted"

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/Design/SortDesign;->Sort_Mode_Unsorted_:Lcom/daaw/avee/Common/Tuple2;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    .line 58
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->checkOptions:Lcom/daaw/avee/Common/MultiList;

    .line 59
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    .line 63
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Default"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Title/Name"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Artist"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Album"

    invoke-virtual {v0, v2, v3}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "File Path"

    invoke-virtual {v0, v2, v3}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Date Added"

    invoke-virtual {v0, v2, v3}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Date Modified"

    invoke-virtual {v0, v2, v3}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Duration"

    invoke-virtual {v0, v2, v3}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Size"

    invoke-virtual {v0, v2, v3}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    iget-object v0, p0, Lcom/daaw/avee/Design/SortDesign;->checkOptions:Lcom/daaw/avee/Common/MultiList;

    const-string v2, "Descending"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/MultiList;->add(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionChooseSort:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/SortDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SortDesign$1;-><init>(Lcom/daaw/avee/Design/SortDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 82
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionChooseSortFiles:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/SortDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SortDesign$2;-><init>(Lcom/daaw/avee/Design/SortDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 89
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionChooseSortStations:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/SortDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SortDesign$3;-><init>(Lcom/daaw/avee/Design/SortDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 97
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;->onRequestSortOptions:Lcom/daaw/avee/Common/Events/WeakEventR3;

    new-instance v1, Lcom/daaw/avee/Design/SortDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SortDesign$4;-><init>(Lcom/daaw/avee/Design/SortDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;Ljava/util/List;)V

    .line 119
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;->onSubmitSortOptions:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/SortDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SortDesign$5;-><init>(Lcom/daaw/avee/Design/SortDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 128
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestCurrentSortDesc:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/SortDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SortDesign$6;-><init>(Lcom/daaw/avee/Design/SortDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 140
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestFilterFileResult:Lcom/daaw/avee/Common/Events/WeakEventR3;

    new-instance v1, Lcom/daaw/avee/Design/SortDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/SortDesign$7;-><init>(Lcom/daaw/avee/Design/SortDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/SortDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/SortDesign;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/daaw/avee/Design/SortDesign;->updateLibraryItems()V

    return-void
.end method

.method public static contains([II)Z
    .locals 4

    .line 270
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p0, v2

    if-ne v3, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static contains([Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)Z"
        }
    .end annotation

    .line 262
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    if-eq v3, p1, :cond_1

    if-eqz p1, :cond_0

    .line 263
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private updateLibraryItems()V
    .locals 1

    .line 292
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 293
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateLibraryItems()V

    :cond_0
    return-void
.end method


# virtual methods
.method public getSortOptions()Lcom/daaw/avee/Design/SortDesign$SortOptions;
    .locals 4

    .line 278
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortSelectedRadioOption:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    .line 279
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortMaskCheckOptions:I

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v1

    .line 281
    new-instance v2, Lcom/daaw/avee/Design/SortDesign$SortOptions;

    invoke-direct {v2}, Lcom/daaw/avee/Design/SortDesign$SortOptions;-><init>()V

    .line 283
    iget-object v3, p0, Lcom/daaw/avee/Design/SortDesign;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    iput-object v3, v2, Lcom/daaw/avee/Design/SortDesign$SortOptions;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    .line 285
    iget-object v3, p0, Lcom/daaw/avee/Design/SortDesign;->checkOptions:Lcom/daaw/avee/Common/MultiList;

    iput-object v3, v2, Lcom/daaw/avee/Design/SortDesign$SortOptions;->checkOptions:Lcom/daaw/avee/Common/MultiList;

    .line 286
    iput v0, v2, Lcom/daaw/avee/Design/SortDesign$SortOptions;->selectedRadioOption:I

    .line 287
    iput v1, v2, Lcom/daaw/avee/Design/SortDesign$SortOptions;->maskCheckOptions:I

    return-object v2
.end method
