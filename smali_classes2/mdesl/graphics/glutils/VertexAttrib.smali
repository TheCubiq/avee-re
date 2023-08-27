.class public Lmdesl/graphics/glutils/VertexAttrib;
.super Ljava/lang/Object;
.source "VertexAttrib.java"


# instance fields
.field public final location:I

.field public final name:Ljava/lang/String;

.field public final numComponents:I


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Lmdesl/graphics/glutils/VertexAttrib;->location:I

    .line 42
    iput-object p2, p0, Lmdesl/graphics/glutils/VertexAttrib;->name:Ljava/lang/String;

    .line 43
    iput p3, p0, Lmdesl/graphics/glutils/VertexAttrib;->numComponents:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lmdesl/graphics/glutils/VertexAttrib;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lmdesl/graphics/glutils/VertexAttrib;->numComponents:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
