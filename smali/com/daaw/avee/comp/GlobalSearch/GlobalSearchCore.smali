.class public Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;
.super Ljava/lang/Object;
.source "GlobalSearchCore.java"


# static fields
.field public static ICompositeSearch_onCurrentSearchEntryChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/ISearchEntry;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final createInstanceLock:Ljava/lang/Object;

.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private currentIndex:I

.field private entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->ICompositeSearch_onCurrentSearchEntryChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->createInstanceLock:Ljava/lang/Object;

    .line 18
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 19
    iput v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    .line 20
    iput-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    const/4 v0, 0x0

    .line 23
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 24
    new-instance v2, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    invoke-direct {v2, v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;-><init>(I)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 26
    :cond_0
    iget v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->notifyEntry(IZ)V

    return-void
.end method

.method public static createInstance()Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;
    .locals 3

    .line 30
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    if-eqz v0, :cond_0

    return-object v0

    .line 33
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->createInstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 34
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    if-nez v1, :cond_1

    .line 36
    new-instance v1, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    invoke-direct {v1}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;-><init>()V

    .line 37
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 40
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static getInstance()Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;
    .locals 1

    .line 45
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    return-object v0
.end method


# virtual methods
.method public getCurrentSearchEntry()Lcom/daaw/avee/comp/Common/ISearchEntry;
    .locals 1

    .line 55
    iget v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->getSearchEntry(I)Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    move-result-object v0

    return-object v0
.end method

.method public getSearchEntry(I)Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;
    .locals 2

    if-ltz p1, :cond_1

    .line 49
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    aget-object p1, v0, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method notifyEntry(IZ)V
    .locals 3

    if-ltz p1, :cond_0

    .line 98
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    array-length v0, v0

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 p1, -0x1

    :cond_1
    if-ltz p1, :cond_2

    .line 101
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    aget-object v0, v0, p1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 102
    :goto_0
    sget-object v1, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->ICompositeSearch_onCurrentSearchEntryChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    iget v2, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v1, v2, p1, v0, p2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onSearchQueryTextChange(ILjava/lang/String;)V
    .locals 2

    if-ltz p1, :cond_2

    .line 80
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_1

    .line 82
    :cond_0
    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->query:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 83
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    aget-object v0, v0, p1

    if-nez p2, :cond_1

    const-string p2, ""

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p2, v1

    :goto_0
    iput-object p2, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->query:Ljava/lang/String;

    const/4 p2, 0x1

    .line 84
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->notifyEntry(IZ)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onSearchQueryTextChange(Ljava/lang/String;)V
    .locals 1

    .line 76
    iget v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->onSearchQueryTextChange(ILjava/lang/String;)V

    return-void
.end method

.method public onSetCurrentSearchIndex(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 89
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    .line 90
    iput p1, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    .line 94
    :goto_1
    iget p1, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->currentIndex:I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->notifyEntry(IZ)V

    return-void
.end method

.method public onUpdateSearchOptions(IZLjava/lang/String;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 2

    if-ltz p1, :cond_3

    .line 59
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    aget-object v0, v0, p1

    .line 64
    iget-object v1, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-interface {v0, p4}, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    aget-object v0, v0, p1

    const-string v1, ""

    iput-object v1, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->query:Ljava/lang/String;

    .line 68
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    aget-object v0, v0, p1

    iput-boolean p2, v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->enabled:Z

    .line 69
    iget-object p2, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    aget-object p2, p2, p1

    iput-object p3, p2, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->hint:Ljava/lang/String;

    .line 70
    iget-object p2, p0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->entrys:[Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;

    aget-object p2, p2, p1

    iput-object p4, p2, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    const/4 p2, 0x1

    .line 72
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->notifyEntry(IZ)V

    :cond_3
    :goto_0
    return-void
.end method
