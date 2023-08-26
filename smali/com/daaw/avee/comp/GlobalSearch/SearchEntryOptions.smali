.class public Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;
.super Ljava/lang/Object;
.source "SearchEntryOptions.java"


# static fields
.field public static refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;


# instance fields
.field public containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

.field public enabled:Z

.field public hint:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    invoke-direct {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->enabled:Z

    const-string v0, ""

    .line 14
    iput-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->hint:Ljava/lang/String;

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-void
.end method
