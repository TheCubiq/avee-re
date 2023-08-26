.class public Lcom/daaw/avee/Design/SortDesign$SortOptions;
.super Ljava/lang/Object;
.source "SortDesign.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Design/SortDesign;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SortOptions"
.end annotation


# instance fields
.field public checkOptions:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public maskCheckOptions:I

.field public radioOptions:Lcom/daaw/avee/Common/MultiList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public selectedRadioOption:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 301
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs getRefined([I)Lcom/daaw/avee/Design/SortDesign$SortOptions;
    .locals 4

    .line 309
    new-instance v0, Lcom/daaw/avee/Design/SortDesign$SortOptions;

    invoke-direct {v0}, Lcom/daaw/avee/Design/SortDesign$SortOptions;-><init>()V

    .line 311
    new-instance v1, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v1}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    iput-object v1, v0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    .line 313
    iget-object v1, p0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/MultiList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/Common/Tuple2;

    .line 314
    iget-object v3, v2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {p1, v3}, Lcom/daaw/avee/Design/SortDesign;->contains([II)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 315
    iget-object v3, v0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v3, v2}, Lcom/daaw/avee/Common/MultiList;->add(Lcom/daaw/avee/Common/Tuple2;)Z

    goto :goto_0

    .line 318
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->checkOptions:Lcom/daaw/avee/Common/MultiList;

    iput-object p1, v0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->checkOptions:Lcom/daaw/avee/Common/MultiList;

    .line 319
    iget p1, p0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->selectedRadioOption:I

    iput p1, v0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->selectedRadioOption:I

    .line 320
    iget p1, p0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->maskCheckOptions:I

    iput p1, v0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->maskCheckOptions:I

    return-object v0
.end method

.method public varargs setRadioOptions([Lcom/daaw/avee/Common/Tuple2;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 326
    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    .line 328
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 329
    iget-object v3, p0, Lcom/daaw/avee/Design/SortDesign$SortOptions;->radioOptions:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {v3, v2}, Lcom/daaw/avee/Common/MultiList;->add(Lcom/daaw/avee/Common/Tuple2;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
