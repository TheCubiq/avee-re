.class public Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;
.super Ljava/lang/Object;
.source "DependencyResourceCounter.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;


# instance fields
.field dependencyResourceNamesList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;->dependencyResourceNamesList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public GetDependencyResourceNamesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;->dependencyResourceNamesList:Ljava/util/List;

    return-object v0
.end method

.method public PutDependencyResourceName(Ljava/lang/String;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;->dependencyResourceNamesList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
