.class public Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;
.super Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;
.source "SearchEntry.java"

# interfaces
.implements Lcom/daaw/avee/comp/Common/ISearchEntry;


# instance fields
.field private final index:I

.field query:Ljava/lang/String;


# direct methods
.method constructor <init>(I)V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;-><init>()V

    const-string v0, ""

    .line 12
    iput-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->query:Ljava/lang/String;

    .line 15
    iput p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->index:I

    return-void
.end method


# virtual methods
.method public getContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-object v0
.end method

.method public getHint()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->index:I

    return v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->query:Ljava/lang/String;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntry;->enabled:Z

    return v0
.end method
