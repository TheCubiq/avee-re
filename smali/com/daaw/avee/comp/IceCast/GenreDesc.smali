.class public Lcom/daaw/avee/comp/IceCast/GenreDesc;
.super Ljava/lang/Object;
.source "GenreDesc.java"


# instance fields
.field private children:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;"
        }
    .end annotation
.end field

.field public final id:Ljava/lang/String;

.field public final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/GenreDesc;->children:Ljava/util/List;

    .line 17
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/GenreDesc;->name:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/GenreDesc;->id:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getChildren()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/GenreDesc;->children:Ljava/util/List;

    return-object v0
.end method
