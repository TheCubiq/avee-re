.class Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element$ElementIdProvider;
.super Ljava/lang/Object;
.source "Element.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ElementIdProvider"
.end annotation


# static fields
.field static counter:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getNewId()I
    .locals 2

    .line 47
    sget v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element$ElementIdProvider;->counter:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element$ElementIdProvider;->counter:I

    return v0
.end method
