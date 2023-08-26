.class interface abstract Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;
.super Ljava/lang/Object;
.source "SearchMultiListTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "IResultReceiverInternal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract isCancelled()Z
.end method

.method public abstract onItemDirFound(Lcom/daaw/avee/Common/Tuple2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TT1;TT2;>;)V"
        }
    .end annotation
.end method

.method public abstract onItemFileFound(Lcom/daaw/avee/Common/Tuple2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TT1;TT2;>;)V"
        }
    .end annotation
.end method
