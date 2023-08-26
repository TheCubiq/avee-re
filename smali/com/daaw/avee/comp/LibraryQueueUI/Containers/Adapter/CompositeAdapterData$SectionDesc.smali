.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;
.super Ljava/lang/Object;
.source "CompositeAdapterData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SectionDesc"
.end annotation


# instance fields
.field private final viewType:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;->viewType:I

    return-void
.end method


# virtual methods
.method public getViewType()I
    .locals 1

    .line 184
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;->viewType:I

    return v0
.end method
