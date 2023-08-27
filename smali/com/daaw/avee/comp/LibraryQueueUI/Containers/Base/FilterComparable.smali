.class public interface abstract Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;
.super Ljava/lang/Object;
.source "FilterComparable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract compare(Ljava/lang/String;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT1;)Z"
        }
    .end annotation
.end method

.method public abstract preProcessItem(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT1;)V"
        }
    .end annotation
.end method

.method public abstract preProcessQuery(Ljava/lang/String;)Ljava/lang/String;
.end method
