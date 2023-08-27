.class public Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
.super Ljava/lang/Object;
.source "VShaderBinder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;
    }
.end annotation


# instance fields
.field private final BYTES_PER_FLOAT:I

.field private attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

.field private bindable:Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;

.field private onBind1:Lcom/daaw/avee/Common/Action2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            ">;"
        }
    .end annotation
.end field

.field private onBind1ActionConstantValues:Z

.field private onBind2:Lcom/daaw/avee/Common/Action2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            ">;"
        }
    .end annotation
.end field

.field private onBind2ActionConstantValues:Z

.field private shader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private totalNumComponentsInBytes:I


# direct methods
.method public varargs constructor <init>(Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;[Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;)V
    .locals 10

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 59
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->BYTES_PER_FLOAT:I

    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind1:Lcom/daaw/avee/Common/Action2;

    .line 61
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind2:Lcom/daaw/avee/Common/Action2;

    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind1ActionConstantValues:Z

    .line 63
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind2ActionConstantValues:Z

    .line 67
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->bindable:Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;

    .line 68
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->shader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 69
    array-length p1, p3

    new-array p1, p1, [Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    const/4 p1, 0x0

    .line 72
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->totalNumComponentsInBytes:I

    const/4 v0, 0x0

    .line 73
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 74
    aget-object v2, p3, v0

    .line 75
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    iget-object v3, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;->name:Ljava/lang/String;

    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->getAttributeLocation(Ljava/lang/String;)I

    move-result v4

    iget-object v5, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;->name:Ljava/lang/String;

    iget v6, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;->numComponents:I

    iget v7, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;->dataType:I

    iget v8, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;->sizeInBytes:I

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;-><init>(ILjava/lang/String;III)V

    aput-object v9, v1, v0

    .line 77
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->totalNumComponentsInBytes:I

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;->sizeInBytes:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->totalNumComponentsInBytes:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 80
    :cond_0
    :goto_1
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    array-length p3, p2

    if-ge p1, p3, :cond_2

    .line 81
    aget-object p2, p2, p1

    iget p2, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->location:I

    if-gez p2, :cond_1

    .line 82
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "ERROR attribute not found "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    aget-object p3, p3, p1

    iget-object p3, p3, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->name:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public bind(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    const/4 v0, 0x0

    .line 138
    invoke-virtual {p0, p1, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->bind(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/Common/Action3;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method public bind(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/Common/Action3;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ")V"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->shader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V

    .line 145
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind1:Lcom/daaw/avee/Common/Action2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->shader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-interface {v0, p1, v1}, Lcom/daaw/avee/Common/Action2;->onInvoke(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind2:Lcom/daaw/avee/Common/Action2;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->shader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-interface {v0, p1, v1}, Lcom/daaw/avee/Common/Action2;->onInvoke(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    if-eqz p2, :cond_2

    .line 147
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->shader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-interface {p2, p1, v0, p3}, Lcom/daaw/avee/Common/Action3;->onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->bindable:Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;->bind()V

    .line 155
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->totalNumComponentsInBytes:I

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 v6, 0x0

    .line 157
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    array-length v1, v0

    if-ge p3, v1, :cond_5

    .line 158
    aget-object v7, v0, p3

    .line 160
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->location:I

    if-gez v0, :cond_3

    goto :goto_2

    .line 161
    :cond_3
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->location:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 164
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->location:I

    iget v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->numComponents:I

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->dataType:I

    iget v3, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->dataType:I

    const/16 v4, 0x1406

    if-eq v3, v4, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    :goto_1
    move v4, p1

    move v5, v6

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    .line 165
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;->sizeInBytes:I

    add-int/2addr v6, v0

    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public draw(III)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->bindable:Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;->draw(III)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 90
    instance-of v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 91
    :cond_0
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public getShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->shader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public setOnBindAction1(ZLcom/daaw/avee/Common/Action2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/daaw/avee/Common/Action2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            ">;)V"
        }
    .end annotation

    .line 106
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind1ActionConstantValues:Z

    .line 107
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind1:Lcom/daaw/avee/Common/Action2;

    return-void
.end method

.method public setOnBindAction2(ZLcom/daaw/avee/Common/Action2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/daaw/avee/Common/Action2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            ">;)V"
        }
    .end annotation

    .line 112
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind2ActionConstantValues:Z

    .line 113
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->onBind2:Lcom/daaw/avee/Common/Action2;

    return-void
.end method

.method public unbind(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 2

    .line 176
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->unbindShader()V

    .line 178
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->bindable:Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;->unbind()V

    const/4 p1, 0x0

    .line 180
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VVertexAttrib;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 181
    aget-object v0, v0, p1

    .line 182
    iget v0, v0, Lmdesl/graphics/glutils/VertexAttrib;->location:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
