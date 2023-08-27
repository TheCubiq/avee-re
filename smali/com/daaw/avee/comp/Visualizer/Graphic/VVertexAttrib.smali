.class public Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;
.super Lmdesl/graphics/glutils/VertexAttrib;
.source "VVertexAttrib.java"


# instance fields
.field public final dataType:I

.field public final sizeInBytes:I


# direct methods
.method public constructor <init>(ILjava/lang/String;III)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lmdesl/graphics/glutils/VertexAttrib;-><init>(ILjava/lang/String;I)V

    .line 22
    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->dataType:I

    .line 23
    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->sizeInBytes:I

    return-void
.end method
